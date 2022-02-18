import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test17501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17501");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        java.lang.String str10 = node4.toString();
        node4.removeProp((int) (short) 0);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean17 = node16.isBreak();
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        node16.setJSType(jSType18);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) '#', node4, node16, 0, (int) (short) 0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList24 = jSDocInfo23.getImplementedInterfaces();
        java.lang.String str25 = jSDocInfo23.getFileOverview();
        node22.setJSDocInfo(jSDocInfo23);
        boolean boolean28 = jSDocInfo23.hasParameterType("NUMBER 1.0");
        boolean boolean29 = jSDocInfo23.hasModifies();
        jSDocInfo23.addSuppression("([PROTECTED])");
        java.util.Collection<java.lang.String> strCollection32 = jSDocInfo23.getReferences();
        int int33 = jSDocInfo23.getParameterCount();
        boolean boolean34 = jSDocInfo23.isIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList35 = jSDocInfo23.getThrownTypes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression36 = jSDocInfo23.getThisType();
        boolean boolean38 = jSDocInfo23.hasParameter("((Not declared as a type name))");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NUMBER 1.0" + "'", str10, "NUMBER 1.0");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(strCollection32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList35);
        org.junit.Assert.assertNull(jSTypeExpression36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test17502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17502");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.InputId inputId2 = null;
        node1.setInputId(inputId2);
        boolean boolean4 = node1.isWith();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node1.getJsDocBuilderForNode();
        int int7 = node1.getIntProp(37);
        boolean boolean8 = node1.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node9 = node1.cloneNode();
        node9.setSourceEncodedPosition((int) (short) 10);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test17503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17503");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition1 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker0.getName();
        org.junit.Assert.assertNull(nodeSourcePosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(typePosition7);
        org.junit.Assert.assertNull(stringPosition8);
    }

    @Test
    public void test17504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17504");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        boolean boolean10 = node9.isDo();
        java.util.Set<java.lang.String> strSet11 = node9.getDirectives();
        boolean boolean12 = node9.isString();
        node9.setWasEmptyNode(false);
        boolean boolean15 = node9.isObjectLit();
        boolean boolean16 = node9.isParamList();
        boolean boolean17 = node9.hasOneChild();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(38, node9, (int) (byte) -1, 0);
        node9.setSourceEncodedPositionForTree(37);
        boolean boolean23 = node9.isVarArgs();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test17505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17505");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getParameterType("hi!");
        boolean boolean3 = jSDocInfo0.hasModifies();
        boolean boolean5 = jSDocInfo0.hasDescriptionForParameter("");
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getAuthors();
        boolean boolean8 = jSDocInfo0.isExport();
        java.lang.String str9 = jSDocInfo0.getFileOverview();
        boolean boolean10 = jSDocInfo0.isConstructor();
        java.lang.String str11 = jSDocInfo0.getDescription();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean13 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test17506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17506");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node39 = node34.srcref(node38);
        java.lang.String str40 = node34.toString();
        node34.removeProp((int) (short) 0);
        boolean boolean43 = node34.isGetProp();
        boolean boolean44 = node34.isReturn();
        com.google.javascript.rhino.Node node45 = node4.srcref(node34);
        boolean boolean46 = node45.isStringKey();
        boolean boolean47 = node45.isBlock();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean52 = node51.isBreak();
        com.google.javascript.rhino.Node node53 = node45.copyInformationFromForTree(node51);
        boolean boolean54 = node53.isGetProp();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "NUMBER 1.0" + "'", str40, "NUMBER 1.0");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test17507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17507");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        java.lang.String str14 = node8.toString();
        node8.removeProp((int) (short) 0);
        boolean boolean17 = node8.isObjectLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean22 = node21.isGetterDef();
        com.google.javascript.rhino.Node node23 = node8.useSourceInfoFromForTree(node21);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node23);
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node24);
        boolean boolean26 = node24.isInc();
        int int27 = node24.getSourcePosition();
        boolean boolean28 = node24.isQuotedString();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean33 = node32.isBreak();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        node32.addChildToBack(node37);
        boolean boolean40 = node37.getBooleanProp((int) (byte) -1);
        com.google.javascript.rhino.Node node41 = node37.cloneNode();
        boolean boolean42 = node37.isInc();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 49, 2, 46);
        boolean boolean48 = node47.isIn();
        boolean boolean49 = node47.isReturn();
        boolean boolean50 = node47.isAdd();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(35, "Not declared as a constructor");
        java.lang.String str57 = node53.toString(false, false, true);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder58 = node53.getJsDocBuilderForNode();
        int int59 = node53.getSourceOffset();
        com.google.javascript.rhino.Node node60 = node53.removeChildren();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) -1, node47, node53, 46, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            node24.addChildAfter(node37, node63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NUMBER 1.0" + "'", str14, "NUMBER 1.0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "GETELEM Not declared as a constructor" + "'", str57, "GETELEM Not declared as a constructor");
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node60);
    }

    @Test
    public void test17508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17508");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        java.lang.String str31 = node27.getQualifiedName();
        boolean boolean32 = node27.isDec();
        com.google.javascript.rhino.Node node33 = node27.cloneTree();
        boolean boolean34 = node27.isBreak();
        com.google.javascript.rhino.InputId inputId35 = null;
        node27.setInputId(inputId35);
        node27.setType((int) (byte) -1);
        boolean boolean39 = node27.isDebugger();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test17509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17509");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList1 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean2 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getParameterType("Not declared as a constructor");
        boolean boolean5 = jSDocInfo0.isExport();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = node14.srcref(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node28 = node23.srcref(node27);
        boolean boolean29 = node23.isBreak();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 1, node10, node14, node23, node33, 1, (-1));
        jSDocInfo0.setAssociatedNode(node36);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList38 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean39 = jSDocInfo0.isOverride();
        jSDocInfo0.addSuppression("OR 100");
        boolean boolean42 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertNotNull(jSTypeExpressionList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSTypeExpressionList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test17510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17510");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        boolean boolean9 = node8.isDo();
        java.util.Set<java.lang.String> strSet10 = node8.getDirectives();
        boolean boolean11 = node8.isString();
        node8.setWasEmptyNode(false);
        boolean boolean14 = node8.isObjectLit();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable15 = node8.getAncestors();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node25 = node20.srcref(node24);
        boolean boolean26 = node24.isVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = node24.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node24.getStaticSourceFile();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0, node24, (int) (short) 0, (int) (short) 100);
        com.google.javascript.rhino.Node node32 = node24.cloneTree();
        boolean boolean33 = node8.isEquivalentTo(node32);
        boolean boolean35 = node32.getBooleanProp((int) (short) 10);
        com.google.javascript.rhino.Node node36 = node32.getLastSibling();
        boolean boolean37 = node32.isTrue();
        com.google.javascript.rhino.Node node38 = node32.cloneNode();
        boolean boolean39 = node38.isFor();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ancestorIterable15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSDocInfo27);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test17511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17511");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(30, "[PROTECTED]", 0, 100);
        boolean boolean6 = node5.isDo();
        boolean boolean7 = node5.isBlock();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean12 = node11.isBreak();
        node11.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node15 = node11.cloneTree();
        com.google.javascript.rhino.Node node16 = node5.useSourceInfoIfMissingFromForTree(node11);
        com.google.javascript.rhino.InputId inputId17 = null;
        node11.setInputId(inputId17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node28 = node23.srcref(node27);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node37 = node32.srcref(node36);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean42 = node41.isBreak();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(4095, node23, node36, node41);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile44 = node36.getStaticSourceFile();
        boolean boolean45 = node36.isTry();
        node36.setType(3);
        com.google.javascript.rhino.Node node48 = node36.cloneTree();
        com.google.javascript.rhino.Node node50 = node48.getAncestor(19);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(35, "Not declared as a constructor");
        java.lang.String str57 = node53.toString(false, false, true);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node53.children();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(30, node11, node48, node53, 0, 54);
        boolean boolean62 = node53.isDo();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(staticSourceFile44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "GETELEM Not declared as a constructor" + "'", str57, "GETELEM Not declared as a constructor");
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test17512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17512");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node2 = typePosition0.getItem();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition3.setPositionInformation(30, 4095, 4095, (int) (byte) 100);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition9 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition9.setPositionInformation(30, 4095, 4095, (int) (byte) 100);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition15 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition15.setPositionInformation(0, (int) (short) -1, (int) (short) 0, 29);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition21 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition22 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition22.setPositionInformation(30, 4095, 4095, (int) (byte) 100);
        typePosition22.setPositionInformation(3, (int) (short) -1, 52, 53);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition33 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int34 = typePosition33.getPositionOnStartLine();
        com.google.javascript.rhino.Node node35 = typePosition33.getItem();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node44 = node39.srcref(node43);
        java.lang.String str45 = node39.toString();
        node39.removeProp((int) (short) 0);
        boolean boolean48 = node39.isObjectLit();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean53 = node52.isGetterDef();
        com.google.javascript.rhino.Node node54 = node39.useSourceInfoFromForTree(node52);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node63 = node58.srcref(node62);
        boolean boolean64 = node63.isDo();
        java.util.Set<java.lang.String> strSet65 = node63.getDirectives();
        com.google.javascript.rhino.Node node66 = node52.clonePropsFrom(node63);
        com.google.javascript.rhino.Node node67 = node66.getNext();
        typePosition33.setItem(node66);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition69 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int70 = typePosition69.getPositionOnStartLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList71 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition3, typePosition9, typePosition15, typePosition21, typePosition22, typePosition33, typePosition69);
        boolean boolean72 = typePosition15.hasBrackets();
        int int73 = typePosition15.getStartLine();
        typePosition15.setPositionInformation(0, 41, (int) (short) 100, 31);
        int int79 = typePosition15.getEndLine();
        typePosition15.setPositionInformation(97, 397316, 100, (int) (byte) -1);
        boolean boolean85 = typePosition15.hasBrackets();
        int int86 = typePosition15.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "NUMBER 1.0" + "'", str45, "NUMBER 1.0");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(strSet65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(typePositionList71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 100 + "'", int86 == 100);
    }

    @Test
    public void test17513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17513");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList1 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str2 = jSDocInfo0.getFileOverview();
        boolean boolean3 = jSDocInfo0.isExpose();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility4 = jSDocInfo0.getVisibility();
        boolean boolean5 = jSDocInfo0.isConstant();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertNotNull(jSTypeExpressionList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(visibility4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17514");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList1 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean2 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getParameterType("Not declared as a constructor");
        boolean boolean5 = jSDocInfo0.isExport();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getReturnType();
        boolean boolean8 = jSDocInfo0.hasDescriptionForParameter("([PROTECTED])");
        int int9 = jSDocInfo0.getParameterCount();
        boolean boolean10 = jSDocInfo0.isHidden();
        boolean boolean11 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertNotNull(jSTypeExpressionList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test17515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17515");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        java.lang.String str14 = node8.toString();
        node8.removeProp((int) (short) 0);
        boolean boolean17 = node8.isObjectLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean22 = node21.isGetterDef();
        com.google.javascript.rhino.Node node23 = node8.useSourceInfoFromForTree(node21);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node23);
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node24);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.siblings();
        boolean boolean27 = node25.isCase();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = node25.getJSDocInfo();
        boolean boolean29 = node25.isIn();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node38 = node33.srcref(node37);
        java.lang.String str39 = node33.toString();
        node33.removeProp((int) (short) 0);
        boolean boolean42 = node33.isObjectLit();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean47 = node46.isGetterDef();
        com.google.javascript.rhino.Node node48 = node33.useSourceInfoFromForTree(node46);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder49 = node46.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean54 = node53.isGetterDef();
        com.google.javascript.rhino.Node node55 = node46.useSourceInfoFrom(node53);
        com.google.javascript.rhino.InputId inputId56 = node46.getInputId();
        boolean boolean57 = node46.isIf();
        com.google.javascript.rhino.Node node58 = node25.copyInformationFrom(node46);
        boolean boolean59 = node58.isFromExterns();
        boolean boolean61 = node58.getBooleanProp(97);
        int int62 = node58.getSourcePosition();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable63 = node58.children();
        boolean boolean64 = node58.isFunction();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NUMBER 1.0" + "'", str14, "NUMBER 1.0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jSDocInfo28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NUMBER 1.0" + "'", str39, "NUMBER 1.0");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(inputId56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 397316 + "'", int62 == 397316);
        org.junit.Assert.assertNotNull(nodeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test17516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17516");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        java.lang.String str9 = node3.toString();
        node3.removeProp((int) (short) 0);
        boolean boolean12 = node3.isGetProp();
        boolean boolean13 = node3.isReturn();
        java.util.Set<java.lang.String> strSet14 = node3.getDirectives();
        node3.removeProp((int) (byte) 0);
        int int17 = node3.getSourceOffset();
        boolean boolean18 = node3.isThis();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "NUMBER 1.0" + "'", str9, "NUMBER 1.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test17517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17517");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(51, "Not declared as a constructor");
        boolean boolean4 = node3.isLabelName();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(45, node3);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        java.util.Set<java.lang.String> strSet11 = node9.getDirectives();
        int int12 = node9.getLength();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node21.isVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = node21.getJSDocInfo();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 10, node21);
        boolean boolean26 = node25.isLabelName();
        com.google.javascript.rhino.Node node27 = node9.useSourceInfoIfMissingFromForTree(node25);
        int int28 = node3.getIndexOfChild(node27);
        boolean boolean29 = node3.isStringKey();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSDocInfo24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test17518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17518");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        boolean boolean31 = node8.isInstanceOf();
        boolean boolean32 = node8.isNot();
        int int33 = node8.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node8.removeChildren();
        boolean boolean35 = node8.isName();
        boolean boolean36 = node8.wasEmptyNode();
        boolean boolean37 = node8.isFunction();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test17519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17519");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node10 = node5.srcref(node9);
        java.lang.String str11 = node5.toString();
        node5.removeProp((int) (short) 0);
        boolean boolean14 = node5.isObjectLit();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean19 = node18.isGetterDef();
        com.google.javascript.rhino.Node node20 = node5.useSourceInfoFromForTree(node18);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (byte) 1, node20);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        boolean boolean24 = node23.isRegExp();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile25 = node23.getStaticSourceFile();
        boolean boolean26 = node23.isWhile();
        int int27 = node20.getIndexOfChild(node23);
        boolean boolean28 = node23.isParamList();
        boolean boolean29 = node23.isSwitch();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable30 = node23.getAncestors();
        boolean boolean31 = node23.isStringKey();
        node23.removeProp((int) ' ');
        boolean boolean34 = node23.isThis();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 42, (int) (short) 0, (int) (byte) 1);
        boolean boolean39 = node38.isVar();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(35, node23, node38, 61440, 10);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node56 = node51.srcref(node55);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node65 = node60.srcref(node64);
        boolean boolean66 = node60.isBreak();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (byte) 1, node47, node51, node60, node70, 1, (-1));
        java.lang.String str74 = node70.getQualifiedName();
        com.google.javascript.rhino.InputId inputId75 = node70.getInputId();
        boolean boolean76 = node70.isCatch();
        boolean boolean77 = node70.isNumber();
        boolean boolean78 = node70.isSetterDef();
        com.google.javascript.rhino.Node node79 = node70.cloneTree();
        boolean boolean80 = node79.isDec();
        com.google.javascript.rhino.Node node81 = node23.srcref(node79);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        node23.setJSType(jSType82);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "NUMBER 1.0" + "'", str11, "NUMBER 1.0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(staticSourceFile25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(ancestorIterable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(inputId75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node81);
    }

    @Test
    public void test17520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17520");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        java.lang.String str10 = node4.toString();
        node4.removeProp((int) (short) 0);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean17 = node16.isBreak();
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        node16.setJSType(jSType18);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) '#', node4, node16, 0, (int) (short) 0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList24 = jSDocInfo23.getImplementedInterfaces();
        java.lang.String str25 = jSDocInfo23.getFileOverview();
        node22.setJSDocInfo(jSDocInfo23);
        boolean boolean28 = jSDocInfo23.hasParameterType("([PROTECTED])");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList29 = jSDocInfo23.getImplementedInterfaces();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection30 = jSDocInfo23.getTypeNodes();
        boolean boolean31 = jSDocInfo23.isIdGenerator();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NUMBER 1.0" + "'", str10, "NUMBER 1.0");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList29);
        org.junit.Assert.assertNotNull(nodeCollection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test17521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17521");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 49, 2, 46);
        com.google.javascript.rhino.InputId inputId5 = null;
        node4.setInputId(inputId5);
        boolean boolean7 = node4.isFromExterns();
        boolean boolean8 = node4.isIf();
        boolean boolean9 = node4.isOptionalArg();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray11 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility10 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList12 = com.google.common.collect.ImmutableList.of(visibilityArray11);
        java.util.ListIterator<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityItor13 = visibilityList12.listIterator();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean18 = node17.isFalse();
        com.google.javascript.rhino.Node node19 = node17.cloneTree();
        int int20 = visibilityList12.lastIndexOf((java.lang.Object) node19);
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = node19.getJSDocInfo();
        boolean boolean23 = node19.isWith();
        com.google.javascript.rhino.Node node24 = node4.useSourceInfoIfMissingFromForTree(node19);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(38, node19);
        int int26 = node19.getSourcePosition();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + visibility10 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility10.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNotNull(visibilityArray11);
        org.junit.Assert.assertNotNull(visibilityList12);
        org.junit.Assert.assertNotNull(visibilityItor13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(jSDocInfo22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 409652 + "'", int26 == 409652);
    }

    @Test
    public void test17522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17522");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getParameterType("hi!");
        int int3 = jSDocInfo0.getParameterCount();
        boolean boolean5 = jSDocInfo0.hasParameter("");
        java.lang.String str6 = jSDocInfo0.toString();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getModifies();
        boolean boolean8 = jSDocInfo0.isHidden();
        jSDocInfo0.addSuppression("Named type with empty name component");
        boolean boolean11 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSDocInfo" + "'", str6, "JSDocInfo");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test17523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17523");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(40, (int) (byte) -1, 42);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition4.setPositionInformation(30, 4095, 4095, (int) (byte) 100);
        typePosition4.setPositionInformation(3, (int) (short) -1, 52, 53);
        int int15 = typePosition4.getPositionOnEndLine();
        typePosition4.setPositionInformation(16, 44, (int) 'a', 12);
        int int21 = typePosition4.getPositionOnEndLine();
        int int22 = typePosition4.getEndLine();
        int int23 = typePosition4.getPositionOnEndLine();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        java.lang.String str28 = node27.toString();
        com.google.javascript.rhino.Node node29 = node27.cloneTree();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 10);
        boolean boolean32 = node29.isEquivalentToTyped(node31);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        boolean boolean37 = node36.isFalse();
        java.lang.String str38 = node36.getSourceFileName();
        boolean boolean39 = node36.isLabel();
        boolean boolean40 = node36.isSetterDef();
        boolean boolean41 = node36.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = node50.srcref(node54);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node64 = node59.srcref(node63);
        boolean boolean65 = node59.isBreak();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (byte) 1, node46, node50, node59, node69, 1, (-1));
        boolean boolean73 = node72.isWith();
        boolean boolean74 = node72.isNot();
        boolean boolean75 = node36.isEquivalentToTyped(node72);
        boolean boolean76 = node72.isSyntheticBlock();
        boolean boolean77 = node31.isEquivalentTo(node72);
        typePosition4.setItem(node72);
        com.google.javascript.rhino.Node node79 = node3.useSourceInfoIfMissingFromForTree(node72);
        com.google.javascript.rhino.Node node80 = node72.getLastChild();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder81 = node72.getJsDocBuilderForNode();
        node72.detachChildren();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "NUMBER 1.0" + "'", str28, "NUMBER 1.0");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder81);
    }

    @Test
    public void test17524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17524");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = node3.srcref(node7);
        boolean boolean9 = node7.isVar();
        double double10 = node7.getDouble();
        boolean boolean11 = node7.isNull();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node20 = node15.srcref(node19);
        java.lang.Object obj22 = node15.getProp(10);
        boolean boolean23 = node15.isQuotedString();
        boolean boolean24 = node7.hasChild(node15);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        java.lang.String str29 = node28.toString();
        com.google.javascript.rhino.Node node30 = node28.cloneTree();
        com.google.javascript.rhino.Node node31 = node28.getLastSibling();
        boolean boolean32 = node28.isLocalResultCall();
        boolean boolean33 = node28.isNoSideEffectsCall();
        java.lang.String str34 = node28.getQualifiedName();
        boolean boolean35 = node28.isLabel();
        com.google.javascript.rhino.Node node36 = node15.srcref(node28);
        boolean boolean37 = node28.isSwitch();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NUMBER 1.0" + "'", str29, "NUMBER 1.0");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test17525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17525");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        java.lang.String str10 = node4.toString();
        node4.removeProp((int) (short) 0);
        boolean boolean13 = node4.isObjectLit();
        int int14 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) (byte) 0, 47, 15);
        int int19 = node18.getSideEffectFlags();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(4, node4, node18, 5, 4);
        node18.detachChildren();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NUMBER 1.0" + "'", str10, "NUMBER 1.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test17526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17526");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(54, (int) (byte) 10, 10);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        java.lang.String str14 = node8.toString();
        node8.removeProp((int) (short) 0);
        boolean boolean17 = node8.isObjectLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean22 = node21.isGetterDef();
        com.google.javascript.rhino.Node node23 = node8.useSourceInfoFromForTree(node21);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (byte) 1, node23);
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFromForTree(node24);
        boolean boolean26 = node24.isGetterDef();
        com.google.javascript.rhino.Node node27 = node24.getNext();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "NUMBER 1.0" + "'", str14, "NUMBER 1.0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test17527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17527");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(40, "NUMBER 1.0 97");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(47, node3, 30, (int) 'a');
        com.google.javascript.rhino.Node node7 = node3.cloneNode();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER 1.0\n\n\nTree2:\nSTRING NUMBER 1.0 [directives: [, hi!]]\n\n\nSubtree1: NUMBER 1.0\n\n\nSubtree2: STRING NUMBER 1.0 [directives: [, hi!]]\n");
        node9.setType(48);
        int int12 = node9.getType();
        node3.addChildrenToBack(node9);
        boolean boolean14 = node9.isHook();
        boolean boolean15 = node9.isQuotedString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test17528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17528");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getParameterType("hi!");
        jSDocInfo0.addSuppression("hi!");
        java.lang.String str5 = jSDocInfo0.toString();
        boolean boolean6 = jSDocInfo0.isOverride();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo0.setVisibility(visibility7);
        boolean boolean9 = jSDocInfo0.hasThisType();
        jSDocInfo0.setLicense("((Node tree inequality:\nTree1:\nNUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: STRING \n))");
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + visibility7 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility7.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17529");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        com.google.javascript.rhino.Node node25 = node24.removeChildren();
        boolean boolean26 = node25.isCall();
        com.google.javascript.rhino.Node node28 = node25.getAncestor(32);
        com.google.javascript.rhino.Node node29 = node25.cloneTree();
        node29.setCharno(30);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test17530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17530");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility0 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray1 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility0 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList2 = com.google.common.collect.ImmutableList.of(visibilityArray1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = node7.srcref(node11);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = node16.srcref(node20);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean26 = node25.isBreak();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(4095, node7, node20, node25);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        node7.setDirectives((java.util.Set<java.lang.String>) strSet31);
        java.lang.Object[] objArray34 = strSet31.toArray();
        boolean boolean35 = visibilityList2.contains((java.lang.Object) objArray34);
        boolean boolean37 = visibilityList2.equals((java.lang.Object) 43);
        java.util.Spliterator<com.google.javascript.rhino.JSDocInfo.Visibility> visibilitySpliterator38 = visibilityList2.spliterator();
        java.lang.Object[] objArray39 = visibilityList2.toArray();
        org.junit.Assert.assertTrue("'" + visibility0 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility0.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNotNull(visibilityArray1);
        org.junit.Assert.assertNotNull(visibilityList2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[, hi!]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(visibilitySpliterator38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[PROTECTED]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[PROTECTED]");
    }

    @Test
    public void test17531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17531");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean4 = node3.isAnd();
        node3.setSourceFileForTesting("[PROTECTED]");
        node3.putIntProp(1, 4095);
        com.google.javascript.rhino.InputId inputId10 = null;
        node3.setInputId(inputId10);
        com.google.javascript.rhino.Node node12 = node3.removeFirstChild();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test17532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17532");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node14 = node9.srcref(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node23 = node18.srcref(node22);
        boolean boolean24 = node18.isBreak();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 1, node5, node9, node18, node28, 1, (-1));
        java.lang.String str32 = node28.getQualifiedName();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean37 = node36.isAnd();
        node36.setSourceFileForTesting("[PROTECTED]");
        java.lang.String str40 = node28.checkTreeEquals(node36);
        jSDocInfo0.setAssociatedNode(node28);
        boolean boolean42 = jSDocInfo0.hasFileOverview();
        boolean boolean43 = jSDocInfo0.isNoSideEffects();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression44 = jSDocInfo0.getTypedefType();
        boolean boolean45 = jSDocInfo0.isImplicitCast();
        java.util.Set<java.lang.String> strSet46 = jSDocInfo0.getModifies();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(jSTypeExpression44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strSet46);
    }

    @Test
    public void test17533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17533");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) 'a', "OR\n", (int) (short) 0, 16);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test17534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17534");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (byte) 0);
        boolean boolean2 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.setMutatesGlobalState();
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.clearSideEffectFlags();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test17535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17535");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean5 = node4.isGetterDef();
        boolean boolean6 = node4.isThis();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node16 = node11.srcref(node15);
        java.lang.String str17 = node11.toString();
        node11.removeProp((int) (short) 0);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean24 = node23.isBreak();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        node23.setJSType(jSType25);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) '#', node11, node23, 0, (int) (short) 0);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node33.children();
        node33.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = node41.srcref(node45);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = node50.srcref(node54);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean60 = node59.isBreak();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(4095, node41, node54, node59);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node70 = node65.srcref(node69);
        java.lang.String str71 = node65.toString();
        node65.removeProp((int) (short) 0);
        boolean boolean74 = node65.isObjectLit();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean79 = node78.isGetterDef();
        com.google.javascript.rhino.Node node80 = node65.useSourceInfoFromForTree(node78);
        com.google.javascript.rhino.Node node81 = node61.copyInformationFromForTree(node65);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (short) 100, node4, node29, node33, node61, (int) '4', (int) (byte) 100);
        com.google.javascript.rhino.Node node85 = node29.detachFromParent();
        boolean boolean86 = node85.isInstanceOf();
        int int87 = node85.getType();
        com.google.javascript.rhino.Node node88 = node85.removeChildren();
        com.google.javascript.rhino.Node node89 = node85.getNext();
        // The following exception was thrown during execution in test generation
        try {
            node89.detachChildren();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "NUMBER 1.0" + "'", str17, "NUMBER 1.0");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeIterable34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "NUMBER 1.0" + "'", str71, "NUMBER 1.0");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 35 + "'", int87 == 35);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNull(node89);
    }

    @Test
    public void test17536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17536");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean4 = node3.isAnd();
        node3.setSourceFileForTesting("[PROTECTED]");
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node3.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder8 = node3.getJsDocBuilderForNode();
        fileLevelJsDocBuilder8.append("(GETELEM Not declared as a constructor\n)");
        fileLevelJsDocBuilder8.append("STRING false 52\n");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder8);
    }

    @Test
    public void test17537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17537");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        boolean boolean31 = node8.isInstanceOf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList33 = jSDocInfo32.getImplementedInterfaces();
        java.lang.String str34 = jSDocInfo32.getFileOverview();
        boolean boolean35 = jSDocInfo32.isExpose();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility36 = jSDocInfo32.getVisibility();
        node8.setJSDocInfo(jSDocInfo32);
        boolean boolean38 = jSDocInfo32.isDeprecated();
        boolean boolean39 = jSDocInfo32.hasFileOverview();
        int int40 = jSDocInfo32.getImplementedInterfaceCount();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(visibility36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test17538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17538");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("CALL 100 [jsdoc_info: JSDocInfo]\n");
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = node1.getJSDocInfo();
        boolean boolean3 = node1.isSetterDef();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(jSDocInfo2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test17539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17539");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition2.setPositionInformation((int) (byte) -1, 48, (int) ' ', 8);
        int int8 = stringPosition2.getEndLine();
        int int9 = stringPosition2.getPositionOnEndLine();
        int int10 = stringPosition2.getPositionOnStartLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition11 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition12 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition12.setPositionInformation((int) (byte) -1, 48, (int) ' ', 8);
        int int18 = stringPosition12.getEndLine();
        int int19 = stringPosition12.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition20 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition20.setPositionInformation((int) (byte) -1, 48, (int) ' ', 8);
        int int26 = stringPosition20.getEndLine();
        int int27 = stringPosition20.getPositionOnEndLine();
        int int28 = stringPosition20.getPositionOnStartLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition29 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str30 = stringPosition29.getItem();
        int int31 = stringPosition29.getPositionOnStartLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition32 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition32.setPositionInformation((int) (byte) -1, 48, (int) ' ', 8);
        int int38 = stringPosition32.getEndLine();
        int int39 = stringPosition32.getPositionOnEndLine();
        int int40 = stringPosition32.getPositionOnStartLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition41 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int42 = stringPosition41.getEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition43 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition43.setPositionInformation((int) (byte) -1, 48, (int) ' ', 8);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition49 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str50 = stringPosition49.getItem();
        int int51 = stringPosition49.getPositionOnStartLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition52 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str53 = stringPosition52.getItem();
        int int54 = stringPosition52.getPositionOnStartLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<java.lang.String>> strSourcePositionList55 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition0, (com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition2, (com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition11, (com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition12, (com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition20, (com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition29, (com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition32, (com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition41, (com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition43, (com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition49, (com.google.javascript.rhino.SourcePosition<java.lang.String>) stringPosition52);
        stringPosition2.setItem("");
        int int58 = stringPosition2.getPositionOnStartLine();
        int int59 = stringPosition2.getStartLine();
        int int60 = stringPosition2.getPositionOnStartLine();
        int int61 = stringPosition2.getEndLine();
        stringPosition2.setItem("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 48 + "'", int28 == 48);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 48 + "'", int40 == 48);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(strSourcePositionList55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 48 + "'", int58 == 48);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 48 + "'", int60 == 48);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 32 + "'", int61 == 32);
    }

    @Test
    public void test17540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17540");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: STRING \n", 49, 46);
        java.lang.String str4 = node3.getQualifiedName();
        int int5 = node3.getSourceOffset();
        boolean boolean6 = node3.isIf();
        java.lang.String str7 = node3.getQualifiedName();
        java.lang.String str8 = node3.getQualifiedName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test17541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17541");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition1 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getDescription();
        org.junit.Assert.assertNull(nodeSourcePosition1);
        org.junit.Assert.assertNull(typePosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(typePosition4);
        org.junit.Assert.assertNull(stringPosition5);
    }

    @Test
    public void test17542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17542");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node9 = node4.srcref(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node18 = node13.srcref(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean23 = node22.isBreak();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(4095, node4, node17, node22);
        boolean boolean25 = node22.isIn();
        boolean boolean26 = node22.hasOneChild();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("NUMBER 1.0 [directives: [, hi!]]");
        java.lang.String str29 = node22.checkTreeEquals(node28);
        int int30 = node22.getLength();
        java.lang.String str31 = node22.toString();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Node tree inequality:\nTree1:\nNUMBER 1.0\n\n\nTree2:\nSTRING NUMBER 1.0 [directives: [, hi!]]\n\n\nSubtree1: NUMBER 1.0\n\n\nSubtree2: STRING NUMBER 1.0 [directives: [, hi!]]\n" + "'", str29, "Node tree inequality:\nTree1:\nNUMBER 1.0\n\n\nTree2:\nSTRING NUMBER 1.0 [directives: [, hi!]]\n\n\nSubtree1: NUMBER 1.0\n\n\nSubtree2: STRING NUMBER 1.0 [directives: [, hi!]]\n");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "NUMBER 1.0" + "'", str31, "NUMBER 1.0");
    }

    @Test
    public void test17543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17543");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node13 = node8.srcref(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node22 = node17.srcref(node21);
        boolean boolean23 = node17.isBreak();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 1, node4, node8, node17, node27, 1, (-1));
        boolean boolean31 = node8.isInstanceOf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList33 = jSDocInfo32.getImplementedInterfaces();
        java.lang.String str34 = jSDocInfo32.getFileOverview();
        boolean boolean35 = jSDocInfo32.isExpose();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility36 = jSDocInfo32.getVisibility();
        node8.setJSDocInfo(jSDocInfo32);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = jSDocInfo32.getThisType();
        boolean boolean39 = jSDocInfo32.hasBaseType();
        boolean boolean40 = jSDocInfo32.isExport();
        java.lang.String str41 = jSDocInfo32.getOriginalCommentString();
        boolean boolean42 = jSDocInfo32.isExpose();
        java.lang.String str43 = jSDocInfo32.getFileOverview();
        int int44 = jSDocInfo32.getParameterCount();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(visibility36);
        org.junit.Assert.assertNull(jSTypeExpression38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test17544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17544");
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder[] fileLevelJsDocBuilderArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.FileLevelJsDocBuilder> fileLevelJsDocBuilderList1 = com.google.common.collect.ImmutableList.of(fileLevelJsDocBuilderArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17545");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.clearSideEffectFlags();
        sideEffectFlags0.setReturnsTainted();
        sideEffectFlags0.setMutatesGlobalState();
        sideEffectFlags0.setMutatesGlobalState();
        java.lang.Class<?> wildcardClass5 = sideEffectFlags0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test17546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17546");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDescription();
        boolean boolean2 = jSDocInfo0.isInterface();
        jSDocInfo0.setDeprecated(true);
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        boolean boolean6 = jSDocInfo0.isNoTypeCheck();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test17547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17547");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(10.0d, (int) (short) -1, 4095);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node4.getStaticSourceFile();
        boolean boolean6 = node4.isNot();
        boolean boolean7 = node4.isIf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = node4.getStaticSourceFile();
        boolean boolean9 = node4.isFor();
        boolean boolean10 = node4.isIf();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node20 = node15.srcref(node19);
        java.lang.String str21 = node15.toString();
        node15.removeProp((int) (short) 0);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean28 = node27.isBreak();
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        node27.setJSType(jSType29);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) '#', node15, node27, 0, (int) (short) 0);
        boolean boolean34 = node27.isFalse();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber(0.0d);
        boolean boolean37 = node36.isInstanceOf();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder38 = node36.getJsDocBuilderForNode();
        boolean boolean39 = node27.hasChild(node36);
        boolean boolean40 = node36.isParamList();
        node36.setLineno(16);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        int int47 = node46.getSideEffectFlags();
        boolean boolean48 = node46.isUnscopedQualifiedName();
        boolean boolean49 = node46.isOr();
        node46.addSuppression("[PROTECTED]");
        com.google.javascript.rhino.Node node52 = null;
        node36.addChildrenAfter(node46, node52);
        boolean boolean54 = node36.isFor();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable55 = node36.getAncestors();
        boolean boolean56 = node36.isCase();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(29, node4, node36, 11, 12);
        com.google.javascript.rhino.Node node60 = node36.getLastChild();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(staticSourceFile8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "NUMBER 1.0" + "'", str21, "NUMBER 1.0");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(ancestorIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node60);
    }

    @Test
    public void test17548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17548");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("NUMBER 1.0 97", 30, (int) (byte) -1);
        boolean boolean5 = node4.isNull();
        node4.setString("Node tree inequality:\nTree1:\nNUMBER 1.0\n\n\nTree2:\nSTRING \n\n\nSubtree1: NUMBER 1.0\n\n\nSubtree2: STRING \n");
        node4.putBooleanProp(51, true);
        boolean boolean11 = node4.isInc();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node20 = node15.srcref(node19);
        boolean boolean21 = node20.isDo();
        java.util.Set<java.lang.String> strSet22 = node20.getDirectives();
        boolean boolean23 = node20.isDebugger();
        boolean boolean24 = node20.isHook();
        node20.addSuppression("Node tree inequality:\nTree1:\nNUMBER 1.0 54\n\n\nTree2:\nOR 100\n    OR 100\n\n\nSubtree1: NUMBER 1.0 54\n\n\nSubtree2: OR 100\n    OR 100\n");
        boolean boolean27 = node20.isThrow();
        int int29 = node20.getIntProp((int) (short) 0);
        boolean boolean30 = node20.isThrow();
        boolean boolean31 = node20.isInc();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(46, node4, node20);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node42 = node37.srcref(node41);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node51 = node46.srcref(node50);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean56 = node55.isBreak();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(4095, node37, node50, node55);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        node37.setDirectives((java.util.Set<java.lang.String>) strSet61);
        int int64 = node37.getCharno();
        java.lang.String str65 = node37.getQualifiedName();
        boolean boolean66 = node37.isBreak();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.InputId inputId69 = null;
        node68.setInputId(inputId69);
        boolean boolean71 = node68.isWith();
        boolean boolean72 = node68.isExprResult();
        boolean boolean73 = node37.isEquivalentToTyped(node68);
        node68.setLineno((int) (byte) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList77 = jSDocInfo76.getImplementedInterfaces();
        java.lang.String str78 = jSDocInfo76.getFileOverview();
        boolean boolean79 = jSDocInfo76.isExpose();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility80 = jSDocInfo76.getVisibility();
        java.lang.String str82 = jSDocInfo76.getDescriptionForParameter("NUMBER 1.0");
        java.lang.String str83 = jSDocInfo76.getOriginalCommentString();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList84 = jSDocInfo76.getImplementedInterfaces();
        boolean boolean85 = jSDocInfo76.hasThisType();
        java.util.Set<java.lang.String> strSet86 = jSDocInfo76.getParameterNames();
        jSDocInfo76.setLicense("NUMBER 1.0\n");
        node68.setJSDocInfo(jSDocInfo76);
        boolean boolean90 = node68.isSyntheticBlock();
        boolean boolean91 = node68.isContinue();
        node32.addChildToFront(node68);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(visibility80);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(jSTypeExpressionList84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test17549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17549");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean4 = node3.isBreak();
        node3.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node7 = node3.cloneTree();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node17 = node12.srcref(node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node26 = node21.srcref(node25);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean31 = node30.isBreak();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(4095, node12, node25, node30);
        boolean boolean33 = node25.isFunction();
        boolean boolean34 = node25.isInstanceOf();
        boolean boolean35 = node25.isHook();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = node41.srcref(node45);
        java.lang.String str47 = node41.toString();
        int int48 = node37.getIndexOfChild(node41);
        boolean boolean49 = node37.wasEmptyNode();
        node25.addChildrenToFront(node37);
        com.google.javascript.rhino.Node node51 = node3.srcref(node37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList53 = jSDocInfo52.getImplementedInterfaces();
        java.lang.String str54 = jSDocInfo52.getFileOverview();
        boolean boolean55 = jSDocInfo52.isExpose();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility56 = jSDocInfo52.getVisibility();
        java.util.Set<java.lang.String> strSet57 = jSDocInfo52.getModifies();
        boolean boolean58 = jSDocInfo52.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression59 = jSDocInfo52.getBaseType();
        java.lang.String str60 = jSDocInfo52.getReturnDescription();
        node3.setJSDocInfo(jSDocInfo52);
        boolean boolean62 = jSDocInfo52.isDefine();
        boolean boolean63 = jSDocInfo52.isDefine();
        java.lang.String str64 = jSDocInfo52.getBlockDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = jSDocInfo52.getThisType();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "NUMBER 1.0" + "'", str47, "NUMBER 1.0");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(jSTypeExpressionList53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(visibility56);
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(jSTypeExpression59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(jSTypeExpression65);
    }

    @Test
    public void test17550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17550");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean5 = node4.isGetterDef();
        boolean boolean6 = node4.isThis();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node16 = node11.srcref(node15);
        java.lang.String str17 = node11.toString();
        node11.removeProp((int) (short) 0);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean24 = node23.isBreak();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        node23.setJSType(jSType25);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) '#', node11, node23, 0, (int) (short) 0);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(100, 100, (int) '4');
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node33.children();
        node33.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node46 = node41.srcref(node45);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node55 = node50.srcref(node54);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        boolean boolean60 = node59.isBreak();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(4095, node41, node54, node59);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber(1.0d, (int) (short) -1, 0);
        com.google.javascript.rhino.Node node70 = node65.srcref(node69);
        java.lang.String str71 = node65.toString();
        node65.removeProp((int) (short) 0);
        boolean boolean74 = node65.isObjectLit();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("hi!", (int) 'a', 4);
        boolean boolean79 = node78.isGetterDef();
        com.google.javascript.rhino.Node node80 = node65.useSourceInfoFromForTree(node78);
        com.google.javascript.rhino.Node node81 = node61.copyInformationFromForTree(node65);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) (short) 100, node4, node29, node33, node61, (int) '4', (int) (byte) 100);
        com.google.javascript.rhino.Node node85 = node29.detachFromParent();
        node85.addSuppression("Not declared as a constructor");
        boolean boolean88 = node85.isVoid();
        boolean boolean89 = node85.isNull();
        boolean boolean90 = node85.isTrue();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "NUMBER 1.0" + "'", str17, "NUMBER 1.0");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeIterable34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "NUMBER 1.0" + "'", str71, "NUMBER 1.0");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test17551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17551");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(48, 16484, 19);
    }

    @Test
    public void test17552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17552");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        boolean boolean1 = sideEffectFlags0.areAllFlagsSet();
        sideEffectFlags0.setAllFlags();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}

