import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

    public static boolean debug = false;

    @Test
    public void test19501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19501");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray9 = new java.lang.String[] { "I(ILjava/lang/Object", "rg.mockito.asm.TypeLjava.lang.Object", "java.lang.Object(ILjava/lang/Object;IF)LharV(ILjava/lang/Object;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter0.visitMethod(169, "Lg/mockito/asm/Type;", "(FFLjava/lang/Object;)Lva/lang/Object;", "Lorg/mockito/cglib/core/ClassEmitter;hi!(ILjava/lang/Object;IF)B", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4d8e35f9");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test19502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19502");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter12.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classAdapter17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter21.visitSource("Lorg/mockito/cglib/core/ClassEmitter;(ILjava/lang/Object;IF)LILjava/lang/Object;", "L(FFLjava/lang/Object;)I;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo20);
    }

    @Test
    public void test19503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19503");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter5 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer6 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = interceptFieldTransformer6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer6);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        interceptFieldTransformer6.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.ClassVisitor classVisitor21 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter(classVisitor21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classAdapter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter31.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter31.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter37);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)I");
        java.lang.String str48 = type47.getDescriptor();
        org.mockito.asm.Type type49 = type47.getElementType();
        java.lang.String str50 = type47.getInternalName();
        org.mockito.asm.Type type51 = type47.getElementType();
        int int52 = type47.getDimensions();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type56 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray57);
        int int59 = type55.getSize();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass63);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str66 = type65.toString();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type61, type64, type65, type67 };
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray68);
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("hi!", type54, typeArray68);
        java.lang.String str71 = signature70.getDescriptor();
        java.lang.String str72 = signature70.getDescriptor();
        java.lang.String str73 = signature70.getDescriptor();
        org.mockito.asm.Type type74 = signature70.getReturnType();
        org.mockito.asm.Type[] typeArray76 = org.mockito.asm.Type.getArgumentTypes("(ILjava/lang/Object;IF)Lg/mockito/asm/Type;");
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type74, typeArray76);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.begin_class(161, 153, "Lorg.mockito.cglib.core.ClassEmitter;(ILjava/lang/Object;IF)Ljava/lang/Object;", type47, typeArray76, "char");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LILjava/lang/Object;" + "'", str48, "LILjava/lang/Object;");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ILjava/lang/Object" + "'", str50, "ILjava/lang/Object");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(C)C" + "'", str58, "(C)C");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "I" + "'", str66, "I");
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str69, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str71, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str72, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str73, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str77, "(ILjava/lang/Object;IF)B");
    }

    @Test
    public void test19504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19504");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lhi!;", "Lorg/mockito/cglib/core/ClassEmitter;");
        java.lang.String str3 = signature2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lhi!;Lorg/mockito/cglib/core/ClassEmitter;" + "'", str3, "Lhi!;Lorg/mockito/cglib/core/ClassEmitter;");
    }

    @Test
    public void test19505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19505");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.String str23 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type26 = type25.getElementType();
        java.lang.String str27 = type25.getInternalName();
        int int29 = type25.getOpcode(12);
        org.mockito.asm.Type type30 = type25.getElementType();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter13.declare_field(96, "Lva.lang.Object;", type30, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Object;" + "'", str18, "Ljava/lang/Object;");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ljava/lang/Object;" + "'", str19, "Ljava/lang/Object;");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java/lang/Object" + "'", str20, "java/lang/Object");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ljava/lang/Object;" + "'", str21, "Ljava/lang/Object;");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Ljava/lang/Object;" + "'", str22, "Ljava/lang/Object;");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java/lang/Object" + "'", str23, "java/lang/Object");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Ljava/lang/Object;" + "'", str24, "Ljava/lang/Object;");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java/lang/Object" + "'", str27, "java/lang/Object");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 16 + "'", int29 == 16);
        org.junit.Assert.assertNotNull(type30);
    }

    @Test
    public void test19506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19506");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter10);
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.asm.ClassVisitor classVisitor22 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter(classVisitor22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classAdapter25);
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter27);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter28);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor32 = classAdapter17.visitField(172, "LF;", "LLI;", "LvoidV;", (java.lang.Object) classEmitter28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
    }

    @Test
    public void test19507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19507");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getName();
        org.mockito.asm.Type type19 = signature17.getReturnType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)D");
        java.lang.String str22 = type21.getInternalName();
        int int23 = type21.getSize();
        boolean boolean24 = signature17.equals((java.lang.Object) int23);
        java.lang.String str25 = signature17.getName();
        org.mockito.asm.Type type26 = signature17.getReturnType();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        int int31 = type30.getSort();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type33 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray34);
        int int36 = type32.getSize();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str43 = type42.toString();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type38, type41, type42, type44 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray45);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", type30, typeArray45);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type51 };
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray52);
        int int54 = type50.getSize();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass58);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str61 = type60.toString();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type56, type59, type60, type62 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray63);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", type49, typeArray63);
        java.lang.String str66 = signature65.getDescriptor();
        java.lang.String str67 = signature65.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter68 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter69 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter68);
        org.mockito.cglib.core.ClassInfo classInfo70 = classEmitter68.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter71 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter68);
        boolean boolean72 = signature65.equals((java.lang.Object) classEmitter68);
        boolean boolean73 = signature47.equals((java.lang.Object) signature65);
        java.lang.String str74 = signature47.getName();
        boolean boolean75 = signature17.equals((java.lang.Object) signature47);
        org.mockito.asm.Type type76 = signature17.getReturnType();
        java.lang.String str77 = signature17.getName();
        java.lang.String str78 = signature17.toString();
        java.lang.Class<?> wildcardClass79 = signature17.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(C)C" + "'", str5, "(C)C");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str16, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ILjava/lang/Object" + "'", str22, "ILjava/lang/Object");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(C)C" + "'", str35, "(C)C");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "I" + "'", str43, "I");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str46, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(C)C" + "'", str53, "(C)C");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "I" + "'", str61, "I");
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str64, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str66, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str67, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNull(classInfo70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str78, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test19508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19508");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        org.mockito.asm.Type type19 = signature17.getReturnType();
        java.lang.String str20 = type19.getDescriptor();
        java.lang.String str21 = type19.toString();
        java.lang.String str22 = type19.toString();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(C)C" + "'", str5, "(C)C");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str16, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str18, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "B" + "'", str20, "B");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "B" + "'", str21, "B");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "B" + "'", str22, "B");
    }

    @Test
    public void test19509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19509");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray20);
        int int22 = type18.getSize();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str29 = type28.toString();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type24, type27, type28, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray31);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray31);
        java.lang.String str35 = type16.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)I");
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = type37.getElementType();
        java.lang.String str40 = type37.getInternalName();
        org.mockito.asm.Type type41 = type37.getElementType();
        boolean boolean42 = type16.equals((java.lang.Object) type41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo46 = classEmitter43.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter47 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        boolean boolean49 = type41.equals((java.lang.Object) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter43.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor52 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter(classVisitor52);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter55 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter54);
        classEmitter53.setTarget((org.mockito.asm.ClassVisitor) classAdapter55);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.asm.ClassAdapter classAdapter58 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.asm.ClassAdapter classAdapter59 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter58);
        org.mockito.asm.ClassAdapter classAdapter60 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter58);
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classAdapter58);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type65 = classEmitter12.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(C)C" + "'", str21, "(C)C");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "I" + "'", str29, "I");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str32, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(ILjava/lang/Object;IF)D" + "'", str33, "(ILjava/lang/Object;IF)D");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(ILjava/lang/Object;IF)J" + "'", str34, "(ILjava/lang/Object;IF)J");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "long" + "'", str35, "long");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LILjava/lang/Object;" + "'", str38, "LILjava/lang/Object;");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ILjava/lang/Object" + "'", str40, "ILjava/lang/Object");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(classInfo51);
    }

    @Test
    public void test19510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19510");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter1.getClassInfo();
        java.lang.String[] strArray18 = new java.lang.String[] { "B(FFLjava.lang.Object;)LILjava/lang/Object;", "voidV(ILjava/lang/Object;IF)B", "(ILjava/lang/Object;IF)D" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(132, 0, "void", "harV(ILjava/lang/Object", "Lorg/mockito/cglib/core/ClassEmitter;hi!(ILjava/lang/Object;IF)B", strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test19511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19511");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("org.mockito.asm.Type(ILjava/lang/Object;IF)Ljava/lang/Object;");
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(ILjava.lang.Object;IF)Ljava.lang.Object;");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray3);
        int int5 = type1.getDimensions();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(ILjava.lang.Object;IF)Lrg.mockito.asm.Type(ILjava/lang/Object;" + "'", str4, "(ILjava.lang.Object;IF)Lrg.mockito.asm.Type(ILjava/lang/Object;");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test19512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19512");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("(ILjava/lang/Object;IF)LB;");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray8);
        int int10 = type6.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type12, type15, type16, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray19);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray19);
        java.lang.String str22 = signature21.getName();
        org.mockito.asm.Type type23 = signature21.getReturnType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)D");
        java.lang.String str26 = type25.getInternalName();
        int int27 = type25.getSize();
        boolean boolean28 = signature21.equals((java.lang.Object) int27);
        java.lang.String str29 = signature21.toString();
        java.lang.String str30 = signature21.getName();
        java.lang.String str31 = signature21.toString();
        org.mockito.asm.Type[] typeArray32 = signature21.getArgumentTypes();
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("L(ILjava/lang/Object;", type1, typeArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(C)C" + "'", str9, "(C)C");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "I" + "'", str17, "I");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str20, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ILjava/lang/Object" + "'", str26, "ILjava/lang/Object");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str29, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str31, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(ILjava/lang/Object;IF)L(ILjava/lang/Object;IF)LB;;" + "'", str33, "(ILjava/lang/Object;IF)L(ILjava/lang/Object;IF)LB;;");
    }

    @Test
    public void test19513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19513");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("LLorg/mockito/asm/ClassAdapter;(ILjava/lang/Object;IF)Ljava/lang/Object;;", "Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;Lbyte;byte");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'LLorg/mockito/asm/ClassAdapter;(ILjava/lang/Object;IF)Ljava/lang/Object;;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19514");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter(classVisitor16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter19 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter17.setTarget((org.mockito.asm.ClassVisitor) classAdapter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassAdapter classAdapter23 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        classEmitter13.setTarget((org.mockito.asm.ClassVisitor) classAdapter25);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getReturnType("Lorg/mockito/cglib/core/Signature;(ILjava/lang/Object;IF)Lva/lang/Object;");
        java.lang.String str33 = type32.getInternalName();
        int int34 = type32.getDimensions();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor35 = classEmitter13.visitField(138, "L(ILjava/lang/Object;IF)Lorg/mockito/cglib/core/ClassEmitter;;", "L(FFLjava/lang/Object;)I;", "(ILjava/lang/Object;IF)LL(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;;;", (java.lang.Object) int34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "va/lang/Object" + "'", str33, "va/lang/Object");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test19515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19515");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean24 = signature17.equals((java.lang.Object) classEmitter20);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter(classVisitor26);
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter27.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classAdapter32);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classAdapter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter35.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter39);
        org.mockito.cglib.core.ClassInfo classInfo41 = classEmitter40.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter43 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter42);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter42);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter48 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassInfo classInfo49 = classEmitter47.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter50 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter50);
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter50);
        org.mockito.cglib.core.ClassEmitter classEmitter53 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter50);
        classEmitter40.setTarget((org.mockito.asm.ClassVisitor) classEmitter53);
        org.mockito.cglib.core.ClassInfo classInfo55 = classEmitter40.getClassInfo();
        org.mockito.asm.Attribute attribute56 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter40.visitAttribute(attribute56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(C)C" + "'", str5, "(C)C");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str16, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str18, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str19, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo41);
        org.junit.Assert.assertNull(classInfo49);
        org.junit.Assert.assertNull(classInfo55);
    }

    @Test
    public void test19516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19516");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test19517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19517");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(C)C");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray6);
        int int8 = type4.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str15 = type14.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type10, type13, type14, type16 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray17);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray17);
        java.lang.String str20 = signature19.getDescriptor();
        java.lang.String str21 = signature19.getDescriptor();
        java.lang.String str22 = signature19.getDescriptor();
        java.lang.String str23 = signature19.getDescriptor();
        boolean boolean24 = type1.equals((java.lang.Object) signature19);
        org.mockito.asm.Type[] typeArray25 = signature19.getArgumentTypes();
        java.lang.String str26 = signature19.getName();
        java.lang.String str27 = signature19.getDescriptor();
        org.mockito.asm.Type type28 = signature19.getReturnType();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(C)C" + "'", str7, "(C)C");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "I" + "'", str15, "I");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str18, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str20, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str21, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str22, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str23, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str27, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(type28);
    }

    @Test
    public void test19518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19518");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("charV(ILjava/lang/Object;IF)Ljava/lang/Object;");
        org.mockito.asm.Type type2 = type1.getElementType();
        int int3 = type2.getSort();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test19519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19519");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        java.lang.String str19 = signature17.getName();
        org.mockito.asm.Type type20 = signature17.getReturnType();
        java.lang.String str21 = signature17.getName();
        java.lang.String str22 = signature17.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter(classVisitor25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter34 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer35 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo37 = interceptFieldTransformer35.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo38 = interceptFieldTransformer35.getClassInfo();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer35);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter23.getClassInfo();
        boolean boolean41 = signature17.equals((java.lang.Object) classInfo40);
        java.lang.String str42 = signature17.getName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(C)C" + "'", str5, "(C)C");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str16, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo38);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test19520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19520");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        java.lang.String str5 = type4.getInternalName();
        int int6 = type4.getSort();
        java.lang.String str7 = type4.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray14);
        int int16 = type12.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type18, type21, type22, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray25);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("void", type4, typeArray25);
        org.mockito.asm.Type type29 = signature28.getReturnType();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getReturnType("Ljava/lang/Object;");
        int int32 = type31.getSort();
        java.lang.String str33 = type31.toString();
        java.lang.Class<?> wildcardClass34 = type31.getClass();
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type41 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray42);
        int int44 = type40.getSize();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str51 = type50.toString();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type46, type49, type50, type52 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("hi!", type39, typeArray53);
        java.lang.String str56 = signature55.getDescriptor();
        java.lang.String str57 = signature55.getDescriptor();
        org.mockito.asm.Type[] typeArray58 = signature55.getArgumentTypes();
        org.mockito.asm.Type type59 = signature55.getReturnType();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean61 = signature55.equals((java.lang.Object) type60);
        org.mockito.cglib.core.ClassEmitter classEmitter62 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter63 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassInfo classInfo64 = classEmitter62.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo65 = classEmitter62.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter66 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter62);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter62);
        boolean boolean68 = signature55.equals((java.lang.Object) classEmitter67);
        org.mockito.cglib.core.ClassEmitter classEmitter69 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter70 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassInfo classInfo71 = classEmitter69.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter69);
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.asm.ClassAdapter classAdapter75 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter67.setTarget((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassEmitter classEmitter77 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter67);
        org.mockito.asm.ClassAdapter classAdapter78 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter67);
        boolean boolean79 = type36.equals((java.lang.Object) classEmitter67);
        org.mockito.asm.ClassVisitor classVisitor80 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter81 = new org.mockito.cglib.core.ClassEmitter(classVisitor80);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter83 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter82);
        classEmitter81.setTarget((org.mockito.asm.ClassVisitor) classAdapter83);
        org.mockito.asm.ClassAdapter classAdapter85 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter81);
        org.mockito.cglib.core.ClassEmitter classEmitter86 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter85);
        classEmitter67.setTarget((org.mockito.asm.ClassVisitor) classEmitter86);
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter67);
        boolean boolean89 = signature28.equals((java.lang.Object) classEmitter88);
        org.mockito.asm.Type type90 = signature28.getReturnType();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java/lang/Object" + "'", str5, "java/lang/Object");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ljava/lang/Object;" + "'", str7, "Ljava/lang/Object;");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(C)C" + "'", str11, "(C)C");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(C)C" + "'", str15, "(C)C");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "I" + "'", str23, "I");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str26, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str27, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Ljava/lang/Object;" + "'", str33, "Ljava/lang/Object;");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org/mockito/asm/Type" + "'", str35, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str37, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(C)C" + "'", str43, "(C)C");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "I" + "'", str51, "I");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str54, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str56, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str57, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNull(classInfo65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(classInfo71);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(type90);
    }

    @Test
    public void test19521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19521");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter6);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter8.visitInnerClass("LcharV(ILjava/lang/Object;IF)Ljava/lang/Object;;", "(ILjava.lang.Object;IF)Ljava.lang.Object;", "LharV(ILjava/lang/Object;", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19522");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter7 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter6.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter9);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        java.lang.Class<?> wildcardClass15 = classEmitter13.getClass();
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test19523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19523");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        int int4 = type3.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray7);
        int int9 = type5.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type11, type14, type15, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type3, typeArray18);
        java.lang.String str21 = type3.getInternalName();
        int int23 = type3.getOpcode(155);
        java.lang.String str24 = type3.getClassName();
        java.lang.String str25 = type3.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter26.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassInfo classInfo36 = classEmitter34.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo37 = classEmitter34.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter34);
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter38.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classAdapter40);
        boolean boolean42 = type3.equals((java.lang.Object) classEmitter30);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(C)C" + "'", str8, "(C)C");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "I" + "'", str16, "I");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str19, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java/lang/Object" + "'", str21, "java/lang/Object");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 159 + "'", int23 == 159);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.Object" + "'", str24, "java.lang.Object");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Ljava/lang/Object;" + "'", str25, "Ljava/lang/Object;");
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo36);
        org.junit.Assert.assertNull(classInfo37);
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test19524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19524");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray5);
        int int7 = type3.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str14 = type13.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type9, type12, type13, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray16);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("float", type1, typeArray16);
        java.lang.String str20 = signature19.getDescriptor();
        java.lang.String str21 = signature19.getName();
        org.mockito.asm.Type type22 = signature19.getReturnType();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)I");
        boolean boolean25 = type22.equals((java.lang.Object) type24);
        int int27 = type24.getOpcode(101);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray33);
        int int35 = type31.getSize();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type37, type40, type41, type43 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray44);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("float", type29, typeArray44);
        org.mockito.asm.Type[] typeArray48 = signature47.getArgumentTypes();
        java.lang.String str49 = signature47.getDescriptor();
        java.lang.String str50 = signature47.toString();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type54 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray55);
        int int57 = type53.getSize();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj60 = new java.lang.Object();
        java.lang.Class<?> wildcardClass61 = obj60.getClass();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass61);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str64 = type63.toString();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type59, type62, type63, type65 };
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray66);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("hi!", type52, typeArray66);
        java.lang.String str69 = signature68.getName();
        org.mockito.asm.Type type70 = signature68.getReturnType();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)D");
        java.lang.String str73 = type72.getInternalName();
        int int74 = type72.getSize();
        boolean boolean75 = signature68.equals((java.lang.Object) int74);
        org.mockito.asm.Type type76 = signature68.getReturnType();
        java.lang.String str77 = signature68.getName();
        java.lang.String str78 = signature68.toString();
        java.lang.String str79 = signature68.toString();
        org.mockito.asm.Type[] typeArray80 = signature68.getArgumentTypes();
        boolean boolean81 = signature47.equals((java.lang.Object) typeArray80);
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray80);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(C)C" + "'", str6, "(C)C");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "I" + "'", str14, "I");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str17, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(ILjava/lang/Object;IF)D" + "'", str18, "(ILjava/lang/Object;IF)D");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(ILjava/lang/Object;IF)I" + "'", str20, "(ILjava/lang/Object;IF)I");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "float" + "'", str21, "float");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 105 + "'", int27 == 105);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(C)C" + "'", str34, "(C)C");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "I" + "'", str42, "I");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str45, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(ILjava/lang/Object;IF)D" + "'", str46, "(ILjava/lang/Object;IF)D");
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(ILjava/lang/Object;IF)I" + "'", str49, "(ILjava/lang/Object;IF)I");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "float(ILjava/lang/Object;IF)I" + "'", str50, "float(ILjava/lang/Object;IF)I");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(C)C" + "'", str56, "(C)C");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "I" + "'", str64, "I");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str67, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "ILjava/lang/Object" + "'", str73, "ILjava/lang/Object");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str78, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str79, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "(ILjava/lang/Object;IF)LILjava/lang/Object;" + "'", str82, "(ILjava/lang/Object;IF)LILjava/lang/Object;");
    }

    @Test
    public void test19525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19525");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.asm.ClassVisitor classVisitor31 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter(classVisitor31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classAdapter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter32.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassEmitter classEmitter48 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter48);
        org.mockito.cglib.core.ClassInfo classInfo50 = classEmitter48.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter51);
        org.mockito.cglib.core.ClassInfo classInfo53 = classEmitter51.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter54 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter51);
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classAdapter54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type59 };
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray60);
        int int62 = type58.getSize();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass66);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str69 = type68.toString();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type64, type67, type68, type70 };
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray71);
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("hi!", type57, typeArray71);
        java.lang.String str74 = signature73.getName();
        org.mockito.asm.Type type75 = signature73.getReturnType();
        java.lang.String str76 = signature73.getDescriptor();
        org.mockito.asm.ClassVisitor classVisitor77 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter78 = new org.mockito.cglib.core.ClassEmitter(classVisitor77);
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter80 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter79);
        classEmitter78.setTarget((org.mockito.asm.ClassVisitor) classAdapter80);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter80);
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter80);
        boolean boolean84 = signature73.equals((java.lang.Object) classAdapter80);
        classEmitter48.setTarget((org.mockito.asm.ClassVisitor) classAdapter80);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classAdapter80);
        java.lang.String[] strArray97 = new java.lang.String[] { "B", "void(ILjava.lang.Object;IF)LILjava/lang/Object;", "org/mockito/asm/Type(ILjava/lang/Object;IF)LILjava/lang/Object;", "B(FFLjava.lang.Object;)LILjava/lang/Object;", "C", "LLILjava/lang/Object;;org.mockito.asm.Type(ILjava/lang/Object;IF)Ljava/lang/Object;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor98 = classEmitter29.visitMethod(7, "L(ILjava/lang/Object;IF)Lorg/mockito/asm/Type;;", "Lorg.mockito.cglib.core.ClassEmitter;", "(ILjava/lang/Object;IF)Lmockito/cglib/core/ClassEmitter;", strArray97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'L(ILjava/lang/Object;IF)Lorg/mockito/asm/Type;;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(C)C" + "'", str5, "(C)C");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str16, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str18, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str19, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo50);
        org.junit.Assert.assertNull(classInfo53);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(C)C" + "'", str61, "(C)C");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "I" + "'", str69, "I");
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str72, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str76, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strArray97);
    }

    @Test
    public void test19526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19526");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("F");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray18);
        int int20 = type16.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type22, type25, type26, type28 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray29);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("float", type14, typeArray29);
        org.mockito.asm.Type[] typeArray33 = signature32.getArgumentTypes();
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor35 = classEmitter4.visitField(159, "(ILjava/lang/Object;IF)LI;", "(FFLjava/lang/Object;)V", "(FFLjava/lang/Object;)L(ILjava.lang.Object;IF)Lrg.mockito.asm.Type(ILjava/lang/Object;;", (java.lang.Object) str34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(C)C" + "'", str19, "(C)C");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "I" + "'", str27, "I");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str30, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(ILjava/lang/Object;IF)D" + "'", str31, "(ILjava/lang/Object;IF)D");
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(ILjava/lang/Object;IF)LF;" + "'", str34, "(ILjava/lang/Object;IF)LF;");
    }

    @Test
    public void test19527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19527");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = classEmitter8.visitAnnotation("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19528");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter(classVisitor24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classAdapter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter27);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classAdapter27);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassInfo classInfo33 = classEmitter5.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor34 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter(classVisitor34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classAdapter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter35);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter40 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer41 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter40);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer41);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter44 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassInfo classInfo45 = classEmitter43.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter47.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter47);
        interceptFieldTransformer41.setTarget((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter53 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter52.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.asm.ClassVisitor classVisitor59 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter60 = new org.mockito.cglib.core.ClassEmitter(classVisitor59);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter62 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter60.setTarget((org.mockito.asm.ClassVisitor) classAdapter62);
        org.mockito.cglib.core.ClassEmitter classEmitter64 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter60);
        org.mockito.asm.ClassAdapter classAdapter65 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.asm.ClassAdapter classAdapter66 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter64);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter66);
        classEmitter57.setTarget((org.mockito.asm.ClassVisitor) classAdapter66);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter71 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.asm.ClassVisitor classVisitor72 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter73 = new org.mockito.cglib.core.ClassEmitter(classVisitor72);
        org.mockito.cglib.core.ClassEmitter classEmitter74 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter75 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter74);
        classEmitter73.setTarget((org.mockito.asm.ClassVisitor) classAdapter75);
        org.mockito.cglib.core.ClassInfo classInfo77 = classEmitter73.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter78 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter73);
        org.mockito.cglib.core.ClassInfo classInfo79 = classEmitter73.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter80 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter73);
        classEmitter70.setTarget((org.mockito.asm.ClassVisitor) classAdapter80);
        org.mockito.cglib.core.ClassEmitter classEmitter82 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter70);
        classEmitter49.setTarget((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassEmitter classEmitter85 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter85);
        java.lang.Class<?> wildcardClass87 = classEmitter85.getClass();
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo33);
        org.junit.Assert.assertNull(classInfo45);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo77);
        org.junit.Assert.assertNull(classInfo79);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test19529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19529");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean24 = signature17.equals((java.lang.Object) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter20.getClassInfo();
        java.lang.String[] strArray35 = new java.lang.String[] { "float", "voidV(ILjava/lang/Object;IF)B", "Lorg.mockito.asm.Type(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;;", "V(ILjava/lang/Object;IF)Ljava/lang/Object;", "Lmockito/asm/Type;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor36 = classEmitter20.visitMethod(162, "(ILjava/lang/Object;IF)Z", "org.mockito.cglib.core.Signature", "intvoid", strArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(ILjava/lang/Object;IF)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(C)C" + "'", str5, "(C)C");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str16, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str18, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str19, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test19530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19530");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type3 = type2.getElementType();
        org.mockito.asm.Type type4 = type2.getElementType();
        java.lang.Class<?> wildcardClass5 = type2.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type[] typeArray9 = org.mockito.asm.Type.getArgumentTypes("(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)I;");
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("Lbyte;", type7, typeArray9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter(classVisitor17);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        boolean boolean24 = signature10.equals((java.lang.Object) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo25 = classEmitter16.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter26 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer27 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter26);
        org.mockito.cglib.core.ClassInfo classInfo28 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = interceptFieldTransformer27.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer27);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter16.setTarget((org.mockito.asm.ClassVisitor) classEmitter30);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter16.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(classInfo25);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
    }

    @Test
    public void test19531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19531");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        int int6 = type5.getSort();
        org.mockito.asm.Type type7 = type5.getElementType();
        org.mockito.asm.Type type8 = type5.getElementType();
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray14);
        int int16 = type12.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type18, type21, type22, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray25);
        java.lang.String str28 = signature27.getName();
        org.mockito.asm.Type type29 = signature27.getReturnType();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)D");
        java.lang.String str32 = type31.getInternalName();
        int int33 = type31.getSize();
        boolean boolean34 = signature27.equals((java.lang.Object) int33);
        java.lang.String str35 = signature27.toString();
        org.mockito.asm.Type[] typeArray36 = signature27.getArgumentTypes();
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray36);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java/lang/Object" + "'", str3, "java/lang/Object");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "va.lang.Object" + "'", str9, "va.lang.Object");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(C)C" + "'", str15, "(C)C");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "I" + "'", str23, "I");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str26, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ILjava/lang/Object" + "'", str32, "ILjava/lang/Object");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str35, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(ILjava/lang/Object;IF)Lva/lang/Object;" + "'", str37, "(ILjava/lang/Object;IF)Lva/lang/Object;");
    }

    @Test
    public void test19532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19532");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter17);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter17.visitInnerClass("ILjava/lang/Objectlong(ILjava/lang/Object;IF)Lorg/mockito/asm/Type;", "voidg.mockito.cglib.core.ClassEmitter", "Lorg/mockito/asm/Type;(ILjava/lang/Object;IF)C", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test19533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19533");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassInfo classInfo21 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter(classVisitor23);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classAdapter26);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter26);
        org.mockito.asm.ClassAdapter classAdapter29 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter26);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classAdapter26);
        classEmitter14.setTarget((org.mockito.asm.ClassVisitor) classAdapter26);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter26);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter32.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo21);
    }

    @Test
    public void test19534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19534");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Lorg/mockito/asm/Type;");
        int int2 = type1.getSort();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter4 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter9 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer10 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = interceptFieldTransformer10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer10);
        org.mockito.asm.ClassVisitor classVisitor14 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter(classVisitor14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter16.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        interceptFieldTransformer10.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer10);
        org.mockito.cglib.core.ClassInfo classInfo23 = interceptFieldTransformer10.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) interceptFieldTransformer10);
        boolean boolean25 = type1.equals((java.lang.Object) interceptFieldTransformer10);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("B", "(ILjava/lang/Object;IF)C");
        org.mockito.asm.Type type30 = signature29.getReturnType();
        org.mockito.asm.Type[] typeArray31 = signature29.getArgumentTypes();
        org.mockito.asm.Type[] typeArray32 = signature29.getArgumentTypes();
        java.lang.String str33 = signature29.getDescriptor();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("(FFLjava/lang/Object;)LILjava/lang/Object;");
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        int int40 = type39.getSort();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray43);
        int int45 = type41.getSize();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str52 = type51.toString();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type47, type50, type51, type53 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type39, typeArray54);
        org.mockito.asm.Type[] typeArray57 = signature56.getArgumentTypes();
        org.mockito.asm.Type[] typeArray58 = signature56.getArgumentTypes();
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray58);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter60 = interceptFieldTransformer10.begin_method((int) ' ', signature29, typeArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.transform.impl.InterceptFieldTransformer@125451d0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str33, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(C)C" + "'", str44, "(C)C");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "I" + "'", str52, "I");
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str55, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)LILjava/lang/Object;;" + "'", str59, "(ILjava/lang/Object;IF)L(FFLjava/lang/Object;)LILjava/lang/Object;;");
    }

    @Test
    public void test19535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19535");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter5.visitMethod(144, "voidV", "LILjava/lang/Object", "LF;", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@51e9afbb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test19536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19536");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        interceptFieldTransformer7.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        java.lang.String[] strArray27 = new java.lang.String[] { "va/lang/Object", "LvoidV;" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter18.visit(15, 14, "L(ILjava/lang/Object;IF)LB;;", "mockito/asm/Type", "org/mockito/cglib/core/Signature(ILjava/lang/Object;IF)I", strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test19537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19537");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean24 = signature17.equals((java.lang.Object) classEmitter20);
        boolean boolean26 = signature17.equals((java.lang.Object) 104);
        org.mockito.asm.Type[] typeArray27 = signature17.getArgumentTypes();
        java.lang.String str28 = signature17.toString();
        org.mockito.asm.Type[] typeArray29 = signature17.getArgumentTypes();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray32);
        int int34 = type30.getSize();
        int int35 = type30.getSort();
        java.lang.Class<?> wildcardClass36 = type30.getClass();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass36);
        boolean boolean38 = signature17.equals((java.lang.Object) type37);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(C)C" + "'", str5, "(C)C");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str16, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str18, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str19, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str28, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(C)C" + "'", str33, "(C)C");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test19538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19538");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter13.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassVisitor classVisitor17 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter(classVisitor17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassAdapter classAdapter24 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visitSource("va.lang.Object", "Lva/lang/Object;(ILjava/lang/Object;IF)L(FFLjava/lang/Object;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo20);
    }

    @Test
    public void test19539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19539");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classAdapter6);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classAdapter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassAdapter classAdapter15 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter13);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter17 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2c44a52c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test19540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19540");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        java.lang.String str7 = type6.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray11);
        int int13 = type9.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type15, type18, type19, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray22);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("V", type6, typeArray22);
        boolean boolean27 = signature25.equals((java.lang.Object) 99);
        org.mockito.asm.Type type28 = signature25.getReturnType();
        java.lang.String str29 = signature25.getDescriptor();
        java.lang.String str30 = signature25.getName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray35);
        int int37 = type33.getSize();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str44 = type43.toString();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type39, type42, type43, type45 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray46);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray46);
        java.lang.String str49 = signature48.getDescriptor();
        java.lang.String str50 = signature48.getDescriptor();
        java.lang.String str51 = signature48.getDescriptor();
        java.lang.String str52 = signature48.getDescriptor();
        boolean boolean53 = signature25.equals((java.lang.Object) str52);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ljava/lang/Object;" + "'", str4, "Ljava/lang/Object;");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java/lang/Object" + "'", str5, "java/lang/Object");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ljava/lang/Object;" + "'", str7, "Ljava/lang/Object;");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(C)C" + "'", str12, "(C)C");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "I" + "'", str20, "I");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str23, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(ILjava/lang/Object;IF)D" + "'", str24, "(ILjava/lang/Object;IF)D");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(ILjava/lang/Object;IF)Ljava/lang/Object;" + "'", str29, "(ILjava/lang/Object;IF)Ljava/lang/Object;");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "V" + "'", str30, "V");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(C)C" + "'", str36, "(C)C");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "I" + "'", str44, "I");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str47, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str49, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str50, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str51, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str52, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test19541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19541");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getName();
        org.mockito.asm.Type type19 = signature17.getReturnType();
        java.lang.String str20 = signature17.getDescriptor();
        java.lang.String str21 = signature17.toString();
        java.lang.String str22 = signature17.getName();
        java.lang.String str23 = signature17.toString();
        java.lang.String str24 = signature17.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.asm.ClassVisitor classVisitor27 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter(classVisitor27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classAdapter30);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.asm.ClassAdapter classAdapter33 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.asm.ClassAdapter classAdapter36 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter38 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassInfo classInfo39 = classEmitter37.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter37.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter41 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.asm.ClassAdapter classAdapter45 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter46 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer47 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter46);
        org.mockito.cglib.core.ClassInfo classInfo48 = interceptFieldTransformer47.getClassInfo();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer47);
        org.mockito.asm.ClassAdapter classAdapter50 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter43);
        boolean boolean51 = signature17.equals((java.lang.Object) classEmitter43);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type55 };
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray56);
        int int58 = type54.getSize();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass62);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str65 = type64.toString();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type60, type63, type64, type66 };
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray67);
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("hi!", type53, typeArray67);
        java.lang.String str70 = signature69.getDescriptor();
        java.lang.String str71 = signature69.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter72 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter73 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.cglib.core.ClassInfo classInfo74 = classEmitter72.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter75 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter72);
        boolean boolean76 = signature69.equals((java.lang.Object) classEmitter72);
        org.mockito.asm.ClassAdapter classAdapter77 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.cglib.core.ClassInfo classInfo78 = classEmitter72.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.asm.ClassAdapter classAdapter80 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter72);
        org.mockito.cglib.core.ClassInfo classInfo81 = classEmitter72.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo82 = classEmitter72.getClassInfo();
        classEmitter43.setTarget((org.mockito.asm.ClassVisitor) classEmitter72);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type84 = classEmitter43.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(C)C" + "'", str5, "(C)C");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str16, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str20, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str21, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str23, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(classInfo39);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(C)C" + "'", str57, "(C)C");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "I" + "'", str65, "I");
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str68, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str70, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str71, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNull(classInfo74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(classInfo78);
        org.junit.Assert.assertNull(classInfo81);
        org.junit.Assert.assertNull(classInfo82);
    }

    @Test
    public void test19542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19542");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean24 = signature17.equals((java.lang.Object) classEmitter20);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        classEmitter20.setTarget(classVisitor25);
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        java.lang.String[] strArray37 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            classEmitter31.visit(155, 135, "Lorg/mockito/cglib/core/Signature;", "g/mockito/cglib/core/ClassEmitter", "LLbyte;", strArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(C)C" + "'", str5, "(C)C");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str16, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str18, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str19, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo30);
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test19543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19543");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray23);
        int int25 = type21.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type27, type30, type31, type33 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray34);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type38 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray39);
        int int41 = type37.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass45);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str48 = type47.toString();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type43, type46, type47, type49 };
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray50);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray50);
        int int54 = type20.getOpcode(96);
        boolean boolean55 = signature17.equals((java.lang.Object) int54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getReturnType("V(ILjava/lang/Object;IF)Ljava/lang/Object;");
        boolean boolean58 = signature17.equals((java.lang.Object) "V(ILjava/lang/Object;IF)Ljava/lang/Object;");
        org.mockito.asm.Type[] typeArray59 = signature17.getArgumentTypes();
        org.mockito.asm.Type type60 = signature17.getReturnType();
        java.lang.String str61 = signature17.getDescriptor();
        java.lang.String str62 = signature17.toString();
        org.mockito.asm.Type[] typeArray63 = signature17.getArgumentTypes();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(C)C" + "'", str5, "(C)C");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str16, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str18, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str19, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(C)C" + "'", str24, "(C)C");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "I" + "'", str32, "I");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str35, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(ILjava/lang/Object;IF)D" + "'", str36, "(ILjava/lang/Object;IF)D");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(C)C" + "'", str40, "(C)C");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "I" + "'", str48, "I");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str51, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(ILjava/lang/Object;IF)D" + "'", str52, "(ILjava/lang/Object;IF)D");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 99 + "'", int54 == 99);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str61, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str62, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(typeArray63);
    }

    @Test
    public void test19544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19544");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        org.mockito.cglib.core.ClassInfo classInfo13 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter12.getClassInfo();
        classEmitter9.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.Type type19 = null;
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray31);
        int int33 = type29.getSize();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str40 = type39.toString();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type35, type38, type39, type41 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray42);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("V", type26, typeArray42);
        java.lang.String str46 = type26.getInternalName();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.declare_field((int) ' ', "Lorg/mockito/asm/TypeLbyte;(FFLjava/lang/Object;)I;", type19, (java.lang.Object) str46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo13);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Ljava/lang/Object;" + "'", str24, "Ljava/lang/Object;");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java/lang/Object" + "'", str25, "java/lang/Object");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Ljava/lang/Object;" + "'", str27, "Ljava/lang/Object;");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(C)C" + "'", str32, "(C)C");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "I" + "'", str40, "I");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str43, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(ILjava/lang/Object;IF)D" + "'", str44, "(ILjava/lang/Object;IF)D");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java/lang/Object" + "'", str46, "java/lang/Object");
    }

    @Test
    public void test19545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19545");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassAdapter classAdapter6 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        java.lang.String[] strArray27 = new java.lang.String[] { "L(FFLjava.lang.Object;)I;", "L(ILjava/lang/Object;IF)B;", "(FFLjava.lang.Object;)C", "Ljava/lang/Object;(ILjava/lang/Object;IF)C", "(ILjava.lang.Object" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter16.visit(0, 0, "", "Lorg/mockito/asm/ClassAdapter;(ILjava/lang/Object;IF)Ljava/lang/Object;", "Lorg/mockito/cglib/core/Signature;(ILjava/lang/Object;IF)Lva/lang/Object;", strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test19546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19546");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.asm.ClassAdapter classAdapter17 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter14);
        // The following exception was thrown during execution in test generation
        try {
            classAdapter17.visitOuterClass("LLorg/mockito/asm/ClassAdapter;(ILjava/lang/Object;IF)Ljava/lang/Object;;", "(ILjava/lang/Object;IF)Lorg/mockito/asm/Type;", "Ljava/lang/Object;(ILjava/lang/Object;IF)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test19547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19547");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter5 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer6 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter5);
        org.mockito.cglib.core.ClassInfo classInfo7 = interceptFieldTransformer6.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo8 = interceptFieldTransformer6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer6);
        org.mockito.asm.ClassVisitor classVisitor10 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        interceptFieldTransformer6.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray23);
        int int25 = type21.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str32 = type31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type27, type30, type31, type33 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray34);
        java.lang.String str37 = signature36.getDescriptor();
        java.lang.String str38 = signature36.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter40 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter39);
        boolean boolean41 = signature36.equals((java.lang.Object) classAdapter40);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter40);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter42.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor44 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter(classVisitor44);
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter47 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter46);
        classEmitter45.setTarget((org.mockito.asm.ClassVisitor) classAdapter47);
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter49);
        org.mockito.cglib.core.ClassEmitter classEmitter51 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter50);
        org.mockito.asm.ClassAdapter classAdapter52 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter51);
        classEmitter42.setTarget((org.mockito.asm.ClassVisitor) classAdapter52);
        org.mockito.cglib.core.ClassEmitter classEmitter54 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter54);
        org.mockito.cglib.core.ClassInfo classInfo56 = classEmitter54.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type57 = classEmitter54.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(C)C" + "'", str24, "(C)C");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "I" + "'", str32, "I");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str35, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str37, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str38, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo56);
    }

    @Test
    public void test19548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19548");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("LLbyte;(FFLjava/lang/Object;)I;");
        java.lang.String str2 = type1.getDescriptor();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLbyte;" + "'", str2, "LLbyte;");
    }

    @Test
    public void test19549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19549");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        java.lang.String str20 = signature17.toString();
        java.lang.String str21 = signature17.toString();
        org.mockito.asm.Type type22 = signature17.getReturnType();
        org.mockito.asm.Type[] typeArray23 = signature17.getArgumentTypes();
        org.mockito.asm.Type type24 = signature17.getReturnType();
        java.lang.String str25 = signature17.toString();
        java.lang.String str26 = signature17.toString();
        java.lang.String str27 = signature17.getName();
        java.lang.String str28 = signature17.getName();
        java.lang.String str29 = signature17.getDescriptor();
        java.lang.String str30 = signature17.getDescriptor();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(C)C" + "'", str5, "(C)C");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str16, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str18, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str19, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str20, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str21, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str25, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!(ILjava/lang/Object;IF)B" + "'", str26, "hi!(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str29, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str30, "(ILjava/lang/Object;IF)B");
    }

    @Test
    public void test19550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19550");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        interceptFieldTransformer7.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        interceptFieldTransformer7.setTarget(classVisitor16);
        org.mockito.cglib.core.ClassInfo classInfo18 = interceptFieldTransformer7.getClassInfo();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getReturnType("(ILjava/lang/Object;IF)Lva/lang/Object;");
        org.mockito.asm.Type[] typeArray25 = org.mockito.asm.Type.getArgumentTypes("byte(ILjava/lang/Object;IF)B");
        // The following exception was thrown during execution in test generation
        try {
            interceptFieldTransformer7.begin_class(165, 162, "(ILjava/lang/Object;IF)Lva/lang/Object;", type23, typeArray25, "org/mockito/asm/TypeL(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray25);
    }

    @Test
    public void test19551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19551");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = type2.getElementType();
        int int5 = type3.getOpcode(128);
        org.mockito.asm.Type type6 = type3.getElementType();
        java.lang.String str7 = type3.getInternalName();
        int int8 = type3.getSize();
        org.mockito.asm.Type type9 = type3.getElementType();
        java.lang.String str10 = type3.getDescriptor();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 132 + "'", int5 == 132);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "va/lang/Object" + "'", str7, "va/lang/Object");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lva/lang/Object;" + "'", str10, "Lva/lang/Object;");
    }

    @Test
    public void test19552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19552");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)D");
        java.lang.String str2 = type1.getInternalName();
        int int3 = type1.getDimensions();
        java.lang.String str4 = type1.getInternalName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray11);
        int int13 = type9.getSize();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type15, type18, type19, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray22);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("float", type7, typeArray22);
        java.lang.String str26 = type7.getDescriptor();
        int int28 = type7.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray33);
        int int35 = type31.getSize();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type37, type40, type41, type43 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type30, typeArray44);
        java.lang.String str47 = signature46.getDescriptor();
        java.lang.String str48 = signature46.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter49 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter50 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter49);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter49.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter49);
        boolean boolean53 = signature46.equals((java.lang.Object) classEmitter49);
        org.mockito.asm.Type[] typeArray55 = org.mockito.asm.Type.getArgumentTypes("(FFLjava/lang/Object;)I");
        boolean boolean56 = signature46.equals((java.lang.Object) typeArray55);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("Lbyte;", type7, typeArray55);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type62 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray63);
        int int65 = type61.getSize();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj68 = new java.lang.Object();
        java.lang.Class<?> wildcardClass69 = obj68.getClass();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass69);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str72 = type71.toString();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray74 = new org.mockito.asm.Type[] { type67, type70, type71, type73 };
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray74);
        java.lang.String str76 = org.mockito.asm.Type.getMethodDescriptor(type60, typeArray74);
        org.mockito.cglib.core.Signature signature77 = new org.mockito.cglib.core.Signature("float", type59, typeArray74);
        java.lang.String str78 = type59.getDescriptor();
        int int80 = type59.getOpcode((int) (byte) -1);
        boolean boolean81 = signature57.equals((java.lang.Object) int80);
        org.mockito.asm.Type[] typeArray82 = signature57.getArgumentTypes();
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray82);
        java.lang.String str84 = type1.getClassName();
        int int85 = type1.getSort();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ILjava/lang/Object" + "'", str2, "ILjava/lang/Object");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ILjava/lang/Object" + "'", str4, "ILjava/lang/Object");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(C)C" + "'", str12, "(C)C");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "I" + "'", str20, "I");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str23, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(ILjava/lang/Object;IF)D" + "'", str24, "(ILjava/lang/Object;IF)D");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "I" + "'", str26, "I");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(C)C" + "'", str34, "(C)C");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "I" + "'", str42, "I");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str45, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str47, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str48, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(C)C" + "'", str64, "(C)C");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "I" + "'", str72, "I");
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str75, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "(ILjava/lang/Object;IF)D" + "'", str76, "(ILjava/lang/Object;IF)D");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "I" + "'", str78, "I");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "(FFLjava/lang/Object;)LILjava/lang/Object;" + "'", str83, "(FFLjava/lang/Object;)LILjava/lang/Object;");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "ILjava.lang.Object" + "'", str84, "ILjava.lang.Object");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10 + "'", int85 == 10);
    }

    @Test
    public void test19553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19553");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean24 = signature17.equals((java.lang.Object) classEmitter20);
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.asm.ClassVisitor classVisitor26 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter(classVisitor26);
        org.mockito.cglib.core.ClassInfo classInfo28 = classEmitter27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter27.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo30 = classEmitter27.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter32 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classAdapter32);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classAdapter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter32);
        org.mockito.asm.ClassVisitor classVisitor36 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter(classVisitor36);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter38);
        classEmitter37.setTarget((org.mockito.asm.ClassVisitor) classAdapter39);
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter39);
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter39);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter39);
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classAdapter39);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(C)C" + "'", str5, "(C)C");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str16, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str18, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str19, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(classInfo28);
        org.junit.Assert.assertNull(classInfo29);
        org.junit.Assert.assertNull(classInfo30);
    }

    @Test
    public void test19554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19554");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter12.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter21);
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
    }

    @Test
    public void test19555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19555");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter5 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classAdapter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter9 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter12.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter16 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.ClassAdapter classAdapter20 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter22 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassInfo classInfo23 = classEmitter21.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter26);
        org.mockito.asm.ClassVisitor classVisitor28 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter(classVisitor28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter30);
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classAdapter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.asm.ClassAdapter classAdapter35 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter35);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classAdapter35);
        org.mockito.cglib.core.ClassEmitter classEmitter38 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter39 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter38.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter41 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter38);
        org.mockito.cglib.core.ClassEmitter classEmitter42 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter41);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter42.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter44 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter42);
        org.mockito.asm.ClassVisitor classVisitor45 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter46 = new org.mockito.cglib.core.ClassEmitter(classVisitor45);
        org.mockito.cglib.core.ClassEmitter classEmitter47 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter48 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter47);
        classEmitter46.setTarget((org.mockito.asm.ClassVisitor) classAdapter48);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter48);
        org.mockito.asm.ClassAdapter classAdapter51 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter48);
        classEmitter44.setTarget((org.mockito.asm.ClassVisitor) classAdapter48);
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter44);
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type59 };
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray60);
        int int62 = type58.getSize();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass66);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str69 = type68.toString();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type64, type67, type68, type70 };
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray71);
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("hi!", type57, typeArray71);
        java.lang.String str74 = signature73.getDescriptor();
        java.lang.String str75 = signature73.getDescriptor();
        org.mockito.cglib.core.ClassEmitter classEmitter76 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter77 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassInfo classInfo78 = classEmitter76.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter79 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        boolean boolean80 = signature73.equals((java.lang.Object) classEmitter76);
        org.mockito.asm.ClassAdapter classAdapter81 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassInfo classInfo82 = classEmitter76.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter83 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        org.mockito.cglib.core.ClassEmitter classEmitter84 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter76);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter84);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitSource("LF;", "V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo23);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(C)C" + "'", str61, "(C)C");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "I" + "'", str69, "I");
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str72, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str74, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str75, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNull(classInfo78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(classInfo82);
    }

    @Test
    public void test19556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19556");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("ILjava/lang/Object");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.toString();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I" + "'", str4, "I");
    }

    @Test
    public void test19557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19557");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray4);
        int int6 = type2.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type8, type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray15);
        java.lang.String str18 = signature17.getDescriptor();
        java.lang.String str19 = signature17.getDescriptor();
        org.mockito.asm.Type[] typeArray20 = signature17.getArgumentTypes();
        org.mockito.asm.Type type21 = signature17.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        boolean boolean23 = signature17.equals((java.lang.Object) type22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter25 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter24.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        boolean boolean30 = signature17.equals((java.lang.Object) classEmitter29);
        org.mockito.asm.ClassVisitor classVisitor31 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter(classVisitor31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classAdapter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter37 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer38 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter37);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer38);
        org.mockito.cglib.core.ClassInfo classInfo40 = classEmitter32.getClassInfo();
        classEmitter29.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.asm.ClassAdapter classAdapter42 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassInfo classInfo43 = classEmitter29.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo44 = classEmitter29.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter29.visitInnerClass("", "(FFLjava.lang.Object;)I", "Cfloat(ILjava/lang/Object;IF)I", 51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(C)C" + "'", str5, "(C)C");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str16, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str18, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(ILjava/lang/Object;IF)B" + "'", str19, "(ILjava/lang/Object;IF)B");
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(classInfo26);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(classInfo40);
        org.junit.Assert.assertNull(classInfo43);
        org.junit.Assert.assertNull(classInfo44);
    }

    @Test
    public void test19558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19558");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter1 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter10 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter9);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classAdapter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassAdapter classAdapter13 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter14);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassInfo classInfo24 = classEmitter22.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter26 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter25.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter28 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classAdapter28);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassVisitor classVisitor31 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter(classVisitor31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter34 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classAdapter34);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter34);
        org.mockito.asm.ClassAdapter classAdapter37 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter34);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classAdapter37);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitOuterClass("Lbyte;", "L/lang/Object;", "LLorg/mockito/asm/ClassAdapter;(ILjava/lang/Object;IF)Ljava/lang/Object;;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo27);
    }

    @Test
    public void test19559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19559");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter3 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter2);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classAdapter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter6 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer7 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter6);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer7);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter12 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classAdapter12);
        org.mockito.asm.ClassAdapter classAdapter14 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        interceptFieldTransformer7.setTarget((org.mockito.asm.ClassVisitor) classAdapter14);
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter18 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.asm.ClassVisitor classVisitor24 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter(classVisitor24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter27 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter25.setTarget((org.mockito.asm.ClassVisitor) classAdapter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.asm.ClassAdapter classAdapter30 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.asm.ClassAdapter classAdapter31 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter31);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classAdapter31);
        org.mockito.cglib.core.ClassEmitter classEmitter34 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classAdapter31);
        org.mockito.asm.ClassVisitor classVisitor35 = null;
        classEmitter34.setTarget(classVisitor35);
        interceptFieldTransformer7.setTarget(classVisitor35);
        java.lang.String[] strArray46 = new java.lang.String[] { "(C)C", "LLI;;", "LLI;;", "B(ILjava/lang/Object;IF)C" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor47 = interceptFieldTransformer7.visitMethod(175, "Long(ILjava/lang/Object;", "Lorg/mockito/cglib/transform/impl/InterceptFieldTransformer;Lbyte;byte", "LFFLjava.lang.Object;", strArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name 'Long(ILjava/lang/Object;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNotNull(strArray46);
    }

    @Test
    public void test19560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19560");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type1, type2, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.String str8 = type0.getClassName();
        java.lang.String str9 = type0.getClassName();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        classEmitter14.setTarget(classVisitor15);
        boolean boolean17 = type0.equals((java.lang.Object) classEmitter14);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter14.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter14.visitOuterClass("C", "Ljava/lang/Object;B", "(ILjava/lang/Object;IF)Lg.mockito.cglib.core.ClassEmitter;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(FFLjava/lang/Object;)I" + "'", str7, "(FFLjava/lang/Object;)I");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "int" + "'", str8, "int");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "int" + "'", str9, "int");
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(classInfo18);
    }

    @Test
    public void test19561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19561");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type1, type2, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.String str8 = type0.getClassName();
        java.lang.String str9 = type0.getClassName();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter11 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        classEmitter14.setTarget(classVisitor15);
        boolean boolean17 = type0.equals((java.lang.Object) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type28 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray29);
        int int31 = type27.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type33, type36, type37, type39 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray40);
        java.lang.String str44 = type19.getClassName();
        org.mockito.cglib.core.ClassEmitter classEmitter45 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter46 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassInfo classInfo47 = classEmitter45.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo48 = classEmitter45.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter49 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassEmitter classEmitter50 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter45);
        org.mockito.cglib.core.ClassInfo classInfo51 = classEmitter50.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter52 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter53 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassInfo classInfo54 = classEmitter52.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter55 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter52);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter55);
        org.mockito.cglib.core.ClassEmitter classEmitter57 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter58 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassInfo classInfo59 = classEmitter57.getClassInfo();
        classEmitter50.setTarget((org.mockito.asm.ClassVisitor) classEmitter57);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter57);
        boolean boolean62 = type19.equals((java.lang.Object) classEmitter61);
        org.mockito.asm.ClassAdapter classAdapter63 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter61);
        classEmitter18.setTarget((org.mockito.asm.ClassVisitor) classAdapter63);
        org.mockito.cglib.core.ClassEmitter classEmitter65 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter65.visitInnerClass("java/lang/Object", "Lorg/mockito/asm/TypeLbyte;(FFLjava/lang/Object;)I;", "L(ILjava/lang/Object;IF)Lg/mockito/cglib/core/ClassEmitter;;", 54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(FFLjava/lang/Object;)I" + "'", str7, "(FFLjava/lang/Object;)I");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "int" + "'", str8, "int");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "int" + "'", str9, "int");
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(C)C" + "'", str22, "(C)C");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(C)C" + "'", str26, "(C)C");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(C)C" + "'", str30, "(C)C");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "I" + "'", str38, "I");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str41, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str42, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str43, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "char" + "'", str44, "char");
        org.junit.Assert.assertNull(classInfo47);
        org.junit.Assert.assertNull(classInfo48);
        org.junit.Assert.assertNull(classInfo51);
        org.junit.Assert.assertNull(classInfo54);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test19562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19562");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        classEmitter4.setTarget(classVisitor5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter8 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        org.mockito.cglib.transform.impl.InterceptFieldFilter interceptFieldFilter13 = null;
        org.mockito.cglib.transform.impl.InterceptFieldTransformer interceptFieldTransformer14 = new org.mockito.cglib.transform.impl.InterceptFieldTransformer(interceptFieldFilter13);
        org.mockito.cglib.core.ClassInfo classInfo15 = interceptFieldTransformer14.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo16 = interceptFieldTransformer14.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        org.mockito.asm.ClassVisitor classVisitor18 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter(classVisitor18);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter21 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        interceptFieldTransformer14.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        org.mockito.cglib.core.ClassInfo classInfo27 = interceptFieldTransformer14.getClassInfo();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) interceptFieldTransformer14);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray33);
        int int35 = type31.getSize();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getReturnType("(FFLjava/lang/Object;)I");
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type37, type40, type41, type43 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray44);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray44);
        java.lang.String str48 = type29.getClassName();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType("(ILjava/lang/Object;IF)I");
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = type50.getElementType();
        java.lang.String str53 = type50.getInternalName();
        org.mockito.asm.Type type54 = type50.getElementType();
        boolean boolean55 = type29.equals((java.lang.Object) type54);
        org.mockito.cglib.core.ClassEmitter classEmitter56 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter57 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassInfo classInfo58 = classEmitter56.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo59 = classEmitter56.getClassInfo();
        org.mockito.asm.ClassAdapter classAdapter60 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter61 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        boolean boolean62 = type54.equals((java.lang.Object) classEmitter56);
        org.mockito.cglib.core.ClassEmitter classEmitter63 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter56);
        org.mockito.cglib.core.ClassInfo classInfo64 = classEmitter56.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor65 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter66 = new org.mockito.cglib.core.ClassEmitter(classVisitor65);
        org.mockito.cglib.core.ClassEmitter classEmitter67 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassAdapter classAdapter68 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter67);
        classEmitter66.setTarget((org.mockito.asm.ClassVisitor) classAdapter68);
        org.mockito.cglib.core.ClassEmitter classEmitter70 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter66);
        org.mockito.asm.ClassAdapter classAdapter71 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classEmitter70);
        org.mockito.asm.ClassAdapter classAdapter72 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter71);
        org.mockito.asm.ClassAdapter classAdapter73 = new org.mockito.asm.ClassAdapter((org.mockito.asm.ClassVisitor) classAdapter71);
        classEmitter56.setTarget((org.mockito.asm.ClassVisitor) classAdapter71);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter56);
        java.lang.String[] strArray87 = new java.lang.String[] { "(ILjava.lang.Object;IF)LB;", "LB(ILjava/lang/Object;IF)Ljava/lang/Object;;", "L(ILjava/lang/Object;IF)Lg/mockito/asm/Type;;", "LF(ILjava/lang/Object;IF)LLorg/mockito/asm/ClassAdapter;;;", "(ILjava/lang/Object;IF)LharV(ILjava/lang/Object;", "long(ILjava/lang/Object;IF)LB;" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter56.visit(4, 3, "Lhi!;Lorg/mockito/cglib/core/ClassEmitter;", "Lhi!;Lorg/mockito/cglib/core/ClassEmitter;", "L(ILjava/lang/Object;IF)I;", strArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(C)C" + "'", str34, "(C)C");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "I" + "'", str42, "I");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(ILjava/lang/Object;IF)C" + "'", str45, "(ILjava/lang/Object;IF)C");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(ILjava/lang/Object;IF)D" + "'", str46, "(ILjava/lang/Object;IF)D");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(ILjava/lang/Object;IF)J" + "'", str47, "(ILjava/lang/Object;IF)J");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "long" + "'", str48, "long");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "LILjava/lang/Object;" + "'", str51, "LILjava/lang/Object;");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ILjava/lang/Object" + "'", str53, "ILjava/lang/Object");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(classInfo58);
        org.junit.Assert.assertNull(classInfo59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(classInfo64);
        org.junit.Assert.assertNotNull(strArray87);
    }
}

