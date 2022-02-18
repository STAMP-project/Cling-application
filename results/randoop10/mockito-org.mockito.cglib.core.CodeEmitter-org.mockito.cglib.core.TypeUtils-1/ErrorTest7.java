import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3501");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str15 = signature14.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean33 = signature14.equals((java.lang.Object) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter46.getClassInfo();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter66.getClassInfo();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        org.mockito.cglib.core.ClassInfo classInfo73 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor76 = classEmitter0.visitAnnotation("L782305012", false);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3502");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter16.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.Signature signature59 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str60 = signature59.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        boolean boolean78 = signature59.equals((java.lang.Object) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassInfo classInfo83 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter84.visitSource("L1918149383", "L1771489649");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3503");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.Signature signature51 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str52 = signature51.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        boolean boolean70 = signature51.equals((java.lang.Object) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassInfo classInfo77 = classEmitter74.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo78 = classEmitter74.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.fromInternalName("L217518997");
        java.lang.String str84 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type83);
        org.mockito.asm.Type type86 = org.mockito.cglib.core.TypeUtils.getType("L844550290");
        java.lang.String str87 = type86.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter74.declare_field((int) (byte) -1, "(Ljava/lang/L1793154212;Ljava/lang/Lhi!;)Lvoid;", type83, (java.lang.Object) str87);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3504");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.Signature signature51 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str52 = signature51.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        boolean boolean70 = signature51.equals((java.lang.Object) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter79 = classEmitter8.getStaticHook();
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3505");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter34 = classEmitter32.getStaticHook();
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3506");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str21 = signature20.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        boolean boolean39 = signature20.equals((java.lang.Object) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter41.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo55 = classEmitter54.getClassInfo();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassInfo classInfo61 = classEmitter58.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo62 = classEmitter58.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter63.visitInnerClass("L1478307687", "L371813410", "L878619370", (int) (byte) -1);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3507");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str23 = signature22.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        boolean boolean41 = signature22.equals((java.lang.Object) classEmitter39);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter43.getClassInfo();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter10.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo52 = classEmitter10.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitEnd();
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3508");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter16.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter47.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassInfo classInfo80 = classEmitter79.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter79);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo83 = classEmitter82.getClassInfo();
        classEmitter79.setTarget((org.mockito.asm.ClassVisitor) classEmitter82);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter79);
        org.mockito.cglib.core.ClassEmitter classEmitter86 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter85);
        org.mockito.cglib.core.ClassEmitter classEmitter87 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter86);
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter86);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter88.visitOuterClass("L1628292157", "L1235955982", "L1157959182");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3509");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str23 = signature22.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        boolean boolean41 = signature22.equals((java.lang.Object) classEmitter39);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter43.getClassInfo();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter10.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type53 = classEmitter52.getSuperType();
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3510");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.visitSource("L1977246241", "L1236012859");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3511");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter23 = classEmitter22.getStaticHook();
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3512");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitOuterClass("L1665279983", "L314362685", "L1136379970");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3513");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type4, type6, type8, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type2, typeArray15);
        boolean boolean18 = signature16.equals((java.lang.Object) (byte) 0);
        boolean boolean20 = signature16.equals((java.lang.Object) 100);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str23 = signature22.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        boolean boolean41 = signature22.equals((java.lang.Object) classEmitter39);
        boolean boolean42 = signature16.equals((java.lang.Object) classEmitter39);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter50.getClassInfo();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter50.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter54.visitSource("Ljava/lang/Hi!;", "L2062493799");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3514");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str21 = signature20.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        boolean boolean39 = signature20.equals((java.lang.Object) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type47);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        boolean boolean57 = type47.equals((java.lang.Object) classEmitter56);
        org.mockito.cglib.core.ClassInfo classInfo58 = classEmitter56.getClassInfo();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter63.visitInnerClass("(L;L;)J", "", "L1098819218", 108);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3515");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.Signature signature59 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str60 = signature59.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        boolean boolean78 = signature59.equals((java.lang.Object) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter82);
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter82);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int86 = classEmitter84.getAccess();
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3516");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3517");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.Signature signature34 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str35 = signature34.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        boolean boolean53 = signature34.equals((java.lang.Object) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassInfo classInfo57 = classEmitter55.getClassInfo();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter66.getClassInfo();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassInfo classInfo71 = classEmitter66.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.end_class();
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3518");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.end_class();
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3519");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter16.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo56 = classEmitter55.getClassInfo();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassInfo classInfo59 = classEmitter37.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter80.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo85 = classEmitter84.getClassInfo();
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        classEmitter76.setTarget((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassInfo classInfo88 = classEmitter77.getClassInfo();
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter77);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitInnerClass("LC;(L;L;L;L;L;L;)Lshort;", "(L;L;FL;L;L<init>(Ljava/lang/Lorg/mockito/asm/Type;;)V;)F", "L1758497522L2097555035", 163);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3520");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter45.getClassInfo();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter45);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter50.end_class();
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3521");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str21 = signature20.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        boolean boolean39 = signature20.equals((java.lang.Object) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter41.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo55 = classEmitter54.getClassInfo();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassInfo classInfo61 = classEmitter59.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter71.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.cglib.core.ClassInfo classInfo74 = classEmitter71.getClassInfo();
        classEmitter70.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter71);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.asm.Type[] typeArray86 = org.mockito.cglib.core.TypeUtils.parseTypes("<init>(Ljava.lang.Hi!");
        java.lang.String[] strArray87 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray86);
        org.mockito.asm.Type[] typeArray88 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray87);
        org.mockito.asm.Type[] typeArray89 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray87);
        org.mockito.asm.Type[] typeArray90 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray87);
        org.mockito.asm.Type[] typeArray91 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visit(180, (int) 'a', "L2054740683", "java.lang.Hi!(L;L;)S", "L232428196", strArray87);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3522");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.end_class();
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3523");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("L873942587", "java/lang/Long");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3524");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        boolean boolean11 = type1.equals((java.lang.Object) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type47);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        boolean boolean57 = type47.equals((java.lang.Object) classEmitter56);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitSource("L1606275788", "org.mockito.cglib.core.Signature");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3525");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter13.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.end_class();
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3526");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str14 = signature13.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        boolean boolean32 = signature13.equals((java.lang.Object) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter34.getClassInfo();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter42);
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str47 = signature46.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        boolean boolean65 = signature46.equals((java.lang.Object) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassInfo classInfo69 = classEmitter67.getClassInfo();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter71.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        classEmitter71.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo79 = classEmitter78.getClassInfo();
        classEmitter71.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        classEmitter67.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassInfo classInfo83 = classEmitter78.getClassInfo();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter86 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter87 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter86);
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter89 = classEmitter86.getStaticHook();
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3527");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter31.visitSource("L906436858", "");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3528");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1948024607L770455161");
        org.mockito.asm.Type type2 = signature1.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type2.getElementType();
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3529");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str21 = signature20.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        boolean boolean39 = signature20.equals((java.lang.Object) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitOuterClass("L785542084", "L719744877", "ShortL");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3530");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str31 = signature30.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        boolean boolean49 = signature30.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo70 = classEmitter69.getClassInfo();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter73.setTarget((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassInfo classInfo76 = classEmitter74.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter80.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        org.mockito.cglib.core.ClassInfo classInfo86 = classEmitter62.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter87 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter62);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter87);
        org.mockito.cglib.core.ClassInfo classInfo89 = classEmitter28.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter28.visitSource("L1682166645", "<init>$28Ljava$2Elang$2EHi!");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3531");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter18.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor33 = classEmitter18.visitAnnotation("L1540866902", false);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3532");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo46 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.Signature signature56 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str57 = signature56.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        boolean boolean75 = signature56.equals((java.lang.Object) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter79);
        org.mockito.cglib.core.ClassInfo classInfo82 = classEmitter79.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter84 = classEmitter1.getStaticHook();
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3533");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str15 = signature14.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean33 = signature14.equals((java.lang.Object) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.Signature signature47 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str48 = signature47.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        boolean boolean66 = signature47.equals((java.lang.Object) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter67.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassInfo classInfo70 = classEmitter68.getClassInfo();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter75.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo80 = classEmitter79.getClassInfo();
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        org.mockito.cglib.core.ClassInfo classInfo84 = classEmitter79.getClassInfo();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        org.mockito.cglib.core.ClassEmitter classEmitter86 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter79);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        org.mockito.cglib.core.ClassInfo classInfo88 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L702580517", "L53270697", "<init>(Ljava/lang/$28L$3BL$3BL$3BL$3BL$3BL$3B$29L$3B;)V");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3534");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str31 = signature30.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        boolean boolean49 = signature30.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo70 = classEmitter69.getClassInfo();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter73.setTarget((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassInfo classInfo76 = classEmitter74.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter80.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        org.mockito.cglib.core.ClassInfo classInfo86 = classEmitter62.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter87 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter62);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter87);
        org.mockito.cglib.core.ClassInfo classInfo89 = classEmitter87.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter90 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type91 = classEmitter87.getSuperType();
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3535");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str18 = signature17.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        boolean boolean36 = signature17.equals((java.lang.Object) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter38.getClassInfo();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type43 = classEmitter7.getSuperType();
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3536");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter29.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter22.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter22.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter50.getClassInfo();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter42.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo55 = classEmitter42.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.Signature signature65 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str66 = signature65.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter67.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter70.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        classEmitter67.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter75.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter78.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        classEmitter75.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter75);
        classEmitter67.setTarget((org.mockito.asm.ClassVisitor) classEmitter82);
        boolean boolean84 = signature65.equals((java.lang.Object) classEmitter82);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter82);
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter85);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter63);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter88);
        org.mockito.cglib.core.ClassEmitter classEmitter90 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter88);
        org.mockito.cglib.core.ClassInfo classInfo91 = classEmitter88.getClassInfo();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type93 = classEmitter13.getClassType();
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3537");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("(LL69280469;)Lorg/mockito/asm/Type;");
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        boolean boolean15 = type1.equals((java.lang.Object) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter31.getClassInfo();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type51 = classEmitter3.getClassType();
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3538");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = classEmitter22.getSuperType();
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3539");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter33.getClassInfo();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type37 = classEmitter22.getSuperType();
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3540");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Ljava/lang/Boolean;");
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter10.getClassInfo();
        boolean boolean34 = type1.equals((java.lang.Object) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter35.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter59);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitOuterClass("byte", "L662168126", "L2071693073");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3541");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str39 = signature38.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        boolean boolean57 = signature38.equals((java.lang.Object) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.Signature signature63 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str64 = signature63.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter73.setTarget((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter76.setTarget((org.mockito.asm.ClassVisitor) classEmitter77);
        classEmitter73.setTarget((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter80);
        boolean boolean82 = signature63.equals((java.lang.Object) classEmitter80);
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter83.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        org.mockito.cglib.core.ClassInfo classInfo86 = classEmitter84.getClassInfo();
        classEmitter80.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter80);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter15.visitEnd();
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3542");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter43.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter43.end_class();
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3543");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter33.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter33.visitEnd();
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3544");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("I");
        java.lang.String[] strArray41 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter31.visit(32, 184, "L2011063810", "L990325397", "L1437037170", strArray41);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3545");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter32.getClassInfo();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter37.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassInfo classInfo50 = classEmitter49.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassInfo classInfo52 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = classEmitter8.visitAnnotation("L257260530", false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3546");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L466791028", "L1694999586", "", 126);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3547");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str10 = signature9.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        boolean boolean28 = signature9.equals((java.lang.Object) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type39 = classEmitter38.getClassType();
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3548");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classEmitter10.visitAnnotation("Lorg.mockito.cglib.core.Signature", true);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3549");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter32.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int35 = classEmitter32.getAccess();
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3550");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Ljava/lang/Boolean;");
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter10.getClassInfo();
        boolean boolean34 = type1.equals((java.lang.Object) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type36 = classEmitter35.getSuperType();
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3551");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter48.getClassInfo();
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo60 = classEmitter59.getClassInfo();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassInfo classInfo64 = classEmitter63.getClassInfo();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassInfo classInfo66 = classEmitter63.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter68 = classEmitter63.getStaticHook();
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3552");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = classEmitter31.getClassType();
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3553");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter12 = classEmitter7.getStaticHook();
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3554");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str15 = signature14.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean33 = signature14.equals((java.lang.Object) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter46.getClassInfo();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type58);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter60);
        boolean boolean68 = type58.equals((java.lang.Object) classEmitter67);
        org.mockito.cglib.core.ClassInfo classInfo69 = classEmitter67.getClassInfo();
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassInfo classInfo71 = classEmitter67.getClassInfo();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type74 = classEmitter67.getClassType();
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3555");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str39 = signature38.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        boolean boolean57 = signature38.equals((java.lang.Object) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitOuterClass("L604831080", "Ljava/lang/Float;", "(L;L;)Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3556");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str15 = signature14.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean33 = signature14.equals((java.lang.Object) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter46.getClassInfo();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo68 = classEmitter67.getClassInfo();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.Signature signature72 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str73 = signature72.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter82.setTarget((org.mockito.asm.ClassVisitor) classEmitter83);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter86 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter85.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        classEmitter82.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        org.mockito.cglib.core.ClassEmitter classEmitter89 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter82);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        boolean boolean91 = signature72.equals((java.lang.Object) classEmitter89);
        org.mockito.cglib.core.ClassEmitter classEmitter92 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter89);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        org.mockito.cglib.core.ClassInfo classInfo94 = classEmitter59.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter96 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassInfo classInfo97 = classEmitter46.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int98 = classEmitter46.getAccess();
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3557");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str15 = signature14.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean33 = signature14.equals((java.lang.Object) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter46.getClassInfo();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo68 = classEmitter67.getClassInfo();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.Signature signature72 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str73 = signature72.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter82.setTarget((org.mockito.asm.ClassVisitor) classEmitter83);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter86 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter85.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        classEmitter82.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        org.mockito.cglib.core.ClassEmitter classEmitter89 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter82);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        boolean boolean91 = signature72.equals((java.lang.Object) classEmitter89);
        org.mockito.cglib.core.ClassEmitter classEmitter92 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter89);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        org.mockito.cglib.core.ClassInfo classInfo94 = classEmitter59.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter96 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassInfo classInfo97 = classEmitter96.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo98 = classEmitter96.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type99 = classEmitter96.getSuperType();
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3558");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter18.visitOuterClass("L2002491577", "L832335541LL1052178230;", "L527279753");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3559");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str15 = signature14.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean33 = signature14.equals((java.lang.Object) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter46.getClassInfo();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo68 = classEmitter67.getClassInfo();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.Signature signature72 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str73 = signature72.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter82.setTarget((org.mockito.asm.ClassVisitor) classEmitter83);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter86 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter85.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        classEmitter82.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        org.mockito.cglib.core.ClassEmitter classEmitter89 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter82);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        boolean boolean91 = signature72.equals((java.lang.Object) classEmitter89);
        org.mockito.cglib.core.ClassEmitter classEmitter92 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter89);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        org.mockito.cglib.core.ClassInfo classInfo94 = classEmitter59.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter96 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter97 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter98 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type99 = classEmitter98.getClassType();
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3560");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = classEmitter23.getSuperType();
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3561");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter14 = classEmitter13.getStaticHook();
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3562");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter41.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int44 = classEmitter41.getAccess();
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3563");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3564");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitOuterClass("L560552936", "L1314332529", "va.lang");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3565");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Ljava/lang/Boolean;");
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter10.getClassInfo();
        boolean boolean34 = type1.equals((java.lang.Object) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassInfo classInfo65 = classEmitter63.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter82.setTarget((org.mockito.asm.ClassVisitor) classEmitter83);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter86 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter85.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        classEmitter82.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        org.mockito.cglib.core.ClassEmitter classEmitter89 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter82);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        org.mockito.cglib.core.ClassEmitter classEmitter91 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter89);
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        org.mockito.cglib.core.ClassInfo classInfo94 = classEmitter89.getClassInfo();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter43.visitSource("L1214878508", "(L;L;L;L;L;L;)LL312979081;");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3566");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter27.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter27.end_class();
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3567");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3568");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter21.visitInnerClass("", "", "hi!", 41);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3569");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str21 = signature20.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        boolean boolean39 = signature20.equals((java.lang.Object) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter41.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo63 = classEmitter62.getClassInfo();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.Signature signature67 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str68 = signature67.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter80.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter77);
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        boolean boolean86 = signature67.equals((java.lang.Object) classEmitter84);
        org.mockito.cglib.core.ClassEmitter classEmitter87 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter87.setTarget((org.mockito.asm.ClassVisitor) classEmitter88);
        org.mockito.cglib.core.ClassInfo classInfo90 = classEmitter88.getClassInfo();
        classEmitter84.setTarget((org.mockito.asm.ClassVisitor) classEmitter88);
        org.mockito.cglib.core.ClassEmitter classEmitter92 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter84);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        org.mockito.cglib.core.ClassInfo classInfo94 = classEmitter55.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor98 = classEmitter37.visitAnnotation("L2124879863", true);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3570");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter18.visitEnd();
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3571");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter33.getClassInfo();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.parseTypes("L1818164453");
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getObjectType("short");
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type46);
        int int48 = type46.getDimensions();
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray44, type46);
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray44);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter33.visit(39, 60, "L1440539461", "L1448060000", "(Ljava/lang/L1878534181;)Lorg/mockito/asm/Type;", strArray50);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3572");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter23.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter54.visitEnd();
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3573");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("Lfloat;");
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(26, 154, "L234951004", "L1865058769", "L190508431", strArray8);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3574");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1623759892");
        org.mockito.asm.Type[] typeArray2 = signature1.getArgumentTypes();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassInfo classInfo56 = classEmitter54.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter54);
        boolean boolean58 = signature1.equals((java.lang.Object) classEmitter57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type59 = classEmitter57.getSuperType();
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3575");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter13.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = classEmitter18.getSuperType();
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3576");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.Signature signature51 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str52 = signature51.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        boolean boolean70 = signature51.equals((java.lang.Object) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter76.setTarget((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassInfo classInfo79 = classEmitter77.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter80.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter83.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        classEmitter80.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter89 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter90 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter89.setTarget((org.mockito.asm.ClassVisitor) classEmitter90);
        org.mockito.cglib.core.ClassInfo classInfo92 = classEmitter89.getClassInfo();
        classEmitter88.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        org.mockito.cglib.core.ClassInfo classInfo95 = classEmitter89.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter89.visitEnd();
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3577");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor38 = classEmitter32.visitField(132, "", "<init>(L;L;)V", "L1866702268", (java.lang.Object) "$2428L$243BL$243B$2429J");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3578");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter54 = classEmitter53.getStaticHook();
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3579");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = classEmitter28.getAccess();
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3580");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitSource("L1865058769", "L296646621");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3581");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo50 = classEmitter49.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter52.getClassInfo();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter63);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassInfo classInfo72 = classEmitter55.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassInfo classInfo74 = classEmitter55.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int77 = classEmitter55.getAccess();
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3582");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str31 = signature30.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        boolean boolean49 = signature30.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassInfo classInfo59 = classEmitter57.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter71.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter76.setTarget((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter79.setTarget((org.mockito.asm.ClassVisitor) classEmitter80);
        classEmitter76.setTarget((org.mockito.asm.ClassVisitor) classEmitter80);
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter83);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter83);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter83);
        org.mockito.cglib.core.ClassInfo classInfo87 = classEmitter57.getClassInfo();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter55.visitEnd();
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3583");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type54 = classEmitter43.getSuperType();
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3584");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("short");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = type1.getInternalName();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter32.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter32.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.Signature signature55 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str56 = signature55.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        boolean boolean74 = signature55.equals((java.lang.Object) classEmitter72);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter72);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassInfo classInfo80 = classEmitter78.getClassInfo();
        boolean boolean81 = type1.equals((java.lang.Object) classEmitter78);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor85 = classEmitter78.visitAnnotation("L752023964", true);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3585");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str13 = signature12.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        boolean boolean31 = signature12.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter33.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo56 = classEmitter55.getClassInfo();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassInfo classInfo58 = classEmitter48.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter33.visitSource("java.lang.Long", "$28Ljava$2Flang$2F$28L$3B$29Linit>$28Ljava$2Flang$2F$28L$3B");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3586");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter19.visitOuterClass("L1279109965", "L927082752", "L1536932753");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3587");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter36 = classEmitter33.getStaticHook();
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3588");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        org.mockito.asm.Type type4 = local3.getType();
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter34.getClassInfo();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter27.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo56 = classEmitter55.getClassInfo();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassInfo classInfo59 = classEmitter47.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo60 = classEmitter47.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.Signature signature70 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str71 = signature70.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter75.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter80.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter83.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        classEmitter80.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        org.mockito.cglib.core.ClassEmitter classEmitter87 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter80);
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter87);
        boolean boolean89 = signature70.equals((java.lang.Object) classEmitter87);
        org.mockito.cglib.core.ClassEmitter classEmitter90 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter87);
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter90);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter94 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        boolean boolean95 = type9.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo96 = classEmitter47.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter47.visitSource("L1149917156", "L1301518756");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3589");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo50 = classEmitter49.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter52.getClassInfo();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter58.visitOuterClass("L319398323", "L79373797", "L1739887272");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3590");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter19.visitInnerClass("L188885780", "L1059482802", "L1528842300", 163);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3591");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str15 = signature14.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean33 = signature14.equals((java.lang.Object) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter46.getClassInfo();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str54 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        boolean boolean63 = type53.equals((java.lang.Object) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter65.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor70 = classEmitter65.visitAnnotation("L1250353246", false);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3592");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str21 = signature20.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        boolean boolean39 = signature20.equals((java.lang.Object) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter41.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter52.getClassInfo();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassInfo classInfo57 = classEmitter52.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter71.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo76 = classEmitter75.getClassInfo();
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        classEmitter67.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter80.visitEnd();
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3593");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str21 = signature20.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        boolean boolean39 = signature20.equals((java.lang.Object) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter41.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter52.getClassInfo();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassInfo classInfo57 = classEmitter52.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter59.end_class();
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3594");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str10 = signature9.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        boolean boolean28 = signature9.equals((java.lang.Object) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter36.visitSource("LL1600525637;", "L1944168406");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3595");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter27.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter27.visitSource("L1045852172", "(Ljava/lang/L2113150471;)S");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3596");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo31 = classEmitter30.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type35 = classEmitter34.getSuperType();
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3597");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter23 = classEmitter20.getStaticHook();
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3598");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter16.visitSource("L484854585", "L1690892364");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3599");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter33.getClassInfo();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor39 = classEmitter22.visitAnnotation("L366418678", true);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3600");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter47.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor55 = classEmitter47.visitAnnotation("L1345313959", false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3601");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        boolean boolean11 = type1.equals((java.lang.Object) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type47);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        boolean boolean57 = type47.equals((java.lang.Object) classEmitter56);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo62 = classEmitter61.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo63 = classEmitter61.getClassInfo();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter60.visitSource("LL614449524$3B", "");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3602");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("short");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = type1.getInternalName();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter32.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter32.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.Signature signature55 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str56 = signature55.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        boolean boolean74 = signature55.equals((java.lang.Object) classEmitter72);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter72);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassInfo classInfo80 = classEmitter78.getClassInfo();
        boolean boolean81 = type1.equals((java.lang.Object) classEmitter78);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int83 = classEmitter82.getAccess();
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3603");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.Signature signature34 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str35 = signature34.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        boolean boolean53 = signature34.equals((java.lang.Object) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassInfo classInfo57 = classEmitter55.getClassInfo();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter66.getClassInfo();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassInfo classInfo71 = classEmitter66.getClassInfo();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int75 = classEmitter74.getAccess();
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3604");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.end_class();
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3605");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter33.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter33.visitOuterClass("L976573831", "L1780454330", "L341073827");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3606");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str21 = signature20.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        boolean boolean39 = signature20.equals((java.lang.Object) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter41.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter52.getClassInfo();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassInfo classInfo57 = classEmitter52.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int61 = classEmitter52.getAccess();
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3607");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter18.getClassInfo();
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type27, type29, type31, type33, type35, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type25, typeArray38);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int41 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type25);
        java.lang.String str44 = type25.getClassName();
        boolean boolean45 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass49 = signature48.getClass();
        java.lang.String str50 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass49);
        java.lang.String str51 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        int int53 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type52);
        org.mockito.asm.Type type54 = type52.getElementType();
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isPrimitive(type54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter18.declare_field(163, "", type25, (java.lang.Object) boolean55);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3608");
        java.lang.String[] strArray1 = new java.lang.String[] { "L69280469" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        java.lang.String str4 = signature3.toString();
        org.mockito.asm.Type type5 = signature3.getReturnType();
        java.lang.String str6 = signature3.toString();
        org.mockito.asm.Type type7 = signature3.getReturnType();
        java.lang.String str8 = type7.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type7.getInternalName();
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3609");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("(S[Lorg/mockito/asm/Type;)LF;", "(Lshort;L;SL;L;)L;", "(Ljava/lang/C;Ljava/lang/C;LL2110005037;)Lorg/mockito/cglib/core/LocalVariablesSorter;");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3610");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo50 = classEmitter49.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter52.getClassInfo();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter57 = classEmitter55.getStaticHook();
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3611");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter7.visitAnnotation("L2046279635", true);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3612");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter16.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.Signature signature59 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str60 = signature59.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        boolean boolean78 = signature59.equals((java.lang.Object) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type84 = classEmitter83.getClassType();
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3613");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter14.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.Signature signature33 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str34 = signature33.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        boolean boolean52 = signature33.equals((java.lang.Object) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassInfo classInfo56 = classEmitter54.getClassInfo();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo66 = classEmitter65.getClassInfo();
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassInfo classInfo70 = classEmitter65.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter75);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.getType("L1128538919");
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.parseTypes("L1811671229");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter75.begin_class(146, 55, "java/lang/C(Ljava/lang/F", type83, typeArray85, "(L;L;Lorg/mockito/asm/Type;)L(Ljava/lang/L1782723141;");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3614");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str13 = signature12.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        boolean boolean31 = signature12.equals((java.lang.Object) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter33.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo56 = classEmitter55.getClassInfo();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassInfo classInfo58 = classEmitter48.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter62.visitOuterClass("L1120453680", "L229828182", "(Ljava/lang/L1201611683;)V");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3615");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo50 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter66.getClassInfo();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassInfo classInfo70 = classEmitter59.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter59);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type73 = classEmitter43.getClassType();
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3616");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("L705436911");
        java.lang.String str2 = signature1.toString();
        org.mockito.asm.Type type3 = signature1.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type3.getInternalName();
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3617");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str21 = signature20.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        boolean boolean39 = signature20.equals((java.lang.Object) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter41.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter37.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter37.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter73.setTarget((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter76.setTarget((org.mockito.asm.ClassVisitor) classEmitter77);
        classEmitter73.setTarget((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo81 = classEmitter80.getClassInfo();
        classEmitter73.setTarget((org.mockito.asm.ClassVisitor) classEmitter80);
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter84.setTarget((org.mockito.asm.ClassVisitor) classEmitter85);
        org.mockito.cglib.core.ClassEmitter classEmitter87 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter87.setTarget((org.mockito.asm.ClassVisitor) classEmitter88);
        classEmitter84.setTarget((org.mockito.asm.ClassVisitor) classEmitter88);
        org.mockito.cglib.core.ClassEmitter classEmitter91 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo92 = classEmitter91.getClassInfo();
        classEmitter84.setTarget((org.mockito.asm.ClassVisitor) classEmitter91);
        classEmitter73.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        org.mockito.cglib.core.ClassEmitter classEmitter95 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter95);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter98 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int99 = classEmitter49.getAccess();
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3618");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str15 = signature14.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean33 = signature14.equals((java.lang.Object) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter46.getClassInfo();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter53 = classEmitter52.getStaticHook();
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3619");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3620");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter11.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter23 = classEmitter0.getStaticHook();
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3621");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str21 = signature20.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        boolean boolean39 = signature20.equals((java.lang.Object) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter41.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter37.visitSource("", "(Ljava/lang/L2010011207;)LF;");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3622");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("(LL69280469;)Lorg/mockito/asm/Type;");
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        boolean boolean15 = type1.equals((java.lang.Object) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo32 = classEmitter31.getClassInfo();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type70 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type60, type62, type64, type66, type68, type70 };
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("", type58, typeArray71);
        org.mockito.asm.Type type75 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type79 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type81 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type85 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type87 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray88 = new org.mockito.asm.Type[] { type77, type79, type81, type83, type85, type87 };
        org.mockito.cglib.core.Signature signature89 = new org.mockito.cglib.core.Signature("", type75, typeArray88);
        boolean boolean90 = org.mockito.cglib.core.TypeUtils.isPrimitive(type75);
        org.mockito.asm.Type type91 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type75);
        org.mockito.asm.Type[] typeArray92 = org.mockito.cglib.core.TypeUtils.add(typeArray71, type91);
        java.lang.String[] strArray93 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray92);
        org.mockito.asm.Type[] typeArray94 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray93);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter24.visit(176, 172, "L2013521839", "", "L956746939", strArray93);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3623");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter0.getClassType();
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3624");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter13.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = classEmitter12.getClassType();
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3625");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter24.visitSource("L688227371", "L1087508033");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3626");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.Signature signature51 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str52 = signature51.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        boolean boolean70 = signature51.equals((java.lang.Object) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassInfo classInfo77 = classEmitter74.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo78 = classEmitter74.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter74.visitSource("L307687703", "L1702401306");
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3627");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter34.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter46.getClassInfo();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter51);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter31.visitEnd();
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3628");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str26 = signature25.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter42);
        boolean boolean44 = signature25.equals((java.lang.Object) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter46.getClassInfo();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo58 = classEmitter57.getClassInfo();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassInfo classInfo62 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str70 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type69);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter71.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        classEmitter71.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter71);
        boolean boolean79 = type69.equals((java.lang.Object) classEmitter78);
        org.mockito.cglib.core.ClassInfo classInfo80 = classEmitter78.getClassInfo();
        classEmitter65.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassInfo classInfo82 = classEmitter78.getClassInfo();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassInfo classInfo84 = classEmitter63.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassInfo classInfo86 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitOuterClass("L104571218", "L764347602Lchar;", "L178771045");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3629");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter48.getClassInfo();
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo60 = classEmitter59.getClassInfo();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassInfo classInfo64 = classEmitter63.getClassInfo();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassInfo classInfo66 = classEmitter63.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type68 = classEmitter0.getClassType();
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3630");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter13.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.end_class();
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3631");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter32 = classEmitter31.getStaticHook();
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3632");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type5, type7, type9, type11, type13, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", type3, typeArray16);
        java.lang.String str18 = type3.toString();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(104, type3);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter35.getClassInfo();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter41);
        boolean boolean43 = type3.equals((java.lang.Object) classEmitter42);
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter42.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter42.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter47 = classEmitter46.getStaticHook();
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3633");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.Signature signature43 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str44 = signature43.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        boolean boolean62 = signature43.equals((java.lang.Object) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter67.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter75.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter72);
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter79);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter81);
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter82);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassInfo classInfo85 = classEmitter21.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type86 = classEmitter21.getClassType();
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3634");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo42 = classEmitter41.getClassInfo();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo46 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.Signature signature56 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str57 = signature56.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter58.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        boolean boolean75 = signature56.equals((java.lang.Object) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter79);
        org.mockito.cglib.core.ClassInfo classInfo82 = classEmitter79.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor86 = classEmitter1.visitAnnotation("", false);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3635");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter16.getClassInfo();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter44.getClassInfo();
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter36.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.Signature signature59 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str60 = signature59.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter72.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter69.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter76);
        boolean boolean78 = signature59.equals((java.lang.Object) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classEmitter79);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassInfo classInfo83 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int86 = classEmitter85.getAccess();
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3636");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter19.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter19.visitEnd();
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3637");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        boolean boolean11 = type1.equals((java.lang.Object) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassInfo classInfo35 = classEmitter33.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type47);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        boolean boolean57 = type47.equals((java.lang.Object) classEmitter56);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassInfo classInfo59 = classEmitter56.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type60 = classEmitter56.getSuperType();
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3638");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("Ljava/lang/<init>(Ljava/lang/(L;", "L85812091");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3639");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter13.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter19.visitOuterClass("L741646969", "L212874258", "L1267074127");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3640");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter27.getClassInfo();
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("C");
        int int41 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.parseTypes("C");
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray40, typeArray43);
        java.lang.String[] strArray45 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter27.visit(7, 30, "L88590370", "L175487934", "L815251919", strArray45);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3641");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter39.getClassInfo();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type46 = classEmitter44.getClassType();
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3642");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.fromInternalName("short");
        int int25 = type24.getDimensions();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(100, type24);
        org.mockito.asm.Type type27 = local26.getType();
        org.mockito.asm.Type type28 = local26.getType();
        org.mockito.asm.Type type29 = local26.getType();
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("L602401257");
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((int) (short) 100, type32);
        int int34 = local33.getIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter19.declare_field(108, "L773914848", type29, (java.lang.Object) local33);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3643");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str15 = signature14.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean33 = signature14.equals((java.lang.Object) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter46.getClassInfo();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo68 = classEmitter67.getClassInfo();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.Signature signature72 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str73 = signature72.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter82.setTarget((org.mockito.asm.ClassVisitor) classEmitter83);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter86 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter85.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        classEmitter82.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        org.mockito.cglib.core.ClassEmitter classEmitter89 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter82);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        boolean boolean91 = signature72.equals((java.lang.Object) classEmitter89);
        org.mockito.cglib.core.ClassEmitter classEmitter92 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter89);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        org.mockito.cglib.core.ClassInfo classInfo94 = classEmitter59.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        org.mockito.cglib.core.ClassEmitter classEmitter96 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter97 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type98 = classEmitter97.getSuperType();
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3644");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getReturnType("[Lorg/mockito/asm/Type;");
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(126, type37);
        org.mockito.asm.Type type39 = local38.getType();
        int int40 = type39.getDimensions();
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getComponentType(type39);
        java.lang.String str42 = type39.getClassName();
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type39);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.parseTypes("L1102270434");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter27.begin_class(130, 39, "Ljava.lang.Lorg.mockito.asm.Type", type43, typeArray45, "(Ljava/lang/C;Ljava/lang/C;LL2110005037;)Lorg/mockito/cglib/core/LocalVariablesSorter;");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3645");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter19.visitInnerClass("", "L223758232", "L533778891", (int) (short) 10);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3646");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter20.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.Signature signature26 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str27 = signature26.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        boolean boolean45 = signature26.equals((java.lang.Object) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter47.getClassInfo();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter54.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo59 = classEmitter58.getClassInfo();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter58);
        org.mockito.cglib.core.ClassInfo classInfo64 = classEmitter63.getClassInfo();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type72 = classEmitter63.getSuperType();
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3647");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter47.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter51.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter54.visitEnd();
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3648");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter23.getClassInfo();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter41.visitInnerClass("L1232991700", "L2069748564", "L887282080", 48);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3649");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter15.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter43.getClassInfo();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter35.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter35.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.Signature signature58 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str59 = signature58.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter71.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        classEmitter68.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        boolean boolean77 = signature58.equals((java.lang.Object) classEmitter75);
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter75);
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter81);
        org.mockito.cglib.core.ClassInfo classInfo84 = classEmitter81.getClassInfo();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor89 = classEmitter0.visitAnnotation("L1227077466", true);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3650");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type39 = classEmitter38.getSuperType();
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3651");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type20, type22, type24, type26, type28, type30 };
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", type18, typeArray31);
        boolean boolean34 = signature32.equals((java.lang.Object) (byte) 0);
        boolean boolean36 = signature32.equals((java.lang.Object) 100);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str39 = signature38.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter51.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter55);
        boolean boolean57 = signature38.equals((java.lang.Object) classEmitter55);
        boolean boolean58 = signature32.equals((java.lang.Object) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter62.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter63);
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo67 = classEmitter66.getClassInfo();
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.cglib.core.ClassInfo classInfo69 = classEmitter66.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter66);
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter70);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int74 = classEmitter72.getAccess();
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3652");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java.lang.<init>(Ljava.lang.Lshort");
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter22.getClassInfo();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter22.getClassInfo();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str29 = signature28.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter42);
        classEmitter38.setTarget((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        boolean boolean47 = signature28.equals((java.lang.Object) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter49.getClassInfo();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo61 = classEmitter60.getClassInfo();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        boolean boolean66 = signature1.equals((java.lang.Object) classEmitter14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor69 = classEmitter14.visitAnnotation("java.lang.L732314971", false);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3653");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter33.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter37.getClassInfo();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter48.getClassInfo();
        classEmitter41.setTarget((org.mockito.asm.ClassVisitor) classEmitter48);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter52.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter52);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.getType("L1362657685");
        java.lang.String str60 = type59.toString();
        org.mockito.asm.Type type61 = type59.getElementType();
        java.lang.String[] strArray63 = new java.lang.String[] { "L69280469" };
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray63);
        org.mockito.cglib.core.Signature signature65 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray64);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local69 = new org.mockito.cglib.core.Local((int) (short) 100, type68);
        org.mockito.asm.Type type70 = local69.getType();
        boolean boolean71 = signature65.equals((java.lang.Object) local69);
        org.mockito.asm.Type type72 = local69.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter9.declare_field(150, "(LL614449524;Ljava/lang/L1483364670;)LF;", type59, (java.lang.Object) type72);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3654");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter8.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str15 = signature14.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean33 = signature14.equals((java.lang.Object) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter46.getClassInfo();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter55.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        classEmitter52.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter59 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter61);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter63.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo68 = classEmitter67.getClassInfo();
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classEmitter67);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.cglib.core.Signature signature72 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str73 = signature72.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter75);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter78);
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter82.setTarget((org.mockito.asm.ClassVisitor) classEmitter83);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter86 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter85.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        classEmitter82.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        org.mockito.cglib.core.ClassEmitter classEmitter89 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter82);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        boolean boolean91 = signature72.equals((java.lang.Object) classEmitter89);
        org.mockito.cglib.core.ClassEmitter classEmitter92 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter89);
        classEmitter59.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        org.mockito.cglib.core.ClassInfo classInfo94 = classEmitter59.getClassInfo();
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classEmitter59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter46.visitOuterClass("", "L1210668652", "L1889458792");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3655");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter27.getClassInfo();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter34.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter45.visitEnd();
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3656");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str31 = signature30.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter47);
        boolean boolean49 = signature30.equals((java.lang.Object) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter55.visitEnd();
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3657");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type4, type6, type8, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type2, typeArray15);
        boolean boolean18 = signature16.equals((java.lang.Object) (byte) 0);
        boolean boolean20 = signature16.equals((java.lang.Object) 100);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str23 = signature22.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        boolean boolean41 = signature22.equals((java.lang.Object) classEmitter39);
        boolean boolean42 = signature16.equals((java.lang.Object) classEmitter39);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter39.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int47 = classEmitter44.getAccess();
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3658");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter36.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter28.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.cglib.core.Signature signature51 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str52 = signature51.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter64.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        classEmitter61.setTarget((org.mockito.asm.ClassVisitor) classEmitter65);
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classEmitter68);
        boolean boolean70 = signature51.equals((java.lang.Object) classEmitter68);
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter71);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter74);
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter76.setTarget((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassInfo classInfo79 = classEmitter77.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter80 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter80.setTarget((org.mockito.asm.ClassVisitor) classEmitter81);
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter83.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        classEmitter80.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        classEmitter77.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter77);
        org.mockito.cglib.core.ClassEmitter classEmitter89 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter90 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter89.setTarget((org.mockito.asm.ClassVisitor) classEmitter90);
        org.mockito.cglib.core.ClassInfo classInfo92 = classEmitter89.getClassInfo();
        classEmitter88.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        classEmitter74.setTarget((org.mockito.asm.ClassVisitor) classEmitter89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter89.visitInnerClass("LL1917506878;", "", "L275936624", 29);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3659");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        boolean boolean20 = signature1.equals((java.lang.Object) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassInfo classInfo38 = classEmitter27.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type39 = classEmitter27.getSuperType();
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3660");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrimitive(type0);
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3661");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitInnerClass("L1331793493", "L577983453", "L485065252", 150);
    }
}

