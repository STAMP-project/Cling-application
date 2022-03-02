import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01601");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = null;
        jSDocInfo0.setVisibility(visibility3);
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        boolean boolean7 = jSDocInfo0.isInterface();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01602");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(0);
        boolean boolean9 = node8.isCall();
        com.google.javascript.rhino.Node node10 = node8.cloneTree();
        boolean boolean11 = node8.isNull();
        jSDocInfo0.setAssociatedNode(node8);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        jSTypeRegistry28.unregisterPropertyOnType("(Not declared as a type name)", jSType30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry28.createFunctionType(jSType32, true, jSTypeArray34);
        boolean boolean37 = functionType35.removeProperty("false");
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        boolean boolean43 = node39.isStringKey();
        boolean boolean44 = node39.isThrow();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj50 = node48.getProp((int) (byte) 10);
        boolean boolean51 = node39.isEquivalentToTyped(node48);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(0);
        node54.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(32, node54);
        boolean boolean59 = node58.isInstanceOf();
        com.google.javascript.rhino.Node node60 = node48.useSourceInfoFromForTree(node58);
        boolean boolean61 = node58.isDo();
        boolean boolean62 = functionType22.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType35, node58);
        boolean boolean63 = functionType35.isUnknownType();
        java.util.Set<java.lang.String> strSet64 = functionType35.getPropertyNames();
        node8.setJSType((com.google.javascript.rhino.jstype.JSType) functionType35);
        boolean boolean66 = functionType35.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        jSTypeRegistry69.unregisterPropertyOnType("(Not declared as a type name)", jSType71);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry69.createFunctionType(jSType73, true, jSTypeArray75);
        com.google.common.collect.ImmutableList<java.lang.String> strList77 = functionType76.getTemplateTypeNames();
        boolean boolean78 = functionType76.isReturnTypeInferred();
        com.google.javascript.rhino.Node node79 = functionType76.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean81 = jSDocInfo80.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression82 = jSDocInfo80.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility83 = null;
        jSDocInfo80.setVisibility(visibility83);
        boolean boolean85 = jSDocInfo80.isOverride();
        functionType76.setJSDocInfo(jSDocInfo80);
        functionType35.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType76);
        boolean boolean88 = functionType76.isRegexpType();
        boolean boolean89 = functionType76.isNoObjectType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable90 = functionType76.getOwnImplementedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(jSTypeExpression82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable90);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01603");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator4 = charSequenceList2.spliterator();
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream5 = charSequenceList2.stream();
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray11);
        boolean boolean13 = charSequenceList2.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean14 = charSequenceList12.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList15 = charSequenceList12.reverse();
        int int16 = charSequenceList12.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor17 = charSequenceList12.listIterator();
        int int18 = charSequenceList12.size();
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator4);
        org.junit.Assert.assertNotNull(charSequenceStream5);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charSequenceList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(charSequenceItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01604");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        node25.putIntProp((-1), 35);
        boolean boolean29 = node25.isStringKey();
        boolean boolean30 = node25.isThrow();
        int int31 = charSequenceList6.indexOf((java.lang.Object) node25);
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream32 = charSequenceList6.parallelStream();
        boolean boolean33 = charSequenceList6.isEmpty();
        java.lang.Object[] objArray34 = charSequenceList6.toArray();
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList41 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray40);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList44 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44, charSequenceArray43);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator46 = charSequenceList44.spliterator();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0);
        node49.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(32, node49);
        boolean boolean54 = node53.isGetterDef();
        boolean boolean55 = charSequenceList44.equals((java.lang.Object) boolean54);
        boolean boolean57 = charSequenceList44.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean58 = charSequenceList41.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList44);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry61.createFunctionType(jSType65, true, jSTypeArray67);
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType68.autoboxesTo();
        boolean boolean70 = functionType68.hasInstanceType();
        boolean boolean71 = charSequenceList41.equals((java.lang.Object) boolean70);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = charSequenceList6.removeAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(charSequenceStream32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertNotNull(charSequenceList41);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01605");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList7 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList14 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray13);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList17 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17, charSequenceArray16);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator19 = charSequenceList17.spliterator();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(0);
        node22.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(32, node22);
        boolean boolean27 = node26.isGetterDef();
        boolean boolean28 = charSequenceList17.equals((java.lang.Object) boolean27);
        boolean boolean30 = charSequenceList17.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean31 = charSequenceList14.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList17);
        java.util.ListIterator<java.lang.CharSequence> charSequenceItor32 = charSequenceList14.listIterator();
        boolean boolean33 = charSequenceList7.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList14);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        node35.putIntProp((-1), 35);
        boolean boolean39 = node35.isStringKey();
        boolean boolean40 = node35.isThrow();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj46 = node44.getProp((int) (byte) 10);
        boolean boolean47 = node35.isEquivalentToTyped(node44);
        com.google.javascript.rhino.Node node48 = node44.removeChildren();
        int int49 = charSequenceList7.lastIndexOf((java.lang.Object) node44);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(0);
        node53.putIntProp((-1), 35);
        boolean boolean57 = node53.isStringKey();
        boolean boolean58 = node53.isThrow();
        com.google.javascript.rhino.Node node59 = node51.useSourceInfoFrom(node53);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(0);
        boolean boolean63 = node62.isCall();
        com.google.javascript.rhino.Node node64 = node62.cloneTree();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(35, node64, node67);
        com.google.javascript.rhino.Node node69 = node51.copyInformationFrom(node64);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(0);
        boolean boolean72 = node71.isInstanceOf();
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(0);
        node74.putIntProp((-1), 35);
        boolean boolean78 = node74.isStringKey();
        boolean boolean79 = node74.isThrow();
        boolean boolean80 = node74.isEmpty();
        com.google.javascript.rhino.Node node81 = node71.useSourceInfoFrom(node74);
        boolean boolean82 = node81.isVar();
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(0);
        boolean boolean85 = node84.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile86 = node84.getStaticSourceFile();
        node84.setLineno((int) '4');
        com.google.javascript.rhino.Node node89 = node81.useSourceInfoIfMissingFrom(node84);
        com.google.javascript.rhino.Node node93 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj95 = node93.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node96 = node84.copyInformationFrom(node93);
        com.google.javascript.rhino.Node node97 = node69.useSourceInfoIfMissingFrom(node96);
        com.google.javascript.rhino.Node node98 = new com.google.javascript.rhino.Node((int) (byte) 100, node44, node69);
        int int99 = node69.getType();
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceList7);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceList14);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(charSequenceItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(staticSourceFile86);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertNotNull(node97);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01606");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = jSTypeRegistry2.isForwardDeclaredType("function (): ?");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType21.autoboxesTo();
        java.lang.String str23 = functionType21.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        com.google.common.collect.ImmutableList<java.lang.String> strList34 = functionType33.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot36 = functionType33.getSlot("NUMBER 0.0 100\n");
        boolean boolean37 = functionType33.isAllType();
        boolean boolean38 = functionType21.hasEqualCallType(functionType33);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        jSTypeRegistry41.unregisterPropertyOnType("(Not declared as a type name)", jSType43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry41.createFunctionType(jSType45, true, jSTypeArray47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType21, jSTypeArray47);
        boolean boolean51 = functionType49.isPropertyInExterns("java.io.IOException: java.io.IOException");
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        jSTypeRegistry55.unregisterPropertyOnType("(Not declared as a type name)", jSType57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry55.createFunctionType(jSType59, true, jSTypeArray61);
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType62.restrictByNotNullOrUndefined();
        java.lang.String str64 = functionType62.toString();
        java.lang.Iterable iterable65 = functionType62.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType62.getPropertyType("NUMBER 0.0");
        java.lang.Iterable iterable68 = functionType62.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(0);
        node70.putIntProp((-1), 35);
        java.lang.Object obj75 = node70.getProp(29);
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = node70.getJSDocInfo();
        boolean boolean77 = node70.isQuotedString();
        boolean boolean78 = functionType49.defineInferredProperty("function (): {1685012791}", (com.google.javascript.rhino.jstype.JSType) functionType62, node70);
        java.util.Set<java.lang.String> strSet79 = node70.getDirectives();
        boolean boolean80 = node70.isWith();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(staticSlot36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "function (): ?" + "'", str64, "function (): ?");
        org.junit.Assert.assertNotNull(iterable65);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertNotNull(iterable68);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(jSDocInfo76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(strSet79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01607");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        boolean boolean8 = node7.isCall();
        boolean boolean9 = node7.isThrow();
        boolean boolean10 = node7.isExprResult();
        boolean boolean11 = strSet5.equals((java.lang.Object) node7);
        java.lang.Object obj13 = node7.getProp(409700);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01608");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("function (): {546197034}");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01609");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType12.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType12.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType12);
        jSTypeRegistry2.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        jSTypeRegistry20.unregisterPropertyOnType("(Not declared as a type name)", jSType22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry20.createFunctionType(jSType24, true, jSTypeArray26);
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType27.autoboxesTo();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative30 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec31 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative30);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        node35.putIntProp((-1), 35);
        boolean boolean39 = node35.isStringKey();
        boolean boolean40 = node35.isThrow();
        com.google.javascript.rhino.Node node41 = node33.useSourceInfoFrom(node35);
        boolean boolean42 = node41.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        jSTypeRegistry45.unregisterPropertyOnType("(Not declared as a type name)", jSType47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        jSTypeRegistry51.unregisterPropertyOnType("(Not declared as a type name)", jSType53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry51.createFunctionType(jSType55, true, jSTypeArray57);
        boolean boolean60 = functionType58.removeProperty("false");
        boolean boolean61 = functionType58.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry45.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType58);
        com.google.javascript.rhino.jstype.JSType jSType63 = assertionFunctionSpec31.getAssertedType(node41, jSTypeRegistry45);
        jSTypeRegistry45.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node67 = jSTypeRegistry45.createOptionalParameters(jSTypeArray66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry2.createConstructorType(jSType28, jSTypeArray66);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative69 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry2.getNativeType(jSTypeNative69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNull(jSType63);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType68);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01610");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = charSequenceList9.addAll(charSequenceCollection24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01611");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFrom(node4);
        boolean boolean12 = node11.isVar();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        boolean boolean15 = node14.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = node14.getStaticSourceFile();
        node14.setLineno((int) '4');
        com.google.javascript.rhino.Node node19 = node11.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node20 = node14.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = node20.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(staticSourceFile16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01612");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative31 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec32 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative31);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        node36.putIntProp((-1), 35);
        boolean boolean40 = node36.isStringKey();
        boolean boolean41 = node36.isThrow();
        com.google.javascript.rhino.Node node42 = node34.useSourceInfoFrom(node36);
        boolean boolean43 = node42.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        jSTypeRegistry46.unregisterPropertyOnType("(Not declared as a type name)", jSType48);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        jSTypeRegistry52.unregisterPropertyOnType("(Not declared as a type name)", jSType54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry52.createFunctionType(jSType56, true, jSTypeArray58);
        boolean boolean61 = functionType59.removeProperty("false");
        boolean boolean62 = functionType59.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry46.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType59);
        com.google.javascript.rhino.jstype.JSType jSType64 = assertionFunctionSpec32.getAssertedType(node42, jSTypeRegistry46);
        jSTypeRegistry46.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node68 = jSTypeRegistry46.createOptionalParameters(jSTypeArray67);
        com.google.javascript.rhino.Node node69 = jSTypeRegistry22.createOptionalParameters(jSTypeArray67);
        com.google.javascript.rhino.Node node70 = jSTypeRegistry2.createParameters(jSTypeArray67);
        jSTypeRegistry2.forwardDeclareType("function (): {2068438814}");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable74 = jSTypeRegistry2.getTypesWithProperty("hi!");
        jSTypeRegistry2.incrementGeneration();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNull(jSType64);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(jSTypeIterable74);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01613");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        jSTypeRegistry23.unregisterPropertyOnType("(Not declared as a type name)", jSType25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry23.createFunctionType(jSType27, true, jSTypeArray29);
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType30.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = functionType30.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        jSTypeRegistry36.unregisterPropertyOnType("(Not declared as a type name)", jSType38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        jSTypeRegistry42.unregisterPropertyOnType("(Not declared as a type name)", jSType44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry42.createFunctionType(jSType46, true, jSTypeArray48);
        boolean boolean51 = functionType49.removeProperty("false");
        boolean boolean52 = functionType49.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry36.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType30.forceResolve(errorReporter33, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType49);
        boolean boolean55 = functionType30.isCheckedUnknownType();
        boolean boolean56 = functionType30.isTemplateType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = functionType30.getOwnPropertyJSDocInfo("hi!");
        jSTypeRegistry2.registerPropertyOnType("function (): {2129138287}", (com.google.javascript.rhino.jstype.JSType) functionType30);
        com.google.javascript.rhino.Node node61 = functionType30.getPropertyNode("(Unknown class name)");
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = functionType30.getOwnPropertyJSDocInfo("InputId: true");
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(jSDocInfo58);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(jSDocInfo63);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01614");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        boolean boolean21 = jSTypeRegistry2.hasNamespace("hi!");
        jSTypeRegistry2.clearTemplateTypeNames();
        boolean boolean23 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean26 = jSDocInfo25.hasThisType();
        boolean boolean27 = jSDocInfo25.shouldPreserveTry();
        boolean boolean28 = jSDocInfo25.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = jSDocInfo25.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean31 = jSDocInfo25.shouldPreserveTry();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        boolean boolean34 = node33.isCall();
        com.google.javascript.rhino.Node node35 = node33.cloneTree();
        boolean boolean36 = node33.isNull();
        jSDocInfo25.setAssociatedNode(node33);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        jSTypeRegistry40.unregisterPropertyOnType("(Not declared as a type name)", jSType42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry40.createFunctionType(jSType44, true, jSTypeArray46);
        boolean boolean49 = functionType47.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        jSTypeRegistry53.unregisterPropertyOnType("(Not declared as a type name)", jSType55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry53.createFunctionType(jSType57, true, jSTypeArray59);
        boolean boolean62 = functionType60.removeProperty("false");
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(0);
        node64.putIntProp((-1), 35);
        boolean boolean68 = node64.isStringKey();
        boolean boolean69 = node64.isThrow();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj75 = node73.getProp((int) (byte) 10);
        boolean boolean76 = node64.isEquivalentToTyped(node73);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(0);
        node79.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(32, node79);
        boolean boolean84 = node83.isInstanceOf();
        com.google.javascript.rhino.Node node85 = node73.useSourceInfoFromForTree(node83);
        boolean boolean86 = node83.isDo();
        boolean boolean87 = functionType47.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType60, node83);
        boolean boolean88 = functionType60.isUnknownType();
        java.util.Set<java.lang.String> strSet89 = functionType60.getPropertyNames();
        node33.setJSType((com.google.javascript.rhino.jstype.JSType) functionType60);
        com.google.javascript.rhino.JSDocInfo jSDocInfo92 = functionType60.getOwnPropertyJSDocInfo("false");
        jSTypeRegistry2.unregisterPropertyOnType("(function (): {548870186})", (com.google.javascript.rhino.jstype.JSType) functionType60);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(jSTypeExpression30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertNull(jSDocInfo92);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01615");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative11 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec12 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative11);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0);
        node16.putIntProp((-1), 35);
        boolean boolean20 = node16.isStringKey();
        boolean boolean21 = node16.isThrow();
        com.google.javascript.rhino.Node node22 = node14.useSourceInfoFrom(node16);
        boolean boolean23 = node22.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        boolean boolean42 = functionType39.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry26.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType44 = assertionFunctionSpec12.getAssertedType(node22, jSTypeRegistry26);
        jSTypeRegistry26.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node48 = jSTypeRegistry26.createOptionalParameters(jSTypeArray47);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry2.createOptionalParameters(jSTypeArray47);
        boolean boolean51 = jSTypeRegistry2.hasNamespace("java.io.IOException: java.io.IOException");
        jSTypeRegistry2.forwardDeclareType("{proxy:function (): {1461655636}}");
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry2.createAnonymousObjectType();
        boolean boolean55 = objectType54.isNoResolvedType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNull(jSType44);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01616");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(0);
        node5.putIntProp((-1), 35);
        boolean boolean9 = node5.isStringKey();
        boolean boolean10 = node5.isThrow();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoFrom(node5);
        namePosition1.setItem(node3);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        boolean boolean15 = node14.isCall();
        com.google.javascript.rhino.Node node16 = node14.cloneTree();
        boolean boolean17 = node16.isAssignAdd();
        boolean boolean18 = node16.isFalse();
        boolean boolean19 = node16.hasMoreThanOneChild();
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node16);
        node16.setType(4);
        node16.setType(5);
        boolean boolean25 = node16.isThrow();
        boolean boolean26 = node16.isEmpty();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isInstanceOf();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0);
        node31.putIntProp((-1), 35);
        boolean boolean35 = node31.isStringKey();
        boolean boolean36 = node31.isThrow();
        boolean boolean37 = node31.isEmpty();
        com.google.javascript.rhino.Node node38 = node28.useSourceInfoFrom(node31);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder39 = node38.new FileLevelJsDocBuilder();
        boolean boolean40 = node38.isHook();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        boolean boolean44 = node43.isCall();
        boolean boolean45 = node43.isThrow();
        int int46 = node43.getCharno();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(0);
        boolean boolean49 = node48.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node48);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        boolean boolean56 = node52.isReturn();
        com.google.javascript.rhino.InputId inputId57 = node52.getInputId();
        node52.setWasEmptyNode(true);
        boolean boolean60 = node52.isLabel();
        boolean boolean61 = node52.isTry();
        com.google.javascript.rhino.Node node62 = node48.srcref(node52);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        boolean boolean67 = node66.isTypeOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile68 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node66);
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(0);
        boolean boolean71 = node70.isCall();
        boolean boolean72 = node70.isThrow();
        int int73 = node70.getCharno();
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(15, node43, node62, node66, node70);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression80 = new com.google.javascript.rhino.JSTypeExpression(node78, "NUMBER 0.0 100\n");
        com.google.javascript.rhino.Node node82 = node78.getAncestor(54);
        com.google.javascript.rhino.Node node83 = node70.useSourceInfoIfMissingFrom(node78);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(0, node3, node16, node38, node70, 8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(staticSourceFile50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(inputId57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(staticSourceFile68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNotNull(node83);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01617");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isHidden();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasThisType();
        boolean boolean6 = jSDocInfo4.shouldPreserveTry();
        boolean boolean7 = jSDocInfo4.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo4.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean10 = jSDocInfo9.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo9.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = null;
        jSDocInfo9.setVisibility(visibility12);
        boolean boolean14 = jSDocInfo9.isExport();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = jSDocInfo15.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = null;
        jSDocInfo15.setVisibility(visibility18);
        boolean boolean20 = jSDocInfo15.isExport();
        java.lang.String str21 = jSDocInfo15.getMeaning();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo22.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility25 = null;
        jSDocInfo22.setVisibility(visibility25);
        boolean boolean27 = jSDocInfo22.isExport();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList28 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo2, jSDocInfo3, jSDocInfo4, jSDocInfo9, jSDocInfo15, jSDocInfo22);
        java.lang.String str29 = jSDocInfo22.toString();
        boolean boolean30 = jSDocInfo22.isInterface();
        int int31 = jSDocInfo22.getParameterCount();
        java.lang.String str32 = jSDocInfo22.getFileOverview();
        com.google.common.collect.ImmutableList<java.lang.String> strList33 = jSDocInfo22.getTemplateTypeNames();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection34 = jSDocInfo22.getMarkers();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeExpression17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "JSDocInfo" + "'", str29, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(markerCollection34);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01618");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable50 = functionType9.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = functionType9.getPossibleToBooleanOutcomes();
        boolean boolean52 = functionType9.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType9.restrictByNotNullOrUndefined();
        boolean boolean55 = functionType9.hasProperty("InputId: NUMBER 0.0 100\n");
        boolean boolean56 = functionType9.canBeCalled();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable50);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01619");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj7 = node5.getProp((int) (byte) 10);
        boolean boolean8 = node5.isGetProp();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        boolean boolean11 = node10.isInstanceOf();
        boolean boolean12 = node10.isWhile();
        com.google.javascript.rhino.Node[] nodeArray13 = new com.google.javascript.rhino.Node[] { node5, node10 };
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, nodeArray13, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(41, nodeArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeArray13);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01620");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        jSTypeRegistry13.unregisterPropertyOnType("(Not declared as a type name)", jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry13.createFunctionType(jSType17, true, jSTypeArray19);
        boolean boolean22 = functionType20.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        boolean boolean35 = functionType33.removeProperty("false");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node37.isStringKey();
        boolean boolean42 = node37.isThrow();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj48 = node46.getProp((int) (byte) 10);
        boolean boolean49 = node37.isEquivalentToTyped(node46);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, node52);
        boolean boolean57 = node56.isInstanceOf();
        com.google.javascript.rhino.Node node58 = node46.useSourceInfoFromForTree(node56);
        boolean boolean59 = node56.isDo();
        boolean boolean60 = functionType20.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType33, node56);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair61 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType33);
        boolean boolean62 = functionType9.matchesNumberContext();
        boolean boolean63 = functionType9.isParameterizedType();
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType9.getTemplateTypeNames();
        java.lang.Iterable iterable65 = functionType9.getCtorExtendedInterfaces();
        boolean boolean66 = functionType9.isTemplateType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNotNull(iterable65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01621");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj12 = node10.getProp((int) (byte) 10);
        boolean boolean13 = node1.isEquivalentToTyped(node10);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0);
        node16.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(32, node16);
        boolean boolean21 = node20.isInstanceOf();
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoFromForTree(node20);
        boolean boolean23 = node20.isDo();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        node27.putIntProp((-1), 35);
        boolean boolean31 = node27.isStringKey();
        boolean boolean32 = node27.isThrow();
        com.google.javascript.rhino.Node node33 = node25.useSourceInfoFrom(node27);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        node35.putIntProp((-1), 35);
        boolean boolean39 = node35.isReturn();
        com.google.javascript.rhino.InputId inputId40 = node35.getInputId();
        node35.setWasEmptyNode(true);
        int int43 = node33.getIndexOfChild(node35);
        boolean boolean44 = node35.isAssign();
        boolean boolean45 = node35.isLocalResultCall();
        boolean boolean46 = node35.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node47 = node20.clonePropsFrom(node35);
        node47.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        node51.putIntProp((-1), 35);
        boolean boolean55 = node51.isStringKey();
        boolean boolean56 = node51.isThrow();
        com.google.javascript.rhino.Node node57 = node51.getNext();
        node51.putIntProp(53, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node61 = node47.removeChildAfter(node51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01622");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable50 = functionType9.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = functionType9.getPossibleToBooleanOutcomes();
        boolean boolean52 = functionType9.matchesNumberContext();
        boolean boolean53 = functionType9.isVoidType();
        boolean boolean54 = functionType9.isNumber();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = functionType9.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType9.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable50);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(functionType55);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01623");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj6 = node4.getProp((int) (byte) 10);
        boolean boolean7 = node4.isGetProp();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        boolean boolean10 = node9.isInstanceOf();
        boolean boolean11 = node9.isWhile();
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] { node4, node9 };
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) -1, nodeArray12, (int) (byte) 1, (-1));
        com.google.javascript.rhino.jstype.JSType jSType16 = node15.getJSType();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01624");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        java.lang.String str11 = functionType9.toString();
        int int12 = functionType9.getMaxArguments();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable13 = functionType9.getCtorImplementedInterfaces();
        boolean boolean14 = functionType9.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = functionType9.getPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = objectType15.getConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = objectType15.toObjectType();
        java.util.Set<java.lang.String> strSet18 = objectType15.getPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        jSTypeRegistry21.unregisterPropertyOnType("(Not declared as a type name)", jSType23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry21.createFunctionType(jSType25, true, jSTypeArray27);
        boolean boolean29 = functionType28.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        jSTypeRegistry45.unregisterPropertyOnType("(Not declared as a type name)", jSType47);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry45.createFunctionType(jSType49, true, jSTypeArray51);
        boolean boolean54 = functionType52.removeProperty("false");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0);
        node56.putIntProp((-1), 35);
        boolean boolean60 = node56.isStringKey();
        boolean boolean61 = node56.isThrow();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj67 = node65.getProp((int) (byte) 10);
        boolean boolean68 = node56.isEquivalentToTyped(node65);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(0);
        node71.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(32, node71);
        boolean boolean76 = node75.isInstanceOf();
        com.google.javascript.rhino.Node node77 = node65.useSourceInfoFromForTree(node75);
        boolean boolean78 = node75.isDo();
        boolean boolean79 = functionType39.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType52, node75);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair80 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType28, (com.google.javascript.rhino.jstype.JSType) functionType52);
        boolean boolean81 = functionType28.matchesNumberContext();
        boolean boolean82 = functionType28.isParameterizedType();
        java.util.Set<java.lang.String> strSet83 = functionType28.getOwnPropertyNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo85 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean86 = jSDocInfo85.hasThisType();
        boolean boolean87 = jSDocInfo85.shouldPreserveTry();
        boolean boolean88 = jSDocInfo85.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression90 = jSDocInfo85.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean91 = jSDocInfo85.shouldPreserveTry();
        boolean boolean92 = jSDocInfo85.isOverride();
        boolean boolean93 = jSDocInfo85.isNoSideEffects();
        boolean boolean95 = jSDocInfo85.hasParameterType("");
        functionType28.setPropertyJSDocInfo("Unknown class name", jSDocInfo85);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue97 = objectType15.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType28);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable98 = functionType28.getParameters();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "function (): ?" + "'", str11, "function (): ?");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNull(functionType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(jSTypeExpression90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(ternaryValue97);
        org.junit.Assert.assertNotNull(nodeIterable98);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01625");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) '4', "function (): {41182746}");
        boolean boolean3 = node2.hasMoreThanOneChild();
        boolean boolean4 = node2.isVoid();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01626");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList24 = charSequenceList6.asList();
        java.lang.Object[] objArray25 = charSequenceList24.toArray();
        boolean boolean26 = charSequenceList24.isEmpty();
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor27 = charSequenceList24.listIterator();
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor28 = charSequenceList24.listIterator();
        java.lang.Object[] objArray29 = charSequenceList24.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence31 = charSequenceList24.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charSequenceList24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charSequenceItor27);
        org.junit.Assert.assertNotNull(charSequenceItor28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!, hi!, , , hi!]");
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01627");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        jSTypeRegistry13.unregisterPropertyOnType("(Not declared as a type name)", jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry13.createFunctionType(jSType17, true, jSTypeArray19);
        boolean boolean22 = functionType20.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        boolean boolean35 = functionType33.removeProperty("false");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node37.isStringKey();
        boolean boolean42 = node37.isThrow();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj48 = node46.getProp((int) (byte) 10);
        boolean boolean49 = node37.isEquivalentToTyped(node46);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, node52);
        boolean boolean57 = node56.isInstanceOf();
        com.google.javascript.rhino.Node node58 = node46.useSourceInfoFromForTree(node56);
        boolean boolean59 = node56.isDo();
        boolean boolean60 = functionType20.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType33, node56);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair61 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = functionType33.getPossibleToBooleanOutcomes();
        boolean boolean63 = functionType33.hasDisplayName();
        com.google.javascript.rhino.Node node64 = functionType33.getRootNode();
        boolean boolean65 = functionType33.isTemplateType();
        boolean boolean66 = functionType33.isNominalConstructor();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01628");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        boolean boolean6 = node2.isStringKey();
        boolean boolean7 = node2.isThrow();
        int int8 = node2.getLineno();
        boolean boolean9 = node2.hasChildren();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        node11.putIntProp((-1), 35);
        boolean boolean15 = node2.hasChild(node11);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        boolean boolean18 = node17.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node17.getStaticSourceFile();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0, node11, node17, node23);
        boolean boolean25 = node17.isLabel();
        node17.setVarArgs(true);
        java.lang.String str28 = node17.getQualifiedName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasThisType();
        boolean boolean31 = jSDocInfo29.shouldPreserveTry();
        boolean boolean32 = jSDocInfo29.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = jSDocInfo29.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean35 = jSDocInfo29.shouldPreserveTry();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        boolean boolean38 = node37.isCall();
        com.google.javascript.rhino.Node node39 = node37.cloneTree();
        boolean boolean40 = node37.isNull();
        jSDocInfo29.setAssociatedNode(node37);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node37.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node43 = node17.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean44 = node43.isCall();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = node43.getStaticSourceFile();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSTypeExpression34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(staticSourceFile45);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01629");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator4 = charSequenceList2.spliterator();
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream5 = charSequenceList2.stream();
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray11);
        boolean boolean13 = charSequenceList2.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean14 = charSequenceList12.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList15 = charSequenceList12.reverse();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        jSTypeRegistry18.unregisterPropertyOnType("(Not declared as a type name)", jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry18.createFunctionType(jSType22, true, jSTypeArray24);
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = functionType25.getTemplateTypeNames();
        boolean boolean27 = functionType25.isNullType();
        int int28 = charSequenceList12.indexOf((java.lang.Object) functionType25);
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = charSequenceList12.remove(obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator4);
        org.junit.Assert.assertNotNull(charSequenceStream5);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charSequenceList15);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01630");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        com.google.javascript.rhino.InputId inputId6 = node1.getInputId();
        node1.setWasEmptyNode(true);
        boolean boolean9 = node1.isLabel();
        boolean boolean10 = node1.isArrayLit();
        boolean boolean11 = node1.isLabelName();
        boolean boolean12 = node1.isDelProp();
        boolean boolean13 = node1.isNumber();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = node1.getExistingIntProp(25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 25");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01631");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType9.getPrototype();
        boolean boolean14 = objectType13.isVoidType();
        boolean boolean15 = objectType13.isRecordType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = objectType13.getSlot("{proxy:function (): {1315738101}}");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01632");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        jSTypeRegistry13.unregisterPropertyOnType("(Not declared as a type name)", jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry13.createFunctionType(jSType17, true, jSTypeArray19);
        boolean boolean22 = functionType20.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        boolean boolean35 = functionType33.removeProperty("false");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node37.isStringKey();
        boolean boolean42 = node37.isThrow();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj48 = node46.getProp((int) (byte) 10);
        boolean boolean49 = node37.isEquivalentToTyped(node46);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, node52);
        boolean boolean57 = node56.isInstanceOf();
        com.google.javascript.rhino.Node node58 = node46.useSourceInfoFromForTree(node56);
        boolean boolean59 = node56.isDo();
        boolean boolean60 = functionType20.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType33, node56);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair61 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        jSTypeRegistry65.unregisterPropertyOnType("(Not declared as a type name)", jSType67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry65.createFunctionType(jSType69, true, jSTypeArray71);
        boolean boolean74 = functionType72.removeProperty("false");
        boolean boolean75 = functionType72.isNativeObjectType();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(0);
        node78.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (short) 100, node78, 49, (int) (byte) 1);
        boolean boolean85 = functionType33.defineDeclaredProperty("", (com.google.javascript.rhino.jstype.JSType) functionType72, node78);
        com.google.javascript.rhino.ErrorReporter errorReporter86 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry88 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter86, true);
        com.google.javascript.rhino.jstype.JSType jSType90 = null;
        jSTypeRegistry88.unregisterPropertyOnType("(Not declared as a type name)", jSType90);
        com.google.javascript.rhino.jstype.JSType jSType92 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray94 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType95 = jSTypeRegistry88.createFunctionType(jSType92, true, jSTypeArray94);
        com.google.javascript.rhino.jstype.JSType jSType96 = functionType95.unboxesTo();
        functionType72.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType95);
        boolean boolean98 = functionType95.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType99 = functionType95.restrictByNotNullOrUndefined();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(jSTypeArray94);
        org.junit.Assert.assertNotNull(functionType95);
        org.junit.Assert.assertNull(jSType96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01633");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        jSTypeRegistry7.unregisterPropertyOnType("(Not declared as a type name)", jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry7.createFunctionType(jSType11, true, jSTypeArray13);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative16 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec17 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative16);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        node21.putIntProp((-1), 35);
        boolean boolean25 = node21.isStringKey();
        boolean boolean26 = node21.isThrow();
        com.google.javascript.rhino.Node node27 = node19.useSourceInfoFrom(node21);
        boolean boolean28 = node27.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        jSTypeRegistry31.unregisterPropertyOnType("(Not declared as a type name)", jSType33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        boolean boolean46 = functionType44.removeProperty("false");
        boolean boolean47 = functionType44.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry31.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType44);
        com.google.javascript.rhino.jstype.JSType jSType49 = assertionFunctionSpec17.getAssertedType(node27, jSTypeRegistry31);
        jSTypeRegistry31.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry31.createOptionalParameters(jSTypeArray52);
        com.google.javascript.rhino.Node node54 = jSTypeRegistry7.createOptionalParameters(jSTypeArray52);
        com.google.javascript.rhino.Node node55 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray52);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        jSTypeRegistry58.unregisterPropertyOnType("(Not declared as a type name)", jSType60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        jSTypeRegistry64.unregisterPropertyOnType("(Not declared as a type name)", jSType66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType(jSType68, true, jSTypeArray70);
        boolean boolean73 = functionType71.removeProperty("false");
        boolean boolean74 = functionType71.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry58.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean77 = jSTypeRegistry58.hasNamespace("hi!");
        jSTypeRegistry58.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray79 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry58.createUnionType(jSTypeNativeArray79);
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry2.createUnionType(jSTypeNativeArray79);
        boolean boolean83 = jSTypeRegistry2.isForwardDeclaredType("hi!");
        jSTypeRegistry2.incrementGeneration();
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertNull(jSType49);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(jSTypeArray70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSTypeNativeArray79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01634");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition5 = marker0.getNameNode();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(nodeSourcePosition5);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01635");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(0);
        boolean boolean9 = node8.isCall();
        com.google.javascript.rhino.Node node10 = node8.cloneTree();
        boolean boolean11 = node8.isNull();
        jSDocInfo0.setAssociatedNode(node8);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        jSTypeRegistry28.unregisterPropertyOnType("(Not declared as a type name)", jSType30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry28.createFunctionType(jSType32, true, jSTypeArray34);
        boolean boolean37 = functionType35.removeProperty("false");
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        boolean boolean43 = node39.isStringKey();
        boolean boolean44 = node39.isThrow();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj50 = node48.getProp((int) (byte) 10);
        boolean boolean51 = node39.isEquivalentToTyped(node48);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(0);
        node54.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(32, node54);
        boolean boolean59 = node58.isInstanceOf();
        com.google.javascript.rhino.Node node60 = node48.useSourceInfoFromForTree(node58);
        boolean boolean61 = node58.isDo();
        boolean boolean62 = functionType22.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType35, node58);
        boolean boolean63 = functionType35.isUnknownType();
        java.util.Set<java.lang.String> strSet64 = functionType35.getPropertyNames();
        node8.setJSType((com.google.javascript.rhino.jstype.JSType) functionType35);
        boolean boolean66 = functionType35.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        jSTypeRegistry69.unregisterPropertyOnType("(Not declared as a type name)", jSType71);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry69.createFunctionType(jSType73, true, jSTypeArray75);
        com.google.common.collect.ImmutableList<java.lang.String> strList77 = functionType76.getTemplateTypeNames();
        boolean boolean78 = functionType76.isReturnTypeInferred();
        com.google.javascript.rhino.Node node79 = functionType76.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean81 = jSDocInfo80.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression82 = jSDocInfo80.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility83 = null;
        jSDocInfo80.setVisibility(visibility83);
        boolean boolean85 = jSDocInfo80.isOverride();
        functionType76.setJSDocInfo(jSDocInfo80);
        functionType35.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType76);
        boolean boolean88 = functionType76.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType89 = functionType76.autobox();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType90 = functionType76.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(jSTypeExpression82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jSType89);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01636");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node4 = node1.getNext();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        boolean boolean12 = node6.isEmpty();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFrom(node6);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoFrom(node17);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        boolean boolean26 = node25.isCall();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList34 = com.google.common.collect.ImmutableList.of((java.lang.Object) node1, (java.lang.Object) node17, (java.lang.Object) node25, (java.lang.Object) 53, (java.lang.Object) node29);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        boolean boolean37 = node36.isInstanceOf();
        node29.addChildrenToFront(node36);
        int int39 = node29.getSourceOffset();
        boolean boolean40 = node29.isVoid();
        com.google.javascript.rhino.InputId inputId41 = com.google.javascript.jscomp.NodeUtil.getInputId(node29);
        com.google.javascript.rhino.Node node42 = node29.removeFirstChild();
        int int43 = node29.getCharno();
        boolean boolean44 = node29.isNew();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = node29.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objList34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(inputId41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01637");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.jstype.JSType jSType5 = node4.getJSType();
        boolean boolean6 = node4.isHook();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(0);
        boolean boolean9 = node8.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node8);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        boolean boolean13 = node12.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = node12.getStaticSourceFile();
        java.lang.String str15 = node12.getSourceFileName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        boolean boolean18 = node17.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node17.getStaticSourceFile();
        com.google.javascript.rhino.Node node20 = node17.getNext();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(0);
        node22.putIntProp((-1), 35);
        boolean boolean26 = node22.isStringKey();
        boolean boolean27 = node22.isThrow();
        boolean boolean28 = node22.isEmpty();
        com.google.javascript.rhino.Node node29 = node17.copyInformationFrom(node22);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        node33.putIntProp((-1), 35);
        boolean boolean37 = node33.isStringKey();
        boolean boolean38 = node33.isThrow();
        com.google.javascript.rhino.Node node39 = node31.useSourceInfoFrom(node33);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        boolean boolean42 = node41.isCall();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0);
        node45.putIntProp((-1), 35);
        boolean boolean49 = node45.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList50 = com.google.common.collect.ImmutableList.of((java.lang.Object) node17, (java.lang.Object) node33, (java.lang.Object) node41, (java.lang.Object) 53, (java.lang.Object) node45);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        boolean boolean53 = node52.isInstanceOf();
        node45.addChildrenToFront(node52);
        int int55 = node45.getSourceOffset();
        boolean boolean56 = node45.isVoid();
        com.google.javascript.rhino.Node node57 = node12.useSourceInfoIfMissingFrom(node45);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(54, node4, node8, node57);
        boolean boolean59 = node57.isTry();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(staticSourceFile10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(staticSourceFile14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objList50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01638");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType9.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        jSTypeRegistry21.unregisterPropertyOnType("(Not declared as a type name)", jSType23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry21.createFunctionType(jSType25, true, jSTypeArray27);
        boolean boolean30 = functionType28.removeProperty("false");
        boolean boolean31 = functionType28.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry15.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType28);
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType9.forceResolve(errorReporter12, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType28);
        boolean boolean34 = functionType9.isCheckedUnknownType();
        boolean boolean35 = functionType9.isTemplateType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = functionType9.getOwnPropertyJSDocInfo("hi!");
        boolean boolean38 = functionType9.hasReferenceName();
        int int39 = functionType9.getMaxArguments();
        com.google.javascript.rhino.jstype.UnionType unionType40 = functionType9.toMaybeUnionType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.UnionType unionType41 = unionType40.toMaybeUnionType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(jSDocInfo37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(unionType40);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01639");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        jSTypeRegistry13.unregisterPropertyOnType("(Not declared as a type name)", jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry13.createFunctionType(jSType17, true, jSTypeArray19);
        boolean boolean22 = functionType20.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        boolean boolean35 = functionType33.removeProperty("false");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node37.isStringKey();
        boolean boolean42 = node37.isThrow();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj48 = node46.getProp((int) (byte) 10);
        boolean boolean49 = node37.isEquivalentToTyped(node46);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, node52);
        boolean boolean57 = node56.isInstanceOf();
        com.google.javascript.rhino.Node node58 = node46.useSourceInfoFromForTree(node56);
        boolean boolean59 = node56.isDo();
        boolean boolean60 = functionType20.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType33, node56);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair61 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = functionType33.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = functionType33.getOwnerFunction();
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType33.getTemplateTypeNames();
        functionType33.clearResolved();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = functionType33.getJSDocInfo();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(functionType63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNull(jSDocInfo66);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01640");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        java.lang.String str11 = functionType9.toString();
        int int12 = functionType9.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        jSTypeRegistry23.unregisterPropertyOnType("(Not declared as a type name)", jSType25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry23.createFunctionType(jSType27, true, jSTypeArray29);
        boolean boolean31 = functionType30.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        jSTypeRegistry34.unregisterPropertyOnType("(Not declared as a type name)", jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry34.createFunctionType(jSType38, true, jSTypeArray40);
        boolean boolean43 = functionType41.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        boolean boolean56 = functionType54.removeProperty("false");
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        boolean boolean62 = node58.isStringKey();
        boolean boolean63 = node58.isThrow();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj69 = node67.getProp((int) (byte) 10);
        boolean boolean70 = node58.isEquivalentToTyped(node67);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(0);
        node73.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(32, node73);
        boolean boolean78 = node77.isInstanceOf();
        com.google.javascript.rhino.Node node79 = node67.useSourceInfoFromForTree(node77);
        boolean boolean80 = node77.isDo();
        boolean boolean81 = functionType41.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType54, node77);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair82 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType30, (com.google.javascript.rhino.jstype.JSType) functionType54);
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry17.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType30);
        java.lang.String str84 = functionType30.getNormalizedReferenceName();
        boolean boolean85 = functionType30.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSType jSType86 = functionType9.forceResolve(errorReporter14, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType30);
        boolean boolean87 = functionType30.isEnumType();
        boolean boolean88 = functionType30.hasReferenceName();
        boolean boolean89 = functionType30.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType90 = functionType30.getImplicitPrototype();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "function (): ?" + "'", str11, "function (): ?");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jSType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objectType90);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01641");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("{proxy:function (): {1556474225}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01642");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.setThrows();
        sideEffectFlags1.setMutatesThis();
        sideEffectFlags1.setMutatesThis();
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01643");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType9.toObjectType();
        com.google.javascript.rhino.Node node12 = objectType11.getRootNode();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType22.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = functionType22.toObjectType();
        com.google.javascript.rhino.Node node25 = objectType24.getRootNode();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        jSTypeRegistry28.unregisterPropertyOnType("(Not declared as a type name)", jSType30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry28.createFunctionType(jSType32, true, jSTypeArray34);
        boolean boolean36 = functionType35.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        jSTypeRegistry39.unregisterPropertyOnType("(Not declared as a type name)", jSType41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry39.createFunctionType(jSType43, true, jSTypeArray45);
        boolean boolean48 = functionType46.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        jSTypeRegistry52.unregisterPropertyOnType("(Not declared as a type name)", jSType54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry52.createFunctionType(jSType56, true, jSTypeArray58);
        boolean boolean61 = functionType59.removeProperty("false");
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(0);
        node63.putIntProp((-1), 35);
        boolean boolean67 = node63.isStringKey();
        boolean boolean68 = node63.isThrow();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj74 = node72.getProp((int) (byte) 10);
        boolean boolean75 = node63.isEquivalentToTyped(node72);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(0);
        node78.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(32, node78);
        boolean boolean83 = node82.isInstanceOf();
        com.google.javascript.rhino.Node node84 = node72.useSourceInfoFromForTree(node82);
        boolean boolean85 = node82.isDo();
        boolean boolean86 = functionType46.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType59, node82);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair87 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType35, (com.google.javascript.rhino.jstype.JSType) functionType59);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet88 = functionType59.getPossibleToBooleanOutcomes();
        boolean boolean89 = functionType59.hasDisplayName();
        com.google.javascript.rhino.Node node90 = functionType59.getRootNode();
        com.google.javascript.rhino.jstype.JSType jSType91 = objectType24.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType59);
        boolean boolean92 = objectType24.isUnknownType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair93 = objectType11.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType24);
        com.google.javascript.rhino.jstype.JSType jSType94 = typePair93.typeB;
        com.google.javascript.rhino.jstype.JSType jSType95 = typePair93.typeB;
        com.google.javascript.rhino.jstype.JSType jSType96 = typePair93.typeB;
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet88 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet88.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(node90);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(typePair93);
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertNotNull(jSType95);
        org.junit.Assert.assertNotNull(jSType96);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01644");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("function (): {1156191911}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(function (): {1156191911})" + "'", str1, "(function (): {1156191911})");
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01645");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        boolean boolean7 = node1.isEmpty();
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList15 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList18 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator20 = charSequenceList18.spliterator();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(32, node23);
        boolean boolean28 = node27.isGetterDef();
        boolean boolean29 = charSequenceList18.equals((java.lang.Object) boolean28);
        boolean boolean31 = charSequenceList18.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean32 = charSequenceList15.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList33 = charSequenceList15.asList();
        node1.putProp(49, (java.lang.Object) charSequenceList33);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList35 = charSequenceList33.asList();
        boolean boolean36 = charSequenceList35.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList37 = charSequenceList35.asList();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder38 = com.google.common.collect.ImmutableList.builder();
        java.lang.String[][] strArray39 = new java.lang.String[][] {};
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder40 = strArrayBuilder38.add(strArray39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[][] charSequenceArray41 = charSequenceList37.toArray((java.lang.CharSequence[][]) strArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceList15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charSequenceList33);
        org.junit.Assert.assertNotNull(charSequenceList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(charSequenceList37);
        org.junit.Assert.assertNotNull(strArrayBuilder38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArrayBuilder40);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01646");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType51 = parameterizedType48.findPropertyType("function (): {563988020}");
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        jSTypeRegistry54.unregisterPropertyOnType("(Not declared as a type name)", jSType56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry54.createFunctionType(jSType58, true, jSTypeArray60);
        com.google.javascript.rhino.jstype.JSType jSType62 = functionType61.restrictByNotNullOrUndefined();
        boolean boolean63 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType61);
        boolean boolean64 = parameterizedType48.isAllType();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(jSType51);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01647");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition5 = marker0.getNameNode();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(typePosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(nodeSourcePosition5);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01648");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot12 = functionType9.getSlot("NUMBER 0.0 100\n");
        boolean boolean13 = functionType9.isAllType();
        boolean boolean15 = functionType9.hasProperty("Not declared as a type name");
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = functionType9.getTemplateTypeNames();
        java.lang.Iterable iterable17 = functionType9.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        jSTypeRegistry23.unregisterPropertyOnType("(Not declared as a type name)", jSType25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry23.createFunctionType(jSType27, true, jSTypeArray29);
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType30.autoboxesTo();
        java.lang.String str32 = functionType30.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        com.google.common.collect.ImmutableList<java.lang.String> strList43 = functionType42.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot45 = functionType42.getSlot("NUMBER 0.0 100\n");
        boolean boolean46 = functionType42.isAllType();
        boolean boolean47 = functionType30.hasEqualCallType(functionType42);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = functionType42.getOwnerFunction();
        java.util.Set<java.lang.String> strSet49 = functionType42.getOwnPropertyNames();
        boolean boolean50 = functionType42.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        jSTypeRegistry53.unregisterPropertyOnType("(Not declared as a type name)", jSType55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry53.createFunctionType(jSType57, true, jSTypeArray59);
        boolean boolean61 = functionType60.isReturnTypeInferred();
        boolean boolean62 = functionType60.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = functionType60.getBindReturnType((int) (short) 1);
        java.lang.String str65 = functionType64.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType66 = jSTypeRegistry20.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType42, (com.google.javascript.rhino.jstype.JSType) functionType64);
        boolean boolean67 = parameterizedType66.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType68 = parameterizedType66.getIndexType();
        boolean boolean69 = parameterizedType66.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean72 = jSDocInfo71.hasThisType();
        boolean boolean73 = jSDocInfo71.shouldPreserveTry();
        boolean boolean74 = jSDocInfo71.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression76 = jSDocInfo71.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean77 = jSDocInfo71.shouldPreserveTry();
        boolean boolean78 = jSDocInfo71.isOverride();
        boolean boolean79 = jSDocInfo71.isNoSideEffects();
        boolean boolean81 = jSDocInfo71.hasParameterType("");
        java.lang.String str82 = jSDocInfo71.getOriginalCommentString();
        parameterizedType66.setPropertyJSDocInfo("function (): {436796145}", jSDocInfo71);
        boolean boolean84 = parameterizedType66.isNominalType();
        boolean boolean85 = parameterizedType66.isNumberObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo87 = parameterizedType66.getOwnPropertyJSDocInfo("{proxy:function (): {847075005}}");
        boolean boolean88 = functionType9.isSubtype((com.google.javascript.rhino.jstype.JSType) parameterizedType66);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(staticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(iterable17);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNull(staticSlot45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(functionType48);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "function (): ?" + "'", str65, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(jSType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(jSTypeExpression76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(jSDocInfo87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01649");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 2, 39, 46);
        com.google.javascript.rhino.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.Node node5 = node3.getParent();
        boolean boolean6 = node3.isInc();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(14, "function (): {848299148}", 8, 40);
        com.google.javascript.rhino.Node node12 = node11.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = node3.removeChildAfter(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01650");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean23 = functionType22.hasReferenceName();
        boolean boolean24 = functionType9.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType22);
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType22.getPropertyType("true");
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        jSTypeRegistry30.unregisterPropertyOnType("(Not declared as a type name)", jSType32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry30.createFunctionType(jSType34, true, jSTypeArray36);
        boolean boolean38 = functionType37.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.ObjectType.Property property40 = functionType37.getSlot("Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean42 = jSDocInfo41.isHidden();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.hasThisType();
        boolean boolean47 = jSDocInfo45.shouldPreserveTry();
        boolean boolean48 = jSDocInfo45.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList49 = jSDocInfo45.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean51 = jSDocInfo50.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression52 = jSDocInfo50.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility53 = null;
        jSDocInfo50.setVisibility(visibility53);
        boolean boolean55 = jSDocInfo50.isExport();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean57 = jSDocInfo56.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo56.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility59 = null;
        jSDocInfo56.setVisibility(visibility59);
        boolean boolean61 = jSDocInfo56.isExport();
        java.lang.String str62 = jSDocInfo56.getMeaning();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean64 = jSDocInfo63.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = jSDocInfo63.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility66 = null;
        jSDocInfo63.setVisibility(visibility66);
        boolean boolean68 = jSDocInfo63.isExport();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList69 = com.google.common.collect.ImmutableList.of(jSDocInfo41, jSDocInfo43, jSDocInfo44, jSDocInfo45, jSDocInfo50, jSDocInfo56, jSDocInfo63);
        java.lang.String str70 = jSDocInfo41.getLendsName();
        jSDocInfo41.setDeprecated(true);
        functionType37.setJSDocInfo(jSDocInfo41);
        boolean boolean74 = functionType37.isOrdinaryFunction();
        boolean boolean75 = functionType37.isDateType();
        com.google.javascript.rhino.jstype.JSType jSType76 = jSType26.forceResolve(errorReporter27, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType37);
        boolean boolean77 = jSType26.isFunctionType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(property40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSTypeExpression52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(jSTypeExpression58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(jSTypeExpression65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01651");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.jstype.JSType jSType4 = node3.getJSType();
        boolean boolean5 = node3.isHook();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        boolean boolean8 = node7.isInstanceOf();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        node10.putIntProp((-1), 35);
        boolean boolean14 = node10.isStringKey();
        boolean boolean15 = node10.isThrow();
        boolean boolean16 = node10.isEmpty();
        com.google.javascript.rhino.Node node17 = node7.useSourceInfoFrom(node10);
        boolean boolean18 = node7.isLocalResultCall();
        boolean boolean19 = node7.isThis();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(0);
        node22.putIntProp((-1), 35);
        boolean boolean26 = node22.isStringKey();
        boolean boolean27 = node22.isThrow();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj33 = node31.getProp((int) (byte) 10);
        boolean boolean34 = node22.isEquivalentToTyped(node31);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(32, node37);
        boolean boolean42 = node41.isInstanceOf();
        com.google.javascript.rhino.Node node43 = node31.useSourceInfoFromForTree(node41);
        boolean boolean44 = node43.isStringKey();
        node43.removeProp(1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(37, "JSDocInfo");
        node49.setSourceEncodedPositionForTree(54);
        boolean boolean52 = node49.isSetterDef();
        boolean boolean53 = node49.isIf();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(43, node43, node49);
        // The following exception was thrown during execution in test generation
        try {
            node3.replaceChildAfter(node7, node54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01652");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        java.lang.String str53 = parameterizedType48.getDisplayName();
        boolean boolean55 = parameterizedType48.isPropertyInExterns("hi!");
        boolean boolean57 = parameterizedType48.isPropertyTypeInferred("{proxy:function (): {1315738101}}");
        com.google.javascript.rhino.jstype.FunctionType functionType58 = parameterizedType48.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo60 = functionType58.getOwnPropertyJSDocInfo("function (): {679369790}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(jSType50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(functionType58);
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01653");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        boolean boolean7 = node1.isEmpty();
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList15 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList18 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator20 = charSequenceList18.spliterator();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(32, node23);
        boolean boolean28 = node27.isGetterDef();
        boolean boolean29 = charSequenceList18.equals((java.lang.Object) boolean28);
        boolean boolean31 = charSequenceList18.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean32 = charSequenceList15.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList33 = charSequenceList15.asList();
        node1.putProp(49, (java.lang.Object) charSequenceList33);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList35 = charSequenceList33.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.CharSequence> charSequenceList38 = charSequenceList35.subList(40, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (40) must not be greater than size (5)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceList15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charSequenceList33);
        org.junit.Assert.assertNotNull(charSequenceList35);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01654");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        boolean boolean5 = node4.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node4.getStaticSourceFile();
        com.google.javascript.rhino.Node node7 = node4.getNext();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        boolean boolean15 = node9.isEmpty();
        com.google.javascript.rhino.Node node16 = node4.copyInformationFrom(node9);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        boolean boolean24 = node20.isStringKey();
        boolean boolean25 = node20.isThrow();
        com.google.javascript.rhino.Node node26 = node18.useSourceInfoFrom(node20);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isCall();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = com.google.common.collect.ImmutableList.of((java.lang.Object) node4, (java.lang.Object) node20, (java.lang.Object) node28, (java.lang.Object) 53, (java.lang.Object) node32);
        com.google.javascript.rhino.Node node38 = assertionFunctionSpec2.getAssertedParam(node32);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0);
        boolean boolean41 = node40.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile42 = node40.getStaticSourceFile();
        com.google.javascript.rhino.Node node43 = node40.getNext();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0);
        node45.putIntProp((-1), 35);
        boolean boolean49 = node45.isStringKey();
        boolean boolean50 = node45.isThrow();
        boolean boolean51 = node45.isEmpty();
        com.google.javascript.rhino.Node node52 = node40.copyInformationFrom(node45);
        boolean boolean53 = node52.isGetProp();
        boolean boolean54 = node52.isThrow();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, false);
        jSTypeRegistry57.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType jSType60 = assertionFunctionSpec2.getAssertedType(node52, jSTypeRegistry57);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable61 = node52.getAncestors();
        int int62 = node52.getChildCount();
        boolean boolean63 = node52.isQuotedString();
        node52.setSourceFileForTesting("function (): {2143411108}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(staticSourceFile42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(jSType60);
        org.junit.Assert.assertNotNull(ancestorIterable61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01655");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(0);
        boolean boolean9 = node8.isCall();
        com.google.javascript.rhino.Node node10 = node8.cloneTree();
        boolean boolean11 = node8.isNull();
        jSDocInfo0.setAssociatedNode(node8);
        boolean boolean14 = jSDocInfo0.hasParameter("");
        boolean boolean16 = jSDocInfo0.hasParameter("Not declared as a constructor");
        boolean boolean17 = jSDocInfo0.hasModifies();
        boolean boolean18 = jSDocInfo0.hasBaseType();
        boolean boolean19 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01656");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasThisType();
        boolean boolean4 = jSDocInfo2.shouldPreserveTry();
        boolean boolean5 = jSDocInfo2.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo2.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean8 = jSDocInfo2.shouldPreserveTry();
        boolean boolean9 = jSDocInfo2.isOverride();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection10 = jSDocInfo2.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo2.getTypedefType();
        java.lang.String str13 = jSDocInfo2.getDescriptionForParameter("function (): {2129138287}");
        node1.setJSDocInfo(jSDocInfo2);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList15 = jSDocInfo2.getImplementedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(markerCollection10);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(jSTypeExpressionList15);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01657");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getEndLine();
        int int2 = typePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoFrom(node6);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node6);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0);
        boolean boolean17 = node16.isCall();
        com.google.javascript.rhino.Node node18 = node16.cloneTree();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(35, node18, node21);
        boolean boolean23 = node22.isComma();
        boolean boolean24 = node22.isWith();
        boolean boolean25 = node22.isStringKey();
        com.google.javascript.rhino.Node node26 = node6.srcref(node22);
        typePosition0.setItem(node6);
        int int28 = typePosition0.getPositionOnEndLine();
        int int29 = typePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeCollection13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01658");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean7 = node1.isObjectLit();
        com.google.javascript.rhino.Node node8 = node1.cloneNode();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags10 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags10.clearAllFlags();
        sideEffectFlags10.setReturnsTainted();
        sideEffectFlags10.clearAllFlags();
        int int14 = sideEffectFlags10.valueOf();
        // The following exception was thrown during execution in test generation
        try {
            node1.setSideEffectFlags(sideEffectFlags10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01659");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        boolean boolean6 = node2.isStringKey();
        boolean boolean7 = node2.isThrow();
        int int8 = node2.getLineno();
        boolean boolean9 = node2.hasChildren();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        node11.putIntProp((-1), 35);
        boolean boolean15 = node2.hasChild(node11);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        boolean boolean18 = node17.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node17.getStaticSourceFile();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0, node11, node17, node23);
        java.lang.String str25 = node23.toStringTree();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags27 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags27.setMutatesGlobalState();
        sideEffectFlags27.setMutatesThis();
        boolean boolean30 = sideEffectFlags27.areAllFlagsSet();
        // The following exception was thrown during execution in test generation
        try {
            node23.setSideEffectFlags(sideEffectFlags27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "NUMBER 0.0 100\n" + "'", str25, "NUMBER 0.0 100\n");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01660");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot12 = functionType9.getSlot("NUMBER 0.0 100\n");
        boolean boolean13 = functionType9.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        jSTypeRegistry16.unregisterPropertyOnType("(Not declared as a type name)", jSType18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry16.createFunctionType(jSType20, true, jSTypeArray22);
        boolean boolean25 = functionType23.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType23.findPropertyType("Not declared as a type name");
        boolean boolean28 = functionType9.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType23);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = functionType23.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.UnionType unionType30 = functionType23.toMaybeUnionType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(staticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(jSType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertNull(unionType30);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01661");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "{proxy:function (): {2011742170}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01662");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        com.google.javascript.rhino.Node node52 = parameterizedType48.getPropertyNode("function (): {259080799}");
        java.lang.String str53 = parameterizedType48.getDisplayName();
        boolean boolean55 = parameterizedType48.isPropertyInExterns("hi!");
        boolean boolean57 = parameterizedType48.isPropertyTypeInferred("{proxy:function (): {1315738101}}");
        com.google.javascript.rhino.jstype.FunctionType functionType58 = parameterizedType48.getConstructor();
        boolean boolean59 = parameterizedType48.isNominalType();
        boolean boolean60 = parameterizedType48.matchesNumberContext();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(jSType50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01663");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        node3.putIntProp((-1), 35);
        boolean boolean7 = node3.isStringKey();
        boolean boolean8 = node3.isThrow();
        com.google.javascript.rhino.Node node9 = node1.useSourceInfoFrom(node3);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        boolean boolean13 = node12.isCall();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(35, node14, node17);
        com.google.javascript.rhino.Node node19 = node1.copyInformationFrom(node14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = node14.toString(true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01664");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        jSTypeRegistry13.unregisterPropertyOnType("(Not declared as a type name)", jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry13.createFunctionType(jSType17, true, jSTypeArray19);
        boolean boolean22 = functionType20.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        boolean boolean35 = functionType33.removeProperty("false");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node37.isStringKey();
        boolean boolean42 = node37.isThrow();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj48 = node46.getProp((int) (byte) 10);
        boolean boolean49 = node37.isEquivalentToTyped(node46);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, node52);
        boolean boolean57 = node56.isInstanceOf();
        com.google.javascript.rhino.Node node58 = node46.useSourceInfoFromForTree(node56);
        boolean boolean59 = node56.isDo();
        boolean boolean60 = functionType20.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType33, node56);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType20.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = functionType20.getPossibleToBooleanOutcomes();
        boolean boolean63 = functionType20.matchesNumberContext();
        boolean boolean64 = functionType9.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType20);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType9.getImplicitPrototype();
        int int66 = functionType9.getMaxArguments();
        boolean boolean67 = functionType9.canBeCalled();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot69 = functionType9.getSlot("");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(staticSlot69);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01665");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType9.getTypeOfThis();
        java.lang.String str14 = jSType13.getDisplayName();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Unknown" + "'", str14, "Unknown");
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01666");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoFrom(node6);
        boolean boolean13 = node12.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        jSTypeRegistry16.unregisterPropertyOnType("(Not declared as a type name)", jSType18);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        boolean boolean31 = functionType29.removeProperty("false");
        boolean boolean32 = functionType29.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType29);
        com.google.javascript.rhino.jstype.JSType jSType34 = assertionFunctionSpec2.getAssertedType(node12, jSTypeRegistry16);
        jSTypeRegistry16.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node38 = jSTypeRegistry16.createOptionalParameters(jSTypeArray37);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node39 = node38.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01667");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFrom(node4);
        boolean boolean12 = node11.isVar();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        boolean boolean15 = node14.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = node14.getStaticSourceFile();
        node14.setLineno((int) '4');
        com.google.javascript.rhino.Node node19 = node11.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj25 = node23.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node26 = node14.copyInformationFrom(node23);
        boolean boolean27 = node23.isFor();
        int int29 = node23.getIntProp((int) '4');
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder30 = node23.new FileLevelJsDocBuilder();
        fileLevelJsDocBuilder30.append("{proxy:function (): {1486326082}}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(staticSourceFile16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01668");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        boolean boolean50 = functionType22.isUnknownType();
        boolean boolean51 = functionType22.isInterface();
        boolean boolean52 = functionType22.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = functionType22.getConstructor();
        int int54 = functionType22.getPropertiesCount();
        java.lang.String str55 = functionType22.getDisplayName();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01669");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        java.lang.String str50 = functionType22.getReferenceName();
        boolean boolean51 = functionType22.isObject();
        boolean boolean52 = functionType22.hasCachedValues();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01670");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function (): {771301861}");
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01671");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        boolean boolean50 = functionType22.isUnknownType();
        boolean boolean51 = functionType22.isInterface();
        com.google.javascript.rhino.jstype.ObjectType.Property property53 = functionType22.getSlot("function (): {726684091}");
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType22.getTypeOfThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = jSType54.getJSDocInfo();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(property53);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNull(jSDocInfo55);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01672");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        boolean boolean6 = node1.isArrayLit();
        int int7 = node1.getSideEffectFlags();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01673");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.hasThisType();
        boolean boolean26 = jSDocInfo24.shouldPreserveTry();
        boolean boolean27 = jSDocInfo24.isDeprecated();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection28 = jSDocInfo24.getMarkers();
        boolean boolean29 = charSequenceList6.equals((java.lang.Object) markerCollection28);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList36 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList39 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39, charSequenceArray38);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator41 = charSequenceList39.spliterator();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0);
        node44.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(32, node44);
        boolean boolean49 = node48.isGetterDef();
        boolean boolean50 = charSequenceList39.equals((java.lang.Object) boolean49);
        boolean boolean52 = charSequenceList39.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean53 = charSequenceList36.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(0);
        node55.putIntProp((-1), 35);
        boolean boolean59 = node55.isStringKey();
        boolean boolean60 = node55.isThrow();
        int int61 = charSequenceList36.indexOf((java.lang.Object) node55);
        java.lang.Object[] objArray62 = charSequenceList36.toArray();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList63 = charSequenceList36.asList();
        boolean boolean64 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList36);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList6.add((int) (short) -1, (java.lang.CharSequence) "function (): {1976806267}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(markerCollection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceList36);
        org.junit.Assert.assertNotNull(charSequenceArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceList63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01674");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        boolean boolean3 = node1.isDefaultCase();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(0);
        boolean boolean6 = node5.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = node5.getStaticSourceFile();
        node5.setLineno((int) '4');
        com.google.javascript.rhino.Node node10 = node1.srcref(node5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node1.siblings();
        boolean boolean12 = node1.isNull();
        int int13 = node1.getChildCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(staticSourceFile7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01675");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj12 = node10.getProp((int) (byte) 10);
        boolean boolean13 = node1.isEquivalentToTyped(node10);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0);
        node16.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(32, node16);
        boolean boolean21 = node20.isInstanceOf();
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoFromForTree(node20);
        boolean boolean23 = node20.isDo();
        boolean boolean24 = node20.isIn();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean29 = node28.isEmpty();
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList36 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray35);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList39 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39, charSequenceArray38);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator41 = charSequenceList39.spliterator();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0);
        node44.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(32, node44);
        boolean boolean49 = node48.isGetterDef();
        boolean boolean50 = charSequenceList39.equals((java.lang.Object) boolean49);
        boolean boolean52 = charSequenceList39.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean53 = charSequenceList36.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(0);
        node55.putIntProp((-1), 35);
        boolean boolean59 = node55.isStringKey();
        boolean boolean60 = node55.isThrow();
        int int61 = charSequenceList36.indexOf((java.lang.Object) node55);
        boolean boolean62 = node28.isEquivalentTo(node55);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(0);
        node64.putIntProp((-1), 35);
        boolean boolean68 = node64.isReturn();
        com.google.javascript.rhino.InputId inputId69 = node64.getInputId();
        node64.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node72 = node28.useSourceInfoIfMissingFrom(node64);
        boolean boolean73 = node64.isGetElem();
        com.google.javascript.rhino.Node node74 = node20.useSourceInfoIfMissingFrom(node64);
        boolean boolean75 = node20.isAssignAdd();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceList36);
        org.junit.Assert.assertNotNull(charSequenceArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(inputId69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01676");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        jSTypeRegistry12.unregisterPropertyOnType("(Not declared as a type name)", jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry12.createFunctionType(jSType16, true, jSTypeArray18);
        boolean boolean21 = functionType19.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        jSTypeRegistry25.unregisterPropertyOnType("(Not declared as a type name)", jSType27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry25.createFunctionType(jSType29, true, jSTypeArray31);
        boolean boolean34 = functionType32.removeProperty("false");
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        node36.putIntProp((-1), 35);
        boolean boolean40 = node36.isStringKey();
        boolean boolean41 = node36.isThrow();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj47 = node45.getProp((int) (byte) 10);
        boolean boolean48 = node36.isEquivalentToTyped(node45);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        node51.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(32, node51);
        boolean boolean56 = node55.isInstanceOf();
        com.google.javascript.rhino.Node node57 = node45.useSourceInfoFromForTree(node55);
        boolean boolean58 = node55.isDo();
        boolean boolean59 = functionType19.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType32, node55);
        boolean boolean60 = functionType32.isUnknownType();
        java.util.Set<java.lang.String> strSet61 = functionType32.getPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType32, "Unknown class name", "Unknown class name", 41, 2);
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType32.autobox();
        boolean boolean68 = jSType67.isConstructor();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01677");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean52 = parameterizedType48.isConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        jSTypeRegistry55.unregisterPropertyOnType("(Not declared as a type name)", jSType57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry55.createFunctionType(jSType59, true, jSTypeArray61);
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType62.autoboxesTo();
        java.lang.String str64 = functionType62.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        jSTypeRegistry67.unregisterPropertyOnType("(Not declared as a type name)", jSType69);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray73 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry67.createFunctionType(jSType71, true, jSTypeArray73);
        com.google.common.collect.ImmutableList<java.lang.String> strList75 = functionType74.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot77 = functionType74.getSlot("NUMBER 0.0 100\n");
        boolean boolean78 = functionType74.isAllType();
        boolean boolean79 = functionType62.hasEqualCallType(functionType74);
        boolean boolean81 = functionType62.isPropertyTypeDeclared("NUMBER 0.0 100\n");
        boolean boolean82 = functionType62.isUnknownType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue83 = parameterizedType48.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType62);
        com.google.javascript.rhino.jstype.EnumType enumType84 = parameterizedType48.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType85 = parameterizedType48.toMaybeFunctionType();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertNull(jSType63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(jSTypeArray73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNull(staticSlot77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(ternaryValue83);
        org.junit.Assert.assertNull(enumType84);
        org.junit.Assert.assertNotNull(functionType85);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01678");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        jSTypeRegistry23.unregisterPropertyOnType("(Not declared as a type name)", jSType25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry23.createFunctionType(jSType27, true, jSTypeArray29);
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType30.autoboxesTo();
        boolean boolean32 = jSTypeRegistry2.declareType("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType30);
        boolean boolean33 = functionType30.isNoObjectType();
        boolean boolean34 = functionType30.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType35 = functionType30.dereference();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectType35);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01679");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getPositionOnStartLine();
        int int3 = stringPosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01680");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        boolean boolean7 = node1.isEmpty();
        boolean boolean8 = node1.isHook();
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        node1.setJSType(jSType9);
        com.google.javascript.rhino.Node node11 = node1.cloneNode();
        boolean boolean12 = node11.isAdd();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        boolean boolean16 = node15.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = node15.getStaticSourceFile();
        java.lang.String str18 = node15.getSourceFileName();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        boolean boolean21 = node20.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = node20.getStaticSourceFile();
        com.google.javascript.rhino.Node node23 = node20.getNext();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        node25.putIntProp((-1), 35);
        boolean boolean29 = node25.isStringKey();
        boolean boolean30 = node25.isThrow();
        boolean boolean31 = node25.isEmpty();
        com.google.javascript.rhino.Node node32 = node20.copyInformationFrom(node25);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        node36.putIntProp((-1), 35);
        boolean boolean40 = node36.isStringKey();
        boolean boolean41 = node36.isThrow();
        com.google.javascript.rhino.Node node42 = node34.useSourceInfoFrom(node36);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0);
        boolean boolean45 = node44.isCall();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(0);
        node48.putIntProp((-1), 35);
        boolean boolean52 = node48.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList53 = com.google.common.collect.ImmutableList.of((java.lang.Object) node20, (java.lang.Object) node36, (java.lang.Object) node44, (java.lang.Object) 53, (java.lang.Object) node48);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(0);
        boolean boolean56 = node55.isInstanceOf();
        node48.addChildrenToFront(node55);
        int int58 = node48.getSourceOffset();
        boolean boolean59 = node48.isVoid();
        com.google.javascript.rhino.Node node60 = node15.useSourceInfoIfMissingFrom(node48);
        boolean boolean61 = node48.isEmpty();
        boolean boolean62 = node48.hasMoreThanOneChild();
        boolean boolean63 = node48.isString();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(42, node48, 37, 37);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node67 = node11.removeChildAfter(node66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(staticSourceFile17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(staticSourceFile22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objList53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01681");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj5 = node3.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        com.google.javascript.rhino.Node node15 = node7.useSourceInfoFrom(node9);
        boolean boolean16 = node15.isIn();
        com.google.javascript.rhino.Node node17 = node3.clonePropsFrom(node15);
        boolean boolean18 = node17.isGetElem();
        java.lang.String str22 = node17.toString(false, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = node17.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 100 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "NUMBER 0.0" + "'", str22, "NUMBER 0.0");
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01682");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        jSTypeRegistry13.unregisterPropertyOnType("(Not declared as a type name)", jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry13.createFunctionType(jSType17, true, jSTypeArray19);
        boolean boolean22 = functionType20.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        boolean boolean35 = functionType33.removeProperty("false");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node37.isStringKey();
        boolean boolean42 = node37.isThrow();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj48 = node46.getProp((int) (byte) 10);
        boolean boolean49 = node37.isEquivalentToTyped(node46);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, node52);
        boolean boolean57 = node56.isInstanceOf();
        com.google.javascript.rhino.Node node58 = node46.useSourceInfoFromForTree(node56);
        boolean boolean59 = node56.isDo();
        boolean boolean60 = functionType20.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType33, node56);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair61 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = functionType33.getPossibleToBooleanOutcomes();
        boolean boolean63 = functionType33.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = functionType33.toMaybeFunctionType();
        com.google.javascript.rhino.Node node65 = functionType33.getParametersNode();
        java.lang.String str66 = functionType33.toAnnotationString();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "function (): ?" + "'", str66, "function (): ?");
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01683");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot12 = functionType9.getSlot("NUMBER 0.0 100\n");
        boolean boolean13 = functionType9.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        jSTypeRegistry16.unregisterPropertyOnType("(Not declared as a type name)", jSType18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry16.createFunctionType(jSType20, true, jSTypeArray22);
        boolean boolean25 = functionType23.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType23.findPropertyType("Not declared as a type name");
        boolean boolean28 = functionType9.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = null;
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType23.resolve(errorReporter29, jSTypeStaticScope30);
        boolean boolean32 = functionType23.isFunctionPrototypeType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = functionType23.getOwnPropertyJSDocInfo("{proxy:function (): {1278869837}}");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(staticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(jSType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSDocInfo34);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01684");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = new com.google.javascript.rhino.JSTypeExpression(node3, "NUMBER 0.0 100\n");
        com.google.javascript.rhino.Node node7 = node3.getAncestor(54);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = node7.isFalse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01685");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType12.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType12.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType12);
        jSTypeRegistry2.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        jSTypeRegistry21.unregisterPropertyOnType("(Not declared as a type name)", jSType23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry21.createFunctionType(jSType25, true, jSTypeArray27);
        boolean boolean30 = functionType28.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        jSTypeRegistry34.unregisterPropertyOnType("(Not declared as a type name)", jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry34.createFunctionType(jSType38, true, jSTypeArray40);
        boolean boolean43 = functionType41.removeProperty("false");
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0);
        node45.putIntProp((-1), 35);
        boolean boolean49 = node45.isStringKey();
        boolean boolean50 = node45.isThrow();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj56 = node54.getProp((int) (byte) 10);
        boolean boolean57 = node45.isEquivalentToTyped(node54);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(0);
        node60.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(32, node60);
        boolean boolean65 = node64.isInstanceOf();
        com.google.javascript.rhino.Node node66 = node54.useSourceInfoFromForTree(node64);
        boolean boolean67 = node64.isDo();
        boolean boolean68 = functionType28.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType41, node64);
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType41);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, true);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        jSTypeRegistry74.unregisterPropertyOnType("(Not declared as a type name)", jSType76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType81 = jSTypeRegistry74.createFunctionType(jSType78, true, jSTypeArray80);
        boolean boolean83 = functionType81.removeProperty("false");
        com.google.javascript.rhino.jstype.ObjectType objectType84 = functionType81.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType85 = objectType84.unboxesTo();
        jSTypeRegistry2.unregisterPropertyOnType("NUMBER 0.0\n", jSType85);
        com.google.javascript.rhino.Node node92 = com.google.javascript.rhino.Node.newString(14, "function (): {848299148}", 8, 40);
        com.google.javascript.rhino.Node node93 = node92.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType94 = jSTypeRegistry2.createInterfaceType("function (): {581361697}", node92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(jSTypeArray80);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(objectType84);
        org.junit.Assert.assertNull(jSType85);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertNull(node93);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01686");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        java.lang.String str11 = functionType9.toString();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType9.getPropertyType("Not declared as a type name");
        boolean boolean14 = functionType9.canBeCalled();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "function (): ?" + "'", str11, "function (): ?");
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01687");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = null;
        jSDocInfo0.setVisibility(visibility3);
        boolean boolean5 = jSDocInfo0.isInterface();
        java.lang.String str6 = jSDocInfo0.getDescription();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getSuppressions();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        jSTypeRegistry10.unregisterPropertyOnType("(Not declared as a type name)", jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry10.createFunctionType(jSType14, true, jSTypeArray16);
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType17.autoboxesTo();
        java.lang.String str19 = functionType17.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        com.google.common.collect.ImmutableList<java.lang.String> strList30 = functionType29.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot32 = functionType29.getSlot("NUMBER 0.0 100\n");
        boolean boolean33 = functionType29.isAllType();
        boolean boolean34 = functionType17.hasEqualCallType(functionType29);
        com.google.javascript.rhino.jstype.FunctionType functionType35 = functionType29.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        jSTypeRegistry38.unregisterPropertyOnType("(Not declared as a type name)", jSType40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType(jSType42, true, jSTypeArray44);
        boolean boolean47 = functionType45.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        jSTypeRegistry51.unregisterPropertyOnType("(Not declared as a type name)", jSType53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry51.createFunctionType(jSType55, true, jSTypeArray57);
        boolean boolean60 = functionType58.removeProperty("false");
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(0);
        node62.putIntProp((-1), 35);
        boolean boolean66 = node62.isStringKey();
        boolean boolean67 = node62.isThrow();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj73 = node71.getProp((int) (byte) 10);
        boolean boolean74 = node62.isEquivalentToTyped(node71);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(0);
        node77.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node(32, node77);
        boolean boolean82 = node81.isInstanceOf();
        com.google.javascript.rhino.Node node83 = node71.useSourceInfoFromForTree(node81);
        boolean boolean84 = node81.isDo();
        boolean boolean85 = functionType45.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType58, node81);
        java.lang.String str86 = functionType58.getReferenceName();
        functionType29.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType58);
        boolean boolean88 = functionType29.isArrayType();
        boolean boolean89 = strSet7.contains((java.lang.Object) functionType29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean91 = strSet7.add("function ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNull(staticSlot32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(functionType35);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01688");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(32, node2);
        boolean boolean7 = node6.isGetterDef();
        boolean boolean8 = node6.isThis();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01689");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasThisType();
        boolean boolean4 = jSDocInfo2.shouldPreserveTry();
        boolean boolean5 = jSDocInfo2.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo2.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean8 = jSDocInfo2.shouldPreserveTry();
        boolean boolean9 = jSDocInfo2.isOverride();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection10 = jSDocInfo2.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo2.getTypedefType();
        java.lang.String str13 = jSDocInfo2.getDescriptionForParameter("function (): {2129138287}");
        node1.setJSDocInfo(jSDocInfo2);
        java.lang.String str15 = jSDocInfo2.getDeprecationReason();
        int int16 = jSDocInfo2.getImplementedInterfaceCount();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection17 = jSDocInfo2.getMarkers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(markerCollection10);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(markerCollection17);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01690");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFrom(node4);
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = node1.getJSDocInfo();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj18 = node16.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(0);
        node22.putIntProp((-1), 35);
        boolean boolean26 = node22.isStringKey();
        boolean boolean27 = node22.isThrow();
        com.google.javascript.rhino.Node node28 = node20.useSourceInfoFrom(node22);
        boolean boolean29 = node28.isIn();
        com.google.javascript.rhino.Node node30 = node16.clonePropsFrom(node28);
        boolean boolean31 = node30.isGetElem();
        java.lang.String str35 = node30.toString(false, true, false);
        node30.putBooleanProp((int) (short) 1, true);
        node1.addChildToFront(node30);
        java.lang.String str40 = node1.getSourceFileName();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0);
        node42.putIntProp((-1), 35);
        boolean boolean46 = node42.isReturn();
        boolean boolean47 = node42.isFromExterns();
        node42.removeProp((int) (byte) 1);
        node1.addChildToBack(node42);
        boolean boolean51 = node1.wasEmptyNode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(jSDocInfo12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "NUMBER 0.0" + "'", str35, "NUMBER 0.0");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01691");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        java.lang.String str56 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.EnumType enumType57 = parameterizedType48.toMaybeEnumType();
        java.util.Set set58 = parameterizedType48.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry61.createFunctionType(jSType65, true, jSTypeArray67);
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType68.autoboxesTo();
        java.lang.String str70 = functionType68.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        jSTypeRegistry73.unregisterPropertyOnType("(Not declared as a type name)", jSType75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry73.createFunctionType(jSType77, true, jSTypeArray79);
        com.google.common.collect.ImmutableList<java.lang.String> strList81 = functionType80.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot83 = functionType80.getSlot("NUMBER 0.0 100\n");
        boolean boolean84 = functionType80.isAllType();
        boolean boolean85 = functionType68.hasEqualCallType(functionType80);
        com.google.javascript.rhino.JSDocInfo jSDocInfo87 = functionType80.getOwnPropertyJSDocInfo("function (): {2068438814}");
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getReturnType();
        int int89 = functionType80.getMaxArguments();
        boolean boolean90 = functionType80.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType91 = parameterizedType48.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType80);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterable54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "{proxy:function (): {2067133906}}" + "'", str55, "{proxy:function (): {2067133906}}");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "{proxy:function (): {2067133906}}" + "'", str56, "{proxy:function (): {2067133906}}");
        org.junit.Assert.assertNull(enumType57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertNull(jSType69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNull(staticSlot83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(jSDocInfo87);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(jSType91);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01692");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(0);
        node5.putIntProp((-1), 35);
        boolean boolean9 = node5.isStringKey();
        boolean boolean10 = node5.isThrow();
        com.google.javascript.rhino.Node node11 = node3.useSourceInfoFrom(node5);
        namePosition1.setItem(node3);
        boolean boolean13 = node3.isTry();
        node3.putBooleanProp(0, true);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        boolean boolean19 = node18.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = node18.getStaticSourceFile();
        com.google.javascript.rhino.Node node21 = node18.getNext();
        boolean boolean22 = node18.isFalse();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean27 = node26.isEmpty();
        node18.addChildrenToBack(node26);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship29 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node3, node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node3);
        com.google.javascript.rhino.Node node31 = node3.cloneTree();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        boolean boolean35 = node34.isCall();
        com.google.javascript.rhino.Node node36 = node34.cloneTree();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(35, node36, node39);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder41 = node39.getJsDocBuilderForNode();
        node39.setOptionalArg(true);
        boolean boolean44 = node3.hasChild(node39);
        com.google.javascript.rhino.Node node46 = node39.getChildAtIndex((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(staticSourceFile20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01693");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        boolean boolean5 = node4.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node4.getStaticSourceFile();
        com.google.javascript.rhino.Node node7 = node4.getNext();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        boolean boolean15 = node9.isEmpty();
        com.google.javascript.rhino.Node node16 = node4.copyInformationFrom(node9);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        boolean boolean24 = node20.isStringKey();
        boolean boolean25 = node20.isThrow();
        com.google.javascript.rhino.Node node26 = node18.useSourceInfoFrom(node20);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isCall();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = com.google.common.collect.ImmutableList.of((java.lang.Object) node4, (java.lang.Object) node20, (java.lang.Object) node28, (java.lang.Object) 53, (java.lang.Object) node32);
        com.google.javascript.rhino.Node node38 = assertionFunctionSpec2.getAssertedParam(node32);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0);
        boolean boolean41 = node40.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile42 = node40.getStaticSourceFile();
        com.google.javascript.rhino.Node node43 = node40.getNext();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0);
        node45.putIntProp((-1), 35);
        boolean boolean49 = node45.isStringKey();
        boolean boolean50 = node45.isThrow();
        boolean boolean51 = node45.isEmpty();
        com.google.javascript.rhino.Node node52 = node40.copyInformationFrom(node45);
        boolean boolean53 = node52.isGetProp();
        boolean boolean54 = node52.isThrow();
        boolean boolean55 = node52.isHook();
        node38.addChildrenToFront(node52);
        boolean boolean57 = node38.isComma();
        boolean boolean58 = node38.wasEmptyNode();
        node38.setIsSyntheticBlock(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(staticSourceFile42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01694");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("function (): {1871394465}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01695");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        boolean boolean5 = node4.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node4.getStaticSourceFile();
        com.google.javascript.rhino.Node node7 = node4.getNext();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        boolean boolean15 = node9.isEmpty();
        com.google.javascript.rhino.Node node16 = node4.copyInformationFrom(node9);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        boolean boolean24 = node20.isStringKey();
        boolean boolean25 = node20.isThrow();
        com.google.javascript.rhino.Node node26 = node18.useSourceInfoFrom(node20);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isCall();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = com.google.common.collect.ImmutableList.of((java.lang.Object) node4, (java.lang.Object) node20, (java.lang.Object) node28, (java.lang.Object) 53, (java.lang.Object) node32);
        com.google.javascript.rhino.Node node38 = assertionFunctionSpec2.getAssertedParam(node32);
        java.lang.String str39 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node32);
        com.google.javascript.rhino.Node node40 = node32.getLastSibling();
        boolean boolean42 = node32.getBooleanProp(41);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01696");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        boolean boolean5 = node4.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node4.getStaticSourceFile();
        com.google.javascript.rhino.Node node7 = node4.getNext();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        boolean boolean15 = node9.isEmpty();
        com.google.javascript.rhino.Node node16 = node4.copyInformationFrom(node9);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        boolean boolean24 = node20.isStringKey();
        boolean boolean25 = node20.isThrow();
        com.google.javascript.rhino.Node node26 = node18.useSourceInfoFrom(node20);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isCall();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = com.google.common.collect.ImmutableList.of((java.lang.Object) node4, (java.lang.Object) node20, (java.lang.Object) node28, (java.lang.Object) 53, (java.lang.Object) node32);
        com.google.javascript.rhino.Node node38 = assertionFunctionSpec2.getAssertedParam(node32);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0);
        boolean boolean41 = node40.isCall();
        boolean boolean42 = node40.isThrow();
        boolean boolean43 = node40.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType jSType46 = assertionFunctionSpec2.getAssertedType(node40, jSTypeRegistry45);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable48 = jSTypeRegistry45.getTypesWithProperty("function (): {1825464447}");
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        jSTypeRegistry52.unregisterPropertyOnType("(Not declared as a type name)", jSType54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry52.createFunctionType(jSType56, true, jSTypeArray58);
        com.google.javascript.rhino.jstype.JSType jSType60 = functionType59.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType61 = functionType59.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        jSTypeRegistry65.unregisterPropertyOnType("(Not declared as a type name)", jSType67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        jSTypeRegistry71.unregisterPropertyOnType("(Not declared as a type name)", jSType73);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry71.createFunctionType(jSType75, true, jSTypeArray77);
        boolean boolean80 = functionType78.removeProperty("false");
        boolean boolean81 = functionType78.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry65.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType78);
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType59.forceResolve(errorReporter62, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType78);
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType78.getTypeOfThis();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry45.overwriteDeclaredType("function (): {259080799}", jSType84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(jSType46);
        org.junit.Assert.assertNotNull(jSTypeIterable48);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertNotNull(jSTypeArray77);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01697");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node1.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node11 = node1.srcrefTree(node10);
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.isHidden();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean17 = jSDocInfo16.hasThisType();
        boolean boolean18 = jSDocInfo16.shouldPreserveTry();
        boolean boolean19 = jSDocInfo16.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList20 = jSDocInfo16.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo21.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility24 = null;
        jSDocInfo21.setVisibility(visibility24);
        boolean boolean26 = jSDocInfo21.isExport();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean28 = jSDocInfo27.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression29 = jSDocInfo27.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility30 = null;
        jSDocInfo27.setVisibility(visibility30);
        boolean boolean32 = jSDocInfo27.isExport();
        java.lang.String str33 = jSDocInfo27.getMeaning();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean35 = jSDocInfo34.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression36 = jSDocInfo34.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility37 = null;
        jSDocInfo34.setVisibility(visibility37);
        boolean boolean39 = jSDocInfo34.isExport();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList40 = com.google.common.collect.ImmutableList.of(jSDocInfo12, jSDocInfo14, jSDocInfo15, jSDocInfo16, jSDocInfo21, jSDocInfo27, jSDocInfo34);
        java.lang.String str41 = jSDocInfo12.getLendsName();
        jSDocInfo12.setDeprecated(true);
        node11.setJSDocInfo(jSDocInfo12);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression45 = jSDocInfo12.getThisType();
        jSDocInfo12.addSuppression("(function (): {1826660093})");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSTypeExpression23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(jSTypeExpression29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(jSTypeExpression36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(jSTypeExpression45);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01698");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property12 = functionType9.getSlot("");
        boolean boolean13 = functionType9.isStringValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        jSTypeRegistry16.unregisterPropertyOnType("(Not declared as a type name)", jSType18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry16.createFunctionType(jSType20, true, jSTypeArray22);
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType23.autoboxesTo();
        java.lang.String str25 = functionType23.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        jSTypeRegistry28.unregisterPropertyOnType("(Not declared as a type name)", jSType30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry28.createFunctionType(jSType32, true, jSTypeArray34);
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = functionType35.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot38 = functionType35.getSlot("NUMBER 0.0 100\n");
        boolean boolean39 = functionType35.isAllType();
        boolean boolean40 = functionType23.hasEqualCallType(functionType35);
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = functionType35.getOwnPropertyJSDocInfo("function (): {2068438814}");
        java.lang.Iterable iterable43 = functionType35.getCtorImplementedInterfaces();
        boolean boolean44 = functionType9.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType35);
        functionType35.clearResolved();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType35.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertNull(jSType24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNull(staticSlot38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(jSDocInfo42);
        org.junit.Assert.assertNotNull(iterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01699");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = parameterizedType48.getIndexType();
        boolean boolean51 = parameterizedType48.matchesNumberContext();
        boolean boolean52 = parameterizedType48.isCheckedUnknownType();
        boolean boolean53 = parameterizedType48.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType54 = parameterizedType48.collapseUnion();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSType54);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01700");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = functionType9.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType9.getConstructor();
        com.google.javascript.rhino.Node node14 = functionType9.getRootNode();
        boolean boolean15 = functionType9.isUnknownType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNull(functionType13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01701");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isNullType();
        boolean boolean12 = functionType9.hasCachedValues();
        java.lang.String str13 = functionType9.getDisplayName();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01702");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setMutatesThis();
        sideEffectFlags1.setMutatesArguments();
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01703");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType12.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType12.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType12);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        boolean boolean31 = functionType29.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean44 = functionType42.removeProperty("false");
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(0);
        node46.putIntProp((-1), 35);
        boolean boolean50 = node46.isStringKey();
        boolean boolean51 = node46.isThrow();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj57 = node55.getProp((int) (byte) 10);
        boolean boolean58 = node46.isEquivalentToTyped(node55);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(0);
        node61.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(32, node61);
        boolean boolean66 = node65.isInstanceOf();
        com.google.javascript.rhino.Node node67 = node55.useSourceInfoFromForTree(node65);
        boolean boolean68 = node65.isDo();
        boolean boolean69 = functionType29.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType42, node65);
        java.lang.String str70 = functionType42.getReferenceName();
        boolean boolean71 = functionType42.isUnionType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection72 = jSTypeRegistry2.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable74 = jSTypeRegistry2.getEachReferenceTypeWithProperty("function (): {2129138287}");
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        jSTypeRegistry77.unregisterPropertyOnType("(Not declared as a type name)", jSType79);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray83 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry77.createFunctionType(jSType81, true, jSTypeArray83);
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType84.restrictByNotNullOrUndefined();
        java.lang.String str86 = functionType84.toString();
        int int87 = functionType84.getMaxArguments();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable88 = functionType84.getCtorImplementedInterfaces();
        boolean boolean89 = functionType84.isResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType90 = functionType84.getPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType91 = objectType90.getConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType92 = objectType90.toObjectType();
        boolean boolean94 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) objectType92, "(function (): {367372378})");
        com.google.javascript.rhino.ErrorReporter errorReporter95 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope96 = null;
        com.google.javascript.rhino.jstype.JSType jSType97 = objectType92.forceResolve(errorReporter95, jSTypeStaticScope96);
        boolean boolean98 = objectType92.isVoidType();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection72);
        org.junit.Assert.assertNotNull(objectTypeIterable74);
        org.junit.Assert.assertNotNull(jSTypeArray83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "function (): ?" + "'", str86, "function (): ?");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objectType90);
        org.junit.Assert.assertNull(functionType91);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(jSType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01704");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj5 = node3.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        com.google.javascript.rhino.Node node15 = node7.useSourceInfoFrom(node9);
        boolean boolean16 = node15.isIn();
        com.google.javascript.rhino.Node node17 = node3.clonePropsFrom(node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj23 = node21.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        node27.putIntProp((-1), 35);
        boolean boolean31 = node27.isStringKey();
        boolean boolean32 = node27.isThrow();
        com.google.javascript.rhino.Node node33 = node25.useSourceInfoFrom(node27);
        boolean boolean34 = node33.isIn();
        com.google.javascript.rhino.Node node35 = node21.clonePropsFrom(node33);
        boolean boolean36 = node35.isGetElem();
        java.lang.String str40 = node35.toString(false, true, false);
        node3.addChildrenToFront(node35);
        node35.removeProp(32);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags44 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags44.setThrows();
        sideEffectFlags44.setThrows();
        // The following exception was thrown during execution in test generation
        try {
            node35.setSideEffectFlags(sideEffectFlags44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "NUMBER 0.0" + "'", str40, "NUMBER 0.0");
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01705");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        boolean boolean3 = node1.isThrow();
        int int4 = node1.getCharno();
        boolean boolean5 = node1.isUnscopedQualifiedName();
        boolean boolean6 = node1.isScript();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = node1.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01706");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function (): {697129060}");
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01707");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property12 = functionType9.getSlot("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType22.autoboxesTo();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        boolean boolean35 = functionType33.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        jSTypeRegistry39.unregisterPropertyOnType("(Not declared as a type name)", jSType41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry39.createFunctionType(jSType43, true, jSTypeArray45);
        boolean boolean48 = functionType46.removeProperty("false");
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(0);
        node50.putIntProp((-1), 35);
        boolean boolean54 = node50.isStringKey();
        boolean boolean55 = node50.isThrow();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj61 = node59.getProp((int) (byte) 10);
        boolean boolean62 = node50.isEquivalentToTyped(node59);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(0);
        node65.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(32, node65);
        boolean boolean70 = node69.isInstanceOf();
        com.google.javascript.rhino.Node node71 = node59.useSourceInfoFromForTree(node69);
        boolean boolean72 = node69.isDo();
        boolean boolean73 = functionType33.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType46, node69);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable74 = functionType33.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet75 = functionType33.getPossibleToBooleanOutcomes();
        boolean boolean76 = functionType33.matchesNumberContext();
        boolean boolean77 = functionType22.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType33);
        boolean boolean79 = functionType33.isPropertyTypeDeclared("(Not declared as a type name)");
        boolean boolean80 = functionType33.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair81 = functionType9.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType33);
        java.lang.String str82 = functionType9.getDisplayName();
        boolean boolean84 = functionType9.removeProperty("function (): {1614074355}");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable85 = functionType9.getOwnImplementedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(property12);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable74);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet75 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet75.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(typePair81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable85);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01708");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean79 = functionType77.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType77.findPropertyType("Not declared as a type name");
        boolean boolean82 = functionType63.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope84 = null;
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType77.resolve(errorReporter83, jSTypeStaticScope84);
        boolean boolean86 = functionType77.isNullable();
        boolean boolean87 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType77);
        boolean boolean88 = parameterizedType48.isInstanceType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = parameterizedType48.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType90 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair91 = parameterizedType48.getTypesUnderEquality(jSType90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNull(staticSlot66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jSTypeArray76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(jSType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(parameterizedType89);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01709");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        node3.putIntProp((-1), 35);
        boolean boolean7 = node3.isStringKey();
        boolean boolean8 = node3.isThrow();
        com.google.javascript.rhino.Node node9 = node1.useSourceInfoFrom(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node9);
        boolean boolean11 = node9.isTrue();
        int int12 = node9.getType();
        boolean boolean13 = node9.isDebugger();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj19 = node17.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        boolean boolean27 = node23.isStringKey();
        boolean boolean28 = node23.isThrow();
        com.google.javascript.rhino.Node node29 = node21.useSourceInfoFrom(node23);
        boolean boolean30 = node29.isIn();
        com.google.javascript.rhino.Node node31 = node17.clonePropsFrom(node29);
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getSourceName(node17);
        com.google.javascript.rhino.Node node33 = node9.srcrefTree(node17);
        int int34 = node17.getChildCount();
        boolean boolean35 = node17.isDec();
        com.google.javascript.rhino.Node node36 = node17.getLastSibling();
        java.lang.String str37 = node17.getSourceFileName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01710");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        boolean boolean6 = node1.isNot();
        boolean boolean7 = node1.isInstanceOf();
        boolean boolean8 = node1.isGetProp();
        boolean boolean9 = node1.isIf();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        boolean boolean11 = node1.isInstanceOf();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01711");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        node25.putIntProp((-1), 35);
        boolean boolean29 = node25.isStringKey();
        boolean boolean30 = node25.isThrow();
        int int31 = charSequenceList6.indexOf((java.lang.Object) node25);
        java.lang.Object[] objArray32 = charSequenceList6.toArray();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        boolean boolean35 = node34.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(0);
        node38.putIntProp((-1), 35);
        boolean boolean42 = node38.isReturn();
        com.google.javascript.rhino.InputId inputId43 = node38.getInputId();
        node38.setWasEmptyNode(true);
        boolean boolean46 = node38.isLabel();
        boolean boolean47 = node38.isTry();
        com.google.javascript.rhino.Node node48 = node34.srcref(node38);
        boolean boolean49 = node34.isRegExp();
        com.google.javascript.rhino.Node node50 = node34.removeChildren();
        boolean boolean51 = charSequenceList6.contains((java.lang.Object) node34);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection52 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node34);
        int int53 = node34.getCharno();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(staticSourceFile36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(inputId43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(nodeCollection52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01712");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getPropertyType("NUMBER 0.0 100\n");
        boolean boolean56 = parameterizedType48.isEnumElementType();
        boolean boolean58 = parameterizedType48.hasProperty("function (): {1754035944}");
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01713");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        boolean boolean6 = node2.isStringKey();
        boolean boolean7 = node2.isThrow();
        int int8 = node2.getLineno();
        boolean boolean9 = node2.hasChildren();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        node11.putIntProp((-1), 35);
        boolean boolean15 = node2.hasChild(node11);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        boolean boolean18 = node17.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node17.getStaticSourceFile();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0, node11, node17, node23);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative26 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec27 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative26);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        boolean boolean30 = node29.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile31 = node29.getStaticSourceFile();
        com.google.javascript.rhino.Node node32 = node29.getNext();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        node34.putIntProp((-1), 35);
        boolean boolean38 = node34.isStringKey();
        boolean boolean39 = node34.isThrow();
        boolean boolean40 = node34.isEmpty();
        com.google.javascript.rhino.Node node41 = node29.copyInformationFrom(node34);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0);
        node45.putIntProp((-1), 35);
        boolean boolean49 = node45.isStringKey();
        boolean boolean50 = node45.isThrow();
        com.google.javascript.rhino.Node node51 = node43.useSourceInfoFrom(node45);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(0);
        boolean boolean54 = node53.isCall();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        node57.putIntProp((-1), 35);
        boolean boolean61 = node57.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList62 = com.google.common.collect.ImmutableList.of((java.lang.Object) node29, (java.lang.Object) node45, (java.lang.Object) node53, (java.lang.Object) 53, (java.lang.Object) node57);
        com.google.javascript.rhino.Node node63 = assertionFunctionSpec27.getAssertedParam(node57);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(0);
        boolean boolean66 = node65.isCall();
        boolean boolean67 = node65.isThrow();
        boolean boolean68 = node65.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        com.google.javascript.rhino.jstype.JSType jSType71 = assertionFunctionSpec27.getAssertedType(node65, jSTypeRegistry70);
        node11.addChildToFront(node65);
        boolean boolean73 = node65.isFromExterns();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags75 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags75.setAllFlags();
        sideEffectFlags75.setThrows();
        sideEffectFlags75.setMutatesThis();
        // The following exception was thrown during execution in test generation
        try {
            node65.setSideEffectFlags(sideEffectFlags75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(staticSourceFile31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objList62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(jSType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01714");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        boolean boolean7 = node1.isEmpty();
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList15 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray14);
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList18 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18, charSequenceArray17);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator20 = charSequenceList18.spliterator();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(32, node23);
        boolean boolean28 = node27.isGetterDef();
        boolean boolean29 = charSequenceList18.equals((java.lang.Object) boolean28);
        boolean boolean31 = charSequenceList18.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean32 = charSequenceList15.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList18);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList33 = charSequenceList15.asList();
        node1.putProp(49, (java.lang.Object) charSequenceList33);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList35 = charSequenceList33.asList();
        java.lang.Object[] objArray36 = charSequenceList33.toArray();
        java.util.Iterator<java.lang.CharSequence> charSequenceItor37 = charSequenceList33.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        jSTypeRegistry40.unregisterPropertyOnType("(Not declared as a type name)", jSType42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry40.createFunctionType(jSType44, true, jSTypeArray46);
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType47.autoboxesTo();
        java.lang.String str49 = functionType47.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        jSTypeRegistry52.unregisterPropertyOnType("(Not declared as a type name)", jSType54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry52.createFunctionType(jSType56, true, jSTypeArray58);
        com.google.common.collect.ImmutableList<java.lang.String> strList60 = functionType59.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot62 = functionType59.getSlot("NUMBER 0.0 100\n");
        boolean boolean63 = functionType59.isAllType();
        boolean boolean64 = functionType47.hasEqualCallType(functionType59);
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = functionType59.getOwnPropertyJSDocInfo("function (): {2068438814}");
        boolean boolean68 = functionType59.removeProperty("Not declared as a constructor");
        boolean boolean69 = functionType59.isBooleanValueType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = charSequenceList33.remove((java.lang.Object) boolean69);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceList15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charSequenceList33);
        org.junit.Assert.assertNotNull(charSequenceList35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceItor37);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertNull(jSType48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNull(staticSlot62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(jSDocInfo66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01715");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.ObjectType.Property property12 = functionType9.getSlot("Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.isHidden();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.hasThisType();
        boolean boolean19 = jSDocInfo17.shouldPreserveTry();
        boolean boolean20 = jSDocInfo17.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList21 = jSDocInfo17.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo22.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility25 = null;
        jSDocInfo22.setVisibility(visibility25);
        boolean boolean27 = jSDocInfo22.isExport();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean29 = jSDocInfo28.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = jSDocInfo28.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility31 = null;
        jSDocInfo28.setVisibility(visibility31);
        boolean boolean33 = jSDocInfo28.isExport();
        java.lang.String str34 = jSDocInfo28.getMeaning();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean36 = jSDocInfo35.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression37 = jSDocInfo35.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility38 = null;
        jSDocInfo35.setVisibility(visibility38);
        boolean boolean40 = jSDocInfo35.isExport();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList41 = com.google.common.collect.ImmutableList.of(jSDocInfo13, jSDocInfo15, jSDocInfo16, jSDocInfo17, jSDocInfo22, jSDocInfo28, jSDocInfo35);
        java.lang.String str42 = jSDocInfo13.getLendsName();
        jSDocInfo13.setDeprecated(true);
        functionType9.setJSDocInfo(jSDocInfo13);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        jSTypeRegistry48.unregisterPropertyOnType("(Not declared as a type name)", jSType50);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        jSTypeRegistry54.unregisterPropertyOnType("(Not declared as a type name)", jSType56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry54.createFunctionType(jSType58, true, jSTypeArray60);
        boolean boolean63 = functionType61.removeProperty("false");
        boolean boolean64 = functionType61.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry48.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType61);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair66 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType61);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = functionType61.getBindReturnType(54);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType69 = functionType61.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(property12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(jSTypeExpression30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(jSTypeExpression37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(functionType68);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01716");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.Node node12 = functionType9.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo13.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility16 = null;
        jSDocInfo13.setVisibility(visibility16);
        boolean boolean18 = jSDocInfo13.isOverride();
        functionType9.setJSDocInfo(jSDocInfo13);
        java.lang.String str21 = jSDocInfo13.getDescriptionForParameter("function (): {2068438814}");
        boolean boolean22 = jSDocInfo13.isImplicitCast();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01717");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = functionType9.getImplicitPrototype();
        java.util.Set<java.lang.String> strSet13 = objectType12.getPropertyNames();
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList16 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16, charSequenceArray15);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator18 = charSequenceList16.spliterator();
        java.lang.Object[] objArray19 = charSequenceList16.toArray();
        boolean boolean20 = strSet13.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList16);
        charSequenceList16.clear();
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator22 = charSequenceList16.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        jSTypeRegistry25.unregisterPropertyOnType("(Not declared as a type name)", jSType27);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        jSTypeRegistry31.unregisterPropertyOnType("(Not declared as a type name)", jSType33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry31.createFunctionType(jSType35, true, jSTypeArray37);
        boolean boolean39 = functionType38.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        jSTypeRegistry42.unregisterPropertyOnType("(Not declared as a type name)", jSType44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry42.createFunctionType(jSType46, true, jSTypeArray48);
        boolean boolean51 = functionType49.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        jSTypeRegistry55.unregisterPropertyOnType("(Not declared as a type name)", jSType57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry55.createFunctionType(jSType59, true, jSTypeArray61);
        boolean boolean64 = functionType62.removeProperty("false");
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(0);
        node66.putIntProp((-1), 35);
        boolean boolean70 = node66.isStringKey();
        boolean boolean71 = node66.isThrow();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj77 = node75.getProp((int) (byte) 10);
        boolean boolean78 = node66.isEquivalentToTyped(node75);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node(0);
        node81.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(32, node81);
        boolean boolean86 = node85.isInstanceOf();
        com.google.javascript.rhino.Node node87 = node75.useSourceInfoFromForTree(node85);
        boolean boolean88 = node85.isDo();
        boolean boolean89 = functionType49.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType62, node85);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair90 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType38, (com.google.javascript.rhino.jstype.JSType) functionType62);
        com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry25.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType38);
        java.lang.String str92 = jSType91.getDisplayName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = jSType91.getJSDocInfo();
        jSType91.clearResolved();
        boolean boolean95 = jSType91.isNoType();
        boolean boolean96 = charSequenceList16.contains((java.lang.Object) jSType91);
        boolean boolean97 = jSType91.isRecordType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charSequenceSpliterator22);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNull(jSDocInfo93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01718");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasThisType();
        boolean boolean4 = jSDocInfo2.shouldPreserveTry();
        boolean boolean5 = jSDocInfo2.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo2.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean8 = jSDocInfo2.shouldPreserveTry();
        boolean boolean9 = jSDocInfo2.isOverride();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection10 = jSDocInfo2.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo2.getTypedefType();
        java.lang.String str13 = jSDocInfo2.getDescriptionForParameter("function (): {2129138287}");
        node1.setJSDocInfo(jSDocInfo2);
        boolean boolean15 = jSDocInfo2.hasBaseType();
        boolean boolean16 = jSDocInfo2.isDeprecated();
        java.lang.String str17 = jSDocInfo2.getFileOverview();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(markerCollection10);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01719");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        int int7 = node1.getLineno();
        boolean boolean8 = node1.hasChildren();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        node11.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(32, node11);
        boolean boolean16 = node11.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node17 = node1.useSourceInfoIfMissingFromForTree(node11);
        boolean boolean18 = node1.isUnscopedQualifiedName();
        com.google.javascript.rhino.InputId inputId20 = new com.google.javascript.rhino.InputId("NUMBER 0.0 100\n");
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        jSTypeRegistry23.unregisterPropertyOnType("(Not declared as a type name)", jSType25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry23.createFunctionType(jSType27, true, jSTypeArray29);
        boolean boolean32 = functionType30.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        jSTypeRegistry36.unregisterPropertyOnType("(Not declared as a type name)", jSType38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry36.createFunctionType(jSType40, true, jSTypeArray42);
        boolean boolean45 = functionType43.removeProperty("false");
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        node47.putIntProp((-1), 35);
        boolean boolean51 = node47.isStringKey();
        boolean boolean52 = node47.isThrow();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj58 = node56.getProp((int) (byte) 10);
        boolean boolean59 = node47.isEquivalentToTyped(node56);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(0);
        node62.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(32, node62);
        boolean boolean67 = node66.isInstanceOf();
        com.google.javascript.rhino.Node node68 = node56.useSourceInfoFromForTree(node66);
        boolean boolean69 = node66.isDo();
        boolean boolean70 = functionType30.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType43, node66);
        java.lang.String str71 = functionType43.getReferenceName();
        boolean boolean72 = inputId20.equals((java.lang.Object) str71);
        node1.setInputId(inputId20);
        java.lang.String str74 = inputId20.getIdName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo75 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean76 = jSDocInfo75.hasThisType();
        boolean boolean77 = jSDocInfo75.shouldPreserveTry();
        boolean boolean78 = jSDocInfo75.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression79 = jSDocInfo75.getType();
        boolean boolean80 = inputId20.equals((java.lang.Object) jSDocInfo75);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression81 = jSDocInfo75.getBaseType();
        java.lang.String str82 = jSDocInfo75.getOriginalCommentString();
        boolean boolean83 = jSDocInfo75.hasBaseType();
        jSDocInfo75.addSuppression("function (): {581361697}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "NUMBER 0.0 100\n" + "'", str74, "NUMBER 0.0 100\n");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(jSTypeExpression79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(jSTypeExpression81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01720");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFrom(node4);
        boolean boolean12 = node11.isVar();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        boolean boolean15 = node14.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = node14.getStaticSourceFile();
        node14.setLineno((int) '4');
        com.google.javascript.rhino.Node node19 = node11.useSourceInfoIfMissingFrom(node14);
        boolean boolean20 = node14.isFromExterns();
        boolean boolean21 = node14.isOr();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(staticSourceFile16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01721");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        boolean boolean50 = functionType22.isUnknownType();
        boolean boolean51 = functionType22.hasImplementedInterfaces();
        boolean boolean52 = functionType22.isBooleanValueType();
        boolean boolean53 = functionType22.isEnumType();
        com.google.javascript.rhino.Node node55 = functionType22.getPropertyNode("JSDocInfo");
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType22.findPropertyType("function (): {2030130551}");
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType22.collapseUnion();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(jSType57);
        org.junit.Assert.assertNotNull(jSType58);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01722");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(0);
        boolean boolean9 = node8.isCall();
        com.google.javascript.rhino.Node node10 = node8.cloneTree();
        boolean boolean11 = node8.isNull();
        jSDocInfo0.setAssociatedNode(node8);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        jSTypeRegistry28.unregisterPropertyOnType("(Not declared as a type name)", jSType30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry28.createFunctionType(jSType32, true, jSTypeArray34);
        boolean boolean37 = functionType35.removeProperty("false");
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        boolean boolean43 = node39.isStringKey();
        boolean boolean44 = node39.isThrow();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj50 = node48.getProp((int) (byte) 10);
        boolean boolean51 = node39.isEquivalentToTyped(node48);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(0);
        node54.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(32, node54);
        boolean boolean59 = node58.isInstanceOf();
        com.google.javascript.rhino.Node node60 = node48.useSourceInfoFromForTree(node58);
        boolean boolean61 = node58.isDo();
        boolean boolean62 = functionType22.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType35, node58);
        boolean boolean63 = functionType35.isUnknownType();
        java.util.Set<java.lang.String> strSet64 = functionType35.getPropertyNames();
        node8.setJSType((com.google.javascript.rhino.jstype.JSType) functionType35);
        boolean boolean66 = functionType35.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        jSTypeRegistry69.unregisterPropertyOnType("(Not declared as a type name)", jSType71);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry69.createFunctionType(jSType73, true, jSTypeArray75);
        com.google.common.collect.ImmutableList<java.lang.String> strList77 = functionType76.getTemplateTypeNames();
        boolean boolean78 = functionType76.isReturnTypeInferred();
        com.google.javascript.rhino.Node node79 = functionType76.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean81 = jSDocInfo80.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression82 = jSDocInfo80.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility83 = null;
        jSDocInfo80.setVisibility(visibility83);
        boolean boolean85 = jSDocInfo80.isOverride();
        functionType76.setJSDocInfo(jSDocInfo80);
        functionType35.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType76);
        boolean boolean88 = functionType76.isRegexpType();
        boolean boolean89 = functionType76.isNoObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo91 = functionType76.getOwnPropertyJSDocInfo("{proxy:function (): {1577580583}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(jSTypeExpression82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(jSDocInfo91);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01723");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 2, 39, 46);
        com.google.javascript.rhino.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.Node node5 = node3.getParent();
        com.google.javascript.rhino.InputId inputId7 = new com.google.javascript.rhino.InputId("java.io.IOException: java.io.IOException");
        java.lang.String str8 = inputId7.toString();
        // The following exception was thrown during execution in test generation
        try {
            node5.setInputId(inputId7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "InputId: java.io.IOException: java.io.IOException" + "'", str8, "InputId: java.io.IOException: java.io.IOException");
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01724");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean16 = functionType15.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        jSTypeRegistry19.unregisterPropertyOnType("(Not declared as a type name)", jSType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry19.createFunctionType(jSType23, true, jSTypeArray25);
        boolean boolean28 = functionType26.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        boolean boolean47 = node43.isStringKey();
        boolean boolean48 = node43.isThrow();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj54 = node52.getProp((int) (byte) 10);
        boolean boolean55 = node43.isEquivalentToTyped(node52);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(32, node58);
        boolean boolean63 = node62.isInstanceOf();
        com.google.javascript.rhino.Node node64 = node52.useSourceInfoFromForTree(node62);
        boolean boolean65 = node62.isDo();
        boolean boolean66 = functionType26.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType39, node62);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair67 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType15, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType15);
        java.lang.String str69 = functionType15.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        jSTypeRegistry72.unregisterPropertyOnType("(Not declared as a type name)", jSType74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray78 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry72.createFunctionType(jSType76, true, jSTypeArray78);
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType79.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType81 = functionType79.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType82 = functionType79.toMaybeFunctionType();
        boolean boolean83 = functionType15.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType79);
        java.lang.String str84 = functionType15.getNormalizedReferenceName();
        boolean boolean85 = functionType15.isUnionType();
        boolean boolean86 = functionType15.isAllType();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(jSTypeArray78);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNull(enumType81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01725");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        boolean boolean7 = charSequenceList6.isEmpty();
        boolean boolean8 = charSequenceList6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence10 = charSequenceList6.remove(30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01726");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        boolean boolean22 = functionType21.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType9.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType21);
        java.util.Set<java.lang.String> strSet24 = functionType9.getOwnPropertyNames();
        strSet24.clear();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01727");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator4 = charSequenceList2.spliterator();
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream5 = charSequenceList2.stream();
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray11);
        boolean boolean13 = charSequenceList2.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean14 = charSequenceList12.isEmpty();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.jstype.JSType jSType19 = node18.getJSType();
        com.google.javascript.rhino.InputId inputId20 = node18.getInputId();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        jSTypeRegistry23.unregisterPropertyOnType("(Not declared as a type name)", jSType25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry23.createFunctionType(jSType27, true, jSTypeArray29);
        boolean boolean32 = functionType30.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        jSTypeRegistry36.unregisterPropertyOnType("(Not declared as a type name)", jSType38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry36.createFunctionType(jSType40, true, jSTypeArray42);
        boolean boolean45 = functionType43.removeProperty("false");
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        node47.putIntProp((-1), 35);
        boolean boolean51 = node47.isStringKey();
        boolean boolean52 = node47.isThrow();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj58 = node56.getProp((int) (byte) 10);
        boolean boolean59 = node47.isEquivalentToTyped(node56);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(0);
        node62.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(32, node62);
        boolean boolean67 = node66.isInstanceOf();
        com.google.javascript.rhino.Node node68 = node56.useSourceInfoFromForTree(node66);
        boolean boolean69 = node66.isDo();
        boolean boolean70 = functionType30.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType43, node66);
        node18.addChildToBack(node66);
        boolean boolean72 = charSequenceList12.equals((java.lang.Object) node18);
        java.lang.String str73 = node18.toString();
        java.lang.String str77 = node18.toString(true, false, false);
        boolean boolean78 = node18.isThis();
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator4);
        org.junit.Assert.assertNotNull(charSequenceStream5);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "NUMBER -1.0 32" + "'", str73, "NUMBER -1.0 32");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "NUMBER -1.0 32" + "'", str77, "NUMBER -1.0 32");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01728");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        java.lang.String str50 = functionType22.getReferenceName();
        boolean boolean51 = functionType22.isUnionType();
        boolean boolean52 = functionType22.isEnumType();
        boolean boolean53 = functionType22.isNullable();
        boolean boolean54 = functionType22.isRecordType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01729");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = new com.google.javascript.rhino.JSTypeExpression(node3, "NUMBER 0.0 100\n");
        com.google.javascript.rhino.Node node7 = node3.getAncestor(54);
        com.google.javascript.rhino.jstype.JSType jSType8 = node3.getJSType();
        boolean boolean9 = node3.isWith();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01730");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        boolean boolean52 = parameterizedType48.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType53 = parameterizedType48.restrictByNotNullOrUndefined();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "{proxy:function (): {587447735}}" + "'", str51, "{proxy:function (): {587447735}}");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSType53);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01731");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType12.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType12.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType12);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean20 = jSDocInfo19.hasThisType();
        boolean boolean21 = jSDocInfo19.shouldPreserveTry();
        boolean boolean22 = jSDocInfo19.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo19.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean25 = jSDocInfo19.shouldPreserveTry();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        boolean boolean28 = node27.isCall();
        com.google.javascript.rhino.Node node29 = node27.cloneTree();
        boolean boolean30 = node27.isNull();
        jSDocInfo19.setAssociatedNode(node27);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        jSTypeRegistry34.unregisterPropertyOnType("(Not declared as a type name)", jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry34.createFunctionType(jSType38, true, jSTypeArray40);
        boolean boolean43 = functionType41.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        boolean boolean56 = functionType54.removeProperty("false");
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        boolean boolean62 = node58.isStringKey();
        boolean boolean63 = node58.isThrow();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj69 = node67.getProp((int) (byte) 10);
        boolean boolean70 = node58.isEquivalentToTyped(node67);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(0);
        node73.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(32, node73);
        boolean boolean78 = node77.isInstanceOf();
        com.google.javascript.rhino.Node node79 = node67.useSourceInfoFromForTree(node77);
        boolean boolean80 = node77.isDo();
        boolean boolean81 = functionType41.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType54, node77);
        boolean boolean82 = functionType54.isUnknownType();
        java.util.Set<java.lang.String> strSet83 = functionType54.getPropertyNames();
        node27.setJSType((com.google.javascript.rhino.jstype.JSType) functionType54);
        jSTypeRegistry2.unregisterPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) functionType54);
        int int86 = functionType54.getPropertiesCount();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot88 = functionType54.getSlot("function (): {405212503}");
        boolean boolean89 = functionType54.hasReferenceName();
        boolean boolean90 = functionType54.isEmptyType();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01732");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        boolean boolean6 = node2.isStringKey();
        boolean boolean7 = node2.isThrow();
        int int8 = node2.getLineno();
        boolean boolean9 = node2.hasChildren();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        node11.putIntProp((-1), 35);
        boolean boolean15 = node2.hasChild(node11);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        boolean boolean18 = node17.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node17.getStaticSourceFile();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0, node11, node17, node23);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node17.siblings();
        int int26 = node17.getLength();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01733");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoFrom(node6);
        boolean boolean13 = node12.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        jSTypeRegistry16.unregisterPropertyOnType("(Not declared as a type name)", jSType18);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        boolean boolean31 = functionType29.removeProperty("false");
        boolean boolean32 = functionType29.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType29);
        com.google.javascript.rhino.jstype.JSType jSType34 = assertionFunctionSpec2.getAssertedType(node12, jSTypeRegistry16);
        jSTypeRegistry16.identifyNonNullableName("java.io.IOException");
        jSTypeRegistry16.setLastGeneration(true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable40 = jSTypeRegistry16.getEachReferenceTypeWithProperty("function (): {1345118779}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertNotNull(objectTypeIterable40);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01734");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        boolean boolean54 = parameterizedType48.canBeCalled();
        boolean boolean56 = parameterizedType48.isPropertyTypeDeclared("function (): {367372378}");
        com.google.javascript.rhino.jstype.JSType jSType58 = parameterizedType48.getPropertyType("true");
        boolean boolean59 = parameterizedType48.hasReferenceName();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01735");
        java.io.IOException iOException0 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException2);
        iOException0.addSuppressed((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException0);
        java.lang.Throwable[] throwableArray6 = iOException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01736");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType objectType51 = parameterizedType48.getTypeOfThis();
        boolean boolean53 = parameterizedType48.removeProperty("function (): {646790426}");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.common.collect.ImmutableList<java.lang.String> strList64 = functionType63.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot66 = functionType63.getSlot("NUMBER 0.0 100\n");
        boolean boolean67 = functionType63.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean79 = functionType77.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType77.findPropertyType("Not declared as a type name");
        boolean boolean82 = functionType63.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope84 = null;
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType77.resolve(errorReporter83, jSTypeStaticScope84);
        boolean boolean86 = functionType77.isNullable();
        boolean boolean87 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.jstype.FunctionType functionType88 = parameterizedType48.toMaybeFunctionType();
        boolean boolean89 = parameterizedType48.isAllType();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertNull(staticSlot66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jSTypeArray76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(jSType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01737");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        boolean boolean21 = jSTypeRegistry2.hasNamespace("hi!");
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray23 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType24 = jSTypeRegistry2.createUnionType(jSTypeNativeArray23);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        jSTypeRegistry28.unregisterPropertyOnType("(Not declared as a type name)", jSType30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry28.createFunctionType(jSType32, true, jSTypeArray34);
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = functionType35.getTemplateTypeNames();
        boolean boolean37 = functionType35.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType35);
        boolean boolean39 = functionType35.isNativeObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType40 = functionType35.toMaybeEnumElementType();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeNativeArray23);
        org.junit.Assert.assertNotNull(jSType24);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(enumElementType40);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01738");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getName();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition4 = marker0.getNameNode();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition5 = marker0.getNameNode();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(nodeSourcePosition4);
        org.junit.Assert.assertNull(nodeSourcePosition5);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01739");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        boolean boolean22 = functionType21.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType9.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType21);
        com.google.javascript.rhino.Node node24 = functionType21.getRootNode();
        com.google.javascript.rhino.Node node25 = functionType21.getParametersNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node26 = node25.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01740");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 43);
        node3.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node6 = node3.cloneTree();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(0);
        boolean boolean9 = node8.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = node8.getStaticSourceFile();
        com.google.javascript.rhino.Node node11 = node8.getNext();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0);
        node13.putIntProp((-1), 35);
        boolean boolean17 = node13.isStringKey();
        boolean boolean18 = node13.isThrow();
        boolean boolean19 = node13.isEmpty();
        com.google.javascript.rhino.Node node20 = node8.copyInformationFrom(node13);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0);
        node24.putIntProp((-1), 35);
        boolean boolean28 = node24.isStringKey();
        boolean boolean29 = node24.isThrow();
        com.google.javascript.rhino.Node node30 = node22.useSourceInfoFrom(node24);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        boolean boolean33 = node32.isCall();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        node36.putIntProp((-1), 35);
        boolean boolean40 = node36.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList41 = com.google.common.collect.ImmutableList.of((java.lang.Object) node8, (java.lang.Object) node24, (java.lang.Object) node32, (java.lang.Object) 53, (java.lang.Object) node36);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        boolean boolean44 = node43.isInstanceOf();
        node36.addChildrenToFront(node43);
        node36.putIntProp((int) '4', 35);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(30, node1, node6, node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(staticSourceFile10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objList41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01741");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        boolean boolean5 = node4.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node4.getStaticSourceFile();
        com.google.javascript.rhino.Node node7 = node4.getNext();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        boolean boolean15 = node9.isEmpty();
        com.google.javascript.rhino.Node node16 = node4.copyInformationFrom(node9);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        boolean boolean24 = node20.isStringKey();
        boolean boolean25 = node20.isThrow();
        com.google.javascript.rhino.Node node26 = node18.useSourceInfoFrom(node20);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isCall();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = com.google.common.collect.ImmutableList.of((java.lang.Object) node4, (java.lang.Object) node20, (java.lang.Object) node28, (java.lang.Object) 53, (java.lang.Object) node32);
        java.util.Set<java.lang.String> strSet38 = node4.getDirectives();
        com.google.javascript.rhino.Node node39 = assertionFunctionSpec2.getAssertedParam(node4);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        boolean boolean42 = node41.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile43 = node41.getStaticSourceFile();
        com.google.javascript.rhino.Node node44 = node41.getNext();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(0);
        node46.putIntProp((-1), 35);
        boolean boolean50 = node46.isStringKey();
        boolean boolean51 = node46.isThrow();
        boolean boolean52 = node46.isEmpty();
        com.google.javascript.rhino.Node node53 = node41.copyInformationFrom(node46);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(0);
        node55.putIntProp((-1), 35);
        boolean boolean59 = node55.isReturn();
        com.google.javascript.rhino.Node node60 = node53.srcref(node55);
        node55.removeProp(0);
        com.google.javascript.rhino.Node node64 = node55.getAncestor(41);
        com.google.javascript.rhino.Node node65 = assertionFunctionSpec2.getAssertedParam(node64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNull(strSet38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(staticSourceFile43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node65);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01742");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(32, node2);
        java.lang.String str7 = node2.getQualifiedName();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("true");
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0);
        node13.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 100, node13, 49, (int) (byte) 1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        node21.putIntProp((-1), 35);
        boolean boolean25 = node21.isStringKey();
        boolean boolean26 = node21.isThrow();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj32 = node30.getProp((int) (byte) 10);
        boolean boolean33 = node21.isEquivalentToTyped(node30);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        node36.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(32, node36);
        boolean boolean41 = node40.isInstanceOf();
        com.google.javascript.rhino.Node node42 = node30.useSourceInfoFromForTree(node40);
        boolean boolean43 = node42.isStringKey();
        com.google.javascript.rhino.Node node44 = node19.useSourceInfoIfMissingFrom(node42);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(54, node10, node42);
        com.google.javascript.rhino.Node node46 = node2.useSourceInfoIfMissingFrom(node45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = node2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01743");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList24 = charSequenceList6.asList();
        java.lang.Object[] objArray25 = charSequenceList24.toArray();
        boolean boolean26 = charSequenceList24.isEmpty();
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor27 = charSequenceList24.listIterator();
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor28 = charSequenceList24.listIterator();
        java.lang.Object[] objArray29 = charSequenceList24.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        jSTypeRegistry45.unregisterPropertyOnType("(Not declared as a type name)", jSType47);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry45.createFunctionType(jSType49, true, jSTypeArray51);
        boolean boolean54 = functionType52.removeProperty("false");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0);
        node56.putIntProp((-1), 35);
        boolean boolean60 = node56.isStringKey();
        boolean boolean61 = node56.isThrow();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj67 = node65.getProp((int) (byte) 10);
        boolean boolean68 = node56.isEquivalentToTyped(node65);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(0);
        node71.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(32, node71);
        boolean boolean76 = node75.isInstanceOf();
        com.google.javascript.rhino.Node node77 = node65.useSourceInfoFromForTree(node75);
        boolean boolean78 = node75.isDo();
        boolean boolean79 = functionType39.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType52, node75);
        boolean boolean80 = functionType52.isUnknownType();
        boolean boolean81 = functionType52.isInterface();
        boolean boolean82 = functionType52.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType83 = functionType52.getConstructor();
        int int84 = functionType52.getPropertiesCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = charSequenceList24.remove((java.lang.Object) int84);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charSequenceList24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charSequenceItor27);
        org.junit.Assert.assertNotNull(charSequenceItor28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(functionType83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01744");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType11 = functionType9.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = functionType9.toMaybeFunctionType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList13 = functionType12.getSubTypes();
        boolean boolean14 = functionType12.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getPropertyType("");
        boolean boolean17 = functionType12.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        jSTypeRegistry21.unregisterPropertyOnType("(Not declared as a type name)", jSType23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry21.createFunctionType(jSType25, true, jSTypeArray27);
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType28.unboxesTo();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = functionType28.getParameters();
        java.lang.String str31 = functionType28.getReferenceName();
        boolean boolean32 = functionType28.isObject();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        node34.putIntProp((-1), 35);
        boolean boolean38 = node34.isStringKey();
        boolean boolean39 = node34.isThrow();
        int int40 = node34.getLineno();
        boolean boolean41 = node34.hasChildren();
        boolean boolean42 = node34.isArrayLit();
        boolean boolean43 = functionType12.defineInferredProperty("function (): {1614074355}", (com.google.javascript.rhino.jstype.JSType) functionType28, node34);
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType12.getReturnType();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags46 = new com.google.javascript.rhino.Node.SideEffectFlags(12);
        int int47 = sideEffectFlags46.valueOf();
        boolean boolean48 = functionType12.equals((java.lang.Object) sideEffectFlags46);
        com.google.javascript.rhino.Node node50 = functionType12.getPropertyNode("{proxy:function (): {2128767812}}");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNull(enumType11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(functionTypeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 12 + "'", int47 == 12);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node50);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01745");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        int int7 = node1.getLineno();
        boolean boolean8 = node1.hasChildren();
        java.lang.String str9 = node1.getQualifiedName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01746");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        boolean boolean22 = functionType21.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType9.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType21);
        boolean boolean24 = functionType21.isAllType();
        boolean boolean25 = functionType21.hasCachedValues();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01747");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        com.google.javascript.rhino.Node node10 = node2.useSourceInfoFrom(node4);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        node4.setJSType(jSType11);
        node4.detachChildren();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj19 = node17.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        boolean boolean27 = node23.isStringKey();
        boolean boolean28 = node23.isThrow();
        com.google.javascript.rhino.Node node29 = node21.useSourceInfoFrom(node23);
        boolean boolean30 = node29.isIn();
        com.google.javascript.rhino.Node node31 = node17.clonePropsFrom(node29);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        boolean boolean34 = node33.isInstanceOf();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        node36.putIntProp((-1), 35);
        boolean boolean40 = node36.isStringKey();
        boolean boolean41 = node36.isThrow();
        boolean boolean42 = node36.isEmpty();
        com.google.javascript.rhino.Node node43 = node33.useSourceInfoFrom(node36);
        boolean boolean44 = node36.isNE();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(31, node4, node17, node36);
        com.google.javascript.rhino.Node node47 = node36.getAncestor(0);
        com.google.javascript.rhino.Node node48 = node36.getLastSibling();
        // The following exception was thrown during execution in test generation
        try {
            node36.setSideEffectFlags((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01748");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj12 = node10.getProp((int) (byte) 10);
        boolean boolean13 = node1.isEquivalentToTyped(node10);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0);
        node16.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(32, node16);
        boolean boolean21 = node20.isInstanceOf();
        com.google.javascript.rhino.Node node22 = node10.useSourceInfoFromForTree(node20);
        boolean boolean23 = node20.isDo();
        boolean boolean24 = node20.isIn();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = node20.getExistingIntProp(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01749");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        boolean boolean50 = functionType22.isUnknownType();
        boolean boolean51 = functionType22.isInterface();
        boolean boolean52 = functionType22.hasImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = functionType22.getParameters();
        boolean boolean54 = functionType22.isConstructor();
        functionType22.clearCachedValues();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01750");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType12.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType12.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType12);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry2.createAnonymousObjectType();
        boolean boolean18 = objectType17.isNoResolvedType();
        boolean boolean20 = objectType17.isPropertyTypeDeclared("function (): {1137157813}");
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType33.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType35 = functionType33.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = functionType33.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType37 = jSTypeRegistry23.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry23.createAnonymousObjectType();
        boolean boolean39 = objectType38.isNoResolvedType();
        boolean boolean41 = objectType38.isPropertyTypeDeclared("function (): {1137157813}");
        boolean boolean42 = objectType38.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair43 = objectType17.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) objectType38);
        boolean boolean44 = objectType38.isNativeObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNull(enumType35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typePair43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01751");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList24 = charSequenceList6.asList();
        java.lang.Object[] objArray25 = charSequenceList24.toArray();
        java.lang.Object[] objArray26 = charSequenceList24.toArray();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList27 = charSequenceList24.asList();
        java.lang.Throwable throwable28 = null;
        java.io.IOException iOException29 = new java.io.IOException(throwable28);
        boolean boolean30 = charSequenceList27.equals((java.lang.Object) throwable28);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList38 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray40 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList41 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41, charSequenceArray40);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator43 = charSequenceList41.spliterator();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(0);
        node46.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(32, node46);
        boolean boolean51 = node50.isGetterDef();
        boolean boolean52 = charSequenceList41.equals((java.lang.Object) boolean51);
        boolean boolean54 = charSequenceList41.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean55 = charSequenceList38.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList41);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        node57.putIntProp((-1), 35);
        boolean boolean61 = node57.isStringKey();
        boolean boolean62 = node57.isThrow();
        int int63 = charSequenceList38.indexOf((java.lang.Object) node57);
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream64 = charSequenceList38.parallelStream();
        boolean boolean65 = charSequenceList38.isEmpty();
        java.lang.Object[] objArray66 = charSequenceList38.toArray();
        java.lang.Object[] objArray67 = charSequenceList38.toArray();
        boolean boolean68 = charSequenceList38.isEmpty();
        java.util.ListIterator<java.lang.CharSequence> charSequenceItor69 = charSequenceList38.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = charSequenceList27.addAll((int) (short) 10, (java.util.Collection<java.lang.CharSequence>) charSequenceList38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charSequenceList24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceList27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertNotNull(charSequenceList38);
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator43);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(charSequenceStream64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(charSequenceItor69);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01752");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.isNoSideEffects();
        boolean boolean9 = jSDocInfo0.isExpose();
        java.lang.String str10 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01753");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.Node node13 = functionType9.getSource();
        boolean boolean14 = functionType9.isEmptyType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = functionType9.getAllExtendedInterfaces();
        com.google.javascript.rhino.Node node17 = functionType9.getPropertyNode("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = functionType9.getPrototype();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(objectType18);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01754");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator4 = charSequenceList2.spliterator();
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream5 = charSequenceList2.stream();
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray11);
        boolean boolean13 = charSequenceList2.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean14 = charSequenceList12.isEmpty();
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList22 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray21);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList25 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25, charSequenceArray24);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator27 = charSequenceList25.spliterator();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0);
        node30.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(32, node30);
        boolean boolean35 = node34.isGetterDef();
        boolean boolean36 = charSequenceList25.equals((java.lang.Object) boolean35);
        boolean boolean38 = charSequenceList25.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean39 = charSequenceList22.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList25);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList40 = charSequenceList22.asList();
        java.lang.Object[] objArray41 = charSequenceList40.toArray();
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList48 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray47);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList51 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51, charSequenceArray50);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator53 = charSequenceList51.spliterator();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0);
        node56.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(32, node56);
        boolean boolean61 = node60.isGetterDef();
        boolean boolean62 = charSequenceList51.equals((java.lang.Object) boolean61);
        boolean boolean64 = charSequenceList51.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean65 = charSequenceList48.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList51);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList66 = charSequenceList48.reverse();
        boolean boolean67 = charSequenceList40.contains((java.lang.Object) charSequenceList66);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = charSequenceList12.addAll(10, (java.util.Collection<java.lang.CharSequence>) charSequenceList40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator4);
        org.junit.Assert.assertNotNull(charSequenceStream5);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceList22);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(charSequenceList40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertNotNull(charSequenceList48);
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(charSequenceList66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01755");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        jSTypeRegistry13.unregisterPropertyOnType("(Not declared as a type name)", jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry13.createFunctionType(jSType17, true, jSTypeArray19);
        boolean boolean22 = functionType20.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        boolean boolean35 = functionType33.removeProperty("false");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node37.isStringKey();
        boolean boolean42 = node37.isThrow();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj48 = node46.getProp((int) (byte) 10);
        boolean boolean49 = node37.isEquivalentToTyped(node46);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, node52);
        boolean boolean57 = node56.isInstanceOf();
        com.google.javascript.rhino.Node node58 = node46.useSourceInfoFromForTree(node56);
        boolean boolean59 = node56.isDo();
        boolean boolean60 = functionType20.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType33, node56);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair61 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        jSTypeRegistry65.unregisterPropertyOnType("(Not declared as a type name)", jSType67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry65.createFunctionType(jSType69, true, jSTypeArray71);
        boolean boolean74 = functionType72.removeProperty("false");
        boolean boolean75 = functionType72.isNativeObjectType();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(0);
        node78.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (short) 100, node78, 49, (int) (byte) 1);
        boolean boolean85 = functionType33.defineDeclaredProperty("", (com.google.javascript.rhino.jstype.JSType) functionType72, node78);
        com.google.javascript.rhino.ErrorReporter errorReporter86 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry88 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter86, true);
        com.google.javascript.rhino.jstype.JSType jSType90 = null;
        jSTypeRegistry88.unregisterPropertyOnType("(Not declared as a type name)", jSType90);
        com.google.javascript.rhino.jstype.JSType jSType92 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray94 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType95 = jSTypeRegistry88.createFunctionType(jSType92, true, jSTypeArray94);
        com.google.javascript.rhino.jstype.JSType jSType96 = functionType95.unboxesTo();
        functionType72.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType95);
        boolean boolean98 = functionType72.isInstanceType();
        boolean boolean99 = functionType72.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(jSTypeArray94);
        org.junit.Assert.assertNotNull(functionType95);
        org.junit.Assert.assertNull(jSType96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01756");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList9 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9, charSequenceArray8);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator11 = charSequenceList9.spliterator();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, node14);
        boolean boolean19 = node18.isGetterDef();
        boolean boolean20 = charSequenceList9.equals((java.lang.Object) boolean19);
        boolean boolean22 = charSequenceList9.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean23 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList9);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        int int32 = node26.getLineno();
        boolean boolean33 = node26.hasChildren();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        node35.putIntProp((-1), 35);
        boolean boolean39 = node26.hasChild(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        boolean boolean42 = node41.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile43 = node41.getStaticSourceFile();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(0, node35, node41, node47);
        boolean boolean49 = charSequenceList6.contains((java.lang.Object) node41);
        int int50 = charSequenceList6.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor51 = charSequenceList6.listIterator();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        jSTypeRegistry54.unregisterPropertyOnType("(Not declared as a type name)", jSType56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry54.createFunctionType(jSType58, true, jSTypeArray60);
        com.google.javascript.rhino.jstype.JSType jSType62 = functionType61.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = functionType61.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, true);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        jSTypeRegistry67.unregisterPropertyOnType("(Not declared as a type name)", jSType69);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        jSTypeRegistry73.unregisterPropertyOnType("(Not declared as a type name)", jSType75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry73.createFunctionType(jSType77, true, jSTypeArray79);
        boolean boolean82 = functionType80.removeProperty("false");
        boolean boolean83 = functionType80.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType84 = jSTypeRegistry67.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType80);
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType61.forceResolve(errorReporter64, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType80);
        boolean boolean86 = functionType61.isCheckedUnknownType();
        boolean boolean87 = functionType61.isTemplateType();
        boolean boolean88 = functionType61.hasAnyTemplateInternal();
        boolean boolean89 = charSequenceList6.equals((java.lang.Object) functionType61);
        java.util.function.UnaryOperator<java.lang.CharSequence> charSequenceUnaryOperator90 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList6.replaceAll(charSequenceUnaryOperator90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(staticSourceFile43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertNotNull(charSequenceItor51);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01757");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.hasDisplayName();
        boolean boolean13 = functionType9.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType9.getPropertyType("java.io.IOException");
        com.google.javascript.rhino.jstype.FunctionType functionType16 = functionType9.getOwnerFunction();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSType15);
        org.junit.Assert.assertNull(functionType16);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01758");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str3 = jSDocInfo0.getDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.hasThisType();
        boolean boolean6 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility11 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList13 = com.google.common.collect.ImmutableList.of(visibility7, visibility8, visibility9, visibility10, visibility11, visibility12);
        jSDocInfo0.setVisibility(visibility7);
        jSDocInfo0.addSuppression("function (): {726684091}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + visibility7 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility7.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility8 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility8.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility9 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility9.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility10 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility10.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility11 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility11.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility12 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility12.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertNotNull(visibilityList13);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01759");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType12.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType12.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType12);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        jSTypeRegistry19.unregisterPropertyOnType("(Not declared as a type name)", jSType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry19.createFunctionType(jSType23, true, jSTypeArray25);
        boolean boolean28 = functionType26.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        boolean boolean47 = node43.isStringKey();
        boolean boolean48 = node43.isThrow();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj54 = node52.getProp((int) (byte) 10);
        boolean boolean55 = node43.isEquivalentToTyped(node52);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(32, node58);
        boolean boolean63 = node62.isInstanceOf();
        com.google.javascript.rhino.Node node64 = node52.useSourceInfoFromForTree(node62);
        boolean boolean65 = node62.isDo();
        boolean boolean66 = functionType26.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType39, node62);
        boolean boolean67 = functionType39.isUnknownType();
        java.util.Set<java.lang.String> strSet68 = functionType39.getPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType39, "Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        jSTypeRegistry73.unregisterPropertyOnType("(Not declared as a type name)", jSType75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry73.createFunctionType(jSType77, true, jSTypeArray79);
        boolean boolean82 = functionType80.removeProperty("false");
        com.google.javascript.rhino.jstype.ObjectType objectType83 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType80);
        boolean boolean84 = objectType83.isNoType();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objectType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01760");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node4 = node1.getNext();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        boolean boolean12 = node6.isEmpty();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFrom(node6);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoFrom(node17);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        boolean boolean26 = node25.isCall();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList34 = com.google.common.collect.ImmutableList.of((java.lang.Object) node1, (java.lang.Object) node17, (java.lang.Object) node25, (java.lang.Object) 53, (java.lang.Object) node29);
        boolean boolean35 = node17.isOr();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01761");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        java.lang.String str11 = functionType9.getNormalizedReferenceName();
        boolean boolean13 = functionType9.isPropertyTypeInferred("Not declared as a type name");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType14 = functionType9.toMaybeParameterizedType();
        boolean boolean15 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = functionType9.toObjectType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionType9.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(parameterizedType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectType16);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01762");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node4 = node1.getNext();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        boolean boolean12 = node6.isEmpty();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFrom(node6);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoFrom(node17);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        boolean boolean26 = node25.isCall();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList34 = com.google.common.collect.ImmutableList.of((java.lang.Object) node1, (java.lang.Object) node17, (java.lang.Object) node25, (java.lang.Object) 53, (java.lang.Object) node29);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile35 = node29.getStaticSourceFile();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        boolean boolean38 = node37.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile39 = node37.getStaticSourceFile();
        java.lang.String str40 = node37.getSourceFileName();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0);
        boolean boolean43 = node42.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile44 = node42.getStaticSourceFile();
        com.google.javascript.rhino.Node node45 = node42.getNext();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        node47.putIntProp((-1), 35);
        boolean boolean51 = node47.isStringKey();
        boolean boolean52 = node47.isThrow();
        boolean boolean53 = node47.isEmpty();
        com.google.javascript.rhino.Node node54 = node42.copyInformationFrom(node47);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        boolean boolean62 = node58.isStringKey();
        boolean boolean63 = node58.isThrow();
        com.google.javascript.rhino.Node node64 = node56.useSourceInfoFrom(node58);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(0);
        boolean boolean67 = node66.isCall();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(0);
        node70.putIntProp((-1), 35);
        boolean boolean74 = node70.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList75 = com.google.common.collect.ImmutableList.of((java.lang.Object) node42, (java.lang.Object) node58, (java.lang.Object) node66, (java.lang.Object) 53, (java.lang.Object) node70);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(0);
        boolean boolean78 = node77.isInstanceOf();
        node70.addChildrenToFront(node77);
        int int80 = node70.getSourceOffset();
        boolean boolean81 = node70.isVoid();
        com.google.javascript.rhino.Node node82 = node37.useSourceInfoIfMissingFrom(node70);
        boolean boolean83 = node70.isOr();
        com.google.javascript.rhino.Node node84 = node29.srcref(node70);
        boolean boolean85 = node29.isAnd();
        node29.removeProp(25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objList34);
        org.junit.Assert.assertNull(staticSourceFile35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(staticSourceFile39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(staticSourceFile44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objList75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01763");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoFrom(node6);
        boolean boolean13 = node12.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        jSTypeRegistry16.unregisterPropertyOnType("(Not declared as a type name)", jSType18);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        boolean boolean31 = functionType29.removeProperty("false");
        boolean boolean32 = functionType29.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType29);
        com.google.javascript.rhino.jstype.JSType jSType34 = assertionFunctionSpec2.getAssertedType(node12, jSTypeRegistry16);
        jSTypeRegistry16.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node38 = jSTypeRegistry16.createOptionalParameters(jSTypeArray37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        jSTypeRegistry41.unregisterPropertyOnType("(Not declared as a type name)", jSType43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry41.createFunctionType(jSType45, true, jSTypeArray47);
        com.google.common.collect.ImmutableList<java.lang.String> strList49 = functionType48.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot51 = functionType48.getSlot("NUMBER 0.0 100\n");
        boolean boolean52 = functionType48.isAllType();
        java.lang.Iterable iterable53 = functionType48.getCtorImplementedInterfaces();
        boolean boolean54 = functionType48.isVoidType();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry16.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType48, "true");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative57 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry16.getNativeFunctionType(jSTypeNative57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNull(staticSlot51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType56);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01764");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        boolean boolean7 = node1.isEmpty();
        boolean boolean8 = node1.isHook();
        boolean boolean9 = node1.isInc();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        node12.putIntProp((-1), 35);
        boolean boolean16 = node12.isReturn();
        boolean boolean17 = node12.isArrayLit();
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildrenAfter(node10, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01765");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(41);
        boolean boolean2 = node1.hasOneChild();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(41);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder11 = node6.getJsDocBuilderForNode();
        boolean boolean12 = node6.isTypeOf();
        com.google.javascript.rhino.Node node13 = node6.removeChildren();
        boolean boolean14 = node6.isGetElem();
        com.google.javascript.rhino.Node node15 = node4.copyInformationFrom(node6);
        boolean boolean16 = node4.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node17 = node1.useSourceInfoFromForTree(node4);
        boolean boolean18 = node4.hasMoreThanOneChild();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01766");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        boolean boolean5 = node4.isTypeOf();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(31, node4);
        com.google.javascript.rhino.Node node7 = node6.removeChildren();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj20 = node18.getProp((int) (byte) 10);
        boolean boolean21 = node9.isEquivalentToTyped(node18);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0);
        node24.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(32, node24);
        boolean boolean29 = node28.isInstanceOf();
        com.google.javascript.rhino.Node node30 = node18.useSourceInfoFromForTree(node28);
        boolean boolean31 = node18.isExprResult();
        boolean boolean32 = node18.isIn();
        com.google.javascript.rhino.Node node33 = node6.clonePropsFrom(node18);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        boolean boolean36 = node35.isInstanceOf();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(0);
        node38.putIntProp((-1), 35);
        boolean boolean42 = node38.isStringKey();
        boolean boolean43 = node38.isThrow();
        boolean boolean44 = node38.isEmpty();
        com.google.javascript.rhino.Node node45 = node35.useSourceInfoFrom(node38);
        boolean boolean46 = node45.isVar();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(0);
        boolean boolean49 = node48.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = node48.getStaticSourceFile();
        node48.setLineno((int) '4');
        com.google.javascript.rhino.Node node53 = node45.useSourceInfoIfMissingFrom(node48);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        node57.putIntProp((-1), 35);
        boolean boolean61 = node57.isStringKey();
        boolean boolean62 = node57.isThrow();
        com.google.javascript.rhino.Node node63 = node55.useSourceInfoFrom(node57);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(0);
        boolean boolean67 = node66.isCall();
        com.google.javascript.rhino.Node node68 = node66.cloneTree();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(35, node68, node71);
        com.google.javascript.rhino.Node node73 = node55.copyInformationFrom(node68);
        com.google.javascript.rhino.Node node74 = node53.useSourceInfoIfMissingFrom(node73);
        java.lang.String str75 = node53.getSourceFileName();
        node53.setWasEmptyNode(true);
        node33.addChildrenToBack(node53);
        boolean boolean79 = node53.isEmpty();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(staticSourceFile50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01767");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = parameterizedType48.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = parameterizedType48.getSlot("(Not declared as a type name)");
        boolean boolean53 = parameterizedType48.isNoObjectType();
        java.lang.Iterable iterable54 = parameterizedType48.getCtorImplementedInterfaces();
        java.lang.String str55 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.getPropertyType("function ");
        com.google.javascript.rhino.jstype.TemplateType templateType58 = parameterizedType48.toMaybeTemplateType();
        java.util.Set<java.lang.String> strSet59 = parameterizedType48.getOwnPropertyNames();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNull(property52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterable54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "{proxy:function (): {1873715343}}" + "'", str55, "{proxy:function (): {1873715343}}");
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertNull(templateType58);
        org.junit.Assert.assertNotNull(strSet59);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01768");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        boolean boolean7 = charSequenceList6.isEmpty();
        com.google.javascript.rhino.JSDocInfo.Marker marker8 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition9 = marker8.getDescription();
        int int10 = charSequenceList6.indexOf((java.lang.Object) stringPosition9);
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList6.add(48, (java.lang.CharSequence) "(function (): {367372378})");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(stringPosition9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01769");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        java.lang.String str11 = functionType9.toString();
        java.lang.Iterable iterable12 = functionType9.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType9.getPropertyType("NUMBER 0.0");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = functionType9.dereference();
        boolean boolean16 = functionType9.matchesObjectContext();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "function (): ?" + "'", str11, "function (): ?");
        org.junit.Assert.assertNotNull(iterable12);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01770");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        jSTypeRegistry7.unregisterPropertyOnType("(Not declared as a type name)", jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry7.createFunctionType(jSType11, true, jSTypeArray13);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative16 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec17 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative16);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        node21.putIntProp((-1), 35);
        boolean boolean25 = node21.isStringKey();
        boolean boolean26 = node21.isThrow();
        com.google.javascript.rhino.Node node27 = node19.useSourceInfoFrom(node21);
        boolean boolean28 = node27.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        jSTypeRegistry31.unregisterPropertyOnType("(Not declared as a type name)", jSType33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        boolean boolean46 = functionType44.removeProperty("false");
        boolean boolean47 = functionType44.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry31.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType44);
        com.google.javascript.rhino.jstype.JSType jSType49 = assertionFunctionSpec17.getAssertedType(node27, jSTypeRegistry31);
        jSTypeRegistry31.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry31.createOptionalParameters(jSTypeArray52);
        com.google.javascript.rhino.Node node54 = jSTypeRegistry7.createOptionalParameters(jSTypeArray52);
        com.google.javascript.rhino.Node node55 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray52);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        jSTypeRegistry58.unregisterPropertyOnType("(Not declared as a type name)", jSType60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        jSTypeRegistry64.unregisterPropertyOnType("(Not declared as a type name)", jSType66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType(jSType68, true, jSTypeArray70);
        boolean boolean73 = functionType71.removeProperty("false");
        boolean boolean74 = functionType71.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry58.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean77 = jSTypeRegistry58.hasNamespace("hi!");
        jSTypeRegistry58.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray79 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry58.createUnionType(jSTypeNativeArray79);
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry2.createUnionType(jSTypeNativeArray79);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable83 = jSTypeRegistry2.getTypesWithProperty("function (): {1341612873}");
        jSTypeRegistry2.incrementGeneration();
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertNull(jSType49);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(jSTypeArray70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSTypeNativeArray79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(jSTypeIterable83);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01771");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean16 = functionType15.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        jSTypeRegistry19.unregisterPropertyOnType("(Not declared as a type name)", jSType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry19.createFunctionType(jSType23, true, jSTypeArray25);
        boolean boolean28 = functionType26.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        boolean boolean47 = node43.isStringKey();
        boolean boolean48 = node43.isThrow();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj54 = node52.getProp((int) (byte) 10);
        boolean boolean55 = node43.isEquivalentToTyped(node52);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(32, node58);
        boolean boolean63 = node62.isInstanceOf();
        com.google.javascript.rhino.Node node64 = node52.useSourceInfoFromForTree(node62);
        boolean boolean65 = node62.isDo();
        boolean boolean66 = functionType26.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType39, node62);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair67 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType15, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType15);
        boolean boolean70 = jSTypeRegistry2.hasNamespace("Not declared as a type name");
        jSTypeRegistry2.clearTemplateTypeNames();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01772");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType12.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType12.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType12);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean20 = jSDocInfo19.hasThisType();
        boolean boolean21 = jSDocInfo19.shouldPreserveTry();
        boolean boolean22 = jSDocInfo19.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo19.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean25 = jSDocInfo19.shouldPreserveTry();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        boolean boolean28 = node27.isCall();
        com.google.javascript.rhino.Node node29 = node27.cloneTree();
        boolean boolean30 = node27.isNull();
        jSDocInfo19.setAssociatedNode(node27);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        jSTypeRegistry34.unregisterPropertyOnType("(Not declared as a type name)", jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry34.createFunctionType(jSType38, true, jSTypeArray40);
        boolean boolean43 = functionType41.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        boolean boolean56 = functionType54.removeProperty("false");
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        boolean boolean62 = node58.isStringKey();
        boolean boolean63 = node58.isThrow();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj69 = node67.getProp((int) (byte) 10);
        boolean boolean70 = node58.isEquivalentToTyped(node67);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(0);
        node73.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(32, node73);
        boolean boolean78 = node77.isInstanceOf();
        com.google.javascript.rhino.Node node79 = node67.useSourceInfoFromForTree(node77);
        boolean boolean80 = node77.isDo();
        boolean boolean81 = functionType41.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType54, node77);
        boolean boolean82 = functionType54.isUnknownType();
        java.util.Set<java.lang.String> strSet83 = functionType54.getPropertyNames();
        node27.setJSType((com.google.javascript.rhino.jstype.JSType) functionType54);
        jSTypeRegistry2.unregisterPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) functionType54);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable86 = functionType54.getAllExtendedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertNotNull(objectTypeIterable86);
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01773");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("(Not declared as a type name)", 0, 43);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        boolean boolean7 = node6.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        node10.putIntProp((-1), 35);
        boolean boolean14 = node10.isReturn();
        com.google.javascript.rhino.InputId inputId15 = node10.getInputId();
        node10.setWasEmptyNode(true);
        boolean boolean18 = node10.isLabel();
        boolean boolean19 = node10.isTry();
        com.google.javascript.rhino.Node node20 = node6.srcref(node10);
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean22 = node4.isNoSideEffectsCall();
        boolean boolean23 = node4.isWith();
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node4);
        boolean boolean25 = node4.wasEmptyNode();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        node28.putIntProp((-1), 35);
        boolean boolean32 = node28.isStringKey();
        boolean boolean33 = node28.isThrow();
        int int34 = node28.getLineno();
        boolean boolean35 = node28.hasChildren();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node28.hasChild(node37);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        boolean boolean44 = node43.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = node43.getStaticSourceFile();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(0, node37, node43, node49);
        boolean boolean51 = node50.isGetterDef();
        boolean boolean52 = node50.isAssign();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(12, node4, node50, 12, 16);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        boolean boolean58 = node57.isCall();
        boolean boolean59 = node57.isDefaultCase();
        int int60 = node57.getChildCount();
        com.google.javascript.rhino.Node node61 = node55.srcref(node57);
        boolean boolean62 = node55.isGetterDef();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(staticSourceFile8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(inputId15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(staticSourceFile45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01774");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(4, "{proxy:function (): {1209415200}}");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01775");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        jSTypeRegistry13.unregisterPropertyOnType("(Not declared as a type name)", jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry13.createFunctionType(jSType17, true, jSTypeArray19);
        boolean boolean22 = functionType20.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry26.createFunctionType(jSType30, true, jSTypeArray32);
        boolean boolean35 = functionType33.removeProperty("false");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node37.isStringKey();
        boolean boolean42 = node37.isThrow();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj48 = node46.getProp((int) (byte) 10);
        boolean boolean49 = node37.isEquivalentToTyped(node46);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, node52);
        boolean boolean57 = node56.isInstanceOf();
        com.google.javascript.rhino.Node node58 = node46.useSourceInfoFromForTree(node56);
        boolean boolean59 = node56.isDo();
        boolean boolean60 = functionType20.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType33, node56);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair61 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = functionType33.getPossibleToBooleanOutcomes();
        boolean boolean63 = functionType33.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = functionType33.toMaybeFunctionType();
        boolean boolean65 = functionType64.hasReferenceName();
        java.lang.String str66 = functionType64.getReferenceName();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01776");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property12 = functionType9.getSlot("function (): {2140273663}");
        boolean boolean13 = functionType9.isStringObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01777");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFrom(node4);
        boolean boolean12 = node11.isVar();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        boolean boolean15 = node14.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = node14.getStaticSourceFile();
        node14.setLineno((int) '4');
        com.google.javascript.rhino.Node node19 = node11.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj25 = node23.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node26 = node14.copyInformationFrom(node23);
        boolean boolean27 = node23.isFor();
        boolean boolean28 = node23.isLocalResultCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder29 = node23.new FileLevelJsDocBuilder();
        boolean boolean30 = node23.isCase();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(staticSourceFile16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01778");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType9.toObjectType();
        boolean boolean12 = objectType11.isFunctionPrototypeType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        boolean boolean25 = functionType22.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType22.getImplicitPrototype();
        boolean boolean27 = objectType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType22);
        boolean boolean28 = functionType22.isVoidType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = functionType22.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType22.findPropertyType("Function");
        boolean boolean33 = functionType22.hasOwnProperty("Named type with empty name component");
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = functionType22.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        boolean boolean45 = functionType44.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        jSTypeRegistry48.unregisterPropertyOnType("(Not declared as a type name)", jSType50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry48.createFunctionType(jSType52, true, jSTypeArray54);
        boolean boolean57 = functionType55.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry61.createFunctionType(jSType65, true, jSTypeArray67);
        boolean boolean70 = functionType68.removeProperty("false");
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(0);
        node72.putIntProp((-1), 35);
        boolean boolean76 = node72.isStringKey();
        boolean boolean77 = node72.isThrow();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj83 = node81.getProp((int) (byte) 10);
        boolean boolean84 = node72.isEquivalentToTyped(node81);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(0);
        node87.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(32, node87);
        boolean boolean92 = node91.isInstanceOf();
        com.google.javascript.rhino.Node node93 = node81.useSourceInfoFromForTree(node91);
        boolean boolean94 = node91.isDo();
        boolean boolean95 = functionType55.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType68, node91);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair96 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType44, (com.google.javascript.rhino.jstype.JSType) functionType68);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair97 = functionType22.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType44);
        com.google.javascript.rhino.jstype.JSType jSType98 = typePair97.typeA;
        com.google.javascript.rhino.jstype.JSType jSType99 = typePair97.typeA;
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSDocInfo34);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(typePair97);
        org.junit.Assert.assertNotNull(jSType98);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01779");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        com.google.javascript.rhino.Node node51 = functionType22.getPropertyNode("java.io.IOException");
        java.lang.String str52 = functionType22.toDebugHashCodeString();
        boolean boolean54 = functionType22.hasOwnProperty("");
        com.google.javascript.rhino.jstype.FunctionType functionType56 = functionType22.getBindReturnType(37);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot58 = functionType56.getOwnSlot("(Not declared as a type name)");
        com.google.javascript.rhino.jstype.ObjectType objectType59 = functionType56.getPrototype();
        boolean boolean60 = objectType59.isString();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(node51);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "function (): {851122440}" + "'", str52, "function (): {851122440}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNull(jSTypeStaticSlot58);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01780");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        java.lang.String str11 = functionType9.toString();
        boolean boolean12 = functionType9.isInterface();
        java.lang.Iterable iterable13 = functionType9.getCtorImplementedInterfaces();
        boolean boolean14 = functionType9.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "function (): ?" + "'", str11, "function (): ?");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01781");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = new com.google.javascript.rhino.JSTypeExpression(node1, "hi!");
        com.google.javascript.rhino.Node node5 = jSTypeExpression4.getRoot();
        com.google.javascript.rhino.Node node6 = jSTypeExpression4.getRoot();
        com.google.javascript.rhino.Node node7 = jSTypeExpression4.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01782");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 100, node2, 49, (int) (byte) 1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        node10.putIntProp((-1), 35);
        boolean boolean14 = node10.isStringKey();
        boolean boolean15 = node10.isThrow();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj21 = node19.getProp((int) (byte) 10);
        boolean boolean22 = node10.isEquivalentToTyped(node19);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        node25.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(32, node25);
        boolean boolean30 = node29.isInstanceOf();
        com.google.javascript.rhino.Node node31 = node19.useSourceInfoFromForTree(node29);
        boolean boolean32 = node31.isStringKey();
        com.google.javascript.rhino.Node node33 = node8.useSourceInfoIfMissingFrom(node31);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        boolean boolean36 = node35.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile37 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        boolean boolean43 = node39.isReturn();
        com.google.javascript.rhino.InputId inputId44 = node39.getInputId();
        node39.setWasEmptyNode(true);
        boolean boolean47 = node39.isLabel();
        boolean boolean48 = node39.isTry();
        com.google.javascript.rhino.Node node49 = node35.srcref(node39);
        boolean boolean50 = node39.hasMoreThanOneChild();
        java.lang.String str51 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node39);
        boolean boolean52 = node33.isEquivalentTo(node39);
        boolean boolean53 = node39.isAdd();
        boolean boolean54 = node39.isAssign();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(staticSourceFile37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01783");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        boolean boolean22 = functionType21.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType9.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType21);
        java.util.Set<java.lang.String> strSet24 = functionType9.getOwnPropertyNames();
        boolean boolean25 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        jSTypeRegistry28.unregisterPropertyOnType("(Not declared as a type name)", jSType30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry28.createFunctionType(jSType32, true, jSTypeArray34);
        boolean boolean36 = functionType35.hasReferenceName();
        boolean boolean37 = functionType35.isConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        jSTypeRegistry40.unregisterPropertyOnType("(Not declared as a type name)", jSType42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry40.createFunctionType(jSType44, true, jSTypeArray46);
        boolean boolean48 = functionType47.isReturnTypeInferred();
        boolean boolean49 = functionType47.hasReferenceName();
        boolean boolean50 = functionType35.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType47);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        jSTypeRegistry53.unregisterPropertyOnType("(Not declared as a type name)", jSType55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry53.createFunctionType(jSType57, true, jSTypeArray59);
        com.google.common.collect.ImmutableList<java.lang.String> strList61 = functionType60.getTemplateTypeNames();
        boolean boolean62 = functionType60.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType60.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        jSTypeRegistry66.unregisterPropertyOnType("(Not declared as a type name)", jSType68);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry66.createFunctionType(jSType70, true, jSTypeArray72);
        boolean boolean75 = functionType73.removeProperty("false");
        boolean boolean76 = functionType73.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType77 = functionType73.getImplicitPrototype();
        com.google.javascript.rhino.Node node78 = functionType73.getRootNode();
        boolean boolean79 = jSType63.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType73);
        boolean boolean80 = functionType35.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType73);
        boolean boolean81 = functionType9.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType35);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objectType77);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01784");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node4 = node1.getNext();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        boolean boolean12 = node6.isEmpty();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFrom(node6);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoFrom(node17);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        boolean boolean26 = node25.isCall();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList34 = com.google.common.collect.ImmutableList.of((java.lang.Object) node1, (java.lang.Object) node17, (java.lang.Object) node25, (java.lang.Object) 53, (java.lang.Object) node29);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        boolean boolean37 = node36.isInstanceOf();
        node29.addChildrenToFront(node36);
        int int39 = node29.getSourceOffset();
        node29.setVarArgs(true);
        boolean boolean42 = node29.isInstanceOf();
        boolean boolean43 = node29.hasChildren();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objList34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01785");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        java.lang.String str11 = functionType9.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = functionType21.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot24 = functionType21.getSlot("NUMBER 0.0 100\n");
        boolean boolean25 = functionType21.isAllType();
        boolean boolean26 = functionType9.hasEqualCallType(functionType21);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = functionType21.getOwnerFunction();
        java.util.Set<java.lang.String> strSet28 = functionType21.getOwnPropertyNames();
        boolean boolean29 = functionType21.isInstanceType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = functionType21.getParentScope();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(staticSlot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(functionType27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope30);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01786");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType11 = functionType9.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = functionType9.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType9.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType9.getTypeOfThis();
        com.google.javascript.rhino.jstype.UnionType unionType15 = jSType14.toMaybeUnionType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNull(enumType11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertNull(unionType15);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01787");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType9.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.javascript.rhino.jstype.JSType jSType25 = functionType24.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType26 = functionType24.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = functionType24.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry14.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType24);
        jSTypeRegistry14.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        jSTypeRegistry33.unregisterPropertyOnType("(Not declared as a type name)", jSType35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry33.createFunctionType(jSType37, true, jSTypeArray39);
        boolean boolean42 = functionType40.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        jSTypeRegistry46.unregisterPropertyOnType("(Not declared as a type name)", jSType48);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry46.createFunctionType(jSType50, true, jSTypeArray52);
        boolean boolean55 = functionType53.removeProperty("false");
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        node57.putIntProp((-1), 35);
        boolean boolean61 = node57.isStringKey();
        boolean boolean62 = node57.isThrow();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj68 = node66.getProp((int) (byte) 10);
        boolean boolean69 = node57.isEquivalentToTyped(node66);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(0);
        node72.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(32, node72);
        boolean boolean77 = node76.isInstanceOf();
        com.google.javascript.rhino.Node node78 = node66.useSourceInfoFromForTree(node76);
        boolean boolean79 = node76.isDo();
        boolean boolean80 = functionType40.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType53, node76);
        jSTypeRegistry14.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType53);
        boolean boolean82 = objectType11.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType53);
        functionType53.clearCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType53.getTypeOfThis();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNull(enumType26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jSType84);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01788");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.autoboxesTo();
        java.lang.String str14 = functionType12.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        jSTypeRegistry17.unregisterPropertyOnType("(Not declared as a type name)", jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry17.createFunctionType(jSType21, true, jSTypeArray23);
        com.google.common.collect.ImmutableList<java.lang.String> strList25 = functionType24.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot27 = functionType24.getSlot("NUMBER 0.0 100\n");
        boolean boolean28 = functionType24.isAllType();
        boolean boolean29 = functionType12.hasEqualCallType(functionType24);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType24.getOwnerFunction();
        java.util.Set<java.lang.String> strSet31 = functionType24.getOwnPropertyNames();
        boolean boolean32 = functionType24.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean43 = functionType42.isReturnTypeInferred();
        boolean boolean44 = functionType42.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.getBindReturnType((int) (short) 1);
        java.lang.String str47 = functionType46.toAnnotationString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean49 = parameterizedType48.isAllType();
        boolean boolean50 = parameterizedType48.isInstanceType();
        boolean boolean51 = parameterizedType48.canBeCalled();
        boolean boolean52 = parameterizedType48.isNumberValueType();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function (): ?" + "'", str47, "function (): ?");
        org.junit.Assert.assertNotNull(parameterizedType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01789");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        boolean boolean6 = node2.isStringKey();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node2.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node12 = node2.srcrefTree(node11);
        boolean boolean13 = node12.isEmpty();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoFrom(node17);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection24 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node17);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        boolean boolean28 = node27.isCall();
        com.google.javascript.rhino.Node node29 = node27.cloneTree();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(35, node29, node32);
        boolean boolean34 = node33.isComma();
        boolean boolean35 = node33.isWith();
        boolean boolean36 = node33.isStringKey();
        com.google.javascript.rhino.Node node37 = node17.srcref(node33);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship38 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node12, node17);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(0);
        boolean boolean41 = node40.isCall();
        com.google.javascript.rhino.Node node42 = node40.cloneTree();
        boolean boolean43 = node42.isAssignAdd();
        java.util.Set<java.lang.String> strSet44 = node42.getDirectives();
        com.google.javascript.rhino.Node node45 = node42.getLastSibling();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean47 = jSDocInfo46.hasThisType();
        boolean boolean48 = jSDocInfo46.shouldPreserveTry();
        boolean boolean49 = jSDocInfo46.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression51 = jSDocInfo46.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean52 = jSDocInfo46.shouldPreserveTry();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(0);
        boolean boolean55 = node54.isCall();
        com.google.javascript.rhino.Node node56 = node54.cloneTree();
        boolean boolean57 = node54.isNull();
        jSDocInfo46.setAssociatedNode(node54);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship59 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node42, node54);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeCollection24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(strSet44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(jSTypeExpression51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01790");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        java.lang.String str11 = functionType9.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.common.collect.ImmutableList<java.lang.String> strList22 = functionType21.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot24 = functionType21.getSlot("NUMBER 0.0 100\n");
        boolean boolean25 = functionType21.isAllType();
        boolean boolean26 = functionType9.hasEqualCallType(functionType21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        jSTypeRegistry29.unregisterPropertyOnType("(Not declared as a type name)", jSType31);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray35 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry29.createFunctionType(jSType33, true, jSTypeArray35);
        com.google.common.collect.ImmutableList<java.lang.String> strList37 = functionType36.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot39 = functionType36.getSlot("NUMBER 0.0 100\n");
        boolean boolean40 = functionType36.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        jSTypeRegistry43.unregisterPropertyOnType("(Not declared as a type name)", jSType45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry43.createFunctionType(jSType47, true, jSTypeArray49);
        boolean boolean52 = functionType50.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType50.findPropertyType("Not declared as a type name");
        boolean boolean55 = functionType36.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType50);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable56 = functionType50.getImplementedInterfaces();
        boolean boolean57 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.Node node58 = functionType9.getParametersNode();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable59 = functionType9.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.TemplateType templateType60 = functionType9.toMaybeTemplateType();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        jSTypeRegistry63.unregisterPropertyOnType("(Not declared as a type name)", jSType65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry63.createFunctionType(jSType67, true, jSTypeArray69);
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType70.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType72 = functionType70.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        jSTypeRegistry76.unregisterPropertyOnType("(Not declared as a type name)", jSType78);
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, true);
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        jSTypeRegistry82.unregisterPropertyOnType("(Not declared as a type name)", jSType84);
        com.google.javascript.rhino.jstype.JSType jSType86 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry82.createFunctionType(jSType86, true, jSTypeArray88);
        boolean boolean91 = functionType89.removeProperty("false");
        boolean boolean92 = functionType89.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType93 = jSTypeRegistry76.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType89);
        com.google.javascript.rhino.jstype.JSType jSType94 = functionType70.forceResolve(errorReporter73, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType89);
        boolean boolean95 = functionType89.canBeCalled();
        boolean boolean96 = functionType89.hasAnyTemplateInternal();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean97 = templateType60.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNull(staticSlot24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNull(staticSlot39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(jSType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(objectTypeIterable59);
        org.junit.Assert.assertNull(templateType60);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01791");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        com.google.javascript.rhino.Node node12 = node4.useSourceInfoFrom(node6);
        boolean boolean13 = node12.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        jSTypeRegistry16.unregisterPropertyOnType("(Not declared as a type name)", jSType18);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        boolean boolean31 = functionType29.removeProperty("false");
        boolean boolean32 = functionType29.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType29);
        com.google.javascript.rhino.jstype.JSType jSType34 = assertionFunctionSpec2.getAssertedType(node12, jSTypeRegistry16);
        jSTypeRegistry16.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry16.createNamedType("function (): {726684091}", "(Not declared as a type name)", 1, (int) (byte) -1);
        jSTypeRegistry16.clearNamedTypes();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertNotNull(jSType41);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01792");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry5.createFunctionType(jSType9, true, jSTypeArray11);
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType12.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType12.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType12.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType12);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean20 = jSDocInfo19.hasThisType();
        boolean boolean21 = jSDocInfo19.shouldPreserveTry();
        boolean boolean22 = jSDocInfo19.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo19.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean25 = jSDocInfo19.shouldPreserveTry();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        boolean boolean28 = node27.isCall();
        com.google.javascript.rhino.Node node29 = node27.cloneTree();
        boolean boolean30 = node27.isNull();
        jSDocInfo19.setAssociatedNode(node27);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        jSTypeRegistry34.unregisterPropertyOnType("(Not declared as a type name)", jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry34.createFunctionType(jSType38, true, jSTypeArray40);
        boolean boolean43 = functionType41.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        boolean boolean56 = functionType54.removeProperty("false");
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        boolean boolean62 = node58.isStringKey();
        boolean boolean63 = node58.isThrow();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj69 = node67.getProp((int) (byte) 10);
        boolean boolean70 = node58.isEquivalentToTyped(node67);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(0);
        node73.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(32, node73);
        boolean boolean78 = node77.isInstanceOf();
        com.google.javascript.rhino.Node node79 = node67.useSourceInfoFromForTree(node77);
        boolean boolean80 = node77.isDo();
        boolean boolean81 = functionType41.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType54, node77);
        boolean boolean82 = functionType54.isUnknownType();
        java.util.Set<java.lang.String> strSet83 = functionType54.getPropertyNames();
        node27.setJSType((com.google.javascript.rhino.jstype.JSType) functionType54);
        jSTypeRegistry2.unregisterPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) functionType54);
        int int86 = functionType54.getPropertiesCount();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot88 = functionType54.getSlot("function (): {405212503}");
        com.google.javascript.rhino.jstype.JSType jSType89 = functionType54.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType jSType90 = jSType89.collapseUnion();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot88);
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertNotNull(jSType90);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01793");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation(43, (int) (short) 0, 43, 49);
        int int6 = stringPosition0.getPositionOnEndLine();
        int int7 = stringPosition0.getPositionOnStartLine();
        int int8 = stringPosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 49 + "'", int6 == 49);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 43 + "'", int8 == 43);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01794");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        jSTypeRegistry8.unregisterPropertyOnType("(Not declared as a type name)", jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry8.createFunctionType(jSType12, true, jSTypeArray14);
        boolean boolean17 = functionType15.removeProperty("false");
        boolean boolean18 = functionType15.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType19 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType15);
        boolean boolean21 = functionType15.hasProperty("(Not declared as a type name)");
        com.google.javascript.rhino.Node node22 = functionType15.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        jSTypeRegistry25.unregisterPropertyOnType("(Not declared as a type name)", jSType27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry25.createFunctionType(jSType29, true, jSTypeArray31);
        boolean boolean33 = functionType32.isReturnTypeInferred();
        boolean boolean34 = functionType15.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType35 = functionType15.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01795");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        java.util.Collection<java.lang.String> strCollection8 = jSDocInfo0.getAuthors();
        java.lang.String str9 = jSDocInfo0.getReturnDescription();
        boolean boolean11 = jSDocInfo0.hasParameter("");
        boolean boolean12 = jSDocInfo0.isExpose();
        java.lang.String str13 = jSDocInfo0.getDeprecationReason();
        java.lang.String str14 = jSDocInfo0.toString();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList15 = jSDocInfo0.getThrownTypes();
        java.lang.String str16 = jSDocInfo0.getBlockDescription();
        boolean boolean18 = jSDocInfo0.hasDescriptionForParameter("InputId: true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strCollection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JSDocInfo" + "'", str14, "JSDocInfo");
        org.junit.Assert.assertNotNull(jSTypeExpressionList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01796");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType9.getTypeOfThis();
        boolean boolean12 = objectType11.isStringValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        jSTypeRegistry16.unregisterPropertyOnType("(Not declared as a type name)", jSType18);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        boolean boolean31 = functionType29.removeProperty("false");
        boolean boolean32 = functionType29.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean35 = functionType29.hasProperty("(Not declared as a type name)");
        com.google.javascript.rhino.Node node36 = functionType29.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        jSTypeRegistry39.unregisterPropertyOnType("(Not declared as a type name)", jSType41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry39.createFunctionType(jSType43, true, jSTypeArray45);
        boolean boolean47 = functionType46.isReturnTypeInferred();
        boolean boolean48 = functionType29.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType46);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = functionType46.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType50 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.jstype.JSType jSType51 = objectType11.forceResolve(errorReporter13, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType50);
        java.lang.String str52 = objectType50.getReferenceName();
        boolean boolean53 = objectType50.hasReferenceName();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable49);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01797");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj37 = node35.getProp((int) (byte) 10);
        boolean boolean38 = node26.isEquivalentToTyped(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        node41.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(32, node41);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoFromForTree(node45);
        boolean boolean48 = node45.isDo();
        boolean boolean49 = functionType9.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType22, node45);
        boolean boolean50 = functionType22.isUnknownType();
        boolean boolean51 = functionType22.isInterface();
        boolean boolean52 = functionType22.matchesObjectContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType22.getAllImplementedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01798");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        boolean boolean24 = functionType22.removeProperty("false");
        boolean boolean25 = functionType22.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType22.getImplicitPrototype();
        com.google.javascript.rhino.Node node27 = functionType22.getRootNode();
        boolean boolean28 = jSType12.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType22);
        boolean boolean29 = functionType22.matchesObjectContext();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot31 = functionType22.getSlot("function (): {1536545239}");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = functionType22.getPossibleToBooleanOutcomes();
        boolean boolean33 = functionType22.hasCachedValues();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(staticSlot31);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01799");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01800");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.Node> nodeBuilder0 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.Node>();
    }
}
