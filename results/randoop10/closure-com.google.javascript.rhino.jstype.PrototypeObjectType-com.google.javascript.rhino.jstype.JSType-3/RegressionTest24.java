import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

    public static boolean debug = false;

    @Test
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException();
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException10 = new java.io.IOException("([0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30])", (java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("GT", (java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException13 = new java.io.IOException("InputId: JSDocInfo", (java.lang.Throwable) iOException10);
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (byte) 0, (int) '#', 15);
        boolean boolean4 = node3.isDec();
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(51, nodeArray12, 48, 32);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) 1, nodeArray12);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(45, nodeArray12);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(40, nodeArray12, 40, (int) (byte) -1);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (byte) -1, nodeArray12, 27, 0);
        com.google.common.collect.ImmutableList<java.lang.Object> objList24 = com.google.common.collect.ImmutableList.copyOf((java.lang.Object[]) nodeArray12);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(37, nodeArray12);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(41, nodeArray12, (-1), 31);
        com.google.javascript.rhino.InputId inputId29 = null;
        node28.setInputId(inputId29);
        boolean boolean31 = node28.isDelProp();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean38 = node37.isQualifiedName();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(32, (int) (byte) 10, (int) '#');
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean52 = node51.isQualifiedName();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean57 = node56.isContinue();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean62 = node61.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        node61.setJSType(jSType63);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean69 = node68.isContinue();
        com.google.javascript.rhino.Node node70 = node61.clonePropsFrom(node68);
        node56.addChildrenToBack(node61);
        boolean boolean72 = node56.isLocalResultCall();
        com.google.javascript.rhino.Node node73 = node51.copyInformationFromForTree(node56);
        node56.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node76 = node47.clonePropsFrom(node56);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean81 = node80.isInstanceOf();
        boolean boolean82 = node80.isComma();
        boolean boolean83 = node47.isEquivalentTo(node80);
        boolean boolean84 = node80.isComma();
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node((int) '#', node43, node80, 42, (int) ' ');
        boolean boolean88 = node87.isComma();
        com.google.javascript.rhino.Node node89 = node87.cloneTree();
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node(16, node37, node87);
        node90.detachChildren();
        boolean boolean92 = node90.isNew();
        boolean boolean93 = node90.isGetElem();
        com.google.javascript.rhino.Node node94 = new com.google.javascript.rhino.Node((int) ' ', node90);
        boolean boolean95 = node90.isTry();
        com.google.javascript.rhino.Node node96 = node28.clonePropsFrom(node90);
        node3.addChildrenToBack(node28);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertNotNull(objList24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(node96);
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 52, (int) (byte) 100, 4);
        boolean boolean4 = node3.isCatch();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(32, (int) (byte) 10, (int) '#');
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean18 = node17.isQualifiedName();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean23 = node22.isContinue();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean28 = node27.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        node27.setJSType(jSType29);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean35 = node34.isContinue();
        com.google.javascript.rhino.Node node36 = node27.clonePropsFrom(node34);
        node22.addChildrenToBack(node27);
        boolean boolean38 = node22.isLocalResultCall();
        com.google.javascript.rhino.Node node39 = node17.copyInformationFromForTree(node22);
        node22.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node42 = node13.clonePropsFrom(node22);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean47 = node46.isInstanceOf();
        boolean boolean48 = node46.isComma();
        boolean boolean49 = node13.isEquivalentTo(node46);
        boolean boolean50 = node46.isComma();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) '#', node9, node46, 42, (int) ' ');
        com.google.javascript.rhino.Node node54 = null;
        int int55 = node9.getIndexOfChild(node54);
        com.google.javascript.rhino.Node node56 = node3.copyInformationFromForTree(node9);
        java.lang.String str57 = node56.getSourceFileName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        int int2 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean7 = node6.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        node6.setJSType(jSType8);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean14 = node13.isContinue();
        com.google.javascript.rhino.Node node15 = node6.clonePropsFrom(node13);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean20 = node19.isContinue();
        boolean boolean21 = node19.isString();
        com.google.javascript.rhino.Node node22 = node6.useSourceInfoFromForTree(node19);
        namePosition0.setItem(node22);
        int int24 = namePosition0.getPositionOnStartLine();
        int int25 = namePosition0.getEndLine();
        int int26 = namePosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(2);
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection4 = jSDocInfo0.getMarkers();
        boolean boolean5 = jSDocInfo0.isNoCompile();
        java.lang.String str6 = jSDocInfo0.getDescription();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getParameterNames();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        boolean boolean9 = jSDocInfo0.isNoAlias();
        jSDocInfo0.addSuppression("java.io.IOException: java.io.IOException: Unknown class name");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getThrownTypes();
        jSDocInfo0.setLicense("java.io.IOException: [30, 100.0, -1, 0.0, 100, 1.0, 1, 0, a, 0, 0.0, 1.0, hi!, 100, 10.0, 0.0]");
        boolean boolean15 = jSDocInfo0.isExpose();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(markerCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean5 = node4.isLabelName();
        boolean boolean6 = node4.isTrue();
        boolean boolean7 = node4.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean13 = node12.isQualifiedName();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(32, (int) (byte) 10, (int) '#');
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean27 = node26.isQualifiedName();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean32 = node31.isContinue();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean37 = node36.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        node36.setJSType(jSType38);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean44 = node43.isContinue();
        com.google.javascript.rhino.Node node45 = node36.clonePropsFrom(node43);
        node31.addChildrenToBack(node36);
        boolean boolean47 = node31.isLocalResultCall();
        com.google.javascript.rhino.Node node48 = node26.copyInformationFromForTree(node31);
        node31.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node51 = node22.clonePropsFrom(node31);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean56 = node55.isInstanceOf();
        boolean boolean57 = node55.isComma();
        boolean boolean58 = node22.isEquivalentTo(node55);
        boolean boolean59 = node55.isComma();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) '#', node18, node55, 42, (int) ' ');
        boolean boolean63 = node62.isComma();
        com.google.javascript.rhino.Node node64 = node62.cloneTree();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(16, node12, node62);
        boolean boolean66 = node65.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node67 = node65.getLastSibling();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean72 = node71.isContinue();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean77 = node76.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        node76.setJSType(jSType78);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean84 = node83.isContinue();
        com.google.javascript.rhino.Node node85 = node76.clonePropsFrom(node83);
        node71.addChildrenToBack(node76);
        boolean boolean87 = node71.isLocalResultCall();
        int int88 = node71.getLength();
        com.google.javascript.rhino.Node node89 = node71.getFirstChild();
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node(35, node4, node67, node71, 4, 31);
        int int93 = node67.getSideEffectFlags();
        int int94 = node67.getSourceOffset();
        boolean boolean95 = node67.isWhile();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getEnumParameterType();
        java.lang.String str5 = jSDocInfo0.getReturnDescription();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        java.lang.String str8 = jSDocInfo0.getVersion();
        int int9 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str10 = jSDocInfo0.getOriginalCommentString();
        java.lang.String str11 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isLabelName();
        boolean boolean5 = node3.isDec();
        boolean boolean6 = node3.isScript();
        int int7 = node3.getCharno();
        boolean boolean8 = node3.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean13 = node12.isQualifiedName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean18 = node17.isContinue();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean23 = node22.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        node22.setJSType(jSType24);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean30 = node29.isContinue();
        com.google.javascript.rhino.Node node31 = node22.clonePropsFrom(node29);
        node17.addChildrenToBack(node22);
        boolean boolean33 = node17.isLocalResultCall();
        com.google.javascript.rhino.Node node34 = node12.copyInformationFromForTree(node17);
        node17.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.InputId inputId37 = node17.getInputId();
        node17.setOptionalArg(false);
        boolean boolean40 = node17.isTrue();
        int int41 = node17.getLength();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean46 = node45.isQualifiedName();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean51 = node50.isContinue();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean56 = node55.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        node55.setJSType(jSType57);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean63 = node62.isContinue();
        com.google.javascript.rhino.Node node64 = node55.clonePropsFrom(node62);
        node50.addChildrenToBack(node55);
        boolean boolean66 = node50.isLocalResultCall();
        com.google.javascript.rhino.Node node67 = node45.copyInformationFromForTree(node50);
        node50.setSourceEncodedPosition((int) (short) -1);
        boolean boolean70 = node50.isName();
        node17.addChildToBack(node50);
        com.google.javascript.rhino.Node node72 = node3.clonePropsFrom(node50);
        boolean boolean73 = node72.isName();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile76 = node75.getStaticSourceFile();
        com.google.javascript.rhino.Node node77 = node72.useSourceInfoFrom(node75);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNull(staticSourceFile76);
        org.junit.Assert.assertNotNull(node77);
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean6 = jSDocInfo5.hasEnumParameterType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo5.getBaseType();
        node3.setJSDocInfo(jSDocInfo5);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean13 = node12.isQuotedString();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean18 = node17.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        node17.setJSType(jSType19);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean25 = node24.isContinue();
        com.google.javascript.rhino.Node node26 = node17.clonePropsFrom(node24);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean31 = node30.isContinue();
        boolean boolean32 = node30.isString();
        com.google.javascript.rhino.Node node33 = node17.useSourceInfoFromForTree(node30);
        com.google.javascript.rhino.InputId inputId34 = null;
        node33.setInputId(inputId34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(37, "hi!", (int) (byte) 100, (int) (short) 100);
        int int42 = node40.getIntProp(30);
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        int int44 = jSDocInfo43.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility45 = null;
        jSDocInfo43.setVisibility(visibility45);
        boolean boolean47 = jSDocInfo43.hasFileOverview();
        boolean boolean48 = jSDocInfo43.isJavaDispatch();
        boolean boolean49 = jSDocInfo43.hasType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList50 = jSDocInfo43.getExtendedInterfaces();
        java.lang.String str51 = jSDocInfo43.getLicense();
        boolean boolean52 = jSDocInfo43.hasBaseType();
        boolean boolean53 = jSDocInfo43.isNoTypeCheck();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        int int55 = jSDocInfo54.getImplementedInterfaceCount();
        boolean boolean56 = jSDocInfo54.isExterns();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        int int59 = jSDocInfo58.getImplementedInterfaceCount();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean64 = node63.isQualifiedName();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean69 = node68.isContinue();
        boolean boolean70 = node68.isDo();
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList71 = com.google.common.collect.ImmutableList.of((java.io.Serializable) jSDocInfo5, (java.io.Serializable) boolean13, (java.io.Serializable) node33, (java.io.Serializable) int42, (java.io.Serializable) boolean53, (java.io.Serializable) boolean56, (java.io.Serializable) ' ', (java.io.Serializable) jSDocInfo58, (java.io.Serializable) node63, (java.io.Serializable) boolean70);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList72 = serializableList71.asList();
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = new com.google.javascript.rhino.JSDocInfo();
        int int74 = jSDocInfo73.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility75 = null;
        jSDocInfo73.setVisibility(visibility75);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression77 = jSDocInfo73.getEnumParameterType();
        java.lang.String str78 = jSDocInfo73.getReturnDescription();
        boolean boolean79 = jSDocInfo73.isConsistentIdGenerator();
        com.google.javascript.rhino.Node node80 = jSDocInfo73.getAssociatedNode();
        java.util.Set<java.lang.String> strSet81 = jSDocInfo73.getModifies();
        boolean boolean82 = serializableList72.equals((java.lang.Object) jSDocInfo73);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression83 = jSDocInfo73.getReturnType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(serializableList71);
        org.junit.Assert.assertNotNull(serializableList72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNull(jSTypeExpression77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(jSTypeExpression83);
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("true");
        java.lang.String str6 = jSDocInfo0.getLendsName();
        java.lang.String str7 = jSDocInfo0.getDeprecationReason();
        boolean boolean8 = jSDocInfo0.hasType();
        jSDocInfo0.setLicense("STRING Unknown class name");
        boolean boolean11 = jSDocInfo0.isConstant();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] { 0.0d, (short) -1, 100.0d, 30 };
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 0.0d, (java.io.Serializable) 10.0f, (java.io.Serializable) (short) 100, (java.io.Serializable) "hi!", (java.io.Serializable) 1.0d, (java.io.Serializable) 0.0d, (java.io.Serializable) 0, (java.io.Serializable) 'a', (java.io.Serializable) (byte) 0, (java.io.Serializable) 1L, (java.io.Serializable) 1.0d, (java.io.Serializable) (byte) 100, serializableArray16);
        boolean boolean18 = serializableList17.isEmpty();
        boolean boolean20 = serializableList17.contains((java.lang.Object) 52);
        java.util.stream.Stream<java.io.Serializable> serializableStream21 = serializableList17.stream();
        java.util.ListIterator<java.io.Serializable> serializableItor22 = serializableList17.listIterator();
        com.google.common.collect.UnmodifiableListIterator<java.io.Serializable> serializableItor23 = serializableList17.listIterator();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean28 = node27.isQualifiedName();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean33 = node32.isContinue();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean38 = node37.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        node37.setJSType(jSType39);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean45 = node44.isContinue();
        com.google.javascript.rhino.Node node46 = node37.clonePropsFrom(node44);
        node32.addChildrenToBack(node37);
        boolean boolean48 = node32.isLocalResultCall();
        com.google.javascript.rhino.Node node49 = node27.copyInformationFromForTree(node32);
        node32.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.InputId inputId52 = node32.getInputId();
        node32.setLineno(54);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable55 = node32.getAncestors();
        int int56 = serializableList17.indexOf((java.lang.Object) node32);
        java.lang.Object[] objArray57 = serializableList17.toArray();
        java.util.stream.Stream<java.io.Serializable> serializableStream58 = serializableList17.parallelStream();
        java.util.Iterator<java.io.Serializable> serializableItor59 = serializableList17.iterator();
        org.junit.Assert.assertNotNull(serializableArray16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(serializableStream21);
        org.junit.Assert.assertNotNull(serializableItor22);
        org.junit.Assert.assertNotNull(serializableItor23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(inputId52);
        org.junit.Assert.assertNotNull(ancestorIterable55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
        org.junit.Assert.assertNotNull(serializableStream58);
        org.junit.Assert.assertNotNull(serializableItor59);
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getImplementedInterfaceCount();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean4 = jSDocInfo3.isNoAlias();
        boolean boolean5 = strSet2.equals((java.lang.Object) jSDocInfo3);
        strSet2.clear();
        java.util.Iterator<java.lang.String> strItor7 = strSet2.iterator();
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] { 0.0d, (short) -1, 100.0d, 30 };
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList25 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 0.0d, (java.io.Serializable) 10.0f, (java.io.Serializable) (short) 100, (java.io.Serializable) "hi!", (java.io.Serializable) 1.0d, (java.io.Serializable) 0.0d, (java.io.Serializable) 0, (java.io.Serializable) 'a', (java.io.Serializable) (byte) 0, (java.io.Serializable) 1L, (java.io.Serializable) 1.0d, (java.io.Serializable) (byte) 100, serializableArray24);
        int int26 = serializableList25.size();
        com.google.common.collect.UnmodifiableListIterator<java.io.Serializable> serializableItor27 = serializableList25.listIterator();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean31 = booleanLiteralSet29.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = booleanLiteralSet29.intersection(booleanLiteralSet33);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean38 = booleanLiteralSet36.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet40 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet41 = booleanLiteralSet36.intersection(booleanLiteralSet40);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet43 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean45 = booleanLiteralSet43.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet47 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean49 = booleanLiteralSet47.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet52 = booleanLiteralSet47.intersection(booleanLiteralSet51);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet53 = booleanLiteralSet43.intersection(booleanLiteralSet51);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet55 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet56 = booleanLiteralSet53.union(booleanLiteralSet55);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet58 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList59 = com.google.common.collect.ImmutableList.of(booleanLiteralSet34, booleanLiteralSet41, booleanLiteralSet56, booleanLiteralSet58);
        boolean boolean60 = serializableList25.equals((java.lang.Object) booleanLiteralSet34);
        boolean boolean61 = strSet2.retainAll((java.util.Collection<java.io.Serializable>) serializableList25);
        com.google.common.collect.UnmodifiableIterator<java.io.Serializable> serializableItor62 = serializableList25.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        int int64 = jSDocInfo63.getImplementedInterfaceCount();
        java.util.Set<java.lang.String> strSet65 = jSDocInfo63.getParameterNames();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList66 = jSDocInfo63.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression67 = jSDocInfo63.getBaseType();
        java.util.Set<java.lang.String> strSet68 = jSDocInfo63.getModifies();
        java.lang.String str69 = jSDocInfo63.getMeaning();
        boolean boolean71 = jSDocInfo63.hasDescriptionForParameter("true");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection72 = jSDocInfo63.getTypeNodes();
        boolean boolean73 = serializableList25.equals((java.lang.Object) jSDocInfo63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(serializableArray24);
        org.junit.Assert.assertNotNull(serializableList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertNotNull(serializableItor27);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet29 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet29.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet33 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet33.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet36 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet36.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet40 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet40.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet41 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet41.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet43 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet43.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet47 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet47.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet52 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet52.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet53 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet53.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet55 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet55.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet56 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet56.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet58 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet58.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(serializableItor62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(jSTypeExpressionList66);
        org.junit.Assert.assertNull(jSTypeExpression67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(nodeCollection72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean9 = node8.isQualifiedName();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean14 = node13.isContinue();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean19 = node18.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        node18.setJSType(jSType20);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean26 = node25.isContinue();
        com.google.javascript.rhino.Node node27 = node18.clonePropsFrom(node25);
        node13.addChildrenToBack(node18);
        boolean boolean29 = node13.isLocalResultCall();
        com.google.javascript.rhino.Node node30 = node8.copyInformationFromForTree(node13);
        node13.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node33 = node4.clonePropsFrom(node13);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean38 = node37.isLabelName();
        boolean boolean39 = node37.isTrue();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean44 = node43.isContinue();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean49 = node48.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        node48.setJSType(jSType50);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean56 = node55.isContinue();
        com.google.javascript.rhino.Node node57 = node48.clonePropsFrom(node55);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) 0, node13, node37, node43, node57, 10, (int) (byte) -1);
        node13.putIntProp((int) (short) 0, (int) (byte) -1);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile64 = node13.getStaticSourceFile();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable65 = node13.getAncestors();
        java.lang.String str66 = node13.getSourceFileName();
        boolean boolean67 = node13.isQualifiedName();
        boolean boolean68 = node13.isQualifiedName();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNull(staticSourceFile64);
        org.junit.Assert.assertNotNull(ancestorIterable65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean8 = node7.isQualifiedName();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean18 = node17.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        node17.setJSType(jSType19);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean25 = node24.isContinue();
        com.google.javascript.rhino.Node node26 = node17.clonePropsFrom(node24);
        node12.addChildrenToBack(node17);
        boolean boolean28 = node12.isLocalResultCall();
        com.google.javascript.rhino.Node node29 = node7.copyInformationFromForTree(node12);
        node12.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node32 = node3.clonePropsFrom(node12);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean41 = node40.isQualifiedName();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean46 = node45.isContinue();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean51 = node50.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        node50.setJSType(jSType52);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean58 = node57.isContinue();
        com.google.javascript.rhino.Node node59 = node50.clonePropsFrom(node57);
        node45.addChildrenToBack(node50);
        boolean boolean61 = node45.isLocalResultCall();
        com.google.javascript.rhino.Node node62 = node40.copyInformationFromForTree(node45);
        node45.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node65 = node36.clonePropsFrom(node45);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean70 = node69.isInstanceOf();
        boolean boolean71 = node69.isComma();
        boolean boolean72 = node36.isEquivalentTo(node69);
        com.google.javascript.rhino.Node node73 = node12.useSourceInfoFrom(node36);
        boolean boolean74 = node12.hasOneChild();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable75 = node12.getAncestors();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(ancestorIterable75);
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getStartLine();
        int int2 = typePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean8 = node7.isLabelName();
        boolean boolean9 = node7.isDec();
        boolean boolean10 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean15 = node14.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        node14.setJSType(jSType16);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean22 = node21.isContinue();
        com.google.javascript.rhino.Node node23 = node14.clonePropsFrom(node21);
        boolean boolean24 = node23.isQuotedString();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean29 = node28.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        node28.setJSType(jSType30);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean36 = node35.isContinue();
        com.google.javascript.rhino.Node node37 = node28.clonePropsFrom(node35);
        int int38 = node37.getLineno();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean43 = node42.isLabelName();
        boolean boolean44 = node42.isDec();
        boolean boolean45 = node42.isAssign();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean54 = node53.isQualifiedName();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean59 = node58.isContinue();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean64 = node63.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        node63.setJSType(jSType65);
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean71 = node70.isContinue();
        com.google.javascript.rhino.Node node72 = node63.clonePropsFrom(node70);
        node58.addChildrenToBack(node63);
        boolean boolean74 = node58.isLocalResultCall();
        com.google.javascript.rhino.Node node75 = node53.copyInformationFromForTree(node58);
        node58.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node78 = node49.clonePropsFrom(node58);
        com.google.javascript.rhino.Node[] nodeArray79 = new com.google.javascript.rhino.Node[] { node7, node23, node37, node42, node49 };
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(0, nodeArray79, (-1), 54);
        boolean boolean83 = node82.hasChildren();
        int int84 = node82.getSideEffectFlags();
        typePosition0.setItem(node82);
        node82.setLineno(32);
        boolean boolean88 = node82.isFunction();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(nodeArray79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isLabelName();
        boolean boolean5 = node3.isTrue();
        boolean boolean6 = node3.isNoSideEffectsCall();
        boolean boolean7 = node3.isCase();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean16 = node15.isQualifiedName();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean21 = node20.isContinue();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean26 = node25.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        node25.setJSType(jSType27);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean33 = node32.isContinue();
        com.google.javascript.rhino.Node node34 = node25.clonePropsFrom(node32);
        node20.addChildrenToBack(node25);
        boolean boolean36 = node20.isLocalResultCall();
        com.google.javascript.rhino.Node node37 = node15.copyInformationFromForTree(node20);
        node20.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node40 = node11.clonePropsFrom(node20);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean45 = node44.isInstanceOf();
        boolean boolean46 = node44.isComma();
        boolean boolean47 = node11.isEquivalentTo(node44);
        boolean boolean48 = node44.isComma();
        com.google.javascript.rhino.Node node49 = node3.clonePropsFrom(node44);
        boolean boolean50 = node49.isFromExterns();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean55 = node54.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        node54.setJSType(jSType56);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean62 = node61.isContinue();
        com.google.javascript.rhino.Node node63 = node54.clonePropsFrom(node61);
        boolean boolean64 = node63.isAssign();
        node63.setLength(0);
        com.google.javascript.rhino.Node node67 = node63.getNext();
        com.google.javascript.rhino.Node node68 = node49.srcrefTree(node63);
        boolean boolean69 = node49.isTry();
        boolean boolean70 = node49.hasChildren();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getStartLine();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean12 = node11.isQualifiedName();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean17 = node16.isContinue();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean22 = node21.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        node21.setJSType(jSType23);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean29 = node28.isContinue();
        com.google.javascript.rhino.Node node30 = node21.clonePropsFrom(node28);
        node16.addChildrenToBack(node21);
        boolean boolean32 = node16.isLocalResultCall();
        com.google.javascript.rhino.Node node33 = node11.copyInformationFromForTree(node16);
        node16.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node36 = node7.clonePropsFrom(node16);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean41 = node40.isLabelName();
        boolean boolean42 = node40.isTrue();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean47 = node46.isContinue();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean52 = node51.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        node51.setJSType(jSType53);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean59 = node58.isContinue();
        com.google.javascript.rhino.Node node60 = node51.clonePropsFrom(node58);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) 0, node16, node40, node46, node60, 10, (int) (byte) -1);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (short) -1, node63);
        typePosition0.setItem(node63);
        com.google.javascript.rhino.Node node66 = typePosition0.getItem();
        int int67 = typePosition0.getEndLine();
        int int68 = typePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean73 = node72.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        node72.setJSType(jSType74);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean80 = node79.isContinue();
        com.google.javascript.rhino.Node node81 = node72.clonePropsFrom(node79);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile82 = null;
        node81.setStaticSourceFile(staticSourceFile82);
        com.google.javascript.rhino.Node node84 = node81.getLastSibling();
        typePosition0.setItem(node81);
        java.lang.String str86 = node81.getSourceFileName();
        boolean boolean87 = node81.isSwitch();
        int int88 = node81.getSourceOffset();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean9 = node8.isQualifiedName();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean14 = node13.isContinue();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean19 = node18.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        node18.setJSType(jSType20);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean26 = node25.isContinue();
        com.google.javascript.rhino.Node node27 = node18.clonePropsFrom(node25);
        node13.addChildrenToBack(node18);
        boolean boolean29 = node13.isLocalResultCall();
        com.google.javascript.rhino.Node node30 = node8.copyInformationFromForTree(node13);
        node13.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node33 = node4.clonePropsFrom(node13);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean38 = node37.isLabelName();
        boolean boolean39 = node37.isTrue();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean44 = node43.isContinue();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean49 = node48.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        node48.setJSType(jSType50);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean56 = node55.isContinue();
        com.google.javascript.rhino.Node node57 = node48.clonePropsFrom(node55);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (byte) 0, node13, node37, node43, node57, 10, (int) (byte) -1);
        com.google.javascript.rhino.Node node61 = node13.getParent();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable62 = node13.children();
        com.google.javascript.rhino.Node node63 = node13.detachFromParent();
        boolean boolean64 = node13.isStringKey();
        boolean boolean65 = node13.isString();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder66 = node13.getJsDocBuilderForNode();
        boolean boolean67 = node13.isComma();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeIterable62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 63, (int) '#', 30);
        boolean boolean4 = node3.isNE();
        boolean boolean5 = node3.isTrue();
        java.lang.String str6 = node3.getSourceFileName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isQualifiedName();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean9 = node8.isContinue();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean14 = node13.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        node13.setJSType(jSType15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean21 = node20.isContinue();
        com.google.javascript.rhino.Node node22 = node13.clonePropsFrom(node20);
        node8.addChildrenToBack(node13);
        boolean boolean24 = node8.isLocalResultCall();
        com.google.javascript.rhino.Node node25 = node3.copyInformationFromForTree(node8);
        node8.setSourceEncodedPosition((int) (short) -1);
        boolean boolean28 = node8.isName();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean33 = node32.isLabelName();
        boolean boolean34 = node8.hasChild(node32);
        node32.setLength(36);
        boolean boolean38 = node32.getBooleanProp(4);
        boolean boolean39 = node32.isThrow();
        boolean boolean40 = node32.isWith();
        boolean boolean41 = node32.isQualifiedName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getImplementedInterfaceCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        java.lang.String str3 = jSDocInfo0.getDescription();
        boolean boolean4 = jSDocInfo0.hasModifies();
        boolean boolean5 = jSDocInfo0.isConstant();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getType();
        boolean boolean9 = jSDocInfo0.hasParameter("InputId: Unknown class name");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("true", 42, 8);
        int int4 = node3.getCharno();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean9 = node8.isQualifiedName();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean14 = node13.isContinue();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean19 = node18.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        node18.setJSType(jSType20);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean26 = node25.isContinue();
        com.google.javascript.rhino.Node node27 = node18.clonePropsFrom(node25);
        node13.addChildrenToBack(node18);
        boolean boolean29 = node13.isLocalResultCall();
        com.google.javascript.rhino.Node node30 = node8.copyInformationFromForTree(node13);
        node13.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.InputId inputId33 = node13.getInputId();
        node13.setOptionalArg(false);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", (int) '4', 52);
        boolean boolean40 = node13.isEquivalentTo(node39);
        com.google.javascript.rhino.Node node41 = node3.srcref(node39);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("true", 42, 8);
        int int46 = node45.getCharno();
        com.google.javascript.rhino.Node node47 = node39.useSourceInfoIfMissingFromForTree(node45);
        boolean boolean48 = node39.isTypeOf();
        boolean boolean49 = node39.isDec();
        boolean boolean50 = node39.isAssign();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(27, "STRING Unknown class name 40\n");
        java.lang.String str54 = node39.checkTreeEquals(node53);
        boolean boolean55 = node53.isName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(inputId33);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi! 42\n\n\nTree2:\nBITNOT STRING Unknown class name 40\n\n\n\nSubtree1: STRING hi! 42\n\n\nSubtree2: BITNOT STRING Unknown class name 40\n\n" + "'", str54, "Node tree inequality:\nTree1:\nSTRING hi! 42\n\n\nTree2:\nBITNOT STRING Unknown class name 40\n\n\n\nSubtree1: STRING hi! 42\n\n\nSubtree2: BITNOT STRING Unknown class name 40\n\n");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo0.setVisibility(visibility5);
        boolean boolean7 = jSDocInfo0.isExpose();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str9 = jSDocInfo0.getDeprecationReason();
        java.lang.String str10 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + visibility5 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility5.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        java.lang.String[] strArray3 = new java.lang.String[] { "Unknown class name", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.Object[] objArray6 = strSet4.toArray();
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] { 0.0d, (short) -1, 100.0d, 30 };
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList24 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 0.0d, (java.io.Serializable) 10.0f, (java.io.Serializable) (short) 100, (java.io.Serializable) "hi!", (java.io.Serializable) 1.0d, (java.io.Serializable) 0.0d, (java.io.Serializable) 0, (java.io.Serializable) 'a', (java.io.Serializable) (byte) 0, (java.io.Serializable) 1L, (java.io.Serializable) 1.0d, (java.io.Serializable) (byte) 100, serializableArray23);
        boolean boolean25 = serializableList24.isEmpty();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean30 = node29.isQualifiedName();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean35 = node34.isContinue();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean40 = node39.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        node39.setJSType(jSType41);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean47 = node46.isContinue();
        com.google.javascript.rhino.Node node48 = node39.clonePropsFrom(node46);
        node34.addChildrenToBack(node39);
        boolean boolean50 = node34.isLocalResultCall();
        com.google.javascript.rhino.Node node51 = node29.copyInformationFromForTree(node34);
        boolean boolean52 = serializableList24.contains((java.lang.Object) node34);
        java.util.Iterator<java.io.Serializable> serializableItor53 = serializableList24.iterator();
        boolean boolean54 = strSet4.containsAll((java.util.Collection<java.io.Serializable>) serializableList24);
        java.lang.Object[] objArray55 = serializableList24.toArray();
        boolean boolean56 = serializableList24.isEmpty();
        boolean boolean57 = serializableList24.isEmpty();
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList58 = serializableList24.reverse();
        java.util.ListIterator<java.io.Serializable> serializableItor59 = serializableList24.listIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor60 = serializableList24.listIterator();
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList61 = serializableList24.asList();
        java.lang.Object[] objArray62 = serializableList61.toArray();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Unknown class name, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Unknown class name, ]");
        org.junit.Assert.assertNotNull(serializableArray23);
        org.junit.Assert.assertNotNull(serializableList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(serializableItor53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(serializableList58);
        org.junit.Assert.assertNotNull(serializableItor59);
        org.junit.Assert.assertNotNull(serializableItor60);
        org.junit.Assert.assertNotNull(serializableList61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isContinue();
        boolean boolean5 = node3.isTry();
        boolean boolean6 = node3.isUnscopedQualifiedName();
        int int7 = node3.getSourceOffset();
        boolean boolean8 = node3.isNumber();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder9 = node3.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean14 = node13.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        node13.setJSType(jSType15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean21 = node20.isContinue();
        com.google.javascript.rhino.Node node22 = node13.clonePropsFrom(node20);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean27 = node26.isContinue();
        boolean boolean28 = node26.isString();
        com.google.javascript.rhino.Node node29 = node13.useSourceInfoFromForTree(node26);
        com.google.javascript.rhino.InputId inputId30 = null;
        node29.setInputId(inputId30);
        java.lang.Object obj33 = node29.getProp((int) (short) 10);
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = node29.getJSDocInfo();
        node29.setVarArgs(true);
        boolean boolean37 = node29.isFor();
        node29.setWasEmptyNode(false);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node29.children();
        com.google.javascript.rhino.Node node41 = node3.copyInformationFromForTree(node29);
        boolean boolean42 = node41.isComma();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(jSDocInfo34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12027");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        node4.setJSType(jSType6);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean12 = node11.isContinue();
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node11);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean18 = node17.isContinue();
        boolean boolean19 = node17.isString();
        com.google.javascript.rhino.Node node20 = node4.useSourceInfoFromForTree(node17);
        com.google.javascript.rhino.InputId inputId21 = null;
        node20.setInputId(inputId21);
        java.lang.Object obj24 = node20.getProp((int) (short) 10);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean29 = node28.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        node28.setJSType(jSType30);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean36 = node35.isContinue();
        com.google.javascript.rhino.Node node37 = node28.clonePropsFrom(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean42 = node41.isContinue();
        boolean boolean43 = node41.isString();
        com.google.javascript.rhino.Node node44 = node28.useSourceInfoFromForTree(node41);
        com.google.javascript.rhino.InputId inputId45 = null;
        node44.setInputId(inputId45);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean51 = node50.isQualifiedName();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean56 = node55.isContinue();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean61 = node60.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        node60.setJSType(jSType62);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean68 = node67.isContinue();
        com.google.javascript.rhino.Node node69 = node60.clonePropsFrom(node67);
        node55.addChildrenToBack(node60);
        boolean boolean71 = node55.isLocalResultCall();
        com.google.javascript.rhino.Node node72 = node50.copyInformationFromForTree(node55);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(0, node20, node44, node55, (int) (short) 10, 53);
        boolean boolean76 = node75.isTypeOf();
        com.google.javascript.rhino.Node node77 = node75.getParent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(node77);
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12028");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("java.io.IOException: (InputId: true)");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12029");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoAlias();
        boolean boolean3 = jSDocInfo0.hasDescriptionForParameter("java.io.IOException: java.io.IOException");
        boolean boolean4 = jSDocInfo0.hasModifies();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        java.lang.String str7 = jSDocInfo0.getDescriptionForParameter("java.io.IOException: JSDocInfo");
        boolean boolean8 = jSDocInfo0.hasType();
        jSDocInfo0.setLicense("STRING Unknown class name 40\n");
        int int11 = jSDocInfo0.getImplementedInterfaceCount();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12030");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        node3.setJSType(jSType5);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean11 = node10.isContinue();
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node10);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean17 = node16.isContinue();
        boolean boolean18 = node16.isString();
        com.google.javascript.rhino.Node node19 = node3.useSourceInfoFromForTree(node16);
        com.google.javascript.rhino.InputId inputId20 = null;
        node19.setInputId(inputId20);
        java.lang.Object obj23 = node19.getProp((int) (short) 10);
        boolean boolean24 = node19.hasMoreThanOneChild();
        node19.setWasEmptyNode(false);
        boolean boolean27 = node19.isInc();
        boolean boolean28 = node19.isVoid();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12031");
        java.lang.String[] strArray3 = new java.lang.String[] { "Unknown class name", "", "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.Object[] objArray6 = strSet4.toArray();
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] { 0.0d, (short) -1, 100.0d, 30 };
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList24 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 0.0d, (java.io.Serializable) 10.0f, (java.io.Serializable) (short) 100, (java.io.Serializable) "hi!", (java.io.Serializable) 1.0d, (java.io.Serializable) 0.0d, (java.io.Serializable) 0, (java.io.Serializable) 'a', (java.io.Serializable) (byte) 0, (java.io.Serializable) 1L, (java.io.Serializable) 1.0d, (java.io.Serializable) (byte) 100, serializableArray23);
        boolean boolean25 = serializableList24.isEmpty();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean30 = node29.isQualifiedName();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean35 = node34.isContinue();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean40 = node39.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        node39.setJSType(jSType41);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean47 = node46.isContinue();
        com.google.javascript.rhino.Node node48 = node39.clonePropsFrom(node46);
        node34.addChildrenToBack(node39);
        boolean boolean50 = node34.isLocalResultCall();
        com.google.javascript.rhino.Node node51 = node29.copyInformationFromForTree(node34);
        boolean boolean52 = serializableList24.contains((java.lang.Object) node34);
        java.util.Iterator<java.io.Serializable> serializableItor53 = serializableList24.iterator();
        boolean boolean54 = strSet4.containsAll((java.util.Collection<java.io.Serializable>) serializableList24);
        java.lang.Object[] objArray55 = serializableList24.toArray();
        boolean boolean56 = serializableList24.isEmpty();
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList57 = serializableList24.reverse();
        java.util.Iterator<java.io.Serializable> serializableItor58 = serializableList24.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        int int60 = jSDocInfo59.getImplementedInterfaceCount();
        boolean boolean61 = jSDocInfo59.hasType();
        java.lang.String str62 = jSDocInfo59.getSourceName();
        boolean boolean63 = jSDocInfo59.isDefine();
        java.util.Set<java.lang.String> strSet64 = jSDocInfo59.getModifies();
        boolean boolean65 = serializableList24.contains((java.lang.Object) strSet64);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 45);
        boolean boolean68 = node67.isExprResult();
        boolean boolean69 = node67.isCatch();
        int int70 = serializableList24.lastIndexOf((java.lang.Object) boolean69);
        java.util.stream.Stream<java.io.Serializable> serializableStream71 = serializableList24.stream();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node74 = node73.cloneTree();
        boolean boolean75 = node74.isIn();
        boolean boolean76 = node74.isWith();
        int int77 = serializableList24.indexOf((java.lang.Object) boolean76);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[Unknown class name, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[Unknown class name, ]");
        org.junit.Assert.assertNotNull(serializableArray23);
        org.junit.Assert.assertNotNull(serializableList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(serializableItor53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(serializableList57);
        org.junit.Assert.assertNotNull(serializableItor58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(serializableStream71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12032");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(0, "JSDocInfo");
        boolean boolean4 = node3.isCase();
        boolean boolean5 = node3.isBlock();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean10 = node9.isLabelName();
        boolean boolean11 = node9.isTrue();
        boolean boolean12 = node9.isNoSideEffectsCall();
        boolean boolean13 = node9.isCase();
        boolean boolean14 = node9.isVar();
        int int15 = node9.getSourcePosition();
        boolean boolean16 = node9.isAnd();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        node20.setJSType(jSType22);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean28 = node27.isContinue();
        com.google.javascript.rhino.Node node29 = node20.clonePropsFrom(node27);
        boolean boolean30 = node29.isQuotedString();
        boolean boolean31 = node29.isOptionalArg();
        boolean boolean32 = node29.isLabelName();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(9, node3, node9, node29);
        boolean boolean34 = node9.isAssign();
        node9.putBooleanProp(40, false);
        boolean boolean38 = node9.isDefaultCase();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12033");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasFileOverview();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.hasType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean8 = jSDocInfo0.hasBaseType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getSuppressions();
        boolean boolean10 = jSDocInfo0.isHidden();
        boolean boolean11 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str12 = jSDocInfo0.getLendsName();
        java.lang.String str14 = jSDocInfo0.getDescriptionForParameter("hi!");
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean19 = node18.isLabelName();
        boolean boolean20 = node18.isTrue();
        boolean boolean21 = node18.isNoSideEffectsCall();
        boolean boolean22 = node18.isCase();
        boolean boolean23 = node18.isVar();
        int int24 = node18.getSourcePosition();
        boolean boolean25 = node18.isAnd();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean30 = node29.isLabelName();
        boolean boolean31 = node29.isDec();
        boolean boolean32 = node29.isAssign();
        node29.addSuppression("Unknown class name");
        boolean boolean35 = node29.isGetterDef();
        com.google.javascript.rhino.Node node36 = node29.getFirstChild();
        java.lang.String str37 = node18.checkTreeEquals(node29);
        com.google.javascript.rhino.Node node38 = node29.removeChildren();
        jSDocInfo0.setAssociatedNode(node29);
        java.lang.String str40 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12034");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        boolean boolean2 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.hasParameter("true");
        boolean boolean5 = jSDocInfo0.hasEnumParameterType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("java.io.IOException: java.io.IOException");
        boolean boolean8 = jSDocInfo0.isNoAlias();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean11 = jSDocInfo0.hasParameterType("java.io.IOException: java.io.IOException");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12035");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getImplementedInterfaceCount();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean4 = jSDocInfo3.isNoAlias();
        boolean boolean5 = strSet2.equals((java.lang.Object) jSDocInfo3);
        strSet2.clear();
        java.util.Iterator<java.lang.String> strItor7 = strSet2.iterator();
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] { 0.0d, (short) -1, 100.0d, 30 };
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList25 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 0.0d, (java.io.Serializable) 10.0f, (java.io.Serializable) (short) 100, (java.io.Serializable) "hi!", (java.io.Serializable) 1.0d, (java.io.Serializable) 0.0d, (java.io.Serializable) 0, (java.io.Serializable) 'a', (java.io.Serializable) (byte) 0, (java.io.Serializable) 1L, (java.io.Serializable) 1.0d, (java.io.Serializable) (byte) 100, serializableArray24);
        int int26 = serializableList25.size();
        com.google.common.collect.UnmodifiableListIterator<java.io.Serializable> serializableItor27 = serializableList25.listIterator();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean31 = booleanLiteralSet29.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet33 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = booleanLiteralSet29.intersection(booleanLiteralSet33);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean38 = booleanLiteralSet36.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet40 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet41 = booleanLiteralSet36.intersection(booleanLiteralSet40);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet43 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean45 = booleanLiteralSet43.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet47 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean49 = booleanLiteralSet47.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet52 = booleanLiteralSet47.intersection(booleanLiteralSet51);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet53 = booleanLiteralSet43.intersection(booleanLiteralSet51);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet55 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet56 = booleanLiteralSet53.union(booleanLiteralSet55);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet58 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList59 = com.google.common.collect.ImmutableList.of(booleanLiteralSet34, booleanLiteralSet41, booleanLiteralSet56, booleanLiteralSet58);
        boolean boolean60 = serializableList25.equals((java.lang.Object) booleanLiteralSet34);
        boolean boolean61 = strSet2.retainAll((java.util.Collection<java.io.Serializable>) serializableList25);
        com.google.common.collect.UnmodifiableIterator<java.io.Serializable> serializableItor62 = serializableList25.iterator();
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList63 = serializableList25.reverse();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(serializableArray24);
        org.junit.Assert.assertNotNull(serializableList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertNotNull(serializableItor27);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet29 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet29.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet33 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet33.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet36 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet36.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet40 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet40.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet41 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet41.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet43 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet43.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet47 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet47.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet52 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet52.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet53 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet53.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet55 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet55.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet56 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet56.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet58 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet58.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(serializableItor62);
        org.junit.Assert.assertNotNull(serializableList63);
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12036");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(37, "hi!", (int) (byte) 100, (int) (short) 100);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node4.new FileLevelJsDocBuilder();
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12037");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(3, 63, (int) ' ');
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder4 = node3.getJsDocBuilderForNode();
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder4);
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12038");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 4095);
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12039");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "JSDocInfo");
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean8 = node7.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        node7.setJSType(jSType9);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean15 = node14.isContinue();
        com.google.javascript.rhino.Node node16 = node7.clonePropsFrom(node14);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        node2.putProp(50, (java.lang.Object) node16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node16.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean25 = node24.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        node24.setJSType(jSType26);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean32 = node31.isContinue();
        com.google.javascript.rhino.Node node33 = node24.clonePropsFrom(node31);
        boolean boolean34 = node33.isQuotedString();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean39 = node38.isLabelName();
        boolean boolean40 = node38.isDec();
        boolean boolean41 = node38.isScript();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(0, node33, node38, node45, 0, (int) (short) 0);
        boolean boolean49 = node38.isDec();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean54 = node53.isQualifiedName();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean59 = node58.isContinue();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean64 = node63.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        node63.setJSType(jSType65);
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean71 = node70.isContinue();
        com.google.javascript.rhino.Node node72 = node63.clonePropsFrom(node70);
        node58.addChildrenToBack(node63);
        boolean boolean74 = node58.isLocalResultCall();
        com.google.javascript.rhino.Node node75 = node53.copyInformationFromForTree(node58);
        node58.setSourceEncodedPosition((int) (short) -1);
        boolean boolean78 = node58.isName();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean83 = node82.isLabelName();
        boolean boolean84 = node58.hasChild(node82);
        com.google.javascript.rhino.Node node85 = node38.useSourceInfoIfMissingFromForTree(node82);
        boolean boolean86 = node85.isBreak();
        boolean boolean87 = node85.isBlock();
        com.google.javascript.rhino.Node node88 = node16.srcrefTree(node85);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(node88);
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12040");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean6 = jSDocInfo0.hasParameter("Unknown class name");
        int int7 = jSDocInfo0.getParameterCount();
        boolean boolean8 = jSDocInfo0.isOverride();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean13 = node12.isLabelName();
        boolean boolean14 = node12.isTrue();
        boolean boolean15 = node12.isNoSideEffectsCall();
        boolean boolean16 = node12.isCase();
        boolean boolean17 = node12.isVar();
        int int18 = node12.getSourcePosition();
        boolean boolean19 = node12.isAnd();
        node12.setType(0);
        jSDocInfo0.setAssociatedNode(node12);
        int int23 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str24 = jSDocInfo0.getVersion();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12041");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isQualifiedName();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean9 = node8.isContinue();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean14 = node13.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        node13.setJSType(jSType15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean21 = node20.isContinue();
        com.google.javascript.rhino.Node node22 = node13.clonePropsFrom(node20);
        node8.addChildrenToBack(node13);
        boolean boolean24 = node8.isLocalResultCall();
        com.google.javascript.rhino.Node node25 = node3.copyInformationFromForTree(node8);
        node8.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.InputId inputId28 = node8.getInputId();
        node8.setOptionalArg(false);
        boolean boolean31 = node8.isTrue();
        com.google.javascript.rhino.Node node32 = node8.getLastChild();
        boolean boolean33 = node8.isOr();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean38 = node37.isLabelName();
        boolean boolean39 = node37.isDec();
        boolean boolean40 = node37.isNoSideEffectsCall();
        boolean boolean41 = node37.isIf();
        com.google.javascript.rhino.Node node42 = node37.getLastSibling();
        com.google.javascript.rhino.InputId inputId44 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId46 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId48 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId50 = new com.google.javascript.rhino.InputId("true");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.InputId> inputIdList51 = com.google.common.collect.ImmutableList.of(inputId44, inputId46, inputId48, inputId50);
        java.lang.String str52 = inputId48.getIdName();
        node42.setInputId(inputId48);
        java.lang.String str54 = inputId48.getIdName();
        node8.setInputId(inputId48);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(inputIdList51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "true" + "'", str52, "true");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "true" + "'", str54, "true");
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12042");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException8 = new java.io.IOException("false", (java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException: java.io.IOException: NUMBER -1.0 12");
        java.io.IOException iOException14 = new java.io.IOException("TYPEOF 97\n", (java.lang.Throwable) iOException13);
        iOException9.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException16 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: ([0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30])", (java.lang.Throwable) iOException9);
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12043");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoAlias();
        java.util.Set<java.lang.String> strSet2 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.Node node3 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12044");
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] { 0.0d, (short) -1, 100.0d, 30 };
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 0.0d, (java.io.Serializable) 10.0f, (java.io.Serializable) (short) 100, (java.io.Serializable) "hi!", (java.io.Serializable) 1.0d, (java.io.Serializable) 0.0d, (java.io.Serializable) 0, (java.io.Serializable) 'a', (java.io.Serializable) (byte) 0, (java.io.Serializable) 1L, (java.io.Serializable) 1.0d, (java.io.Serializable) (byte) 100, serializableArray16);
        int int18 = serializableList17.size();
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] { 0.0d, (short) -1, 100.0d, 30 };
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList36 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 0.0d, (java.io.Serializable) 10.0f, (java.io.Serializable) (short) 100, (java.io.Serializable) "hi!", (java.io.Serializable) 1.0d, (java.io.Serializable) 0.0d, (java.io.Serializable) 0, (java.io.Serializable) 'a', (java.io.Serializable) (byte) 0, (java.io.Serializable) 1L, (java.io.Serializable) 1.0d, (java.io.Serializable) (byte) 100, serializableArray35);
        boolean boolean37 = serializableList36.isEmpty();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean42 = node41.isQualifiedName();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean47 = node46.isContinue();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean52 = node51.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        node51.setJSType(jSType53);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean59 = node58.isContinue();
        com.google.javascript.rhino.Node node60 = node51.clonePropsFrom(node58);
        node46.addChildrenToBack(node51);
        boolean boolean62 = node46.isLocalResultCall();
        com.google.javascript.rhino.Node node63 = node41.copyInformationFromForTree(node46);
        boolean boolean64 = serializableList36.contains((java.lang.Object) node46);
        boolean boolean65 = serializableList17.containsAll((java.util.Collection<java.io.Serializable>) serializableList36);
        java.lang.Object[] objArray66 = serializableList36.toArray();
        java.util.stream.Stream<java.io.Serializable> serializableStream67 = serializableList36.stream();
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = new com.google.javascript.rhino.JSDocInfo();
        int int69 = jSDocInfo68.getImplementedInterfaceCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection70 = jSDocInfo68.getTypeNodes();
        boolean boolean71 = jSDocInfo68.isExpose();
        int int72 = serializableList36.indexOf((java.lang.Object) jSDocInfo68);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList73 = serializableList36.asList();
        org.junit.Assert.assertNotNull(serializableArray16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNotNull(serializableArray35);
        org.junit.Assert.assertNotNull(serializableList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
        org.junit.Assert.assertNotNull(serializableStream67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(nodeCollection70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(serializableList73);
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12045");
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] { 0.0d, (short) -1, 100.0d, 30 };
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 0.0d, (java.io.Serializable) 10.0f, (java.io.Serializable) (short) 100, (java.io.Serializable) "hi!", (java.io.Serializable) 1.0d, (java.io.Serializable) 0.0d, (java.io.Serializable) 0, (java.io.Serializable) 'a', (java.io.Serializable) (byte) 0, (java.io.Serializable) 1L, (java.io.Serializable) 1.0d, (java.io.Serializable) (byte) 100, serializableArray16);
        boolean boolean18 = serializableList17.isEmpty();
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList19 = serializableList17.asList();
        boolean boolean20 = serializableList17.isEmpty();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean29 = node28.isQualifiedName();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean34 = node33.isContinue();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean39 = node38.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        node38.setJSType(jSType40);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean46 = node45.isContinue();
        com.google.javascript.rhino.Node node47 = node38.clonePropsFrom(node45);
        node33.addChildrenToBack(node38);
        boolean boolean49 = node33.isLocalResultCall();
        com.google.javascript.rhino.Node node50 = node28.copyInformationFromForTree(node33);
        node33.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node53 = node24.clonePropsFrom(node33);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean58 = node57.isInstanceOf();
        boolean boolean59 = node57.isComma();
        boolean boolean60 = node24.isEquivalentTo(node57);
        boolean boolean61 = node57.isComma();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean66 = node65.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        node65.setJSType(jSType67);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean73 = node72.isContinue();
        com.google.javascript.rhino.Node node74 = node65.clonePropsFrom(node72);
        boolean boolean75 = node74.isQuotedString();
        int int76 = node74.getCharno();
        boolean boolean77 = node74.isDec();
        com.google.javascript.rhino.Node node78 = node57.useSourceInfoFrom(node74);
        int int80 = node74.getIntProp((int) (byte) 0);
        int int81 = node74.getType();
        boolean boolean82 = serializableList17.equals((java.lang.Object) node74);
        boolean boolean83 = node74.isName();
        org.junit.Assert.assertNotNull(serializableArray16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serializableList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12046");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("true");
        boolean boolean6 = jSDocInfo0.hasThisType();
        boolean boolean7 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.isImplicitCast();
        boolean boolean9 = jSDocInfo0.isDefine();
        int int10 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean11 = jSDocInfo0.isExport();
        java.lang.String str12 = jSDocInfo0.getMeaning();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList13 = jSDocInfo0.getImplementedInterfaces();
        java.util.Set<java.lang.String> strSet14 = jSDocInfo0.getParameterNames();
        java.lang.String str15 = jSDocInfo0.getVersion();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(jSTypeExpressionList13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12047");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        java.lang.String str3 = jSDocInfo0.getMeaning();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getThrownTypes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12048");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 8);
        node1.setWasEmptyNode(false);
        boolean boolean4 = node1.isFromExterns();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12049");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.isJavaDispatch();
        java.lang.String str6 = jSDocInfo0.getDescriptionForParameter("hi!");
        boolean boolean8 = jSDocInfo0.hasParameterType("");
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getTypedefType();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getModifies();
        java.lang.Object[] objArray12 = strSet11.toArray();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean17 = node16.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        node16.setJSType(jSType18);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean24 = node23.isContinue();
        com.google.javascript.rhino.Node node25 = node16.clonePropsFrom(node23);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean30 = node29.isContinue();
        boolean boolean31 = node29.isString();
        com.google.javascript.rhino.Node node32 = node16.useSourceInfoFromForTree(node29);
        com.google.javascript.rhino.InputId inputId33 = null;
        node32.setInputId(inputId33);
        java.lang.Object obj36 = node32.getProp((int) (short) 10);
        com.google.javascript.rhino.jstype.JSType jSType37 = node32.getJSType();
        boolean boolean39 = node32.getBooleanProp((int) (short) 0);
        boolean boolean40 = node32.isVar();
        boolean boolean41 = node32.isIf();
        boolean boolean42 = strSet11.remove((java.lang.Object) boolean41);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(jSType37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12050");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        node4.setJSType(jSType6);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean12 = node11.isContinue();
        com.google.javascript.rhino.Node node13 = node4.clonePropsFrom(node11);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean18 = node17.isContinue();
        boolean boolean19 = node17.isString();
        com.google.javascript.rhino.Node node20 = node4.useSourceInfoFromForTree(node17);
        com.google.javascript.rhino.InputId inputId21 = null;
        node20.setInputId(inputId21);
        java.lang.Object obj24 = node20.getProp((int) (short) 10);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean29 = node28.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        node28.setJSType(jSType30);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean36 = node35.isContinue();
        com.google.javascript.rhino.Node node37 = node28.clonePropsFrom(node35);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean42 = node41.isContinue();
        boolean boolean43 = node41.isString();
        com.google.javascript.rhino.Node node44 = node28.useSourceInfoFromForTree(node41);
        com.google.javascript.rhino.InputId inputId45 = null;
        node44.setInputId(inputId45);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean51 = node50.isQualifiedName();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean56 = node55.isContinue();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean61 = node60.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        node60.setJSType(jSType62);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean68 = node67.isContinue();
        com.google.javascript.rhino.Node node69 = node60.clonePropsFrom(node67);
        node55.addChildrenToBack(node60);
        boolean boolean71 = node55.isLocalResultCall();
        com.google.javascript.rhino.Node node72 = node50.copyInformationFromForTree(node55);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(0, node20, node44, node55, (int) (short) 10, 53);
        com.google.javascript.rhino.InputId inputId76 = node55.getInputId();
        boolean boolean77 = node55.isReturn();
        boolean boolean78 = node55.isLabelName();
        java.lang.Object obj80 = node55.getProp(10);
        com.google.javascript.rhino.Node node81 = node55.cloneNode();
        com.google.javascript.rhino.Node node82 = node81.getLastSibling();
        node82.setWasEmptyNode(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNull(inputId76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node82);
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12051");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        node3.setJSType(jSType5);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean11 = node10.isContinue();
        com.google.javascript.rhino.Node node12 = node3.clonePropsFrom(node10);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean17 = node16.isContinue();
        boolean boolean18 = node16.isString();
        boolean boolean19 = node16.isStringKey();
        com.google.javascript.rhino.Node node20 = node3.copyInformationFrom(node16);
        boolean boolean21 = node16.hasOneChild();
        boolean boolean22 = node16.isLabel();
        int int23 = node16.getLength();
        com.google.javascript.rhino.jstype.JSType jSType24 = node16.getJSType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12052");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        int int1 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = null;
        jSDocInfo0.setVisibility(visibility2);
        java.lang.String str4 = jSDocInfo0.getMeaning();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getReturnType();
        boolean boolean8 = jSDocInfo0.isDefine();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getModifies();
        java.util.Spliterator<java.lang.String> strSpliterator10 = strSet9.spliterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSpliterator10);
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12053");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId3 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("true");
        com.google.javascript.rhino.InputId inputId7 = new com.google.javascript.rhino.InputId("true");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.InputId> inputIdList8 = com.google.common.collect.ImmutableList.of(inputId1, inputId3, inputId5, inputId7);
        java.lang.String str9 = inputId5.getIdName();
        java.lang.String str10 = inputId5.getIdName();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean15 = node14.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        node14.setJSType(jSType16);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean22 = node21.isContinue();
        com.google.javascript.rhino.Node node23 = node14.clonePropsFrom(node21);
        node23.setSourceFileForTesting("hi!");
        boolean boolean26 = node23.isIf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = node23.getStaticSourceFile();
        java.lang.String str28 = staticSourceFile27.getName();
        boolean boolean29 = inputId5.equals((java.lang.Object) staticSourceFile27);
        int int31 = staticSourceFile27.getLineOfOffset(0);
        int int33 = staticSourceFile27.getColumnOfOffset(47);
        int int35 = staticSourceFile27.getColumnOfOffset(47);
        int int37 = staticSourceFile27.getLineOfOffset(8240);
        org.junit.Assert.assertNotNull(inputIdList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "true" + "'", str9, "true");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "true" + "'", str10, "true");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(staticSourceFile27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12054");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isContinue();
        boolean boolean5 = node3.isBlock();
        node3.removeProp(12);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        node12.setJSType(jSType14);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean20 = node19.isContinue();
        com.google.javascript.rhino.Node node21 = node12.clonePropsFrom(node19);
        boolean boolean22 = node21.isQuotedString();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean27 = node26.isLabelName();
        boolean boolean28 = node26.isDec();
        boolean boolean29 = node26.isScript();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0, node21, node26, node33, 0, (int) (short) 0);
        boolean boolean37 = node21.isTrue();
        com.google.javascript.rhino.Node node38 = node3.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean39 = node3.isInc();
        com.google.javascript.rhino.Node node40 = node3.getLastSibling();
        com.google.javascript.rhino.Node node41 = node40.removeFirstChild();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("true", 42, 8);
        int int46 = node45.getCharno();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean51 = node50.isQualifiedName();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean56 = node55.isContinue();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean61 = node60.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        node60.setJSType(jSType62);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean68 = node67.isContinue();
        com.google.javascript.rhino.Node node69 = node60.clonePropsFrom(node67);
        node55.addChildrenToBack(node60);
        boolean boolean71 = node55.isLocalResultCall();
        com.google.javascript.rhino.Node node72 = node50.copyInformationFromForTree(node55);
        node55.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.InputId inputId75 = node55.getInputId();
        node55.setOptionalArg(false);
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString("hi!", (int) '4', 52);
        boolean boolean82 = node55.isEquivalentTo(node81);
        com.google.javascript.rhino.Node node83 = node45.srcref(node81);
        node40.addChildrenToFront(node81);
        com.google.javascript.rhino.Node[] nodeArray87 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node(51, nodeArray87, 48, 32);
        boolean boolean91 = node90.isSetterDef();
        boolean boolean92 = node90.isSwitch();
        com.google.javascript.rhino.Node node95 = new com.google.javascript.rhino.Node(53, node90, (int) ' ', (-2147483648));
        com.google.javascript.rhino.Node node96 = node40.useSourceInfoIfMissingFromForTree(node95);
        boolean boolean98 = node95.getBooleanProp(8240);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNull(inputId75);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(nodeArray87);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12055");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean4 = node3.isQuotedString();
        boolean boolean5 = node3.isCase();
        boolean boolean6 = node3.isUnscopedQualifiedName();
        boolean boolean7 = node3.isUnscopedQualifiedName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12056");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getStartLine();
        int int3 = stringPosition0.getPositionOnStartLine();
        java.lang.String str4 = stringPosition0.getItem();
        int int5 = stringPosition0.getPositionOnEndLine();
        int int6 = stringPosition0.getPositionOnEndLine();
        int int7 = stringPosition0.getPositionOnEndLine();
        java.lang.String str8 = stringPosition0.getItem();
        stringPosition0.setItem("InputId: true");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12057");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean5 = node4.isContinue();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        node9.setJSType(jSType11);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean17 = node16.isContinue();
        com.google.javascript.rhino.Node node18 = node9.clonePropsFrom(node16);
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.InputId inputId20 = node4.getInputId();
        boolean boolean21 = node4.isAdd();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable22 = node4.getAncestors();
        boolean boolean23 = node4.isNoSideEffectsCall();
        boolean boolean24 = node4.isBlock();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean29 = node28.isQualifiedName();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean34 = node33.isContinue();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean39 = node38.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        node38.setJSType(jSType40);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean46 = node45.isContinue();
        com.google.javascript.rhino.Node node47 = node38.clonePropsFrom(node45);
        node33.addChildrenToBack(node38);
        boolean boolean49 = node33.isLocalResultCall();
        com.google.javascript.rhino.Node node50 = node28.copyInformationFromForTree(node33);
        node33.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.InputId inputId53 = node33.getInputId();
        node33.setLineno(54);
        boolean boolean56 = node33.isVoid();
        boolean boolean57 = node33.isFromExterns();
        boolean boolean58 = node33.isTrue();
        boolean boolean59 = node33.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 1, node4, node33);
        boolean boolean61 = node33.isUnscopedQualifiedName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(inputId20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(ancestorIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(inputId53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12058");
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] { 0.0d, (short) -1, 100.0d, 30 };
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 0.0d, (java.io.Serializable) 10.0f, (java.io.Serializable) (short) 100, (java.io.Serializable) "hi!", (java.io.Serializable) 1.0d, (java.io.Serializable) 0.0d, (java.io.Serializable) 0, (java.io.Serializable) 'a', (java.io.Serializable) (byte) 0, (java.io.Serializable) 1L, (java.io.Serializable) 1.0d, (java.io.Serializable) (byte) 100, serializableArray16);
        boolean boolean18 = serializableList17.isEmpty();
        boolean boolean20 = serializableList17.contains((java.lang.Object) 52);
        int int22 = serializableList17.indexOf((java.lang.Object) (-1L));
        java.util.Iterator<java.io.Serializable> serializableItor23 = serializableList17.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.isNoAlias();
        boolean boolean26 = serializableList17.equals((java.lang.Object) jSDocInfo24);
        java.lang.Object[] objArray27 = serializableList17.toArray();
        com.google.common.collect.ImmutableList.Builder<java.lang.Cloneable> cloneableBuilder28 = com.google.common.collect.ImmutableList.builder();
        boolean boolean29 = serializableList17.equals((java.lang.Object) cloneableBuilder28);
        // The following exception was thrown during execution in test generation
        try {
            serializableList17.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(serializableItor23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
        org.junit.Assert.assertNotNull(cloneableBuilder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12059");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(32, (int) (byte) 10, (int) '#');
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = null;
        node3.setJSDocInfo(jSDocInfo4);
        boolean boolean6 = node3.isString();
        boolean boolean7 = node3.isBlock();
        boolean boolean8 = node3.isWith();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12060");
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] { 0.0d, (short) -1, 100.0d, 30 };
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 0.0d, (java.io.Serializable) 10.0f, (java.io.Serializable) (short) 100, (java.io.Serializable) "hi!", (java.io.Serializable) 1.0d, (java.io.Serializable) 0.0d, (java.io.Serializable) 0, (java.io.Serializable) 'a', (java.io.Serializable) (byte) 0, (java.io.Serializable) 1L, (java.io.Serializable) 1.0d, (java.io.Serializable) (byte) 100, serializableArray16);
        boolean boolean18 = serializableList17.isEmpty();
        boolean boolean20 = serializableList17.contains((java.lang.Object) 52);
        int int22 = serializableList17.indexOf((java.lang.Object) (-1L));
        java.util.Iterator<java.io.Serializable> serializableItor23 = serializableList17.iterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableList17.parallelStream();
        java.util.ListIterator<java.io.Serializable> serializableItor26 = serializableList17.listIterator(0);
        com.google.common.collect.UnmodifiableIterator<java.io.Serializable> serializableItor27 = serializableList17.iterator();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean32 = node31.isContinue();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean37 = node36.isLabelName();
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        node36.setJSType(jSType38);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 0, (int) (short) 1, (int) (short) -1);
        boolean boolean44 = node43.isContinue();
        com.google.javascript.rhino.Node node45 = node36.clonePropsFrom(node43);
        node31.addChildrenToBack(node36);
        boolean boolean47 = node36.isParamList();
        boolean boolean48 = node36.isGetProp();
        boolean boolean49 = node36.isNumber();
        boolean boolean50 = serializableList17.contains((java.lang.Object) boolean49);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList51 = serializableList17.asList();
        com.google.common.collect.UnmodifiableListIterator<java.io.Serializable> serializableItor53 = serializableList17.listIterator(0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        int int55 = jSDocInfo54.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility56 = null;
        jSDocInfo54.setVisibility(visibility56);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo54.getEnumParameterType();
        java.lang.String str59 = jSDocInfo54.getReturnDescription();
        boolean boolean60 = jSDocInfo54.isConsistentIdGenerator();
        boolean boolean61 = jSDocInfo54.isImplicitCast();
        java.lang.String str62 = jSDocInfo54.getVersion();
        int int63 = jSDocInfo54.getImplementedInterfaceCount();
        int int64 = serializableList17.lastIndexOf((java.lang.Object) jSDocInfo54);
        java.lang.Object[] objArray65 = serializableList17.toArray();
        org.junit.Assert.assertNotNull(serializableArray16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(serializableItor23);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertNotNull(serializableItor26);
        org.junit.Assert.assertNotNull(serializableItor27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(serializableList51);
        org.junit.Assert.assertNotNull(serializableItor53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(jSTypeExpression58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[0.0, 10.0, 100, hi!, 1.0, 0.0, 0, a, 0, 1, 1.0, 100, 0.0, -1, 100.0, 30]");
    }
}

