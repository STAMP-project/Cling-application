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
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang.java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.java$24242Elang$24242EJava$2424242Elang$2424242Ehi!" + "'", str2, "java.lang.java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
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
        org.junit.Assert.assertNotNull(type14);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type7);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getComponentType(type5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        int int2 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getComponentType(type15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LHi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(typeArray17);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray38);
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
        org.junit.Assert.assertNotNull(strArray39);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type L; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type8);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isArray(type14);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type8, type11, type14 };
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray17);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
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
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray50);
        org.mockito.cglib.core.Signature signature52 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray51);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(signature3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(signature19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
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
        org.junit.Assert.assertNotNull(signature52);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang$2Ehi!");
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type4);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java$2Elang$2Ehi!" + "'", str10, "java$2Elang$2Ehi!");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$2424242424242Elang$2424242424242Ehi!");
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type26);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.getPackageName(type26);
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$242424242424242Elang$242424242424242Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/Java$242424242424242Elang$242424242424242Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isArray(type5);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type5);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type5);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type5);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$24242Elang$24242Ehi!");
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type5);
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(signature7);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        java.lang.String[] strArray27 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int42 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.getClassName(type47);
        boolean boolean49 = org.mockito.cglib.core.TypeUtils.isArray(type47);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type41, type44, type47 };
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.cglib.core.Signature signature52 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray50);
        java.lang.String[] strArray53 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray50);
        java.lang.String[] strArray58 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray58);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray59, typeArray61);
        int int63 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray61);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type65);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type66);
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type66);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type68);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray50);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray31);
        int int72 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray19);
        org.mockito.asm.Type type74 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean75 = org.mockito.cglib.core.TypeUtils.isPrimitive(type74);
        org.mockito.asm.Type type76 = org.mockito.cglib.core.TypeUtils.getBoxedType(type74);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type76);
        org.mockito.asm.Type type78 = org.mockito.cglib.core.TypeUtils.getBoxedType(type77);
        org.mockito.asm.Type type79 = org.mockito.cglib.core.TypeUtils.getBoxedType(type77);
        int int80 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type77);
        org.mockito.asm.Type type81 = org.mockito.cglib.core.TypeUtils.getBoxedType(type77);
        java.lang.String str82 = org.mockito.cglib.core.TypeUtils.getClassName(type77);
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type77);
        int int84 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type77);
        java.lang.Class<?> wildcardClass85 = type77.getClass();
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
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(signature52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 3 + "'", int72 == 3);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(type78);
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(type81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "java.lang.hi!" + "'", str82, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getComponentType(type28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.hi!" + "'", str32, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java.lang.java$2Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang" + "'", str1, "java.lang");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$2424242Elang");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
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
        org.junit.Assert.assertNotNull(type15);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int42 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.getClassName(type47);
        boolean boolean49 = org.mockito.cglib.core.TypeUtils.isArray(type47);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type41, type44, type47 };
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.cglib.core.Signature signature52 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray50);
        int int53 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray50);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray50);
        org.mockito.cglib.core.Signature signature55 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.cglib.core.Signature signature56 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(signature52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(signature55);
        org.junit.Assert.assertNotNull(signature56);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        java.lang.String str41 = org.mockito.cglib.core.TypeUtils.getPackageName(type36);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type36);
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.getClassName(type42);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java.lang" + "'", str41, "java.lang");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type21);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type21);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getClassName(type21);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type21);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type21);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
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
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$24242Elang$24242Ejava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2424242Elang$2424242Ejava$242424242Elang$242424242Ehi!" + "'", str1, "Java$2424242Elang$2424242Ejava$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$242Elang$242Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.java$242Elang$242Ehi!" + "'", str3, "java.lang.java$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type19);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getPackageName(type19);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.getPackageName(type19);
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
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$2Elang");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type18);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type18);
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
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type28);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
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
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type32);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        boolean boolean43 = org.mockito.cglib.core.TypeUtils.isPrimitive(type41);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type21);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type21);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getClassName(type21);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type21);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type21);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
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
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.Class<?> wildcardClass5 = type1.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[] { wildcardClass5 };
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java.lang.Java$2Elang$2Ehi!");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.getPackageName(type9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type9);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Java.lang" + "'", str11, "Java.lang");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(signature13);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Hi!");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature5 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type7);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type7);
        java.lang.Class<?> wildcardClass11 = typeArray10.getClass();
        java.lang.Class[] classArray12 = new java.lang.Class[] { wildcardClass2, wildcardClass11 };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(signature5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$242424242Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java$242Elang$242Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java$242Elang$242Ehi!" + "'", str3, "java$242Elang$242Ehi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang$242EJava$242424242Elang$242424242Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$242Elang$242Ejava$24242424242Elang$24242424242Ehi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        int int3 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        java.lang.String[] strArray58 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray57);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray58);
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
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(typeArray59);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$242424242Elang$242424242Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.java$242424242Elang$242424242Ehi!" + "'", str3, "java.lang.java$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isPrimitive(type34);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getBoxedType(type34);
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.getClassName(type34);
        java.lang.Class<?> wildcardClass38 = type34.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[] { wildcardClass38 };
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.getTypes(classArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.getTypes(classArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.getTypes(classArray39);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray42);
        org.mockito.cglib.core.Signature signature44 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray42);
        org.mockito.cglib.core.Signature signature45 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray42);
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
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(signature44);
        org.junit.Assert.assertNotNull(signature45);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$242Elang$242EJava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242Elang$242EJava$242424242Elang$242424242Ehi!" + "'", str1, "Java$242Elang$242EJava$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2EJava$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$2Elang$2Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$2424242Elang$2424242EJava$2424242424242Elang$2424242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        java.lang.Class<?> wildcardClass39 = strArray38.getClass();
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
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type2);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        int int12 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray10);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isPrimitive(type14);
        int int16 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type14);
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type14);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type14);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type22);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type8);
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
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type4);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        int int11 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LHi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getBoxedType(type19);
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
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getBoxedType(type24);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type25);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getClassName(type26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type26);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang");
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getBoxedType(type30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type30);
        boolean boolean33 = org.mockito.cglib.core.TypeUtils.isArray(type30);
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
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java.lang.Java$2Elang$2Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        java.lang.Class<?> wildcardClass22 = strArray21.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[] { wildcardClass22 };
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        org.mockito.cglib.core.Signature signature26 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(signature26);
        org.junit.Assert.assertNotNull(signature27);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean27 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type26);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.Java$24242Elang$24242Ehi!");
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type31);
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.getPackageName(type31);
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
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang" + "'", str33, "java.lang");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        java.lang.String[] strArray74 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
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
        org.junit.Assert.assertNotNull(strArray74);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2424242424242Elang$2424242424242Ehi!");
        int int2 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        java.lang.Class<?> wildcardClass41 = typeArray32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        int int61 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type60);
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.getClassName(type30);
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type30);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type30);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type34);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type34);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getBoxedType(type34);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getBoxedType(type37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type38);
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
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(signature28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.hi!" + "'", str32, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray39);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature33 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray32);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.getClassName(type35);
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type35);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type35);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray39);
        java.lang.String[] strArray44 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray44);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray45, typeArray47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray45);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int54 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type53);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type56);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str60 = org.mockito.cglib.core.TypeUtils.getClassName(type59);
        boolean boolean61 = org.mockito.cglib.core.TypeUtils.isArray(type59);
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type53, type56, type59 };
        java.lang.String[] strArray63 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray62);
        org.mockito.cglib.core.Signature signature64 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray62);
        java.lang.String[] strArray65 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray62);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray51, typeArray62);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray62);
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str70 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type69);
        java.lang.String str71 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type69);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type69);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray39);
        int int74 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray73);
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
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(signature33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "java.lang.hi!" + "'", str57, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "java.lang.hi!" + "'", str60, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(signature64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java.lang.hi!" + "'", str70, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "java.lang.hi!" + "'", str71, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 6 + "'", int74 == 6);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$24242424242Elang$24242424242EJava$2424242424242Elang$2424242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getBoxedType(type41);
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
        org.junit.Assert.assertNotNull(type43);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$2Elang$2EJava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$242Elang$242EJava$242424242Elang$242424242Ehi!" + "'", str1, "java$242Elang$242EJava$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type7);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray9);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray11);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$242Elang");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray5);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray8);
        int int10 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray8);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        int int17 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        java.lang.String[] strArray41 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray39);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int46 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type45);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str49 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type48);
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str52 = org.mockito.cglib.core.TypeUtils.getClassName(type51);
        boolean boolean53 = org.mockito.cglib.core.TypeUtils.isArray(type51);
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type45, type48, type51 };
        java.lang.String[] strArray55 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray54);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int58 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type57);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str61 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type60);
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str64 = org.mockito.cglib.core.TypeUtils.getClassName(type63);
        boolean boolean65 = org.mockito.cglib.core.TypeUtils.isArray(type63);
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type57, type60, type63 };
        java.lang.String[] strArray67 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray66);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray54, typeArray66);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray42, typeArray68);
        org.mockito.asm.Type type71 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean72 = org.mockito.cglib.core.TypeUtils.isPrimitive(type71);
        org.mockito.asm.Type type73 = org.mockito.cglib.core.TypeUtils.getBoxedType(type71);
        java.lang.String str74 = org.mockito.cglib.core.TypeUtils.getClassName(type71);
        java.lang.String str75 = org.mockito.cglib.core.TypeUtils.getClassName(type71);
        boolean boolean76 = org.mockito.cglib.core.TypeUtils.isPrimitive(type71);
        java.lang.String str77 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type71);
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.add(typeArray68, type71);
        org.mockito.asm.Type type80 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int81 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type80);
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str84 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type83);
        org.mockito.asm.Type type86 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str87 = org.mockito.cglib.core.TypeUtils.getClassName(type86);
        boolean boolean88 = org.mockito.cglib.core.TypeUtils.isArray(type86);
        org.mockito.asm.Type[] typeArray89 = new org.mockito.asm.Type[] { type80, type83, type86 };
        java.lang.String[] strArray90 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray89);
        int int91 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray89);
        org.mockito.cglib.core.Signature signature92 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray89);
        org.mockito.asm.Type[] typeArray93 = org.mockito.cglib.core.TypeUtils.add(typeArray78, typeArray89);
        org.mockito.asm.Type[] typeArray94 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray89);
        org.mockito.asm.Type[] typeArray95 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray16);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(typeArray22);
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
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(signature40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.lang.hi!" + "'", str49, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java.lang.hi!" + "'", str52, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "java.lang.hi!" + "'", str61, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.lang.hi!" + "'", str64, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "java.lang.hi!" + "'", str74, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "java.lang.hi!" + "'", str75, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "java.lang.hi!" + "'", str77, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "java.lang.hi!" + "'", str84, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "java.lang.hi!" + "'", str87, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(typeArray89);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 3 + "'", int91 == 3);
        org.junit.Assert.assertNotNull(signature92);
        org.junit.Assert.assertNotNull(typeArray93);
        org.junit.Assert.assertNotNull(typeArray94);
        org.junit.Assert.assertNotNull(typeArray95);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean27 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type26);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
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
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type24);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type24);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray28);
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("java$242Elang$242EJava$24242Elang$24242Ehi!");
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type33);
        java.lang.String[] strArray35 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
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
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.hi!" + "'", str25, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(signature30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(typeArray36);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang.hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java$2Elang$2EJava$242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$2424242Elang$2424242EJava$2424242424242Elang$2424242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2424242Elang$2424242EJava$2424242424242Elang$2424242424242Ehi!" + "'", str1, "Java$2424242Elang$2424242EJava$2424242424242Elang$2424242424242Ehi!");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type66);
        boolean boolean78 = org.mockito.cglib.core.TypeUtils.isArray(type66);
        boolean boolean79 = org.mockito.cglib.core.TypeUtils.isArray(type66);
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
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        org.mockito.cglib.core.Signature signature63 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray33);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.parseType("Hi!");
        java.lang.Class<?> wildcardClass66 = type65.getClass();
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature69 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray68);
        org.mockito.asm.Type type71 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str72 = org.mockito.cglib.core.TypeUtils.getClassName(type71);
        java.lang.String str73 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type71);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray68, type71);
        java.lang.Class<?> wildcardClass75 = typeArray74.getClass();
        java.lang.Class[] classArray76 = new java.lang.Class[] { wildcardClass66, wildcardClass75 };
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.getTypes(classArray76);
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.getTypes(classArray76);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.getTypes(classArray76);
        org.mockito.asm.Type[] typeArray80 = org.mockito.cglib.core.TypeUtils.add(typeArray33, typeArray79);
        int int81 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray79);
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
        org.junit.Assert.assertNotNull(signature63);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(signature69);
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "java.lang.hi!" + "'", str72, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "java.lang.hi!" + "'", str73, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        int int18 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray10);
        int int19 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$242Elang$242Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.java$242Elang$242Ehi!" + "'", str3, "java.lang.java$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.java$242Elang$242Ehi!" + "'", str5, "java.lang.java$242Elang$242Ehi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        java.lang.String str41 = org.mockito.cglib.core.TypeUtils.getPackageName(type36);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type36);
        boolean boolean43 = org.mockito.cglib.core.TypeUtils.isArray(type42);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java.lang" + "'", str41, "java.lang");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$24242424242Elang$24242424242Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.Java$24242424242Elang$24242424242Ehi!" + "'", str3, "java.lang.Java$24242424242Elang$24242424242Ehi!");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.mockito.asm.Type[] typeArray0 = null;
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isArray(type8);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type2, type5, type8 };
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray14);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isArray(type28);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type22, type25, type28 };
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray34);
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray34);
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.cglib.core.Signature signature39 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray37);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray37);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray0, typeArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(signature15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(strArray18);
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
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(signature35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(signature39);
        org.junit.Assert.assertNotNull(typeArray40);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type36);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getBoxedType(type36);
        java.lang.String str41 = org.mockito.cglib.core.TypeUtils.getPackageName(type36);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hi!" + "'", str38, "Hi!");
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getPackageName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.getPackageName(type9);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$242424242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242424242Elang" + "'", str1, "Java$242424242Elang");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        java.lang.String str41 = org.mockito.cglib.core.TypeUtils.getPackageName(type36);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type36);
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        boolean boolean44 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java.lang" + "'", str41, "java.lang");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(signature6);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        java.lang.String[] strArray16 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type22);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getBoxedType(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type29);
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        int int36 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type33);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean39 = org.mockito.cglib.core.TypeUtils.isPrimitive(type38);
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type38);
        int int41 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type38);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type22, type27, type29, type33, type38 };
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.getBoxedType(type44);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray42, type44);
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type44);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type44);
        java.lang.Class[] classArray49 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.getTypes(classArray49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.getTypes(classArray49);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray48, typeArray51);
        java.lang.String[] strArray54 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray54);
        java.lang.Class<?> wildcardClass56 = strArray54.getClass();
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature59 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray58);
        java.lang.Class<?> wildcardClass60 = typeArray58.getClass();
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature63 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray62);
        java.lang.Class<?> wildcardClass64 = typeArray62.getClass();
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature67 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray66);
        java.lang.Class<?> wildcardClass68 = typeArray66.getClass();
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature71 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray70);
        java.lang.Class<?> wildcardClass72 = typeArray70.getClass();
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature75 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray74);
        java.lang.Class<?> wildcardClass76 = typeArray74.getClass();
        java.lang.Class[] classArray77 = new java.lang.Class[] { wildcardClass56, wildcardClass60, wildcardClass64, wildcardClass68, wildcardClass72, wildcardClass76 };
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.getTypes(classArray77);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.add(typeArray48, typeArray78);
        int int80 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray79);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray79);
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean84 = org.mockito.cglib.core.TypeUtils.isArray(type83);
        org.mockito.asm.Type type85 = org.mockito.cglib.core.TypeUtils.getBoxedType(type83);
        int int86 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type85);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray81, type85);
        java.lang.String str88 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type85);
        boolean boolean89 = org.mockito.cglib.core.TypeUtils.isPrimitive(type85);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(signature59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(signature63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(signature67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(signature71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(signature75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(classArray77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(type85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Hi!" + "'", str88, "Hi!");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$24242Elang$24242Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        java.lang.String[] strArray66 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray66);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray67, typeArray69);
        int int71 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray69);
        org.mockito.asm.Type type73 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type74 = org.mockito.cglib.core.TypeUtils.getBoxedType(type73);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray69, type74);
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.add(typeArray33, typeArray75);
        int int77 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray75);
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
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        int int72 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray71);
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 6 + "'", int72 == 6);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.Class<?> wildcardClass9 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getBoxedType(type55);
        boolean boolean61 = org.mockito.cglib.core.TypeUtils.isArray(type55);
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
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$242Elang$242Ejava$24242424242Elang$24242424242Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Java$242Elang$242Ejava$24242424242Elang$24242424242Ehi!" + "'", str3, "Java$242Elang$242Ejava$24242424242Elang$24242424242Ehi!");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java.lang.Java$242Elang$242EJava$24242Elang$24242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isPrimitive(type8);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type6);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getBoxedType(type20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type22);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type6);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getClassName(type26);
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isArray(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getBoxedType(type26);
        int int30 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type26);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.getClassName(type26);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getPackageName(type26);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type26);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getBoxedType(type26);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type37);
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getPackageName(type37);
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
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang.hi!" + "'", str33, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang" + "'", str34, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang" + "'", str39, "java.lang");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Hi!");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature5 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type7);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type7);
        java.lang.Class<?> wildcardClass11 = typeArray10.getClass();
        java.lang.Class[] classArray12 = new java.lang.Class[] { wildcardClass2, wildcardClass11 };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type22);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type24);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$2424242Elang$2424242Ejava$242424242424242Elang$242424242424242Ehi!");
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type28);
        int int30 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray29);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(signature5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.hi!" + "'", str25, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type19);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type19);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type19);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.getPackageName(type19);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getPackageName(type19);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type19);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(type25);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type37);
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type37);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getBoxedType(type37);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type40);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.getClassName(type43);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type43);
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.getBoxedType(type45);
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.getClassName(type47);
        java.lang.String str49 = org.mockito.cglib.core.TypeUtils.getPackageName(type47);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type47);
        boolean boolean51 = org.mockito.cglib.core.TypeUtils.isPrimitive(type47);
        java.lang.String str52 = org.mockito.cglib.core.TypeUtils.getClassName(type47);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang.Java$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type5);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isArray(type5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2EJava$242Elang$242Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type3);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray7);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$242424242424242Elang$242424242424242Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("Java$2Elang");
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type3);
        int int5 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray4);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type28);
        java.lang.String[] strArray33 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$24242Elang$24242Ehi!");
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type38);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getComponentType(type38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava$24242Elang$24242Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        java.lang.String[] strArray16 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type22);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getBoxedType(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type29);
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        int int36 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type33);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean39 = org.mockito.cglib.core.TypeUtils.isPrimitive(type38);
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type38);
        int int41 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type38);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type22, type27, type29, type33, type38 };
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.getBoxedType(type44);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray42, type44);
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type44);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type44);
        java.lang.Class[] classArray49 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.getTypes(classArray49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.getTypes(classArray49);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray48, typeArray51);
        java.lang.String[] strArray54 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray54);
        java.lang.Class<?> wildcardClass56 = strArray54.getClass();
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature59 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray58);
        java.lang.Class<?> wildcardClass60 = typeArray58.getClass();
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature63 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray62);
        java.lang.Class<?> wildcardClass64 = typeArray62.getClass();
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature67 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray66);
        java.lang.Class<?> wildcardClass68 = typeArray66.getClass();
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature71 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray70);
        java.lang.Class<?> wildcardClass72 = typeArray70.getClass();
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature75 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray74);
        java.lang.Class<?> wildcardClass76 = typeArray74.getClass();
        java.lang.Class[] classArray77 = new java.lang.Class[] { wildcardClass56, wildcardClass60, wildcardClass64, wildcardClass68, wildcardClass72, wildcardClass76 };
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.getTypes(classArray77);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.add(typeArray48, typeArray78);
        int int80 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray79);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray79);
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean84 = org.mockito.cglib.core.TypeUtils.isArray(type83);
        org.mockito.asm.Type type85 = org.mockito.cglib.core.TypeUtils.getBoxedType(type83);
        int int86 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type85);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray81, type85);
        java.lang.String str88 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type85);
        boolean boolean89 = org.mockito.cglib.core.TypeUtils.isArray(type85);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(signature59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(signature63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(signature67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(signature71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(signature75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(classArray77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(type85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Hi!" + "'", str88, "Hi!");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getBoxedType(type9);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type9);
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getBoxedType(type9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(type13);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type24);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type24);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray28);
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("java$242Elang$242EJava$24242Elang$24242Ehi!");
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
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
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.hi!" + "'", str25, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(signature30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang.Java$24242Elang$24242EJava$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$24242Elang$24242Ehi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type6);
        org.mockito.cglib.core.Signature signature8 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        java.lang.Class<?> wildcardClass9 = signature8.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(signature8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
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
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getBoxedType(type36);
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
        org.junit.Assert.assertNotNull(type42);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type21);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type24);
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isArray(type24);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type18, type21, type24 };
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int31 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isArray(type36);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type30, type33, type36 };
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray39);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean44 = org.mockito.cglib.core.TypeUtils.isPrimitive(type43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type43);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray39);
        java.lang.String[] strArray47 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.cglib.core.Signature signature48 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.hi!" + "'", str25, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(signature48);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java.lang.java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang" + "'", str1, "Java.lang");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java.lang.hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.Class<?> wildcardClass6 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$242424242Elang$242424242EJava$242424242424242Elang$242424242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$24242424242Elang$24242424242EJava$2424242424242Elang$2424242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$24242424242Elang$24242424242EJava$2424242424242Elang$2424242424242Ehi!" + "'", str1, "Java$24242424242Elang$24242424242EJava$2424242424242Elang$2424242424242Ehi!");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java.lang.java$2424242Elang$2424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        int int14 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray13);
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
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type6);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Hi!");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature5 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type7);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type7);
        java.lang.Class<?> wildcardClass11 = typeArray10.getClass();
        java.lang.Class[] classArray12 = new java.lang.Class[] { wildcardClass2, wildcardClass11 };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(signature5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        int int11 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java.lang.Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang.Hi!" + "'", str1, "Java.lang.Hi!");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type4);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isArray(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        boolean boolean68 = org.mockito.cglib.core.TypeUtils.isArray(type62);
        int int69 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type62);
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type21);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type21);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getClassName(type21);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type21);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type21);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        int int29 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        java.lang.String[] strArray34 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray37);
        int int39 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray37);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getBoxedType(type41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray37, type42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray44);
        int int46 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray45);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int49 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type48);
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str52 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type51);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str55 = org.mockito.cglib.core.TypeUtils.getClassName(type54);
        boolean boolean56 = org.mockito.cglib.core.TypeUtils.isArray(type54);
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type48, type51, type54 };
        java.lang.String[] strArray58 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray57);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int61 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type60);
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str64 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type63);
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str67 = org.mockito.cglib.core.TypeUtils.getClassName(type66);
        boolean boolean68 = org.mockito.cglib.core.TypeUtils.isArray(type66);
        org.mockito.asm.Type[] typeArray69 = new org.mockito.asm.Type[] { type60, type63, type66 };
        java.lang.String[] strArray70 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray69);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray57, typeArray69);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray45, typeArray71);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray71);
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
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java.lang.hi!" + "'", str52, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "java.lang.hi!" + "'", str55, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.lang.hi!" + "'", str64, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "java.lang.hi!" + "'", str67, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(typeArray73);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getType("Java$2Elang$2Ehi!");
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type63);
        org.mockito.cglib.core.Signature signature65 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray64);
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
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(signature65);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$2424242Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type6);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isArray(type6);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type6);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$2424242Elang$2424242Ejava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang$2Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$24242Elang$24242Ejava$2424242Elang$2424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        java.lang.Class<?> wildcardClass22 = strArray21.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[] { wildcardClass22 };
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray23);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray27);
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(signature28);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        int int61 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray60);
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang");
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type63);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray60, type64);
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type64);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.getComponentType(type66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava$242Elang; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "java.lang.hi!" + "'", str57, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang.hi!" + "'", str59, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 6 + "'", int61 == 6);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(type66);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type33);
        java.lang.String[] strArray40 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray40);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray41);
        int int43 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray42);
        java.lang.String[] strArray47 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray47);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray48, typeArray50);
        int int52 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray50);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type54);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type55);
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type58);
        java.lang.String str60 = org.mockito.cglib.core.TypeUtils.getClassName(type58);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getBoxedType(type58);
        int int62 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type61);
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type61);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean66 = org.mockito.cglib.core.TypeUtils.isPrimitive(type65);
        int int67 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type65);
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.getClassName(type65);
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type65);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type65);
        java.lang.String[] strArray71 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray71);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature75 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray74);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str78 = org.mockito.cglib.core.TypeUtils.getClassName(type77);
        java.lang.String str79 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type77);
        org.mockito.asm.Type[] typeArray80 = org.mockito.cglib.core.TypeUtils.add(typeArray74, type77);
        java.lang.String[] strArray84 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray84);
        org.mockito.asm.Type[] typeArray86 = org.mockito.cglib.core.TypeUtils.add(typeArray74, typeArray85);
        org.mockito.asm.Type type88 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str89 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type88);
        java.lang.String str90 = org.mockito.cglib.core.TypeUtils.getClassName(type88);
        org.mockito.asm.Type type91 = org.mockito.cglib.core.TypeUtils.getBoxedType(type88);
        org.mockito.asm.Type[] typeArray92 = org.mockito.cglib.core.TypeUtils.add(typeArray74, type88);
        org.mockito.cglib.core.Signature signature93 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray92);
        org.mockito.asm.Type[] typeArray94 = org.mockito.cglib.core.TypeUtils.add(typeArray72, typeArray92);
        org.mockito.asm.Type[] typeArray95 = org.mockito.cglib.core.TypeUtils.add(typeArray42, typeArray92);
        org.mockito.asm.Type[] typeArray96 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray92);
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
        org.junit.Assert.assertNotNull(signature27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(signature31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang.hi!" + "'", str59, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "java.lang.hi!" + "'", str60, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "java.lang.hi!" + "'", str68, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(signature75);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "java.lang.hi!" + "'", str78, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "java.lang.hi!" + "'", str79, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertNotNull(typeArray86);
        org.junit.Assert.assertNotNull(type88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "java.lang.hi!" + "'", str89, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "java.lang.hi!" + "'", str90, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type91);
        org.junit.Assert.assertNotNull(typeArray92);
        org.junit.Assert.assertNotNull(signature93);
        org.junit.Assert.assertNotNull(typeArray94);
        org.junit.Assert.assertNotNull(typeArray95);
        org.junit.Assert.assertNotNull(typeArray96);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type25);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getBoxedType(type30);
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
        org.junit.Assert.assertNotNull(type31);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$2Elang");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.String[] strArray4 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang$242Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Java$242Elang$242Ehi!" + "'", str4, "Java$242Elang$242Ehi!");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isArray(type5);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type5);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type5);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getPackageName(type5);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$24242Elang$24242EJava$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java.lang.java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang$2Ejava$2424242Elang$2424242EJava$242424242Elang$242424242Ehi!" + "'", str1, "Java$2Elang$2Ejava$2424242Elang$2424242EJava$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java.lang");
        java.lang.Class<?> wildcardClass2 = signature1.getClass();
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isArray(type4);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isArray(type4);
        java.lang.Class<?> wildcardClass8 = type4.getClass();
        java.lang.Class[] classArray9 = new java.lang.Class[] { wildcardClass2, wildcardClass8 };
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.getTypes(classArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray15, typeArray17);
        int int19 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray17);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getBoxedType(type21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type22);
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type22);
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(typeArray25);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray7);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray10);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type16);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray13);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type22);
        int int27 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray26);
        java.lang.String[] strArray29 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
        java.lang.Class<?> wildcardClass31 = strArray29.getClass();
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass34 = type33.getClass();
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass37 = type36.getClass();
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        java.lang.Class<?> wildcardClass41 = typeArray39.getClass();
        java.lang.String[] strArray43 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray43);
        java.lang.Class<?> wildcardClass45 = strArray43.getClass();
        java.lang.Class[] classArray46 = new java.lang.Class[] { wildcardClass31, wildcardClass34, wildcardClass37, wildcardClass41, wildcardClass45 };
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray47);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang");
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray26, typeArray50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray3, typeArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray56);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray57, typeArray59);
        java.lang.String[] strArray64 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray64);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray60, typeArray65);
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getBoxedType(type68);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray65, type69);
        org.mockito.asm.Type type72 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean73 = org.mockito.cglib.core.TypeUtils.isArray(type72);
        boolean boolean74 = org.mockito.cglib.core.TypeUtils.isArray(type72);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray65, type72);
        org.mockito.asm.Type type76 = org.mockito.cglib.core.TypeUtils.getBoxedType(type72);
        java.lang.String str77 = org.mockito.cglib.core.TypeUtils.getClassName(type76);
        java.lang.String str78 = org.mockito.cglib.core.TypeUtils.getClassName(type76);
        org.mockito.asm.Type type79 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type76);
        java.lang.String str80 = org.mockito.cglib.core.TypeUtils.getClassName(type76);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.add(typeArray51, type76);
        int int82 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type76);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.hi!" + "'", str25, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(signature40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type18);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
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
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type8);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type36);
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Hi!" + "'", str38, "Hi!");
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$24242424242424242424242Elang$24242424242424242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$24242Elang$24242Ejava$2424242424242Elang$2424242424242Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.java$24242Elang$24242Ejava$2424242424242Elang$2424242424242Ehi!" + "'", str2, "java.lang.java$24242Elang$24242Ejava$2424242424242Elang$2424242424242Ehi!");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type3);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getBoxedType(type16);
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
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
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java$2424242424242Elang$2424242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
        int int24 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray22);
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray22);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.getClassName(type31);
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type31);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isPrimitive(type35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type35);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray37);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(signature29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.hi!" + "'", str32, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang.hi!" + "'", str33, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(signature38);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type4);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type21);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type24);
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isArray(type24);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type18, type21, type24 };
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int31 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isArray(type36);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type30, type33, type36 };
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray39);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean44 = org.mockito.cglib.core.TypeUtils.isPrimitive(type43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type43);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray39);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str49 = org.mockito.cglib.core.TypeUtils.getClassName(type48);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.getBoxedType(type48);
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.getPackageName(type50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type50);
        boolean boolean53 = org.mockito.cglib.core.TypeUtils.isArray(type50);
        java.lang.String str54 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.hi!" + "'", str25, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.lang.hi!" + "'", str49, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang" + "'", str51, "java.lang");
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "java.lang.hi!" + "'", str54, "java.lang.hi!");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type17);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type11, type14, type17 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type25);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray29);
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray32);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(signature31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Hi!");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature5 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type7);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type7);
        java.lang.Class<?> wildcardClass11 = typeArray10.getClass();
        java.lang.Class[] classArray12 = new java.lang.Class[] { wildcardClass2, wildcardClass11 };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        int int21 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(signature5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$242424242Elang$242424242EJava$242424242424242Elang$242424242424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getComponentType(type7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type14);
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type14);
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
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray21);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java.lang.Java$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang.Java$24242424242Elang$24242424242Ehi!" + "'", str1, "Java.lang.Java$24242424242Elang$24242424242Ehi!");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type8);
        int int11 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type8);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java.lang.hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getBoxedType(type43);
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.getClassName(type43);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type43);
        int int47 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type43);
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.getPackageName(type43);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type43);
        int int50 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type49);
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
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang" + "'", str48, "java.lang");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type7);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        int int10 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("Java.lang.hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type12);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Java.lang.hi!" + "'", str13, "Java.lang.hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray9);
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
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray27);
        int int29 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray27);
        int int30 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray27);
        java.lang.String[] strArray34 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray37);
        int int39 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray37);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getBoxedType(type41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray37, type42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray37);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray27);
        int int46 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray27);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(typeArray7);
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
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang$2Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java$2Elang$2Ehi!" + "'", str2, "java$2Elang$2Ehi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$2Elang$2EJava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        org.mockito.cglib.core.Signature signature42 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray36);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.getClassName(type44);
        boolean boolean46 = org.mockito.cglib.core.TypeUtils.isArray(type44);
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.getClassName(type44);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getBoxedType(type44);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.getBoxedType(type48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type49);
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str53 = org.mockito.cglib.core.TypeUtils.getClassName(type52);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type52);
        java.lang.String str55 = org.mockito.cglib.core.TypeUtils.getClassName(type54);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getBoxedType(type54);
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.getPackageName(type56);
        java.lang.String str58 = org.mockito.cglib.core.TypeUtils.getPackageName(type56);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.getClassName(type56);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type56);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getBoxedType(type56);
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
        org.junit.Assert.assertNotNull(signature42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.lang.hi!" + "'", str47, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(type61);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java$242Elang");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java$242Elang" + "'", str2, "java$242Elang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java$242Elang" + "'", str3, "java$242Elang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java$242Elang" + "'", str6, "java$242Elang");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type4);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.getPackageName(type27);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getComponentType(type27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.hi!" + "'", str28, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang" + "'", str33, "java.lang");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$242Elang$242Ehi!");
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type40);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type40);
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
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type42);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang.hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$2Elang");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.Java$2Elang" + "'", str2, "java.lang.Java$2Elang");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        java.lang.Class<?> wildcardClass43 = type36.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$2Elang");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.mockito.asm.Type[] typeArray0 = null;
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isArray(type8);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type2, type5, type8 };
        java.lang.String[] strArray12 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray14);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray17);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int22 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type21);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.getClassName(type27);
        boolean boolean29 = org.mockito.cglib.core.TypeUtils.isArray(type27);
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type21, type24, type27 };
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int34 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str40 = org.mockito.cglib.core.TypeUtils.getClassName(type39);
        boolean boolean41 = org.mockito.cglib.core.TypeUtils.isArray(type39);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type33, type36, type39 };
        java.lang.String[] strArray43 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray42);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray30);
        int int46 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray0, typeArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(signature15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.hi!" + "'", str25, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.hi!" + "'", str28, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "java.lang.hi!" + "'", str40, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        int int38 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray37);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getType("java.lang.hi!");
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getBoxedType(type40);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray37, type40);
        int int44 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray37);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type21);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type21);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getClassName(type21);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type21);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type21);
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.getClassName(type32);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type32);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type32);
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.asm.Type type39 = null;
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray38, type39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray40);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(signature27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(signature30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang.hi!" + "'", str33, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$24242Elang$24242Ejava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$24242Elang$24242Ejava$2424242Elang$2424242Ehi!" + "'", str1, "Java$24242Elang$24242Ejava$2424242Elang$2424242Ehi!");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getComponentType(type9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        int int32 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray31);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 7 + "'", int32 == 7);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$2Elang$2Ejava$242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang$2Ejava$242Elang" + "'", str1, "Java$2Elang$2Ejava$242Elang");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getComponentType(type13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type13);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$2424242Elang$2424242EJava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getBoxedType(type59);
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
        org.junit.Assert.assertNotNull(type63);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.getPackageName(type36);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang" + "'", str38, "java.lang");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang$2Ehi!");
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(signature9);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        org.mockito.asm.Type[] typeArray34 = null;
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
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type62);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type62);
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
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray69);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
        java.lang.String[] strArray20 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getClassName(type26);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getBoxedType(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type37);
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type37);
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type37);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean43 = org.mockito.cglib.core.TypeUtils.isPrimitive(type42);
        int int44 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type42);
        int int45 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type42);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type26, type31, type33, type37, type42 };
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.getBoxedType(type48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type48);
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type48);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type48);
        java.lang.Class[] classArray53 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.getTypes(classArray53);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.getTypes(classArray53);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray52, typeArray55);
        java.lang.String[] strArray58 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray58);
        java.lang.Class<?> wildcardClass60 = strArray58.getClass();
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature63 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray62);
        java.lang.Class<?> wildcardClass64 = typeArray62.getClass();
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature67 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray66);
        java.lang.Class<?> wildcardClass68 = typeArray66.getClass();
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature71 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray70);
        java.lang.Class<?> wildcardClass72 = typeArray70.getClass();
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature75 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray74);
        java.lang.Class<?> wildcardClass76 = typeArray74.getClass();
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature79 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray78);
        java.lang.Class<?> wildcardClass80 = typeArray78.getClass();
        java.lang.Class[] classArray81 = new java.lang.Class[] { wildcardClass60, wildcardClass64, wildcardClass68, wildcardClass72, wildcardClass76, wildcardClass80 };
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.getTypes(classArray81);
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.TypeUtils.add(typeArray52, typeArray82);
        java.lang.String[] strArray84 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray52);
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray84);
        org.mockito.asm.Type[] typeArray86 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray85);
        int int87 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray85);
        java.lang.String[] strArray88 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray85);
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.hi!" + "'", str28, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(signature63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(signature67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(signature71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(signature75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(signature79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(classArray81);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertNotNull(typeArray86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 4 + "'", int87 == 4);
        org.junit.Assert.assertNotNull(strArray88);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java.lang.Hi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type3);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.cglib.core.Signature signature5 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        java.lang.Class<?> wildcardClass6 = signature5.getClass();
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        java.lang.Class<?> wildcardClass11 = strArray10.getClass();
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type13);
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isArray(type13);
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isArray(type13);
        java.lang.Class<?> wildcardClass17 = type13.getClass();
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java.lang");
        java.lang.Class<?> wildcardClass20 = signature19.getClass();
        java.lang.String[] strArray22 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        java.lang.Class<?> wildcardClass24 = strArray22.getClass();
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        java.lang.Class<?> wildcardClass28 = typeArray26.getClass();
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray30);
        java.lang.Class<?> wildcardClass32 = typeArray30.getClass();
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray34);
        java.lang.Class<?> wildcardClass36 = typeArray34.getClass();
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature39 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray38);
        java.lang.Class<?> wildcardClass40 = typeArray38.getClass();
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature43 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray42);
        java.lang.Class<?> wildcardClass44 = typeArray42.getClass();
        java.lang.Class[] classArray45 = new java.lang.Class[] { wildcardClass24, wildcardClass28, wildcardClass32, wildcardClass36, wildcardClass40, wildcardClass44 };
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.getTypes(classArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.getTypes(classArray45);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.getTypes(classArray45);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.getTypes(classArray45);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.getTypes(classArray45);
        java.lang.Class<?> wildcardClass51 = classArray45.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[] { wildcardClass6, wildcardClass11, wildcardClass17, wildcardClass20, wildcardClass51 };
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(signature5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(signature9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(signature19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(signature27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(signature31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(signature35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(signature39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(signature43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(typeArray59);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type21);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type21);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getClassName(type21);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type21);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type21);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
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
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java$242424242Elang$242424242Ejava$24242424242424242Elang$24242424242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$2Elang$2Ehi!");
        int int2 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.cglib.core.Signature signature5 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(signature5);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java.lang.Java$2Elang$2Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        java.lang.String str41 = org.mockito.cglib.core.TypeUtils.getPackageName(type36);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type36);
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        boolean boolean44 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.getBoxedType(type36);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java.lang" + "'", str41, "java.lang");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(type45);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getPackageName(type26);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang$2Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava$2Elang$2Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java$2Elang$2Ehi!" + "'", str2, "java$2Elang$2Ehi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java$24242Elang$24242Ejava$2424242424242Elang$2424242424242Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$2424242424242Elang$2424242424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$2Elang$2Ejava$242Elang");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$24242424242424242Elang$24242424242424242Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java$24242424242424242Elang$24242424242424242Ehi!" + "'", str2, "Java$24242424242424242Elang$24242424242424242Ehi!");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$242424242424242Elang$242424242424242Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("Java$2Elang");
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        boolean boolean14 = org.mockito.cglib.core.TypeUtils.isArray(type12);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type6, type9, type12 };
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isPrimitive(type20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray15);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(signature17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$242Elang$242EJava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type2);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$242424242424242424242Elang$242424242424242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
        int int67 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray66);
        java.lang.String[] strArray68 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray66);
        org.mockito.cglib.core.Signature signature69 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray66);
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
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(signature69);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ejava$24242Elang$24242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java.lang.Java$24242Elang$24242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$242Elang$242EJava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$2Elang$2Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java$2Elang$2Ehi!" + "'", str2, "Java$2Elang$2Ehi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$242Elang$242Ehi!");
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type40);
        java.lang.String str42 = org.mockito.cglib.core.TypeUtils.getClassName(type40);
        boolean boolean43 = org.mockito.cglib.core.TypeUtils.isArray(type40);
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.getClassName(type40);
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
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "java$242Elang$242Ehi!" + "'", str42, "java$242Elang$242Ehi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java$242Elang$242Ehi!" + "'", str44, "java$242Elang$242Ehi!");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang.java$242Elang$242Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean51 = org.mockito.cglib.core.TypeUtils.isPrimitive(type50);
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.getBoxedType(type50);
        java.lang.String str53 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        java.lang.String str54 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isPrimitive(type50);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type50);
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type50);
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isArray(type50);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type50);
        java.lang.String str60 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
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
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "java.lang.hi!" + "'", str53, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "java.lang.hi!" + "'", str54, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "java.lang.hi!" + "'", str57, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "java.lang.hi!" + "'", str60, "java.lang.hi!");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.java$2Elang");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$242424242Elang");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type5);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        java.lang.String[] strArray74 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray73);
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
        org.junit.Assert.assertNotNull(strArray74);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$2Elang");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang.java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type2);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isArray(type2);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getBoxedType(type55);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getComponentType(type55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(type60);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang.java$24242Elang$24242Ejava$2424242424242Elang$2424242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray9);
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
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray27);
        int int29 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray27);
        int int30 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray27);
        java.lang.String[] strArray34 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray37);
        int int39 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray37);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getBoxedType(type41);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray37, type42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray37);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray27);
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray27);
        java.lang.String[] strArray47 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray47);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(typeArray7);
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
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(signature46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java$242424242Elang$242424242Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava$242424242Elang$242424242Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$24242Elang$24242Ejava$2424242424242Elang$2424242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$24242Elang$24242Ejava$2424242424242Elang$2424242424242Ehi!" + "'", str1, "Java$24242Elang$24242Ejava$2424242424242Elang$2424242424242Ehi!");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
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
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray29);
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
        org.junit.Assert.assertNotNull(signature27);
        org.junit.Assert.assertNotNull(signature28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(typeArray30);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$2Elang$2EJava$242Elang");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$2Elang$2Ejava$242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242Elang$242Ejava$24242Elang" + "'", str1, "Java$242Elang$242Ejava$24242Elang");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
        java.lang.String[] strArray70 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray70);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray71, typeArray73);
        java.lang.String[] strArray78 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray78);
        org.mockito.asm.Type[] typeArray80 = org.mockito.cglib.core.TypeUtils.add(typeArray74, typeArray79);
        org.mockito.asm.Type type82 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.getBoxedType(type82);
        org.mockito.asm.Type[] typeArray84 = org.mockito.cglib.core.TypeUtils.add(typeArray79, type83);
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.add(typeArray65, typeArray79);
        java.lang.String[] strArray86 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray85);
        org.mockito.asm.Type type88 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str89 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type88);
        java.lang.String str90 = org.mockito.cglib.core.TypeUtils.getClassName(type88);
        org.mockito.asm.Type type91 = org.mockito.cglib.core.TypeUtils.getBoxedType(type88);
        int int92 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type91);
        java.lang.String str93 = org.mockito.cglib.core.TypeUtils.getClassName(type91);
        org.mockito.asm.Type type94 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type91);
        org.mockito.asm.Type type95 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type94);
        org.mockito.asm.Type type96 = org.mockito.cglib.core.TypeUtils.getBoxedType(type94);
        boolean boolean97 = org.mockito.cglib.core.TypeUtils.isArray(type96);
        org.mockito.asm.Type[] typeArray98 = org.mockito.cglib.core.TypeUtils.add(typeArray85, type96);
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
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(type82);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertNotNull(typeArray84);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(type88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "java.lang.hi!" + "'", str89, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "java.lang.hi!" + "'", str90, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "java.lang.hi!" + "'", str93, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type94);
        org.junit.Assert.assertNotNull(type95);
        org.junit.Assert.assertNotNull(type96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(typeArray98);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.mockito.asm.Type[] typeArray0 = null;
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java.lang");
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.add(typeArray0, type2);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isArray(type5);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type5);
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type19);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type24);
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isArray(type24);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type24);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type24);
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
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(type28);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.mockito.asm.Type[] typeArray0 = null;
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java.lang");
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.add(typeArray0, type2);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isArray(type5);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type5);
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray3);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type4);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang.hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.Class<?> wildcardClass4 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
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
        int int52 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray51);
        java.lang.String[] strArray53 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray51);
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertNotNull(strArray53);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getPackageName(type15);
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getPackageName(type15);
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type15);
        int int22 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type15);
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type15);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getType("java.lang.hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type27);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang" + "'", str19, "java.lang");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang" + "'", str20, "java.lang");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type17);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type11, type14, type17 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray9, typeArray20);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray20);
        org.mockito.cglib.core.Signature signature26 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray20);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        int int28 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray20);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type33);
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int41 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type40);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.getClassName(type46);
        boolean boolean48 = org.mockito.cglib.core.TypeUtils.isArray(type46);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type40, type43, type46 };
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int53 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type52);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type55);
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.getClassName(type58);
        boolean boolean60 = org.mockito.cglib.core.TypeUtils.isArray(type58);
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type52, type55, type58 };
        java.lang.String[] strArray62 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray61);
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.add(typeArray49, typeArray61);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean66 = org.mockito.cglib.core.TypeUtils.isPrimitive(type65);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type65);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray61);
        org.mockito.cglib.core.Signature signature69 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray68);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray68);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray20);
        org.mockito.cglib.core.Signature signature72 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray71);
        org.mockito.asm.Type type74 = org.mockito.cglib.core.TypeUtils.fromInternalName("Hi!");
        boolean boolean75 = org.mockito.cglib.core.TypeUtils.isPrimitive(type74);
        org.mockito.asm.Type type76 = org.mockito.cglib.core.TypeUtils.getBoxedType(type74);
        org.mockito.asm.Type[] typeArray77 = org.mockito.cglib.core.TypeUtils.add(typeArray71, type74);
        boolean boolean78 = org.mockito.cglib.core.TypeUtils.isPrimitive(type74);
        java.lang.String str79 = org.mockito.cglib.core.TypeUtils.getPackageName(type74);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(signature26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(signature31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
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
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang.hi!" + "'", str59, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(signature69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(signature72);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertNotNull(typeArray77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type6);
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(signature3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("java$242Elang$242EJava$24242Elang$24242Ehi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        int int15 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type13);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type13);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type13);
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
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type15);
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getPackageName(type15);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang" + "'", str20, "java.lang");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.cglib.core.Signature signature5 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        java.lang.Class<?> wildcardClass6 = signature5.getClass();
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature9 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray8);
        java.lang.String[] strArray10 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray8);
        java.lang.Class<?> wildcardClass11 = strArray10.getClass();
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type13);
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isArray(type13);
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isArray(type13);
        java.lang.Class<?> wildcardClass17 = type13.getClass();
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java.lang");
        java.lang.Class<?> wildcardClass20 = signature19.getClass();
        java.lang.String[] strArray22 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        java.lang.Class<?> wildcardClass24 = strArray22.getClass();
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        java.lang.Class<?> wildcardClass28 = typeArray26.getClass();
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray30);
        java.lang.Class<?> wildcardClass32 = typeArray30.getClass();
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray34);
        java.lang.Class<?> wildcardClass36 = typeArray34.getClass();
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature39 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray38);
        java.lang.Class<?> wildcardClass40 = typeArray38.getClass();
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature43 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray42);
        java.lang.Class<?> wildcardClass44 = typeArray42.getClass();
        java.lang.Class[] classArray45 = new java.lang.Class[] { wildcardClass24, wildcardClass28, wildcardClass32, wildcardClass36, wildcardClass40, wildcardClass44 };
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.getTypes(classArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.getTypes(classArray45);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.getTypes(classArray45);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.getTypes(classArray45);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.getTypes(classArray45);
        java.lang.Class<?> wildcardClass51 = classArray45.getClass();
        java.lang.Class[] classArray52 = new java.lang.Class[] { wildcardClass6, wildcardClass11, wildcardClass17, wildcardClass20, wildcardClass51 };
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.getTypes(classArray52);
        org.mockito.cglib.core.Signature signature58 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray57);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(signature5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(signature9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(signature19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(signature27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(signature31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(signature35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(signature39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(signature43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(signature58);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang.hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type8);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isArray(type10);
        int int13 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type10);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2EJava$242Elang$242Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type3);
        java.lang.Class<?> wildcardClass8 = type3.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
        org.mockito.asm.Type type70 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type68);
        java.lang.String str71 = org.mockito.cglib.core.TypeUtils.getPackageName(type68);
        java.lang.String str72 = org.mockito.cglib.core.TypeUtils.getClassName(type68);
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
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "java.lang" + "'", str71, "java.lang");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "java.lang.hi!" + "'", str72, "java.lang.hi!");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang.hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        java.lang.String[] strArray16 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray17, typeArray19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type22);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getBoxedType(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type29);
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        int int36 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type33);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean39 = org.mockito.cglib.core.TypeUtils.isPrimitive(type38);
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type38);
        int int41 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type38);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type22, type27, type29, type33, type38 };
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.getBoxedType(type44);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray42, type44);
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type44);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type44);
        java.lang.Class[] classArray49 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.getTypes(classArray49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.getTypes(classArray49);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray48, typeArray51);
        java.lang.String[] strArray54 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray54);
        java.lang.Class<?> wildcardClass56 = strArray54.getClass();
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature59 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray58);
        java.lang.Class<?> wildcardClass60 = typeArray58.getClass();
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature63 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray62);
        java.lang.Class<?> wildcardClass64 = typeArray62.getClass();
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature67 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray66);
        java.lang.Class<?> wildcardClass68 = typeArray66.getClass();
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature71 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray70);
        java.lang.Class<?> wildcardClass72 = typeArray70.getClass();
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature75 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray74);
        java.lang.Class<?> wildcardClass76 = typeArray74.getClass();
        java.lang.Class[] classArray77 = new java.lang.Class[] { wildcardClass56, wildcardClass60, wildcardClass64, wildcardClass68, wildcardClass72, wildcardClass76 };
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.getTypes(classArray77);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.add(typeArray48, typeArray78);
        int int80 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray79);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray79);
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str84 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type83);
        java.lang.String str85 = org.mockito.cglib.core.TypeUtils.getClassName(type83);
        org.mockito.asm.Type type86 = org.mockito.cglib.core.TypeUtils.getBoxedType(type83);
        java.lang.String str87 = org.mockito.cglib.core.TypeUtils.getClassName(type86);
        org.mockito.asm.Type[] typeArray88 = org.mockito.cglib.core.TypeUtils.add(typeArray81, type86);
        org.mockito.asm.Type type90 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean91 = org.mockito.cglib.core.TypeUtils.isPrimitive(type90);
        org.mockito.asm.Type type92 = org.mockito.cglib.core.TypeUtils.getBoxedType(type90);
        java.lang.String str93 = org.mockito.cglib.core.TypeUtils.getClassName(type90);
        java.lang.String str94 = org.mockito.cglib.core.TypeUtils.getClassName(type90);
        boolean boolean95 = org.mockito.cglib.core.TypeUtils.isPrimitive(type90);
        org.mockito.asm.Type type96 = org.mockito.cglib.core.TypeUtils.getBoxedType(type90);
        org.mockito.asm.Type type97 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type96);
        org.mockito.asm.Type[] typeArray98 = org.mockito.cglib.core.TypeUtils.add(typeArray81, type97);
        int int99 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray81);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(signature59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(signature63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(signature67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(signature71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(signature75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(classArray77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "java.lang.hi!" + "'", str84, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "java.lang.hi!" + "'", str85, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "java.lang.hi!" + "'", str87, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray88);
        org.junit.Assert.assertNotNull(type90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(type92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "java.lang.hi!" + "'", str93, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "java.lang.hi!" + "'", str94, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(type96);
        org.junit.Assert.assertNotNull(type97);
        org.junit.Assert.assertNotNull(typeArray98);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 13 + "'", int99 == 13);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang.Java$24242Elang$24242EJava$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
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
        org.mockito.cglib.core.Signature signature35 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray31);
        org.mockito.cglib.core.Signature signature36 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray31);
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
        org.junit.Assert.assertNotNull(signature35);
        org.junit.Assert.assertNotNull(signature36);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
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
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(typeArray45);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
        int int23 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int11 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type10);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$2424242Elang$2424242Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        int int39 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type37);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type37);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type37);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
    }
}

