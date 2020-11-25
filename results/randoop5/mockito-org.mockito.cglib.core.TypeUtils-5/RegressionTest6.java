import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$2424242Elang$2424242Ejava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getBoxedType(type14);
        int int18 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type17);
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.cglib.core.Signature signature52 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        org.mockito.asm.Type[] typeArray53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(signature52);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$2Elang$2EJava$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        java.lang.Class<?> wildcardClass21 = typeArray19.getClass();
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        java.lang.Class<?> wildcardClass25 = typeArray23.getClass();
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray27);
        java.lang.Class<?> wildcardClass29 = typeArray27.getClass();
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature32 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray31);
        java.lang.Class<?> wildcardClass33 = typeArray31.getClass();
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature36 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray35);
        java.lang.Class<?> wildcardClass37 = typeArray35.getClass();
        java.lang.Class[] classArray38 = new java.lang.Class[] { wildcardClass17, wildcardClass21, wildcardClass25, wildcardClass29, wildcardClass33, wildcardClass37 };
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.getTypes(classArray38);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray52);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray53, typeArray55);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature59 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray58);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.getClassName(type61);
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type61);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray58, type61);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray55, typeArray58);
        java.lang.String[] strArray66 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray65);
        org.mockito.cglib.core.Signature signature67 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray65);
        int int68 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray65);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray47, typeArray65);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(signature20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(signature24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(signature28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(signature32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(signature36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(signature59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "java.lang.hi!" + "'", str62, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "java.lang.hi!" + "'", str63, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(signature67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertNotNull(typeArray69);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type4);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$2Elang$2EJava$2424242Elang$2424242EJava$2424242424242Elang$2424242424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$242424242Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isPrimitive(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        java.lang.Class<?> wildcardClass19 = strArray18.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        int int17 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type22);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type24);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type24);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getPackageName(type26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type26);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isPrimitive(type30);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type32);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getBoxedType(type33);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getBoxedType(type33);
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type33);
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        int int39 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type33);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.mockito.asm.Type[] typeArray0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int11 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isArray(type16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type10, type13, type16 };
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray22);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int29 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type28);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type34);
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isArray(type34);
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type28, type31, type34 };
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int41 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type40);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.getClassName(type46);
        boolean boolean48 = org.mockito.cglib.core.TypeUtils.isArray(type46);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type40, type43, type46 };
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray37, typeArray49);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray51);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isPrimitive(type54);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getBoxedType(type54);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type56);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type56);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str61 = org.mockito.cglib.core.TypeUtils.getClassName(type60);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type60);
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.getClassName(type62);
        java.lang.String str64 = org.mockito.cglib.core.TypeUtils.getClassName(type62);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type62);
        java.lang.String str66 = org.mockito.cglib.core.TypeUtils.getPackageName(type62);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray0, type62);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature68 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(signature23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.hi!" + "'", str32, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang.hi!" + "'", str44, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.lang.hi!" + "'", str47, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(typeArray67);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type7);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        int int10 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray13 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        java.lang.Class<?> wildcardClass15 = strArray13.getClass();
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass21 = type20.getClass();
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        java.lang.Class<?> wildcardClass25 = typeArray23.getClass();
        java.lang.String[] strArray27 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        java.lang.Class<?> wildcardClass29 = strArray27.getClass();
        java.lang.Class[] classArray30 = new java.lang.Class[] { wildcardClass15, wildcardClass18, wildcardClass21, wildcardClass25, wildcardClass29 };
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray30);
        java.lang.String[] strArray36 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray37, typeArray39);
        java.lang.String[] strArray44 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray44);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray40, typeArray45);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.getBoxedType(type48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray45, type49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray32);
        java.lang.String[] strArray53 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(signature24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(strArray53);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getComponentType(type3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LHi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray13);
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type55);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str60 = org.mockito.cglib.core.TypeUtils.getClassName(type59);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type59);
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.getClassName(type61);
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.getClassName(type61);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type61);
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str67 = org.mockito.cglib.core.TypeUtils.getClassName(type66);
        boolean boolean68 = org.mockito.cglib.core.TypeUtils.isArray(type66);
        java.lang.String str69 = org.mockito.cglib.core.TypeUtils.getClassName(type66);
        java.lang.String str70 = org.mockito.cglib.core.TypeUtils.getPackageName(type66);
        java.lang.String str71 = org.mockito.cglib.core.TypeUtils.getPackageName(type66);
        int int72 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type66);
        int int73 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type66);
        java.lang.String str74 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type66);
        boolean boolean75 = org.mockito.cglib.core.TypeUtils.isArray(type66);
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type66);
        java.lang.String[] strArray77 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        int int78 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "java.lang.hi!" + "'", str67, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "java.lang.hi!" + "'", str69, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java.lang" + "'", str70, "java.lang");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "java.lang" + "'", str71, "java.lang");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "java.lang.hi!" + "'", str74, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 4 + "'", int78 == 4);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java.lang.Java$2Elang");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java.lang" + "'", str2, "Java.lang");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type17);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type11, type14, type17 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type23, type26, type29 };
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray32);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str42 = org.mockito.cglib.core.TypeUtils.getClassName(type41);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getBoxedType(type41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getBoxedType(type41);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type44);
        boolean boolean46 = org.mockito.cglib.core.TypeUtils.isPrimitive(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type44);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(type47);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$2Elang$2Ejava$242Elang");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$2Elang$2Ejava$242Elang");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getComponentType(type9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$2Elang$2Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava$2Elang$2Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$242424242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$24242424242Elang" + "'", str1, "java$24242424242Elang");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$2Elang$2EJava$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242Elang$242EJava$2424242Elang$2424242EJava$242424242Elang$242424242Ehi!" + "'", str1, "Java$242Elang$242EJava$2424242Elang$2424242EJava$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type37);
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getType("java.lang.hi!");
        boolean boolean42 = org.mockito.cglib.core.TypeUtils.isPrimitive(type41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type41);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(type44);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int14 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getClassName(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type13, type16, type19 };
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray22);
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getBoxedType(type28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type29);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getBoxedType(type29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type29);
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.getClassName(type32);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray13);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getBoxedType(type18);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getPackageName(type18);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type18);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(typeArray23);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java.lang.Java$2Elang$2Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava.lang.Java$2Elang$2Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        int int13 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        int int14 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type16, type19, type22 };
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray25);
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray25);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type31);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type31);
        int int37 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(signature27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.hi!" + "'", str32, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang.hi!" + "'", str33, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java$2Elang$2Ejava$24242Elang$24242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        int int15 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        int int20 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type1, type6, type8, type12, type17 };
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.getClassName(type27);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type27);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type27);
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.getPackageName(type31);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int15 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type17);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isArray(type20);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type14, type17, type20 };
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray26);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type32);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type35);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type38);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isArray(type38);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type32, type35, type38 };
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int45 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type47);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        boolean boolean52 = org.mockito.cglib.core.TypeUtils.isArray(type50);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type44, type47, type50 };
        java.lang.String[] strArray54 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray53);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray55);
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean59 = org.mockito.cglib.core.TypeUtils.isPrimitive(type58);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getBoxedType(type58);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type60);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type60);
        java.lang.String[] strArray63 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray62);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray63);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray64);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(signature27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang.hi!" + "'", str51, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(typeArray65);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray21);
        int int23 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray21);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type26);
        int int28 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int31 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isArray(type36);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type30, type33, type36 };
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature43 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray42);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray42);
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray49);
        int int51 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray50);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(signature43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 8 + "'", int51 == 8);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java.lang.java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang.java$24242Elang$24242EJava$2424242Elang$2424242Ehi!" + "'", str1, "Java.lang.java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type18);
        java.lang.String[] strArray26 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type32);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type35);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type38);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isArray(type38);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type32, type35, type38 };
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature45 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray44);
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray44);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray44);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray47);
        int int49 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray47);
        int int50 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray47);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray47);
        java.lang.String[] strArray55 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray55);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray56, typeArray58);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.getClassName(type61);
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type61);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type65);
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str69 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type68);
        java.lang.String str70 = org.mockito.cglib.core.TypeUtils.getClassName(type68);
        org.mockito.asm.Type type72 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str73 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type72);
        java.lang.String str74 = org.mockito.cglib.core.TypeUtils.getClassName(type72);
        int int75 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type72);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean78 = org.mockito.cglib.core.TypeUtils.isPrimitive(type77);
        int int79 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type77);
        int int80 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type77);
        org.mockito.asm.Type[] typeArray81 = new org.mockito.asm.Type[] { type61, type66, type68, type72, type77 };
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type84 = org.mockito.cglib.core.TypeUtils.getBoxedType(type83);
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.add(typeArray81, type83);
        java.lang.String str86 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type83);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray56, type83);
        org.mockito.asm.Type type89 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray90 = org.mockito.cglib.core.TypeUtils.add(typeArray87, type89);
        org.mockito.asm.Type type92 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$242Elang$242Ehi!");
        org.mockito.asm.Type[] typeArray93 = org.mockito.cglib.core.TypeUtils.add(typeArray87, type92);
        java.lang.String str94 = org.mockito.cglib.core.TypeUtils.getClassName(type92);
        org.mockito.asm.Type[] typeArray95 = org.mockito.cglib.core.TypeUtils.add(typeArray47, type92);
        java.lang.String str96 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type92);
        java.lang.String str97 = org.mockito.cglib.core.TypeUtils.getPackageName(type92);
        int int98 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type92);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(signature45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "java.lang.hi!" + "'", str62, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "java.lang.hi!" + "'", str63, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "java.lang.hi!" + "'", str69, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java.lang.hi!" + "'", str70, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "java.lang.hi!" + "'", str73, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "java.lang.hi!" + "'", str74, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertNotNull(type89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(type92);
        org.junit.Assert.assertNotNull(typeArray93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "java$242Elang$242Ehi!" + "'", str94, "java$242Elang$242Ehi!");
        org.junit.Assert.assertNotNull(typeArray95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "java$242Elang$242Ehi!" + "'", str96, "java$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$2Elang");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/java$2Elang; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$242Elang$242EJava$2424242Elang$2424242EJava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.Class<?> wildcardClass7 = typeArray5.getClass();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.Class<?> wildcardClass11 = typeArray9.getClass();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class<?> wildcardClass15 = typeArray13.getClass();
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class<?> wildcardClass19 = typeArray17.getClass();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass3, wildcardClass7, wildcardClass11, wildcardClass15, wildcardClass19, wildcardClass23 };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$2424242Elang$2424242EJava$242424242Elang$242424242Ehi!");
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type29);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$2Elang$2Ejava$24242Elang$24242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type8);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        java.lang.Class<?> wildcardClass13 = type12.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type2);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int45 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type47);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        boolean boolean52 = org.mockito.cglib.core.TypeUtils.isArray(type50);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type44, type47, type50 };
        java.lang.String[] strArray54 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature57 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray56);
        java.lang.String[] strArray58 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray56);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray53, typeArray56);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray42, typeArray59);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type62);
        java.lang.String str64 = org.mockito.cglib.core.TypeUtils.getClassName(type62);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.getBoxedType(type62);
        java.lang.String str66 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type62);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray60, type62);
        java.lang.String[] strArray68 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray60);
        java.lang.String[] strArray69 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray60);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray34, typeArray60);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang.hi!" + "'", str51, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(signature57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "java.lang.hi!" + "'", str63, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.lang.hi!" + "'", str64, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "java.lang.hi!" + "'", str66, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(typeArray70);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$24242Elang$24242Ejava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$242Elang");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray5);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray8);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type11);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type11);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type18);
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type22);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        int int25 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type22);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isPrimitive(type27);
        int int29 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        int int30 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type11, type16, type18, type22, type27 };
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getBoxedType(type33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type33);
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type33);
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        java.lang.String[] strArray41 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray39);
        org.mockito.cglib.core.Signature signature43 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray42);
        org.mockito.cglib.core.Signature signature44 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray42);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(signature40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(signature43);
        org.junit.Assert.assertNotNull(signature44);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$24242424242Elang$24242424242Ejava$2424242424242424242Elang$2424242424242424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray5);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray8);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type11);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type11);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type18);
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type22);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        int int25 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type22);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isPrimitive(type27);
        int int29 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        int int30 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type11, type16, type18, type22, type27 };
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getBoxedType(type33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type33);
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type33);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray37, type39);
        int int41 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type39);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type39);
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getBoxedType(type36);
        java.lang.String str40 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type39);
        boolean boolean41 = org.mockito.cglib.core.TypeUtils.isArray(type39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type39);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getComponentType(type39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "java.lang.hi!" + "'", str40, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(typeArray42);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type55);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str60 = org.mockito.cglib.core.TypeUtils.getClassName(type59);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type59);
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.getClassName(type61);
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.getClassName(type61);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type61);
        org.mockito.cglib.core.Signature signature65 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.getType("Java.lang.hi!");
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.getBoxedType(type67);
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getBoxedType(type68);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type69);
        java.lang.String str71 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type69);
        boolean boolean72 = org.mockito.cglib.core.TypeUtils.isPrimitive(type69);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(signature65);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Java.lang.hi!" + "'", str71, "Java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java.lang.hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type27);
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type27);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type27);
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type27);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getPackageName(type34);
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.getPackageName(type34);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.hi!" + "'", str28, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang" + "'", str35, "java.lang");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang" + "'", str36, "java.lang");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.Class<?> wildcardClass7 = typeArray5.getClass();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.Class<?> wildcardClass11 = typeArray9.getClass();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class<?> wildcardClass15 = typeArray13.getClass();
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class<?> wildcardClass19 = typeArray17.getClass();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass3, wildcardClass7, wildcardClass11, wildcardClass15, wildcardClass19, wildcardClass23 };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray29);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getBoxedType(type33);
        int int37 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type36);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type36);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type36);
        boolean boolean41 = org.mockito.cglib.core.TypeUtils.isArray(type36);
        int int42 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type36);
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$2Elang$2Ejava$242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang$2Ejava$242Elang" + "'", str1, "Java$2Elang$2Ejava$242Elang");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        int int17 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        int int20 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.getClassName(type25);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type25);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type32);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type35);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type38);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isArray(type38);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type32, type35, type38 };
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int45 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type47);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        boolean boolean52 = org.mockito.cglib.core.TypeUtils.isArray(type50);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type44, type47, type50 };
        java.lang.String[] strArray54 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray53);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isPrimitive(type57);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray53, type57);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray53);
        org.mockito.cglib.core.Signature signature61 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray60);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray60);
        int int63 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        java.lang.Class<?> wildcardClass64 = typeArray12.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(signature23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang.hi!" + "'", str51, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(signature61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.getClassName(type10);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isArray(type10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getPackageName(type10);
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isArray(type10);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang" + "'", str14, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type37);
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        java.lang.String[] strArray41 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray40);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray41);
        java.lang.String[] strArray43 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray42);
        java.lang.Class<?> wildcardClass44 = strArray43.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$2Elang$2EJava$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242Elang$242EJava$24242Elang$24242Ehi!" + "'", str1, "Java$242Elang$242EJava$24242Elang$24242Ehi!");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.Java$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        int int17 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature26 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type28);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray31);
        org.mockito.cglib.core.Signature signature33 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray31);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$2Elang$2Ehi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getBoxedType(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type38);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getType("Java.lang.hi!");
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type41);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getComponentType(type41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(signature26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(signature33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Java$2Elang$2Ehi!" + "'", str37, "Java$2Elang$2Ehi!");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$242424242Elang$242424242EJava$242424242424242Elang$242424242424242Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java$242424242Elang$242424242EJava$242424242424242Elang$242424242424242Ehi!" + "'", str2, "Java$242424242Elang$242424242EJava$242424242424242Elang$242424242424242Ehi!");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$242Elang$242Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.java$242Elang$242Ehi!" + "'", str3, "java.lang.java$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.java$242Elang$242Ehi!" + "'", str5, "java.lang.java$242Elang$242Ehi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.java$242Elang$242Ehi!" + "'", str7, "java.lang.java$242Elang$242Ehi!");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type55);
        int int58 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type55);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type55);
        boolean boolean60 = org.mockito.cglib.core.TypeUtils.isArray(type59);
        int int61 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type59);
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.getPackageName(type59);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "java.lang" + "'", str62, "java.lang");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        int int26 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray24);
        int int27 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray24);
        java.lang.String[] strArray31 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray34);
        int int36 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray34);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getBoxedType(type38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray34);
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        java.lang.Class<?> wildcardClass43 = typeArray24.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.Class<?> wildcardClass5 = type1.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[] { wildcardClass5 };
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type15);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isArray(type28);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type22, type25, type28 };
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int35 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type34);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type37);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str41 = org.mockito.cglib.core.TypeUtils.getClassName(type40);
        boolean boolean42 = org.mockito.cglib.core.TypeUtils.isArray(type40);
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type34, type37, type40 };
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray43);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean48 = org.mockito.cglib.core.TypeUtils.isPrimitive(type47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray43, type47);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray43);
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray51);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray52);
        java.lang.String[] strArray54 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java.lang.hi!" + "'", str41, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(strArray54);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$242424242Elang$242424242EJava$242424242424242Elang$242424242424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        int int26 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray7);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature34 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type36);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray40);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray41);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.parseTypes("Hi!");
        int int45 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray44);
        int int46 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray44);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray44);
        java.lang.String[] strArray48 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(signature34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(strArray48);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray13);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray13);
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getClassName(type26);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type26);
        java.lang.String[] strArray33 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray23, typeArray34);
        java.lang.String[] strArray39 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray40, typeArray42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray34, typeArray43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray34);
        int int46 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray34);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(signature24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.hi!" + "'", str28, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type53);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type53);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getBoxedType(type62);
        java.lang.String str64 = org.mockito.cglib.core.TypeUtils.getPackageName(type63);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type63);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray60, type65);
        java.lang.String str67 = org.mockito.cglib.core.TypeUtils.getPackageName(type65);
        int int68 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type65);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "java.lang.hi!" + "'", str57, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang.hi!" + "'", str59, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.lang" + "'", str64, "java.lang");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "java.lang" + "'", str67, "java.lang");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type55);
        int int58 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type55);
        boolean boolean59 = org.mockito.cglib.core.TypeUtils.isPrimitive(type55);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type55);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type55);
        boolean boolean62 = org.mockito.cglib.core.TypeUtils.isPrimitive(type55);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type55);
        int int58 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray57);
        java.lang.String[] strArray62 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray62);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray63, typeArray65);
        java.lang.String[] strArray70 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray70);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray66, typeArray71);
        org.mockito.asm.Type type74 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str75 = org.mockito.cglib.core.TypeUtils.getClassName(type74);
        boolean boolean76 = org.mockito.cglib.core.TypeUtils.isArray(type74);
        java.lang.String str77 = org.mockito.cglib.core.TypeUtils.getClassName(type74);
        java.lang.String str78 = org.mockito.cglib.core.TypeUtils.getPackageName(type74);
        java.lang.String str79 = org.mockito.cglib.core.TypeUtils.getPackageName(type74);
        int int80 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type74);
        int int81 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type74);
        java.lang.String str82 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type74);
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.getBoxedType(type74);
        org.mockito.asm.Type[] typeArray84 = org.mockito.cglib.core.TypeUtils.add(typeArray72, type74);
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.add(typeArray57, type74);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4 + "'", int58 == 4);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "java.lang.hi!" + "'", str75, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "java.lang.hi!" + "'", str77, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "java.lang" + "'", str78, "java.lang");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "java.lang" + "'", str79, "java.lang");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "java.lang.hi!" + "'", str82, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertNotNull(typeArray84);
        org.junit.Assert.assertNotNull(typeArray85);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("Java$2Elang$2Ehi!");
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type5);
        java.lang.String[] strArray10 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type16, type19, type22 };
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray28);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray31);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int35 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type34);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type37);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str41 = org.mockito.cglib.core.TypeUtils.getClassName(type40);
        boolean boolean42 = org.mockito.cglib.core.TypeUtils.isArray(type40);
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type34, type37, type40 };
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray43);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int47 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type46);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str50 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type49);
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str53 = org.mockito.cglib.core.TypeUtils.getClassName(type52);
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isArray(type52);
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type46, type49, type52 };
        java.lang.String[] strArray56 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray43, typeArray55);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray57);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean61 = org.mockito.cglib.core.TypeUtils.isPrimitive(type60);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.getBoxedType(type60);
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type62);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type62);
        boolean boolean65 = org.mockito.cglib.core.TypeUtils.isArray(type62);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type62);
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean69 = org.mockito.cglib.core.TypeUtils.isPrimitive(type68);
        org.mockito.asm.Type type70 = org.mockito.cglib.core.TypeUtils.getBoxedType(type68);
        java.lang.String str71 = org.mockito.cglib.core.TypeUtils.getClassName(type68);
        java.lang.String str72 = org.mockito.cglib.core.TypeUtils.getClassName(type68);
        boolean boolean73 = org.mockito.cglib.core.TypeUtils.isPrimitive(type68);
        org.mockito.asm.Type type74 = org.mockito.cglib.core.TypeUtils.getBoxedType(type68);
        org.mockito.asm.Type type75 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type74);
        java.lang.String str76 = org.mockito.cglib.core.TypeUtils.getClassName(type74);
        int int77 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type74);
        java.lang.String str78 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type74);
        java.lang.String str79 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type74);
        int int80 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type74);
        boolean boolean81 = org.mockito.cglib.core.TypeUtils.isArray(type74);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type74);
        int int83 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type74);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(signature29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java.lang.hi!" + "'", str41, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "java.lang.hi!" + "'", str50, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "java.lang.hi!" + "'", str53, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "java.lang.hi!" + "'", str71, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "java.lang.hi!" + "'", str72, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "java.lang.hi!" + "'", str76, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "java.lang.hi!" + "'", str78, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "java.lang.hi!" + "'", str79, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$2Elang$2EJava$242Elang");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getPackageName(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type9);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray19);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray36);
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray36);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray36);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang");
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        int int45 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type43);
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type43);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.getBoxedType(type43);
        int int48 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type43);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type43);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type43);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(signature7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(signature38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang" + "'", str44, "java.lang");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang" + "'", str46, "java.lang");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(typeArray50);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(signature9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.mockito.asm.Type[] typeArray0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int11 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isArray(type16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type10, type13, type16 };
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray22);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int29 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type28);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type34);
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isArray(type34);
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type28, type31, type34 };
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int41 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type40);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.getClassName(type46);
        boolean boolean48 = org.mockito.cglib.core.TypeUtils.isArray(type46);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type40, type43, type46 };
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray37, typeArray49);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray51);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isPrimitive(type54);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getBoxedType(type54);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type56);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type56);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str61 = org.mockito.cglib.core.TypeUtils.getClassName(type60);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type60);
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.getClassName(type62);
        java.lang.String str64 = org.mockito.cglib.core.TypeUtils.getClassName(type62);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type62);
        java.lang.String str66 = org.mockito.cglib.core.TypeUtils.getPackageName(type62);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray0, type62);
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str70 = org.mockito.cglib.core.TypeUtils.getClassName(type69);
        boolean boolean71 = org.mockito.cglib.core.TypeUtils.isArray(type69);
        org.mockito.asm.Type type72 = org.mockito.cglib.core.TypeUtils.getBoxedType(type69);
        org.mockito.asm.Type type73 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type72);
        org.mockito.asm.Type type74 = org.mockito.cglib.core.TypeUtils.getBoxedType(type73);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray67, type74);
        boolean boolean76 = org.mockito.cglib.core.TypeUtils.isArray(type74);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.getBoxedType(type74);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(signature23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.hi!" + "'", str32, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang.hi!" + "'", str44, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.lang.hi!" + "'", str47, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java.lang.hi!" + "'", str70, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(type77);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isArray(type28);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type22, type25, type28 };
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray31);
        java.lang.String[] strArray37 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray46);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.getBoxedType(type49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isArray(type53);
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isArray(type53);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type53);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        java.lang.String str58 = org.mockito.cglib.core.TypeUtils.getClassName(type57);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.getClassName(type57);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type57);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type57);
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getType("java.lang.hi!");
        java.lang.String str64 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type63);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type63);
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.getBoxedType(type67);
        java.lang.String str69 = org.mockito.cglib.core.TypeUtils.getClassName(type67);
        boolean boolean70 = org.mockito.cglib.core.TypeUtils.isArray(type67);
        java.lang.String str71 = org.mockito.cglib.core.TypeUtils.getPackageName(type67);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray65, type67);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.lang.hi!" + "'", str64, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "java.lang.hi!" + "'", str69, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "java.lang" + "'", str71, "java.lang");
        org.junit.Assert.assertNotNull(typeArray72);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang.java$2Elang");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.java$2Elang" + "'", str2, "java.lang.java$2Elang");
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type17);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type11, type14, type17 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type23, type26, type29 };
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray32);
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray40);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray40);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getClassName(type26);
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isArray(type26);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type20, type23, type26 };
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray29);
        int int34 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray29);
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        java.lang.String[] strArray40 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray43);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.getClassName(type46);
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type46);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.getBoxedType(type50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str54 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type53);
        java.lang.String str55 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str58 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type57);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.getClassName(type57);
        int int60 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type57);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean63 = org.mockito.cglib.core.TypeUtils.isPrimitive(type62);
        int int64 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type62);
        int int65 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type62);
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type46, type51, type53, type57, type62 };
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getBoxedType(type68);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray66, type68);
        java.lang.String str71 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type68);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type68);
        java.lang.String[] strArray73 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray73);
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature77 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray76);
        int int78 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray76);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.add(typeArray74, typeArray76);
        org.mockito.asm.Type[] typeArray80 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray74);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray29);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(signature31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(signature35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.lang.hi!" + "'", str47, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "java.lang.hi!" + "'", str54, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "java.lang.hi!" + "'", str55, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "java.lang.hi!" + "'", str58, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang.hi!" + "'", str59, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertNotNull(signature77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(typeArray81);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type6);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int13 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type12, type15, type18 };
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray24);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type29);
        java.lang.String[] strArray35 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray38);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str42 = org.mockito.cglib.core.TypeUtils.getClassName(type41);
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type41);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.getBoxedType(type45);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str49 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type48);
        java.lang.String str50 = org.mockito.cglib.core.TypeUtils.getClassName(type48);
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str53 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type52);
        java.lang.String str54 = org.mockito.cglib.core.TypeUtils.getClassName(type52);
        int int55 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type52);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isPrimitive(type57);
        int int59 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type57);
        int int60 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type57);
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type41, type46, type48, type52, type57 };
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.getBoxedType(type63);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type63);
        java.lang.String str66 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type63);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type63);
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray67, type69);
        java.lang.String[] strArray71 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray67);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray71);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray71);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray71);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray74);
        java.lang.String[] strArray76 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray75);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "java.lang.hi!" + "'", str42, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.lang.hi!" + "'", str49, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "java.lang.hi!" + "'", str50, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "java.lang.hi!" + "'", str53, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "java.lang.hi!" + "'", str54, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(strArray76);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$24242Elang$24242Ejava$2424242424242Elang$2424242424242Ehi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$2424242Elang$2424242Ejava$242424242424242Elang$242424242424242Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava$2424242Elang$2424242Ejava$242424242424242Elang$242424242424242Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type10);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type14);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        int int22 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type3, type8, type10, type14, type19 };
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type25);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type31);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type31);
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        boolean boolean39 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type31);
        int int41 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type31);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type17);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type11, type14, type17 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type23, type26, type29 };
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray32);
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        int int41 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray39);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int44 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type43);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type46);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str50 = org.mockito.cglib.core.TypeUtils.getClassName(type49);
        boolean boolean51 = org.mockito.cglib.core.TypeUtils.isArray(type49);
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type43, type46, type49 };
        java.lang.String[] strArray53 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray52);
        org.mockito.cglib.core.Signature signature54 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray52);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray52);
        java.lang.String[] strArray59 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray59);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.add(typeArray60, typeArray62);
        int int64 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray62);
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.getBoxedType(type66);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray62, type67);
        org.mockito.asm.Type type70 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str71 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type70);
        java.lang.String str72 = org.mockito.cglib.core.TypeUtils.getClassName(type70);
        org.mockito.asm.Type type73 = org.mockito.cglib.core.TypeUtils.getBoxedType(type70);
        int int74 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type73);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray62, type73);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean78 = org.mockito.cglib.core.TypeUtils.isPrimitive(type77);
        int int79 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type77);
        java.lang.String str80 = org.mockito.cglib.core.TypeUtils.getClassName(type77);
        org.mockito.asm.Type type81 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type77);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.add(typeArray62, type77);
        java.lang.String[] strArray83 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray82);
        org.mockito.asm.Type[] typeArray84 = org.mockito.cglib.core.TypeUtils.add(typeArray52, typeArray82);
        int int85 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray52);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(signature40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.lang.hi!" + "'", str47, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "java.lang.hi!" + "'", str50, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(signature54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "java.lang.hi!" + "'", str71, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "java.lang.hi!" + "'", str72, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "java.lang.hi!" + "'", str80, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type81);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(typeArray84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 3 + "'", int85 == 3);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type5);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isArray(type5);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isPrimitive(type5);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        int int11 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type8);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type10);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type10);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("Java$2Elang$2Ehi!");
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type5);
        java.lang.String[] strArray10 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray13);
        int int15 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray13);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getBoxedType(type17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type21);
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type21);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type21);
        int int25 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type24);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int34 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str40 = org.mockito.cglib.core.TypeUtils.getClassName(type39);
        boolean boolean41 = org.mockito.cglib.core.TypeUtils.isArray(type39);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type33, type36, type39 };
        java.lang.String[] strArray43 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray42);
        org.mockito.cglib.core.Signature signature44 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray42);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray42);
        org.mockito.cglib.core.Signature signature47 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray46);
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray46);
        org.mockito.cglib.core.Signature signature50 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray46);
        org.mockito.cglib.core.Signature signature51 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray46);
        java.lang.String[] strArray55 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray55);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray56, typeArray58);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.getClassName(type61);
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type61);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type65);
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str69 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type68);
        java.lang.String str70 = org.mockito.cglib.core.TypeUtils.getClassName(type68);
        org.mockito.asm.Type type72 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str73 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type72);
        java.lang.String str74 = org.mockito.cglib.core.TypeUtils.getClassName(type72);
        int int75 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type72);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean78 = org.mockito.cglib.core.TypeUtils.isPrimitive(type77);
        int int79 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type77);
        int int80 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type77);
        org.mockito.asm.Type[] typeArray81 = new org.mockito.asm.Type[] { type61, type66, type68, type72, type77 };
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type84 = org.mockito.cglib.core.TypeUtils.getBoxedType(type83);
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.add(typeArray81, type83);
        java.lang.String str86 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type83);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray56, type83);
        org.mockito.asm.Type type89 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray90 = org.mockito.cglib.core.TypeUtils.add(typeArray87, type89);
        java.lang.String[] strArray91 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray87);
        org.mockito.asm.Type[] typeArray92 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray91);
        org.mockito.asm.Type[] typeArray93 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray91);
        org.mockito.asm.Type[] typeArray94 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray91);
        org.mockito.cglib.core.Signature signature95 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray94);
        org.mockito.asm.Type[] typeArray96 = org.mockito.cglib.core.TypeUtils.add(typeArray46, typeArray94);
        int int97 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray96);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "java.lang.hi!" + "'", str40, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(signature44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(signature47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(signature50);
        org.junit.Assert.assertNotNull(signature51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "java.lang.hi!" + "'", str62, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "java.lang.hi!" + "'", str63, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "java.lang.hi!" + "'", str69, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java.lang.hi!" + "'", str70, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "java.lang.hi!" + "'", str73, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "java.lang.hi!" + "'", str74, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertNotNull(type89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(typeArray92);
        org.junit.Assert.assertNotNull(typeArray93);
        org.junit.Assert.assertNotNull(typeArray94);
        org.junit.Assert.assertNotNull(signature95);
        org.junit.Assert.assertNotNull(typeArray96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 8 + "'", int97 == 8);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java.lang.hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Java.lang.hi!" + "'", str5, "Java.lang.hi!");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Java.lang.hi!" + "'", str7, "Java.lang.hi!");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$24242424242Elang$24242424242EJava$2424242424242Elang$2424242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$2Elang$2Ejava$242Elang");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2424242Elang$2424242Ehi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.Class<?> wildcardClass3 = typeArray1.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$24242Elang$24242Ehi!");
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type8);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isArray(type12);
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type18);
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type21);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getBoxedType(type21);
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type23);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type23);
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type27);
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(signature29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        int int17 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type22);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type24);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type24);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getPackageName(type26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type26);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type32);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type35);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type38);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isArray(type38);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type32, type35, type38 };
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.cglib.core.Signature signature43 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray41);
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray41);
        java.lang.String[] strArray49 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray49);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray50, typeArray52);
        int int54 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray52);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.getBoxedType(type56);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray52, type57);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type57);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type59);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getBoxedType(type59);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type59);
        org.mockito.cglib.core.Signature signature63 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray62);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(signature43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(signature63);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        java.lang.String[] strArray24 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        java.lang.Class<?> wildcardClass26 = strArray24.getClass();
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        java.lang.Class<?> wildcardClass30 = typeArray28.getClass();
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature33 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray32);
        java.lang.Class<?> wildcardClass34 = typeArray32.getClass();
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature37 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray36);
        java.lang.Class<?> wildcardClass38 = typeArray36.getClass();
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature41 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray40);
        java.lang.Class<?> wildcardClass42 = typeArray40.getClass();
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature45 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray44);
        java.lang.Class<?> wildcardClass46 = typeArray44.getClass();
        java.lang.Class[] classArray47 = new java.lang.Class[] { wildcardClass26, wildcardClass30, wildcardClass34, wildcardClass38, wildcardClass42, wildcardClass46 };
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray50);
        java.lang.String[] strArray52 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature55 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray54);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str58 = org.mockito.cglib.core.TypeUtils.getClassName(type57);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type57);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray54, type57);
        java.lang.String[] strArray64 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray64);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray54, typeArray65);
        java.lang.String[] strArray70 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray70);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray71, typeArray73);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray65, typeArray74);
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.add(typeArray50, typeArray74);
        org.mockito.asm.Type type78 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java.lang.Java$2Elang$2Ehi!");
        boolean boolean79 = org.mockito.cglib.core.TypeUtils.isArray(type78);
        boolean boolean80 = org.mockito.cglib.core.TypeUtils.isArray(type78);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type78);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(signature29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(signature33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(signature37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(signature41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(signature45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(signature55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "java.lang.hi!" + "'", str58, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang.hi!" + "'", str59, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertNotNull(type78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(typeArray81);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type27);
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type27);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type27);
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.cglib.core.Signature signature36 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray35);
        org.mockito.cglib.core.Signature signature37 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.hi!" + "'", str28, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(signature36);
        org.junit.Assert.assertNotNull(signature37);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray16);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray29);
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(signature19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(signature31);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type22);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int30 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type32);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.getClassName(type35);
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isArray(type35);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type29, type32, type35 };
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray38);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int42 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.getClassName(type47);
        boolean boolean49 = org.mockito.cglib.core.TypeUtils.isArray(type47);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type41, type44, type47 };
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray50);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isPrimitive(type54);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type54);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray50);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray59);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray19);
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature64 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray63);
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str67 = org.mockito.cglib.core.TypeUtils.getClassName(type66);
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type66);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray63, type66);
        java.lang.String[] strArray73 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray73);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray63, typeArray74);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str78 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type77);
        java.lang.String str79 = org.mockito.cglib.core.TypeUtils.getClassName(type77);
        org.mockito.asm.Type type80 = org.mockito.cglib.core.TypeUtils.getBoxedType(type77);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.add(typeArray63, type77);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.add(typeArray61, typeArray81);
        java.lang.String[] strArray83 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray82);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(signature17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(signature20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang.hi!" + "'", str33, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(signature64);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "java.lang.hi!" + "'", str67, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "java.lang.hi!" + "'", str68, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "java.lang.hi!" + "'", str78, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "java.lang.hi!" + "'", str79, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(strArray83);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        int int26 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray24);
        int int27 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray24);
        java.lang.String[] strArray31 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray34);
        int int36 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray34);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getBoxedType(type38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray34);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature44 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray43);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.getClassName(type46);
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type46);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray43, type46);
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray43);
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray43);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray51);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray52);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type55);
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.getClassName(type55);
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.getBoxedType(type55);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type55);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getBoxedType(type59);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getBoxedType(type59);
        boolean boolean62 = org.mockito.cglib.core.TypeUtils.isPrimitive(type61);
        int int63 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type61);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray52, type61);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$242424242424242424242Elang$242424242424242424242Ehi!");
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray52, typeArray66);
        java.lang.String[] strArray68 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray66);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(signature44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.lang.hi!" + "'", str47, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "java.lang.hi!" + "'", str57, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(strArray68);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java.lang.java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang.java$242424242Elang$242424242Ehi!" + "'", str1, "Java.lang.java$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.Class<?> wildcardClass5 = type1.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[] { wildcardClass5 };
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        java.lang.Class<?> wildcardClass10 = classArray6.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray15);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getClassName(type26);
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isArray(type26);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type20, type23, type26 };
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray29);
        int int34 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray29);
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        int int37 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray29);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.getClassName(type42);
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type42);
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        java.lang.String[] strArray47 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int50 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type49);
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str53 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type52);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.getClassName(type55);
        boolean boolean57 = org.mockito.cglib.core.TypeUtils.isArray(type55);
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type49, type52, type55 };
        java.lang.String[] strArray59 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray58);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int62 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type61);
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str65 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type64);
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.getClassName(type67);
        boolean boolean69 = org.mockito.cglib.core.TypeUtils.isArray(type67);
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type61, type64, type67 };
        java.lang.String[] strArray71 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray70);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray58, typeArray70);
        org.mockito.asm.Type type74 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean75 = org.mockito.cglib.core.TypeUtils.isPrimitive(type74);
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.add(typeArray70, type74);
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray70);
        org.mockito.cglib.core.Signature signature78 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray77);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray77);
        org.mockito.asm.Type[] typeArray80 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray29);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray15);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(signature31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(signature35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(signature40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang.hi!" + "'", str44, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "java.lang.hi!" + "'", str53, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang.hi!" + "'", str65, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "java.lang.hi!" + "'", str68, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertNotNull(signature78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(typeArray81);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.Class<?> wildcardClass6 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        int int26 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray7);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature34 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type36);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray40);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.getClassName(type44);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type46);
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type47);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(signature34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(typeArray49);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java.lang.Java$24242Elang$24242EJava$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang.Java$24242Elang$24242EJava$24242424242Elang$24242424242Ehi!" + "'", str1, "Java.lang.Java$24242Elang$24242EJava$24242424242Elang$24242424242Ehi!");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ehi!");
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.getClassName(type43);
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getBoxedType(type47);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type50);
        java.lang.String str52 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str55 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type54);
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.getClassName(type54);
        int int57 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type54);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean60 = org.mockito.cglib.core.TypeUtils.isPrimitive(type59);
        int int61 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type59);
        int int62 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type59);
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type43, type48, type50, type54, type59 };
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type65);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray63, type65);
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type65);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type65);
        org.mockito.cglib.core.Signature signature70 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray69);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray69);
        org.mockito.asm.Type type73 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean74 = org.mockito.cglib.core.TypeUtils.isPrimitive(type73);
        int int75 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type73);
        java.lang.String str76 = org.mockito.cglib.core.TypeUtils.getClassName(type73);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type73);
        boolean boolean78 = org.mockito.cglib.core.TypeUtils.isArray(type77);
        boolean boolean79 = org.mockito.cglib.core.TypeUtils.isPrimitive(type77);
        java.lang.String str80 = org.mockito.cglib.core.TypeUtils.getClassName(type77);
        java.lang.String str81 = org.mockito.cglib.core.TypeUtils.getPackageName(type77);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.add(typeArray71, type77);
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.getBoxedType(type77);
        org.mockito.asm.Type type84 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type77);
        org.mockito.asm.Type type85 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type84);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang.hi!" + "'", str44, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang.hi!" + "'", str51, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java.lang.hi!" + "'", str52, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "java.lang.hi!" + "'", str55, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(signature70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "java.lang.hi!" + "'", str76, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "java.lang.hi!" + "'", str80, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "java.lang" + "'", str81, "java.lang");
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(type85);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        int int36 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray4);
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        java.lang.String[] strArray41 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$2Elang$2EJava$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.mockito.asm.Type[] typeArray0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int11 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isArray(type16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type10, type13, type16 };
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray22);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type28);
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getBoxedType(type28);
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type28);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type28);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray0, type28);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$242424242424242424242Elang$242424242424242424242Ehi!");
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray34, typeArray36);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray37);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(signature23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.hi!" + "'", str32, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(signature38);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.Class<?> wildcardClass11 = typeArray9.getClass();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class<?> wildcardClass15 = typeArray13.getClass();
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class<?> wildcardClass19 = typeArray17.getClass();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature26 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray25);
        java.lang.Class<?> wildcardClass27 = typeArray25.getClass();
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass7, wildcardClass11, wildcardClass15, wildcardClass19, wildcardClass23, wildcardClass27 };
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray28);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray38);
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(signature26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isArray(type28);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type22, type25, type28 };
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray31);
        java.lang.String[] strArray37 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray46);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.getBoxedType(type49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isArray(type53);
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isArray(type53);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type53);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        java.lang.String str58 = org.mockito.cglib.core.TypeUtils.getClassName(type57);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.getClassName(type57);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type57);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type57);
        int int62 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray33);
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang$2Ehi!");
        boolean boolean65 = org.mockito.cglib.core.TypeUtils.isPrimitive(type64);
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type64);
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.getBoxedType(type66);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type67);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 8 + "'", int62 == 8);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(typeArray68);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        java.lang.String[] strArray41 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray41);
        java.lang.Class<?> wildcardClass43 = strArray41.getClass();
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray45);
        java.lang.Class<?> wildcardClass47 = typeArray45.getClass();
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature50 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray49);
        java.lang.Class<?> wildcardClass51 = typeArray49.getClass();
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature54 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray53);
        java.lang.Class<?> wildcardClass55 = typeArray53.getClass();
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature58 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray57);
        java.lang.Class<?> wildcardClass59 = typeArray57.getClass();
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature62 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray61);
        java.lang.Class<?> wildcardClass63 = typeArray61.getClass();
        java.lang.Class[] classArray64 = new java.lang.Class[] { wildcardClass43, wildcardClass47, wildcardClass51, wildcardClass55, wildcardClass59, wildcardClass63 };
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.getTypes(classArray64);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray65);
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray65, type68);
        org.mockito.cglib.core.Signature signature70 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray65);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(signature46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(signature50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(signature54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(signature58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(signature62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(signature70);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type53);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type53);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getBoxedType(type62);
        java.lang.String str64 = org.mockito.cglib.core.TypeUtils.getPackageName(type63);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type63);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray60, type65);
        boolean boolean67 = org.mockito.cglib.core.TypeUtils.isPrimitive(type65);
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type65);
        int int69 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type68);
        org.mockito.asm.Type type70 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type68);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "java.lang.hi!" + "'", str57, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang.hi!" + "'", str59, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.lang" + "'", str64, "java.lang");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(type70);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$2Elang$2EJava$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        int int19 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray16);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(signature20);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$242Elang$242EJava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type8);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray16);
        int int21 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray16);
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(signature19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray23);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        java.lang.String[] strArray34 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.cglib.core.Signature signature37 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray36);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(signature37);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        int int17 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        int int20 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.getClassName(type25);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type25);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type32);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type35);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type38);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isArray(type38);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type32, type35, type38 };
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int45 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type47);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        boolean boolean52 = org.mockito.cglib.core.TypeUtils.isArray(type50);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type44, type47, type50 };
        java.lang.String[] strArray54 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray53);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isPrimitive(type57);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray53, type57);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray53);
        org.mockito.cglib.core.Signature signature61 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray60);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray60);
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str65 = org.mockito.cglib.core.TypeUtils.getClassName(type64);
        boolean boolean66 = org.mockito.cglib.core.TypeUtils.isArray(type64);
        java.lang.String str67 = org.mockito.cglib.core.TypeUtils.getClassName(type64);
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.getPackageName(type64);
        java.lang.String str69 = org.mockito.cglib.core.TypeUtils.getPackageName(type64);
        int int70 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type64);
        boolean boolean71 = org.mockito.cglib.core.TypeUtils.isArray(type64);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type64);
        int int73 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type64);
        int int74 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type64);
        boolean boolean75 = org.mockito.cglib.core.TypeUtils.isArray(type64);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(signature23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang.hi!" + "'", str51, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(signature61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang.hi!" + "'", str65, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "java.lang.hi!" + "'", str67, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "java.lang" + "'", str68, "java.lang");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "java.lang" + "'", str69, "java.lang");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.Java$24242Elang$24242EJava$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java" + "'", str2, "Java");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type17);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type11, type14, type17 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type23, type26, type29 };
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray32);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str42 = org.mockito.cglib.core.TypeUtils.getClassName(type41);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type41);
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.getPackageName(type41);
        boolean boolean45 = org.mockito.cglib.core.TypeUtils.isPrimitive(type41);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.getBoxedType(type41);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type46);
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type46);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type46);
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(strArray50);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.getClassName(type10);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isArray(type10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getPackageName(type10);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type10);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang" + "'", str14, "java.lang");
        org.junit.Assert.assertNotNull(type15);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.Class<?> wildcardClass8 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java.lang.java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$24242424242424242424242Elang$24242424242424242424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type11);
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type11);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type11);
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isArray(type11);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type11);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang" + "'", str12, "java.lang");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang" + "'", str16, "java.lang");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!" + "'", str5, "Hi!");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int14 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getClassName(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type13, type16, type19 };
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray22);
        org.mockito.asm.Type[] typeArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        int int17 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type22);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type24);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type24);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getPackageName(type26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type26);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isPrimitive(type30);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type32);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getBoxedType(type33);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getBoxedType(type33);
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type33);
        int int38 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type33);
        boolean boolean39 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isPrimitive(type33);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ejava$242Elang");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        int int3 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        int int4 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type17);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type11, type14, type17 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type23, type26, type29 };
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray32);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str42 = org.mockito.cglib.core.TypeUtils.getClassName(type41);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getBoxedType(type41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getBoxedType(type41);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type44);
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray45);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str49 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray45, type48);
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(signature46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray51);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isArray(type13);
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        int int13 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int16 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type21);
        boolean boolean23 = org.mockito.cglib.core.TypeUtils.isArray(type21);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type15, type18, type21 };
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray27);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray27);
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray33);
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray33);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(signature28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(signature35);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang.hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type27);
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type27);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type27);
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type27);
        int int35 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type27);
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.hi!" + "'", str28, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.java$2Elang");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type2);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.Class<?> wildcardClass7 = typeArray5.getClass();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.Class<?> wildcardClass11 = typeArray9.getClass();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class<?> wildcardClass15 = typeArray13.getClass();
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class<?> wildcardClass19 = typeArray17.getClass();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass3, wildcardClass7, wildcardClass11, wildcardClass15, wildcardClass19, wildcardClass23 };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        java.lang.String[] strArray37 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        java.lang.Class<?> wildcardClass39 = strArray37.getClass();
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass42 = type41.getClass();
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass45 = type44.getClass();
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature48 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray47);
        java.lang.Class<?> wildcardClass49 = typeArray47.getClass();
        java.lang.String[] strArray51 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray51);
        java.lang.Class<?> wildcardClass53 = strArray51.getClass();
        java.lang.Class[] classArray54 = new java.lang.Class[] { wildcardClass39, wildcardClass42, wildcardClass45, wildcardClass49, wildcardClass53 };
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.getTypes(classArray54);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.getTypes(classArray54);
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int59 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type58);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type61);
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str65 = org.mockito.cglib.core.TypeUtils.getClassName(type64);
        boolean boolean66 = org.mockito.cglib.core.TypeUtils.isArray(type64);
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type58, type61, type64 };
        java.lang.String[] strArray68 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray67);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray56, typeArray67);
        java.lang.String[] strArray73 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray73);
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.add(typeArray74, typeArray76);
        java.lang.String[] strArray81 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray81);
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.TypeUtils.add(typeArray77, typeArray82);
        org.mockito.asm.Type type85 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type86 = org.mockito.cglib.core.TypeUtils.getBoxedType(type85);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray82, type86);
        org.mockito.asm.Type type89 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean90 = org.mockito.cglib.core.TypeUtils.isArray(type89);
        boolean boolean91 = org.mockito.cglib.core.TypeUtils.isArray(type89);
        org.mockito.asm.Type[] typeArray92 = org.mockito.cglib.core.TypeUtils.add(typeArray82, type89);
        org.mockito.asm.Type type93 = org.mockito.cglib.core.TypeUtils.getBoxedType(type89);
        java.lang.String str94 = org.mockito.cglib.core.TypeUtils.getClassName(type93);
        java.lang.String str95 = org.mockito.cglib.core.TypeUtils.getClassName(type93);
        org.mockito.asm.Type type96 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type93);
        org.mockito.asm.Type[] typeArray97 = org.mockito.cglib.core.TypeUtils.add(typeArray69, type93);
        java.lang.String[] strArray98 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray69);
        org.mockito.asm.Type[] typeArray99 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray69);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(signature48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "java.lang.hi!" + "'", str62, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang.hi!" + "'", str65, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertNotNull(type85);
        org.junit.Assert.assertNotNull(type86);
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertNotNull(type89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(typeArray92);
        org.junit.Assert.assertNotNull(type93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!" + "'", str95, "hi!");
        org.junit.Assert.assertNotNull(type96);
        org.junit.Assert.assertNotNull(typeArray97);
        org.junit.Assert.assertNotNull(strArray98);
        org.junit.Assert.assertNotNull(typeArray99);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type3);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type19);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getBoxedType(type19);
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type23);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type25);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getComponentType(type25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type5);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$2Elang$2Ehi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type8);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        java.lang.Class<?> wildcardClass5 = type2.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type6);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        int int12 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray10);
        int int13 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray10);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        int int17 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray15);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(signature16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(signature18);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type6);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray9);
        int int11 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray9);
        int int12 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray9);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray9);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isPrimitive(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getBoxedType(type20);
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getBoxedType(type23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type25);
        java.lang.Class<?> wildcardClass27 = typeArray26.getClass();
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.getClassName(type32);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type32);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type32);
        java.lang.String[] strArray39 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray40);
        java.lang.Class<?> wildcardClass42 = typeArray29.getClass();
        java.lang.String[] strArray46 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray46);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray47, typeArray49);
        java.lang.String[] strArray54 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray54);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray50, typeArray55);
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.getBoxedType(type58);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray55, type59);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean63 = org.mockito.cglib.core.TypeUtils.isArray(type62);
        boolean boolean64 = org.mockito.cglib.core.TypeUtils.isArray(type62);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray55, type62);
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type62);
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.getBoxedType(type62);
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.getClassName(type67);
        boolean boolean69 = org.mockito.cglib.core.TypeUtils.isArray(type67);
        java.lang.Class<?> wildcardClass70 = type67.getClass();
        java.lang.String[] strArray74 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray74);
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.add(typeArray75, typeArray77);
        java.lang.String[] strArray82 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray82);
        org.mockito.asm.Type[] typeArray84 = org.mockito.cglib.core.TypeUtils.add(typeArray78, typeArray83);
        java.lang.Class<?> wildcardClass85 = typeArray83.getClass();
        java.lang.Class[] classArray86 = new java.lang.Class[] { wildcardClass27, wildcardClass42, wildcardClass70, wildcardClass85 };
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.getTypes(classArray86);
        org.mockito.asm.Type[] typeArray88 = org.mockito.cglib.core.TypeUtils.getTypes(classArray86);
        org.mockito.asm.Type[] typeArray89 = org.mockito.cglib.core.TypeUtils.getTypes(classArray86);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(signature30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang.hi!" + "'", str33, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertNotNull(typeArray84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(classArray86);
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertNotNull(typeArray88);
        org.junit.Assert.assertNotNull(typeArray89);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isPrimitive(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getType("java.lang.java$242Elang$242Ehi!");
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type22);
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type8);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getPackageName(type8);
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isArray(type8);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang" + "'", str12, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$2Elang$2Ejava$242Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isPrimitive(type6);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type10);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type14);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        int int22 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type3, type8, type10, type14, type19 };
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type25);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.getClassName(type30);
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type30);
        boolean boolean33 = org.mockito.cglib.core.TypeUtils.isArray(type30);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getPackageName(type30);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isArray(type28);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type22, type25, type28 };
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray31);
        java.lang.String[] strArray37 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray46);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.getBoxedType(type49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isArray(type53);
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isArray(type53);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type53);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        java.lang.String str58 = org.mockito.cglib.core.TypeUtils.getClassName(type57);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.getClassName(type57);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type57);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type57);
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getType("java.lang.hi!");
        java.lang.String str64 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type63);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type63);
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type63);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.lang.hi!" + "'", str64, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(type66);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type5);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isArray(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$24242424242Elang");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$2424242Elang$2424242EJava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        int int5 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray4);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$2Elang$2Ejava$24242Elang$24242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isPrimitive(type39);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getBoxedType(type39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray37, type41);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type23, type26, type29 };
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.cglib.core.Signature signature34 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray32);
        java.lang.String[] strArray35 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.cglib.core.Signature signature36 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray32);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray38);
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray38);
        org.mockito.cglib.core.Signature signature41 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray38);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray38);
        java.lang.String[] strArray44 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray44);
        java.lang.Class<?> wildcardClass46 = strArray44.getClass();
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass49 = type48.getClass();
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass52 = type51.getClass();
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature55 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray54);
        java.lang.Class<?> wildcardClass56 = typeArray54.getClass();
        java.lang.String[] strArray58 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray58);
        java.lang.Class<?> wildcardClass60 = strArray58.getClass();
        java.lang.Class[] classArray61 = new java.lang.Class[] { wildcardClass46, wildcardClass49, wildcardClass52, wildcardClass56, wildcardClass60 };
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.getTypes(classArray61);
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.getTypes(classArray61);
        java.lang.String[] strArray64 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray63);
        java.lang.String[] strArray65 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray63);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray63);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray63);
        int int68 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray63);
        int int69 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray63);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(signature21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(signature34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(signature36);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(signature40);
        org.junit.Assert.assertNotNull(signature41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(signature55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 5 + "'", int68 == 5);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 5 + "'", int69 == 5);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.Class<?> wildcardClass6 = type4.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int14 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getClassName(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type13, type16, type19 };
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray22);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int29 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type28);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type34);
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isArray(type34);
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type28, type31, type34 };
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.cglib.core.Signature signature39 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray37);
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray37);
        org.mockito.cglib.core.Signature signature42 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray26);
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.hi!" + "'", str32, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(signature39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(signature42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$2424242424242Elang$2424242424242Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type19);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getBoxedType(type24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type25);
        java.lang.String[] strArray28 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray28);
        java.lang.Class<?> wildcardClass30 = strArray28.getClass();
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature33 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray32);
        java.lang.Class<?> wildcardClass34 = typeArray32.getClass();
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature37 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray36);
        java.lang.Class<?> wildcardClass38 = typeArray36.getClass();
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature41 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray40);
        java.lang.Class<?> wildcardClass42 = typeArray40.getClass();
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature45 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray44);
        java.lang.Class<?> wildcardClass46 = typeArray44.getClass();
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature49 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray48);
        java.lang.Class<?> wildcardClass50 = typeArray48.getClass();
        java.lang.Class[] classArray51 = new java.lang.Class[] { wildcardClass30, wildcardClass34, wildcardClass38, wildcardClass42, wildcardClass46, wildcardClass50 };
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.getTypes(classArray51);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.getTypes(classArray51);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.getTypes(classArray51);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray57 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray56);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray54, typeArray56);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str61 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type60);
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.getClassName(type60);
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getBoxedType(type60);
        int int64 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type63);
        java.lang.String str65 = org.mockito.cglib.core.TypeUtils.getClassName(type63);
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type63);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray58, type63);
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.getPackageName(type63);
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type63);
        java.lang.String str70 = org.mockito.cglib.core.TypeUtils.getClassName(type63);
        boolean boolean71 = org.mockito.cglib.core.TypeUtils.isPrimitive(type63);
        java.lang.String str72 = org.mockito.cglib.core.TypeUtils.getClassName(type63);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type63);
        org.mockito.asm.Type type74 = org.mockito.cglib.core.TypeUtils.getBoxedType(type63);
        java.lang.String str75 = org.mockito.cglib.core.TypeUtils.getClassName(type74);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(signature33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(signature37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(signature41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(signature45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(signature49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "java.lang.hi!" + "'", str61, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "java.lang.hi!" + "'", str62, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang.hi!" + "'", str65, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "java.lang" + "'", str68, "java.lang");
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java.lang.hi!" + "'", str70, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "java.lang.hi!" + "'", str72, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "java.lang.hi!" + "'", str75, "java.lang.hi!");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        int int10 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.Java$2Elang$2Ehi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java$242424242Elang");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.Hi!" + "'", str4, "java.lang.Hi!");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$242424242Elang$242424242Ejava$24242424242424242Elang$24242424242424242Ehi!");
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type6);
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type16, type19, type22 };
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        int int27 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray25);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isPrimitive(type29);
        int int31 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type29);
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type29);
        boolean boolean34 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type29);
        org.mockito.cglib.core.Signature signature36 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray25);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray25);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray37);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.hi!" + "'", str32, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(signature36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isArray(type5);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray7);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        java.lang.Class<?> wildcardClass11 = typeArray10.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
}

