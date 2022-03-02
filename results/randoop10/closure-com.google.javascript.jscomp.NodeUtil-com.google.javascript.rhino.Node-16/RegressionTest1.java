import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00201");
        int int0 = com.google.javascript.rhino.Node.DIRECTIVES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 48 + "'", int0 == 48);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00202");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor9 = charSequenceList7.iterator();
        int int10 = charSequenceList4.lastIndexOf((java.lang.Object) charSequenceItor9);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList14 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14, charSequenceArray13);
        int int16 = charSequenceList14.size();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList19 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        boolean boolean22 = charSequenceList19.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        int int28 = charSequenceList26.size();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor33 = charSequenceList31.iterator();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        int int39 = charSequenceList37.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList40 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList14, (java.lang.Cloneable) charSequenceList19, (java.lang.Cloneable) charSequenceList26, (java.lang.Cloneable) charSequenceList31, (java.lang.Cloneable) charSequenceList37);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator41 = charSequenceList14.spliterator();
        boolean boolean42 = charSequenceList4.contains((java.lang.Object) charSequenceList14);
        int int43 = charSequenceList4.size();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean51 = node50.isObjectLit();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(12, node50);
        java.lang.Object obj54 = node52.getProp((int) '#');
        boolean boolean55 = node52.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile56 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node52);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean63 = node62.isObjectLit();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(12, node62);
        boolean boolean65 = node62.isGetElem();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node62.addChildToFront(node70);
        com.google.javascript.rhino.Node node72 = node70.getLastSibling();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean76 = node70.isEquivalentToTyped(node75);
        com.google.javascript.rhino.Node[] nodeArray77 = new com.google.javascript.rhino.Node[] { node52, node75 };
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) '#', nodeArray77, 0, 4095);
        int int81 = charSequenceList4.indexOf((java.lang.Object) node80);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition82 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean83 = typePosition82.hasBrackets();
        int int84 = typePosition82.getPositionOnEndLine();
        int int85 = typePosition82.getEndLine();
        com.google.javascript.rhino.Node node86 = typePosition82.getItem();
        int int87 = charSequenceList4.lastIndexOf((java.lang.Object) typePosition82);
        java.lang.Object[] objArray88 = charSequenceList4.toArray();
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charSequenceItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charSequenceItor33);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(cloneableList40);
        org.junit.Assert.assertNotNull(charSequenceSpliterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(staticSourceFile56);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(nodeArray77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[, hi!, , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[, hi!, , ]");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00203");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        boolean boolean51 = functionType50.hasReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType50.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType53 = functionType50.toObjectType();
        boolean boolean54 = objectType53.isEmptyType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00204");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        boolean boolean10 = node7.isCase();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = node7.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00205");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry41.createObjectType(objectType42);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = objectType43.getTypeOfThis();
        boolean boolean45 = jSTypeRegistry11.declareType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry51.createObjectType(objectType52);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        boolean boolean57 = jSTypeRegistry56.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        boolean boolean61 = jSTypeRegistry60.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSTypeRegistry64.createObjectType(objectType65);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSTypeRegistry69.createObjectType(objectType70);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSTypeRegistry74.createObjectType(objectType75);
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77, true);
        com.google.javascript.rhino.jstype.ObjectType objectType80 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry79.createObjectType(objectType80);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        boolean boolean85 = jSTypeRegistry84.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList86 = com.google.common.collect.ImmutableList.of(jSTypeRegistry51, jSTypeRegistry56, jSTypeRegistry60, jSTypeRegistry64, jSTypeRegistry69, jSTypeRegistry74, jSTypeRegistry79, jSTypeRegistry84);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray87 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry64.createUnionType(jSTypeNativeArray87);
        com.google.javascript.rhino.ErrorReporter errorReporter89 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry91 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter89, true);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType93 = jSTypeRegistry91.createObjectType(objectType92);
        com.google.javascript.rhino.jstype.ObjectType objectType94 = objectType93.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray95 = new com.google.javascript.rhino.jstype.JSType[] { objectType93 };
        com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry48.createFunctionType(jSType88, jSTypeArray95);
        com.google.javascript.rhino.Node node97 = jSTypeRegistry11.createOptionalParameters(jSTypeArray95);
        boolean boolean98 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node97);
        boolean boolean99 = node97.isScript();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNull(objectType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList86);
        org.junit.Assert.assertNotNull(jSTypeNativeArray87);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNull(objectType94);
        org.junit.Assert.assertNotNull(jSTypeArray95);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertNotNull(node97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00206");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        boolean boolean51 = functionType50.hasReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType50.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType52.getIndexType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable54 = functionType52.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType.Property property56 = functionType52.getSlot("Node tree inequality:\nTree1:\nSHEQ  40\n\n\nTree2:\nSHEQ  40\n    SHEQ  40\n\n\nSubtree1: SHEQ  40\n\n\nSubtree2: SHEQ  40\n    SHEQ  40\n");
        boolean boolean57 = functionType52.isReturnTypeInferred();
        functionType52.clearCachedValues();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(objectTypeIterable54);
        org.junit.Assert.assertNull(property56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00207");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node4.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node6 = node4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            node6.setSourceEncodedPositionForTree(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00208");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isObjectLit();
        int int6 = node4.getLineno();
        int int7 = node4.getLength();
        node4.detachChildren();
        // The following exception was thrown during execution in test generation
        try {
            node4.setDouble((double) 31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SHEQ  40 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00209");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        boolean boolean9 = jSTypeRegistry8.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType14 = jSTypeRegistry8.createNamedType("Not declared as a type name", "[, hi!, , ]", (int) (byte) 0, (int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        boolean boolean26 = jSTypeRegistry25.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        boolean boolean30 = jSTypeRegistry29.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = jSTypeRegistry38.createObjectType(objectType39);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry43.createObjectType(objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.ObjectType objectType49 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSTypeRegistry48.createObjectType(objectType49);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        boolean boolean54 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList55 = com.google.common.collect.ImmutableList.of(jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry29, jSTypeRegistry33, jSTypeRegistry38, jSTypeRegistry43, jSTypeRegistry48, jSTypeRegistry53);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray56 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType57 = jSTypeRegistry33.createUnionType(jSTypeNativeArray56);
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.jstype.ObjectType objectType61 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType62 = jSTypeRegistry60.createObjectType(objectType61);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = objectType62.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] { objectType62 };
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry17.createFunctionType(jSType57, jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType67 = functionType65.getBindReturnType(0);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry8.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType65);
        com.google.javascript.rhino.Node node70 = functionType65.getPropertyNode("SHEQ  [opt_arg: 1]");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry2.createFromTypeNodes(node4, "function ({1629208395}): function (this:me, {419319822}): me", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList55);
        org.junit.Assert.assertNotNull(jSTypeNativeArray56);
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertNotNull(objectType62);
        org.junit.Assert.assertNull(objectType63);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNull(node70);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00210");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        boolean boolean10 = node7.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node7.children();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList15 = com.google.common.collect.ImmutableList.of(subclassType13, subclassType14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(12, node21);
        boolean boolean24 = node23.isNew();
        boolean boolean25 = node23.isFalse();
        node23.putIntProp((int) '#', (int) '#');
        boolean boolean29 = node23.isReturn();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(12, node35);
        java.lang.Object obj39 = node37.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship40 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType14, node23, node37);
        com.google.javascript.rhino.Node node41 = node7.useSourceInfoIfMissingFrom(node23);
        java.lang.String str42 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean49 = node48.isObjectLit();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(12, node48);
        boolean boolean51 = node48.isGetElem();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node48.addChildToFront(node56);
        node48.setOptionalArg(true);
        com.google.javascript.rhino.Node node60 = node7.srcrefTree(node48);
        // The following exception was thrown during execution in test generation
        try {
            node60.setDouble((double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EQ 40 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + subclassType13 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType13.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType14 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType14.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00211");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node7.setStaticSourceFile(staticSourceFile10);
        node7.setIsSyntheticBlock(true);
        boolean boolean14 = node7.isSetterDef();
        boolean boolean15 = node7.isHook();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder16 = node7.getJsDocBuilderForNode();
        fileLevelJsDocBuilder16.append("Not declared as a constructor");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder16);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00212");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean10 = node9.isObjectLit();
        int int11 = node9.getLineno();
        int int12 = node9.getLength();
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node9);
        java.lang.String str14 = node4.checkTreeEquals(node9);
        // The following exception was thrown during execution in test generation
        try {
            node4.setDouble((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SHEQ  40 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00213");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean10 = node9.isObjectLit();
        int int11 = node9.getLineno();
        int int12 = node9.getLength();
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node9);
        java.lang.String str14 = node4.checkTreeEquals(node9);
        com.google.javascript.rhino.Node node15 = node9.cloneNode();
        boolean boolean16 = node15.isGetElem();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00214");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        boolean boolean15 = node5.isHook();
        java.lang.String str19 = node5.toString(true, false, false);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean26 = node25.isObjectLit();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(12, node25);
        boolean boolean28 = node25.isGetElem();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node25.addChildToFront(node33);
        boolean boolean35 = node25.isGetProp();
        boolean boolean36 = node25.isTry();
        com.google.javascript.rhino.Node node37 = node5.clonePropsFrom(node25);
        boolean boolean38 = node37.isIn();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SHEQ  40" + "'", str19, "SHEQ  40");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00215");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("function ({1287315686}): function (this:me, {945905116}): me");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00216");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        java.lang.String str2 = jSDocInfo0.getDeprecationReason();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getBaseType();
        boolean boolean4 = jSDocInfo0.hasEnumParameterType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getParameterType("EQ\n    SHEQ  40\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00217");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        java.lang.String str2 = jSDocInfo0.getDeprecationReason();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getBaseType();
        boolean boolean4 = jSDocInfo0.isImplicitCast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00218");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isNew();
        boolean boolean9 = node7.isFalse();
        boolean boolean10 = node7.isTry();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo11 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00219");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType4 = jSTypeRegistry2.getNativeType(jSTypeNative3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00220");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        int int10 = charSequenceList8.size();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList13 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        boolean boolean16 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        int int22 = charSequenceList20.size();
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList25 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor27 = charSequenceList25.iterator();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        int int33 = charSequenceList31.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList34 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList13, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList25, (java.lang.Cloneable) charSequenceList31);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(12, node40);
        java.lang.Object obj44 = node42.getProp((int) '#');
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean51 = node50.isObjectLit();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(12, node50);
        boolean boolean53 = node52.isArrayLit();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean60 = node59.isObjectLit();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(12, node59);
        java.lang.Object obj63 = node61.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile64 = null;
        node61.setStaticSourceFile(staticSourceFile64);
        com.google.javascript.rhino.Node node66 = node61.cloneTree();
        com.google.javascript.rhino.Node node67 = node52.copyInformationFromForTree(node66);
        com.google.javascript.rhino.Node node68 = node42.clonePropsFrom(node52);
        boolean boolean69 = node68.isCatch();
        boolean boolean70 = charSequenceList13.equals((java.lang.Object) node68);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = charSequenceList4.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charSequenceItor27);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(cloneableList34);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00221");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00222");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry43.createObjectType(objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        boolean boolean49 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        boolean boolean53 = jSTypeRegistry52.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry61.createObjectType(objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        boolean boolean77 = jSTypeRegistry76.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList78 = com.google.common.collect.ImmutableList.of(jSTypeRegistry43, jSTypeRegistry48, jSTypeRegistry52, jSTypeRegistry56, jSTypeRegistry61, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray79 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry56.createUnionType(jSTypeNativeArray79);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSTypeRegistry83.createObjectType(objectType84);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = objectType85.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] { objectType85 };
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry40.createFunctionType(jSType80, jSTypeArray87);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot90 = functionType88.getSlot("");
        boolean boolean91 = functionType88.isFunctionPrototypeType();
        int int92 = functionType88.getMinArguments();
        boolean boolean94 = jSTypeRegistry7.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType88, "hi!");
        java.util.Set<java.lang.String> strSet95 = functionType88.getOwnPropertyNames();
        boolean boolean96 = strSet95.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = strSet95.add("SHEQ  40");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList78);
        org.junit.Assert.assertNotNull(jSTypeNativeArray79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNull(objectType86);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertNull(staticSlot90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00223");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(12, node9);
        boolean boolean12 = node11.isArrayLit();
        boolean boolean13 = node11.isSwitch();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(12, node19);
        java.lang.Object obj23 = node21.getProp((int) '#');
        com.google.javascript.rhino.Node node24 = node11.copyInformationFromForTree(node21);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newExpr(node24);
        int int26 = node3.getIndexOfChild(node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) '4');
        node3.addChildrenToFront(node28);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 50);
        boolean boolean32 = node31.isAssignAdd();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean39 = node38.isObjectLit();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(12, node38);
        boolean boolean41 = node38.isGetElem();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node38.addChildToFront(node46);
        com.google.javascript.rhino.Node node48 = node46.getLastSibling();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean52 = node46.isEquivalentToTyped(node51);
        boolean boolean53 = node46.isSetterDef();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, node28, node31, node46, 37, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00224");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo0.setVisibility(visibility2);
        java.lang.String str4 = jSDocInfo0.toString();
        boolean boolean5 = jSDocInfo0.hasThisType();
        boolean boolean6 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSDocInfo" + "'", str4, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00225");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node7.setStaticSourceFile(staticSourceFile10);
        java.lang.String str12 = node7.toString();
        boolean boolean13 = node7.isLocalResultCall();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EQ" + "'", str12, "EQ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00226");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isStringObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType54 = functionType50.getConstructor();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot56 = functionType50.getSlot("");
        boolean boolean57 = functionType50.isBooleanObjectType();
        boolean boolean58 = functionType50.hasCachedValues();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = functionType50.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo61 = functionType59.getOwnPropertyJSDocInfo("function ({2031960127}): function (this:me, {1023964809}): me");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(functionType54);
        org.junit.Assert.assertNull(staticSlot56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(functionType59);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00227");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType50.getSlot("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType50.getPropertyType("hi!");
        boolean boolean55 = functionType50.isObject();
        com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType50.dereference();
        boolean boolean57 = objectType56.isNoType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00228");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        boolean boolean51 = functionType50.hasReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType50.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = functionType50.canTestForShallowEqualityWith(jSType53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(functionType52);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00229");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor7 = charSequenceList4.listIterator();
        int int8 = charSequenceList4.size();
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList12 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12, charSequenceArray11);
        int int14 = charSequenceList12.size();
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList17 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        boolean boolean20 = charSequenceList17.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList24 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        int int26 = charSequenceList24.size();
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList29 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList29, charSequenceArray28);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor31 = charSequenceList29.iterator();
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList35 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList35, charSequenceArray34);
        int int37 = charSequenceList35.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList38 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList12, (java.lang.Cloneable) charSequenceList17, (java.lang.Cloneable) charSequenceList24, (java.lang.Cloneable) charSequenceList29, (java.lang.Cloneable) charSequenceList35);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList42 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        int int44 = charSequenceList42.size();
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList47 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList47, charSequenceArray46);
        boolean boolean50 = charSequenceList47.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList54 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList54, charSequenceArray53);
        int int56 = charSequenceList54.size();
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList59 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59, charSequenceArray58);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor61 = charSequenceList59.iterator();
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList65 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65, charSequenceArray64);
        int int67 = charSequenceList65.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList68 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList42, (java.lang.Cloneable) charSequenceList47, (java.lang.Cloneable) charSequenceList54, (java.lang.Cloneable) charSequenceList59, (java.lang.Cloneable) charSequenceList65);
        boolean boolean69 = charSequenceList17.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = charSequenceList4.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList59);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(charSequenceItor31);
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(cloneableList38);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(charSequenceArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(charSequenceItor61);
        org.junit.Assert.assertNotNull(charSequenceArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(cloneableList68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00230");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        boolean boolean9 = node6.isGetElem();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node6.addChildToFront(node14);
        boolean boolean16 = node6.isGetProp();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 52, (int) (short) -1, 12);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(12, node26);
        boolean boolean29 = node28.isArrayLit();
        boolean boolean30 = node28.isSwitch();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean37 = node36.isObjectLit();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(12, node36);
        java.lang.Object obj40 = node38.getProp((int) '#');
        com.google.javascript.rhino.Node node41 = node28.copyInformationFromForTree(node38);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection42 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node41);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(10, node6, node20, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeCollection42);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00231");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        boolean boolean18 = node17.isArrayLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(12, node24);
        java.lang.Object obj28 = node26.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        node26.setStaticSourceFile(staticSourceFile29);
        com.google.javascript.rhino.Node node31 = node26.cloneTree();
        com.google.javascript.rhino.Node node32 = node17.copyInformationFromForTree(node31);
        com.google.javascript.rhino.Node node33 = node7.clonePropsFrom(node17);
        java.lang.String str34 = node7.getQualifiedName();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(12, node40);
        boolean boolean43 = node42.isArrayLit();
        boolean boolean44 = node42.isSwitch();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean51 = node50.isObjectLit();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(12, node50);
        java.lang.Object obj54 = node52.getProp((int) '#');
        com.google.javascript.rhino.Node node55 = node42.copyInformationFromForTree(node52);
        com.google.javascript.rhino.Node node56 = node55.getParent();
        com.google.javascript.rhino.Node node57 = node7.srcrefTree(node55);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags58 = null;
        // The following exception was thrown during execution in test generation
        try {
            node57.setSideEffectFlags(sideEffectFlags58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node57);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00232");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00233");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("function ({1250084219}): function (this:me, {453377123}): me");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(function ({1250084219}): function (this:me, {453377123}): me)" + "'", str1, "(function ({1250084219}): function (this:me, {453377123}): me)");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00234");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        boolean boolean2 = jSDocInfo0.isHidden();
        java.lang.String str4 = jSDocInfo0.getDescriptionForParameter("function ({1287315686}): function (this:me, {945905116}): me");
        boolean boolean5 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00235");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry15.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry44.createObjectType(objectType45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        boolean boolean50 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        boolean boolean54 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSTypeRegistry62.createObjectType(objectType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSTypeRegistry67.createObjectType(objectType68);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry72.createObjectType(objectType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        boolean boolean78 = jSTypeRegistry77.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList79 = com.google.common.collect.ImmutableList.of(jSTypeRegistry44, jSTypeRegistry49, jSTypeRegistry53, jSTypeRegistry57, jSTypeRegistry62, jSTypeRegistry67, jSTypeRegistry72, jSTypeRegistry77);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray80 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry57.createUnionType(jSTypeNativeArray80);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry84.createObjectType(objectType85);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = objectType86.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] { objectType86 };
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry41.createFunctionType(jSType81, jSTypeArray88);
        com.google.javascript.rhino.jstype.ObjectType.Property property91 = functionType89.getSlot("Not declared as a type name");
        boolean boolean93 = functionType89.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean94 = functionType89.canBeCalled();
        java.lang.String str95 = functionType89.getReferenceName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection96 = jSTypeRegistry15.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType89);
        com.google.javascript.rhino.jstype.JSType jSType97 = functionType89.autoboxesTo();
        boolean boolean98 = functionType89.isArrayType();
        boolean boolean99 = functionType89.hasAnyTemplateInternal();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList79);
        org.junit.Assert.assertNotNull(jSTypeNativeArray80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertNull(objectType87);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNull(property91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNotNull(functionTypeCollection96);
        org.junit.Assert.assertNull(jSType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00236");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("function ({1150383454}): function (this:me, {173962701}): me");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00237");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        com.google.javascript.rhino.jstype.ObjectType objectType53 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = objectType53.getTypeOfThis();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType55 = objectType53.toMaybeEnumElementType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNull(enumElementType55);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00238");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        java.lang.String str7 = charSequenceList4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence10 = charSequenceList4.set((int) '#', (java.lang.CharSequence) "Not declared as a constructor");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[, hi!, , ]" + "'", str7, "[, hi!, , ]");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00239");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(12, node13);
        boolean boolean16 = node15.isNew();
        boolean boolean17 = node15.isFalse();
        com.google.javascript.rhino.Node node18 = node5.srcrefTree(node15);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection19 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node18);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry26.createObjectType(objectType27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        boolean boolean32 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.ObjectType objectType40 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType41 = jSTypeRegistry39.createObjectType(objectType40);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry44.createObjectType(objectType45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSTypeRegistry49.createObjectType(objectType50);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSTypeRegistry54.createObjectType(objectType55);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        boolean boolean60 = jSTypeRegistry59.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList61 = com.google.common.collect.ImmutableList.of(jSTypeRegistry26, jSTypeRegistry31, jSTypeRegistry35, jSTypeRegistry39, jSTypeRegistry44, jSTypeRegistry49, jSTypeRegistry54, jSTypeRegistry59);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray62 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry39.createUnionType(jSTypeNativeArray62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = objectType68.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] { objectType68 };
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry23.createFunctionType(jSType63, jSTypeArray70);
        boolean boolean72 = functionType71.hasReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType73 = functionType71.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType73.getIndexType();
        boolean boolean75 = functionType73.matchesObjectContext();
        boolean boolean77 = functionType73.isPropertyInExterns("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            node18.putProp(16, (java.lang.Object) boolean77);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeCollection19);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList61);
        org.junit.Assert.assertNotNull(jSTypeNativeArray62);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNull(objectType69);
        org.junit.Assert.assertNotNull(jSTypeArray70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00240");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        jSDocInfo0.setLicense("InputId: ");
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getAuthors();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        boolean boolean6 = jSDocInfo0.hasType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00241");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        java.lang.String str7 = charSequenceList4.toString();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int14 = charSequenceList12.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor15 = charSequenceList12.listIterator();
        int int16 = charSequenceList12.size();
        boolean boolean17 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor18 = charSequenceList12.listIterator();
        java.lang.String[] strArray26 = new java.lang.String[] { "function ({1150383454}): function (this:me, {173962701}): me", "InputId: Unknown class name", "function (?): ?", "InputId: Unknown class name", "function ({939717413}): function (this:me, {365018168}): me", "function ({89774946}): function (this:me, {1297374001}): me", "function ({1150383454}): function (this:me, {173962701}): me" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        java.util.Spliterator<java.lang.String> strSpliterator29 = strSet27.spliterator();
        boolean boolean30 = strSet27.isEmpty();
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "[, hi!, , ]", "[, hi!, , ]", "[, hi!, , ]", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList36 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36, charSequenceArray35);
        charSequenceList36.clear();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList43 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int45 = charSequenceList43.lastIndexOf((java.lang.Object) 39);
        java.lang.String str46 = charSequenceList43.toString();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList51 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int53 = charSequenceList51.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor54 = charSequenceList51.listIterator();
        int int55 = charSequenceList51.size();
        boolean boolean56 = charSequenceList43.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList57 = charSequenceList43.reverse();
        boolean boolean58 = charSequenceList36.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor59 = charSequenceList36.iterator();
        boolean boolean60 = strSet27.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative62 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec63 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative62);
        boolean boolean64 = charSequenceList36.equals((java.lang.Object) "Not declared as a type name");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = charSequenceList12.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[, hi!, , ]" + "'", str7, "[, hi!, , ]");
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charSequenceItor18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strSpliterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charSequenceList43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[, hi!, , ]" + "'", str46, "[, hi!, , ]");
        org.junit.Assert.assertNotNull(charSequenceList51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(charSequenceList57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charSequenceItor59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00242");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("function ({1629208395}): function (this:me, {419319822}): me");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00243");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry43.createObjectType(objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        boolean boolean49 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        boolean boolean53 = jSTypeRegistry52.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry61.createObjectType(objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        boolean boolean77 = jSTypeRegistry76.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList78 = com.google.common.collect.ImmutableList.of(jSTypeRegistry43, jSTypeRegistry48, jSTypeRegistry52, jSTypeRegistry56, jSTypeRegistry61, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray79 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry56.createUnionType(jSTypeNativeArray79);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSTypeRegistry83.createObjectType(objectType84);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = objectType85.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] { objectType85 };
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry40.createFunctionType(jSType80, jSTypeArray87);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot90 = functionType88.getSlot("");
        boolean boolean91 = functionType88.isFunctionPrototypeType();
        int int92 = functionType88.getMinArguments();
        boolean boolean94 = jSTypeRegistry7.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType88, "hi!");
        java.util.Set<java.lang.String> strSet95 = functionType88.getOwnPropertyNames();
        java.lang.Object[] objArray96 = strSet95.toArray();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList78);
        org.junit.Assert.assertNotNull(jSTypeNativeArray79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNull(objectType86);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertNull(staticSlot90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNotNull(objArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray96), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray96), "[]");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00244");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry7.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative39 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType40 = jSTypeRegistry7.getNativeObjectType(jSTypeNative39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00245");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node7.siblings();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator11 = nodeIterable10.spliterator();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator12 = nodeIterable10.spliterator();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator13 = nodeIterable10.spliterator();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(nodeSpliterator11);
        org.junit.Assert.assertNotNull(nodeSpliterator12);
        org.junit.Assert.assertNotNull(nodeSpliterator13);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00246");
        java.io.IOException iOException1 = new java.io.IOException("EQ\n    SHEQ  40\n");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00247");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        com.google.javascript.rhino.Node node15 = node13.getLastSibling();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean19 = node13.isEquivalentToTyped(node18);
        boolean boolean20 = node18.isVarArgs();
        boolean boolean21 = node18.hasMoreThanOneChild();
        boolean boolean22 = node18.isBreak();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00248");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "function ({253519241}): function (this:me, {717139228}): me", (java.lang.Comparable<java.lang.String>) "function (?): ?", (java.lang.Comparable<java.lang.String>) "function ({2031960127}): function (this:me, {1023964809}): me", (java.lang.Comparable<java.lang.String>) "Named type with empty name component", (java.lang.Comparable<java.lang.String>) "JSDocInfo", (java.lang.Comparable<java.lang.String>) "function ({1150383454}): function (this:me, {173962701}): me", (java.lang.Comparable<java.lang.String>) "JSDocInfo", (java.lang.Comparable<java.lang.String>) "Unknown class name", (java.lang.Comparable<java.lang.String>) "(function ({1250084219}): function (this:me, {453377123}): me)", (java.lang.Comparable<java.lang.String>) "function ({544434519}): function (this:me, {262466537}): me", (java.lang.Comparable<java.lang.String>) "SHEQ  40");
        org.junit.Assert.assertNotNull(strComparableList11);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00249");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry15.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry44.createObjectType(objectType45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        boolean boolean50 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        boolean boolean54 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSTypeRegistry62.createObjectType(objectType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSTypeRegistry67.createObjectType(objectType68);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry72.createObjectType(objectType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        boolean boolean78 = jSTypeRegistry77.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList79 = com.google.common.collect.ImmutableList.of(jSTypeRegistry44, jSTypeRegistry49, jSTypeRegistry53, jSTypeRegistry57, jSTypeRegistry62, jSTypeRegistry67, jSTypeRegistry72, jSTypeRegistry77);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray80 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry57.createUnionType(jSTypeNativeArray80);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry84.createObjectType(objectType85);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = objectType86.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] { objectType86 };
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry41.createFunctionType(jSType81, jSTypeArray88);
        com.google.javascript.rhino.jstype.FunctionType functionType91 = functionType89.getBindReturnType(0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo92 = null;
        functionType91.setJSDocInfo(jSDocInfo92);
        com.google.javascript.rhino.jstype.ObjectType objectType94 = jSTypeRegistry15.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType91);
        com.google.javascript.rhino.ErrorReporter errorReporter95 = jSTypeRegistry15.getErrorReporter();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList79);
        org.junit.Assert.assertNotNull(jSTypeNativeArray80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertNull(objectType87);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNotNull(functionType91);
        org.junit.Assert.assertNotNull(objectType94);
        org.junit.Assert.assertNull(errorReporter95);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00250");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("function ({544434519}): function (this:me, {262466537}): me");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00251");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        jSDocInfo0.setLicense("InputId: ");
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getAuthors();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        boolean boolean6 = jSDocInfo0.hasModifies();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00252");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry43.createObjectType(objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        boolean boolean49 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        boolean boolean53 = jSTypeRegistry52.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry61.createObjectType(objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        boolean boolean77 = jSTypeRegistry76.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList78 = com.google.common.collect.ImmutableList.of(jSTypeRegistry43, jSTypeRegistry48, jSTypeRegistry52, jSTypeRegistry56, jSTypeRegistry61, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray79 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry56.createUnionType(jSTypeNativeArray79);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSTypeRegistry83.createObjectType(objectType84);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = objectType85.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] { objectType85 };
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry40.createFunctionType(jSType80, jSTypeArray87);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot90 = functionType88.getSlot("");
        boolean boolean91 = functionType88.isFunctionPrototypeType();
        int int92 = functionType88.getMinArguments();
        boolean boolean94 = jSTypeRegistry7.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType88, "hi!");
        java.util.Set<java.lang.String> strSet95 = functionType88.getPropertyNames();
        strSet95.clear();
        strSet95.clear();
        int int98 = strSet95.size();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList78);
        org.junit.Assert.assertNotNull(jSTypeNativeArray79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNull(objectType86);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertNull(staticSlot90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00253");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(typePosition2);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00254");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        boolean boolean51 = functionType50.hasReferenceName();
        boolean boolean52 = functionType50.hasReferenceName();
        java.lang.String str53 = functionType50.getReferenceName();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00255");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isNumberValueType();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType50.dereference();
        boolean boolean56 = objectType54.isPropertyTypeDeclared("(unknown)");
        java.lang.String str57 = objectType54.toAnnotationString();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "function (?): ?" + "'", str57, "function (?): ?");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00256");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode38 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry35.setResolveMode(resolveMode38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        boolean boolean51 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        boolean boolean55 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry58.createObjectType(objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry68.createObjectType(objectType69);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSTypeRegistry73.createObjectType(objectType74);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        boolean boolean79 = jSTypeRegistry78.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList80 = com.google.common.collect.ImmutableList.of(jSTypeRegistry45, jSTypeRegistry50, jSTypeRegistry54, jSTypeRegistry58, jSTypeRegistry63, jSTypeRegistry68, jSTypeRegistry73, jSTypeRegistry78);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray81 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry58.createUnionType(jSTypeNativeArray81);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter83, true);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSTypeRegistry85.createObjectType(objectType86);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = objectType87.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] { objectType87 };
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry42.createFunctionType(jSType82, jSTypeArray89);
        com.google.javascript.rhino.jstype.ObjectType.Property property92 = functionType90.getSlot("Not declared as a type name");
        boolean boolean94 = functionType90.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean95 = functionType90.canBeCalled();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection96 = jSTypeRegistry35.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType90);
        boolean boolean98 = functionType90.isPropertyInExterns("");
        com.google.javascript.rhino.jstype.FunctionType functionType99 = functionType90.toMaybeFunctionType();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertTrue("'" + resolveMode38 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode38.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList80);
        org.junit.Assert.assertNotNull(jSTypeNativeArray81);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNull(objectType88);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertNull(property92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(functionTypeCollection96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(functionType99);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00257");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isFunctionPrototypeType();
        int int54 = functionType50.getPropertiesCount();
        boolean boolean55 = functionType50.isConstructor();
        int int56 = functionType50.getPropertiesCount();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean63 = node62.isObjectLit();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(12, node62);
        java.lang.Object obj66 = node64.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile67 = null;
        node64.setStaticSourceFile(staticSourceFile67);
        com.google.javascript.rhino.Node node69 = node64.cloneTree();
        boolean boolean70 = node69.isOptionalArg();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean77 = node76.isObjectLit();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(12, node76);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean85 = node84.isObjectLit();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(12, node84);
        boolean boolean87 = node86.isNew();
        boolean boolean88 = node86.isFalse();
        com.google.javascript.rhino.Node node89 = node76.srcrefTree(node86);
        node69.addChildrenToFront(node86);
        boolean boolean91 = functionType50.equals((java.lang.Object) node69);
        boolean boolean93 = functionType50.isPropertyInExterns("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType94 = functionType50.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00258");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode38 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry35.setResolveMode(resolveMode38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        boolean boolean51 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        boolean boolean55 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry58.createObjectType(objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry68.createObjectType(objectType69);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSTypeRegistry73.createObjectType(objectType74);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        boolean boolean79 = jSTypeRegistry78.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList80 = com.google.common.collect.ImmutableList.of(jSTypeRegistry45, jSTypeRegistry50, jSTypeRegistry54, jSTypeRegistry58, jSTypeRegistry63, jSTypeRegistry68, jSTypeRegistry73, jSTypeRegistry78);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray81 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry58.createUnionType(jSTypeNativeArray81);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter83, true);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSTypeRegistry85.createObjectType(objectType86);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = objectType87.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] { objectType87 };
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry42.createFunctionType(jSType82, jSTypeArray89);
        com.google.javascript.rhino.jstype.ObjectType.Property property92 = functionType90.getSlot("Not declared as a type name");
        boolean boolean94 = functionType90.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean95 = functionType90.canBeCalled();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection96 = jSTypeRegistry35.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType90);
        boolean boolean98 = functionType90.isPropertyInExterns("");
        boolean boolean99 = functionType90.isArrayType();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertTrue("'" + resolveMode38 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode38.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList80);
        org.junit.Assert.assertNotNull(jSTypeNativeArray81);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNull(objectType88);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertNull(property92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(functionTypeCollection96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00259");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        int int3 = stringPosition0.getEndLine();
        int int4 = stringPosition0.getStartLine();
        int int5 = stringPosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00260");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean8 = node7.isObjectLit();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(12, node7);
        java.lang.Object obj11 = node9.getProp((int) '#');
        boolean boolean12 = node9.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node9);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(12, node19);
        boolean boolean22 = node19.isGetElem();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node19.addChildToFront(node27);
        com.google.javascript.rhino.Node node29 = node27.getLastSibling();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean33 = node27.isEquivalentToTyped(node32);
        com.google.javascript.rhino.Node[] nodeArray34 = new com.google.javascript.rhino.Node[] { node9, node32 };
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) '#', nodeArray34, 0, 4095);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(1, nodeArray34, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodeArray34);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00261");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType50.getTypeOfThis();
        boolean boolean56 = objectType54.removeProperty("SHEQ  40");
        boolean boolean57 = objectType54.isEnumElementType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00262");
        java.lang.Throwable throwable0 = null;
        java.io.IOException iOException1 = new java.io.IOException(throwable0);
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList2 = com.google.common.collect.ImmutableList.of(iOException1);
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        org.junit.Assert.assertNotNull(iOExceptionList2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00263");
        com.google.javascript.rhino.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, node1, 1, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00264");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        boolean boolean10 = node7.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node7.children();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList15 = com.google.common.collect.ImmutableList.of(subclassType13, subclassType14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(12, node21);
        boolean boolean24 = node23.isNew();
        boolean boolean25 = node23.isFalse();
        node23.putIntProp((int) '#', (int) '#');
        boolean boolean29 = node23.isReturn();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(12, node35);
        java.lang.Object obj39 = node37.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship40 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType14, node23, node37);
        com.google.javascript.rhino.Node node41 = node7.useSourceInfoIfMissingFrom(node23);
        java.lang.String str42 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        com.google.javascript.rhino.Node node43 = node7.getFirstChild();
        boolean boolean44 = node43.isThrow();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + subclassType13 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType13.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType14 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType14.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00265");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = functionType50.getPossibleToBooleanOutcomes();
        boolean boolean52 = functionType50.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType50.getPropertyType("[, hi!, , ]");
        boolean boolean56 = functionType50.isStringValueType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00266");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setAllFlags();
        sideEffectFlags0.clearAllFlags();
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00267");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "Not declared as a type name" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList8 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList2.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8);
        boolean boolean10 = charSequenceList8.isEmpty();
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList8.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry17.createObjectType(objectType18);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        boolean boolean23 = jSTypeRegistry22.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        boolean boolean27 = jSTypeRegistry26.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry35.createObjectType(objectType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSTypeRegistry40.createObjectType(objectType41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        boolean boolean51 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList52 = com.google.common.collect.ImmutableList.of(jSTypeRegistry17, jSTypeRegistry22, jSTypeRegistry26, jSTypeRegistry30, jSTypeRegistry35, jSTypeRegistry40, jSTypeRegistry45, jSTypeRegistry50);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray53 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry30.createUnionType(jSTypeNativeArray53);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = objectType59.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] { objectType59 };
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry14.createFunctionType(jSType54, jSTypeArray61);
        com.google.javascript.rhino.jstype.ObjectType.Property property64 = functionType62.getSlot("Not declared as a type name");
        boolean boolean66 = functionType62.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean67 = functionType62.canBeCalled();
        com.google.common.collect.ImmutableList<java.lang.String> strList68 = functionType62.getTemplateTypeNames();
        boolean boolean69 = functionType62.isEnumElementType();
        functionType62.clearResolved();
        java.lang.Iterable iterable71 = functionType62.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType73 = functionType62.findPropertyType("function ({1593102795}): function (this:me, {1634524939}): me");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = charSequenceList8.remove((java.lang.Object) functionType62);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charSequenceList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList52);
        org.junit.Assert.assertNotNull(jSTypeNativeArray53);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNull(objectType60);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertNull(property64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(iterable71);
        org.junit.Assert.assertNull(jSType73);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00268");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean8 = node7.isObjectLit();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(12, node7);
        java.lang.Object obj11 = node9.getProp((int) '#');
        boolean boolean12 = node9.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node9);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(12, node19);
        boolean boolean22 = node19.isGetElem();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node19.addChildToFront(node27);
        com.google.javascript.rhino.Node node29 = node27.getLastSibling();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean33 = node27.isEquivalentToTyped(node32);
        com.google.javascript.rhino.Node[] nodeArray34 = new com.google.javascript.rhino.Node[] { node9, node32 };
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) '#', nodeArray34, 0, 4095);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(49, nodeArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodeArray34);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00269");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry25.resetForTypeCheck();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean46 = node45.isObjectLit();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(12, node45);
        java.lang.Object obj49 = node47.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = null;
        node47.setStaticSourceFile(staticSourceFile50);
        node47.setIsSyntheticBlock(true);
        boolean boolean54 = node47.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = objectType59.getConstructor();
        boolean boolean61 = objectType59.matchesInt32Context();
        com.google.javascript.rhino.jstype.EnumType enumType62 = jSTypeRegistry25.createEnumType("function ({1287315686}): function (this:me, {945905116}): me", node47, (com.google.javascript.rhino.jstype.JSType) objectType59);
        com.google.javascript.rhino.jstype.ObjectType.Property property64 = enumType62.getSlot("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType65 = enumType62.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = jSType65.getDisplayName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(enumType62);
        org.junit.Assert.assertNull(property64);
        org.junit.Assert.assertNull(jSType65);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00270");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean11 = node10.isObjectLit();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(12, node10);
        boolean boolean13 = node12.isNew();
        boolean boolean14 = node12.isFalse();
        boolean boolean15 = node12.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(12, node21);
        boolean boolean24 = node21.isGetElem();
        com.google.javascript.rhino.Node node25 = node12.srcrefTree(node21);
        node4.addChildrenToFront(node25);
        boolean boolean27 = node4.isTypeOf();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00271");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        boolean boolean18 = node17.isArrayLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(12, node24);
        java.lang.Object obj28 = node26.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        node26.setStaticSourceFile(staticSourceFile29);
        com.google.javascript.rhino.Node node31 = node26.cloneTree();
        com.google.javascript.rhino.Node node32 = node17.copyInformationFromForTree(node31);
        com.google.javascript.rhino.Node node33 = node7.clonePropsFrom(node17);
        com.google.javascript.rhino.Node node34 = node33.getFirstChild();
        com.google.javascript.rhino.Node node35 = node34.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = node35.isThis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00272");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "function ({939717413}): function (this:me, {365018168}): me");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList7 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int9 = charSequenceList7.lastIndexOf((java.lang.Object) 39);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        boolean boolean18 = node15.isGetElem();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node15.addChildToFront(node23);
        com.google.javascript.rhino.Node node25 = node23.getLastSibling();
        boolean boolean26 = charSequenceList7.contains((java.lang.Object) node23);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(12, node32);
        boolean boolean35 = node32.isGetElem();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node32.addChildToFront(node40);
        java.lang.String str42 = node23.checkTreeEquals(node32);
        com.google.javascript.rhino.Node node43 = node2.useSourceInfoFromForTree(node23);
        node2.removeProp(49);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(charSequenceList7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Node tree inequality:\nTree1:\nSHEQ  40\n\n\nTree2:\nSHEQ  40\n    SHEQ  40\n\n\nSubtree1: SHEQ  40\n\n\nSubtree2: SHEQ  40\n    SHEQ  40\n" + "'", str42, "Node tree inequality:\nTree1:\nSHEQ  40\n\n\nTree2:\nSHEQ  40\n    SHEQ  40\n\n\nSubtree1: SHEQ  40\n\n\nSubtree2: SHEQ  40\n    SHEQ  40\n");
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00273");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition2 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition3 = null;
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition4 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition5 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition6 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition7 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition8 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition9 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition10 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList11 = com.google.common.collect.ImmutableList.of(namePosition0, namePosition1, namePosition2, namePosition3, namePosition4, namePosition5, namePosition6, namePosition7, namePosition8, namePosition9, namePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 3");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00274");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType50.getSlot("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType50.getPropertyType("hi!");
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType50.getPropertyType("EQ");
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSTypeRegistry59.createObjectType(objectType60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        boolean boolean65 = jSTypeRegistry64.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        boolean boolean69 = jSTypeRegistry68.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry72.createObjectType(objectType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        com.google.javascript.rhino.jstype.ObjectType objectType78 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType79 = jSTypeRegistry77.createObjectType(objectType78);
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, true);
        com.google.javascript.rhino.jstype.ObjectType objectType83 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType84 = jSTypeRegistry82.createObjectType(objectType83);
        com.google.javascript.rhino.ErrorReporter errorReporter85 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry87 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter85, true);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType89 = jSTypeRegistry87.createObjectType(objectType88);
        com.google.javascript.rhino.ErrorReporter errorReporter90 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry92 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter90, true);
        boolean boolean93 = jSTypeRegistry92.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList94 = com.google.common.collect.ImmutableList.of(jSTypeRegistry59, jSTypeRegistry64, jSTypeRegistry68, jSTypeRegistry72, jSTypeRegistry77, jSTypeRegistry82, jSTypeRegistry87, jSTypeRegistry92);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray95 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType96 = jSTypeRegistry72.createUnionType(jSTypeNativeArray95);
        com.google.javascript.rhino.jstype.ObjectType objectType97 = jSType96.toObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair98 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType50, jSType96);
        com.google.javascript.rhino.jstype.JSType jSType99 = typePair98.typeA;
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertNotNull(objectType84);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList94);
        org.junit.Assert.assertNotNull(jSTypeNativeArray95);
        org.junit.Assert.assertNotNull(jSType96);
        org.junit.Assert.assertNotNull(objectType97);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00275");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(12, node8);
        boolean boolean11 = node10.isArrayLit();
        boolean boolean12 = node10.isSwitch();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry19.createObjectType(objectType20);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        boolean boolean25 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        boolean boolean29 = jSTypeRegistry28.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry32.createObjectType(objectType33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry37.createObjectType(objectType38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry42.createObjectType(objectType43);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSTypeRegistry47.createObjectType(objectType48);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        boolean boolean53 = jSTypeRegistry52.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList54 = com.google.common.collect.ImmutableList.of(jSTypeRegistry19, jSTypeRegistry24, jSTypeRegistry28, jSTypeRegistry32, jSTypeRegistry37, jSTypeRegistry42, jSTypeRegistry47, jSTypeRegistry52);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray55 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry32.createUnionType(jSTypeNativeArray55);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSTypeRegistry59.createObjectType(objectType60);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = objectType61.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] { objectType61 };
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry16.createFunctionType(jSType56, jSTypeArray63);
        com.google.javascript.rhino.jstype.ObjectType.Property property66 = functionType64.getSlot("Not declared as a type name");
        boolean boolean68 = functionType64.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean69 = functionType64.canBeCalled();
        java.lang.String str70 = functionType64.toDebugHashCodeString();
        com.google.common.collect.ImmutableList<java.lang.String> strList71 = functionType64.getTemplateTypeNames();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType72 = jSTypeRegistry2.createFromTypeNodes(node10, "Not declared as a constructor", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: EQ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList54);
        org.junit.Assert.assertNotNull(jSTypeNativeArray55);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertNull(objectType62);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertNull(property66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "function ({1780413639}): function (this:me, {1227495437}): me" + "'", str70, "function ({1780413639}): function (this:me, {1227495437}): me");
        org.junit.Assert.assertNotNull(strList71);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00276");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isNew();
        boolean boolean9 = node7.isFalse();
        boolean boolean10 = node7.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(12, node16);
        boolean boolean19 = node16.isGetElem();
        com.google.javascript.rhino.Node node20 = node7.srcrefTree(node16);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = node7.getJSDocInfo();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(12, node27);
        java.lang.Object obj31 = node29.getProp((int) '#');
        boolean boolean32 = node29.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile33 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node29);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node29.getStaticSourceFile();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(12, node40);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean49 = node48.isObjectLit();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(12, node48);
        boolean boolean51 = node50.isNew();
        boolean boolean52 = node50.isFalse();
        com.google.javascript.rhino.Node node53 = node40.srcrefTree(node50);
        boolean boolean54 = node40.isLabel();
        boolean boolean55 = node40.hasOneChild();
        // The following exception was thrown during execution in test generation
        try {
            node7.addChildAfter(node29, node40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(jSDocInfo21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(staticSourceFile33);
        org.junit.Assert.assertNull(staticSourceFile34);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00277");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        java.lang.Object obj19 = node17.getProp((int) '#');
        com.google.javascript.rhino.Node node20 = node7.copyInformationFromForTree(node17);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newExpr(node20);
        com.google.javascript.rhino.jstype.JSType jSType22 = node20.getJSType();
        com.google.javascript.rhino.Node node23 = node20.getParent();
        boolean boolean24 = node23.isQuotedString();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags26 = new com.google.javascript.rhino.Node.SideEffectFlags(0);
        sideEffectFlags26.clearSideEffectFlags();
        sideEffectFlags26.setMutatesArguments();
        // The following exception was thrown during execution in test generation
        try {
            node23.setSideEffectFlags(sideEffectFlags26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got EXPR_RESULT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00278");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 52, (int) (short) -1, 12);
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = node3.getJSDocInfo();
        boolean boolean5 = node3.isAssignAdd();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(jSDocInfo4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00279");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isNumberValueType();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType50.dereference();
        boolean boolean55 = objectType54.isEmptyType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00280");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry43.createObjectType(objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        boolean boolean49 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        boolean boolean53 = jSTypeRegistry52.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry61.createObjectType(objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        boolean boolean77 = jSTypeRegistry76.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList78 = com.google.common.collect.ImmutableList.of(jSTypeRegistry43, jSTypeRegistry48, jSTypeRegistry52, jSTypeRegistry56, jSTypeRegistry61, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray79 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry56.createUnionType(jSTypeNativeArray79);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSTypeRegistry83.createObjectType(objectType84);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = objectType85.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] { objectType85 };
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry40.createFunctionType(jSType80, jSTypeArray87);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot90 = functionType88.getSlot("");
        boolean boolean91 = functionType88.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType96 = jSTypeRegistry11.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType88, "", "Named type with empty name component", 35, 10);
        boolean boolean98 = functionType88.isPropertyTypeDeclared("SHEQ  [opt_arg: 1]");
        boolean boolean99 = functionType88.isNominalConstructor();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList78);
        org.junit.Assert.assertNotNull(jSTypeNativeArray79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNull(objectType86);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertNull(staticSlot90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(jSType96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00281");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo0.setVisibility(visibility2);
        java.lang.String str4 = jSDocInfo0.toString();
        boolean boolean5 = jSDocInfo0.hasThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean7 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.isNoShadow();
        boolean boolean9 = jSDocInfo0.isOverride();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSDocInfo" + "'", str4, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00282");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node8);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(12, node16);
        java.lang.Object obj20 = node18.getProp((int) '#');
        boolean boolean21 = node18.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node18);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(12, node28);
        boolean boolean31 = node28.isGetElem();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node28.addChildToFront(node36);
        com.google.javascript.rhino.Node node38 = node36.getLastSibling();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean42 = node36.isEquivalentToTyped(node41);
        com.google.javascript.rhino.Node[] nodeArray43 = new com.google.javascript.rhino.Node[] { node18, node41 };
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) '#', nodeArray43, 0, 4095);
        boolean boolean47 = node46.isLocalResultCall();
        boolean boolean48 = node8.isEquivalentToTyped(node46);
        com.google.javascript.rhino.Node[] nodeArray49 = new com.google.javascript.rhino.Node[] { node46 };
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(100, nodeArray49, 38, 50);
        int int53 = node52.getSourceOffset();
        java.lang.Class<?> wildcardClass54 = node52.getClass();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(staticSourceFile22);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(nodeArray43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodeArray49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00283");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        jSDocInfo0.setLicense("InputId: ");
        jSDocInfo0.addSuppression("EQ");
        java.lang.String str6 = jSDocInfo0.getDeprecationReason();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        boolean boolean8 = jSDocInfo0.hasType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00284");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str39 = jSDocInfo38.getMeaning();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility40 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo38.setVisibility(visibility40);
        java.lang.String str42 = jSDocInfo38.toString();
        boolean boolean43 = jSDocInfo38.hasThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList44 = jSDocInfo38.getTemplateTypeNames();
        jSTypeRegistry30.setTemplateTypeNames((java.util.List<java.lang.String>) strList44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node47 = jSTypeRegistry30.createParametersWithVarArgs(jSTypeArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + visibility40 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility40.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "JSDocInfo" + "'", str42, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strList44);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00285");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType50.getBindReturnType(0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = null;
        functionType52.setJSDocInfo(jSDocInfo53);
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType52.getPropertyType("[, hi!, , ]");
        com.google.javascript.rhino.Node node57 = functionType52.getParametersNode();
        boolean boolean58 = functionType52.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType52.getSlot("SHEQ  40");
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(property60);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00286");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry43.createObjectType(objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        boolean boolean49 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        boolean boolean53 = jSTypeRegistry52.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry61.createObjectType(objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        boolean boolean77 = jSTypeRegistry76.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList78 = com.google.common.collect.ImmutableList.of(jSTypeRegistry43, jSTypeRegistry48, jSTypeRegistry52, jSTypeRegistry56, jSTypeRegistry61, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray79 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry56.createUnionType(jSTypeNativeArray79);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSTypeRegistry83.createObjectType(objectType84);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = objectType85.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] { objectType85 };
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry40.createFunctionType(jSType80, jSTypeArray87);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot90 = functionType88.getSlot("");
        boolean boolean91 = functionType88.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.ObjectType objectType92 = functionType88.toObjectType();
        boolean boolean94 = functionType88.hasOwnProperty("InputId: ");
        com.google.javascript.rhino.jstype.JSType jSType99 = jSTypeRegistry25.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType88, "EQ [parenthesized: 35]", "InputId: Unknown class name", 2, 44);
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList78);
        org.junit.Assert.assertNotNull(jSTypeNativeArray79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNull(objectType86);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertNull(staticSlot90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00287");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType50.getSlot("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType50.getPropertyType("hi!");
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType50.unboxesTo();
        boolean boolean56 = functionType50.canBeCalled();
        com.google.common.collect.ImmutableList<java.lang.String> strList57 = functionType50.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType58 = functionType50.toMaybeParameterizedType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNull(jSType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNull(parameterizedType58);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00288");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        functionType50.clearCachedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType52 = functionType50.getPrototype();
        boolean boolean53 = functionType50.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType50.getPropertyType("function ({253519241}): function (this:me, {717139228}): me");
        boolean boolean57 = jSType56.matchesUint32Context();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00289");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo0.getDescriptionForParameter("Unknown class name");
        boolean boolean3 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00290");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean10 = node9.isObjectLit();
        int int11 = node9.getLineno();
        int int12 = node9.getLength();
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node9);
        java.lang.String str14 = node4.checkTreeEquals(node9);
        boolean boolean15 = node4.isDo();
        boolean boolean16 = node4.isSyntheticBlock();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean22 = node21.isObjectLit();
        int int23 = node21.getLineno();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean30 = node29.isObjectLit();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(12, node29);
        boolean boolean32 = node31.isArrayLit();
        boolean boolean33 = node31.isSwitch();
        boolean boolean34 = node31.isNull();
        boolean boolean35 = node31.isTrue();
        boolean boolean36 = node31.isVoid();
        boolean boolean37 = node31.isRegExp();
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildAfter(node21, node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 40 + "'", int23 == 40);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00291");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isStringObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType54 = functionType50.getConstructor();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot56 = functionType50.getSlot("");
        boolean boolean57 = functionType50.isGlobalThisType();
        boolean boolean59 = functionType50.isPropertyInExterns("function ({325323855}): function (this:me, {181114909}): me");
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(functionType54);
        org.junit.Assert.assertNull(staticSlot56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00292");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        java.lang.Object obj10 = node8.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = null;
        node8.setStaticSourceFile(staticSourceFile11);
        node8.setIsSyntheticBlock(true);
        boolean boolean15 = node8.isSetterDef();
        boolean boolean16 = node8.isHook();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder17 = node8.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean24 = node23.isObjectLit();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(12, node23);
        node25.setLength(51);
        com.google.javascript.rhino.Node node28 = node8.useSourceInfoFrom(node25);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean34 = node33.isLabel();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(12, node40);
        boolean boolean43 = node40.isGetElem();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node40.addChildToFront(node48);
        boolean boolean50 = node48.isTry();
        com.google.javascript.rhino.Node node51 = node33.srcrefTree(node48);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean58 = node57.isObjectLit();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(12, node57);
        boolean boolean60 = node59.isNew();
        boolean boolean61 = node59.isFalse();
        node59.putIntProp((int) '#', (int) '#');
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection65 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node59);
        boolean boolean66 = node59.isSwitch();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(0, node28, node51, node59);
        boolean boolean68 = node51.isSetterDef();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder17);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(nodeCollection65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00293");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isNew();
        boolean boolean9 = node7.isFalse();
        node7.putIntProp((int) '#', (int) '#');
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node7);
        boolean boolean14 = node7.isSwitch();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType16 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList17 = com.google.common.collect.ImmutableList.of(subclassType15, subclassType16);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean24 = node23.isObjectLit();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(12, node23);
        boolean boolean26 = node25.isNew();
        boolean boolean27 = node25.isFalse();
        node25.putIntProp((int) '#', (int) '#');
        boolean boolean31 = node25.isReturn();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean38 = node37.isObjectLit();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(12, node37);
        java.lang.Object obj41 = node39.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship42 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType16, node25, node39);
        com.google.javascript.rhino.Node node44 = node25.getChildAtIndex((int) (byte) 0);
        boolean boolean45 = node25.isReturn();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node46 = node7.removeChildAfter(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + subclassType15 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType15.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType16 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType16.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList17);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00294");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("[, hi!, , ]", jSTypeNative1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean8 = node7.isObjectLit();
        int int9 = node7.getLineno();
        int int10 = node7.getLength();
        node7.detachChildren();
        boolean boolean12 = node7.isNumber();
        boolean boolean13 = node7.isVoid();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        boolean boolean17 = jSTypeRegistry16.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry16.createNamedType("Not declared as a type name", "[, hi!, , ]", (int) (byte) 0, (int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        boolean boolean34 = jSTypeRegistry33.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        boolean boolean38 = jSTypeRegistry37.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry41.createObjectType(objectType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry46.createObjectType(objectType47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry51.createObjectType(objectType52);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        boolean boolean62 = jSTypeRegistry61.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList63 = com.google.common.collect.ImmutableList.of(jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry37, jSTypeRegistry41, jSTypeRegistry46, jSTypeRegistry51, jSTypeRegistry56, jSTypeRegistry61);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray64 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry41.createUnionType(jSTypeNativeArray64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry68.createObjectType(objectType69);
        com.google.javascript.rhino.jstype.ObjectType objectType71 = objectType70.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] { objectType70 };
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry25.createFunctionType(jSType65, jSTypeArray72);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot75 = functionType73.getSlot("");
        boolean boolean76 = functionType73.isInterface();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] { functionType73 };
        com.google.javascript.rhino.Node node78 = jSTypeRegistry16.createOptionalParameters(jSTypeArray77);
        com.google.javascript.rhino.jstype.JSType jSType79 = assertionFunctionSpec2.getAssertedType(node7, jSTypeRegistry16);
        java.lang.String str80 = assertionFunctionSpec2.getFunctionName();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList63);
        org.junit.Assert.assertNotNull(jSTypeNativeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNull(objectType71);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertNull(staticSlot75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jSTypeArray77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNull(jSType79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "[, hi!, , ]" + "'", str80, "[, hi!, , ]");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00295");
        java.io.IOException iOException1 = new java.io.IOException("function ({1738636353}): function (this:me, {890623407}): me");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00296");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        int int10 = charSequenceList8.size();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList13 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        boolean boolean16 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        int int22 = charSequenceList20.size();
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList25 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor27 = charSequenceList25.iterator();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        int int33 = charSequenceList31.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList34 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList13, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList25, (java.lang.Cloneable) charSequenceList31);
        java.lang.Object[] objArray35 = charSequenceList8.toArray();
        boolean boolean36 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence39 = charSequenceList4.set(0, (java.lang.CharSequence) "InputId: Unknown class name");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charSequenceItor27);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(cloneableList34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[, hi!]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00297");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = node5.cloneTree();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 50);
        int int10 = node7.getIndexOfChild(node9);
        boolean boolean11 = node7.isSyntheticBlock();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList14 = com.google.common.collect.ImmutableList.of(subclassType12, subclassType13);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(12, node20);
        boolean boolean23 = node22.isNew();
        boolean boolean24 = node22.isFalse();
        node22.putIntProp((int) '#', (int) '#');
        boolean boolean28 = node22.isReturn();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean35 = node34.isObjectLit();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(12, node34);
        java.lang.Object obj38 = node36.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship39 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType13, node22, node36);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean45 = node44.isObjectLit();
        int int46 = node44.getLineno();
        int int47 = node44.getLength();
        java.lang.String str48 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node44);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry52.createObjectType(objectType53);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        boolean boolean58 = jSTypeRegistry57.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        boolean boolean62 = jSTypeRegistry61.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry65.createObjectType(objectType66);
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.ObjectType objectType71 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType72 = jSTypeRegistry70.createObjectType(objectType71);
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType77 = jSTypeRegistry75.createObjectType(objectType76);
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, true);
        com.google.javascript.rhino.jstype.ObjectType objectType81 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType82 = jSTypeRegistry80.createObjectType(objectType81);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter83, true);
        boolean boolean86 = jSTypeRegistry85.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList87 = com.google.common.collect.ImmutableList.of(jSTypeRegistry52, jSTypeRegistry57, jSTypeRegistry61, jSTypeRegistry65, jSTypeRegistry70, jSTypeRegistry75, jSTypeRegistry80, jSTypeRegistry85);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode88 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry85.setResolveMode(resolveMode88);
        node44.putProp((int) 'a', (java.lang.Object) resolveMode88);
        node22.addChildToFront(node44);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node(51, node7, node44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: second new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + subclassType12 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType12.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType13 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType13.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 40 + "'", int46 == 40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(objectType77);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList87);
        org.junit.Assert.assertTrue("'" + resolveMode88 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode88.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00298");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (short) 100, "()", 43, (int) (short) 1);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList9 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int11 = charSequenceList9.lastIndexOf((java.lang.Object) 39);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean18 = node17.isObjectLit();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(12, node17);
        boolean boolean20 = node17.isGetElem();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node17.addChildToFront(node25);
        com.google.javascript.rhino.Node node27 = node25.getLastSibling();
        boolean boolean28 = charSequenceList9.contains((java.lang.Object) node25);
        boolean boolean29 = node25.isTrue();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(12, node35);
        java.lang.Object obj39 = node37.getProp((int) '#');
        boolean boolean40 = node37.isBreak();
        node25.addChildToBack(node37);
        node37.removeProp(15);
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildToFront(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(charSequenceList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00299");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(12, node13);
        boolean boolean16 = node15.isNew();
        boolean boolean17 = node15.isFalse();
        com.google.javascript.rhino.Node node18 = node5.srcrefTree(node15);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = null;
        node5.setStaticSourceFile(staticSourceFile19);
        com.google.javascript.rhino.Node node22 = node5.getAncestor(10);
        com.google.javascript.rhino.Node node23 = node5.removeFirstChild();
        int int24 = node5.getLength();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00300");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType1 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList2 = com.google.common.collect.ImmutableList.of(subclassType0, subclassType1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(12, node8);
        boolean boolean11 = node10.isNew();
        boolean boolean12 = node10.isFalse();
        node10.putIntProp((int) '#', (int) '#');
        boolean boolean16 = node10.isReturn();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean23 = node22.isObjectLit();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(12, node22);
        java.lang.Object obj26 = node24.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship27 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType1, node10, node24);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean33 = node32.isObjectLit();
        int int34 = node32.getLineno();
        int int35 = node32.getLength();
        java.lang.String str36 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node32);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.ObjectType objectType41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSTypeRegistry40.createObjectType(objectType41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        boolean boolean46 = jSTypeRegistry45.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        boolean boolean50 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSTypeRegistry53.createObjectType(objectType54);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry58.createObjectType(objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry68.createObjectType(objectType69);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        boolean boolean74 = jSTypeRegistry73.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList75 = com.google.common.collect.ImmutableList.of(jSTypeRegistry40, jSTypeRegistry45, jSTypeRegistry49, jSTypeRegistry53, jSTypeRegistry58, jSTypeRegistry63, jSTypeRegistry68, jSTypeRegistry73);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode76 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry73.setResolveMode(resolveMode76);
        node32.putProp((int) 'a', (java.lang.Object) resolveMode76);
        node10.addChildToFront(node32);
        int int80 = node32.getType();
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType1 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType1.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 40 + "'", int34 == 40);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList75);
        org.junit.Assert.assertTrue("'" + resolveMode76 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode76.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 45 + "'", int80 == 45);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00301");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(0);
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setMutatesGlobalState();
        sideEffectFlags1.clearSideEffectFlags();
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00302");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue2.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue1.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue5.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue7.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue6.or(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue1.and(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue11.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue13.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue12.or(ternaryValue13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue17.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue19.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue18.or(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = ternaryValue16.and(ternaryValue18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue12.and(ternaryValue18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = ternaryValue7.xor(ternaryValue12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue25.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue27.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = ternaryValue26.or(ternaryValue27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = ternaryValue30.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue32.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue31.or(ternaryValue32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = ternaryValue26.and(ternaryValue32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = ternaryValue7.xor(ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = ternaryValue7.not();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00303");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(12, node14);
        java.lang.Object obj18 = node16.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = null;
        node16.setStaticSourceFile(staticSourceFile19);
        com.google.javascript.rhino.Node node21 = node16.cloneTree();
        com.google.javascript.rhino.Node node22 = node7.copyInformationFromForTree(node21);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.siblings();
        boolean boolean24 = node22.isAnd();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = node22.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EQ is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00304");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "EQ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00305");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(12, node11);
        boolean boolean14 = node11.isGetElem();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node11.addChildToFront(node19);
        node19.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node23 = node4.copyInformationFrom(node19);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00306");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType50.getTypeOfThis();
        java.util.Set<java.lang.String> strSet55 = functionType50.getOwnPropertyNames();
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList58 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58, charSequenceArray57);
        boolean boolean61 = charSequenceList58.add((java.lang.CharSequence) "hi!");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet63 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        java.io.Serializable[] serializableArray65 = new java.io.Serializable[] { false, booleanLiteralSet63, true };
        java.io.Serializable[] serializableArray66 = charSequenceList58.toArray(serializableArray65);
        boolean boolean67 = strSet55.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence70 = charSequenceList58.set(45, (java.lang.CharSequence) "Node tree inequality:\nTree1:\nEQ [parenthesized: 35]\n    SHEQ  40\n\n\nTree2:\nSHEQ  40\n\n\nSubtree1: EQ [parenthesized: 35]\n    SHEQ  40\n\n\nSubtree2: SHEQ  40\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 45, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(charSequenceArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet63 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet63.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00307");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        boolean boolean10 = node7.isNull();
        boolean boolean11 = node7.isLabelName();
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node7);
        // The following exception was thrown during execution in test generation
        try {
            node7.setSideEffectFlags(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got EQ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00308");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node7.setStaticSourceFile(staticSourceFile10);
        node7.setIsSyntheticBlock(true);
        boolean boolean14 = node7.isSetterDef();
        boolean boolean15 = node7.isHook();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean26 = node25.isObjectLit();
        int int27 = node25.getLineno();
        int int28 = node25.getLength();
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node25);
        java.lang.String str30 = node20.checkTreeEquals(node25);
        boolean boolean31 = node20.isDo();
        com.google.javascript.rhino.Node node32 = node7.srcref(node20);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean44 = node43.isObjectLit();
        int int45 = node43.getLineno();
        int int46 = node43.getLength();
        java.lang.String str47 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node43);
        java.lang.String str48 = node38.checkTreeEquals(node43);
        boolean boolean49 = node38.isDo();
        boolean boolean50 = node38.isSyntheticBlock();
        int int52 = node38.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.InputId inputId53 = com.google.javascript.jscomp.NodeUtil.getInputId(node38);
        // The following exception was thrown during execution in test generation
        try {
            node32.addChildrenAfter(node33, node38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 40 + "'", int27 == 40);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 40 + "'", int45 == 40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(inputId53);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00309");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isNew();
        boolean boolean9 = node7.isFromExterns();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        boolean boolean18 = node17.isWhile();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = node7.removeChildAfter(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00310");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry7.clearNamedTypes();
        boolean boolean39 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = jSTypeRegistry7.getErrorReporter();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(errorReporter40);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00311");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00312");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        boolean boolean18 = node17.isArrayLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(12, node24);
        java.lang.Object obj28 = node26.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        node26.setStaticSourceFile(staticSourceFile29);
        com.google.javascript.rhino.Node node31 = node26.cloneTree();
        com.google.javascript.rhino.Node node32 = node17.copyInformationFromForTree(node31);
        com.google.javascript.rhino.Node node33 = node7.clonePropsFrom(node17);
        node17.addSuppression("Node tree inequality:\nTree1:\nSHEQ  40\n\n\nTree2:\nSHEQ  40\n    SHEQ  40\n\n\nSubtree1: SHEQ  40\n\n\nSubtree2: SHEQ  40\n    SHEQ  40\n");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node36 = node17.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00313");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        boolean boolean10 = node7.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        node7.setType(8);
        boolean boolean14 = node7.isOptionalArg();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder20 = node19.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node21 = node19.getParent();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(12, node27);
        java.lang.Object obj31 = node29.getProp((int) '#');
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean38 = node37.isObjectLit();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(12, node37);
        boolean boolean40 = node39.isArrayLit();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean47 = node46.isObjectLit();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(12, node46);
        java.lang.Object obj50 = node48.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile51 = null;
        node48.setStaticSourceFile(staticSourceFile51);
        com.google.javascript.rhino.Node node53 = node48.cloneTree();
        com.google.javascript.rhino.Node node54 = node39.copyInformationFromForTree(node53);
        com.google.javascript.rhino.Node node55 = node29.clonePropsFrom(node39);
        com.google.javascript.rhino.Node node56 = node39.removeFirstChild();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean58 = jSDocInfo57.hasEnumParameterType();
        java.lang.String str59 = jSDocInfo57.getDeprecationReason();
        node56.setJSDocInfo(jSDocInfo57);
        // The following exception was thrown during execution in test generation
        try {
            node7.addChildrenAfter(node19, node56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00314");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType50.getTypeOfThis();
        java.util.Set<java.lang.String> strSet55 = functionType50.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode56 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode[] resolveModeArray57 = new com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode[] { resolveMode56 };
        java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>[] resolveModeEnumArray58 = strSet55.toArray((java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>[]) resolveModeArray57);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = strSet55.add("(Named type with empty name component)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertTrue("'" + resolveMode56 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode56.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertNotNull(resolveModeArray57);
        org.junit.Assert.assertNotNull(resolveModeEnumArray58);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00315");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode38 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry35.setResolveMode(resolveMode38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        boolean boolean51 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        boolean boolean55 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType60 = jSTypeRegistry58.createObjectType(objectType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.ObjectType objectType69 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry68.createObjectType(objectType69);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.ObjectType objectType74 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType75 = jSTypeRegistry73.createObjectType(objectType74);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        boolean boolean79 = jSTypeRegistry78.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList80 = com.google.common.collect.ImmutableList.of(jSTypeRegistry45, jSTypeRegistry50, jSTypeRegistry54, jSTypeRegistry58, jSTypeRegistry63, jSTypeRegistry68, jSTypeRegistry73, jSTypeRegistry78);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray81 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry58.createUnionType(jSTypeNativeArray81);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter83, true);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSTypeRegistry85.createObjectType(objectType86);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = objectType87.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] { objectType87 };
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry42.createFunctionType(jSType82, jSTypeArray89);
        com.google.javascript.rhino.jstype.ObjectType.Property property92 = functionType90.getSlot("Not declared as a type name");
        boolean boolean94 = functionType90.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean95 = functionType90.canBeCalled();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection96 = jSTypeRegistry35.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType90);
        boolean boolean98 = functionType90.isPropertyInExterns("");
        boolean boolean99 = functionType90.isNullable();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertTrue("'" + resolveMode38 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode38.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objectType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList80);
        org.junit.Assert.assertNotNull(jSTypeNativeArray81);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNull(objectType88);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertNull(property92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(functionTypeCollection96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00316");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isObjectLit();
        int int6 = node4.getLineno();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = node4.getStaticSourceFile();
        com.google.javascript.rhino.Node node8 = node4.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder9 = node8.getJsDocBuilderForNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertNull(staticSourceFile7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00317");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType50.getSlot("Not declared as a type name");
        boolean boolean54 = functionType50.hasProperty("Named type with empty name component");
        boolean boolean55 = functionType50.isConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType50.getTypeOfThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = functionType50.getOwnPropertyJSDocInfo("SHEQ  [opt_arg: 1]");
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = functionType50.getOwnPropertyJSDocInfo("function ({821384357}): function (this:me, {889199518}): me");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType62 = functionType50.getTopMostDefiningType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNull(jSDocInfo58);
        org.junit.Assert.assertNull(jSDocInfo60);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00318");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList7 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList7, charSequenceArray6);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor9 = charSequenceList7.iterator();
        int int10 = charSequenceList4.lastIndexOf((java.lang.Object) charSequenceItor9);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList14 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14, charSequenceArray13);
        int int16 = charSequenceList14.size();
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList19 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList19, charSequenceArray18);
        boolean boolean22 = charSequenceList19.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList26 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList26, charSequenceArray25);
        int int28 = charSequenceList26.size();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor33 = charSequenceList31.iterator();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        int int39 = charSequenceList37.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList40 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList14, (java.lang.Cloneable) charSequenceList19, (java.lang.Cloneable) charSequenceList26, (java.lang.Cloneable) charSequenceList31, (java.lang.Cloneable) charSequenceList37);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator41 = charSequenceList14.spliterator();
        boolean boolean42 = charSequenceList4.contains((java.lang.Object) charSequenceList14);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.ObjectType objectType49 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSTypeRegistry48.createObjectType(objectType49);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        boolean boolean54 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        boolean boolean58 = jSTypeRegistry57.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry61.createObjectType(objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        com.google.javascript.rhino.jstype.ObjectType objectType77 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSTypeRegistry76.createObjectType(objectType77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79, true);
        boolean boolean82 = jSTypeRegistry81.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList83 = com.google.common.collect.ImmutableList.of(jSTypeRegistry48, jSTypeRegistry53, jSTypeRegistry57, jSTypeRegistry61, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76, jSTypeRegistry81);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray84 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType85 = jSTypeRegistry61.createUnionType(jSTypeNativeArray84);
        com.google.javascript.rhino.ErrorReporter errorReporter86 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry88 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter86, true);
        com.google.javascript.rhino.jstype.ObjectType objectType89 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType90 = jSTypeRegistry88.createObjectType(objectType89);
        com.google.javascript.rhino.jstype.ObjectType objectType91 = objectType90.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray92 = new com.google.javascript.rhino.jstype.JSType[] { objectType90 };
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry45.createFunctionType(jSType85, jSTypeArray92);
        functionType93.clearCachedValues();
        boolean boolean95 = functionType93.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet96 = functionType93.getPossibleToBooleanOutcomes();
        boolean boolean97 = functionType93.isReturnTypeInferred();
        boolean boolean98 = functionType93.isUnknownType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = charSequenceList4.remove((java.lang.Object) boolean98);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charSequenceItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charSequenceItor33);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(cloneableList40);
        org.junit.Assert.assertNotNull(charSequenceSpliterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList83);
        org.junit.Assert.assertNotNull(jSTypeNativeArray84);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertNotNull(objectType90);
        org.junit.Assert.assertNull(objectType91);
        org.junit.Assert.assertNotNull(jSTypeArray92);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet96 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet96.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00319");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isNew();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean19 = node18.isObjectLit();
        int int20 = node18.getLineno();
        int int21 = node18.getLength();
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node18);
        java.lang.String str23 = node13.checkTreeEquals(node18);
        com.google.javascript.rhino.Node node24 = node18.cloneNode();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean31 = node30.isObjectLit();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(12, node30);
        boolean boolean33 = node32.isArrayLit();
        boolean boolean34 = node32.isSwitch();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(12, node40);
        java.lang.Object obj44 = node42.getProp((int) '#');
        com.google.javascript.rhino.Node node45 = node32.copyInformationFromForTree(node42);
        com.google.javascript.rhino.Node node46 = node45.getParent();
        boolean boolean47 = node18.hasChild(node46);
        com.google.javascript.rhino.Node node48 = node7.useSourceInfoIfMissingFrom(node18);
        boolean boolean49 = node18.isSwitch();
        boolean boolean50 = node18.hasChildren();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00320");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        boolean boolean2 = jSDocInfo0.hasBaseType();
        boolean boolean3 = jSDocInfo0.hasType();
        boolean boolean4 = jSDocInfo0.isIdGenerator();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str6 = jSDocInfo0.getSourceName();
        boolean boolean7 = jSDocInfo0.isDefine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00321");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType50.toObjectType();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate55 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = functionType50.setValidator(jSTypePredicate55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectType54);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00322");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("SHEQ  [opt_arg: 1]");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00323");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setReturnsTainted();
        sideEffectFlags0.setReturnsTainted();
        sideEffectFlags0.setAllFlags();
        sideEffectFlags0.setMutatesThis();
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00324");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry43.createObjectType(objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        boolean boolean49 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        boolean boolean53 = jSTypeRegistry52.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry61.createObjectType(objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        boolean boolean77 = jSTypeRegistry76.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList78 = com.google.common.collect.ImmutableList.of(jSTypeRegistry43, jSTypeRegistry48, jSTypeRegistry52, jSTypeRegistry56, jSTypeRegistry61, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray79 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry56.createUnionType(jSTypeNativeArray79);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSTypeRegistry83.createObjectType(objectType84);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = objectType85.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] { objectType85 };
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry40.createFunctionType(jSType80, jSTypeArray87);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot90 = functionType88.getSlot("");
        boolean boolean91 = functionType88.isFunctionPrototypeType();
        int int92 = functionType88.getMinArguments();
        boolean boolean94 = jSTypeRegistry7.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType88, "hi!");
        java.util.Set<java.lang.String> strSet95 = functionType88.getPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType97 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType88, "function ({89774946}): function (this:me, {1297374001}): me");
        java.lang.String str98 = functionType88.getReferenceName();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList78);
        org.junit.Assert.assertNotNull(jSTypeNativeArray79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNull(objectType86);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertNull(staticSlot90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNull(objectType97);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00325");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        boolean boolean2 = jSDocInfo0.isHidden();
        java.lang.String str4 = jSDocInfo0.getDescriptionForParameter("function ({1287315686}): function (this:me, {945905116}): me");
        java.lang.String str5 = jSDocInfo0.getDescription();
        boolean boolean6 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getThisType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00326");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType50.getSlot("Not declared as a type name");
        boolean boolean54 = functionType50.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean55 = functionType50.canBeCalled();
        boolean boolean56 = functionType50.isNativeObjectType();
        boolean boolean57 = functionType50.isInterface();
        boolean boolean58 = functionType50.matchesObjectContext();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00327");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(12, node13);
        boolean boolean16 = node15.isNew();
        boolean boolean17 = node15.isFalse();
        com.google.javascript.rhino.Node node18 = node5.srcrefTree(node15);
        // The following exception was thrown during execution in test generation
        try {
            node5.setSideEffectFlags((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got SHEQ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00328");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry25.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry44.createObjectType(objectType45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        boolean boolean50 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        boolean boolean54 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSTypeRegistry62.createObjectType(objectType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSTypeRegistry67.createObjectType(objectType68);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry72.createObjectType(objectType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        boolean boolean78 = jSTypeRegistry77.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList79 = com.google.common.collect.ImmutableList.of(jSTypeRegistry44, jSTypeRegistry49, jSTypeRegistry53, jSTypeRegistry57, jSTypeRegistry62, jSTypeRegistry67, jSTypeRegistry72, jSTypeRegistry77);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray80 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry57.createUnionType(jSTypeNativeArray80);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry84.createObjectType(objectType85);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = objectType86.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] { objectType86 };
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry41.createFunctionType(jSType81, jSTypeArray88);
        com.google.javascript.rhino.jstype.ObjectType.Property property91 = functionType89.getSlot("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType93 = functionType89.getPropertyType("hi!");
        boolean boolean94 = functionType89.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType95 = functionType89.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray96 = new com.google.javascript.rhino.jstype.JSType[] { parameterizedType95 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType97 = jSTypeRegistry25.createUnionType(jSTypeArray96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList79);
        org.junit.Assert.assertNotNull(jSTypeNativeArray80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertNull(objectType87);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNull(property91);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(parameterizedType95);
        org.junit.Assert.assertNotNull(jSTypeArray96);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00329");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        java.lang.String str2 = jSDocInfo0.getDeprecationReason();
        boolean boolean3 = jSDocInfo0.hasType();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getEnumParameterType();
        boolean boolean6 = jSDocInfo0.hasTypedefType();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00330");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(12, node13);
        boolean boolean16 = node15.isNew();
        boolean boolean17 = node15.isFalse();
        com.google.javascript.rhino.Node node18 = node5.srcrefTree(node15);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = null;
        node5.setStaticSourceFile(staticSourceFile19);
        boolean boolean21 = node5.isSwitch();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00331");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        boolean boolean5 = charSequenceList2.add((java.lang.CharSequence) "hi!");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { false, booleanLiteralSet7, true };
        java.io.Serializable[] serializableArray10 = charSequenceList2.toArray(serializableArray9);
        charSequenceList2.clear();
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        boolean boolean18 = charSequenceList15.add((java.lang.CharSequence) "hi!");
        int int19 = charSequenceList15.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = charSequenceList2.addAll(2, (java.util.Collection<java.lang.CharSequence>) charSequenceList15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(serializableArray9);
        org.junit.Assert.assertNotNull(serializableArray10);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00332");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        com.google.javascript.rhino.jstype.ObjectType objectType53 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = functionType50.getBindReturnType(5);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = functionType55.hasEqualCallType(functionType56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNotNull(functionType55);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00333");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = objectType4.getConstructor();
        boolean boolean6 = objectType4.isFunctionType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = null;
        objectType4.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo8);
        boolean boolean11 = objectType4.isPropertyTypeDeclared("function ({1287315686}): function (this:me, {945905116}): me");
        com.google.javascript.rhino.jstype.FunctionType functionType12 = objectType4.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = functionType12.isResolved();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionType12);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00334");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0, (int) (byte) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int5 = node3.getExistingIntProp(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 50");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00335");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSTypeRegistry10.createObjectType(objectType11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        boolean boolean16 = jSTypeRegistry15.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        boolean boolean20 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.ObjectType objectType39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = jSTypeRegistry38.createObjectType(objectType39);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        boolean boolean44 = jSTypeRegistry43.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList45 = com.google.common.collect.ImmutableList.of(jSTypeRegistry10, jSTypeRegistry15, jSTypeRegistry19, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38, jSTypeRegistry43);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray46 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry23.createUnionType(jSTypeNativeArray46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.ObjectType objectType51 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSTypeRegistry50.createObjectType(objectType51);
        com.google.javascript.rhino.jstype.ObjectType objectType53 = objectType52.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] { objectType52 };
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry7.createFunctionType(jSType47, jSTypeArray54);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot57 = functionType55.getSlot("");
        boolean boolean58 = functionType55.isFunctionPrototypeType();
        int int59 = functionType55.getMinArguments();
        boolean boolean60 = functionType55.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType55.getReturnType();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("function ({568254412}): function (this:me, {1985586892}): me", jSType61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList45);
        org.junit.Assert.assertNotNull(jSTypeNativeArray46);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertNull(objectType53);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertNull(staticSlot57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSType61);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00336");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        boolean boolean9 = node6.isGetElem();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node6.addChildToFront(node14);
        boolean boolean16 = node14.isDefaultCase();
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node14);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean24 = node23.isObjectLit();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(12, node23);
        boolean boolean26 = node25.isArrayLit();
        boolean boolean27 = node25.isSwitch();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(39, node14, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00337");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        java.lang.String str7 = charSequenceList4.toString();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int14 = charSequenceList12.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor15 = charSequenceList12.listIterator();
        int int16 = charSequenceList12.size();
        boolean boolean17 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        boolean boolean29 = jSTypeRegistry28.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        boolean boolean33 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry36.createObjectType(objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry41.createObjectType(objectType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry46.createObjectType(objectType47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry51.createObjectType(objectType52);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        boolean boolean57 = jSTypeRegistry56.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList58 = com.google.common.collect.ImmutableList.of(jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry32, jSTypeRegistry36, jSTypeRegistry41, jSTypeRegistry46, jSTypeRegistry51, jSTypeRegistry56);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray59 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry36.createUnionType(jSTypeNativeArray59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = objectType65.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] { objectType65 };
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry20.createFunctionType(jSType60, jSTypeArray67);
        com.google.javascript.rhino.jstype.ObjectType.Property property70 = functionType68.getSlot("Not declared as a type name");
        boolean boolean72 = functionType68.isPropertyTypeDeclared("[, hi!, , ]");
        int int73 = charSequenceList12.indexOf((java.lang.Object) boolean72);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator74 = charSequenceList12.spliterator();
        java.lang.Object[] objArray75 = charSequenceList12.toArray();
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean77 = jSDocInfo76.hasEnumParameterType();
        jSDocInfo76.setLicense("InputId: ");
        com.google.javascript.rhino.Node node80 = jSDocInfo76.getAssociatedNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = charSequenceList12.remove((java.lang.Object) jSDocInfo76);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[, hi!, , ]" + "'", str7, "[, hi!, , ]");
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList58);
        org.junit.Assert.assertNotNull(jSTypeNativeArray59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(objectType66);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertNull(property70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(charSequenceSpliterator74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[, hi!, , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[, hi!, , ]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(node80);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00338");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "function ({939717413}): function (this:me, {365018168}): me");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00339");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(12, node14);
        int int17 = node7.getIndexOfChild(node14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = node7.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EQ is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00340");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo0.setVisibility(visibility2);
        jSDocInfo0.addSuppression("Node tree inequality:\nTree1:\nGETELEM 0\n    EQ\n        SHEQ  40\n    ASSIGN_MOD [, hi!, , ]\n\n\nTree2:\nSHEQ  40\n\n\nSubtree1: GETELEM 0\n    EQ\n        SHEQ  40\n    ASSIGN_MOD [, hi!, , ]\n\n\nSubtree2: SHEQ  40\n");
        java.lang.String str6 = jSDocInfo0.getFileOverview();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = jSDocInfo0.getTypeNodes();
        boolean boolean8 = jSDocInfo0.isImplicitCast();
        boolean boolean9 = jSDocInfo0.isExpose();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(nodeCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00341");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        boolean boolean18 = node17.isArrayLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(12, node24);
        java.lang.Object obj28 = node26.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        node26.setStaticSourceFile(staticSourceFile29);
        com.google.javascript.rhino.Node node31 = node26.cloneTree();
        com.google.javascript.rhino.Node node32 = node17.copyInformationFromForTree(node31);
        com.google.javascript.rhino.Node node33 = node7.clonePropsFrom(node17);
        java.lang.String str34 = node7.getQualifiedName();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(12, node40);
        boolean boolean43 = node42.isArrayLit();
        boolean boolean44 = node42.isSwitch();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean51 = node50.isObjectLit();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(12, node50);
        java.lang.Object obj54 = node52.getProp((int) '#');
        com.google.javascript.rhino.Node node55 = node42.copyInformationFromForTree(node52);
        com.google.javascript.rhino.Node node56 = node55.getParent();
        com.google.javascript.rhino.Node node57 = node7.srcrefTree(node55);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression59 = new com.google.javascript.rhino.JSTypeExpression(node7, "function ({1593102795}): function (this:me, {1634524939}): me");
        com.google.javascript.rhino.Node node60 = jSTypeExpression59.getRoot();
        boolean boolean61 = jSTypeExpression59.isOptionalArg();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSTypeRegistry64.createObjectType(objectType65);
        boolean boolean67 = objectType66.isDateType();
        com.google.javascript.rhino.Node node68 = objectType66.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = objectType66.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot71 = objectType66.getSlot("unknown");
        boolean boolean72 = objectType66.isNoObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73);
        jSTypeRegistry74.incrementGeneration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType76 = jSTypeExpression59.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType66, jSTypeRegistry74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: EQ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(objectType69);
        org.junit.Assert.assertNull(jSTypeStaticSlot71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00342");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        java.lang.String str7 = charSequenceList4.toString();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int14 = charSequenceList12.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor15 = charSequenceList12.listIterator();
        int int16 = charSequenceList12.size();
        boolean boolean17 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        boolean boolean29 = jSTypeRegistry28.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        boolean boolean33 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry36.createObjectType(objectType37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry41.createObjectType(objectType42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry46.createObjectType(objectType47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry51.createObjectType(objectType52);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        boolean boolean57 = jSTypeRegistry56.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList58 = com.google.common.collect.ImmutableList.of(jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry32, jSTypeRegistry36, jSTypeRegistry41, jSTypeRegistry46, jSTypeRegistry51, jSTypeRegistry56);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray59 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry36.createUnionType(jSTypeNativeArray59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry63.createObjectType(objectType64);
        com.google.javascript.rhino.jstype.ObjectType objectType66 = objectType65.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] { objectType65 };
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry20.createFunctionType(jSType60, jSTypeArray67);
        com.google.javascript.rhino.jstype.ObjectType.Property property70 = functionType68.getSlot("Not declared as a type name");
        boolean boolean72 = functionType68.isPropertyTypeDeclared("[, hi!, , ]");
        int int73 = charSequenceList12.indexOf((java.lang.Object) boolean72);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator74 = charSequenceList12.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence77 = charSequenceList12.set(51, (java.lang.CharSequence) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[, hi!, , ]" + "'", str7, "[, hi!, , ]");
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList58);
        org.junit.Assert.assertNotNull(jSTypeNativeArray59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(objectType66);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertNull(property70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(charSequenceSpliterator74);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00343");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList8 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8, charSequenceArray7);
        int int10 = charSequenceList8.size();
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList13 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList13, charSequenceArray12);
        boolean boolean16 = charSequenceList13.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        int int22 = charSequenceList20.size();
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList25 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor27 = charSequenceList25.iterator();
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList31 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList31, charSequenceArray30);
        int int33 = charSequenceList31.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList34 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList8, (java.lang.Cloneable) charSequenceList13, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList25, (java.lang.Cloneable) charSequenceList31);
        java.lang.Object[] objArray35 = charSequenceList8.toArray();
        boolean boolean36 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node41.getJsDocBuilderForNode();
        fileLevelJsDocBuilder42.append("EQ");
        boolean boolean45 = charSequenceList4.contains((java.lang.Object) fileLevelJsDocBuilder42);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList48 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48, charSequenceArray47);
        boolean boolean51 = charSequenceList48.add((java.lang.CharSequence) "hi!");
        charSequenceList48.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = charSequenceList4.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList48);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charSequenceItor27);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(cloneableList34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[, hi!]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00344");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray38 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry15.createUnionType(jSTypeNativeArray38);
        jSTypeRegistry15.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry46.createObjectType(objectType47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        boolean boolean52 = jSTypeRegistry51.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        boolean boolean56 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.ObjectType objectType60 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSTypeRegistry59.createObjectType(objectType60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSTypeRegistry64.createObjectType(objectType65);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSTypeRegistry69.createObjectType(objectType70);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.ObjectType objectType75 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSTypeRegistry74.createObjectType(objectType75);
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77, true);
        boolean boolean80 = jSTypeRegistry79.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList81 = com.google.common.collect.ImmutableList.of(jSTypeRegistry46, jSTypeRegistry51, jSTypeRegistry55, jSTypeRegistry59, jSTypeRegistry64, jSTypeRegistry69, jSTypeRegistry74, jSTypeRegistry79);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray82 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry59.createUnionType(jSTypeNativeArray82);
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84, true);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType88 = jSTypeRegistry86.createObjectType(objectType87);
        com.google.javascript.rhino.jstype.ObjectType objectType89 = objectType88.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray90 = new com.google.javascript.rhino.jstype.JSType[] { objectType88 };
        com.google.javascript.rhino.jstype.FunctionType functionType91 = jSTypeRegistry43.createFunctionType(jSType83, jSTypeArray90);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot93 = functionType91.getSlot("");
        boolean boolean94 = functionType91.isFunctionPrototypeType();
        boolean boolean96 = jSTypeRegistry15.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType91, "Not declared as a type name");
        boolean boolean98 = functionType91.isPropertyTypeDeclared("unknown");
        com.google.javascript.rhino.JSDocInfo jSDocInfo99 = functionType91.getJSDocInfo();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(jSTypeNativeArray38);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList81);
        org.junit.Assert.assertNotNull(jSTypeNativeArray82);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertNotNull(objectType88);
        org.junit.Assert.assertNull(objectType89);
        org.junit.Assert.assertNotNull(jSTypeArray90);
        org.junit.Assert.assertNotNull(functionType91);
        org.junit.Assert.assertNull(staticSlot93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNull(jSDocInfo99);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00345");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean11 = node10.isObjectLit();
        int int12 = node10.getLineno();
        int int13 = node10.getLength();
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node10);
        java.lang.String str15 = node5.checkTreeEquals(node10);
        boolean boolean16 = node5.isNoSideEffectsCall();
        node5.putIntProp((-1), 4);
        com.google.javascript.rhino.Node node20 = node5.cloneNode();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(12, node26);
        boolean boolean29 = node28.isNew();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean40 = node39.isObjectLit();
        int int41 = node39.getLineno();
        int int42 = node39.getLength();
        java.lang.String str43 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node39);
        java.lang.String str44 = node34.checkTreeEquals(node39);
        com.google.javascript.rhino.Node node45 = node39.cloneNode();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean52 = node51.isObjectLit();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(12, node51);
        boolean boolean54 = node53.isArrayLit();
        boolean boolean55 = node53.isSwitch();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean62 = node61.isObjectLit();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(12, node61);
        java.lang.Object obj65 = node63.getProp((int) '#');
        com.google.javascript.rhino.Node node66 = node53.copyInformationFromForTree(node63);
        com.google.javascript.rhino.Node node67 = node66.getParent();
        boolean boolean68 = node39.hasChild(node67);
        com.google.javascript.rhino.Node node69 = node28.useSourceInfoIfMissingFrom(node39);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(35, node5, node69, (int) ' ', 52);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node5);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 40 + "'", int41 == 40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00346");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isFunctionPrototypeType();
        int int54 = functionType50.getMinArguments();
        boolean boolean55 = functionType50.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType50.getReturnType();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType50.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = functionType57.isAllType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNull(functionType57);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00347");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        boolean boolean15 = node5.isGetProp();
        boolean boolean16 = node5.isTry();
        com.google.javascript.rhino.Node node17 = node5.cloneNode();
        boolean boolean18 = node5.isName();
        boolean boolean19 = node5.isNull();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00348");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(12, node14);
        java.lang.Object obj18 = node16.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = null;
        node16.setStaticSourceFile(staticSourceFile19);
        com.google.javascript.rhino.Node node21 = node16.cloneTree();
        com.google.javascript.rhino.Node node22 = node7.copyInformationFromForTree(node21);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.siblings();
        com.google.javascript.rhino.Node node24 = node22.getFirstChild();
        boolean boolean25 = node24.isThis();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00349");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "Not declared as a type name" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList8 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        boolean boolean9 = charSequenceList2.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList8);
        boolean boolean10 = charSequenceList8.isEmpty();
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList8.spliterator();
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList15 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList15, charSequenceArray14);
        int int17 = charSequenceList15.size();
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList20 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20, charSequenceArray19);
        boolean boolean23 = charSequenceList20.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList27 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList27, charSequenceArray26);
        int int29 = charSequenceList27.size();
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList32 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor34 = charSequenceList32.iterator();
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList38 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38, charSequenceArray37);
        int int40 = charSequenceList38.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList41 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList15, (java.lang.Cloneable) charSequenceList20, (java.lang.Cloneable) charSequenceList27, (java.lang.Cloneable) charSequenceList32, (java.lang.Cloneable) charSequenceList38);
        int int42 = charSequenceList27.size();
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList45 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45, charSequenceArray44);
        boolean boolean48 = charSequenceList45.add((java.lang.CharSequence) "hi!");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet50 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] { false, booleanLiteralSet50, true };
        java.io.Serializable[] serializableArray53 = charSequenceList45.toArray(serializableArray52);
        boolean boolean54 = charSequenceList27.contains((java.lang.Object) charSequenceList45);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = charSequenceList8.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charSequenceList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(charSequenceItor34);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(cloneableList41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet50 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet50.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(serializableArray52);
        org.junit.Assert.assertNotNull(serializableArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00350");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(12, node11);
        boolean boolean14 = node11.isGetElem();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node11.addChildToFront(node19);
        node19.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node23 = node4.copyInformationFrom(node19);
        boolean boolean24 = node19.isIf();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00351");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry15.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry44.createObjectType(objectType45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        boolean boolean50 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        boolean boolean54 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSTypeRegistry62.createObjectType(objectType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSTypeRegistry67.createObjectType(objectType68);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry72.createObjectType(objectType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        boolean boolean78 = jSTypeRegistry77.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList79 = com.google.common.collect.ImmutableList.of(jSTypeRegistry44, jSTypeRegistry49, jSTypeRegistry53, jSTypeRegistry57, jSTypeRegistry62, jSTypeRegistry67, jSTypeRegistry72, jSTypeRegistry77);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray80 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry57.createUnionType(jSTypeNativeArray80);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry84.createObjectType(objectType85);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = objectType86.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] { objectType86 };
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry41.createFunctionType(jSType81, jSTypeArray88);
        com.google.javascript.rhino.jstype.FunctionType functionType91 = functionType89.getBindReturnType(0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo92 = null;
        functionType91.setJSDocInfo(jSDocInfo92);
        com.google.javascript.rhino.jstype.ObjectType objectType94 = jSTypeRegistry15.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType91);
        com.google.javascript.rhino.jstype.ObjectType objectType95 = functionType91.getTypeOfThis();
        boolean boolean96 = objectType95.isArrayType();
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList79);
        org.junit.Assert.assertNotNull(jSTypeNativeArray80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertNull(objectType87);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNotNull(functionType91);
        org.junit.Assert.assertNotNull(objectType94);
        org.junit.Assert.assertNotNull(objectType95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00352");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType50.getSlot("Not declared as a type name");
        java.lang.Iterable iterable53 = functionType50.getCtorExtendedInterfaces();
        boolean boolean54 = functionType50.isEmptyType();
        java.lang.String str55 = functionType50.getReferenceName();
        boolean boolean56 = functionType50.isNoType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00353");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("Named type with empty name component");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00354");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(12, node14);
        int int17 = node7.getIndexOfChild(node14);
        boolean boolean18 = node7.isIf();
        java.lang.String str19 = node7.toString();
        // The following exception was thrown during execution in test generation
        try {
            node7.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EQ" + "'", str19, "EQ");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00355");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        java.lang.Object obj19 = node17.getProp((int) '#');
        com.google.javascript.rhino.Node node20 = node7.copyInformationFromForTree(node17);
        boolean boolean21 = node7.isRegExp();
        java.lang.String str22 = node7.toString();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = node7.getStaticSourceFile();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EQ" + "'", str22, "EQ");
        org.junit.Assert.assertNull(staticSourceFile23);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00356");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node7 = node5.getParent();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean13 = node12.isOnlyModifiesThisCall();
        boolean boolean14 = node12.isHook();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType16 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList17 = com.google.common.collect.ImmutableList.of(subclassType15, subclassType16);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean24 = node23.isObjectLit();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(12, node23);
        boolean boolean26 = node25.isNew();
        boolean boolean27 = node25.isFalse();
        node25.putIntProp((int) '#', (int) '#');
        boolean boolean31 = node25.isReturn();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean38 = node37.isObjectLit();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(12, node37);
        java.lang.Object obj41 = node39.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship42 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType16, node25, node39);
        com.google.javascript.rhino.Node node44 = node25.getChildAtIndex((int) (byte) 0);
        boolean boolean45 = node44.isNew();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 8);
        com.google.javascript.rhino.Node[] nodeArray48 = new com.google.javascript.rhino.Node[] { node5, node12, node44, node47 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(53, nodeArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + subclassType15 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType15.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType16 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType16.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList17);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeArray48);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00357");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry43.createObjectType(objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        boolean boolean49 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        boolean boolean53 = jSTypeRegistry52.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry61.createObjectType(objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        boolean boolean77 = jSTypeRegistry76.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList78 = com.google.common.collect.ImmutableList.of(jSTypeRegistry43, jSTypeRegistry48, jSTypeRegistry52, jSTypeRegistry56, jSTypeRegistry61, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray79 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry56.createUnionType(jSTypeNativeArray79);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSTypeRegistry83.createObjectType(objectType84);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = objectType85.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] { objectType85 };
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry40.createFunctionType(jSType80, jSTypeArray87);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot90 = functionType88.getSlot("");
        boolean boolean91 = functionType88.isFunctionPrototypeType();
        int int92 = functionType88.getMinArguments();
        boolean boolean94 = jSTypeRegistry7.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType88, "hi!");
        java.util.Set<java.lang.String> strSet95 = functionType88.getOwnPropertyNames();
        boolean boolean96 = strSet95.isEmpty();
        java.util.Iterator<java.lang.String> strItor97 = strSet95.iterator();
        java.lang.String[] strArray98 = new java.lang.String[] {};
        java.lang.Comparable<java.lang.String>[] strComparableArray99 = strSet95.toArray((java.lang.Comparable<java.lang.String>[]) strArray98);
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList78);
        org.junit.Assert.assertNotNull(jSTypeNativeArray79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNull(objectType86);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertNull(staticSlot90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(strItor97);
        org.junit.Assert.assertNotNull(strArray98);
        org.junit.Assert.assertNotNull(strComparableArray99);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00358");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(12, node6);
        boolean boolean9 = node8.isArrayLit();
        boolean boolean10 = node8.isSwitch();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(12, node16);
        java.lang.Object obj20 = node18.getProp((int) '#');
        com.google.javascript.rhino.Node node21 = node8.copyInformationFromForTree(node18);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(12, node27);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(12, node35);
        boolean boolean38 = node37.isNew();
        boolean boolean39 = node37.isFalse();
        com.google.javascript.rhino.Node node40 = node27.srcrefTree(node37);
        com.google.javascript.rhino.InputId inputId41 = node27.getInputId();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean47 = node46.isLabel();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean54 = node53.isObjectLit();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(12, node53);
        boolean boolean56 = node53.isGetElem();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node53.addChildToFront(node61);
        boolean boolean63 = node61.isTry();
        com.google.javascript.rhino.Node node64 = node46.srcrefTree(node61);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(40, node18, node27, node64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(inputId41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00359");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node7.siblings();
        node7.putBooleanProp(10, true);
        boolean boolean14 = node7.isName();
        com.google.javascript.rhino.jstype.JSType jSType15 = node7.getJSType();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = node7.getExistingIntProp(38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 38");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00360");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node7.setStaticSourceFile(staticSourceFile10);
        node7.setIsSyntheticBlock(true);
        boolean boolean14 = node7.isSetterDef();
        boolean boolean15 = node7.isHook();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean26 = node25.isObjectLit();
        int int27 = node25.getLineno();
        int int28 = node25.getLength();
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node25);
        java.lang.String str30 = node20.checkTreeEquals(node25);
        boolean boolean31 = node20.isDo();
        com.google.javascript.rhino.Node node32 = node7.srcref(node20);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node32);
        boolean boolean34 = node33.isThis();
        // The following exception was thrown during execution in test generation
        try {
            double double35 = node33.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EXPR_RESULT 40 is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 40 + "'", int27 == 40);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00361");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean3 = node2.isArrayLit();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags5 = new com.google.javascript.rhino.Node.SideEffectFlags(0);
        sideEffectFlags5.clearSideEffectFlags();
        sideEffectFlags5.setMutatesGlobalState();
        sideEffectFlags5.clearAllFlags();
        // The following exception was thrown during execution in test generation
        try {
            node2.setSideEffectFlags(sideEffectFlags5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got ASSIGN_MOD");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00362");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry43.createObjectType(objectType44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        boolean boolean49 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        boolean boolean53 = jSTypeRegistry52.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.ObjectType objectType62 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry61.createObjectType(objectType62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        boolean boolean77 = jSTypeRegistry76.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList78 = com.google.common.collect.ImmutableList.of(jSTypeRegistry43, jSTypeRegistry48, jSTypeRegistry52, jSTypeRegistry56, jSTypeRegistry61, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray79 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry56.createUnionType(jSTypeNativeArray79);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType85 = jSTypeRegistry83.createObjectType(objectType84);
        com.google.javascript.rhino.jstype.ObjectType objectType86 = objectType85.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] { objectType85 };
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry40.createFunctionType(jSType80, jSTypeArray87);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot90 = functionType88.getSlot("");
        boolean boolean91 = functionType88.isFunctionPrototypeType();
        int int92 = functionType88.getMinArguments();
        boolean boolean94 = jSTypeRegistry7.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType88, "hi!");
        java.util.Set<java.lang.String> strSet95 = functionType88.getPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType96 = functionType88.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList78);
        org.junit.Assert.assertNotNull(jSTypeNativeArray79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNull(objectType86);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertNull(staticSlot90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(strSet95);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00363");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "function ({939717413}): function (this:me, {365018168}): me");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList7 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int9 = charSequenceList7.lastIndexOf((java.lang.Object) 39);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        boolean boolean18 = node15.isGetElem();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node15.addChildToFront(node23);
        com.google.javascript.rhino.Node node25 = node23.getLastSibling();
        boolean boolean26 = charSequenceList7.contains((java.lang.Object) node23);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(12, node32);
        boolean boolean35 = node32.isGetElem();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node32.addChildToFront(node40);
        java.lang.String str42 = node23.checkTreeEquals(node32);
        com.google.javascript.rhino.Node node43 = node2.useSourceInfoFromForTree(node23);
        boolean boolean44 = node2.isString();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(charSequenceList7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Node tree inequality:\nTree1:\nSHEQ  40\n\n\nTree2:\nSHEQ  40\n    SHEQ  40\n\n\nSubtree1: SHEQ  40\n\n\nSubtree2: SHEQ  40\n    SHEQ  40\n" + "'", str42, "Node tree inequality:\nTree1:\nSHEQ  40\n\n\nTree2:\nSHEQ  40\n    SHEQ  40\n\n\nSubtree1: SHEQ  40\n\n\nSubtree2: SHEQ  40\n    SHEQ  40\n");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00364");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = ternaryValue1.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue3.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue2.or(ternaryValue3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue0.and(ternaryValue2);
        boolean boolean8 = ternaryValue6.toBoolean(false);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00365");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType50.getSlot("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType50.getPropertyType("hi!");
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType50.unboxesTo();
        boolean boolean56 = functionType50.isInstanceType();
        boolean boolean57 = functionType50.hasAnyTemplateInternal();
        com.google.javascript.rhino.Node node58 = functionType50.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType59 = functionType50.getParentScope();
        boolean boolean61 = functionType50.hasProperty("function ({2031960127}): function (this:me, {1023964809}): me");
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNull(jSType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00366");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.ObjectType objectType57 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry56.createObjectType(objectType57);
        com.google.javascript.rhino.jstype.FunctionType functionType59 = objectType58.getConstructor();
        boolean boolean60 = objectType58.isFunctionType();
        boolean boolean61 = functionType50.isSubtype((com.google.javascript.rhino.jstype.JSType) objectType58);
        boolean boolean62 = objectType58.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType64 = objectType58.findPropertyType("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType65 = jSType64.autobox();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(jSType64);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00367");
        java.lang.String[] strArray7 = new java.lang.String[] { "function ({1150383454}): function (this:me, {173962701}): me", "InputId: Unknown class name", "function (?): ?", "InputId: Unknown class name", "function ({939717413}): function (this:me, {365018168}): me", "function ({89774946}): function (this:me, {1297374001}): me", "function ({1150383454}): function (this:me, {173962701}): me" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.Spliterator<java.lang.String> strSpliterator10 = strSet8.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator11 = strSet8.spliterator();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertNotNull(strSpliterator11);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00368");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 0);
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00369");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean11 = node10.isObjectLit();
        int int12 = node10.getLineno();
        int int13 = node10.getLength();
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node10);
        java.lang.String str15 = node5.checkTreeEquals(node10);
        boolean boolean16 = node5.isNoSideEffectsCall();
        node5.putIntProp((-1), 4);
        com.google.javascript.rhino.Node node20 = node5.cloneNode();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(12, node26);
        boolean boolean29 = node28.isNew();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean40 = node39.isObjectLit();
        int int41 = node39.getLineno();
        int int42 = node39.getLength();
        java.lang.String str43 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node39);
        java.lang.String str44 = node34.checkTreeEquals(node39);
        com.google.javascript.rhino.Node node45 = node39.cloneNode();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean52 = node51.isObjectLit();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(12, node51);
        boolean boolean54 = node53.isArrayLit();
        boolean boolean55 = node53.isSwitch();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean62 = node61.isObjectLit();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(12, node61);
        java.lang.Object obj65 = node63.getProp((int) '#');
        com.google.javascript.rhino.Node node66 = node53.copyInformationFromForTree(node63);
        com.google.javascript.rhino.Node node67 = node66.getParent();
        boolean boolean68 = node39.hasChild(node67);
        com.google.javascript.rhino.Node node69 = node28.useSourceInfoIfMissingFrom(node39);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(35, node5, node69, (int) ' ', 52);
        // The following exception was thrown during execution in test generation
        try {
            node72.setDouble(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GETELEM 32 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 40 + "'", int41 == 40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00370");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSTypeRegistry53.createObjectType(objectType54);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        boolean boolean59 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        boolean boolean63 = jSTypeRegistry62.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry66.createObjectType(objectType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.ObjectType objectType72 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry71.createObjectType(objectType72);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        com.google.javascript.rhino.jstype.ObjectType objectType77 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSTypeRegistry76.createObjectType(objectType77);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79, true);
        com.google.javascript.rhino.jstype.ObjectType objectType82 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSTypeRegistry81.createObjectType(objectType82);
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84, true);
        boolean boolean87 = jSTypeRegistry86.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList88 = com.google.common.collect.ImmutableList.of(jSTypeRegistry53, jSTypeRegistry58, jSTypeRegistry62, jSTypeRegistry66, jSTypeRegistry71, jSTypeRegistry76, jSTypeRegistry81, jSTypeRegistry86);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray89 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry66.createUnionType(jSTypeNativeArray89);
        com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry2.createOptionalNullableType(jSType90);
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSType90.dereference();
        boolean boolean93 = jSType90.isCheckedUnknownType();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertNotNull(objectType83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList88);
        org.junit.Assert.assertNotNull(jSTypeNativeArray89);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00371");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 50);
        node1.setDouble((double) (-1));
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00372");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType50.findPropertyType("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType53 = functionType50.getParentScope();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = functionType50.getJSDocInfo();
        com.google.javascript.rhino.jstype.ObjectType objectType55 = functionType50.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType56 = objectType55.toMaybeParameterizedType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType57 = parameterizedType56.getTypeOfThis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(jSType52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNull(jSDocInfo54);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertNull(parameterizedType56);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00373");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(12, node12);
        boolean boolean15 = node12.isGetElem();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node12.addChildToFront(node20);
        com.google.javascript.rhino.Node node22 = node20.getLastSibling();
        boolean boolean23 = charSequenceList4.contains((java.lang.Object) node20);
        boolean boolean24 = node20.isTrue();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder25 = node20.getJsDocBuilderForNode();
        java.lang.String str26 = node20.getString();
        boolean boolean27 = node20.isEmpty();
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00374");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        boolean boolean10 = node7.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node7.children();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList15 = com.google.common.collect.ImmutableList.of(subclassType13, subclassType14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(12, node21);
        boolean boolean24 = node23.isNew();
        boolean boolean25 = node23.isFalse();
        node23.putIntProp((int) '#', (int) '#');
        boolean boolean29 = node23.isReturn();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(12, node35);
        java.lang.Object obj39 = node37.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship40 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType14, node23, node37);
        com.google.javascript.rhino.Node node41 = node7.useSourceInfoIfMissingFrom(node23);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile42 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        boolean boolean43 = node7.isFunction();
        node7.setSourceEncodedPosition(50);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(staticSourceFile11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + subclassType13 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType13.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType14 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType14.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(staticSourceFile42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00375");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isStringObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType54 = functionType50.getConstructor();
        java.lang.String str55 = functionType50.toDebugHashCodeString();
        java.util.Set<java.lang.String> strSet56 = functionType50.getOwnPropertyNames();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList61 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList65 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65, charSequenceArray64);
        int int67 = charSequenceList65.size();
        java.lang.CharSequence[] charSequenceArray69 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList70 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList70, charSequenceArray69);
        boolean boolean73 = charSequenceList70.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray76 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList77 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList77, charSequenceArray76);
        int int79 = charSequenceList77.size();
        java.lang.CharSequence[] charSequenceArray81 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList82 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList82, charSequenceArray81);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor84 = charSequenceList82.iterator();
        java.lang.CharSequence[] charSequenceArray87 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList88 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList88, charSequenceArray87);
        int int90 = charSequenceList88.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList91 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList65, (java.lang.Cloneable) charSequenceList70, (java.lang.Cloneable) charSequenceList77, (java.lang.Cloneable) charSequenceList82, (java.lang.Cloneable) charSequenceList88);
        java.lang.Object[] objArray92 = charSequenceList65.toArray();
        boolean boolean93 = charSequenceList61.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList65);
        com.google.javascript.rhino.InputId inputId95 = new com.google.javascript.rhino.InputId("");
        java.lang.String str96 = inputId95.getIdName();
        int int97 = charSequenceList61.lastIndexOf((java.lang.Object) str96);
        boolean boolean98 = strSet56.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList61);
        java.util.Spliterator<java.lang.String> strSpliterator99 = strSet56.spliterator();
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(functionType54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "function ({647613073}): function (this:me, {1833668556}): me" + "'", str55, "function ({647613073}): function (this:me, {1833668556}): me");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(charSequenceList61);
        org.junit.Assert.assertNotNull(charSequenceArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(charSequenceArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(charSequenceItor84);
        org.junit.Assert.assertNotNull(charSequenceArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
        org.junit.Assert.assertNotNull(cloneableList91);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[, hi!]");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 3 + "'", int97 == 3);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(strSpliterator99);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00376");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        com.google.javascript.rhino.Node node15 = node13.getLastSibling();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean19 = node13.isEquivalentToTyped(node18);
        boolean boolean20 = node18.isVarArgs();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean26 = node25.isObjectLit();
        int int27 = node25.getLineno();
        com.google.javascript.rhino.Node node28 = node18.useSourceInfoFromForTree(node25);
        com.google.javascript.rhino.Node node30 = node25.getAncestor(35);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 40 + "'", int27 == 40);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00377");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isObjectLit();
        boolean boolean6 = node4.isEmpty();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean18 = node17.isObjectLit();
        int int19 = node17.getLineno();
        int int20 = node17.getLength();
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node17);
        java.lang.String str22 = node12.checkTreeEquals(node17);
        boolean boolean23 = node12.isDo();
        boolean boolean24 = node12.isSyntheticBlock();
        int int26 = node12.getIntProp((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildBefore(node7, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 40 + "'", int19 == 40);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00378");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        node13.setIsSyntheticBlock(false);
        boolean boolean17 = node13.isGetterDef();
        boolean boolean18 = node13.isDebugger();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(12, node24);
        boolean boolean27 = node26.isNew();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean38 = node37.isObjectLit();
        int int39 = node37.getLineno();
        int int40 = node37.getLength();
        java.lang.String str41 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node37);
        java.lang.String str42 = node32.checkTreeEquals(node37);
        com.google.javascript.rhino.Node node43 = node37.cloneNode();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean50 = node49.isObjectLit();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(12, node49);
        boolean boolean52 = node51.isArrayLit();
        boolean boolean53 = node51.isSwitch();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean60 = node59.isObjectLit();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(12, node59);
        java.lang.Object obj63 = node61.getProp((int) '#');
        com.google.javascript.rhino.Node node64 = node51.copyInformationFromForTree(node61);
        com.google.javascript.rhino.Node node65 = node64.getParent();
        boolean boolean66 = node37.hasChild(node65);
        com.google.javascript.rhino.Node node67 = node26.useSourceInfoIfMissingFrom(node37);
        com.google.javascript.rhino.Node node68 = node13.srcref(node67);
        boolean boolean69 = node67.isRegExp();
        com.google.javascript.rhino.Node node70 = node67.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            int int72 = node67.getExistingIntProp(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 50");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 40 + "'", int39 == 40);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00379");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isObjectLit();
        int int6 = node4.getLineno();
        int int7 = node4.getLength();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00380");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType50.getBindReturnType(0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = null;
        functionType52.setJSDocInfo(jSDocInfo53);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable55 = functionType52.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList56 = null;
        // The following exception was thrown during execution in test generation
        try {
            functionType52.setExtendedInterfaces(objectTypeList56);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNotNull(objectTypeIterable55);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00381");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        boolean boolean5 = charSequenceList2.add((java.lang.CharSequence) "hi!");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        java.io.Serializable[] serializableArray9 = new java.io.Serializable[] { false, booleanLiteralSet7, true };
        java.io.Serializable[] serializableArray10 = charSequenceList2.toArray(serializableArray9);
        charSequenceList2.clear();
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "Not declared as a type name" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList14 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14, charSequenceArray13);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList20 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        boolean boolean21 = charSequenceList14.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20);
        boolean boolean22 = charSequenceList2.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList20);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str24 = jSDocInfo23.getMeaning();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility25 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo23.setVisibility(visibility25);
        boolean boolean27 = jSDocInfo23.hasBaseType();
        java.util.Set<java.lang.String> strSet28 = jSDocInfo23.getParameterNames();
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList32 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        int int34 = charSequenceList32.size();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        boolean boolean40 = charSequenceList37.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList44 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44, charSequenceArray43);
        int int46 = charSequenceList44.size();
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList49 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList49, charSequenceArray48);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor51 = charSequenceList49.iterator();
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList55 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList55, charSequenceArray54);
        int int57 = charSequenceList55.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList58 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList32, (java.lang.Cloneable) charSequenceList37, (java.lang.Cloneable) charSequenceList44, (java.lang.Cloneable) charSequenceList49, (java.lang.Cloneable) charSequenceList55);
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList62 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList62, charSequenceArray61);
        int int64 = charSequenceList62.size();
        java.lang.CharSequence[] charSequenceArray66 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList67 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList67, charSequenceArray66);
        boolean boolean70 = charSequenceList67.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList74 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList74, charSequenceArray73);
        int int76 = charSequenceList74.size();
        java.lang.CharSequence[] charSequenceArray78 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList79 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList79, charSequenceArray78);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor81 = charSequenceList79.iterator();
        java.lang.CharSequence[] charSequenceArray84 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList85 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList85, charSequenceArray84);
        int int87 = charSequenceList85.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList88 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList62, (java.lang.Cloneable) charSequenceList67, (java.lang.Cloneable) charSequenceList74, (java.lang.Cloneable) charSequenceList79, (java.lang.Cloneable) charSequenceList85);
        boolean boolean89 = charSequenceList37.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList79);
        com.google.javascript.rhino.Node node94 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean95 = node94.isObjectLit();
        int int96 = charSequenceList79.indexOf((java.lang.Object) boolean95);
        charSequenceList79.clear();
        boolean boolean98 = strSet28.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList79);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = charSequenceList20.remove((java.lang.Object) boolean98);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(serializableArray9);
        org.junit.Assert.assertNotNull(serializableArray10);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charSequenceList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + visibility25 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility25.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(charSequenceItor51);
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(cloneableList58);
        org.junit.Assert.assertNotNull(charSequenceArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(charSequenceArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(charSequenceItor81);
        org.junit.Assert.assertNotNull(charSequenceArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
        org.junit.Assert.assertNotNull(cloneableList88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00382");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "unknown");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00383");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType1 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList2 = com.google.common.collect.ImmutableList.of(subclassType0, subclassType1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, true);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry9.createObjectType(objectType10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        boolean boolean19 = jSTypeRegistry18.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry22.createObjectType(objectType23);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSTypeRegistry27.createObjectType(objectType28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry32.createObjectType(objectType33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry37.createObjectType(objectType38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        boolean boolean43 = jSTypeRegistry42.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList44 = com.google.common.collect.ImmutableList.of(jSTypeRegistry9, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry22, jSTypeRegistry27, jSTypeRegistry32, jSTypeRegistry37, jSTypeRegistry42);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray45 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry22.createUnionType(jSTypeNativeArray45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSTypeRegistry49.createObjectType(objectType50);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = objectType51.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] { objectType51 };
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry6.createFunctionType(jSType46, jSTypeArray53);
        functionType54.clearCachedValues();
        boolean boolean56 = functionType54.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet57 = functionType54.getPossibleToBooleanOutcomes();
        boolean boolean58 = functionType54.hasImplementedInterfaces();
        boolean boolean60 = functionType54.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType54.getTypeOfThis();
        com.google.javascript.rhino.Node node62 = functionType54.getParametersNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship63 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType1, node3, node62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType1 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType1.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList2);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList44);
        org.junit.Assert.assertNotNull(jSTypeNativeArray45);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNull(objectType52);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet57 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet57.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertNotNull(node62);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00384");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry15.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry44.createObjectType(objectType45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        boolean boolean50 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        boolean boolean54 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry57.createObjectType(objectType58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSTypeRegistry62.createObjectType(objectType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType69 = jSTypeRegistry67.createObjectType(objectType68);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType74 = jSTypeRegistry72.createObjectType(objectType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        boolean boolean78 = jSTypeRegistry77.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList79 = com.google.common.collect.ImmutableList.of(jSTypeRegistry44, jSTypeRegistry49, jSTypeRegistry53, jSTypeRegistry57, jSTypeRegistry62, jSTypeRegistry67, jSTypeRegistry72, jSTypeRegistry77);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray80 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry57.createUnionType(jSTypeNativeArray80);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        com.google.javascript.rhino.jstype.ObjectType objectType85 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType86 = jSTypeRegistry84.createObjectType(objectType85);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = objectType86.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] { objectType86 };
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry41.createFunctionType(jSType81, jSTypeArray88);
        com.google.javascript.rhino.jstype.ObjectType.Property property91 = functionType89.getSlot("Not declared as a type name");
        boolean boolean93 = functionType89.isPropertyTypeDeclared("[, hi!, , ]");
        boolean boolean94 = functionType89.canBeCalled();
        java.lang.String str95 = functionType89.getReferenceName();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection96 = jSTypeRegistry15.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType89);
        boolean boolean98 = functionType89.isPropertyTypeDeclared("function ({1398584604}): function (this:me, {772133956}): me");
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList79);
        org.junit.Assert.assertNotNull(jSTypeNativeArray80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertNull(objectType87);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNull(property91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNotNull(functionTypeCollection96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00385");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType50.getSlot("Not declared as a type name");
        boolean boolean54 = functionType50.hasProperty("Named type with empty name component");
        boolean boolean55 = functionType50.isReturnTypeInferred();
        java.lang.Iterable iterable56 = functionType50.getCtorExtendedInterfaces();
        boolean boolean58 = functionType50.isPropertyTypeInferred("Named type with empty name component");
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(iterable56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00386");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = jSTypeRegistry5.createObjectType(objectType6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        boolean boolean11 = jSTypeRegistry10.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry18.createObjectType(objectType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry23.createObjectType(objectType24);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry28.createObjectType(objectType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = jSTypeRegistry33.createObjectType(objectType34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        boolean boolean39 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList40 = com.google.common.collect.ImmutableList.of(jSTypeRegistry5, jSTypeRegistry10, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry23, jSTypeRegistry28, jSTypeRegistry33, jSTypeRegistry38);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray41 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry18.createUnionType(jSTypeNativeArray41);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry45.createObjectType(objectType46);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] { objectType47 };
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry2.createFunctionType(jSType42, jSTypeArray49);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType50.getSlot("");
        boolean boolean53 = functionType50.isInterface();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType50.getPropertyType("function ({78584469}): function (this:me, {412571282}): me");
        org.junit.Assert.assertNotNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList40);
        org.junit.Assert.assertNotNull(jSTypeNativeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSType55);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00387");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean8 = node7.isObjectLit();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(12, node7);
        java.lang.Object obj11 = node9.getProp((int) '#');
        boolean boolean12 = node9.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node9);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(12, node19);
        boolean boolean22 = node19.isGetElem();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node19.addChildToFront(node27);
        com.google.javascript.rhino.Node node29 = node27.getLastSibling();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean33 = node27.isEquivalentToTyped(node32);
        com.google.javascript.rhino.Node[] nodeArray34 = new com.google.javascript.rhino.Node[] { node9, node32 };
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) '#', nodeArray34, 0, 4095);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(1, nodeArray34, 0, 4095);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodeArray34);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00388");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        boolean boolean18 = node17.isArrayLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(12, node24);
        java.lang.Object obj28 = node26.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = null;
        node26.setStaticSourceFile(staticSourceFile29);
        com.google.javascript.rhino.Node node31 = node26.cloneTree();
        com.google.javascript.rhino.Node node32 = node17.copyInformationFromForTree(node31);
        com.google.javascript.rhino.Node node33 = node7.clonePropsFrom(node17);
        com.google.javascript.rhino.Node node34 = node17.removeFirstChild();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean36 = jSDocInfo35.hasEnumParameterType();
        java.lang.String str37 = jSDocInfo35.getDeprecationReason();
        node34.setJSDocInfo(jSDocInfo35);
        java.util.Collection<java.lang.String> strCollection39 = jSDocInfo35.getAuthors();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression40 = jSDocInfo35.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression41 = jSDocInfo35.getThisType();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(strCollection39);
        org.junit.Assert.assertNull(jSTypeExpression40);
        org.junit.Assert.assertNull(jSTypeExpression41);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00389");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.createObjectType(objectType3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        boolean boolean12 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry15.createObjectType(objectType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry20.createObjectType(objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = jSTypeRegistry25.createObjectType(objectType26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry30.createObjectType(objectType31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        boolean boolean36 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList37 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry7, jSTypeRegistry11, jSTypeRegistry15, jSTypeRegistry20, jSTypeRegistry25, jSTypeRegistry30, jSTypeRegistry35);
        jSTypeRegistry11.incrementGeneration();
        jSTypeRegistry11.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative41 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType42 = jSTypeRegistry11.getNativeObjectType(jSTypeNative41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList37);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00390");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(12, node8);
        boolean boolean11 = node10.isArrayLit();
        boolean boolean12 = node10.isSwitch();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean19 = node18.isObjectLit();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(12, node18);
        java.lang.Object obj22 = node20.getProp((int) '#');
        com.google.javascript.rhino.Node node23 = node10.copyInformationFromForTree(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newExpr(node23);
        int int25 = node2.getIndexOfChild(node23);
        boolean boolean26 = node23.wasEmptyNode();
        boolean boolean28 = node23.getBooleanProp((-1));
        node23.setLineno(50);
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node32 = node23.useSourceInfoFrom(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00391");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node7.setStaticSourceFile(staticSourceFile10);
        node7.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(12, node19);
        boolean boolean22 = node19.isGetElem();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node19.addChildToFront(node27);
        boolean boolean29 = node27.isDefaultCase();
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node27);
        com.google.javascript.rhino.Node node31 = node7.useSourceInfoFrom(node27);
        boolean boolean32 = node7.isNew();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00392");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType1 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList2 = com.google.common.collect.ImmutableList.of(subclassType0, subclassType1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(12, node9);
        boolean boolean12 = node9.isGetElem();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node9.addChildToFront(node17);
        com.google.javascript.rhino.Node node19 = node17.getLastSibling();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean23 = node17.isEquivalentToTyped(node22);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder24 = node22.getJsDocBuilderForNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship25 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType1, node3, node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + subclassType1 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType1.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(subclassTypeList2);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder24);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00393");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        boolean boolean3 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, true);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry9.createObjectType(objectType10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        boolean boolean15 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        boolean boolean19 = jSTypeRegistry18.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry22.createObjectType(objectType23);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSTypeRegistry27.createObjectType(objectType28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry32.createObjectType(objectType33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry37.createObjectType(objectType38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        boolean boolean43 = jSTypeRegistry42.shouldTolerateUndefinedValues();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList44 = com.google.common.collect.ImmutableList.of(jSTypeRegistry9, jSTypeRegistry14, jSTypeRegistry18, jSTypeRegistry22, jSTypeRegistry27, jSTypeRegistry32, jSTypeRegistry37, jSTypeRegistry42);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray45 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry22.createUnionType(jSTypeNativeArray45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSTypeRegistry49.createObjectType(objectType50);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = objectType51.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] { objectType51 };
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry6.createFunctionType(jSType46, jSTypeArray53);
        com.google.javascript.rhino.jstype.ObjectType.Property property56 = functionType54.getSlot("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType54.getPropertyType("hi!");
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry2.createDefaultObjectUnion(jSType58);
        boolean boolean60 = jSType58.isNoResolvedType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jSTypeRegistryList44);
        org.junit.Assert.assertNotNull(jSTypeNativeArray45);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNull(objectType52);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertNull(property56);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00394");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor7 = charSequenceList4.listIterator();
        int int8 = charSequenceList4.size();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(12, node14);
        boolean boolean17 = node16.isArrayLit();
        boolean boolean18 = charSequenceList4.equals((java.lang.Object) node16);
        boolean boolean19 = charSequenceList4.isEmpty();
        java.util.Iterator<java.lang.CharSequence> charSequenceItor20 = charSequenceList4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList4.add((int) '4', (java.lang.CharSequence) "function ({730521401}): function (this:me, {1911333808}): me");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charSequenceItor20);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00395");
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList0 = com.google.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(iOExceptionList0);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00396");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo0.setVisibility(visibility2);
        jSDocInfo0.addSuppression("Node tree inequality:\nTree1:\nGETELEM 0\n    EQ\n        SHEQ  40\n    ASSIGN_MOD [, hi!, , ]\n\n\nTree2:\nSHEQ  40\n\n\nSubtree1: GETELEM 0\n    EQ\n        SHEQ  40\n    ASSIGN_MOD [, hi!, , ]\n\n\nSubtree2: SHEQ  40\n");
        boolean boolean6 = jSDocInfo0.isExport();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00397");
        com.google.common.collect.ImmutableList.Builder<java.util.AbstractCollection<java.lang.CharSequence>> charSequenceCollectionBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.util.AbstractCollection<java.lang.CharSequence>>();
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00398");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        node2.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node5 = node2.getNext();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00399");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        java.lang.String str7 = charSequenceList4.toString();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int14 = charSequenceList12.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor15 = charSequenceList12.listIterator();
        int int16 = charSequenceList12.size();
        boolean boolean17 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList22 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList25 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor27 = charSequenceList25.iterator();
        int int28 = charSequenceList22.lastIndexOf((java.lang.Object) charSequenceItor27);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList32 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList32, charSequenceArray31);
        int int34 = charSequenceList32.size();
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList37 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList37, charSequenceArray36);
        boolean boolean40 = charSequenceList37.add((java.lang.CharSequence) "hi!");
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList44 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44, charSequenceArray43);
        int int46 = charSequenceList44.size();
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList49 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList49, charSequenceArray48);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor51 = charSequenceList49.iterator();
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList55 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList55, charSequenceArray54);
        int int57 = charSequenceList55.size();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList58 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) charSequenceList32, (java.lang.Cloneable) charSequenceList37, (java.lang.Cloneable) charSequenceList44, (java.lang.Cloneable) charSequenceList49, (java.lang.Cloneable) charSequenceList55);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator59 = charSequenceList32.spliterator();
        boolean boolean60 = charSequenceList22.contains((java.lang.Object) charSequenceList32);
        int int61 = charSequenceList22.size();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList64 = charSequenceList22.subList((int) (short) 1, 4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = charSequenceList4.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[, hi!, , ]" + "'", str7, "[, hi!, , ]");
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charSequenceItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charSequenceList22);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charSequenceItor27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(charSequenceItor51);
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(cloneableList58);
        org.junit.Assert.assertNotNull(charSequenceSpliterator59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4 + "'", int61 == 4);
        org.junit.Assert.assertNotNull(charSequenceList64);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00400");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("function ({343651606}): function (this:me, {1526131345}): me");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}
