import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest52 {

    public static boolean debug = false;

    @Test
    public void test26001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26001");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        boolean boolean15 = node4.isSetterDef();
        com.google.javascript.rhino.Node node16 = node4.getLastSibling();
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isExprResult();
        boolean boolean19 = node16.isTrue();
        boolean boolean20 = node16.isReturn();
        java.lang.String str21 = node16.getString();
        boolean boolean22 = node16.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node26.setCharno(1);
        boolean boolean29 = node26.isRegExp();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node36 = node34.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) -1, node34, (int) (byte) 1, (int) '#');
        boolean boolean40 = node34.isDo();
        boolean boolean41 = node34.isDefaultCase();
        node34.setQuotedString();
        com.google.javascript.rhino.Node node43 = node26.useSourceInfoFromForTree(node34);
        node34.putIntProp((int) (byte) 100, (int) (byte) 0);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node53 = node51.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) -1, node51, (int) (byte) 1, (int) '#');
        boolean boolean57 = node51.isScript();
        com.google.javascript.rhino.InputId inputId58 = node51.getInputId();
        com.google.javascript.rhino.Node node59 = node34.useSourceInfoFrom(node51);
        boolean boolean60 = node34.isTrue();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean65 = node64.isThrow();
        java.lang.String str69 = node64.toString(true, false, true);
        node34.addChildToFront(node64);
        com.google.javascript.rhino.Node node71 = node16.useSourceInfoFrom(node34);
        boolean boolean72 = node71.isAssign();
        com.google.javascript.rhino.InputId inputId73 = node71.getInputId();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(inputId58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "STRING  0" + "'", str69, "STRING  0");
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(inputId73);
    }

    @Test
    public void test26002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26002");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str5 = jSDocInfo0.toString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getTypedefType();
        boolean boolean9 = jSDocInfo0.hasThisType();
        boolean boolean10 = jSDocInfo0.hasBaseType();
        boolean boolean11 = jSDocInfo0.shouldPreserveTry();
        boolean boolean12 = jSDocInfo0.isHidden();
        boolean boolean13 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = jSDocInfo0.getReturnType();
        boolean boolean15 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSTypeExpression14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test26003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26003");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 1);
        java.lang.Object obj3 = node1.getProp(42);
        node1.putBooleanProp(12, false);
        boolean boolean7 = node1.hasChildren();
        boolean boolean8 = node1.isExprResult();
        com.google.javascript.rhino.InputId inputId9 = node1.getInputId();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId9);
    }

    @Test
    public void test26004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26004");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(3);
        sideEffectFlags1.setReturnsTainted();
        boolean boolean3 = sideEffectFlags1.areAllFlagsSet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test26005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26005");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getLicense();
        boolean boolean3 = jSDocInfo0.isConstructor();
        int int4 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean5 = jSDocInfo0.isExterns();
        boolean boolean6 = jSDocInfo0.hasTypedefType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test26006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26006");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        boolean boolean6 = jSDocInfo0.isImplicitCast();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        boolean boolean8 = jSDocInfo0.isHidden();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getSuppressions();
        int int10 = jSDocInfo0.getParameterCount();
        com.google.javascript.rhino.Node node11 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getParameterType("Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nSTRING Not declared as a constructor 0\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: STRING Not declared as a constructor 0\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test26007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26007");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 6, (int) (byte) 1, 4111);
        boolean boolean4 = node3.isHook();
        boolean boolean5 = node3.isIn();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test26008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26008");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = node3.getLastChild();
        boolean boolean6 = node3.isWhile();
        node3.setSourceFileForTesting("(Not declared as a type name)");
        boolean boolean9 = node3.isExprResult();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean11 = jSDocInfo10.isConstructor();
        int int12 = jSDocInfo10.getParameterCount();
        com.google.common.collect.ImmutableList<java.lang.String> strList13 = jSDocInfo10.getTemplateTypeNames();
        node3.setJSDocInfo(jSDocInfo10);
        com.google.javascript.rhino.Node node15 = node3.getLastSibling();
        com.google.javascript.rhino.InputId inputId16 = null;
        node3.setInputId(inputId16);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test26009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26009");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        boolean boolean7 = node4.isRegExp();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isDo();
        boolean boolean19 = node12.isDefaultCase();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        java.util.Set<java.lang.String> strSet28 = node25.getDirectives();
        node25.setLength(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node21, node25, node40, (int) 'a', (int) (short) 0);
        boolean boolean44 = node21.isNull();
        java.lang.String[] strArray47 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        boolean boolean55 = strSet48.addAll((java.util.Collection<java.lang.String>) strList53);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node62 = node60.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) -1, node60, (int) (byte) 1, (int) '#');
        boolean boolean66 = node60.isScript();
        node60.setQuotedString();
        boolean boolean68 = strSet48.equals((java.lang.Object) node60);
        com.google.javascript.rhino.Node node69 = node21.copyInformationFrom(node60);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node76 = node74.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (byte) -1, node74, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node80 = node21.useSourceInfoFrom(node79);
        com.google.javascript.rhino.Node node81 = node21.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = node81.isLocalResultCall();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNull(node81);
    }

    @Test
    public void test26010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26010");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        com.google.javascript.rhino.Node node15 = node8.detachFromParent();
        node15.setOptionalArg(false);
        boolean boolean19 = node15.getBooleanProp(31);
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node15);
        boolean boolean21 = node20.isLabel();
        boolean boolean22 = node20.isWhile();
        boolean boolean23 = node20.isFor();
        boolean boolean24 = node20.isHook();
        node20.setSourceEncodedPosition(41);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        node20.setJSType(jSType27);
        boolean boolean29 = node20.isParamList();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test26011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26011");
        java.lang.String[] strArray2 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.add("STRING  0");
        java.lang.String[] strArray9 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        boolean boolean17 = strSet10.addAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean18 = strSet3.containsAll((java.util.Collection<java.lang.String>) strList15);
        java.lang.String[] strArray21 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        boolean boolean25 = strSet22.add("STRING  0");
        java.lang.String[] strArray28 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        boolean boolean36 = strSet29.addAll((java.util.Collection<java.lang.String>) strList34);
        boolean boolean37 = strSet22.containsAll((java.util.Collection<java.lang.String>) strList34);
        boolean boolean38 = strSet3.containsAll((java.util.Collection<java.lang.String>) strSet22);
        java.lang.String[] strArray41 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        boolean boolean45 = strSet42.add("STRING  0");
        java.lang.String[] strArray48 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        boolean boolean56 = strSet49.addAll((java.util.Collection<java.lang.String>) strList54);
        boolean boolean57 = strSet42.containsAll((java.util.Collection<java.lang.String>) strList54);
        java.lang.String[] strArray60 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        boolean boolean64 = strSet61.add("STRING  0");
        java.lang.String[] strArray67 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        boolean boolean75 = strSet68.addAll((java.util.Collection<java.lang.String>) strList73);
        boolean boolean76 = strSet61.containsAll((java.util.Collection<java.lang.String>) strList73);
        boolean boolean77 = strSet42.containsAll((java.util.Collection<java.lang.String>) strSet61);
        java.util.Spliterator<java.lang.String> strSpliterator78 = strSet61.spliterator();
        boolean boolean79 = strSet22.containsAll((java.util.Collection<java.lang.String>) strSet61);
        java.util.stream.Stream<java.lang.String> strStream80 = strSet22.stream();
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str82 = jSDocInfo81.getVersion();
        java.lang.String str83 = jSDocInfo81.getFileOverview();
        jSDocInfo81.addSuppression("STRING  0");
        java.lang.String str86 = jSDocInfo81.getOriginalCommentString();
        boolean boolean87 = jSDocInfo81.shouldPreserveTry();
        boolean boolean88 = strSet22.remove((java.lang.Object) jSDocInfo81);
        java.util.Set<java.lang.String> strSet89 = jSDocInfo81.getParameterNames();
        java.lang.String str90 = jSDocInfo81.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strSpliterator78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strStream80);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "JSDocInfo" + "'", str90, "JSDocInfo");
    }

    @Test
    public void test26012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26012");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean7 = jSDocInfo0.isNoAlias();
        boolean boolean8 = jSDocInfo0.isHidden();
        com.google.javascript.rhino.Node node9 = jSDocInfo0.getAssociatedNode();
        boolean boolean10 = jSDocInfo0.isConstant();
        int int11 = jSDocInfo0.getExtendedInterfacesCount();
        int int12 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getBaseType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test26013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26013");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue1.or(ternaryValue3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue6.or(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue6.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue10.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue11.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue14.or(ternaryValue16);
        java.lang.String str18 = ternaryValue17.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue11.or(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue22.or(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = ternaryValue27.or(ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = ternaryValue29.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue25.and(ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue20.and(ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        java.lang.String str36 = ternaryValue35.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = ternaryValue20.and(ternaryValue35);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = ternaryValue11.or(ternaryValue35);
        boolean boolean40 = ternaryValue11.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        boolean boolean44 = ternaryValue42.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = ternaryValue45.or(ternaryValue46);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = ternaryValue42.xor(ternaryValue47);
        java.lang.String str49 = ternaryValue48.toString();
        java.lang.String str50 = ternaryValue48.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = ternaryValue52.or(ternaryValue54);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = ternaryValue52.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = ternaryValue48.xor(ternaryValue52);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = ternaryValue11.and(ternaryValue57);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = ternaryValue4.xor(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = ternaryValue11.not();
        java.lang.String str61 = ternaryValue11.toString();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "false" + "'", str18, "false");
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "false" + "'", str36, "false");
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "true" + "'", str49, "true");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "true" + "'", str50, "true");
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "false" + "'", str61, "false");
    }

    @Test
    public void test26014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26014");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean24 = node11.isVarArgs();
        boolean boolean25 = node11.isName();
        node11.setLineno((-1));
        boolean boolean28 = node11.isDebugger();
        boolean boolean29 = node11.isVarArgs();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(45, 0, 48);
        java.lang.String str34 = node33.getSourceFileName();
        boolean boolean35 = node33.isOnlyModifiesThisCall();
        boolean boolean36 = node33.isWith();
        boolean boolean37 = node33.isCatch();
        boolean boolean38 = node33.isNot();
        node11.addChildToFront(node33);
        boolean boolean40 = node11.isContinue();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test26015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26015");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        boolean boolean5 = jSDocInfo0.hasModifies();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str7 = jSDocInfo0.getDescription();
        java.util.Collection<java.lang.String> strCollection8 = jSDocInfo0.getReferences();
        boolean boolean9 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test26016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26016");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(1044480, "((CALL 0\n))");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test26017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26017");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker0.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition9 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition10 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition11 = marker0.getDescription();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(stringPosition8);
        org.junit.Assert.assertNull(nodeSourcePosition9);
        org.junit.Assert.assertNull(typePosition10);
        org.junit.Assert.assertNull(stringPosition11);
    }

    @Test
    public void test26018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26018");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("STRING  0\n");
        jSDocInfo0.setDeprecated(false);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean9 = jSDocInfo0.containsDeclaration();
        boolean boolean10 = jSDocInfo0.hasReturnType();
        java.lang.String str11 = jSDocInfo0.getVersion();
        java.lang.String str12 = jSDocInfo0.getFileOverview();
        boolean boolean13 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26019");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(12, "STRING  0 [synthetic: 1]\n");
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder3 = node2.getJsDocBuilderForNode();
        boolean boolean4 = node2.isTry();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = node2.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EQ STRING  0 [synthetic: 1]? is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26020");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean5 = node4.isThrow();
        boolean boolean6 = node4.isSwitch();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        boolean boolean20 = node11.isDec();
        boolean boolean21 = node11.isLabel();
        boolean boolean22 = node11.isSetterDef();
        boolean boolean23 = node11.isRegExp();
        boolean boolean24 = node11.isName();
        boolean boolean25 = node11.isVoid();
        com.google.javascript.rhino.Node node26 = node11.cloneNode();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node26);
        java.lang.String[] strArray30 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = strSet31.addAll((java.util.Collection<java.lang.String>) strList36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str40 = jSDocInfo39.getVersion();
        java.lang.String str41 = jSDocInfo39.getFileOverview();
        boolean boolean42 = jSDocInfo39.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet43 = jSDocInfo39.getParameterNames();
        boolean boolean44 = strSet31.retainAll((java.util.Collection<java.lang.String>) strSet43);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node51 = node49.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) -1, node49, (int) (byte) 1, (int) '#');
        boolean boolean55 = node49.isDo();
        boolean boolean56 = node49.isDefaultCase();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node67 = node65.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) (byte) -1, node65, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node77 = node75.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (byte) -1, node75, (int) (byte) 1, (int) '#');
        boolean boolean81 = node70.hasChild(node80);
        int int82 = node70.getCharno();
        com.google.javascript.rhino.Node node83 = node60.useSourceInfoIfMissingFrom(node70);
        int int84 = node60.getSourcePosition();
        java.lang.String str85 = node60.toString();
        int int86 = node49.getIndexOfChild(node60);
        boolean boolean87 = strSet31.equals((java.lang.Object) node49);
        boolean boolean88 = node49.isCatch();
        com.google.javascript.rhino.Node node89 = node4.useSourceInfoFrom(node49);
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node((int) '4', node4, 4131, 30);
        node92.setVarArgs(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node95 = node92.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 35 + "'", int82 == 35);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 4131 + "'", int84 == 4131);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "OR 1" + "'", str85, "OR 1");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(node89);
    }

    @Test
    public void test26021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26021");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        boolean boolean3 = jSDocInfo0.hasParameterType("(OR 51)");
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = jSDocInfo0.getTemplateTypeNames();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Named type with empty name component");
        java.lang.String str8 = node7.getQualifiedName();
        node7.setQuotedString();
        jSDocInfo0.setAssociatedNode(node7);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getBaseType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getType();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertNull(jSTypeExpression12);
    }

    @Test
    public void test26022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26022");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getEndLine();
        int int2 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node3 = null;
        namePosition0.setItem(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node8.setCharno(1);
        java.util.Set<java.lang.String> strSet11 = node8.getDirectives();
        namePosition0.setItem(node8);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node23 = node21.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) -1, node21, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node33 = node31.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) -1, node31, (int) (byte) 1, (int) '#');
        boolean boolean37 = node26.hasChild(node36);
        int int38 = node26.getCharno();
        com.google.javascript.rhino.Node node39 = node16.useSourceInfoIfMissingFrom(node26);
        boolean boolean40 = node26.isAssignAdd();
        namePosition0.setItem(node26);
        int int42 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node43 = namePosition0.getItem();
        com.google.javascript.rhino.Node node44 = namePosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test26023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26023");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 36, 0);
        boolean boolean4 = node3.isThis();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        boolean boolean15 = node9.isDo();
        boolean boolean16 = node9.isDefaultCase();
        node9.setQuotedString();
        boolean boolean18 = node9.isDec();
        boolean boolean19 = node9.isLabel();
        boolean boolean20 = node9.isSetterDef();
        boolean boolean21 = node9.isRegExp();
        boolean boolean22 = node9.isName();
        boolean boolean23 = node9.isVoid();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) -1, node28, (int) (byte) 1, (int) '#');
        boolean boolean34 = node28.isDo();
        com.google.javascript.rhino.Node node35 = node9.useSourceInfoIfMissingFrom(node28);
        boolean boolean36 = node35.isDelProp();
        boolean boolean37 = node35.isComma();
        com.google.javascript.rhino.Node node38 = node3.clonePropsFrom(node35);
        boolean boolean39 = node38.isCase();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test26024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26024");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        jSDocInfo0.addSuppression("STRING  0");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getExtendedInterfaces();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getParameterNames();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.lang.String str8 = jSDocInfo0.toString();
        boolean boolean9 = jSDocInfo0.isDefine();
        java.lang.String str10 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getEnumParameterType();
        boolean boolean12 = jSDocInfo0.isHidden();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSDocInfo" + "'", str8, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test26025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26025");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = booleanLiteralSet2.intersection(booleanLiteralSet3);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = booleanLiteralSet1.intersection(booleanLiteralSet2);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = booleanLiteralSet0.union(booleanLiteralSet2);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = booleanLiteralSet7.intersection(booleanLiteralSet8);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet11 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = booleanLiteralSet11.intersection(booleanLiteralSet12);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = booleanLiteralSet10.intersection(booleanLiteralSet11);
        boolean boolean16 = booleanLiteralSet14.contains(false);
        boolean boolean18 = booleanLiteralSet14.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = booleanLiteralSet8.intersection(booleanLiteralSet14);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = booleanLiteralSet0.intersection(booleanLiteralSet14);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = booleanLiteralSet21.intersection(booleanLiteralSet22);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = booleanLiteralSet20.intersection(booleanLiteralSet23);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet28 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet29 = booleanLiteralSet27.intersection(booleanLiteralSet28);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = booleanLiteralSet26.intersection(booleanLiteralSet27);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet31 = booleanLiteralSet25.union(booleanLiteralSet27);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet33 = booleanLiteralSet27.union(booleanLiteralSet32);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet35 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = booleanLiteralSet35.intersection(booleanLiteralSet36);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet38 = booleanLiteralSet34.intersection(booleanLiteralSet35);
        boolean boolean40 = booleanLiteralSet38.contains(false);
        boolean boolean42 = booleanLiteralSet38.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet43 = booleanLiteralSet27.union(booleanLiteralSet38);
        boolean boolean45 = booleanLiteralSet38.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet46 = booleanLiteralSet20.union(booleanLiteralSet38);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet47 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet48 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet49 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet50 = booleanLiteralSet48.intersection(booleanLiteralSet49);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = booleanLiteralSet47.intersection(booleanLiteralSet48);
        boolean boolean53 = booleanLiteralSet51.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet54 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet55 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet56 = booleanLiteralSet54.intersection(booleanLiteralSet55);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet57 = booleanLiteralSet51.intersection(booleanLiteralSet55);
        boolean boolean59 = booleanLiteralSet57.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet60 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet61 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet63 = booleanLiteralSet61.intersection(booleanLiteralSet62);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet64 = booleanLiteralSet60.intersection(booleanLiteralSet61);
        boolean boolean66 = booleanLiteralSet64.contains(false);
        boolean boolean68 = booleanLiteralSet64.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet69 = booleanLiteralSet57.union(booleanLiteralSet64);
        boolean boolean71 = booleanLiteralSet69.contains(false);
        boolean boolean73 = booleanLiteralSet69.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet74 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet75 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet77 = booleanLiteralSet75.intersection(booleanLiteralSet76);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet78 = booleanLiteralSet74.intersection(booleanLiteralSet75);
        boolean boolean80 = booleanLiteralSet78.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet81 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet82 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet83 = booleanLiteralSet81.intersection(booleanLiteralSet82);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet84 = booleanLiteralSet78.intersection(booleanLiteralSet82);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet86 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet87 = booleanLiteralSet84.intersection(booleanLiteralSet86);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet88 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet89 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet90 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet91 = booleanLiteralSet89.intersection(booleanLiteralSet90);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet92 = booleanLiteralSet88.intersection(booleanLiteralSet89);
        boolean boolean94 = booleanLiteralSet89.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet95 = booleanLiteralSet86.intersection(booleanLiteralSet89);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet96 = booleanLiteralSet69.union(booleanLiteralSet86);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet97 = booleanLiteralSet20.union(booleanLiteralSet96);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet2 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet2.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet11 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet11.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet19 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet19.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet23 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet23.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet26 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet26.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet27 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet27.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet28 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet28.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet29 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet29.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet31 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet31.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet33 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet33.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet35 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet35.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet36 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet36.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet38 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet38.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet43 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet43.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet46 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet46.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet47 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet47.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet48 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet48.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet49 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet49.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet50 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet50.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet54 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet54.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet55 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet55.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet56 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet56.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet57 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet57.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet60 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet60.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet61 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet61.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet63 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet63.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet64 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet64.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet69 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet69.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet74 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet74.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet75 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet75.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet77 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet77.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet78 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet78.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet81 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet81.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet82 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet82.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet83 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet83.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet84 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet84.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet86 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet86.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet87 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet87.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet88 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet88.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet89 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet89.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet90 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet90.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet91 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet91.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet92 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet92.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet95 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet95.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet96 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet96.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet97 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet97.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
    }

    @Test
    public void test26026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26026");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        boolean boolean7 = node4.isRegExp();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isDo();
        boolean boolean19 = node12.isDefaultCase();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        java.util.Set<java.lang.String> strSet28 = node25.getDirectives();
        node25.setLength(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node21, node25, node40, (int) 'a', (int) (short) 0);
        boolean boolean44 = node43.isLocalResultCall();
        boolean boolean45 = node43.isInstanceOf();
        boolean boolean46 = node43.isQualifiedName();
        boolean boolean47 = node43.isSetterDef();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test26027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26027");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isTypeOf();
        boolean boolean23 = node19.isAssignAdd();
        com.google.javascript.rhino.Node node24 = node19.removeFirstChild();
        boolean boolean25 = node24.isSwitch();
        node24.putIntProp(52, 0);
        boolean boolean29 = node24.isStringKey();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node36 = node34.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) -1, node34, (int) (byte) 1, (int) '#');
        boolean boolean40 = node34.isScript();
        node34.setQuotedString();
        boolean boolean42 = node34.isAssignAdd();
        boolean boolean43 = node34.isTypeOf();
        com.google.javascript.rhino.Node node44 = node24.clonePropsFrom(node34);
        boolean boolean45 = node44.isVarArgs();
        com.google.javascript.rhino.Node node46 = node44.removeChildren();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test26028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26028");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility5);
        boolean boolean7 = jSDocInfo0.isJavaDispatch();
        boolean boolean8 = jSDocInfo0.hasFileOverview();
        boolean boolean9 = jSDocInfo0.containsDeclaration();
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo0.getReferences();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getSuppressions();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str14 = jSDocInfo13.getVersion();
        boolean boolean15 = jSDocInfo13.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet16 = jSDocInfo13.getParameterNames();
        jSDocInfo13.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection19 = jSDocInfo13.getTypeNodes();
        java.lang.String str21 = jSDocInfo13.getDescriptionForParameter("Not declared as a constructor");
        com.google.javascript.rhino.Node node22 = jSDocInfo13.getAssociatedNode();
        boolean boolean23 = jSDocInfo13.hasTypedefType();
        java.lang.String str24 = jSDocInfo13.getReturnDescription();
        java.util.Set<java.lang.String> strSet25 = jSDocInfo13.getModifies();
        boolean boolean26 = strSet12.containsAll((java.util.Collection<java.lang.String>) strSet25);
        java.lang.Object[] objArray27 = strSet25.toArray();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + visibility5 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility5.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strCollection10);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(nodeCollection19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test26029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26029");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (short) -1);
        node1.setSourceEncodedPosition(16);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node5 = node1.getLastSibling();
        node1.setIsSyntheticBlock(false);
        node1.setSourceEncodedPositionForTree(42);
        boolean boolean10 = node1.isSetterDef();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(staticSourceFile4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test26030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26030");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(1, 49, 37);
        boolean boolean4 = node3.isFunction();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26031");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getEnumParameterType();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getSuppressions();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getReferences();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList10 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(strCollection9);
        org.junit.Assert.assertNotNull(jSTypeExpressionList10);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertNull(jSTypeExpression12);
    }

    @Test
    public void test26032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26032");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        boolean boolean6 = jSDocInfo0.hasReturnType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection7 = jSDocInfo0.getMarkers();
        boolean boolean8 = jSDocInfo0.isExport();
        jSDocInfo0.setDeprecated(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(markerCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test26033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26033");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isTypeOf();
        boolean boolean23 = node19.isAssignAdd();
        boolean boolean24 = node19.isStringKey();
        node19.setOptionalArg(true);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean32 = node31.isFromExterns();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(39, node31, (int) '4', 51);
        boolean boolean36 = node31.isIn();
        com.google.javascript.rhino.Node node37 = node19.useSourceInfoFrom(node31);
        java.lang.String str38 = node31.toString();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "STRING  0" + "'", str38, "STRING  0");
    }

    @Test
    public void test26034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26034");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str5 = jSDocInfo0.toString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getTypedefType();
        boolean boolean9 = jSDocInfo0.isDefine();
        java.lang.String str10 = jSDocInfo0.getOriginalCommentString();
        boolean boolean11 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test26035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26035");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        boolean boolean49 = node47.isVar();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node14, node47);
        boolean boolean51 = node14.isAssignAdd();
        com.google.javascript.rhino.Node node52 = node14.removeFirstChild();
        node52.setVarArgs(true);
        boolean boolean55 = node52.hasChildren();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(53, "OR 51");
        boolean boolean59 = node58.isLabel();
        java.util.Set<java.lang.String> strSet60 = node58.getDirectives();
        java.lang.Object obj62 = node58.getProp(44);
        boolean boolean63 = node58.isQualifiedName();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node70 = node68.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (byte) -1, node68, (int) (byte) 1, (int) '#');
        java.lang.String str74 = node68.toStringTree();
        boolean boolean75 = node68.isStringKey();
        boolean boolean76 = node68.isAnd();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile77 = node68.getStaticSourceFile();
        boolean boolean78 = node68.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable79 = node68.children();
        com.google.javascript.rhino.Node node80 = node58.clonePropsFrom(node68);
        int int81 = node52.getIndexOfChild(node68);
        boolean boolean82 = node52.isTry();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(strSet60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "STRING  0\n" + "'", str74, "STRING  0\n");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(staticSourceFile77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(nodeIterable79);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test26036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26036");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        java.lang.String str7 = jSDocInfo0.getDescription();
        java.lang.String str8 = jSDocInfo0.getLicense();
        boolean boolean9 = jSDocInfo0.isImplicitCast();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean11 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getThisType();
        boolean boolean14 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression12);
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test26037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26037");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        jSDocInfo0.addSuppression("STRING  0");
        boolean boolean5 = jSDocInfo0.isConstant();
        java.util.Collection<java.lang.String> strCollection6 = jSDocInfo0.getAuthors();
        boolean boolean7 = jSDocInfo0.isConstructor();
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getBaseType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test26038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26038");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        jSDocInfo0.addSuppression("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getBaseType();
        boolean boolean6 = jSDocInfo0.isImplicitCast();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.lang.String str8 = jSDocInfo0.getLicense();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getReferences();
        boolean boolean10 = jSDocInfo0.isConstructor();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getTypedefType();
        boolean boolean12 = jSDocInfo0.isInterface();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test26039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26039");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str5 = jSDocInfo0.toString();
        boolean boolean6 = jSDocInfo0.isNoShadow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str8 = jSDocInfo7.getVersion();
        boolean boolean9 = jSDocInfo7.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo7.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo7.getImplementedInterfaces();
        java.lang.String str12 = jSDocInfo7.getMeaning();
        boolean boolean13 = jSDocInfo7.isNoSideEffects();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str15 = jSDocInfo14.getVersion();
        boolean boolean16 = jSDocInfo14.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet17 = jSDocInfo14.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList18 = jSDocInfo14.getImplementedInterfaces();
        boolean boolean19 = jSDocInfo14.hasReturnType();
        boolean boolean20 = jSDocInfo14.hasBaseType();
        boolean boolean21 = jSDocInfo14.isNoCompile();
        boolean boolean22 = jSDocInfo14.hasBaseType();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node27.setCharno(1);
        boolean boolean30 = node27.isRegExp();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        boolean boolean41 = node35.isDo();
        boolean boolean42 = node35.isDefaultCase();
        node35.setQuotedString();
        com.google.javascript.rhino.Node node44 = node27.useSourceInfoFromForTree(node35);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node48.setCharno(1);
        java.util.Set<java.lang.String> strSet51 = node48.getDirectives();
        node48.setLength(0);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node60 = node58.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) -1, node58, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(0, node44, node48, node63, (int) 'a', (int) (short) 0);
        boolean boolean67 = node44.isNull();
        com.google.javascript.rhino.jstype.JSType jSType68 = node44.getJSType();
        jSDocInfo14.setAssociatedNode(node44);
        boolean boolean70 = jSDocInfo14.shouldPreserveTry();
        boolean boolean71 = jSDocInfo14.hasModifies();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str73 = jSDocInfo72.getVersion();
        boolean boolean74 = jSDocInfo72.hasEnumParameterType();
        java.lang.String str76 = jSDocInfo72.getDescriptionForParameter("STRING  0\n");
        boolean boolean77 = jSDocInfo72.hasTypedefType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str79 = jSDocInfo78.getVersion();
        boolean boolean80 = jSDocInfo78.hasEnumParameterType();
        boolean boolean81 = jSDocInfo78.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression82 = jSDocInfo78.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility83 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo78.setVisibility(visibility83);
        jSDocInfo72.setVisibility(visibility83);
        jSDocInfo14.setVisibility(visibility83);
        jSDocInfo7.setVisibility(visibility83);
        jSDocInfo0.setVisibility(visibility83);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression90 = jSDocInfo0.getParameterType("STRING  0 [source_file: STRING  0\n]\n");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList91 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean92 = jSDocInfo0.hasThisType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(jSTypeExpressionList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(strSet51);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(jSType68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(jSTypeExpression82);
        org.junit.Assert.assertTrue("'" + visibility83 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility83.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression90);
        org.junit.Assert.assertNotNull(jSTypeExpressionList91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test26040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26040");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        boolean boolean7 = jSDocInfo0.hasReturnType();
        java.lang.String str8 = jSDocInfo0.getDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str10 = jSDocInfo0.getOriginalCommentString();
        java.lang.String str11 = jSDocInfo0.getLicense();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test26041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26041");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 47, (int) (short) 0);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        boolean boolean15 = node9.isDo();
        boolean boolean16 = node9.isDefaultCase();
        node9.setQuotedString();
        boolean boolean18 = node9.isDec();
        boolean boolean19 = node9.isTypeOf();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean24 = node23.isThrow();
        java.lang.String str28 = node23.toString(true, false, true);
        java.lang.String str29 = node23.getQualifiedName();
        boolean boolean30 = node23.isIn();
        com.google.javascript.rhino.Node node31 = node23.cloneTree();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node35.setCharno(1);
        java.util.Set<java.lang.String> strSet38 = node35.getDirectives();
        boolean boolean39 = node35.isHook();
        node31.addChildToFront(node35);
        com.google.javascript.rhino.Node node41 = node35.getLastSibling();
        java.lang.Object obj43 = node41.getProp(2);
        com.google.javascript.rhino.Node node44 = node9.useSourceInfoFrom(node41);
        node9.removeProp(10);
        com.google.javascript.rhino.Node node47 = node4.copyInformationFrom(node9);
        boolean boolean48 = node9.isSyntheticBlock();
        boolean boolean49 = node9.isTrue();
        node9.removeProp(97);
        boolean boolean52 = node9.isExprResult();
        com.google.javascript.rhino.Node node53 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(2, node9, node53, 151560, 221219);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "STRING  0" + "'", str28, "STRING  0");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(strSet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test26042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26042");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.lang.String str3 = jSDocInfo0.getOriginalCommentString();
        boolean boolean4 = jSDocInfo0.hasModifies();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean6 = jSDocInfo0.containsDeclaration();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getParameterType("(STRING  0\n)");
        int int9 = jSDocInfo0.getParameterCount();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection11 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNotNull(markerCollection11);
    }

    @Test
    public void test26043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26043");
        java.lang.String[] strArray2 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean10 = strSet3.addAll((java.util.Collection<java.lang.String>) strList8);
        boolean boolean12 = strSet3.remove((java.lang.Object) 1L);
        java.lang.String[] strArray15 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        boolean boolean19 = strSet16.add("STRING  0");
        java.lang.String[] strArray22 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        boolean boolean30 = strSet23.addAll((java.util.Collection<java.lang.String>) strList28);
        boolean boolean31 = strSet16.containsAll((java.util.Collection<java.lang.String>) strList28);
        boolean boolean32 = strSet3.addAll((java.util.Collection<java.lang.String>) strSet16);
        boolean boolean33 = strSet16.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str35 = jSDocInfo34.getVersion();
        java.lang.String str36 = jSDocInfo34.getFileOverview();
        jSDocInfo34.addSuppression("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression39 = jSDocInfo34.getBaseType();
        boolean boolean40 = jSDocInfo34.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet41 = jSDocInfo34.getSuppressions();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str43 = jSDocInfo42.getVersion();
        boolean boolean44 = jSDocInfo42.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet45 = jSDocInfo42.getParameterNames();
        jSDocInfo42.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection48 = jSDocInfo42.getTypeNodes();
        java.lang.String str49 = jSDocInfo42.getDescription();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node53.setCharno(1);
        boolean boolean56 = node53.isRegExp();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node63 = node61.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (byte) -1, node61, (int) (byte) 1, (int) '#');
        boolean boolean67 = node61.isDo();
        boolean boolean68 = node61.isDefaultCase();
        node61.setQuotedString();
        com.google.javascript.rhino.Node node70 = node53.useSourceInfoFromForTree(node61);
        node61.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean74 = node61.isVarArgs();
        jSDocInfo42.setAssociatedNode(node61);
        java.lang.String str76 = node61.toStringTree();
        boolean boolean77 = strSet41.equals((java.lang.Object) node61);
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str79 = jSDocInfo78.getVersion();
        boolean boolean80 = jSDocInfo78.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet81 = jSDocInfo78.getParameterNames();
        jSDocInfo78.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection84 = jSDocInfo78.getTypeNodes();
        java.lang.String str86 = jSDocInfo78.getDescriptionForParameter("Not declared as a constructor");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression87 = jSDocInfo78.getReturnType();
        int int88 = jSDocInfo78.getParameterCount();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression89 = jSDocInfo78.getReturnType();
        java.util.Set<java.lang.String> strSet90 = jSDocInfo78.getParameterNames();
        boolean boolean91 = strSet41.containsAll((java.util.Collection<java.lang.String>) strSet90);
        boolean boolean92 = strSet16.removeAll((java.util.Collection<java.lang.String>) strSet90);
        strSet16.clear();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(jSTypeExpression39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(nodeCollection48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "STRING  0 [quoted: 1]\n" + "'", str76, "STRING  0 [quoted: 1]\n");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(nodeCollection84);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNull(jSTypeExpression87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNull(jSTypeExpression89);
        org.junit.Assert.assertNotNull(strSet90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test26044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26044");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getPositionOnEndLine();
        boolean boolean2 = typePosition0.hasBrackets();
        boolean boolean3 = typePosition0.hasBrackets();
        int int4 = typePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node5 = typePosition0.getItem();
        int int6 = typePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        boolean boolean20 = node11.isDec();
        int int21 = node11.getChildCount();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Named type with empty name component");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node26 = node11.useSourceInfoFrom(node24);
        node11.removeProp(40);
        typePosition0.setItem(node11);
        boolean boolean30 = typePosition0.hasBrackets();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test26045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26045");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        java.lang.String str5 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        boolean boolean6 = jSDocInfo0.hasEnumParameterType();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        java.lang.String str8 = jSDocInfo0.getFileOverview();
        boolean boolean9 = jSDocInfo0.hasThisType();
        boolean boolean10 = jSDocInfo0.isJavaDispatch();
        boolean boolean11 = jSDocInfo0.isImplicitCast();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getThrownTypes();
        java.lang.String str13 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test26046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26046");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(39);
        int int2 = sideEffectFlags1.valueOf();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setAllFlags();
        boolean boolean5 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.setMutatesGlobalState();
        int int7 = sideEffectFlags1.valueOf();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test26047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26047");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("((ERROR 1))", 35, 44);
        node3.putBooleanProp(35, true);
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str8 = jSDocInfo7.getVersion();
        boolean boolean9 = jSDocInfo7.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo7.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo7.getImplementedInterfaces();
        boolean boolean12 = jSDocInfo7.hasReturnType();
        boolean boolean13 = jSDocInfo7.hasBaseType();
        boolean boolean14 = jSDocInfo7.isNoCompile();
        boolean boolean15 = jSDocInfo7.hasBaseType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str17 = jSDocInfo16.getVersion();
        java.lang.String str18 = jSDocInfo16.getFileOverview();
        jSDocInfo16.addSuppression("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = jSDocInfo16.getBaseType();
        boolean boolean22 = jSDocInfo16.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo16.getSuppressions();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int28 = node27.getType();
        int int29 = node27.getCharno();
        boolean boolean30 = strSet23.equals((java.lang.Object) node27);
        boolean boolean31 = node27.isOptionalArg();
        int int32 = node27.getSourceOffset();
        jSDocInfo7.setAssociatedNode(node27);
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str35 = jSDocInfo34.getVersion();
        boolean boolean36 = jSDocInfo34.hasEnumParameterType();
        boolean boolean37 = jSDocInfo34.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = jSDocInfo34.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility39 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo34.setVisibility(visibility39);
        boolean boolean41 = jSDocInfo34.isJavaDispatch();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList42 = jSDocInfo34.getImplementedInterfaces();
        boolean boolean43 = jSDocInfo34.containsDeclaration();
        boolean boolean44 = jSDocInfo34.isNoSideEffects();
        int int45 = jSDocInfo34.getExtendedInterfacesCount();
        com.google.common.collect.ImmutableList<java.lang.String> strList46 = jSDocInfo34.getTemplateTypeNames();
        java.lang.String str47 = jSDocInfo34.getLicense();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node51.setCharno(1);
        boolean boolean54 = node51.isRegExp();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node61 = node59.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node59, (int) (byte) 1, (int) '#');
        boolean boolean65 = node59.isDo();
        boolean boolean66 = node59.isDefaultCase();
        node59.setQuotedString();
        com.google.javascript.rhino.Node node68 = node51.useSourceInfoFromForTree(node59);
        node68.setSourceFileForTesting("STRING  0\n");
        int int71 = node68.getSourcePosition();
        int int72 = node68.getSourcePosition();
        java.lang.String str73 = node68.toStringTree();
        jSDocInfo34.setAssociatedNode(node68);
        com.google.javascript.rhino.Node node75 = node27.useSourceInfoFromForTree(node68);
        boolean boolean76 = node3.hasChild(node27);
        node27.setQuotedString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(jSTypeExpression21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 40 + "'", int28 == 40);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSTypeExpression38);
        org.junit.Assert.assertTrue("'" + visibility39 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility39.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "STRING  0 [source_file: STRING  0\n]\n" + "'", str73, "STRING  0 [source_file: STRING  0\n]\n");
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test26048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26048");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node4.siblings();
        boolean boolean16 = node4.isEmpty();
        com.google.javascript.rhino.Node node17 = node4.getParent();
        boolean boolean18 = node17.isRegExp();
        boolean boolean19 = node17.isScript();
        boolean boolean20 = node17.isOnlyModifiesThisCall();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test26049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26049");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(192612, "(STRING  0 [quoted: 1] [synthetic: 1]\n)");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test26050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26050");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(49);
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setMutatesGlobalState();
        sideEffectFlags1.setMutatesGlobalState();
    }

    @Test
    public void test26051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26051");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 47, (int) (short) 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isDo();
        boolean boolean15 = node8.isDefaultCase();
        node8.setQuotedString();
        boolean boolean17 = node8.isDec();
        boolean boolean18 = node8.isTypeOf();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean23 = node22.isThrow();
        java.lang.String str27 = node22.toString(true, false, true);
        java.lang.String str28 = node22.getQualifiedName();
        boolean boolean29 = node22.isIn();
        com.google.javascript.rhino.Node node30 = node22.cloneTree();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node34.setCharno(1);
        java.util.Set<java.lang.String> strSet37 = node34.getDirectives();
        boolean boolean38 = node34.isHook();
        node30.addChildToFront(node34);
        com.google.javascript.rhino.Node node40 = node34.getLastSibling();
        java.lang.Object obj42 = node40.getProp(2);
        com.google.javascript.rhino.Node node43 = node8.useSourceInfoFrom(node40);
        node8.removeProp(10);
        com.google.javascript.rhino.Node node46 = node3.copyInformationFrom(node8);
        boolean boolean47 = node3.isVarArgs();
        boolean boolean48 = node3.isIn();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "STRING  0" + "'", str27, "STRING  0");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(strSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test26052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26052");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(204810, 1044480, 9);
    }

    @Test
    public void test26053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26053");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getSuppressions();
        int int9 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean10 = jSDocInfo0.isNoCompile();
        java.lang.String str11 = jSDocInfo0.toString();
        boolean boolean12 = jSDocInfo0.isIdGenerator();
        jSDocInfo0.addSuppression("");
        java.lang.String str15 = jSDocInfo0.getOriginalCommentString();
        java.lang.String str16 = jSDocInfo0.getBlockDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSDocInfo" + "'", str11, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test26054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26054");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        boolean boolean12 = node4.isFor();
        node4.setOptionalArg(false);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node18.setCharno(1);
        boolean boolean21 = node18.isRegExp();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node28 = node26.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) -1, node26, (int) (byte) 1, (int) '#');
        boolean boolean32 = node26.isDo();
        boolean boolean33 = node26.isDefaultCase();
        node26.setQuotedString();
        com.google.javascript.rhino.Node node35 = node18.useSourceInfoFromForTree(node26);
        node26.putIntProp((int) (byte) 100, (int) (byte) 0);
        node26.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean42 = node26.isInc();
        node26.setQuotedString();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int48 = node47.getSourcePosition();
        int int49 = node47.getType();
        boolean boolean50 = node47.isLabel();
        node47.setSourceFileForTesting("STRING  0 [quoted: 1]\n");
        boolean boolean53 = node26.isEquivalentToTyped(node47);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 39);
        com.google.javascript.rhino.Node node57 = node55.getAncestor(44);
        boolean boolean58 = node55.isAssignAdd();
        boolean boolean59 = node47.hasChild(node55);
        com.google.javascript.rhino.Node node60 = node4.copyInformationFromForTree(node47);
        int int61 = node47.getChildCount();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 40 + "'", int49 == 40);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test26055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26055");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) -1, node28, (int) (byte) 1, (int) '#');
        boolean boolean34 = node28.isScript();
        com.google.javascript.rhino.InputId inputId35 = node28.getInputId();
        com.google.javascript.rhino.Node node36 = node11.useSourceInfoFrom(node28);
        boolean boolean37 = node11.isTrue();
        boolean boolean38 = node11.isSetterDef();
        boolean boolean39 = node11.isComma();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition40 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean41 = typePosition40.hasBrackets();
        int int42 = typePosition40.getPositionOnStartLine();
        int int43 = typePosition40.getPositionOnEndLine();
        typePosition40.setPositionInformation(30, 36, 40, (int) (short) 10);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 6);
        typePosition40.setItem(node50);
        int int52 = node11.getIndexOfChild(node50);
        java.lang.String str53 = node50.getSourceFileName();
        com.google.javascript.rhino.Node node54 = node50.cloneNode();
        boolean boolean55 = node54.isDec();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test26056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26056");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        boolean boolean27 = node13.isThis();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        boolean boolean49 = node47.isVar();
        boolean boolean50 = node47.isTypeOf();
        boolean boolean52 = node47.getBooleanProp((int) (byte) 10);
        boolean boolean53 = node47.isTrue();
        com.google.javascript.rhino.Node node54 = node13.useSourceInfoIfMissingFromForTree(node47);
        com.google.javascript.rhino.Node node55 = node13.removeFirstChild();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test26057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26057");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        boolean boolean5 = node3.isSwitch();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) -1, node10, (int) (byte) 1, (int) '#');
        boolean boolean16 = node10.isDo();
        boolean boolean17 = node10.isDefaultCase();
        node10.setQuotedString();
        boolean boolean19 = node10.isDec();
        boolean boolean20 = node10.isLabel();
        boolean boolean21 = node10.isSetterDef();
        boolean boolean22 = node10.isRegExp();
        boolean boolean23 = node10.isName();
        boolean boolean24 = node10.isVoid();
        com.google.javascript.rhino.Node node25 = node10.cloneNode();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node25);
        boolean boolean27 = node26.isRegExp();
        node26.setSourceEncodedPositionForTree(2);
        int int30 = node26.getSourcePosition();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int35 = node34.getType();
        com.google.javascript.rhino.Node node36 = node34.cloneNode();
        boolean boolean37 = node34.isInc();
        boolean boolean38 = node34.isAnd();
        com.google.javascript.rhino.Node node39 = node26.copyInformationFrom(node34);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node34.children();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str42 = jSDocInfo41.getVersion();
        boolean boolean43 = jSDocInfo41.hasEnumParameterType();
        java.lang.String str45 = jSDocInfo41.getDescriptionForParameter("STRING  0\n");
        java.lang.String str46 = jSDocInfo41.getDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList47 = jSDocInfo41.getExtendedInterfaces();
        boolean boolean48 = jSDocInfo41.hasThisType();
        boolean boolean49 = jSDocInfo41.hasTypedefType();
        node34.setJSDocInfo(jSDocInfo41);
        boolean boolean51 = node34.isTry();
        com.google.javascript.rhino.Node node52 = node34.getParent();
        boolean boolean53 = node34.isThrow();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 40 + "'", int35 == 40);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(jSTypeExpressionList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test26058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26058");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        boolean boolean6 = node5.isExprResult();
        boolean boolean7 = node5.isInc();
        boolean boolean8 = node5.isLabelName();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(409601, node5);
        boolean boolean10 = node9.hasMoreThanOneChild();
        boolean boolean11 = node9.isBlock();
        com.google.javascript.rhino.Node node12 = node9.getNext();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test26059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26059");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        com.google.javascript.rhino.InputId inputId11 = node4.getInputId();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node15.setCharno(1);
        boolean boolean18 = node15.isRegExp();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node23.isDo();
        boolean boolean30 = node23.isDefaultCase();
        node23.setQuotedString();
        com.google.javascript.rhino.Node node32 = node15.useSourceInfoFromForTree(node23);
        node23.putIntProp((int) (byte) 100, (int) (byte) 0);
        node23.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        node23.detachChildren();
        com.google.javascript.rhino.Node node40 = node4.useSourceInfoIfMissingFromForTree(node23);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean45 = node44.isThrow();
        java.lang.String str49 = node44.toString(true, false, true);
        node44.setIsSyntheticBlock(true);
        boolean boolean52 = node44.isTry();
        java.lang.String str53 = node44.toStringTree();
        com.google.javascript.rhino.Node node54 = node4.copyInformationFrom(node44);
        com.google.javascript.rhino.Node node55 = node54.getParent();
        int int56 = node54.getType();
        boolean boolean57 = node54.isThrow();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "STRING  0" + "'", str49, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "STRING  0 [synthetic: 1]\n" + "'", str53, "STRING  0 [synthetic: 1]\n");
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 40 + "'", int56 == 40);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test26060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26060");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str5 = jSDocInfo0.getMeaning();
        boolean boolean6 = jSDocInfo0.isNoSideEffects();
        boolean boolean7 = jSDocInfo0.isConstant();
        boolean boolean9 = jSDocInfo0.hasParameter("Not declared as a type name");
        int int10 = jSDocInfo0.getExtendedInterfacesCount();
        java.util.Collection<java.lang.String> strCollection11 = jSDocInfo0.getReferences();
        boolean boolean12 = jSDocInfo0.isConstructor();
        jSDocInfo0.setDeprecated(true);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList15 = jSDocInfo0.getThrownTypes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList15);
    }

    @Test
    public void test26061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26061");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(52, 0, 43);
        boolean boolean5 = node4.isString();
        java.lang.String str6 = node4.toStringTree();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(32, node4, 36, (int) (short) 1);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int14 = node13.getSourcePosition();
        int int15 = node13.getType();
        boolean boolean16 = node13.isLabel();
        com.google.javascript.rhino.Node node17 = node13.getFirstChild();
        com.google.javascript.rhino.Node node18 = node9.copyInformationFromForTree(node13);
        boolean boolean19 = node9.isContinue();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(15, "STRING  0 [source_file: Named type with empty name component]");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.siblings();
        java.lang.String str25 = node23.getQualifiedName();
        boolean boolean26 = node23.isFromExterns();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean32 = node31.isThrow();
        java.lang.String str36 = node31.toString(true, false, true);
        java.lang.String str37 = node31.getQualifiedName();
        boolean boolean38 = node31.isIn();
        com.google.javascript.rhino.Node node39 = node31.cloneTree();
        boolean boolean40 = node39.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(40, node39);
        com.google.javascript.rhino.Node node42 = node41.removeFirstChild();
        boolean boolean43 = node41.isTry();
        int int44 = node23.getIndexOfChild(node41);
        node9.putProp((int) '4', (java.lang.Object) node23);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "INSTANCEOF 0\n" + "'", str6, "INSTANCEOF 0\n");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "STRING  0" + "'", str36, "STRING  0");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test26062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26062");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str5 = jSDocInfo0.toString();
        boolean boolean6 = jSDocInfo0.isNoShadow();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test26063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26063");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isIn();
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        boolean boolean12 = node11.isUnscopedQualifiedName();
        boolean boolean13 = node11.isDec();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node18.isDo();
        boolean boolean25 = node18.isDefaultCase();
        node18.setQuotedString();
        boolean boolean27 = node18.isDec();
        boolean boolean28 = node18.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node18.siblings();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(51);
        java.lang.String str32 = node18.checkTreeEquals(node31);
        boolean boolean33 = node18.isOr();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str35 = jSDocInfo34.getVersion();
        boolean boolean36 = jSDocInfo34.hasEnumParameterType();
        java.lang.String str38 = jSDocInfo34.getDescriptionForParameter("STRING  0\n");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList39 = jSDocInfo34.getExtendedInterfaces();
        node18.setJSDocInfo(jSDocInfo34);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node51 = node49.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) -1, node49, (int) (byte) 1, (int) '#');
        boolean boolean55 = node49.isScript();
        node49.setQuotedString();
        com.google.javascript.rhino.Node node57 = node44.srcrefTree(node49);
        boolean boolean58 = node49.isBreak();
        boolean boolean59 = node18.hasChild(node49);
        int int60 = node49.getCharno();
        node49.detachChildren();
        boolean boolean62 = node49.isName();
        com.google.javascript.rhino.Node node63 = node11.useSourceInfoFrom(node49);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "STRING  0" + "'", str8, "STRING  0");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n" + "'", str32, "Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(jSTypeExpressionList39);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
    }

    @Test
    public void test26064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26064");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(49, "STRING  0\n");
        com.google.javascript.rhino.Node node24 = node9.clonePropsFrom(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int29 = node28.getType();
        com.google.javascript.rhino.Node node30 = node28.cloneNode();
        com.google.javascript.rhino.Node node31 = node24.useSourceInfoFrom(node28);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition33 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition33.setPositionInformation(8, 36, 31, (int) (short) 10);
        java.lang.String str39 = stringPosition33.getItem();
        stringPosition33.setItem("Not declared as a type name");
        int int42 = stringPosition33.getPositionOnStartLine();
        node31.putProp(48, (java.lang.Object) int42);
        boolean boolean44 = node31.hasOneChild();
        com.google.javascript.rhino.Node node45 = node31.removeFirstChild();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 40 + "'", int29 == 40);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 36 + "'", int42 == 36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node45);
    }

    @Test
    public void test26065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26065");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node32 = node4.srcref(node31);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean37 = node36.isFromExterns();
        boolean boolean38 = node32.hasChild(node36);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(52, node36);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node43.setCharno(1);
        java.util.Set<java.lang.String> strSet46 = node43.getDirectives();
        node43.setCharno((int) (short) -1);
        boolean boolean49 = node43.isRegExp();
        node36.addChildrenToFront(node43);
        boolean boolean51 = node36.isVoid();
        boolean boolean52 = node36.isArrayLit();
        boolean boolean53 = node36.isHook();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(strSet46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test26066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26066");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getEndLine();
        int int2 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node3 = null;
        namePosition0.setItem(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node8.setCharno(1);
        java.util.Set<java.lang.String> strSet11 = node8.getDirectives();
        namePosition0.setItem(node8);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node23 = node21.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) -1, node21, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node33 = node31.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) -1, node31, (int) (byte) 1, (int) '#');
        boolean boolean37 = node26.hasChild(node36);
        int int38 = node26.getCharno();
        com.google.javascript.rhino.Node node39 = node16.useSourceInfoIfMissingFrom(node26);
        boolean boolean40 = node26.isAssignAdd();
        namePosition0.setItem(node26);
        java.lang.String[] strArray44 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = strSet45.addAll((java.util.Collection<java.lang.String>) strList50);
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str54 = jSDocInfo53.getVersion();
        java.lang.String str55 = jSDocInfo53.getFileOverview();
        boolean boolean56 = jSDocInfo53.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet57 = jSDocInfo53.getParameterNames();
        boolean boolean58 = strSet45.retainAll((java.util.Collection<java.lang.String>) strSet57);
        java.lang.String[] strArray61 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        boolean boolean69 = strSet62.addAll((java.util.Collection<java.lang.String>) strList67);
        boolean boolean70 = strSet45.containsAll((java.util.Collection<java.lang.String>) strSet62);
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str72 = jSDocInfo71.getVersion();
        boolean boolean73 = jSDocInfo71.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet74 = jSDocInfo71.getParameterNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo75 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str76 = jSDocInfo75.getVersion();
        java.lang.String str77 = jSDocInfo75.getFileOverview();
        boolean boolean78 = jSDocInfo75.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet79 = jSDocInfo75.getParameterNames();
        java.util.Iterator<java.lang.String> strItor80 = strSet79.iterator();
        boolean boolean81 = strSet79.isEmpty();
        boolean boolean82 = strSet74.containsAll((java.util.Collection<java.lang.String>) strSet79);
        boolean boolean83 = strSet45.retainAll((java.util.Collection<java.lang.String>) strSet74);
        node26.setDirectives((java.util.Set<java.lang.String>) strSet45);
        boolean boolean85 = node26.isTry();
        // The following exception was thrown during execution in test generation
        try {
            int int87 = node26.getExistingIntProp((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(strItor80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test26067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26067");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        com.google.javascript.rhino.InputId inputId11 = node4.getInputId();
        boolean boolean12 = node4.isDelProp();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder13 = node4.getJsDocBuilderForNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str16 = jSDocInfo15.getVersion();
        boolean boolean17 = jSDocInfo15.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet18 = jSDocInfo15.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList19 = jSDocInfo15.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList20 = jSDocInfo15.getThrownTypes();
        java.util.Set<java.lang.String> strSet21 = jSDocInfo15.getParameterNames();
        node4.putProp((-1), (java.lang.Object) jSDocInfo15);
        int int23 = jSDocInfo15.getParameterCount();
        boolean boolean25 = jSDocInfo15.hasParameter("Not declared as a constructor");
        boolean boolean26 = jSDocInfo15.hasReturnType();
        int int27 = jSDocInfo15.getExtendedInterfacesCount();
        boolean boolean28 = jSDocInfo15.isNoShadow();
        java.lang.String str29 = jSDocInfo15.getBlockDescription();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(jSTypeExpressionList19);
        org.junit.Assert.assertNotNull(jSTypeExpressionList20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test26068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26068");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        node26.setLength((int) ' ');
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) -1, node37, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        boolean boolean53 = node42.hasChild(node52);
        int int54 = node42.getCharno();
        com.google.javascript.rhino.Node node55 = node32.useSourceInfoIfMissingFrom(node42);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node60 = node32.srcref(node59);
        boolean boolean61 = node26.isEquivalentToTyped(node32);
        node32.addSuppression("STRING  0 [synthetic: 1]\n");
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean68 = node67.isThrow();
        java.lang.String str72 = node67.toString(true, false, true);
        int int74 = node67.getIntProp(51);
        node67.addSuppression("STRING  0 [quoted: 1]\n");
        com.google.javascript.rhino.Node node77 = node32.useSourceInfoFrom(node67);
        boolean boolean78 = node77.isTrue();
        boolean boolean79 = node77.isAssign();
        boolean boolean80 = node77.isParamList();
        boolean boolean81 = node77.isIf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable82 = node77.children();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "STRING  0" + "'", str72, "STRING  0");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(nodeIterable82);
    }

    @Test
    public void test26069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26069");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        boolean boolean6 = jSDocInfo0.isImplicitCast();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str9 = jSDocInfo8.getVersion();
        boolean boolean10 = jSDocInfo8.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo8.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo8.setVisibility(visibility12);
        jSDocInfo0.setVisibility(visibility12);
        java.util.Set<java.lang.String> strSet15 = jSDocInfo0.getSuppressions();
        boolean boolean16 = jSDocInfo0.hasBaseType();
        java.lang.String str17 = jSDocInfo0.getDescription();
        boolean boolean18 = jSDocInfo0.isInterface();
        jSDocInfo0.setDeprecated(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + visibility12 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility12.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test26070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26070");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, (int) '#');
        boolean boolean4 = node3.hasMoreThanOneChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = node3.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26071");
        java.lang.String[] strArray2 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.add("STRING  0");
        java.lang.String[] strArray9 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        boolean boolean17 = strSet10.addAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean18 = strSet3.containsAll((java.util.Collection<java.lang.String>) strList15);
        java.lang.String[] strArray21 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        boolean boolean25 = strSet22.add("STRING  0");
        java.lang.String[] strArray28 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        boolean boolean36 = strSet29.addAll((java.util.Collection<java.lang.String>) strList34);
        boolean boolean37 = strSet22.containsAll((java.util.Collection<java.lang.String>) strList34);
        boolean boolean38 = strSet3.containsAll((java.util.Collection<java.lang.String>) strSet22);
        java.lang.String[] strArray41 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = strSet42.addAll((java.util.Collection<java.lang.String>) strList47);
        strSet42.clear();
        boolean boolean51 = strSet22.retainAll((java.util.Collection<java.lang.String>) strSet42);
        strSet22.clear();
        boolean boolean54 = strSet22.add("NUMBER 4095.0 100\n");
        boolean boolean55 = strSet22.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str57 = jSDocInfo56.getVersion();
        boolean boolean58 = jSDocInfo56.hasEnumParameterType();
        boolean boolean59 = jSDocInfo56.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression61 = jSDocInfo56.getParameterType("STRING  0\n");
        boolean boolean62 = jSDocInfo56.isJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression63 = jSDocInfo56.getReturnType();
        boolean boolean64 = jSDocInfo56.isOverride();
        java.lang.String str65 = jSDocInfo56.getReturnDescription();
        java.util.Set<java.lang.String> strSet66 = jSDocInfo56.getSuppressions();
        java.lang.String str67 = jSDocInfo56.getSourceName();
        boolean boolean69 = jSDocInfo56.hasParameter("");
        boolean boolean70 = jSDocInfo56.isConsistentIdGenerator();
        boolean boolean71 = strSet22.contains((java.lang.Object) jSDocInfo56);
        java.util.Set<java.lang.String> strSet72 = jSDocInfo56.getSuppressions();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(jSTypeExpression61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(jSTypeExpression63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strSet72);
    }

    @Test
    public void test26072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26072");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getEnumParameterType();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getSuppressions();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int14 = node13.getSourcePosition();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node23.isScript();
        node23.setQuotedString();
        com.google.javascript.rhino.Node node31 = node18.srcrefTree(node23);
        boolean boolean32 = node31.isIf();
        com.google.javascript.rhino.Node node33 = node31.getParent();
        node31.removeProp((int) 'a');
        int int36 = node31.getLineno();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node42 = node41.removeFirstChild();
        com.google.javascript.rhino.Node[] nodeArray43 = new com.google.javascript.rhino.Node[] { node13, node31, node41 };
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(50, nodeArray43, 4095, (int) (short) 0);
        com.google.javascript.rhino.Node[] nodeArray47 = strSet8.toArray(nodeArray43);
        java.util.stream.Stream<java.lang.String> strStream48 = strSet8.stream();
        java.util.stream.Stream<java.lang.String> strStream49 = strSet8.stream();
        java.util.stream.Stream<java.lang.String> strStream50 = strSet8.stream();
        strSet8.clear();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(nodeArray43);
        org.junit.Assert.assertNotNull(nodeArray47);
        org.junit.Assert.assertNotNull(strStream48);
        org.junit.Assert.assertNotNull(strStream49);
        org.junit.Assert.assertNotNull(strStream50);
    }

    @Test
    public void test26073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26073");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0L, (int) 'a', 45);
        com.google.javascript.rhino.Node node4 = node3.removeFirstChild();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test26074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26074");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        boolean boolean7 = node4.isRegExp();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isDo();
        boolean boolean19 = node12.isDefaultCase();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        java.util.Set<java.lang.String> strSet28 = node25.getDirectives();
        node25.setLength(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node21, node25, node40, (int) 'a', (int) (short) 0);
        boolean boolean44 = node21.isString();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node51 = node49.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) -1, node49, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node61 = node59.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node59, (int) (byte) 1, (int) '#');
        boolean boolean65 = node54.hasChild(node64);
        boolean boolean66 = node64.isVar();
        boolean boolean67 = node64.isTypeOf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node64.children();
        com.google.javascript.rhino.Node node69 = node21.srcref(node64);
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str71 = jSDocInfo70.toString();
        java.lang.String str72 = jSDocInfo70.getLicense();
        boolean boolean73 = jSDocInfo70.isConstructor();
        com.google.javascript.rhino.Node node74 = jSDocInfo70.getAssociatedNode();
        node21.setJSDocInfo(jSDocInfo70);
        java.util.Set<java.lang.String> strSet76 = jSDocInfo70.getParameterNames();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Named type with empty name component");
        boolean boolean80 = node79.isContinue();
        boolean boolean81 = node79.isQualifiedName();
        jSDocInfo70.setAssociatedNode(node79);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "JSDocInfo" + "'", str71, "JSDocInfo");
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test26075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26075");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(0, "(ERROR 1)", 39, 38);
        boolean boolean5 = node4.isFor();
        com.google.javascript.rhino.Node node6 = node4.getLastSibling();
        boolean boolean7 = node6.isNumber();
        boolean boolean8 = node6.isString();
        boolean boolean9 = node6.isDefaultCase();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test26076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26076");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        boolean boolean7 = jSDocInfo0.hasReturnType();
        boolean boolean8 = jSDocInfo0.isExpose();
        jSDocInfo0.setLicense("ERROR 1\n    STRING  0\n    STRING  0\n");
        boolean boolean11 = jSDocInfo0.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str13 = jSDocInfo12.getVersion();
        boolean boolean14 = jSDocInfo12.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet15 = jSDocInfo12.getParameterNames();
        jSDocInfo12.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection18 = jSDocInfo12.getTypeNodes();
        boolean boolean19 = jSDocInfo12.containsDeclaration();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = jSDocInfo12.getThisType();
        java.lang.String str21 = jSDocInfo12.getReturnDescription();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str23 = jSDocInfo22.getVersion();
        boolean boolean24 = jSDocInfo22.hasEnumParameterType();
        boolean boolean25 = jSDocInfo22.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = jSDocInfo22.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility27 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo22.setVisibility(visibility27);
        boolean boolean29 = jSDocInfo22.isJavaDispatch();
        jSDocInfo22.setLicense("Named type with empty name component");
        boolean boolean32 = jSDocInfo22.isInterface();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility33 = jSDocInfo22.getVisibility();
        jSDocInfo12.setVisibility(visibility33);
        jSDocInfo0.setVisibility(visibility33);
        boolean boolean36 = jSDocInfo0.isConstant();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(nodeCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jSTypeExpression20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(jSTypeExpression26);
        org.junit.Assert.assertTrue("'" + visibility27 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility27.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + visibility33 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility33.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test26077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26077");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node31 = node3.srcref(node30);
        boolean boolean32 = node31.isAssignAdd();
        boolean boolean33 = node31.hasChildren();
        java.lang.String str34 = node31.getQualifiedName();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node45 = node43.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (byte) -1, node43, (int) (byte) 1, (int) '#');
        boolean boolean49 = node43.isScript();
        node43.setQuotedString();
        com.google.javascript.rhino.Node node51 = node38.srcrefTree(node43);
        boolean boolean52 = node43.isBreak();
        java.lang.String str53 = node43.toStringTree();
        com.google.javascript.rhino.Node node54 = node43.cloneNode();
        boolean boolean55 = node31.hasChild(node43);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node62 = node60.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) -1, node60, (int) (byte) 1, (int) '#');
        boolean boolean66 = node60.isScript();
        com.google.javascript.rhino.InputId inputId67 = node60.getInputId();
        boolean boolean68 = node60.isDelProp();
        boolean boolean69 = node60.isCall();
        node60.removeProp(30);
        com.google.javascript.rhino.Node node72 = node60.cloneTree();
        com.google.javascript.rhino.Node node73 = node43.srcref(node72);
        // The following exception was thrown during execution in test generation
        try {
            double double74 = node72.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING  0 is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "STRING  0 [quoted: 1]\n" + "'", str53, "STRING  0 [quoted: 1]\n");
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(inputId67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node73);
    }

    @Test
    public void test26078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26078");
        com.google.javascript.rhino.Node[] nodeArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(8, nodeArray1, (int) '4', 192609);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26079");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getSuppressions();
        boolean boolean9 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getParameterType("Unknown class name");
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node18 = node16.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) -1, node16, (int) (byte) 1, (int) '#');
        boolean boolean22 = node16.isDo();
        boolean boolean23 = node16.isDefaultCase();
        node16.setQuotedString();
        boolean boolean25 = node16.isDec();
        boolean boolean26 = node16.hasMoreThanOneChild();
        boolean boolean27 = node16.isTrue();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str30 = jSDocInfo29.getVersion();
        boolean boolean31 = jSDocInfo29.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet32 = jSDocInfo29.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList33 = jSDocInfo29.getImplementedInterfaces();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean38 = node37.isThrow();
        java.lang.String str42 = node37.toString(true, false, true);
        jSDocInfo29.setAssociatedNode(node37);
        com.google.javascript.rhino.Node node44 = node37.removeFirstChild();
        boolean boolean45 = node37.isNumber();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(52, node37, 45, 2);
        boolean boolean49 = node37.isRegExp();
        com.google.javascript.rhino.Node node50 = node16.useSourceInfoFrom(node37);
        node16.setLineno((int) '#');
        jSDocInfo0.setAssociatedNode(node16);
        com.google.javascript.rhino.Node node54 = jSDocInfo0.getAssociatedNode();
        boolean boolean55 = jSDocInfo0.isConstant();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection56 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(jSTypeExpressionList33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "STRING  0" + "'", str42, "STRING  0");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(markerCollection56);
    }

    @Test
    public void test26080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26080");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition1 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition6 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition9 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition10 = marker0.getNameNode();
        org.junit.Assert.assertNull(nodeSourcePosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(typePosition5);
        org.junit.Assert.assertNull(nodeSourcePosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(stringPosition8);
        org.junit.Assert.assertNull(typePosition9);
        org.junit.Assert.assertNull(nodeSourcePosition10);
    }

    @Test
    public void test26081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26081");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node3.setType(5);
        node3.setWasEmptyNode(true);
        java.lang.Object obj26 = node3.getProp(192612);
        boolean boolean27 = node3.isArrayLit();
        com.google.javascript.rhino.Node node28 = node3.getNext();
        boolean boolean29 = node3.isArrayLit();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test26082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26082");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nNUMBER 54.0 52\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: NUMBER 54.0 52\n", (int) (short) 0, 12);
        com.google.javascript.rhino.Node node5 = node4.removeChildren();
        boolean boolean6 = node4.isOptionalArg();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(23, "ERROR 1\n    STRING  0\n");
        boolean boolean11 = node10.isCatch();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(37, node4, node7, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test26083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26083");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        boolean boolean7 = node4.isRegExp();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isDo();
        boolean boolean19 = node12.isDefaultCase();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        java.util.Set<java.lang.String> strSet28 = node25.getDirectives();
        node25.setLength(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node21, node25, node40, (int) 'a', (int) (short) 0);
        boolean boolean44 = node21.isString();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node51 = node49.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) -1, node49, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node61 = node59.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node59, (int) (byte) 1, (int) '#');
        boolean boolean65 = node54.hasChild(node64);
        boolean boolean66 = node64.isVar();
        boolean boolean67 = node64.isTypeOf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node64.children();
        com.google.javascript.rhino.Node node69 = node21.srcref(node64);
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str71 = jSDocInfo70.toString();
        java.lang.String str72 = jSDocInfo70.getLicense();
        boolean boolean73 = jSDocInfo70.isConstructor();
        com.google.javascript.rhino.Node node74 = jSDocInfo70.getAssociatedNode();
        node21.setJSDocInfo(jSDocInfo70);
        java.util.Set<java.lang.String> strSet76 = jSDocInfo70.getParameterNames();
        java.lang.String str77 = jSDocInfo70.getLicense();
        int int78 = jSDocInfo70.getParameterCount();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "JSDocInfo" + "'", str71, "JSDocInfo");
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test26084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26084");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean5 = node4.isThrow();
        boolean boolean6 = node4.isSwitch();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        boolean boolean20 = node11.isDec();
        boolean boolean21 = node11.isLabel();
        boolean boolean22 = node11.isSetterDef();
        boolean boolean23 = node11.isRegExp();
        boolean boolean24 = node11.isName();
        boolean boolean25 = node11.isVoid();
        com.google.javascript.rhino.Node node26 = node11.cloneNode();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node26);
        boolean boolean28 = node4.isFunction();
        boolean boolean29 = node4.isVoid();
        boolean boolean30 = node4.isUnscopedQualifiedName();
        boolean boolean31 = node4.isDefaultCase();
        boolean boolean32 = node4.isIf();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(19, node4);
        node33.detachChildren();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test26085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26085");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        boolean boolean4 = jSDocInfo0.hasBaseType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getEnumParameterType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getReturnType();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str8 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test26086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26086");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        com.google.javascript.rhino.Node node24 = node11.cloneNode();
        com.google.javascript.rhino.Node node25 = node11.getNext();
        com.google.javascript.rhino.Node node26 = node11.getLastSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test26087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26087");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        jSDocInfo0.addSuppression("STRING  0");
        boolean boolean5 = jSDocInfo0.isConstant();
        boolean boolean6 = jSDocInfo0.isDefine();
        boolean boolean7 = jSDocInfo0.isNoAlias();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str10 = jSDocInfo9.getVersion();
        boolean boolean11 = jSDocInfo9.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo9.getParameterNames();
        jSDocInfo9.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection15 = jSDocInfo9.getTypeNodes();
        boolean boolean16 = jSDocInfo9.hasReturnType();
        java.lang.String str17 = jSDocInfo9.getBlockDescription();
        boolean boolean18 = jSDocInfo9.hasReturnType();
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = jSDocInfo9.getTemplateTypeNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str21 = jSDocInfo20.getVersion();
        java.lang.String str22 = jSDocInfo20.getFileOverview();
        jSDocInfo20.addSuppression("STRING  0");
        boolean boolean25 = jSDocInfo20.isNoCompile();
        boolean boolean26 = jSDocInfo20.isOverride();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str28 = jSDocInfo27.getVersion();
        boolean boolean29 = jSDocInfo27.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet30 = jSDocInfo27.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility31 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo27.setVisibility(visibility31);
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str34 = jSDocInfo33.getVersion();
        boolean boolean35 = jSDocInfo33.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet36 = jSDocInfo33.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility37 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo33.setVisibility(visibility37);
        jSDocInfo27.setVisibility(visibility37);
        jSDocInfo20.setVisibility(visibility37);
        jSDocInfo9.setVisibility(visibility37);
        jSDocInfo0.setVisibility(visibility37);
        boolean boolean43 = jSDocInfo0.isNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression44 = jSDocInfo0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(nodeCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + visibility31 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility31.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + visibility37 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility37.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(jSTypeExpression44);
    }

    @Test
    public void test26088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26088");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        int int21 = node3.getCharno();
        boolean boolean22 = node3.isCall();
        int int23 = node3.getLength();
        boolean boolean24 = node3.isContinue();
        boolean boolean25 = node3.isScript();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test26089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26089");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        boolean boolean27 = node26.isLabelName();
        boolean boolean28 = node26.isArrayLit();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test26090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26090");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("STRING ");
        boolean boolean2 = node1.hasChildren();
        node1.setOptionalArg(false);
        node1.setSourceFileForTesting("STRING  1\n");
        boolean boolean7 = node1.isDo();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test26091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26091");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(49, "STRING  0\n");
        com.google.javascript.rhino.Node node24 = node9.clonePropsFrom(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int29 = node28.getType();
        com.google.javascript.rhino.Node node30 = node28.cloneNode();
        com.google.javascript.rhino.Node node31 = node24.useSourceInfoFrom(node28);
        int int32 = node28.getLength();
        node28.setWasEmptyNode(true);
        node28.setLineno(409601);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition37 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int38 = namePosition37.getEndLine();
        int int39 = namePosition37.getPositionOnEndLine();
        com.google.javascript.rhino.Node node40 = null;
        namePosition37.setItem(node40);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node45.setCharno(1);
        java.util.Set<java.lang.String> strSet48 = node45.getDirectives();
        namePosition37.setItem(node45);
        boolean boolean50 = node28.hasChild(node45);
        node28.setLineno((-1));
        boolean boolean53 = node28.hasMoreThanOneChild();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 40 + "'", int29 == 40);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(strSet48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test26092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26092");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.lang.String str4 = jSDocInfo0.getDescriptionForParameter("STRING  0\n");
        java.lang.String str5 = jSDocInfo0.getDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.hasThisType();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str9 = jSDocInfo0.getLendsName();
        boolean boolean11 = jSDocInfo0.hasParameterType("STRING  0");
        java.lang.String str12 = jSDocInfo0.getOriginalCommentString();
        java.lang.String str14 = jSDocInfo0.getDescriptionForParameter("(OR 1\n    ERROR 1\n        STRING  0\n)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test26093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26093");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) -1, node20, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (byte) -1, node30, (int) (byte) 1, (int) '#');
        boolean boolean36 = node25.hasChild(node35);
        int int37 = node25.getCharno();
        com.google.javascript.rhino.Node node38 = node15.useSourceInfoIfMissingFrom(node25);
        int int39 = node15.getSourcePosition();
        java.lang.String str40 = node15.toString();
        int int41 = node4.getIndexOfChild(node15);
        boolean boolean42 = node4.isDebugger();
        boolean boolean43 = node4.isAssign();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("false", 49, (int) 'a');
        com.google.javascript.rhino.Node node48 = node4.clonePropsFrom(node47);
        boolean boolean49 = node47.isUnscopedQualifiedName();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4131 + "'", int39 == 4131);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "OR 1" + "'", str40, "OR 1");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test26094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26094");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isTypeOf();
        boolean boolean23 = node19.isAssignAdd();
        com.google.javascript.rhino.Node node24 = node19.removeFirstChild();
        boolean boolean25 = node24.isSwitch();
        boolean boolean26 = node24.hasMoreThanOneChild();
        int int28 = node24.getIntProp(49);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean33 = node32.isThrow();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean38 = node37.isThrow();
        java.lang.String str42 = node37.toString(true, false, true);
        java.lang.String str43 = node37.getQualifiedName();
        boolean boolean44 = node37.isIn();
        com.google.javascript.rhino.Node node45 = node37.cloneTree();
        boolean boolean46 = node45.isRegExp();
        boolean boolean47 = node45.isDebugger();
        node32.addChildToBack(node45);
        boolean boolean49 = node45.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node50 = node24.srcrefTree(node45);
        boolean boolean51 = node24.isTypeOf();
        boolean boolean52 = node24.isInstanceOf();
        java.lang.String str53 = node24.getString();
        java.lang.String str54 = node24.getQualifiedName();
        int int55 = node24.getLength();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "STRING  0" + "'", str42, "STRING  0");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test26095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26095");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getLicense();
        boolean boolean3 = jSDocInfo0.hasEnumParameterType();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasBaseType();
        java.lang.String str7 = jSDocInfo0.getReturnDescription();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test26096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26096");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        boolean boolean6 = jSDocInfo0.isJavaDispatch();
        boolean boolean7 = jSDocInfo0.isConstructor();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getThisType();
        java.lang.String str9 = jSDocInfo0.getVersion();
        java.lang.String str10 = jSDocInfo0.getLicense();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test26097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26097");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        com.google.javascript.rhino.Node node15 = node8.detachFromParent();
        node15.setOptionalArg(false);
        boolean boolean19 = node15.getBooleanProp(31);
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node15);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean25 = node24.isThrow();
        boolean boolean26 = node24.isSwitch();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node33 = node31.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) -1, node31, (int) (byte) 1, (int) '#');
        boolean boolean37 = node31.isDo();
        boolean boolean38 = node31.isDefaultCase();
        node31.setQuotedString();
        boolean boolean40 = node31.isDec();
        boolean boolean41 = node31.isLabel();
        boolean boolean42 = node31.isSetterDef();
        boolean boolean43 = node31.isRegExp();
        boolean boolean44 = node31.isName();
        boolean boolean45 = node31.isVoid();
        com.google.javascript.rhino.Node node46 = node31.cloneNode();
        com.google.javascript.rhino.Node node47 = node24.useSourceInfoIfMissingFrom(node46);
        boolean boolean48 = node47.isRegExp();
        com.google.javascript.rhino.Node node49 = node20.clonePropsFrom(node47);
        node49.setType(97);
        com.google.javascript.rhino.Node node52 = node49.removeChildren();
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray57);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(29, nodeArray57);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(30, nodeArray57);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(29, nodeArray57);
        boolean boolean62 = node61.isNE();
        boolean boolean63 = node49.isEquivalentToTyped(node61);
        boolean boolean64 = node49.isCall();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(nodeArray57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test26098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26098");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(51);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder2 = node1.new FileLevelJsDocBuilder();
        java.lang.String str3 = node1.toStringTree();
        boolean boolean4 = node1.isQualifiedName();
        node1.setSourceEncodedPosition(12);
        node1.setLineno(5);
        boolean boolean9 = node1.isThrow();
        com.google.javascript.rhino.Node node10 = node1.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = node10.isString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IN\n" + "'", str3, "IN\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test26099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26099");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isTypeOf();
        boolean boolean23 = node19.isAssignAdd();
        boolean boolean24 = node19.isStringKey();
        com.google.javascript.rhino.Node node25 = node19.removeChildren();
        java.lang.String str29 = node25.toString(false, true, false);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        node33.removeProp(47);
        boolean boolean36 = node33.isFromExterns();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double41 = node40.getDouble();
        boolean boolean42 = node40.isAdd();
        com.google.javascript.rhino.Node node43 = node40.cloneNode();
        boolean boolean44 = node43.isNE();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node66 = node64.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) -1, node64, (int) (byte) 1, (int) '#');
        boolean boolean70 = node59.hasChild(node69);
        int int71 = node59.getCharno();
        com.google.javascript.rhino.Node node72 = node49.useSourceInfoIfMissingFrom(node59);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node77 = node49.srcref(node76);
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean82 = node81.isFromExterns();
        boolean boolean83 = node77.hasChild(node81);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(52, node81);
        node43.addChildToBack(node84);
        java.lang.String str86 = node33.checkTreeEquals(node43);
        node33.setSourceFileForTesting("Node tree inequality:\nTree1:\nERROR 1\n    STRING  0\n\n\nTree2:\nSTRING  0\n\n\nSubtree1: ERROR 1\n    STRING  0\n\n\nSubtree2: STRING  0\n");
        node33.setLength((int) (byte) 1);
        node33.setSourceEncodedPositionForTree(151562);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile93 = node33.getStaticSourceFile();
        node25.setStaticSourceFile(staticSourceFile93);
        boolean boolean95 = node25.hasChildren();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "STRING " + "'", str29, "STRING ");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4095.0d + "'", double41 == 4095.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 35 + "'", int71 == 35);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n" + "'", str86, "Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n");
        org.junit.Assert.assertNotNull(staticSourceFile93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test26100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26100");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(0, "(CALL 0\n)", 54, 35);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test26101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26101");
        java.lang.String[] strArray2 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean10 = strSet3.addAll((java.util.Collection<java.lang.String>) strList8);
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str12 = jSDocInfo11.getVersion();
        java.lang.String str13 = jSDocInfo11.getFileOverview();
        boolean boolean14 = jSDocInfo11.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet15 = jSDocInfo11.getParameterNames();
        boolean boolean16 = strSet3.retainAll((java.util.Collection<java.lang.String>) strSet15);
        java.util.stream.Stream<java.lang.String> strStream17 = strSet15.parallelStream();
        boolean boolean18 = strSet15.isEmpty();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node29 = node27.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) -1, node27, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) -1, node37, (int) (byte) 1, (int) '#');
        boolean boolean43 = node32.hasChild(node42);
        int int44 = node32.getCharno();
        com.google.javascript.rhino.Node node45 = node22.useSourceInfoIfMissingFrom(node32);
        boolean boolean46 = node32.isAssignAdd();
        boolean boolean47 = node32.isUnscopedQualifiedName();
        int int48 = node32.getLineno();
        boolean boolean49 = node32.isTrue();
        boolean boolean50 = node32.isSyntheticBlock();
        boolean boolean51 = strSet15.contains((java.lang.Object) node32);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node62 = node60.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) -1, node60, (int) (byte) 1, (int) '#');
        boolean boolean66 = node60.isScript();
        node60.setQuotedString();
        com.google.javascript.rhino.Node node68 = node55.srcrefTree(node60);
        boolean boolean69 = node68.isNull();
        node68.setOptionalArg(false);
        com.google.javascript.rhino.Node node72 = node68.getFirstChild();
        boolean boolean73 = strSet15.equals((java.lang.Object) node68);
        boolean boolean74 = node68.isFunction();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test26102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26102");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean6 = node5.isThrow();
        java.lang.String str10 = node5.toString(true, false, true);
        java.lang.String str11 = node5.getQualifiedName();
        boolean boolean12 = node5.isIn();
        com.google.javascript.rhino.Node node13 = node5.cloneTree();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node18.isScript();
        com.google.javascript.rhino.Node node25 = node18.detachFromParent();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node29.setCharno(1);
        java.util.Set<java.lang.String> strSet32 = node29.getDirectives();
        boolean boolean33 = node29.isHook();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node54 = node52.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (byte) -1, node52, (int) (byte) 1, (int) '#');
        boolean boolean58 = node47.hasChild(node57);
        int int59 = node47.getCharno();
        com.google.javascript.rhino.Node node60 = node37.useSourceInfoIfMissingFrom(node47);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node65 = node37.srcref(node64);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(4095, node13, node25, node29, node37);
        boolean boolean67 = node66.isHook();
        boolean boolean68 = node66.isTrue();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) '#', node66);
        boolean boolean70 = node66.isRegExp();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "STRING  0" + "'", str10, "STRING  0");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 35 + "'", int59 == 35);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test26103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26103");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        node11.setCharno((int) (short) 1);
        java.lang.String str26 = node11.getString();
        com.google.javascript.rhino.Node node27 = node11.getParent();
        boolean boolean28 = node11.isNE();
        java.lang.Appendable appendable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            node11.appendStringTree(appendable29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test26104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26104");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        boolean boolean15 = node4.isSetterDef();
        boolean boolean16 = node4.isRegExp();
        boolean boolean17 = node4.isName();
        boolean boolean18 = node4.isVoid();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node23.isDo();
        com.google.javascript.rhino.Node node30 = node4.useSourceInfoIfMissingFrom(node23);
        java.lang.String str31 = node4.toString();
        boolean boolean32 = node4.isContinue();
        boolean boolean33 = node4.isDelProp();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "STRING  0 [quoted: 1]" + "'", str31, "STRING  0 [quoted: 1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test26105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26105");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str5 = jSDocInfo0.toString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getTypedefType();
        boolean boolean9 = jSDocInfo0.isInterface();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection10 = jSDocInfo0.getMarkers();
        boolean boolean11 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(markerCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test26106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26106");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str8 = jSDocInfo0.getLicense();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getAuthors();
        boolean boolean10 = jSDocInfo0.isIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getThrownTypes();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = jSDocInfo0.getVisibility();
        boolean boolean13 = jSDocInfo0.isConsistentIdGenerator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertNull(visibility12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26107");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isBlock();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder23 = node19.new FileLevelJsDocBuilder();
        boolean boolean24 = node19.isCall();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        node19.setJSType(jSType25);
        int int27 = node19.getType();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable28 = node19.getAncestors();
        boolean boolean29 = node19.isTry();
        int int31 = node19.getIntProp(38);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(ancestorIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test26108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26108");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(49);
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.setThrows();
        sideEffectFlags1.setAllFlags();
        boolean boolean5 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.setThrows();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test26109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26109");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(39, "BITXOR");
        boolean boolean3 = node2.isThrow();
        boolean boolean4 = node2.isThrow();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26110");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        java.lang.String str5 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        boolean boolean6 = jSDocInfo0.hasEnumParameterType();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getTypedefType();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getReferences();
        boolean boolean10 = jSDocInfo0.hasThisType();
        boolean boolean11 = jSDocInfo0.isJavaDispatch();
        boolean boolean12 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test26111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26111");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node9.hasChild(node19);
        boolean boolean21 = node19.isVar();
        boolean boolean22 = node19.isTypeOf();
        boolean boolean23 = node19.isAssignAdd();
        boolean boolean24 = node19.isStringKey();
        node19.setOptionalArg(true);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean32 = node31.isFromExterns();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(39, node31, (int) '4', 51);
        boolean boolean36 = node31.isIn();
        com.google.javascript.rhino.Node node37 = node19.useSourceInfoFrom(node31);
        boolean boolean38 = node37.isScript();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        node44.setSourceEncodedPositionForTree(97);
        com.google.javascript.rhino.InputId inputId47 = node44.getInputId();
        boolean boolean48 = node44.isFromExterns();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(30);
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = node50.getJSDocInfo();
        node50.putIntProp((-1), (int) (byte) 100);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (byte) 1, node44, node50, (int) 'a', (int) (byte) 10);
        node37.putProp(397361, (java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(inputId47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(jSDocInfo51);
    }

    @Test
    public void test26112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26112");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 100);
        boolean boolean3 = node1.getBooleanProp(35);
        boolean boolean4 = node1.isWhile();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int9 = node8.getSourcePosition();
        int int10 = node8.getType();
        boolean boolean11 = node8.isLabel();
        node8.setSourceFileForTesting("STRING  0 [quoted: 1]\n");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean18 = node17.isThrow();
        java.lang.String str22 = node17.toString(true, false, true);
        java.lang.String str23 = node17.getQualifiedName();
        boolean boolean24 = node17.isIn();
        com.google.javascript.rhino.Node node25 = node17.cloneTree();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node29.setCharno(1);
        java.util.Set<java.lang.String> strSet32 = node29.getDirectives();
        boolean boolean33 = node29.isHook();
        node25.addChildToFront(node29);
        com.google.javascript.rhino.Node node35 = node29.getLastSibling();
        boolean boolean36 = node35.isNull();
        // The following exception was thrown during execution in test generation
        try {
            node1.replaceChildAfter(node8, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "STRING  0" + "'", str22, "STRING  0");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test26113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26113");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double4 = node3.getDouble();
        int int5 = node3.getSourcePosition();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node9.setCharno(1);
        boolean boolean12 = node9.isRegExp();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isDo();
        boolean boolean24 = node17.isDefaultCase();
        node17.setQuotedString();
        com.google.javascript.rhino.Node node26 = node9.useSourceInfoFromForTree(node17);
        node17.putIntProp((int) (byte) 100, (int) (byte) 0);
        node17.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean33 = node17.isInc();
        node17.setQuotedString();
        java.lang.String str35 = node17.getSourceFileName();
        com.google.javascript.rhino.Node node36 = node3.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node37 = node3.getLastChild();
        boolean boolean38 = node3.isVoid();
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        node3.setJSType(jSType39);
        node3.setVarArgs(true);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4095.0d + "'", double4 == 4095.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 409601 + "'", int5 == 409601);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test26114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26114");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("(Not declared as a type name)");
        com.google.javascript.rhino.Node node2 = node1.cloneTree();
        com.google.javascript.rhino.Node node3 = node1.getNext();
        boolean boolean4 = node1.isNull();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26115");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node7 = node5.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) -1, node5, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        boolean boolean21 = node10.hasChild(node20);
        boolean boolean22 = node10.isReturn();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node26.setCharno(1);
        java.util.Set<java.lang.String> strSet29 = node26.getDirectives();
        node26.setCharno((int) (short) -1);
        int int32 = node10.getIndexOfChild(node26);
        node10.addSuppression("STRING  0 [synthetic: 1]\n");
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str36 = jSDocInfo35.getVersion();
        boolean boolean37 = jSDocInfo35.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet38 = jSDocInfo35.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList39 = jSDocInfo35.getImplementedInterfaces();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean44 = node43.isThrow();
        java.lang.String str48 = node43.toString(true, false, true);
        jSDocInfo35.setAssociatedNode(node43);
        boolean boolean50 = jSDocInfo35.hasTypedefType();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node61 = node59.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node59, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node71 = node69.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) -1, node69, (int) (byte) 1, (int) '#');
        boolean boolean75 = node64.hasChild(node74);
        int int76 = node64.getCharno();
        com.google.javascript.rhino.Node node77 = node54.useSourceInfoIfMissingFrom(node64);
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node82 = node54.srcref(node81);
        jSDocInfo35.setAssociatedNode(node54);
        node54.setLineno(47);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(48, node10, node54, (int) (byte) 100, 32);
        boolean boolean89 = node10.isSyntheticBlock();
        int int90 = node10.getSideEffectFlags();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(strSet29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(jSTypeExpressionList39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "STRING  0" + "'", str48, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 35 + "'", int76 == 35);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test26116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26116");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int4 = node3.getType();
        boolean boolean5 = node3.isArrayLit();
        boolean boolean6 = node3.isComma();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean11 = node10.isThrow();
        java.lang.String str15 = node10.toString(true, false, true);
        java.lang.String str16 = node10.getQualifiedName();
        boolean boolean17 = node10.isIn();
        com.google.javascript.rhino.Node node18 = node10.cloneTree();
        boolean boolean19 = node18.isRegExp();
        boolean boolean20 = node18.isDebugger();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        node24.removeProp(47);
        boolean boolean27 = node24.isFromExterns();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double32 = node31.getDouble();
        boolean boolean33 = node31.isAdd();
        com.google.javascript.rhino.Node node34 = node31.cloneNode();
        boolean boolean35 = node34.isNE();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node47 = node45.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (byte) -1, node45, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node57 = node55.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) -1, node55, (int) (byte) 1, (int) '#');
        boolean boolean61 = node50.hasChild(node60);
        int int62 = node50.getCharno();
        com.google.javascript.rhino.Node node63 = node40.useSourceInfoIfMissingFrom(node50);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node68 = node40.srcref(node67);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean73 = node72.isFromExterns();
        boolean boolean74 = node68.hasChild(node72);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(52, node72);
        node34.addChildToBack(node75);
        java.lang.String str77 = node24.checkTreeEquals(node34);
        node24.setSourceFileForTesting("Node tree inequality:\nTree1:\nERROR 1\n    STRING  0\n\n\nTree2:\nSTRING  0\n\n\nSubtree1: ERROR 1\n    STRING  0\n\n\nSubtree2: STRING  0\n");
        node24.setLength((int) (byte) 1);
        node24.setSourceEncodedPositionForTree(151562);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile84 = node24.getStaticSourceFile();
        node18.setStaticSourceFile(staticSourceFile84);
        node3.setStaticSourceFile(staticSourceFile84);
        node3.setSourceFileForTesting("(ERROR)");
        boolean boolean89 = node3.isVar();
        com.google.javascript.rhino.jstype.JSType jSType90 = node3.getJSType();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40 + "'", int4 == 40);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "STRING  0" + "'", str15, "STRING  0");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4095.0d + "'", double32 == 4095.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 35 + "'", int62 == 35);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n" + "'", str77, "Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n");
        org.junit.Assert.assertNotNull(staticSourceFile84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(jSType90);
    }

    @Test
    public void test26117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26117");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        boolean boolean15 = node4.isSetterDef();
        com.google.javascript.rhino.Node node16 = node4.getLastSibling();
        boolean boolean17 = node4.isDo();
        java.lang.String str18 = node4.toString();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node36 = node34.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) -1, node34, (int) (byte) 1, (int) '#');
        boolean boolean40 = node29.hasChild(node39);
        boolean boolean41 = node29.isReturn();
        boolean boolean42 = node29.isGetterDef();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str44 = jSDocInfo43.getVersion();
        boolean boolean45 = jSDocInfo43.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet46 = jSDocInfo43.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList47 = jSDocInfo43.getImplementedInterfaces();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean52 = node51.isThrow();
        java.lang.String str56 = node51.toString(true, false, true);
        jSDocInfo43.setAssociatedNode(node51);
        com.google.javascript.rhino.Node node58 = node51.removeFirstChild();
        boolean boolean59 = node51.isNumber();
        node29.addChildToBack(node51);
        java.lang.String str61 = node29.toStringTree();
        com.google.javascript.rhino.Node node62 = node29.cloneTree();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(44, node29);
        boolean boolean64 = node29.isNull();
        boolean boolean65 = node29.isTrue();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node66 = node4.removeChildAfter(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "STRING  0 [quoted: 1]" + "'", str18, "STRING  0 [quoted: 1]");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(jSTypeExpressionList47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "STRING  0" + "'", str56, "STRING  0");
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ERROR 1\n    STRING  0\n    STRING  0\n" + "'", str61, "ERROR 1\n    STRING  0\n    STRING  0\n");
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test26118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26118");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("((ERROR 1\n    STRING  0\n    STRING  0\n))");
        java.lang.Object obj3 = node1.getProp(1044480);
        boolean boolean4 = node1.isNull();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26119");
        java.lang.String[] strArray2 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.add("STRING  0");
        java.lang.String[] strArray9 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        boolean boolean17 = strSet10.addAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean18 = strSet3.containsAll((java.util.Collection<java.lang.String>) strList15);
        boolean boolean19 = strSet3.isEmpty();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        boolean boolean24 = node23.isAnd();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str26 = jSDocInfo25.getVersion();
        java.lang.String str27 = jSDocInfo25.getFileOverview();
        jSDocInfo25.addSuppression("STRING  0");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList30 = jSDocInfo25.getExtendedInterfaces();
        boolean boolean31 = jSDocInfo25.isConstructor();
        node23.setJSDocInfo(jSDocInfo25);
        boolean boolean33 = node23.isNew();
        boolean boolean34 = strSet3.remove((java.lang.Object) boolean33);
        java.lang.Object[] objArray35 = strSet3.toArray();
        java.util.stream.Stream<java.lang.String> strStream36 = strSet3.stream();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(jSTypeExpressionList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[STRING  0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[STRING  0]");
        org.junit.Assert.assertNotNull(strStream36);
    }

    @Test
    public void test26120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26120");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double4 = node3.getDouble();
        node3.setOptionalArg(true);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node27 = node25.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) -1, node25, (int) (byte) 1, (int) '#');
        boolean boolean31 = node20.hasChild(node30);
        int int32 = node20.getCharno();
        com.google.javascript.rhino.Node node33 = node10.useSourceInfoIfMissingFrom(node20);
        boolean boolean34 = node3.isEquivalentTo(node20);
        com.google.javascript.rhino.Node node35 = node3.getNext();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = node3.getStaticSourceFile();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4095.0d + "'", double4 == 4095.0d);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(staticSourceFile36);
    }

    @Test
    public void test26121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26121");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        int int10 = node3.getIntProp(51);
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        boolean boolean12 = node11.isCatch();
        java.lang.String str13 = node11.getSourceFileName();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) -1, node28, (int) (byte) 1, (int) '#');
        boolean boolean34 = node23.hasChild(node33);
        boolean boolean35 = node33.isVar();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node39.setCharno(1);
        boolean boolean42 = node39.isRegExp();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        boolean boolean53 = node47.isDo();
        boolean boolean54 = node47.isDefaultCase();
        node47.setQuotedString();
        com.google.javascript.rhino.Node node56 = node39.useSourceInfoFromForTree(node47);
        boolean boolean57 = node56.isVarArgs();
        com.google.javascript.rhino.Node node58 = node33.useSourceInfoIfMissingFrom(node56);
        boolean boolean59 = node33.isGetProp();
        boolean boolean60 = node33.isFromExterns();
        com.google.javascript.rhino.Node node61 = node11.useSourceInfoFromForTree(node33);
        int int62 = node61.getSourceOffset();
        boolean boolean63 = node61.isComma();
        boolean boolean64 = node61.isAdd();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "STRING  0" + "'", str8, "STRING  0");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test26122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26122");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        boolean boolean49 = node47.isVar();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node14, node47);
        com.google.javascript.rhino.Node node51 = node50.getParent();
        boolean boolean52 = node50.isSetterDef();
        boolean boolean53 = node50.isEmpty();
        boolean boolean54 = node50.isSetterDef();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node61 = node59.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node59, (int) (byte) 1, (int) '#');
        boolean boolean65 = node59.isDo();
        boolean boolean66 = node59.isDefaultCase();
        node59.setQuotedString();
        boolean boolean68 = node59.isDec();
        boolean boolean69 = node59.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable70 = node59.siblings();
        com.google.javascript.rhino.Node node71 = node59.detachFromParent();
        boolean boolean72 = node59.isString();
        java.lang.String str73 = node50.checkTreeEquals(node59);
        boolean boolean74 = node59.isThis();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node81 = node79.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (byte) -1, node79, (int) (byte) 1, (int) '#');
        java.lang.String str85 = node79.toStringTree();
        boolean boolean86 = node79.isAdd();
        boolean boolean87 = node79.isArrayLit();
        node79.setSourceEncodedPosition((-1));
        com.google.javascript.rhino.Node node90 = null;
        boolean boolean91 = node79.hasChild(node90);
        boolean boolean92 = node79.isRegExp();
        com.google.javascript.rhino.Node node93 = node59.srcrefTree(node79);
        node93.putBooleanProp(47, false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(nodeIterable70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Node tree inequality:\nTree1:\nERROR\n    ERROR 1\n        STRING  0\n    ERROR 1\n        STRING  0\n\n\nTree2:\nSTRING  0 [quoted: 1]\n\n\nSubtree1: ERROR\n    ERROR 1\n        STRING  0\n    ERROR 1\n        STRING  0\n\n\nSubtree2: STRING  0 [quoted: 1]\n" + "'", str73, "Node tree inequality:\nTree1:\nERROR\n    ERROR 1\n        STRING  0\n    ERROR 1\n        STRING  0\n\n\nTree2:\nSTRING  0 [quoted: 1]\n\n\nSubtree1: ERROR\n    ERROR 1\n        STRING  0\n    ERROR 1\n        STRING  0\n\n\nSubtree2: STRING  0 [quoted: 1]\n");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "STRING  0\n" + "'", str85, "STRING  0\n");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(node93);
    }

    @Test
    public void test26123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26123");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        java.lang.String str6 = jSDocInfo0.getSourceName();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getType();
        boolean boolean9 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = jSDocInfo0.getVisibility();
        boolean boolean11 = jSDocInfo0.isNoCompile();
        java.lang.String str13 = jSDocInfo0.getDescriptionForParameter("hi!");
        java.util.Set<java.lang.String> strSet14 = jSDocInfo0.getParameterNames();
        jSDocInfo0.setDeprecated(false);
        java.lang.String str17 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = jSDocInfo0.getType();
        java.util.Set<java.lang.String> strSet19 = jSDocInfo0.getModifies();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(visibility10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(jSTypeExpression18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test26124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26124");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int2 = typePosition1.getPositionOnEndLine();
        boolean boolean3 = typePosition1.hasBrackets();
        int int4 = typePosition1.getEndLine();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node29 = node27.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) -1, node27, (int) (byte) 1, (int) '#');
        boolean boolean33 = node22.hasChild(node32);
        int int34 = node22.getCharno();
        com.google.javascript.rhino.Node node35 = node12.useSourceInfoIfMissingFrom(node22);
        node35.setLength((int) ' ');
        node8.addChildrenToBack(node35);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node8.children();
        boolean boolean40 = node8.isHook();
        int int41 = node8.getSideEffectFlags();
        typePosition1.setItem(node8);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int47 = node46.getSourcePosition();
        int int48 = node46.getType();
        boolean boolean49 = node46.isLabel();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) ' ', node8, node46);
        boolean boolean51 = node8.isExprResult();
        boolean boolean52 = node8.isEmpty();
        int int53 = node8.getSideEffectFlags();
        boolean boolean54 = node8.isTrue();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(30);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable57 = node56.getAncestors();
        node56.putIntProp(12, (-1));
        boolean boolean61 = node56.isAssign();
        com.google.javascript.rhino.Node node62 = node8.useSourceInfoFrom(node56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 40 + "'", int48 == 40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(ancestorIterable57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
    }

    @Test
    public void test26125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26125");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility4 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility4);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str7 = jSDocInfo6.getVersion();
        boolean boolean8 = jSDocInfo6.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo6.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo6.setVisibility(visibility10);
        jSDocInfo0.setVisibility(visibility10);
        boolean boolean13 = jSDocInfo0.shouldPreserveTry();
        boolean boolean14 = jSDocInfo0.isNoSideEffects();
        boolean boolean16 = jSDocInfo0.hasParameter("Named type with empty name component");
        boolean boolean17 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + visibility4 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility4.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + visibility10 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility10.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test26126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26126");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int4 = node3.getType();
        boolean boolean5 = node3.isArrayLit();
        node3.setSourceEncodedPosition(51);
        boolean boolean8 = node3.isIf();
        boolean boolean9 = node3.isScript();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean14 = node13.isThrow();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean19 = node18.isThrow();
        java.lang.String str23 = node18.toString(true, false, true);
        java.lang.String str24 = node18.getQualifiedName();
        boolean boolean25 = node18.isIn();
        com.google.javascript.rhino.Node node26 = node18.cloneTree();
        boolean boolean27 = node26.isRegExp();
        boolean boolean28 = node26.isDebugger();
        node13.addChildToBack(node26);
        com.google.javascript.rhino.Node node30 = node13.getLastChild();
        com.google.javascript.rhino.Node node31 = node3.useSourceInfoIfMissingFromForTree(node13);
        node13.detachChildren();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40 + "'", int4 == 40);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "STRING  0" + "'", str23, "STRING  0");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test26127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26127");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition1 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition4 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker0.getDescription();
        org.junit.Assert.assertNull(nodeSourcePosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(nodeSourcePosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(stringPosition8);
    }

    @Test
    public void test26128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26128");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node7 = node5.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) -1, node5, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        boolean boolean21 = node10.hasChild(node20);
        boolean boolean22 = node20.isVar();
        boolean boolean23 = node20.isTypeOf();
        boolean boolean24 = node20.isAssignAdd();
        boolean boolean25 = node20.isStringKey();
        node20.setOptionalArg(true);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean32 = node31.isThrow();
        java.lang.String str36 = node31.toString(true, false, true);
        boolean boolean37 = node31.isWith();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean42 = node41.isThrow();
        boolean boolean43 = node41.isSwitch();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        boolean boolean54 = node48.isDo();
        boolean boolean55 = node48.isDefaultCase();
        node48.setQuotedString();
        boolean boolean57 = node48.isDec();
        boolean boolean58 = node48.isLabel();
        boolean boolean59 = node48.isSetterDef();
        boolean boolean60 = node48.isRegExp();
        boolean boolean61 = node48.isName();
        boolean boolean62 = node48.isVoid();
        com.google.javascript.rhino.Node node63 = node48.cloneNode();
        com.google.javascript.rhino.Node node64 = node41.useSourceInfoIfMissingFrom(node63);
        boolean boolean65 = node64.isFor();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(53, node20, node31, node64);
        com.google.javascript.rhino.Node node67 = node66.cloneNode();
        boolean boolean68 = node66.isVarArgs();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder69 = node66.new FileLevelJsDocBuilder();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "STRING  0" + "'", str36, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test26129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26129");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isIn();
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node15.setCharno(1);
        java.util.Set<java.lang.String> strSet18 = node15.getDirectives();
        boolean boolean19 = node15.isHook();
        node11.addChildToFront(node15);
        boolean boolean21 = node15.isGetElem();
        boolean boolean22 = node15.isRegExp();
        int int23 = node15.getSourcePosition();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable24 = node15.getAncestors();
        com.google.javascript.rhino.jstype.JSType jSType25 = node15.getJSType();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "STRING  0" + "'", str8, "STRING  0");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(ancestorIterable24);
        org.junit.Assert.assertNull(jSType25);
    }

    @Test
    public void test26130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26130");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) -1, node10, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) -1, node20, (int) (byte) 1, (int) '#');
        boolean boolean26 = node15.hasChild(node25);
        int int27 = node15.getCharno();
        com.google.javascript.rhino.Node node28 = node5.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node35 = node33.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) -1, node33, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node45 = node43.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (byte) -1, node43, (int) (byte) 1, (int) '#');
        boolean boolean49 = node38.hasChild(node48);
        boolean boolean50 = node48.isVar();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((-1), node15, node48);
        com.google.javascript.rhino.Node node52 = node51.getParent();
        boolean boolean53 = node51.isSetterDef();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1), node51);
        int int55 = node54.getSideEffectFlags();
        com.google.javascript.rhino.Node node56 = node54.removeChildren();
        boolean boolean57 = node56.isReturn();
        boolean boolean58 = node56.isGetProp();
        com.google.javascript.rhino.Node node59 = node56.cloneTree();
        boolean boolean60 = node56.isAnd();
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test26131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26131");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        java.util.Set<java.lang.String> strSet6 = node3.getDirectives();
        node3.setCharno((int) (short) -1);
        boolean boolean9 = node3.isRegExp();
        boolean boolean10 = node3.isSwitch();
        java.lang.String str14 = node3.toString(true, false, true);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "STRING " + "'", str14, "STRING ");
    }

    @Test
    public void test26132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26132");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str5 = jSDocInfo0.toString();
        boolean boolean6 = jSDocInfo0.isNoShadow();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.hasType();
        jSDocInfo0.setDeprecated(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getParameterType("INSTANCEOF");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test26133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26133");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node31 = node3.srcref(node30);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean36 = node35.isFromExterns();
        boolean boolean37 = node31.hasChild(node35);
        boolean boolean38 = node35.isOr();
        boolean boolean39 = node35.isReturn();
        java.lang.String str40 = node35.toStringTree();
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = node35.getChildBefore(node41);
        boolean boolean43 = node35.isWhile();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "STRING  0\n" + "'", str40, "STRING  0\n");
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test26134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26134");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node2 = typePosition0.getItem();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node9 = node7.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) -1, node7, (int) (byte) 1, (int) '#');
        boolean boolean13 = node7.isDo();
        boolean boolean14 = node7.isDefaultCase();
        node7.setQuotedString();
        boolean boolean16 = node7.isDec();
        boolean boolean17 = node7.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node7.siblings();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(51);
        java.lang.String str21 = node7.checkTreeEquals(node20);
        boolean boolean22 = node7.isCatch();
        com.google.javascript.rhino.InputId inputId23 = null;
        node7.setInputId(inputId23);
        typePosition0.setItem(node7);
        int int26 = typePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString((int) (byte) 0, "STRING  0\n");
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable30 = node29.getAncestors();
        typePosition0.setItem(node29);
        boolean boolean32 = node29.isThis();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeIterable18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n" + "'", str21, "Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(ancestorIterable30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test26135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26135");
        java.lang.String[] strArray18 = new java.lang.String[] { "OR 1\n", "STRING  0\n", "", "OR 51", "Not declared as a constructor", "false", "Not declared as a constructor", "STRING  0 [synthetic: 1]\n", "JSDocInfo", "false", "STRING  0 [quoted: 1]\n", "true", "STRING  0 [quoted: 1]\n", "OR 1\n", "IN\n", "Named type with empty name component", "STRING  0 [quoted: 1]\n", "(OR 1)" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node24.setCharno(1);
        boolean boolean27 = node24.isRegExp();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        boolean boolean38 = node32.isDo();
        boolean boolean39 = node32.isDefaultCase();
        node32.setQuotedString();
        com.google.javascript.rhino.Node node41 = node24.useSourceInfoFromForTree(node32);
        node32.putIntProp((int) (byte) 100, (int) (byte) 0);
        node32.setCharno((int) (short) 1);
        java.lang.String str47 = node32.getString();
        boolean boolean48 = strSet19.contains((java.lang.Object) node32);
        node32.setVarArgs(false);
        node32.setIsSyntheticBlock(false);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node32.siblings();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = node32.getJSDocInfo();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertNull(jSDocInfo54);
    }

    @Test
    public void test26136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26136");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(39);
        int int2 = sideEffectFlags1.valueOf();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setMutatesArguments();
        sideEffectFlags1.clearAllFlags();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test26137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26137");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node31 = node3.srcref(node30);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable32 = node3.getAncestors();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str34 = jSDocInfo33.getVersion();
        boolean boolean35 = jSDocInfo33.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet36 = jSDocInfo33.getParameterNames();
        jSDocInfo33.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection39 = jSDocInfo33.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression40 = jSDocInfo33.getThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression41 = jSDocInfo33.getType();
        node3.setJSDocInfo(jSDocInfo33);
        java.lang.String str43 = jSDocInfo33.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression44 = jSDocInfo33.getThisType();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(ancestorIterable32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(nodeCollection39);
        org.junit.Assert.assertNull(jSTypeExpression40);
        org.junit.Assert.assertNull(jSTypeExpression41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(jSTypeExpression44);
    }

    @Test
    public void test26138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26138");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getEndLine();
        int int2 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node3 = null;
        namePosition0.setItem(node3);
        com.google.javascript.rhino.Node node5 = namePosition0.getItem();
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean11 = node10.isThrow();
        java.lang.String str15 = node10.toString(true, false, true);
        java.lang.String str16 = node10.getQualifiedName();
        boolean boolean17 = node10.isIn();
        com.google.javascript.rhino.Node node18 = node10.cloneTree();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node22.setCharno(1);
        java.util.Set<java.lang.String> strSet25 = node22.getDirectives();
        boolean boolean26 = node22.isHook();
        node18.addChildToFront(node22);
        boolean boolean28 = node18.isNE();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node18.siblings();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int34 = node33.getType();
        com.google.javascript.rhino.Node node35 = node33.cloneNode();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean40 = node39.isThrow();
        java.lang.String str44 = node39.toString(true, false, true);
        int int46 = node39.getIntProp(51);
        node39.addSuppression("STRING  0 [quoted: 1]\n");
        com.google.javascript.rhino.Node node49 = node35.useSourceInfoFrom(node39);
        node18.addChildrenToBack(node35);
        namePosition0.setItem(node35);
        int int52 = namePosition0.getEndLine();
        int int53 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node54 = namePosition0.getItem();
        int int55 = namePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "STRING  0" + "'", str15, "STRING  0");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 40 + "'", int34 == 40);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "STRING  0" + "'", str44, "STRING  0");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test26139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26139");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int4 = node3.getType();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean10 = node9.isThrow();
        java.lang.String str14 = node9.toString(true, false, true);
        int int16 = node9.getIntProp(51);
        node9.addSuppression("STRING  0 [quoted: 1]\n");
        com.google.javascript.rhino.Node node19 = node5.useSourceInfoFrom(node9);
        boolean boolean20 = node5.isDebugger();
        boolean boolean21 = node5.isTrue();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = node5.getStaticSourceFile();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40 + "'", int4 == 40);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "STRING  0" + "'", str14, "STRING  0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(staticSourceFile22);
    }

    @Test
    public void test26140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26140");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(1);
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setThrows();
    }

    @Test
    public void test26141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26141");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node4.siblings();
        boolean boolean16 = node4.isEmpty();
        com.google.javascript.rhino.Node node17 = node4.getParent();
        boolean boolean18 = node17.isRegExp();
        boolean boolean19 = node17.hasOneChild();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node36 = node34.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) -1, node34, (int) (byte) 1, (int) '#');
        boolean boolean40 = node29.hasChild(node39);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(49, "STRING  0\n");
        com.google.javascript.rhino.Node node44 = node29.clonePropsFrom(node43);
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = node44.getJSDocInfo();
        com.google.javascript.rhino.Node node46 = node17.clonePropsFrom(node44);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.jstype.JSType jSType49 = node48.getJSType();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node66 = node64.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) -1, node64, (int) (byte) 1, (int) '#');
        boolean boolean70 = node59.hasChild(node69);
        boolean boolean71 = node69.isVar();
        boolean boolean72 = node69.isCase();
        boolean boolean73 = node69.isNE();
        node69.setVarArgs(false);
        com.google.javascript.rhino.Node node76 = node48.useSourceInfoFrom(node69);
        int int77 = node48.getChildCount();
        boolean boolean78 = node44.isEquivalentTo(node48);
        boolean boolean79 = node44.isVoid();
        com.google.javascript.rhino.Node node80 = node44.getFirstChild();
        boolean boolean81 = node80.isOptionalArg();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(jSDocInfo45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(jSType49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test26142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26142");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        node26.setLength((int) ' ');
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) -1, node37, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        boolean boolean53 = node42.hasChild(node52);
        int int54 = node42.getCharno();
        com.google.javascript.rhino.Node node55 = node32.useSourceInfoIfMissingFrom(node42);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node60 = node32.srcref(node59);
        boolean boolean61 = node26.isEquivalentToTyped(node32);
        node32.addSuppression("STRING  0 [synthetic: 1]\n");
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean68 = node67.isThrow();
        java.lang.String str72 = node67.toString(true, false, true);
        int int74 = node67.getIntProp(51);
        node67.addSuppression("STRING  0 [quoted: 1]\n");
        com.google.javascript.rhino.Node node77 = node32.useSourceInfoFrom(node67);
        boolean boolean78 = node77.isTrue();
        boolean boolean79 = node77.isAssign();
        node77.setSourceFileForTesting("Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n");
        boolean boolean82 = node77.isOr();
        boolean boolean83 = node77.isInstanceOf();
        boolean boolean84 = node77.isExprResult();
        // The following exception was thrown during execution in test generation
        try {
            double double85 = node77.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: OR 0 [jsdoc_info: JSDocInfo] [source_file: Node tree inequality:?Tree1:?STRING  0 [quoted: 1]???Tree2:?IN???Subtree1: STRING  0 [quoted: 1]???Subtree2: IN?] is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "STRING  0" + "'", str72, "STRING  0");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test26143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26143");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(49);
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setMutatesGlobalState();
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.setThrows();
    }

    @Test
    public void test26144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26144");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isDefaultCase();
        node4.setQuotedString();
        boolean boolean13 = node4.isDec();
        boolean boolean14 = node4.isLabel();
        boolean boolean15 = node4.isSetterDef();
        boolean boolean16 = node4.isRegExp();
        boolean boolean17 = node4.isName();
        boolean boolean18 = node4.isVoid();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) -1, node23, (int) (byte) 1, (int) '#');
        boolean boolean29 = node23.isDo();
        com.google.javascript.rhino.Node node30 = node4.useSourceInfoIfMissingFrom(node23);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        int int41 = node40.getType();
        boolean boolean42 = node40.isFor();
        node23.addChildToFront(node40);
        boolean boolean44 = node23.hasChildren();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node51 = node49.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) -1, node49, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node61 = node59.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node59, (int) (byte) 1, (int) '#');
        boolean boolean65 = node54.hasChild(node64);
        boolean boolean66 = node64.isVar();
        boolean boolean67 = node64.isBlock();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder68 = node64.new FileLevelJsDocBuilder();
        boolean boolean69 = node64.isCall();
        boolean boolean70 = node23.isEquivalentToTyped(node64);
        boolean boolean71 = node23.isDefaultCase();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node82 = node80.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node((int) (byte) -1, node80, (int) (byte) 1, (int) '#');
        boolean boolean86 = node80.isScript();
        node80.setQuotedString();
        com.google.javascript.rhino.Node node88 = node75.srcrefTree(node80);
        boolean boolean89 = node88.isNull();
        boolean boolean90 = node23.isEquivalentToTyped(node88);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test26145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26145");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean9 = node8.isThrow();
        java.lang.String str13 = node8.toString(true, false, true);
        jSDocInfo0.setAssociatedNode(node8);
        boolean boolean15 = jSDocInfo0.hasTypedefType();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node36 = node34.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) -1, node34, (int) (byte) 1, (int) '#');
        boolean boolean40 = node29.hasChild(node39);
        int int41 = node29.getCharno();
        com.google.javascript.rhino.Node node42 = node19.useSourceInfoIfMissingFrom(node29);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node47 = node19.srcref(node46);
        jSDocInfo0.setAssociatedNode(node19);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = jSDocInfo0.getReturnType();
        java.lang.String str50 = jSDocInfo0.getReturnDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "STRING  0" + "'", str13, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(jSTypeExpression49);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test26146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26146");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean5 = jSDocInfo0.hasReturnType();
        boolean boolean6 = jSDocInfo0.hasBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getReturnType();
        boolean boolean9 = jSDocInfo0.isExport();
        boolean boolean10 = jSDocInfo0.isIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean12 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str14 = jSDocInfo13.getVersion();
        java.lang.String str15 = jSDocInfo13.getFileOverview();
        jSDocInfo13.addSuppression("STRING  0");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList18 = jSDocInfo13.getExtendedInterfaces();
        java.util.Set<java.lang.String> strSet19 = jSDocInfo13.getParameterNames();
        boolean boolean20 = jSDocInfo13.containsDeclaration();
        boolean boolean21 = jSDocInfo13.isExport();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str23 = jSDocInfo22.getVersion();
        boolean boolean24 = jSDocInfo22.hasEnumParameterType();
        boolean boolean25 = jSDocInfo22.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = jSDocInfo22.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility27 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo22.setVisibility(visibility27);
        boolean boolean29 = jSDocInfo22.isJavaDispatch();
        boolean boolean30 = jSDocInfo22.hasFileOverview();
        boolean boolean31 = jSDocInfo22.containsDeclaration();
        com.google.common.collect.ImmutableList<java.lang.String> strList32 = jSDocInfo22.getTemplateTypeNames();
        java.lang.String str33 = jSDocInfo22.getReturnDescription();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility34 = jSDocInfo22.getVisibility();
        jSDocInfo13.setVisibility(visibility34);
        jSDocInfo0.setVisibility(visibility34);
        boolean boolean37 = jSDocInfo0.isConstant();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jSTypeExpressionList18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(jSTypeExpression26);
        org.junit.Assert.assertTrue("'" + visibility27 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility27.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + visibility34 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility34.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test26147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26147");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(2);
        sideEffectFlags1.setMutatesThis();
    }

    @Test
    public void test26148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26148");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double5 = node4.getDouble();
        int int6 = node4.getSourcePosition();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node10.setCharno(1);
        boolean boolean13 = node10.isRegExp();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node18.isDo();
        boolean boolean25 = node18.isDefaultCase();
        node18.setQuotedString();
        com.google.javascript.rhino.Node node27 = node10.useSourceInfoFromForTree(node18);
        node18.putIntProp((int) (byte) 100, (int) (byte) 0);
        node18.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean34 = node18.isInc();
        node18.setQuotedString();
        java.lang.String str36 = node18.getSourceFileName();
        com.google.javascript.rhino.Node node37 = node4.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(10, node4);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("(OR 1\n)", (int) (byte) 100, 15);
        com.google.javascript.rhino.Node node43 = node4.srcrefTree(node42);
        boolean boolean44 = node42.isStringKey();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4095.0d + "'", double5 == 4095.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 409601 + "'", int6 == 409601);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test26149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26149");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(49, "Node tree inequality:\nTree1:\nERROR 1\n    STRING  0\n\n\nTree2:\nSTRING  0\n\n\nSubtree1: ERROR 1\n    STRING  0\n\n\nSubtree2: STRING  0\n", 47, 36);
        boolean boolean5 = node4.isStringKey();
        boolean boolean6 = node4.isBlock();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test26150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26150");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(39, "BITXOR");
        node3.setVarArgs(false);
        boolean boolean6 = node3.isDec();
        com.google.javascript.rhino.InputId inputId7 = node3.getInputId();
        boolean boolean8 = node3.isNull();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0, node3);
        boolean boolean10 = node3.isDebugger();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test26151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26151");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str5 = jSDocInfo0.toString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getTypedefType();
        boolean boolean9 = jSDocInfo0.isImplicitCast();
        boolean boolean10 = jSDocInfo0.hasReturnType();
        boolean boolean11 = jSDocInfo0.isDeprecated();
        java.lang.String str12 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test26152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26152");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) -1, node32, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        boolean boolean48 = node37.hasChild(node47);
        boolean boolean49 = node47.isVar();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), node14, node47);
        boolean boolean51 = node14.isAssignAdd();
        com.google.javascript.rhino.Node node52 = node14.removeFirstChild();
        node52.setVarArgs(true);
        node52.detachChildren();
        java.lang.String str56 = node52.toString();
        boolean boolean57 = node52.isAssignAdd();
        node52.setIsSyntheticBlock(false);
        boolean boolean60 = node52.isLabel();
        boolean boolean61 = node52.isGetProp();
        boolean boolean62 = node52.isCase();
        // The following exception was thrown during execution in test generation
        try {
            node52.setSideEffectFlags(143361);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "STRING  0 [var_args_name: 1]" + "'", str56, "STRING  0 [var_args_name: 1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test26153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26153");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        int int3 = typePosition0.getPositionOnEndLine();
        typePosition0.setPositionInformation(30, 36, 40, (int) (short) 10);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 6);
        typePosition0.setItem(node10);
        boolean boolean12 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node23 = node21.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) -1, node21, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node33 = node31.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) -1, node31, (int) (byte) 1, (int) '#');
        boolean boolean37 = node26.hasChild(node36);
        int int38 = node26.getCharno();
        com.google.javascript.rhino.Node node39 = node16.useSourceInfoIfMissingFrom(node26);
        boolean boolean40 = node16.isSwitch();
        java.lang.String str41 = node16.toString();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean46 = node45.isThrow();
        java.lang.String str50 = node45.toString(true, false, true);
        java.lang.String str51 = node45.getQualifiedName();
        boolean boolean52 = node45.isIn();
        boolean boolean53 = node16.hasChild(node45);
        int int54 = node45.getSourcePosition();
        boolean boolean55 = node45.isGetterDef();
        boolean boolean56 = node45.isCatch();
        boolean boolean57 = node45.isCatch();
        boolean boolean58 = node45.isIf();
        boolean boolean59 = node45.isThis();
        boolean boolean60 = node45.isThrow();
        typePosition0.setItem(node45);
        boolean boolean62 = node45.isStringKey();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "OR 1" + "'", str41, "OR 1");
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "STRING  0" + "'", str50, "STRING  0");
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test26154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26154");
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray6);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(29, nodeArray6);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 1, nodeArray6);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(19, nodeArray6, 16, 213002);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(4095, nodeArray6);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(192609, nodeArray6);
        org.junit.Assert.assertNotNull(nodeArray6);
    }

    @Test
    public void test26155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26155");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeB;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
    }

    @Test
    public void test26156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26156");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        java.lang.String str5 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        boolean boolean6 = jSDocInfo0.hasEnumParameterType();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getThisType();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getAuthors();
        boolean boolean10 = jSDocInfo0.isConstructor();
        boolean boolean11 = jSDocInfo0.hasReturnType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getExtendedInterfaces();
        jSDocInfo0.setLicense("STRING  [synthetic: 1] [source_file: hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
    }

    @Test
    public void test26157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26157");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility5);
        boolean boolean7 = jSDocInfo0.isJavaDispatch();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean9 = jSDocInfo0.containsDeclaration();
        boolean boolean10 = jSDocInfo0.isNoSideEffects();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str13 = jSDocInfo12.getVersion();
        boolean boolean14 = jSDocInfo12.hasEnumParameterType();
        boolean boolean15 = jSDocInfo12.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo12.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility17 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo12.setVisibility(visibility17);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection19 = jSDocInfo12.getTypeNodes();
        boolean boolean20 = strSet11.contains((java.lang.Object) jSDocInfo12);
        java.util.Spliterator<java.lang.String> strSpliterator21 = strSet11.spliterator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + visibility5 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility5.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSTypeExpression16);
        org.junit.Assert.assertTrue("'" + visibility17 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility17.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(nodeCollection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strSpliterator21);
    }

    @Test
    public void test26158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26158");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        boolean boolean4 = ternaryValue2.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        boolean boolean8 = ternaryValue6.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue9.or(ternaryValue10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue6.xor(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue2.xor(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue0.and(ternaryValue6);
        boolean boolean16 = ternaryValue14.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue14.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = ternaryValue19.or(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue19.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = ternaryValue27.or(ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = ternaryValue29.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue25.xor(ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue29.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue19.and(ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = ternaryValue36.or(ternaryValue38);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = ternaryValue36.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue36.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        boolean boolean45 = ternaryValue43.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        boolean boolean49 = ternaryValue47.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = ternaryValue50.or(ternaryValue51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = ternaryValue47.xor(ternaryValue52);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = ternaryValue43.xor(ternaryValue47);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = ternaryValue56.or(ternaryValue58);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = ternaryValue61.or(ternaryValue63);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue65 = ternaryValue63.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = ternaryValue59.and(ternaryValue63);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = ternaryValue47.and(ternaryValue66);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = ternaryValue36.and(ternaryValue66);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = ternaryValue34.xor(ternaryValue68);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue71 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue72 = ternaryValue70.or(ternaryValue71);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = ternaryValue70.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = ternaryValue73.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue75 = ternaryValue73.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue76 = ternaryValue68.and(ternaryValue73);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue77 = ternaryValue73.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue78 = ternaryValue17.and(ternaryValue73);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertNotNull(ternaryValue65);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNotNull(ternaryValue70);
        org.junit.Assert.assertNotNull(ternaryValue72);
        org.junit.Assert.assertNotNull(ternaryValue73);
        org.junit.Assert.assertNotNull(ternaryValue74);
        org.junit.Assert.assertNotNull(ternaryValue75);
        org.junit.Assert.assertNotNull(ternaryValue76);
        org.junit.Assert.assertNotNull(ternaryValue77);
        org.junit.Assert.assertNotNull(ternaryValue78);
    }

    @Test
    public void test26159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26159");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) -1, node28, (int) (byte) 1, (int) '#');
        boolean boolean34 = node28.isScript();
        com.google.javascript.rhino.InputId inputId35 = node28.getInputId();
        com.google.javascript.rhino.Node node36 = node11.useSourceInfoFrom(node28);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean41 = node40.isThrow();
        java.lang.String str45 = node40.toString(true, false, true);
        node40.setIsSyntheticBlock(true);
        boolean boolean48 = node40.isTry();
        boolean boolean49 = node11.hasChild(node40);
        boolean boolean50 = node40.isAdd();
        node40.setString("STRING  [quoted: 1]");
        boolean boolean53 = node40.isFromExterns();
        node40.setVarArgs(true);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(inputId35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "STRING  0" + "'", str45, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test26160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26160");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(3, "ERROR");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(409601, node3);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test26161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26161");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean9 = node8.isThrow();
        java.lang.String str13 = node8.toString(true, false, true);
        jSDocInfo0.setAssociatedNode(node8);
        boolean boolean15 = jSDocInfo0.hasTypedefType();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node36 = node34.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) -1, node34, (int) (byte) 1, (int) '#');
        boolean boolean40 = node29.hasChild(node39);
        int int41 = node29.getCharno();
        com.google.javascript.rhino.Node node42 = node19.useSourceInfoIfMissingFrom(node29);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node47 = node19.srcref(node46);
        jSDocInfo0.setAssociatedNode(node19);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = jSDocInfo0.getReturnType();
        int int50 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str51 = jSDocInfo0.getReturnDescription();
        boolean boolean52 = jSDocInfo0.isJavaDispatch();
        boolean boolean54 = jSDocInfo0.hasParameter("IN\n");
        boolean boolean55 = jSDocInfo0.isOverride();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList56 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean57 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "STRING  0" + "'", str13, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(jSTypeExpression49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test26162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26162");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition3 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition5 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition6 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition8 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition9 = marker0.getAnnotation();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(nodeSourcePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(nodeSourcePosition5);
        org.junit.Assert.assertNull(typePosition6);
        org.junit.Assert.assertNull(typePosition7);
        org.junit.Assert.assertNull(typePosition8);
        org.junit.Assert.assertNull(stringPosition9);
    }

    @Test
    public void test26163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26163");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getThisType();
        boolean boolean4 = jSDocInfo0.hasBaseType();
        boolean boolean5 = jSDocInfo0.hasReturnType();
        boolean boolean6 = jSDocInfo0.hasBaseType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str8 = jSDocInfo7.getVersion();
        boolean boolean9 = jSDocInfo7.hasEnumParameterType();
        boolean boolean10 = jSDocInfo7.isNoAlias();
        java.lang.String str12 = jSDocInfo7.getDescriptionForParameter("JSDocInfo");
        boolean boolean13 = jSDocInfo7.hasEnumParameterType();
        boolean boolean14 = jSDocInfo7.containsDeclaration();
        java.lang.String str15 = jSDocInfo7.getDescription();
        java.lang.String str16 = jSDocInfo7.getVersion();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str18 = jSDocInfo17.getVersion();
        boolean boolean19 = jSDocInfo17.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet20 = jSDocInfo17.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility21 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo17.setVisibility(visibility21);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str24 = jSDocInfo23.getVersion();
        boolean boolean25 = jSDocInfo23.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet26 = jSDocInfo23.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility27 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo23.setVisibility(visibility27);
        jSDocInfo17.setVisibility(visibility27);
        jSDocInfo7.setVisibility(visibility27);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression31 = jSDocInfo7.getType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str33 = jSDocInfo32.getVersion();
        boolean boolean34 = jSDocInfo32.hasEnumParameterType();
        boolean boolean35 = jSDocInfo32.isNoAlias();
        java.lang.String str37 = jSDocInfo32.getDescriptionForParameter("JSDocInfo");
        boolean boolean38 = jSDocInfo32.hasEnumParameterType();
        boolean boolean39 = jSDocInfo32.containsDeclaration();
        java.lang.String str40 = jSDocInfo32.getDescription();
        java.lang.String str41 = jSDocInfo32.getVersion();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str43 = jSDocInfo42.getVersion();
        boolean boolean44 = jSDocInfo42.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet45 = jSDocInfo42.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility46 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo42.setVisibility(visibility46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str49 = jSDocInfo48.getVersion();
        boolean boolean50 = jSDocInfo48.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet51 = jSDocInfo48.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility52 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo48.setVisibility(visibility52);
        jSDocInfo42.setVisibility(visibility52);
        jSDocInfo32.setVisibility(visibility52);
        jSDocInfo7.setVisibility(visibility52);
        jSDocInfo0.setVisibility(visibility52);
        java.lang.String str58 = jSDocInfo0.getLicense();
        boolean boolean59 = jSDocInfo0.isConsistentIdGenerator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + visibility21 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility21.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + visibility27 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility27.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + visibility46 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility46.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertTrue("'" + visibility52 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility52.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test26164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26164");
        java.lang.String[] strArray2 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean10 = strSet3.addAll((java.util.Collection<java.lang.String>) strList8);
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str12 = jSDocInfo11.getVersion();
        java.lang.String str13 = jSDocInfo11.getFileOverview();
        boolean boolean14 = jSDocInfo11.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet15 = jSDocInfo11.getParameterNames();
        boolean boolean16 = strSet3.retainAll((java.util.Collection<java.lang.String>) strSet15);
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str18 = jSDocInfo17.getVersion();
        boolean boolean19 = jSDocInfo17.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet20 = jSDocInfo17.getParameterNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str22 = jSDocInfo21.getVersion();
        java.lang.String str23 = jSDocInfo21.getFileOverview();
        boolean boolean24 = jSDocInfo21.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet25 = jSDocInfo21.getParameterNames();
        java.util.Iterator<java.lang.String> strItor26 = strSet25.iterator();
        boolean boolean27 = strSet25.isEmpty();
        boolean boolean28 = strSet20.containsAll((java.util.Collection<java.lang.String>) strSet25);
        boolean boolean29 = strSet3.containsAll((java.util.Collection<java.lang.String>) strSet25);
        int int30 = strSet3.size();
        java.util.stream.Stream<java.lang.String> strStream31 = strSet3.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream32 = strSet3.stream();
        boolean boolean34 = strSet3.add("REGEXP \n");
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str36 = jSDocInfo35.getVersion();
        java.lang.String str37 = jSDocInfo35.getFileOverview();
        boolean boolean38 = jSDocInfo35.isHidden();
        boolean boolean39 = jSDocInfo35.isHidden();
        jSDocInfo35.addSuppression("(NUMBER 4095.0 100\n)");
        boolean boolean42 = strSet3.remove((java.lang.Object) jSDocInfo35);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strStream31);
        org.junit.Assert.assertNotNull(strStream32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test26165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26165");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation(8, 36, 31, (int) (short) 10);
        int int6 = stringPosition0.getStartLine();
        int int7 = stringPosition0.getStartLine();
        java.lang.String str8 = stringPosition0.getItem();
        stringPosition0.setPositionInformation((int) (short) -1, (int) (byte) 10, 52, 409601);
        stringPosition0.setPositionInformation(5, 100, 10, 40);
        stringPosition0.setPositionInformation((int) (byte) 10, (int) 'a', 54, 51);
        int int24 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test26166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26166");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        java.util.Set<java.lang.String> strSet6 = node3.getDirectives();
        boolean boolean7 = node3.isOr();
        boolean boolean8 = node3.isName();
        boolean boolean9 = node3.isNumber();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test26167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26167");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        boolean boolean17 = node16.isIf();
        com.google.javascript.rhino.Node node18 = node16.getParent();
        com.google.javascript.rhino.Node node19 = node16.getLastSibling();
        node16.setType(0);
        boolean boolean22 = node16.isTry();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        boolean boolean27 = node26.isGetterDef();
        boolean boolean28 = node16.isEquivalentTo(node26);
        node26.setSourceFileForTesting("STRING");
        boolean boolean31 = node26.isOnlyModifiesThisCall();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test26168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26168");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getStartLine();
        int int3 = stringPosition0.getStartLine();
        int int4 = stringPosition0.getEndLine();
        java.lang.String str5 = stringPosition0.getItem();
        int int6 = stringPosition0.getPositionOnEndLine();
        int int7 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nOR 51\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: OR 51\n");
        stringPosition0.setItem("ERROR [directives: [STRING  0, hi!, ]] [length: 43]");
        int int12 = stringPosition0.getPositionOnEndLine();
        int int13 = stringPosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test26169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26169");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        boolean boolean11 = node4.isStringKey();
        boolean boolean12 = node4.isSetterDef();
        int int13 = node4.getCharno();
        node4.setCharno((int) 'a');
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test26170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26170");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility5);
        boolean boolean7 = jSDocInfo0.isJavaDispatch();
        jSDocInfo0.addSuppression("OR 1");
        boolean boolean10 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean11 = jSDocInfo0.containsDeclaration();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getModifies();
        java.util.Set<java.lang.String> strSet13 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node24 = node22.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) -1, node22, (int) (byte) 1, (int) '#');
        boolean boolean28 = node22.isScript();
        node22.setQuotedString();
        com.google.javascript.rhino.Node node30 = node17.srcrefTree(node22);
        boolean boolean31 = node30.isCall();
        boolean boolean32 = node30.isIn();
        jSDocInfo0.setAssociatedNode(node30);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + visibility5 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility5.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test26171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26171");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition2 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition4 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getName();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition6 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = marker0.getType();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(nodeSourcePosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(nodeSourcePosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(nodeSourcePosition6);
        org.junit.Assert.assertNull(typePosition7);
    }

    @Test
    public void test26172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26172");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isConstructor();
        int int2 = jSDocInfo0.getParameterCount();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean5 = jSDocInfo0.hasDescriptionForParameter("hi!");
        boolean boolean7 = jSDocInfo0.hasParameterType("(REGEXP \n)");
        int int8 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test26173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26173");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 51, (int) (byte) 100, (int) (short) 10);
        boolean boolean4 = node3.isDebugger();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26174");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(39);
        int int2 = sideEffectFlags1.valueOf();
        sideEffectFlags1.setThrows();
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setReturnsTainted();
        int int7 = sideEffectFlags1.valueOf();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setMutatesGlobalState();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test26175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26175");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        int int4 = node3.getSourcePosition();
        int int5 = node3.getType();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node3.children();
        boolean boolean7 = node3.isAssignAdd();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 40 + "'", int5 == 40);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test26176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26176");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double4 = node3.getDouble();
        boolean boolean5 = node3.isAdd();
        com.google.javascript.rhino.Node node6 = node3.cloneNode();
        boolean boolean7 = node6.isNE();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node29 = node27.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) -1, node27, (int) (byte) 1, (int) '#');
        boolean boolean33 = node22.hasChild(node32);
        int int34 = node22.getCharno();
        com.google.javascript.rhino.Node node35 = node12.useSourceInfoIfMissingFrom(node22);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node40 = node12.srcref(node39);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean45 = node44.isFromExterns();
        boolean boolean46 = node40.hasChild(node44);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(52, node44);
        node6.addChildToBack(node47);
        boolean boolean49 = node47.isOr();
        boolean boolean50 = node47.isUnscopedQualifiedName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4095.0d + "'", double4 == 4095.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test26177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26177");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(39);
        int int2 = sideEffectFlags1.valueOf();
        sideEffectFlags1.setMutatesThis();
        int int4 = sideEffectFlags1.valueOf();
        int int5 = sideEffectFlags1.valueOf();
        sideEffectFlags1.setReturnsTainted();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 37 + "'", int4 == 37);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 37 + "'", int5 == 37);
    }

    @Test
    public void test26178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26178");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        com.google.javascript.rhino.Node node15 = node8.detachFromParent();
        node15.setOptionalArg(false);
        boolean boolean19 = node15.getBooleanProp(31);
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node15);
        boolean boolean21 = node20.isLabel();
        boolean boolean22 = node20.isWhile();
        boolean boolean23 = node20.isFor();
        boolean boolean24 = node20.isDelProp();
        java.lang.Object obj26 = node20.getProp((int) '4');
        com.google.javascript.rhino.Node node27 = node20.cloneTree();
        java.lang.String str28 = node20.getSourceFileName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test26179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26179");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("STRING  0\n");
        boolean boolean2 = node1.isNot();
        node1.setSourceEncodedPositionForTree(192609);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        boolean boolean20 = node14.isScript();
        node14.setQuotedString();
        com.google.javascript.rhino.Node node22 = node9.srcrefTree(node14);
        boolean boolean23 = node22.isIf();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(35, "OR 1", (int) (short) 0, 45);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean33 = node32.isThrow();
        java.lang.String str37 = node32.toString(true, false, true);
        boolean boolean38 = node32.isOptionalArg();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node[] nodeArray43 = new com.google.javascript.rhino.Node[] { node22, node28, node32, node42 };
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(38, nodeArray43, (int) (byte) 100, (int) (byte) 10);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 2, 8, 50);
        com.google.javascript.rhino.Node node51 = node46.useSourceInfoIfMissingFrom(node50);
        boolean boolean52 = node46.isDelProp();
        boolean boolean53 = node46.isIf();
        boolean boolean54 = node46.isExprResult();
        node1.addChildrenToBack(node46);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "STRING  0" + "'", str37, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeArray43);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test26180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26180");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        boolean boolean7 = jSDocInfo0.hasParameterType("JSDocInfo");
        jSDocInfo0.setDeprecated(true);
        boolean boolean10 = jSDocInfo0.hasThisType();
        boolean boolean11 = jSDocInfo0.hasTypedefType();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getSuppressions();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str14 = jSDocInfo13.getVersion();
        boolean boolean15 = jSDocInfo13.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet16 = jSDocInfo13.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList17 = jSDocInfo13.getImplementedInterfaces();
        boolean boolean18 = jSDocInfo13.hasReturnType();
        boolean boolean19 = jSDocInfo13.hasBaseType();
        boolean boolean20 = jSDocInfo13.isNoCompile();
        java.lang.String str21 = jSDocInfo13.getOriginalCommentString();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node28 = node26.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) -1, node26, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node38 = node36.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (byte) -1, node36, (int) (byte) 1, (int) '#');
        boolean boolean42 = node31.hasChild(node41);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(49, "STRING  0\n");
        com.google.javascript.rhino.Node node46 = node31.clonePropsFrom(node45);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node57 = node55.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) -1, node55, (int) (byte) 1, (int) '#');
        boolean boolean61 = node55.isScript();
        com.google.javascript.rhino.Node node62 = node55.detachFromParent();
        node62.setOptionalArg(false);
        boolean boolean66 = node62.getBooleanProp(31);
        com.google.javascript.rhino.Node node67 = node50.copyInformationFrom(node62);
        boolean boolean68 = node67.isLabel();
        com.google.javascript.rhino.Node node69 = node45.useSourceInfoIfMissingFrom(node67);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder70 = node45.new FileLevelJsDocBuilder();
        boolean boolean71 = node45.isNE();
        jSDocInfo13.setAssociatedNode(node45);
        boolean boolean73 = jSDocInfo13.isNoSideEffects();
        java.util.Set<java.lang.String> strSet74 = jSDocInfo13.getSuppressions();
        boolean boolean75 = strSet12.remove((java.lang.Object) strSet74);
        strSet74.clear();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(jSTypeExpressionList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test26181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26181");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node11 = node9.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) -1, node9, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node14.hasChild(node24);
        int int26 = node14.getCharno();
        com.google.javascript.rhino.Node node27 = node4.useSourceInfoIfMissingFrom(node14);
        boolean boolean28 = node14.isContinue();
        boolean boolean29 = node14.wasEmptyNode();
        boolean boolean30 = node14.isName();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        boolean boolean35 = node34.isLabelName();
        boolean boolean36 = node34.isCase();
        node34.setType(100);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile39 = node34.getStaticSourceFile();
        com.google.javascript.rhino.Node node40 = node14.copyInformationFromForTree(node34);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node47 = node45.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (byte) -1, node45, (int) (byte) 1, (int) '#');
        boolean boolean51 = node45.isDo();
        boolean boolean52 = node45.isDefaultCase();
        node45.setQuotedString();
        boolean boolean54 = node45.isDec();
        boolean boolean55 = node45.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node45.siblings();
        com.google.javascript.rhino.Node node57 = node45.detachFromParent();
        node57.setLength(38);
        int int60 = node57.getChildCount();
        com.google.javascript.rhino.Node node61 = node57.cloneNode();
        boolean boolean62 = node57.wasEmptyNode();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(52, node34, node57);
        com.google.javascript.rhino.jstype.JSType jSType64 = node57.getJSType();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int69 = node68.getType();
        com.google.javascript.rhino.Node node70 = node68.cloneNode();
        boolean boolean71 = node68.isFalse();
        int int72 = node57.getIndexOfChild(node68);
        com.google.javascript.rhino.Node node73 = node68.getLastSibling();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(staticSourceFile39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeIterable56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(jSType64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 40 + "'", int69 == 40);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(node73);
    }

    @Test
    public void test26182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26182");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(131104, "(OR 51)");
        boolean boolean3 = node2.hasMoreThanOneChild();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test26183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26183");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        java.lang.String str10 = node4.toStringTree();
        boolean boolean11 = node4.isAdd();
        boolean boolean12 = node4.isArrayLit();
        node4.setSourceEncodedPosition((-1));
        boolean boolean15 = node4.isIn();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "STRING  0\n" + "'", str10, "STRING  0\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test26184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26184");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = booleanLiteralSet1.intersection(booleanLiteralSet2);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = booleanLiteralSet0.intersection(booleanLiteralSet1);
        boolean boolean6 = booleanLiteralSet4.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = booleanLiteralSet7.intersection(booleanLiteralSet8);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = booleanLiteralSet4.intersection(booleanLiteralSet8);
        boolean boolean12 = booleanLiteralSet10.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = booleanLiteralSet14.intersection(booleanLiteralSet15);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet17 = booleanLiteralSet13.intersection(booleanLiteralSet14);
        boolean boolean19 = booleanLiteralSet17.contains(false);
        boolean boolean21 = booleanLiteralSet17.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = booleanLiteralSet10.union(booleanLiteralSet17);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = booleanLiteralSet22.intersection(booleanLiteralSet23);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet26 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet27 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet28 = booleanLiteralSet26.intersection(booleanLiteralSet27);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet29 = booleanLiteralSet25.intersection(booleanLiteralSet26);
        boolean boolean31 = booleanLiteralSet29.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = booleanLiteralSet32.intersection(booleanLiteralSet33);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet35 = booleanLiteralSet29.intersection(booleanLiteralSet33);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet38 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet39 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet40 = booleanLiteralSet38.intersection(booleanLiteralSet39);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet41 = booleanLiteralSet37.intersection(booleanLiteralSet38);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet42 = booleanLiteralSet36.union(booleanLiteralSet38);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet43 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet44 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet45 = booleanLiteralSet43.intersection(booleanLiteralSet44);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet46 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet47 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet48 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet49 = booleanLiteralSet47.intersection(booleanLiteralSet48);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet50 = booleanLiteralSet46.intersection(booleanLiteralSet47);
        boolean boolean52 = booleanLiteralSet50.contains(false);
        boolean boolean54 = booleanLiteralSet50.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet55 = booleanLiteralSet44.intersection(booleanLiteralSet50);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet56 = booleanLiteralSet36.intersection(booleanLiteralSet50);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet57 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet58 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet59 = booleanLiteralSet57.intersection(booleanLiteralSet58);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet60 = booleanLiteralSet56.intersection(booleanLiteralSet59);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet61 = booleanLiteralSet35.intersection(booleanLiteralSet56);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet63 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet64 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet65 = booleanLiteralSet63.intersection(booleanLiteralSet64);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet66 = booleanLiteralSet62.intersection(booleanLiteralSet63);
        boolean boolean68 = booleanLiteralSet66.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet69 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet70 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet71 = booleanLiteralSet69.intersection(booleanLiteralSet70);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet72 = booleanLiteralSet66.intersection(booleanLiteralSet70);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet74 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet75 = booleanLiteralSet72.intersection(booleanLiteralSet74);
        boolean boolean77 = booleanLiteralSet72.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet78 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet79 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet80 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet81 = booleanLiteralSet79.intersection(booleanLiteralSet80);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet82 = booleanLiteralSet78.intersection(booleanLiteralSet79);
        boolean boolean84 = booleanLiteralSet79.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet85 = booleanLiteralSet72.intersection(booleanLiteralSet79);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet86 = booleanLiteralSet56.intersection(booleanLiteralSet72);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet87 = booleanLiteralSet23.union(booleanLiteralSet72);
        boolean boolean89 = booleanLiteralSet87.contains(false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet2 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet2.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet17 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet17.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet23 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet23.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet26 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet26.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet27 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet27.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet28 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet28.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet29 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet29.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet33 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet33.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet35 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet35.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet36 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet36.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet38 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet38.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet39 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet39.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet40 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet40.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet41 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet41.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet42 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet42.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet43 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet43.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet44 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet44.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet45 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet45.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet46 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet46.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet47 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet47.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet48 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet48.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet49 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet49.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet50 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet50.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet55 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet55.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet56 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet56.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet57 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet57.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet58 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet58.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet59 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet59.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet60 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet60.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet61 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet61.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet63 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet63.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet64 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet64.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet65 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet65.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet66 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet66.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet69 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet69.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet70 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet70.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet71 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet71.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet72 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet72.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet74 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet74.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet75 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet75.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet78 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet78.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet79 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet79.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet80 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet80.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet81 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet81.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet82 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet82.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet85 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet85.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet86 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet86.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet87 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet87.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test26185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26185");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean5 = jSDocInfo0.hasReturnType();
        boolean boolean6 = jSDocInfo0.hasBaseType();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.hasBaseType();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node13.setCharno(1);
        boolean boolean16 = node13.isRegExp();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node23 = node21.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) -1, node21, (int) (byte) 1, (int) '#');
        boolean boolean27 = node21.isDo();
        boolean boolean28 = node21.isDefaultCase();
        node21.setQuotedString();
        com.google.javascript.rhino.Node node30 = node13.useSourceInfoFromForTree(node21);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node34.setCharno(1);
        java.util.Set<java.lang.String> strSet37 = node34.getDirectives();
        node34.setLength(0);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node46 = node44.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) -1, node44, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0, node30, node34, node49, (int) 'a', (int) (short) 0);
        boolean boolean53 = node30.isNull();
        com.google.javascript.rhino.jstype.JSType jSType54 = node30.getJSType();
        jSDocInfo0.setAssociatedNode(node30);
        boolean boolean56 = jSDocInfo0.shouldPreserveTry();
        boolean boolean57 = jSDocInfo0.hasModifies();
        java.util.Set<java.lang.String> strSet58 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression59 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(strSet37);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(jSType54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertNull(jSTypeExpression59);
    }

    @Test
    public void test26186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26186");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation(8, 36, 31, (int) (short) 10);
        java.lang.String str6 = stringPosition0.getItem();
        stringPosition0.setItem("Not declared as a type name");
        int int9 = stringPosition0.getPositionOnStartLine();
        int int10 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("(OR 51)");
        int int13 = stringPosition0.getStartLine();
        java.lang.String str14 = stringPosition0.getItem();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(OR 51)" + "'", str14, "(OR 51)");
    }

    @Test
    public void test26187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26187");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str5 = jSDocInfo0.toString();
        boolean boolean6 = jSDocInfo0.isOverride();
        boolean boolean7 = jSDocInfo0.isExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getReturnType();
        int int9 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean10 = jSDocInfo0.isExport();
        boolean boolean11 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test26188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26188");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isIn();
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node15.setCharno(1);
        java.util.Set<java.lang.String> strSet18 = node15.getDirectives();
        boolean boolean19 = node15.isHook();
        node11.addChildToFront(node15);
        boolean boolean21 = node11.isNE();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node11.siblings();
        boolean boolean23 = node11.isTypeOf();
        int int24 = node11.getType();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "STRING  0" + "'", str8, "STRING  0");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
    }

    @Test
    public void test26189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26189");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 100);
        boolean boolean3 = node1.getBooleanProp(35);
        boolean boolean4 = node1.isAdd();
        node1.setLength(3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26190");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        boolean boolean9 = node3.isGetterDef();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = node3.getJSDocInfo();
        boolean boolean11 = node3.isArrayLit();
        boolean boolean12 = node3.isFromExterns();
        boolean boolean13 = node3.isFunction();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "STRING  0" + "'", str8, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26191");
        com.google.javascript.rhino.Node[] nodeArray7 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0, nodeArray7);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(2, nodeArray7);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(4, nodeArray7, 39, (int) (short) 100);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 100, nodeArray7, 4111, (int) 'a');
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(36, nodeArray7);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(7, nodeArray7);
        org.junit.Assert.assertNotNull(nodeArray7);
    }

    @Test
    public void test26192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26192");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        boolean boolean7 = node4.isRegExp();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isDo();
        boolean boolean19 = node12.isDefaultCase();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        java.util.Set<java.lang.String> strSet28 = node25.getDirectives();
        node25.setLength(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node21, node25, node40, (int) 'a', (int) (short) 0);
        boolean boolean44 = node21.isString();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node51 = node49.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) -1, node49, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node61 = node59.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node59, (int) (byte) 1, (int) '#');
        boolean boolean65 = node54.hasChild(node64);
        boolean boolean66 = node64.isVar();
        boolean boolean67 = node64.isTypeOf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node64.children();
        com.google.javascript.rhino.Node node69 = node21.srcref(node64);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node76 = node74.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (byte) -1, node74, (int) (byte) 1, (int) '#');
        boolean boolean80 = node74.isDo();
        boolean boolean81 = node74.isExprResult();
        boolean boolean82 = node74.isTypeOf();
        com.google.javascript.rhino.Node node83 = node21.useSourceInfoFrom(node74);
        boolean boolean84 = node21.isCall();
        boolean boolean85 = node21.isRegExp();
        int int86 = node21.getSourcePosition();
        boolean boolean87 = node21.isSetterDef();
        com.google.javascript.rhino.jstype.JSType jSType88 = node21.getJSType();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 10 + "'", int86 == 10);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType88);
    }

    @Test
    public void test26193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26193");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        jSDocInfo0.addSuppression("STRING  0");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean12 = node11.isThrow();
        java.lang.String str16 = node11.toString(true, false, true);
        boolean boolean17 = node11.isThis();
        boolean boolean18 = strSet7.equals((java.lang.Object) boolean17);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition19 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition19.setPositionInformation(8, 36, 31, (int) (short) 10);
        int int25 = stringPosition19.getStartLine();
        int int26 = stringPosition19.getPositionOnStartLine();
        int int27 = stringPosition19.getPositionOnEndLine();
        boolean boolean28 = strSet7.equals((java.lang.Object) stringPosition19);
        java.util.stream.Stream<java.lang.String> strStream29 = strSet7.stream();
        java.util.Spliterator<java.lang.String> strSpliterator30 = strSet7.spliterator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "STRING  0" + "'", str16, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 36 + "'", int26 == 36);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strStream29);
        org.junit.Assert.assertNotNull(strSpliterator30);
    }

    @Test
    public void test26194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26194");
        java.lang.String[] strArray2 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean10 = strSet3.addAll((java.util.Collection<java.lang.String>) strList8);
        boolean boolean12 = strSet3.add("STRING  0");
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node23 = node21.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) -1, node21, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node33 = node31.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) -1, node31, (int) (byte) 1, (int) '#');
        boolean boolean37 = node26.hasChild(node36);
        int int38 = node26.getCharno();
        com.google.javascript.rhino.Node node39 = node16.useSourceInfoIfMissingFrom(node26);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node60 = node58.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) -1, node58, (int) (byte) 1, (int) '#');
        boolean boolean64 = node53.hasChild(node63);
        int int65 = node53.getCharno();
        com.google.javascript.rhino.Node node66 = node43.useSourceInfoIfMissingFrom(node53);
        int int67 = node43.getSourcePosition();
        java.lang.String str68 = node43.toString();
        com.google.javascript.rhino.Node node69 = node16.srcref(node43);
        boolean boolean70 = node16.isBreak();
        java.lang.String[] strArray73 = new java.lang.String[] { "STRING  0", "STRING  0" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        boolean boolean77 = strSet74.add("STRING  0");
        java.lang.Object[] objArray78 = strSet74.toArray();
        node16.setDirectives((java.util.Set<java.lang.String>) strSet74);
        boolean boolean80 = strSet74.isEmpty();
        boolean boolean81 = strSet3.removeAll((java.util.Collection<java.lang.String>) strSet74);
        java.util.Iterator<java.lang.String> strItor82 = strSet3.iterator();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 35 + "'", int65 == 35);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 4131 + "'", int67 == 4131);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "OR 1" + "'", str68, "OR 1");
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[STRING  0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[STRING  0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strItor82);
    }

    @Test
    public void test26195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26195");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        java.lang.String str7 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node11.setCharno(1);
        boolean boolean14 = node11.isRegExp();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node19.isDo();
        boolean boolean26 = node19.isDefaultCase();
        node19.setQuotedString();
        com.google.javascript.rhino.Node node28 = node11.useSourceInfoFromForTree(node19);
        node19.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean32 = node19.isVarArgs();
        jSDocInfo0.setAssociatedNode(node19);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression35 = jSDocInfo0.getParameterType("");
        boolean boolean36 = jSDocInfo0.isNoAlias();
        java.util.Set<java.lang.String> strSet37 = jSDocInfo0.getModifies();
        boolean boolean38 = jSDocInfo0.isNoAlias();
        boolean boolean39 = jSDocInfo0.isHidden();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSTypeExpression35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test26196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26196");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getSuppressions();
        jSDocInfo0.setDeprecated(true);
        boolean boolean11 = jSDocInfo0.hasModifies();
        boolean boolean12 = jSDocInfo0.hasReturnType();
        java.util.Set<java.lang.String> strSet13 = jSDocInfo0.getParameterNames();
        java.lang.String str15 = jSDocInfo0.getDescriptionForParameter("ERROR 1\n    STRING  0\n    STRING  0\n");
        boolean boolean17 = jSDocInfo0.hasDescriptionForParameter("(Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n)");
        java.lang.String str18 = jSDocInfo0.getLicense();
        boolean boolean19 = jSDocInfo0.isConstant();
        java.lang.String str20 = jSDocInfo0.getSourceName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection21 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(nodeCollection21);
    }

    @Test
    public void test26197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26197");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node20 = node18.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, node18, (int) (byte) 1, (int) '#');
        boolean boolean24 = node13.hasChild(node23);
        int int25 = node13.getCharno();
        com.google.javascript.rhino.Node node26 = node3.useSourceInfoIfMissingFrom(node13);
        node26.setLength((int) ' ');
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) -1, node37, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        boolean boolean53 = node42.hasChild(node52);
        int int54 = node42.getCharno();
        com.google.javascript.rhino.Node node55 = node32.useSourceInfoIfMissingFrom(node42);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node60 = node32.srcref(node59);
        boolean boolean61 = node26.isEquivalentToTyped(node32);
        boolean boolean62 = node32.isScript();
        boolean boolean63 = node32.isAssign();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable64 = node32.getAncestors();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor65 = ancestorIterable64.iterator();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor66 = ancestorIterable64.iterator();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor67 = ancestorIterable64.iterator();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(ancestorIterable64);
        org.junit.Assert.assertNotNull(nodeItor65);
        org.junit.Assert.assertNotNull(nodeItor66);
        org.junit.Assert.assertNotNull(nodeItor67);
    }

    @Test
    public void test26198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26198");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getLicense();
        boolean boolean3 = jSDocInfo0.isConstructor();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection4 = jSDocInfo0.getMarkers();
        boolean boolean5 = jSDocInfo0.isExterns();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        jSDocInfo0.setDeprecated(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getParameterType("true");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(markerCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNull(jSTypeExpression11);
    }

    @Test
    public void test26199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26199");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        java.util.Collection<java.lang.String> strCollection5 = jSDocInfo0.getReferences();
        java.lang.String str6 = jSDocInfo0.getLicense();
        java.lang.String str7 = jSDocInfo0.getVersion();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean10 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(strCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test26200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26200");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo1.getVersion();
        java.lang.String str3 = jSDocInfo1.getFileOverview();
        jSDocInfo1.addSuppression("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo1.getBaseType();
        boolean boolean7 = jSDocInfo1.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo1.getSuppressions();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str10 = jSDocInfo9.getVersion();
        boolean boolean11 = jSDocInfo9.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo9.getParameterNames();
        jSDocInfo9.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection15 = jSDocInfo9.getTypeNodes();
        java.lang.String str16 = jSDocInfo9.getDescription();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node20.setCharno(1);
        boolean boolean23 = node20.isRegExp();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node30 = node28.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) -1, node28, (int) (byte) 1, (int) '#');
        boolean boolean34 = node28.isDo();
        boolean boolean35 = node28.isDefaultCase();
        node28.setQuotedString();
        com.google.javascript.rhino.Node node37 = node20.useSourceInfoFromForTree(node28);
        node28.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean41 = node28.isVarArgs();
        jSDocInfo9.setAssociatedNode(node28);
        java.lang.String str43 = node28.toStringTree();
        boolean boolean44 = strSet8.equals((java.lang.Object) node28);
        java.lang.String[] strArray47 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        boolean boolean55 = strSet48.addAll((java.util.Collection<java.lang.String>) strList53);
        boolean boolean57 = strSet48.remove((java.lang.Object) 1L);
        java.util.stream.Stream<java.lang.String> strStream58 = strSet48.parallelStream();
        java.lang.Object[] objArray59 = strSet48.toArray();
        strSet48.clear();
        boolean boolean61 = strSet8.addAll((java.util.Collection<java.lang.String>) strSet48);
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str63 = jSDocInfo62.getVersion();
        boolean boolean64 = jSDocInfo62.hasEnumParameterType();
        boolean boolean65 = jSDocInfo62.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression66 = jSDocInfo62.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility67 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo62.setVisibility(visibility67);
        boolean boolean69 = jSDocInfo62.isJavaDispatch();
        boolean boolean70 = jSDocInfo62.hasFileOverview();
        boolean boolean71 = jSDocInfo62.containsDeclaration();
        java.util.Set<java.lang.String> strSet72 = jSDocInfo62.getModifies();
        boolean boolean73 = strSet8.containsAll((java.util.Collection<java.lang.String>) strSet72);
        com.google.javascript.rhino.Node[] nodeArray78 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray78);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(0, nodeArray78);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node(2, nodeArray78);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(49, nodeArray78, 38, 53);
        java.io.Serializable[] serializableArray85 = strSet72.toArray((java.io.Serializable[]) nodeArray78);
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(54, nodeArray78);
        com.google.javascript.rhino.Node node87 = node86.getLastSibling();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(nodeCollection15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "STRING  0 [quoted: 1]\n" + "'", str43, "STRING  0 [quoted: 1]\n");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strStream58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[STRING  0, hi!, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[STRING  0, hi!, ]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(jSTypeExpression66);
        org.junit.Assert.assertTrue("'" + visibility67 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility67.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(nodeArray78);
        org.junit.Assert.assertNotNull(serializableArray85);
        org.junit.Assert.assertNotNull(node87);
    }

    @Test
    public void test26201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26201");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        node11.setCharno((int) (short) 1);
        boolean boolean26 = node11.hasChildren();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node11.children();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        boolean boolean30 = node29.isLabelName();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean36 = node35.isThrow();
        java.lang.String str40 = node35.toString(true, false, true);
        boolean boolean41 = node35.isGetterDef();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = node35.getJSDocInfo();
        boolean boolean43 = node35.isBreak();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node48.setCharno(1);
        boolean boolean51 = node48.isRegExp();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node58 = node56.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (byte) -1, node56, (int) (byte) 1, (int) '#');
        boolean boolean62 = node56.isDo();
        boolean boolean63 = node56.isDefaultCase();
        node56.setQuotedString();
        com.google.javascript.rhino.Node node65 = node48.useSourceInfoFromForTree(node56);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node69.setCharno(1);
        java.util.Set<java.lang.String> strSet72 = node69.getDirectives();
        node69.setLength(0);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node81 = node79.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (byte) -1, node79, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(0, node65, node69, node84, (int) 'a', (int) (short) 0);
        int int88 = node65.getLineno();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable89 = node65.getAncestors();
        int int90 = node35.getIndexOfChild(node65);
        node29.putProp(40, (java.lang.Object) node35);
        com.google.javascript.rhino.Node node92 = node11.srcref(node29);
        node11.setQuotedString();
        com.google.javascript.rhino.jstype.JSType jSType94 = null;
        node11.setJSType(jSType94);
        java.lang.String str96 = node11.getSourceFileName();
        java.lang.String str97 = node11.getQualifiedName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "STRING  0" + "'", str40, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(jSDocInfo42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNull(strSet72);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(ancestorIterable89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertNull(str96);
        org.junit.Assert.assertNull(str97);
    }

    @Test
    public void test26202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26202");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "OR 51");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test26203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26203");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0, 38, 0);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(131104, node4, 19, 0);
        boolean boolean8 = node4.isHook();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test26204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26204");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        boolean boolean9 = node3.isGetterDef();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = node3.getJSDocInfo();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node31 = node29.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (byte) -1, node29, (int) (byte) 1, (int) '#');
        boolean boolean35 = node24.hasChild(node34);
        int int36 = node24.getCharno();
        com.google.javascript.rhino.Node node37 = node14.useSourceInfoIfMissingFrom(node24);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node42 = node14.srcref(node41);
        boolean boolean43 = node42.isAssignAdd();
        boolean boolean44 = node3.isEquivalentToTyped(node42);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node56 = node54.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) -1, node54, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node66 = node64.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) -1, node64, (int) (byte) 1, (int) '#');
        boolean boolean70 = node59.hasChild(node69);
        int int71 = node59.getCharno();
        com.google.javascript.rhino.Node node72 = node49.useSourceInfoIfMissingFrom(node59);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node77 = node49.srcref(node76);
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean82 = node81.isFromExterns();
        boolean boolean83 = node77.hasChild(node81);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(52, node81);
        boolean boolean85 = node42.hasChild(node81);
        node81.setOptionalArg(false);
        boolean boolean88 = node81.isParamList();
        boolean boolean89 = node81.isStringKey();
        node81.setLineno(221219);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "STRING  0" + "'", str8, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 35 + "'", int71 == 35);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test26205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26205");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test26206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26206");
        java.lang.String[] strArray2 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean10 = strSet3.addAll((java.util.Collection<java.lang.String>) strList8);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node17 = node15.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) -1, node15, (int) (byte) 1, (int) '#');
        boolean boolean21 = node15.isScript();
        node15.setQuotedString();
        boolean boolean23 = strSet3.equals((java.lang.Object) node15);
        boolean boolean24 = node15.isAssign();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder25 = node15.new FileLevelJsDocBuilder();
        boolean boolean26 = node15.isAnd();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str28 = jSDocInfo27.getVersion();
        java.lang.String str29 = jSDocInfo27.getFileOverview();
        boolean boolean30 = jSDocInfo27.shouldPreserveTry();
        boolean boolean31 = jSDocInfo27.isExpose();
        boolean boolean32 = jSDocInfo27.isNoSideEffects();
        boolean boolean33 = jSDocInfo27.hasReturnType();
        com.google.common.collect.ImmutableList<java.lang.String> strList34 = jSDocInfo27.getTemplateTypeNames();
        jSDocInfo27.addSuppression("STRING  0");
        java.util.Set<java.lang.String> strSet37 = jSDocInfo27.getParameterNames();
        java.util.Set<java.lang.String> strSet38 = jSDocInfo27.getModifies();
        node15.setDirectives(strSet38);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test26207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26207");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(6);
        boolean boolean2 = node1.hasMoreThanOneChild();
        boolean boolean3 = node1.isLabelName();
        boolean boolean5 = node1.getBooleanProp(43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test26208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26208");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        int int3 = typePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node7.setCharno(1);
        java.util.Set<java.lang.String> strSet10 = node7.getDirectives();
        boolean boolean11 = node7.isHook();
        int int12 = node7.getSourceOffset();
        boolean boolean13 = node7.isFunction();
        typePosition0.setItem(node7);
        int int15 = typePosition0.getPositionOnEndLine();
        int int16 = typePosition0.getStartLine();
        boolean boolean17 = typePosition0.hasBrackets();
        int int18 = typePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node19 = typePosition0.getItem();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test26209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26209");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str6 = jSDocInfo0.getDeprecationReason();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test26210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26210");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("ERROR 1");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((int) (byte) -1, node2, 43, 3);
        boolean boolean6 = node2.isWhile();
        com.google.javascript.rhino.Node node7 = node2.detachFromParent();
        boolean boolean8 = node7.isThis();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test26211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26211");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (short) -1);
        boolean boolean2 = node1.isWith();
        node1.setDouble((double) 1);
        java.lang.String[] strArray7 = new java.lang.String[] { "STRING  0", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        boolean boolean15 = strSet8.addAll((java.util.Collection<java.lang.String>) strList13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str17 = jSDocInfo16.getVersion();
        java.lang.String str18 = jSDocInfo16.getFileOverview();
        boolean boolean19 = jSDocInfo16.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet20 = jSDocInfo16.getParameterNames();
        boolean boolean21 = strSet8.retainAll((java.util.Collection<java.lang.String>) strSet20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node28 = node26.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) -1, node26, (int) (byte) 1, (int) '#');
        boolean boolean32 = node26.isDo();
        boolean boolean33 = node26.isDefaultCase();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node44 = node42.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node42, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node54 = node52.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (byte) -1, node52, (int) (byte) 1, (int) '#');
        boolean boolean58 = node47.hasChild(node57);
        int int59 = node47.getCharno();
        com.google.javascript.rhino.Node node60 = node37.useSourceInfoIfMissingFrom(node47);
        int int61 = node37.getSourcePosition();
        java.lang.String str62 = node37.toString();
        int int63 = node26.getIndexOfChild(node37);
        boolean boolean64 = strSet8.equals((java.lang.Object) node26);
        boolean boolean65 = node26.isDec();
        com.google.javascript.rhino.Node node66 = node1.useSourceInfoIfMissingFrom(node26);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node73 = node71.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) (byte) -1, node71, (int) (byte) 1, (int) '#');
        boolean boolean77 = node71.isScript();
        com.google.javascript.rhino.Node node78 = node71.detachFromParent();
        boolean boolean79 = node71.isAssignAdd();
        boolean boolean80 = node71.isArrayLit();
        boolean boolean81 = node71.isLocalResultCall();
        boolean boolean82 = node71.isIf();
        com.google.javascript.rhino.Node node83 = node66.srcref(node71);
        boolean boolean84 = node83.isAssign();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 35 + "'", int59 == 35);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 4131 + "'", int61 == 4131);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "OR 1" + "'", str62, "OR 1");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test26212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26212");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        boolean boolean8 = jSDocInfo0.isExpose();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str10 = jSDocInfo9.getVersion();
        boolean boolean11 = jSDocInfo9.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo9.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility13 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo9.setVisibility(visibility13);
        jSDocInfo0.setVisibility(visibility13);
        boolean boolean16 = jSDocInfo0.isJavaDispatch();
        jSDocInfo0.setLicense("Node tree inequality:\nTree1:\nMUL ERROR 1\n    STRING  0\n\n\n\nTree2:\nERROR\n    STRING  0\n\n\nSubtree1: MUL ERROR 1\n    STRING  0\n\n\n\nSubtree2: ERROR\n    STRING  0\n");
        boolean boolean19 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + visibility13 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility13.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test26213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26213");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(38, "STRING  0");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node4 = node2.getLastChild();
        boolean boolean5 = node2.isVar();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node12 = node10.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) -1, node10, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node22 = node20.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) -1, node20, (int) (byte) 1, (int) '#');
        boolean boolean26 = node15.hasChild(node25);
        boolean boolean27 = node25.isVar();
        boolean boolean28 = node25.isTypeOf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node25.children();
        boolean boolean30 = node25.isTrue();
        node25.setWasEmptyNode(false);
        boolean boolean33 = node25.isSyntheticBlock();
        com.google.javascript.rhino.Node node34 = node2.srcref(node25);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node49 = node47.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node59 = node57.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (byte) -1, node57, (int) (byte) 1, (int) '#');
        boolean boolean63 = node52.hasChild(node62);
        int int64 = node52.getCharno();
        com.google.javascript.rhino.Node node65 = node42.useSourceInfoIfMissingFrom(node52);
        node65.setLength((int) ' ');
        node38.addChildrenToBack(node65);
        com.google.javascript.rhino.Node node69 = node65.getParent();
        com.google.javascript.rhino.Node node70 = node25.copyInformationFromForTree(node65);
        node70.setLineno(15);
        boolean boolean73 = node70.wasEmptyNode();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable74 = node70.children();
        int int75 = node70.getType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 35 + "'", int64 == 35);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(nodeIterable74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test26214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26214");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node20.new FileLevelJsDocBuilder();
        boolean boolean22 = node20.isCase();
        boolean boolean23 = node20.isFalse();
        boolean boolean24 = node20.isInstanceOf();
        boolean boolean25 = node20.isDefaultCase();
        boolean boolean26 = node20.isLocalResultCall();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test26215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26215");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("(OR 1)", 29, 49);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isScript();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node20 = node7.srcrefTree(node12);
        com.google.javascript.rhino.Node node21 = node20.cloneNode();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean26 = node25.isThrow();
        java.lang.String str30 = node25.toString(true, false, true);
        java.lang.String str31 = node25.getQualifiedName();
        boolean boolean32 = node25.isIn();
        boolean boolean33 = node21.isEquivalentToTyped(node25);
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str35 = jSDocInfo34.getVersion();
        boolean boolean36 = jSDocInfo34.hasEnumParameterType();
        java.lang.String str38 = jSDocInfo34.getDescriptionForParameter("STRING  0\n");
        java.lang.String str39 = jSDocInfo34.getDescription();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node50 = node48.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node48, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node60 = node58.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) -1, node58, (int) (byte) 1, (int) '#');
        boolean boolean64 = node53.hasChild(node63);
        int int65 = node53.getCharno();
        com.google.javascript.rhino.Node node66 = node43.useSourceInfoIfMissingFrom(node53);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node71 = node43.srcref(node70);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean76 = node75.isFromExterns();
        boolean boolean77 = node71.hasChild(node75);
        jSDocInfo34.setAssociatedNode(node71);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile79 = null;
        node71.setStaticSourceFile(staticSourceFile79);
        com.google.javascript.rhino.Node node81 = node21.copyInformationFrom(node71);
        boolean boolean82 = node21.isInc();
        int int83 = node21.getType();
        boolean boolean84 = node21.isAdd();
        com.google.javascript.rhino.Node node85 = node3.copyInformationFromForTree(node21);
        com.google.javascript.rhino.JSDocInfo jSDocInfo86 = null;
        node21.setJSDocInfo(jSDocInfo86);
        boolean boolean88 = node21.isAnd();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "STRING  0" + "'", str30, "STRING  0");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 35 + "'", int65 == 35);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 100 + "'", int83 == 100);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test26216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26216");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node3.setCharno(1);
        boolean boolean6 = node3.isRegExp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        node11.setQuotedString();
        com.google.javascript.rhino.Node node20 = node3.useSourceInfoFromForTree(node11);
        node11.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean24 = node11.isVarArgs();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean29 = node28.isThrow();
        java.lang.String str33 = node28.toString(true, false, true);
        node28.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(53, "OR 51");
        boolean boolean39 = node38.isLabel();
        java.util.Set<java.lang.String> strSet40 = node38.getDirectives();
        java.lang.Object obj42 = node38.getProp(44);
        node38.setSourceEncodedPosition(8);
        node28.addChildrenToBack(node38);
        boolean boolean46 = node11.isEquivalentTo(node38);
        boolean boolean47 = node11.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node48 = node11.getParent();
        boolean boolean49 = node11.isNE();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "STRING  0" + "'", str33, "STRING  0");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(strSet40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test26217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26217");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation(8, 36, 31, (int) (short) 10);
        int int6 = stringPosition0.getStartLine();
        int int7 = stringPosition0.getPositionOnStartLine();
        java.lang.String str8 = stringPosition0.getItem();
        int int9 = stringPosition0.getEndLine();
        int int10 = stringPosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test26218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26218");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        java.lang.String str7 = jSDocInfo0.getDescription();
        java.lang.String str8 = jSDocInfo0.getLicense();
        boolean boolean9 = jSDocInfo0.isImplicitCast();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = jSDocInfo0.getTemplateTypeNames();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection11 = jSDocInfo0.getMarkers();
        java.lang.String str12 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getReturnType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection14 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(markerCollection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertNotNull(markerCollection14);
    }

    @Test
    public void test26219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26219");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 5, 15, 23);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(16773120, node4);
        boolean boolean6 = node4.isFromExterns();
        boolean boolean7 = node4.isQualifiedName();
        boolean boolean8 = node4.isReturn();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("Not declared as a constructor", (-1), 2);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isScript();
        com.google.javascript.rhino.Node node24 = node17.detachFromParent();
        node24.setOptionalArg(false);
        boolean boolean28 = node24.getBooleanProp(31);
        com.google.javascript.rhino.Node node29 = node12.copyInformationFrom(node24);
        boolean boolean30 = node29.isLabel();
        com.google.javascript.rhino.InputId inputId31 = node29.getInputId();
        java.lang.String str32 = node29.getString();
        com.google.javascript.rhino.jstype.JSType jSType33 = node29.getJSType();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node40 = node38.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (byte) -1, node38, (int) (byte) 1, (int) '#');
        boolean boolean44 = node38.isScript();
        com.google.javascript.rhino.InputId inputId45 = node38.getInputId();
        boolean boolean46 = node38.isDelProp();
        boolean boolean47 = node38.isBlock();
        boolean boolean48 = node38.isQuotedString();
        boolean boolean49 = node38.isTrue();
        com.google.javascript.rhino.Node node50 = node29.srcref(node38);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition51 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int52 = namePosition51.getPositionOnStartLine();
        int int53 = namePosition51.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str55 = jSDocInfo54.getVersion();
        boolean boolean56 = jSDocInfo54.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet57 = jSDocInfo54.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList58 = jSDocInfo54.getImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean63 = node62.isThrow();
        java.lang.String str67 = node62.toString(true, false, true);
        jSDocInfo54.setAssociatedNode(node62);
        com.google.javascript.rhino.Node node69 = node62.removeFirstChild();
        boolean boolean70 = node62.isNumber();
        boolean boolean71 = node62.isVar();
        com.google.javascript.rhino.Node node72 = node62.getLastChild();
        namePosition51.setItem(node62);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node80 = node78.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (byte) -1, node78, (int) (byte) 1, (int) '#');
        boolean boolean84 = node78.isDo();
        boolean boolean85 = node78.isDefaultCase();
        node78.setQuotedString();
        boolean boolean87 = node78.isDec();
        boolean boolean88 = node78.isLabel();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable89 = node78.siblings();
        com.google.javascript.rhino.Node node90 = node78.detachFromParent();
        node90.setLength(38);
        boolean boolean93 = node90.isWith();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable94 = node90.children();
        boolean boolean95 = node62.isEquivalentToTyped(node90);
        com.google.javascript.rhino.Node node96 = node29.useSourceInfoIfMissingFromForTree(node62);
        com.google.javascript.rhino.Node node97 = node4.srcref(node62);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Not declared as a constructor" + "'", str32, "Not declared as a constructor");
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(inputId45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertNotNull(jSTypeExpressionList58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "STRING  0" + "'", str67, "STRING  0");
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(nodeIterable89);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(nodeIterable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertNotNull(node97);
    }

    @Test
    public void test26220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26220");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<java.lang.String> strCollection1 = jSDocInfo0.getAuthors();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isHidden();
        boolean boolean4 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(strCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26221");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        boolean boolean7 = node4.isRegExp();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node14 = node12.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) -1, node12, (int) (byte) 1, (int) '#');
        boolean boolean18 = node12.isDo();
        boolean boolean19 = node12.isDefaultCase();
        node12.setQuotedString();
        com.google.javascript.rhino.Node node21 = node4.useSourceInfoFromForTree(node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node25.setCharno(1);
        java.util.Set<java.lang.String> strSet28 = node25.getDirectives();
        node25.setLength(0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node37 = node35.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) -1, node35, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node21, node25, node40, (int) 'a', (int) (short) 0);
        boolean boolean44 = node21.isString();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node51 = node49.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) -1, node49, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node61 = node59.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node59, (int) (byte) 1, (int) '#');
        boolean boolean65 = node54.hasChild(node64);
        boolean boolean66 = node64.isVar();
        boolean boolean67 = node64.isTypeOf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node64.children();
        com.google.javascript.rhino.Node node69 = node21.srcref(node64);
        node69.setSourceFileForTesting("Unknown class name");
        com.google.javascript.rhino.InputId inputId72 = node69.getInputId();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNull(inputId72);
    }

    @Test
    public void test26222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26222");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility5);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = jSDocInfo0.getTypeNodes();
        boolean boolean8 = jSDocInfo0.isConstant();
        java.lang.String str9 = jSDocInfo0.getLendsName();
        boolean boolean10 = jSDocInfo0.isOverride();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + visibility5 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility5.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(nodeCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test26223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26223");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("NUMBER 4095.0 100\n");
        boolean boolean2 = node1.isGetProp();
        boolean boolean3 = node1.isQuotedString();
        node1.setLength(30);
        boolean boolean6 = node1.isIn();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node13 = node11.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) -1, node11, (int) (byte) 1, (int) '#');
        boolean boolean17 = node11.isDo();
        boolean boolean18 = node11.isDefaultCase();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node29 = node27.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) -1, node27, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) -1, node37, (int) (byte) 1, (int) '#');
        boolean boolean43 = node32.hasChild(node42);
        int int44 = node32.getCharno();
        com.google.javascript.rhino.Node node45 = node22.useSourceInfoIfMissingFrom(node32);
        int int46 = node22.getSourcePosition();
        java.lang.String str47 = node22.toString();
        int int48 = node11.getIndexOfChild(node22);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node52.setCharno(1);
        boolean boolean55 = node52.isRegExp();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node62 = node60.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (byte) -1, node60, (int) (byte) 1, (int) '#');
        boolean boolean66 = node60.isDo();
        boolean boolean67 = node60.isDefaultCase();
        node60.setQuotedString();
        com.google.javascript.rhino.Node node69 = node52.useSourceInfoFromForTree(node60);
        node60.putIntProp((int) (byte) 100, (int) (byte) 0);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node79 = node77.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((int) (byte) -1, node77, (int) (byte) 1, (int) '#');
        boolean boolean83 = node77.isScript();
        com.google.javascript.rhino.InputId inputId84 = node77.getInputId();
        com.google.javascript.rhino.Node node85 = node60.useSourceInfoFrom(node77);
        int int86 = node11.getIndexOfChild(node77);
        int int87 = node11.getLength();
        boolean boolean88 = node11.isSetterDef();
        boolean boolean89 = node1.isEquivalentTo(node11);
        boolean boolean90 = node1.isHook();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4131 + "'", int46 == 4131);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "OR 1" + "'", str47, "OR 1");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(inputId84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test26224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26224");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean5 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node16 = node14.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) -1, node14, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node19.hasChild(node29);
        int int31 = node19.getCharno();
        com.google.javascript.rhino.Node node32 = node9.useSourceInfoIfMissingFrom(node19);
        node32.setLength((int) ' ');
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node45 = node43.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (byte) -1, node43, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node55 = node53.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (byte) -1, node53, (int) (byte) 1, (int) '#');
        boolean boolean59 = node48.hasChild(node58);
        int int60 = node48.getCharno();
        com.google.javascript.rhino.Node node61 = node38.useSourceInfoIfMissingFrom(node48);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node66 = node38.srcref(node65);
        boolean boolean67 = node32.isEquivalentToTyped(node38);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node74 = node72.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node((int) (byte) -1, node72, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node84 = node82.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node((int) (byte) -1, node82, (int) (byte) 1, (int) '#');
        boolean boolean88 = node77.hasChild(node87);
        boolean boolean89 = node87.isVar();
        boolean boolean90 = node87.isCase();
        boolean boolean91 = node38.hasChild(node87);
        jSDocInfo0.setAssociatedNode(node38);
        boolean boolean93 = jSDocInfo0.hasBaseType();
        boolean boolean94 = jSDocInfo0.isExpose();
        java.lang.String str95 = jSDocInfo0.getVersion();
        boolean boolean96 = jSDocInfo0.isExpose();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test26225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26225");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str5 = jSDocInfo0.getMeaning();
        boolean boolean6 = jSDocInfo0.isExterns();
        boolean boolean8 = jSDocInfo0.hasDescriptionForParameter("INSTANCEOF 0\n");
        boolean boolean9 = jSDocInfo0.hasBaseType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getParameterType("((Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nIN\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: IN\n))");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getBaseType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList13 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = jSDocInfo0.getThisType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertNull(jSTypeExpression12);
        org.junit.Assert.assertNotNull(jSTypeExpressionList13);
        org.junit.Assert.assertNull(jSTypeExpression14);
    }

    @Test
    public void test26226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26226");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        java.lang.String str5 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        boolean boolean6 = jSDocInfo0.hasEnumParameterType();
        boolean boolean7 = jSDocInfo0.hasBaseType();
        boolean boolean8 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        boolean boolean10 = jSDocInfo0.isHidden();
        boolean boolean12 = jSDocInfo0.hasParameter("STRING \n    STRING  0\n");
        boolean boolean13 = jSDocInfo0.isNoSideEffects();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26227");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean5 = node4.isThrow();
        java.lang.String str9 = node4.toString(true, false, true);
        java.lang.String str10 = node4.getQualifiedName();
        boolean boolean11 = node4.isIn();
        com.google.javascript.rhino.Node node12 = node4.cloneTree();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isScript();
        com.google.javascript.rhino.Node node24 = node17.detachFromParent();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node28.setCharno(1);
        java.util.Set<java.lang.String> strSet31 = node28.getDirectives();
        boolean boolean32 = node28.isHook();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node43 = node41.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) -1, node41, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node53 = node51.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) -1, node51, (int) (byte) 1, (int) '#');
        boolean boolean57 = node46.hasChild(node56);
        int int58 = node46.getCharno();
        com.google.javascript.rhino.Node node59 = node36.useSourceInfoIfMissingFrom(node46);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node64 = node36.srcref(node63);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(4095, node12, node24, node28, node36);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node72 = node70.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (byte) -1, node70, (int) (byte) 1, (int) '#');
        int int76 = node75.getType();
        boolean boolean77 = node28.isEquivalentTo(node75);
        boolean boolean78 = node28.isUnscopedQualifiedName();
        node28.setVarArgs(false);
        boolean boolean81 = node28.isAssign();
        boolean boolean82 = node28.isLabelName();
        node28.addSuppression("unknown");
        int int85 = node28.getLineno();
        boolean boolean86 = node28.isThrow();
        node28.putIntProp(50, 1044480);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "STRING  0" + "'", str9, "STRING  0");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 35 + "'", int58 == 35);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test26228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26228");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation(8, 36, 31, (int) (short) 10);
        java.lang.String str6 = stringPosition0.getItem();
        int int7 = stringPosition0.getPositionOnEndLine();
        java.lang.String str8 = stringPosition0.getItem();
        int int9 = stringPosition0.getPositionOnStartLine();
        int int10 = stringPosition0.getPositionOnEndLine();
        int int11 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setPositionInformation((int) (byte) 10, 208993, 45, (int) 'a');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
    }

    @Test
    public void test26229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26229");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getThrownTypes();
        java.lang.String str6 = jSDocInfo0.getDeprecationReason();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        boolean boolean8 = jSDocInfo0.isInterface();
        jSDocInfo0.setLicense("Node tree inequality:\nTree1:\nOR 0\n\n\nTree2:\nNUMBER 4095.0 100\n\n\nSubtree1: OR 0\n\n\nSubtree2: NUMBER 4095.0 100\n");
        boolean boolean11 = jSDocInfo0.hasFileOverview();
        boolean boolean12 = jSDocInfo0.isNoShadow();
        boolean boolean14 = jSDocInfo0.hasParameterType("STRING NUMBER 4095.0 100\n 4095");
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str16 = jSDocInfo15.getVersion();
        boolean boolean17 = jSDocInfo15.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet18 = jSDocInfo15.getParameterNames();
        jSDocInfo15.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection21 = jSDocInfo15.getTypeNodes();
        java.lang.String str22 = jSDocInfo15.getDescription();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node26.setCharno(1);
        boolean boolean29 = node26.isRegExp();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node36 = node34.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) -1, node34, (int) (byte) 1, (int) '#');
        boolean boolean40 = node34.isDo();
        boolean boolean41 = node34.isDefaultCase();
        node34.setQuotedString();
        com.google.javascript.rhino.Node node43 = node26.useSourceInfoFromForTree(node34);
        node34.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean47 = node34.isVarArgs();
        jSDocInfo15.setAssociatedNode(node34);
        boolean boolean49 = jSDocInfo15.isNoAlias();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str51 = jSDocInfo50.getVersion();
        boolean boolean52 = jSDocInfo50.hasEnumParameterType();
        boolean boolean53 = jSDocInfo50.isNoAlias();
        java.lang.String str55 = jSDocInfo50.getDescriptionForParameter("JSDocInfo");
        boolean boolean56 = jSDocInfo50.hasEnumParameterType();
        jSDocInfo50.setLicense("Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n");
        java.lang.String str59 = jSDocInfo50.getLicense();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str61 = jSDocInfo60.getVersion();
        boolean boolean62 = jSDocInfo60.hasEnumParameterType();
        boolean boolean63 = jSDocInfo60.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression64 = jSDocInfo60.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility65 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo60.setVisibility(visibility65);
        boolean boolean67 = jSDocInfo60.isJavaDispatch();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList68 = jSDocInfo60.getImplementedInterfaces();
        boolean boolean69 = jSDocInfo60.containsDeclaration();
        boolean boolean70 = jSDocInfo60.isNoSideEffects();
        int int71 = jSDocInfo60.getExtendedInterfacesCount();
        com.google.common.collect.ImmutableList<java.lang.String> strList72 = jSDocInfo60.getTemplateTypeNames();
        java.lang.String str73 = jSDocInfo60.getLicense();
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str75 = jSDocInfo74.getVersion();
        boolean boolean76 = jSDocInfo74.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet77 = jSDocInfo74.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility78 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo74.setVisibility(visibility78);
        jSDocInfo60.setVisibility(visibility78);
        jSDocInfo50.setVisibility(visibility78);
        jSDocInfo15.setVisibility(visibility78);
        jSDocInfo0.setVisibility(visibility78);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(nodeCollection21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n" + "'", str59, "Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(jSTypeExpression64);
        org.junit.Assert.assertTrue("'" + visibility65 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility65.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertTrue("'" + visibility78 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility78.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
    }

    @Test
    public void test26230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26230");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        int int6 = jSDocInfo0.getParameterCount();
        java.lang.String str7 = jSDocInfo0.getMeaning();
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        boolean boolean9 = jSDocInfo0.isExport();
        boolean boolean10 = jSDocInfo0.hasEnumParameterType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getExtendedInterfaces();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection12 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertNotNull(markerCollection12);
    }

    @Test
    public void test26231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26231");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        com.google.javascript.rhino.Node node11 = node4.detachFromParent();
        node11.setOptionalArg(false);
        boolean boolean15 = node11.getBooleanProp(31);
        int int16 = node11.getSourceOffset();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node20.setCharno(1);
        java.util.Set<java.lang.String> strSet23 = node20.getDirectives();
        node20.setCharno((int) (short) -1);
        boolean boolean26 = node20.isRegExp();
        com.google.javascript.rhino.Node node27 = node20.getLastChild();
        boolean boolean28 = node20.isDec();
        com.google.javascript.rhino.Node node29 = node11.srcrefTree(node20);
        int int30 = node29.getLineno();
        boolean boolean31 = node29.isDo();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test26232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26232");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition9 = marker0.getAnnotation();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(stringPosition8);
        org.junit.Assert.assertNull(stringPosition9);
    }

    @Test
    public void test26233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26233");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str5 = jSDocInfo0.toString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("STRING  0");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getTypedefType();
        boolean boolean9 = jSDocInfo0.hasThisType();
        boolean boolean10 = jSDocInfo0.hasBaseType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getThisType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = jSDocInfo0.getVisibility();
        boolean boolean13 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.Node node14 = null;
        jSDocInfo0.setAssociatedNode(node14);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertNull(visibility12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26234");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean4 = node3.isThrow();
        java.lang.String str8 = node3.toString(true, false, true);
        java.lang.String str9 = node3.getQualifiedName();
        boolean boolean10 = node3.isIn();
        com.google.javascript.rhino.Node node11 = node3.cloneTree();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node15.setCharno(1);
        java.util.Set<java.lang.String> strSet18 = node15.getDirectives();
        boolean boolean19 = node15.isHook();
        node11.addChildToFront(node15);
        com.google.javascript.rhino.Node node21 = node15.getLastSibling();
        java.lang.Object obj23 = node21.getProp(2);
        boolean boolean24 = node21.isVoid();
        boolean boolean25 = node21.isInstanceOf();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "STRING  0" + "'", str8, "STRING  0");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test26235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26235");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        jSDocInfo0.addSuppression("STRING  0");
        boolean boolean5 = jSDocInfo0.isNoCompile();
        boolean boolean6 = jSDocInfo0.hasFileOverview();
        boolean boolean7 = jSDocInfo0.isConsistentIdGenerator();
        java.lang.String str9 = jSDocInfo0.getDescriptionForParameter("Node tree inequality:\nTree1:\nSTRING  0 [quoted: 1]\n\n\nTree2:\nOR 0\n\n\nSubtree1: STRING  0 [quoted: 1]\n\n\nSubtree2: OR 0\n");
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection10 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getModifies();
        jSDocInfo0.setLicense("(Node tree inequality:\nTree1:\nSTRING hi! 0\n\n\nTree2:\nOR 51\n\n\nSubtree1: STRING hi! 0\n\n\nSubtree2: OR 51\n)");
        int int14 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean15 = jSDocInfo0.isInterface();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(markerCollection10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test26236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26236");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        jSDocInfo0.addSuppression("STRING  0");
        boolean boolean5 = jSDocInfo0.isConstant();
        java.util.Collection<java.lang.String> strCollection6 = jSDocInfo0.getAuthors();
        int int7 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean8 = jSDocInfo0.isExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strCollection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test26237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26237");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(39);
        int int2 = sideEffectFlags1.valueOf();
        sideEffectFlags1.clearSideEffectFlags();
        int int4 = sideEffectFlags1.valueOf();
        sideEffectFlags1.setMutatesArguments();
        sideEffectFlags1.setReturnsTainted();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 47 + "'", int4 == 47);
    }

    @Test
    public void test26238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26238");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(1);
        sideEffectFlags1.setMutatesThis();
        sideEffectFlags1.setThrows();
        int int4 = sideEffectFlags1.valueOf();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test26239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26239");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node4.setCharno(1);
        java.util.Set<java.lang.String> strSet7 = node4.getDirectives();
        node4.setCharno((int) (short) -1);
        boolean boolean10 = node4.isRegExp();
        boolean boolean11 = node4.isDefaultCase();
        boolean boolean12 = node4.isBlock();
        boolean boolean13 = node4.isTrue();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) '4', node4, 44, 7);
        boolean boolean17 = node16.isNE();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test26240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26240");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node14.setCharno(1);
        java.util.Set<java.lang.String> strSet17 = node14.getDirectives();
        java.lang.String str18 = node4.checkTreeEquals(node14);
        boolean boolean19 = node4.isQualifiedName();
        boolean boolean20 = node4.isAnd();
        int int21 = node4.getCharno();
        boolean boolean22 = node4.isString();
        boolean boolean23 = node4.isGetElem();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        boolean boolean28 = node27.isLabelName();
        boolean boolean29 = node27.isCase();
        boolean boolean30 = node27.isBreak();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder31 = node27.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node32 = node4.clonePropsFrom(node27);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test26241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26241");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getPositionOnEndLine();
        boolean boolean2 = typePosition0.hasBrackets();
        boolean boolean3 = typePosition0.hasBrackets();
        boolean boolean4 = typePosition0.hasBrackets();
        int int5 = typePosition0.getStartLine();
        int int6 = typePosition0.getStartLine();
        int int7 = typePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test26242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26242");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("(Node tree inequality:\nTree1:\nSTRING  0\n\n\nTree2:\nNUMBER 10.0 100\n\n\nSubtree1: STRING  0\n\n\nSubtree2: NUMBER 10.0 100\n)");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test26243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26243");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isScript();
        com.google.javascript.rhino.Node node11 = node4.detachFromParent();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean16 = node15.isThrow();
        java.lang.String str20 = node15.toString(true, false, true);
        boolean boolean21 = node15.isGetterDef();
        boolean boolean22 = node11.isEquivalentToTyped(node15);
        boolean boolean23 = node15.isDec();
        boolean boolean24 = node15.isName();
        boolean boolean25 = node15.isOnlyModifiesThisCall();
        boolean boolean26 = node15.isBreak();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "STRING  0" + "'", str20, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test26244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26244");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        com.google.javascript.rhino.Node node11 = node4.getLastSibling();
        boolean boolean12 = node4.isObjectLit();
        int int13 = node4.getCharno();
        boolean boolean14 = node4.isReturn();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(49);
        com.google.javascript.rhino.Node node17 = node4.srcref(node16);
        boolean boolean18 = node4.isThrow();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node4.new FileLevelJsDocBuilder();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test26245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26245");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.lang.String str4 = jSDocInfo0.getDescriptionForParameter("STRING  0\n");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.hasParameter("STRING  0 [source_file: Node tree inequality:\nTree1:\nERROR 1\n    STRING  0\n\n\nTree2:\nSTRING  0\n\n\nSubtree1: ERROR 1\n    STRING  0\n\n\nSubtree2: STRING  0\n]");
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test26246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26246");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean9 = node8.isThrow();
        java.lang.String str13 = node8.toString(true, false, true);
        jSDocInfo0.setAssociatedNode(node8);
        boolean boolean15 = jSDocInfo0.hasTypedefType();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node36 = node34.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (byte) -1, node34, (int) (byte) 1, (int) '#');
        boolean boolean40 = node29.hasChild(node39);
        int int41 = node29.getCharno();
        com.google.javascript.rhino.Node node42 = node19.useSourceInfoIfMissingFrom(node29);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node47 = node19.srcref(node46);
        jSDocInfo0.setAssociatedNode(node19);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = jSDocInfo0.getReturnType();
        int int50 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str51 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str53 = jSDocInfo52.getVersion();
        boolean boolean54 = jSDocInfo52.hasEnumParameterType();
        boolean boolean55 = jSDocInfo52.isNoAlias();
        java.lang.String str57 = jSDocInfo52.getDescriptionForParameter("JSDocInfo");
        boolean boolean58 = jSDocInfo52.hasEnumParameterType();
        boolean boolean59 = jSDocInfo52.containsDeclaration();
        java.lang.String str60 = jSDocInfo52.getDescription();
        java.lang.String str61 = jSDocInfo52.getVersion();
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str63 = jSDocInfo62.getVersion();
        boolean boolean64 = jSDocInfo62.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet65 = jSDocInfo62.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility66 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo62.setVisibility(visibility66);
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str69 = jSDocInfo68.getVersion();
        boolean boolean70 = jSDocInfo68.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet71 = jSDocInfo68.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility72 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo68.setVisibility(visibility72);
        jSDocInfo62.setVisibility(visibility72);
        jSDocInfo52.setVisibility(visibility72);
        jSDocInfo0.setVisibility(visibility72);
        boolean boolean77 = jSDocInfo0.isExpose();
        boolean boolean78 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str79 = jSDocInfo0.getDescription();
        java.lang.String str80 = jSDocInfo0.getLendsName();
        boolean boolean81 = jSDocInfo0.isNoAlias();
        java.util.Collection<java.lang.String> strCollection82 = jSDocInfo0.getReferences();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "STRING  0" + "'", str13, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(jSTypeExpression49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertTrue("'" + visibility66 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility66.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertTrue("'" + visibility72 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility72.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(strCollection82);
    }

    @Test
    public void test26247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26247");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("STRING  0\n");
        jSDocInfo0.setDeprecated(false);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean9 = jSDocInfo0.containsDeclaration();
        boolean boolean10 = jSDocInfo0.hasModifies();
        boolean boolean11 = jSDocInfo0.isOverride();
        java.lang.String str12 = jSDocInfo0.getVersion();
        boolean boolean13 = jSDocInfo0.shouldPreserveTry();
        boolean boolean14 = jSDocInfo0.hasEnumParameterType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection15 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo0.getEnumParameterType();
        boolean boolean17 = jSDocInfo0.isImplicitCast();
        java.lang.String str18 = jSDocInfo0.getVersion();
        boolean boolean19 = jSDocInfo0.isExterns();
        boolean boolean20 = jSDocInfo0.isImplicitCast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeCollection15);
        org.junit.Assert.assertNull(jSTypeExpression16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test26248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26248");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isConstructor();
        int int2 = jSDocInfo0.getParameterCount();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = jSDocInfo0.getTemplateTypeNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test26249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26249");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) -1, node8, (int) (byte) 1, (int) '#');
        boolean boolean14 = node8.isScript();
        node8.setQuotedString();
        com.google.javascript.rhino.Node node16 = node3.srcrefTree(node8);
        boolean boolean17 = node8.isVar();
        boolean boolean18 = node8.isFor();
        boolean boolean19 = node8.isGetterDef();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        node24.removeProp(47);
        boolean boolean27 = node24.isFromExterns();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 4095, 100, (int) (short) 1);
        double double32 = node31.getDouble();
        boolean boolean33 = node31.isAdd();
        com.google.javascript.rhino.Node node34 = node31.cloneNode();
        boolean boolean35 = node34.isNE();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node47 = node45.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (byte) -1, node45, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node57 = node55.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) -1, node55, (int) (byte) 1, (int) '#');
        boolean boolean61 = node50.hasChild(node60);
        int int62 = node50.getCharno();
        com.google.javascript.rhino.Node node63 = node40.useSourceInfoIfMissingFrom(node50);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node68 = node40.srcref(node67);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean73 = node72.isFromExterns();
        boolean boolean74 = node68.hasChild(node72);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(52, node72);
        node34.addChildToBack(node75);
        java.lang.String str77 = node24.checkTreeEquals(node34);
        node8.putProp(32778, (java.lang.Object) node24);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4095.0d + "'", double32 == 4095.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 35 + "'", int62 == 35);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n" + "'", str77, "Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n");
    }

    @Test
    public void test26250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26250");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = booleanLiteralSet1.intersection(booleanLiteralSet2);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet4 = booleanLiteralSet0.intersection(booleanLiteralSet1);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet5 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet6.intersection(booleanLiteralSet7);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = booleanLiteralSet5.intersection(booleanLiteralSet6);
        boolean boolean11 = booleanLiteralSet9.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = booleanLiteralSet12.intersection(booleanLiteralSet13);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = booleanLiteralSet9.intersection(booleanLiteralSet13);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = booleanLiteralSet15.intersection(booleanLiteralSet17);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = booleanLiteralSet1.union(booleanLiteralSet15);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = booleanLiteralSet21.intersection(booleanLiteralSet22);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = booleanLiteralSet20.intersection(booleanLiteralSet21);
        boolean boolean26 = booleanLiteralSet24.contains(false);
        boolean boolean28 = booleanLiteralSet24.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet31 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = booleanLiteralSet30.intersection(booleanLiteralSet31);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet33 = booleanLiteralSet29.intersection(booleanLiteralSet30);
        boolean boolean35 = booleanLiteralSet33.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet38 = booleanLiteralSet36.intersection(booleanLiteralSet37);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet39 = booleanLiteralSet33.intersection(booleanLiteralSet37);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet41 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet42 = booleanLiteralSet39.intersection(booleanLiteralSet41);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet43 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet44 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet45 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet46 = booleanLiteralSet44.intersection(booleanLiteralSet45);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet47 = booleanLiteralSet43.intersection(booleanLiteralSet44);
        boolean boolean49 = booleanLiteralSet43.contains(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet50 = booleanLiteralSet39.union(booleanLiteralSet43);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = booleanLiteralSet24.intersection(booleanLiteralSet39);
        boolean boolean53 = booleanLiteralSet39.contains(true);
        boolean boolean55 = booleanLiteralSet39.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet56 = booleanLiteralSet1.intersection(booleanLiteralSet39);
        boolean boolean58 = booleanLiteralSet39.contains(false);
        boolean boolean60 = booleanLiteralSet39.contains(false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet1 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet1.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet2 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet2.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet4 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet4.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet5 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet5.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet17 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet17.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet18 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet18.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet19 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet19.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet23 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet23.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet29 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet29.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet31 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet31.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet33 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet33.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet36 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet36.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet38 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet38.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet39 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet39.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet41 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet41.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet42 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet42.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet43 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet43.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet44 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet44.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet45 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet45.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet46 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet46.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet47 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet47.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet50 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet50.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet56 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet56.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test26251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26251");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        java.lang.String str5 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        boolean boolean6 = jSDocInfo0.hasEnumParameterType();
        jSDocInfo0.setLicense("Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n");
        java.lang.String str9 = jSDocInfo0.getLicense();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean11 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n" + "'", str9, "Node tree inequality:\nTree1:\nNUMBER 4095.0 100\n\n\nTree2:\nNUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n\n\nSubtree1: NUMBER 4095.0 100\n\n\nSubtree2: NUMBER 4095.0 100\n    INSTANCEOF\n        STRING  0\n");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression12);
    }

    @Test
    public void test26252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26252");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 0, 10);
        int int4 = node3.getType();
        com.google.javascript.rhino.Node node5 = node3.cloneNode();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node3.new FileLevelJsDocBuilder();
        boolean boolean7 = node3.isFunction();
        int int8 = node3.getLength();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node13.setCharno(1);
        boolean boolean16 = node13.isRegExp();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node23 = node21.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (byte) -1, node21, (int) (byte) 1, (int) '#');
        boolean boolean27 = node21.isDo();
        boolean boolean28 = node21.isDefaultCase();
        node21.setQuotedString();
        com.google.javascript.rhino.Node node30 = node13.useSourceInfoFromForTree(node21);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node34.setCharno(1);
        java.util.Set<java.lang.String> strSet37 = node34.getDirectives();
        node34.setLength(0);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node46 = node44.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) -1, node44, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0, node30, node34, node49, (int) 'a', (int) (short) 0);
        node49.putBooleanProp(45, false);
        com.google.javascript.rhino.Node node56 = node3.useSourceInfoFrom(node49);
        boolean boolean57 = node56.isLocalResultCall();
        boolean boolean58 = node56.isCall();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40 + "'", int4 == 40);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(strSet37);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test26253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26253");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean5 = node4.isThrow();
        java.lang.String str9 = node4.toString(true, false, true);
        java.lang.String str10 = node4.getQualifiedName();
        boolean boolean11 = node4.isIn();
        com.google.javascript.rhino.Node node12 = node4.cloneTree();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isScript();
        com.google.javascript.rhino.Node node24 = node17.detachFromParent();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node28.setCharno(1);
        java.util.Set<java.lang.String> strSet31 = node28.getDirectives();
        boolean boolean32 = node28.isHook();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 100, 40, 40);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node43 = node41.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (byte) -1, node41, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node53 = node51.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) -1, node51, (int) (byte) 1, (int) '#');
        boolean boolean57 = node46.hasChild(node56);
        int int58 = node46.getCharno();
        com.google.javascript.rhino.Node node59 = node36.useSourceInfoIfMissingFrom(node46);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 40, 51, (int) 'a');
        com.google.javascript.rhino.Node node64 = node36.srcref(node63);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(4095, node12, node24, node28, node36);
        com.google.javascript.rhino.Node node66 = node12.cloneTree();
        int int67 = node66.getLength();
        boolean boolean68 = node66.isNew();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("JSDocInfo");
        int int71 = node66.getIndexOfChild(node70);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node72 = node70.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "STRING  0" + "'", str9, "STRING  0");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 35 + "'", int58 == 35);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test26254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26254");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isExprResult();
        boolean boolean12 = node4.isCatch();
        java.lang.Object obj14 = node4.getProp(4131);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test26255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26255");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        java.lang.String str7 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node11.setCharno(1);
        boolean boolean14 = node11.isRegExp();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node21 = node19.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) -1, node19, (int) (byte) 1, (int) '#');
        boolean boolean25 = node19.isDo();
        boolean boolean26 = node19.isDefaultCase();
        node19.setQuotedString();
        com.google.javascript.rhino.Node node28 = node11.useSourceInfoFromForTree(node19);
        node19.putIntProp((int) (byte) 100, (int) (byte) 0);
        boolean boolean32 = node19.isVarArgs();
        jSDocInfo0.setAssociatedNode(node19);
        boolean boolean34 = jSDocInfo0.isNoAlias();
        boolean boolean36 = jSDocInfo0.hasParameter("(IN\n)");
        boolean boolean37 = jSDocInfo0.isHidden();
        java.util.Collection<java.lang.String> strCollection38 = jSDocInfo0.getAuthors();
        boolean boolean39 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(strCollection38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test26256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26256");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getThisType();
        boolean boolean4 = jSDocInfo0.hasBaseType();
        java.lang.String str5 = jSDocInfo0.getVersion();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test26257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26257");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        jSDocInfo0.addSuppression("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getType();
        boolean boolean9 = jSDocInfo0.isOverride();
        boolean boolean10 = jSDocInfo0.isNoShadow();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getModifies();
        java.lang.String str12 = jSDocInfo0.getLendsName();
        java.lang.String str13 = jSDocInfo0.getDescription();
        boolean boolean14 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test26258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26258");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        boolean boolean5 = jSDocInfo0.isExpose();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node9.setCharno(1);
        boolean boolean12 = node9.isRegExp();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node19 = node17.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) -1, node17, (int) (byte) 1, (int) '#');
        boolean boolean23 = node17.isDo();
        boolean boolean24 = node17.isDefaultCase();
        node17.setQuotedString();
        com.google.javascript.rhino.Node node26 = node9.useSourceInfoFromForTree(node17);
        jSDocInfo0.setAssociatedNode(node9);
        java.lang.String str28 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.Node node29 = jSDocInfo0.getAssociatedNode();
        java.lang.String str30 = jSDocInfo0.getLendsName();
        com.google.common.collect.ImmutableList<java.lang.String> strList31 = jSDocInfo0.getTemplateTypeNames();
        java.util.Collection<java.lang.String> strCollection32 = jSDocInfo0.getReferences();
        boolean boolean33 = jSDocInfo0.hasFileOverview();
        java.lang.String str34 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNull(strCollection32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test26259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26259");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node6 = node4.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (byte) -1, node4, (int) (byte) 1, (int) '#');
        boolean boolean10 = node4.isDo();
        boolean boolean11 = node4.isParamList();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node4.new FileLevelJsDocBuilder();
        node4.setLength(213002);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test26260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26260");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", 0, 10);
        boolean boolean5 = node4.isThrow();
        java.lang.String str9 = node4.toString(true, false, true);
        boolean boolean10 = node4.isGetterDef();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = node4.getJSDocInfo();
        boolean boolean12 = node4.isBreak();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("", 0, 10);
        node16.setCharno(1);
        boolean boolean19 = node16.isRegExp();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) -1, node24, (int) (byte) 1, (int) '#');
        boolean boolean30 = node24.isDo();
        boolean boolean31 = node24.isDefaultCase();
        node24.setQuotedString();
        com.google.javascript.rhino.Node node33 = node16.useSourceInfoFromForTree(node24);
        node24.putIntProp((int) (byte) 100, (int) (byte) 0);
        node24.putProp((int) 'a', (java.lang.Object) "JSDocInfo");
        boolean boolean40 = node24.isInc();
        com.google.javascript.rhino.Node node41 = node24.getLastSibling();
        com.google.javascript.rhino.Node node42 = node4.copyInformationFromForTree(node41);
        com.google.javascript.rhino.Node node43 = node4.cloneTree();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = node4.getJSDocInfo();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node51 = node49.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) -1, node49, (int) (byte) 1, (int) '#');
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("", 0, 10);
        com.google.javascript.rhino.Node node61 = node59.getChildAtIndex((int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) -1, node59, (int) (byte) 1, (int) '#');
        boolean boolean65 = node54.hasChild(node64);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(49, "STRING  0\n");
        com.google.javascript.rhino.Node node69 = node54.clonePropsFrom(node68);
        int int70 = node69.getSourceOffset();
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((-1), node4, node69, 27, 409601);
        int int74 = node69.getSourcePosition();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "STRING  0" + "'", str9, "STRING  0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSDocInfo11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(jSDocInfo44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 4131 + "'", int74 == 4131);
    }

    @Test
    public void test26261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26261");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility5);
        boolean boolean7 = jSDocInfo0.isJavaDispatch();
        boolean boolean8 = jSDocInfo0.hasFileOverview();
        boolean boolean9 = jSDocInfo0.containsDeclaration();
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo0.getReferences();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getSuppressions();
        boolean boolean13 = jSDocInfo0.hasFileOverview();
        java.util.Set<java.lang.String> strSet14 = jSDocInfo0.getSuppressions();
        boolean boolean15 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + visibility5 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility5.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strCollection10);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }
}

