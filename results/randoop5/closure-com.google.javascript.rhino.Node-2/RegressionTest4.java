import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        boolean boolean4 = node3.isObjectLit();
        boolean boolean5 = node3.isFunction();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        boolean boolean14 = node9.isAssignAdd();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        node16.setSourceEncodedPosition(4095);
        boolean boolean19 = node16.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = node16.getStaticSourceFile();
        com.google.javascript.rhino.Node node21 = node9.copyInformationFromForTree(node16);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        boolean boolean24 = node23.isOnlyModifiesThisCall();
        boolean boolean25 = node23.isEmpty();
        boolean boolean26 = node23.isArrayLit();
        com.google.javascript.rhino.Node node27 = node9.useSourceInfoFrom(node23);
        boolean boolean28 = node27.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("");
        boolean boolean31 = node30.isOnlyModifiesThisCall();
        boolean boolean32 = node30.isEmpty();
        boolean boolean33 = node30.isArrayLit();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("");
        boolean boolean36 = node35.isOnlyModifiesThisCall();
        boolean boolean37 = node35.isEmpty();
        boolean boolean38 = node35.isReturn();
        boolean boolean39 = node35.isNE();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(4095, node27, node30, node35, (int) (byte) 10, 32);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        node44.setSourceEncodedPosition(4095);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(0, "STRING  0", 53, 100);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(36, node42, node44, node51);
        com.google.javascript.rhino.Node node53 = node3.copyInformationFromForTree(node44);
        boolean boolean54 = node3.isQuotedString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(staticSourceFile20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.rhino.Node[] nodeArray4 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) (byte) 10, nodeArray4, 12, 100);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(53, nodeArray4);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(43, nodeArray4, 15, 53);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(4095, nodeArray4);
        org.junit.Assert.assertNotNull(nodeArray4);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 2, 100, (int) 'a');
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isOnlyModifiesThisCall();
        int int3 = node1.getSourceOffset();
        boolean boolean4 = node1.isExprResult();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = node1.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING  is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        boolean boolean4 = node3.isBlock();
        boolean boolean5 = node3.isNE();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        node7.setSourceEncodedPosition(4095);
        boolean boolean10 = node7.isNot();
        com.google.javascript.rhino.Node node11 = node7.getLastSibling();
        node7.setVarArgs(true);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        node7.setJSType(jSType14);
        com.google.javascript.rhino.Node node16 = node3.copyInformationFrom(node7);
        boolean boolean17 = node3.isHook();
        com.google.javascript.rhino.Node node18 = node3.getFirstChild();
        boolean boolean19 = node3.isCatch();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        boolean boolean4 = node3.isObjectLit();
        boolean boolean5 = node3.isReturn();
        boolean boolean6 = node3.isSetterDef();
        java.lang.String str7 = node3.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "NUMBER 37.0 100" + "'", str7, "NUMBER 37.0 100");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(29, (int) '#', (int) (byte) 0);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("");
        node6.setSourceEncodedPosition(4095);
        boolean boolean9 = node6.isNot();
        boolean boolean10 = node6.isBreak();
        boolean boolean11 = node6.isIn();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("");
        node13.setSourceEncodedPosition(4095);
        boolean boolean16 = node13.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = node13.getStaticSourceFile();
        boolean boolean18 = node13.isAssignAdd();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("");
        node20.setSourceEncodedPosition(4095);
        boolean boolean23 = node20.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile24 = node20.getStaticSourceFile();
        com.google.javascript.rhino.Node node25 = node13.copyInformationFromForTree(node20);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("");
        boolean boolean28 = node27.isOnlyModifiesThisCall();
        boolean boolean29 = node27.isEmpty();
        boolean boolean30 = node27.isArrayLit();
        com.google.javascript.rhino.Node node31 = node13.useSourceInfoFrom(node27);
        boolean boolean32 = node13.isInc();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("");
        node35.setSourceEncodedPosition(4095);
        boolean boolean38 = node35.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile39 = node35.getStaticSourceFile();
        boolean boolean40 = node35.isAssignAdd();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("");
        node42.setSourceEncodedPosition(4095);
        boolean boolean45 = node42.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile46 = node42.getStaticSourceFile();
        com.google.javascript.rhino.Node node47 = node35.copyInformationFromForTree(node42);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("");
        boolean boolean50 = node49.isOnlyModifiesThisCall();
        boolean boolean51 = node49.isEmpty();
        boolean boolean52 = node49.isArrayLit();
        com.google.javascript.rhino.Node node53 = node35.useSourceInfoFrom(node49);
        com.google.javascript.rhino.Node[] nodeArray54 = new com.google.javascript.rhino.Node[] { node35 };
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(32, nodeArray54);
        int int57 = node55.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("");
        boolean boolean60 = node59.isOnlyModifiesThisCall();
        boolean boolean61 = node59.isEmpty();
        boolean boolean62 = node59.isReturn();
        boolean boolean63 = node59.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("");
        node65.setSourceEncodedPosition(4095);
        boolean boolean68 = node65.isNot();
        boolean boolean69 = node65.isBreak();
        boolean boolean70 = node65.isIn();
        com.google.javascript.rhino.Node node71 = node59.useSourceInfoIfMissingFromForTree(node65);
        com.google.javascript.rhino.Node node72 = node55.useSourceInfoFrom(node65);
        boolean boolean73 = node72.isLabelName();
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(29, node4, node6, node13, node72);
        boolean boolean75 = node4.isAnd();
        node4.setLength(4095);
        com.google.javascript.rhino.Node node78 = node4.getParent();
        int int79 = node4.getLength();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(staticSourceFile17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(staticSourceFile24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(staticSourceFile39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(staticSourceFile46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(nodeArray54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 4095 + "'", int79 == 4095);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isOnlyModifiesThisCall();
        boolean boolean3 = node1.isEmpty();
        boolean boolean4 = node1.isReturn();
        boolean boolean5 = node1.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        node7.setSourceEncodedPosition(4095);
        boolean boolean10 = node7.isNot();
        boolean boolean11 = node7.isBreak();
        boolean boolean12 = node7.isIn();
        com.google.javascript.rhino.Node node13 = node1.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node14 = node13.cloneNode();
        boolean boolean15 = node14.isDelProp();
        boolean boolean16 = node14.isThrow();
        boolean boolean17 = node14.isVar();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        node2.setSourceEncodedPosition(4095);
        boolean boolean5 = node2.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node2.getStaticSourceFile();
        boolean boolean7 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isEmpty();
        boolean boolean19 = node16.isArrayLit();
        com.google.javascript.rhino.Node node20 = node2.useSourceInfoFrom(node16);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] { node2 };
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(32, nodeArray21);
        int int24 = node22.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("");
        boolean boolean27 = node26.isOnlyModifiesThisCall();
        boolean boolean28 = node26.isEmpty();
        boolean boolean29 = node26.isReturn();
        boolean boolean30 = node26.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        node32.setSourceEncodedPosition(4095);
        boolean boolean35 = node32.isNot();
        boolean boolean36 = node32.isBreak();
        boolean boolean37 = node32.isIn();
        com.google.javascript.rhino.Node node38 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node39 = node22.useSourceInfoFrom(node32);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("");
        node41.setSourceEncodedPosition(4095);
        boolean boolean44 = node41.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = node41.getStaticSourceFile();
        boolean boolean46 = node41.isAssignAdd();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        node48.setSourceEncodedPosition(4095);
        boolean boolean51 = node48.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile52 = node48.getStaticSourceFile();
        com.google.javascript.rhino.Node node53 = node41.copyInformationFromForTree(node48);
        boolean boolean54 = node41.isWith();
        node32.addChildToFront(node41);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("");
        node57.setSourceEncodedPosition(4095);
        boolean boolean60 = node57.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile61 = node57.getStaticSourceFile();
        boolean boolean62 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("");
        node64.setSourceEncodedPosition(4095);
        boolean boolean67 = node64.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile68 = node64.getStaticSourceFile();
        com.google.javascript.rhino.Node node69 = node57.copyInformationFromForTree(node64);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("");
        boolean boolean72 = node71.isOnlyModifiesThisCall();
        boolean boolean73 = node71.isEmpty();
        boolean boolean74 = node71.isArrayLit();
        com.google.javascript.rhino.Node node75 = node57.useSourceInfoFrom(node71);
        boolean boolean76 = node71.hasChildren();
        com.google.javascript.rhino.Node node77 = node32.copyInformationFrom(node71);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString("");
        boolean boolean80 = node79.isOnlyModifiesThisCall();
        boolean boolean81 = node79.isEmpty();
        boolean boolean82 = node79.isArrayLit();
        boolean boolean83 = node79.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node84 = node71.srcref(node79);
        boolean boolean85 = node79.hasOneChild();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(staticSourceFile45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(staticSourceFile52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(staticSourceFile61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(staticSourceFile68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (byte) 100);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable2 = node1.getAncestors();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor3 = ancestorIterable2.iterator();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(ancestorIterable2);
        org.junit.Assert.assertNotNull(nodeItor3);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        boolean boolean6 = node1.isAssignAdd();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("");
        node8.setSourceEncodedPosition(4095);
        boolean boolean11 = node8.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = node8.getStaticSourceFile();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFromForTree(node8);
        boolean boolean14 = node1.isNE();
        boolean boolean15 = node1.isThrow();
        boolean boolean16 = node1.isNumber();
        boolean boolean17 = node1.wasEmptyNode();
        node1.putBooleanProp((int) '#', false);
        boolean boolean21 = node1.hasMoreThanOneChild();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(staticSourceFile12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.Node node5 = node1.getLastSibling();
        node1.setVarArgs(true);
        boolean boolean8 = node1.isFor();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("");
        node10.setSourceEncodedPosition(4095);
        node10.setString("STRING \n");
        node1.addChildToBack(node10);
        boolean boolean16 = node1.isVarArgs();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("");
        node19.setSourceEncodedPosition(4095);
        boolean boolean22 = node19.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = node19.getStaticSourceFile();
        boolean boolean24 = node19.isAssignAdd();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("");
        node26.setSourceEncodedPosition(4095);
        boolean boolean29 = node26.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = node26.getStaticSourceFile();
        com.google.javascript.rhino.Node node31 = node19.copyInformationFromForTree(node26);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("");
        boolean boolean34 = node33.isOnlyModifiesThisCall();
        boolean boolean35 = node33.isEmpty();
        boolean boolean36 = node33.isArrayLit();
        com.google.javascript.rhino.Node node37 = node19.useSourceInfoFrom(node33);
        boolean boolean38 = node37.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("");
        boolean boolean41 = node40.isOnlyModifiesThisCall();
        boolean boolean42 = node40.isEmpty();
        boolean boolean43 = node40.isArrayLit();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("");
        boolean boolean46 = node45.isOnlyModifiesThisCall();
        boolean boolean47 = node45.isEmpty();
        boolean boolean48 = node45.isReturn();
        boolean boolean49 = node45.isNE();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(4095, node37, node40, node45, (int) (byte) 10, 32);
        com.google.javascript.rhino.Node node53 = null;
        int int54 = node37.getIndexOfChild(node53);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("");
        boolean boolean57 = node56.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node58 = node37.clonePropsFrom(node56);
        int int59 = node56.getSideEffectFlags();
        com.google.javascript.rhino.Node node60 = node1.copyInformationFrom(node56);
        boolean boolean61 = node56.isBreak();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(staticSourceFile23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(staticSourceFile30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        boolean boolean6 = node1.isAssignAdd();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("");
        node8.setSourceEncodedPosition(4095);
        boolean boolean11 = node8.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = node8.getStaticSourceFile();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFromForTree(node8);
        boolean boolean14 = node1.isNE();
        boolean boolean15 = node1.isThrow();
        boolean boolean16 = node1.wasEmptyNode();
        boolean boolean17 = node1.isQualifiedName();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(staticSourceFile12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        node2.setSourceEncodedPosition(4095);
        boolean boolean5 = node2.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node2.getStaticSourceFile();
        boolean boolean7 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isEmpty();
        boolean boolean19 = node16.isArrayLit();
        com.google.javascript.rhino.Node node20 = node2.useSourceInfoFrom(node16);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] { node2 };
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(32, nodeArray21);
        int int24 = node22.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("");
        boolean boolean27 = node26.isOnlyModifiesThisCall();
        boolean boolean28 = node26.isEmpty();
        boolean boolean29 = node26.isReturn();
        boolean boolean30 = node26.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        node32.setSourceEncodedPosition(4095);
        boolean boolean35 = node32.isNot();
        boolean boolean36 = node32.isBreak();
        boolean boolean37 = node32.isIn();
        com.google.javascript.rhino.Node node38 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node39 = node22.useSourceInfoFrom(node32);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("");
        node41.setSourceEncodedPosition(4095);
        boolean boolean44 = node41.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = node41.getStaticSourceFile();
        boolean boolean46 = node41.isAssignAdd();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        node48.setSourceEncodedPosition(4095);
        boolean boolean51 = node48.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile52 = node48.getStaticSourceFile();
        com.google.javascript.rhino.Node node53 = node41.copyInformationFromForTree(node48);
        boolean boolean54 = node41.isWith();
        node32.addChildToFront(node41);
        com.google.javascript.rhino.Node node56 = node32.getLastSibling();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder57 = node32.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node58 = node32.removeFirstChild();
        com.google.javascript.rhino.Node node60 = node32.getAncestor(0);
        node32.detachChildren();
        int int62 = node32.getCharno();
        boolean boolean63 = node32.isVoid();
        boolean boolean64 = node32.isDelProp();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(staticSourceFile45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(staticSourceFile52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 4095 + "'", int62 == 4095);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setReturnsTainted();
        sideEffectFlags0.setMutatesGlobalState();
        sideEffectFlags0.setMutatesArguments();
        sideEffectFlags0.setMutatesThis();
        sideEffectFlags0.setMutatesGlobalState();
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        node2.setSourceEncodedPosition(4095);
        boolean boolean5 = node2.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node2.getStaticSourceFile();
        boolean boolean7 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node15 = node9.removeFirstChild();
        boolean boolean16 = node9.isAnd();
        boolean boolean17 = node9.isDec();
        int int18 = node9.getType();
        boolean boolean19 = node9.isInc();
        int int20 = node9.getCharno();
        int int21 = node9.getSourcePosition();
        boolean boolean22 = node9.isFunction();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(42, node9);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4095 + "'", int20 == 4095);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4095 + "'", int21 == 4095);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        node2.setSourceEncodedPosition(4095);
        boolean boolean5 = node2.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node2.getStaticSourceFile();
        boolean boolean7 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isEmpty();
        boolean boolean19 = node16.isArrayLit();
        com.google.javascript.rhino.Node node20 = node2.useSourceInfoFrom(node16);
        boolean boolean21 = node20.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        boolean boolean24 = node23.isOnlyModifiesThisCall();
        boolean boolean25 = node23.isEmpty();
        boolean boolean26 = node23.isArrayLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("");
        boolean boolean29 = node28.isOnlyModifiesThisCall();
        boolean boolean30 = node28.isEmpty();
        boolean boolean31 = node28.isReturn();
        boolean boolean32 = node28.isNE();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(4095, node20, node23, node28, (int) (byte) 10, 32);
        com.google.javascript.rhino.Node node36 = null;
        int int37 = node20.getIndexOfChild(node36);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        boolean boolean40 = node39.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node41 = node20.clonePropsFrom(node39);
        node39.setQuotedString();
        java.lang.String[] strArray45 = new java.lang.String[] { "STRING ", "Node tree inequality:\nTree1:\nSTRING \n\n\nTree2:\nTYPEOF 0\n    STRING \n\n\nSubtree1: STRING \n\n\nSubtree2: TYPEOF 0\n    STRING \n" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        node39.setDirectives((java.util.Set<java.lang.String>) strSet46);
        boolean boolean49 = node39.isCase();
        boolean boolean50 = node39.isRegExp();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        node2.setSourceEncodedPosition(4095);
        boolean boolean5 = node2.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node2.getStaticSourceFile();
        boolean boolean7 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isEmpty();
        boolean boolean19 = node16.isArrayLit();
        com.google.javascript.rhino.Node node20 = node2.useSourceInfoFrom(node16);
        boolean boolean21 = node20.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        boolean boolean24 = node23.isOnlyModifiesThisCall();
        boolean boolean25 = node23.isEmpty();
        boolean boolean26 = node23.isArrayLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("");
        boolean boolean29 = node28.isOnlyModifiesThisCall();
        boolean boolean30 = node28.isEmpty();
        boolean boolean31 = node28.isReturn();
        boolean boolean32 = node28.isNE();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(4095, node20, node23, node28, (int) (byte) 10, 32);
        com.google.javascript.rhino.Node node36 = null;
        int int37 = node20.getIndexOfChild(node36);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        boolean boolean40 = node39.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node41 = node20.clonePropsFrom(node39);
        boolean boolean42 = node39.isVar();
        com.google.javascript.rhino.Node node43 = node39.getLastSibling();
        int int44 = node43.getChildCount();
        boolean boolean45 = node43.isName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (short) 0, 32, 40);
        boolean boolean4 = node3.isOnlyModifiesThisCall();
        boolean boolean5 = node3.isIf();
        boolean boolean6 = node3.hasOneChild();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isOnlyModifiesThisCall();
        boolean boolean3 = node1.isEmpty();
        boolean boolean4 = node1.isReturn();
        boolean boolean5 = node1.isRegExp();
        java.lang.String str6 = node1.toStringTree();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node1.getAncestors();
        boolean boolean8 = node1.isGetterDef();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "STRING \n" + "'", str6, "STRING \n");
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        node2.setSourceEncodedPosition(4095);
        boolean boolean5 = node2.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node2.getStaticSourceFile();
        boolean boolean7 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isEmpty();
        boolean boolean19 = node16.isArrayLit();
        com.google.javascript.rhino.Node node20 = node2.useSourceInfoFrom(node16);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] { node2 };
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(32, nodeArray21);
        int int24 = node22.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("");
        boolean boolean27 = node26.isOnlyModifiesThisCall();
        boolean boolean28 = node26.isEmpty();
        boolean boolean29 = node26.isReturn();
        boolean boolean30 = node26.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        node32.setSourceEncodedPosition(4095);
        boolean boolean35 = node32.isNot();
        boolean boolean36 = node32.isBreak();
        boolean boolean37 = node32.isIn();
        com.google.javascript.rhino.Node node38 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node39 = node22.useSourceInfoFrom(node32);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("");
        node41.setSourceEncodedPosition(4095);
        boolean boolean44 = node41.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = node41.getStaticSourceFile();
        boolean boolean46 = node41.isAssignAdd();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        node48.setSourceEncodedPosition(4095);
        boolean boolean51 = node48.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile52 = node48.getStaticSourceFile();
        com.google.javascript.rhino.Node node53 = node41.copyInformationFromForTree(node48);
        boolean boolean54 = node41.isWith();
        node32.addChildToFront(node41);
        com.google.javascript.rhino.Node node56 = node32.getLastSibling();
        com.google.javascript.rhino.Node node57 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node58 = node32.useSourceInfoFrom(node57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(staticSourceFile45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(staticSourceFile52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 36, 16, (int) (byte) -1);
        boolean boolean4 = node3.isFromExterns();
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        boolean boolean5 = node1.isBreak();
        boolean boolean6 = node1.isTypeOf();
        int int7 = node1.getCharno();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("");
        node11.setSourceEncodedPosition(4095);
        boolean boolean14 = node11.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = node11.getStaticSourceFile();
        boolean boolean16 = node11.isAssignAdd();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("");
        node18.setSourceEncodedPosition(4095);
        boolean boolean21 = node18.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = node18.getStaticSourceFile();
        com.google.javascript.rhino.Node node23 = node11.copyInformationFromForTree(node18);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("");
        boolean boolean26 = node25.isOnlyModifiesThisCall();
        boolean boolean27 = node25.isEmpty();
        boolean boolean28 = node25.isArrayLit();
        com.google.javascript.rhino.Node node29 = node11.useSourceInfoFrom(node25);
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] { node11 };
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(32, nodeArray30);
        int int33 = node31.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("");
        boolean boolean36 = node35.isOnlyModifiesThisCall();
        boolean boolean37 = node35.isEmpty();
        boolean boolean38 = node35.isReturn();
        boolean boolean39 = node35.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("");
        node41.setSourceEncodedPosition(4095);
        boolean boolean44 = node41.isNot();
        boolean boolean45 = node41.isBreak();
        boolean boolean46 = node41.isIn();
        com.google.javascript.rhino.Node node47 = node35.useSourceInfoIfMissingFromForTree(node41);
        com.google.javascript.rhino.Node node48 = node31.useSourceInfoFrom(node41);
        boolean boolean49 = node41.isNE();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("");
        boolean boolean52 = node51.isOnlyModifiesThisCall();
        boolean boolean53 = node51.isEmpty();
        boolean boolean54 = node51.isReturn();
        boolean boolean55 = node51.isRegExp();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(52, node41, node51);
        boolean boolean57 = node51.isInstanceOf();
        boolean boolean58 = node1.isEquivalentTo(node51);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node1.siblings();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4095 + "'", int7 == 4095);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(staticSourceFile15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(staticSourceFile22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(nodeIterable59);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        boolean boolean6 = node1.isAssignAdd();
        int int7 = node1.getLineno();
        node1.setSourceFileForTesting("STRING ");
        boolean boolean10 = node1.isStringKey();
        java.lang.Object obj12 = node1.getProp((int) (short) 1);
        boolean boolean13 = node1.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        node1.setStaticSourceFile(staticSourceFile14);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        node2.setSourceEncodedPosition(4095);
        boolean boolean5 = node2.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node2.getStaticSourceFile();
        boolean boolean7 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isEmpty();
        boolean boolean19 = node16.isArrayLit();
        com.google.javascript.rhino.Node node20 = node2.useSourceInfoFrom(node16);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] { node2 };
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(32, nodeArray21);
        int int24 = node22.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("");
        boolean boolean27 = node26.isOnlyModifiesThisCall();
        boolean boolean28 = node26.isEmpty();
        boolean boolean29 = node26.isReturn();
        boolean boolean30 = node26.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        node32.setSourceEncodedPosition(4095);
        boolean boolean35 = node32.isNot();
        boolean boolean36 = node32.isBreak();
        boolean boolean37 = node32.isIn();
        com.google.javascript.rhino.Node node38 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node39 = node22.useSourceInfoFrom(node32);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("");
        node41.setSourceEncodedPosition(4095);
        boolean boolean44 = node41.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = node41.getStaticSourceFile();
        boolean boolean46 = node41.isAssignAdd();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        node48.setSourceEncodedPosition(4095);
        boolean boolean51 = node48.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile52 = node48.getStaticSourceFile();
        com.google.javascript.rhino.Node node53 = node41.copyInformationFromForTree(node48);
        boolean boolean54 = node41.isWith();
        node32.addChildToFront(node41);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("");
        node57.setSourceEncodedPosition(4095);
        boolean boolean60 = node57.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile61 = node57.getStaticSourceFile();
        boolean boolean62 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("");
        node64.setSourceEncodedPosition(4095);
        boolean boolean67 = node64.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile68 = node64.getStaticSourceFile();
        com.google.javascript.rhino.Node node69 = node57.copyInformationFromForTree(node64);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("");
        boolean boolean72 = node71.isOnlyModifiesThisCall();
        boolean boolean73 = node71.isEmpty();
        boolean boolean74 = node71.isArrayLit();
        com.google.javascript.rhino.Node node75 = node57.useSourceInfoFrom(node71);
        boolean boolean76 = node71.hasChildren();
        com.google.javascript.rhino.Node node77 = node32.copyInformationFrom(node71);
        boolean boolean78 = node32.isThis();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString(2, "", 38, 44);
        com.google.javascript.rhino.Node node84 = node32.srcrefTree(node83);
        boolean boolean85 = node84.isSwitch();
        com.google.javascript.rhino.JSDocInfo jSDocInfo86 = null;
        node84.setJSDocInfo(jSDocInfo86);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(staticSourceFile45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(staticSourceFile52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(staticSourceFile61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(staticSourceFile68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        node5.setSourceEncodedPosition(4095);
        boolean boolean8 = node5.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = node5.getStaticSourceFile();
        boolean boolean10 = node5.isAssignAdd();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("");
        node12.setSourceEncodedPosition(4095);
        boolean boolean15 = node12.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = node12.getStaticSourceFile();
        com.google.javascript.rhino.Node node17 = node5.copyInformationFromForTree(node12);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("");
        boolean boolean20 = node19.isOnlyModifiesThisCall();
        boolean boolean21 = node19.isEmpty();
        boolean boolean22 = node19.isArrayLit();
        com.google.javascript.rhino.Node node23 = node5.useSourceInfoFrom(node19);
        boolean boolean24 = node23.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("");
        boolean boolean27 = node26.isOnlyModifiesThisCall();
        boolean boolean28 = node26.isEmpty();
        boolean boolean29 = node26.isArrayLit();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("");
        boolean boolean32 = node31.isOnlyModifiesThisCall();
        boolean boolean33 = node31.isEmpty();
        boolean boolean34 = node31.isReturn();
        boolean boolean35 = node31.isNE();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(4095, node23, node26, node31, (int) (byte) 10, 32);
        com.google.javascript.rhino.Node node39 = node2.useSourceInfoIfMissingFrom(node38);
        boolean boolean40 = node39.isNull();
        boolean boolean41 = node39.isFromExterns();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("");
        node43.setSourceEncodedPosition(4095);
        boolean boolean46 = node43.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile47 = node43.getStaticSourceFile();
        boolean boolean48 = node43.isAssignAdd();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("");
        node50.setSourceEncodedPosition(4095);
        boolean boolean53 = node50.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile54 = node50.getStaticSourceFile();
        com.google.javascript.rhino.Node node55 = node43.copyInformationFromForTree(node50);
        com.google.javascript.rhino.Node node56 = node50.removeFirstChild();
        boolean boolean57 = node50.isAnd();
        boolean boolean58 = node50.isThis();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(0, node39, node50);
        boolean boolean60 = node39.isInc();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile61 = node39.getStaticSourceFile();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("");
        node63.setSourceEncodedPosition(4095);
        boolean boolean66 = node63.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile67 = node63.getStaticSourceFile();
        boolean boolean68 = node63.isAssignAdd();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        node70.setSourceEncodedPosition(4095);
        boolean boolean73 = node70.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile74 = node70.getStaticSourceFile();
        com.google.javascript.rhino.Node node75 = node63.copyInformationFromForTree(node70);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("");
        boolean boolean78 = node77.isOnlyModifiesThisCall();
        boolean boolean79 = node77.isEmpty();
        boolean boolean80 = node77.isArrayLit();
        com.google.javascript.rhino.Node node81 = node63.useSourceInfoFrom(node77);
        boolean boolean82 = node77.hasChildren();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable83 = node77.children();
        com.google.javascript.rhino.Node node85 = node77.getAncestor((int) (byte) 0);
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newNumber((double) 15, 12, 100);
        // The following exception was thrown during execution in test generation
        try {
            node39.replaceChildAfter(node77, node89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(staticSourceFile9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(staticSourceFile16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(staticSourceFile47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(staticSourceFile54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(staticSourceFile61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(staticSourceFile67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(staticSourceFile74);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(nodeIterable83);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(node89);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((-1), "NUMBER 8.0\n", 409700, 49);
        boolean boolean5 = node4.isHook();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        boolean boolean6 = node1.isAssignAdd();
        java.util.Set<java.lang.String> strSet7 = node1.getDirectives();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node10 = node1.copyInformationFrom(node9);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("");
        boolean boolean13 = node12.isOnlyModifiesThisCall();
        int int14 = node12.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node12.getChildAtIndex((int) (byte) 0);
        java.lang.String str17 = node10.checkTreeEquals(node12);
        boolean boolean18 = node12.isDo();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        node1.setVarArgs(false);
        boolean boolean8 = node1.isFromExterns();
        boolean boolean9 = node1.isNull();
        boolean boolean10 = node1.isFalse();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        boolean boolean15 = node14.isTypeOf();
        boolean boolean16 = node14.isInc();
        boolean boolean17 = node14.isSwitch();
        boolean boolean18 = node1.hasChild(node14);
        node14.setCharno(29);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        boolean boolean6 = node1.isAssignAdd();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("");
        node8.setSourceEncodedPosition(4095);
        boolean boolean11 = node8.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = node8.getStaticSourceFile();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFromForTree(node8);
        com.google.javascript.rhino.Node node14 = node8.removeFirstChild();
        boolean boolean15 = node8.isAnd();
        boolean boolean16 = node8.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("");
        boolean boolean19 = node18.isOnlyModifiesThisCall();
        boolean boolean20 = node18.isEmpty();
        boolean boolean21 = node18.isArrayLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        boolean boolean24 = node23.isOnlyModifiesThisCall();
        boolean boolean25 = node23.isSetterDef();
        com.google.javascript.rhino.Node node26 = node18.srcref(node23);
        node8.addChildToFront(node18);
        boolean boolean28 = node8.isVar();
        boolean boolean29 = node8.isIf();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        node32.setSourceEncodedPosition(4095);
        boolean boolean35 = node32.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = node32.getStaticSourceFile();
        boolean boolean37 = node32.isAssignAdd();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        node39.setSourceEncodedPosition(4095);
        boolean boolean42 = node39.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile43 = node39.getStaticSourceFile();
        com.google.javascript.rhino.Node node44 = node32.copyInformationFromForTree(node39);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("");
        boolean boolean47 = node46.isOnlyModifiesThisCall();
        boolean boolean48 = node46.isEmpty();
        boolean boolean49 = node46.isArrayLit();
        com.google.javascript.rhino.Node node50 = node32.useSourceInfoFrom(node46);
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] { node32 };
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(32, nodeArray51);
        int int54 = node52.getIntProp((int) (byte) 100);
        boolean boolean56 = node52.getBooleanProp(0);
        com.google.javascript.rhino.Node node57 = node8.useSourceInfoIfMissingFromForTree(node52);
        boolean boolean58 = node52.isOptionalArg();
        boolean boolean59 = node52.isAssignAdd();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("");
        boolean boolean62 = node61.isOnlyModifiesThisCall();
        boolean boolean63 = node61.isEmpty();
        boolean boolean64 = node61.isReturn();
        com.google.javascript.rhino.Node node65 = node61.getLastSibling();
        node61.setSourceEncodedPosition((int) (short) -1);
        com.google.javascript.rhino.Node node68 = node52.srcrefTree(node61);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(staticSourceFile12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(staticSourceFile36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(staticSourceFile43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) -1);
        com.google.javascript.rhino.Node node2 = node1.getLastSibling();
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(12, "STRING  0");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(36);
        boolean boolean5 = node4.isFromExterns();
        boolean boolean6 = node4.isComma();
        com.google.javascript.rhino.Node node7 = node2.useSourceInfoFromForTree(node4);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("");
        node10.setSourceEncodedPosition(4095);
        boolean boolean13 = node10.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = node10.getStaticSourceFile();
        boolean boolean15 = node10.isAssignAdd();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        node17.setSourceEncodedPosition(4095);
        boolean boolean20 = node17.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = node17.getStaticSourceFile();
        com.google.javascript.rhino.Node node22 = node10.copyInformationFromForTree(node17);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("");
        boolean boolean25 = node24.isOnlyModifiesThisCall();
        boolean boolean26 = node24.isEmpty();
        boolean boolean27 = node24.isArrayLit();
        com.google.javascript.rhino.Node node28 = node10.useSourceInfoFrom(node24);
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] { node10 };
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(32, nodeArray29);
        int int32 = node30.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("");
        boolean boolean35 = node34.isOnlyModifiesThisCall();
        boolean boolean36 = node34.isEmpty();
        boolean boolean37 = node34.isReturn();
        boolean boolean38 = node34.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("");
        node40.setSourceEncodedPosition(4095);
        boolean boolean43 = node40.isNot();
        boolean boolean44 = node40.isBreak();
        boolean boolean45 = node40.isIn();
        com.google.javascript.rhino.Node node46 = node34.useSourceInfoIfMissingFromForTree(node40);
        com.google.javascript.rhino.Node node47 = node30.useSourceInfoFrom(node40);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("");
        node49.setSourceEncodedPosition(4095);
        boolean boolean52 = node49.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile53 = node49.getStaticSourceFile();
        boolean boolean54 = node49.isAssignAdd();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("");
        node56.setSourceEncodedPosition(4095);
        boolean boolean59 = node56.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile60 = node56.getStaticSourceFile();
        com.google.javascript.rhino.Node node61 = node49.copyInformationFromForTree(node56);
        boolean boolean62 = node49.isWith();
        node40.addChildToFront(node49);
        com.google.javascript.rhino.Node node64 = node40.getLastSibling();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("");
        node66.setSourceEncodedPosition(4095);
        boolean boolean69 = node66.isNot();
        boolean boolean70 = node66.isBreak();
        boolean boolean71 = node66.isTypeOf();
        int int72 = node66.getCharno();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("");
        boolean boolean75 = node74.isOnlyModifiesThisCall();
        int int76 = node74.getSourceOffset();
        boolean boolean77 = node74.isExprResult();
        com.google.javascript.rhino.Node node78 = node66.srcref(node74);
        boolean boolean79 = node78.isNE();
        com.google.javascript.rhino.Node node80 = node64.srcrefTree(node78);
        com.google.javascript.rhino.Node node81 = node4.useSourceInfoIfMissingFrom(node80);
        boolean boolean82 = node4.isEmpty();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(staticSourceFile14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(staticSourceFile21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(staticSourceFile53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(staticSourceFile60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 4095 + "'", int72 == 4095);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        boolean boolean8 = node7.isOnlyModifiesThisCall();
        boolean boolean9 = node7.isEmpty();
        node1.putProp((int) '4', (java.lang.Object) node7);
        boolean boolean11 = node7.isDebugger();
        boolean boolean12 = node7.isName();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("STRING  0");
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(100, node16, 54, 35);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        boolean boolean24 = node23.isTypeOf();
        boolean boolean25 = node23.isInc();
        com.google.javascript.rhino.Node node26 = node23.cloneTree();
        com.google.javascript.rhino.Node node27 = node16.copyInformationFrom(node26);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        node32.setSourceEncodedPosition(4095);
        boolean boolean35 = node32.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = node32.getStaticSourceFile();
        boolean boolean37 = node32.isAssignAdd();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        node39.setSourceEncodedPosition(4095);
        boolean boolean42 = node39.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile43 = node39.getStaticSourceFile();
        com.google.javascript.rhino.Node node44 = node32.copyInformationFromForTree(node39);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("");
        boolean boolean47 = node46.isOnlyModifiesThisCall();
        boolean boolean48 = node46.isEmpty();
        boolean boolean49 = node46.isArrayLit();
        com.google.javascript.rhino.Node node50 = node32.useSourceInfoFrom(node46);
        boolean boolean51 = node50.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("");
        boolean boolean54 = node53.isOnlyModifiesThisCall();
        boolean boolean55 = node53.isEmpty();
        boolean boolean56 = node53.isArrayLit();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("");
        boolean boolean59 = node58.isOnlyModifiesThisCall();
        boolean boolean60 = node58.isEmpty();
        boolean boolean61 = node58.isReturn();
        boolean boolean62 = node58.isNE();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(4095, node50, node53, node58, (int) (byte) 10, 32);
        com.google.javascript.rhino.Node node66 = node29.useSourceInfoIfMissingFrom(node65);
        boolean boolean67 = node66.isNull();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("");
        boolean boolean70 = node69.isOnlyModifiesThisCall();
        boolean boolean71 = node69.isEmpty();
        boolean boolean72 = node69.isReturn();
        boolean boolean73 = node69.isSyntheticBlock();
        com.google.javascript.rhino.jstype.JSType jSType74 = node69.getJSType();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("");
        node76.setSourceEncodedPosition(4095);
        boolean boolean79 = node76.isNot();
        boolean boolean80 = node76.isBreak();
        boolean boolean81 = node76.isTypeOf();
        boolean boolean82 = node76.isInc();
        boolean boolean83 = node76.isWhile();
        node76.setSourceEncodedPosition((-1));
        boolean boolean86 = node69.hasChild(node76);
        com.google.javascript.rhino.Node node87 = node66.copyInformationFrom(node76);
        com.google.javascript.rhino.Node node88 = node26.srcrefTree(node66);
        node7.putProp(49, (java.lang.Object) node66);
        boolean boolean90 = node7.isFunction();
        boolean boolean91 = node7.isWith();
        node7.setSourceEncodedPositionForTree(53);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(staticSourceFile36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(staticSourceFile43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isOnlyModifiesThisCall();
        boolean boolean3 = node1.isEmpty();
        boolean boolean4 = node1.isReturn();
        boolean boolean5 = node1.hasMoreThanOneChild();
        boolean boolean6 = node1.isFromExterns();
        boolean boolean7 = node1.isNot();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        node1.setVarArgs(false);
        boolean boolean8 = node1.isFromExterns();
        boolean boolean9 = node1.isNull();
        boolean boolean10 = node1.isFalse();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("");
        node12.setSourceEncodedPosition(4095);
        boolean boolean15 = node12.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = node12.getStaticSourceFile();
        boolean boolean17 = node12.isAssignAdd();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("");
        node19.setSourceEncodedPosition(4095);
        boolean boolean22 = node19.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = node19.getStaticSourceFile();
        com.google.javascript.rhino.Node node24 = node12.copyInformationFromForTree(node19);
        com.google.javascript.rhino.Node node25 = node19.removeFirstChild();
        com.google.javascript.rhino.Node node26 = node1.useSourceInfoIfMissingFrom(node19);
        com.google.javascript.rhino.Node node27 = node26.cloneNode();
        int int28 = node27.getLength();
        java.lang.String str29 = node27.toStringTree();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(staticSourceFile16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(staticSourceFile23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "STRING  0\n" + "'", str29, "STRING  0\n");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) -1);
        boolean boolean2 = node1.isArrayLit();
        boolean boolean3 = node1.isNumber();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        boolean boolean1 = sideEffectFlags0.areAllFlagsSet();
        sideEffectFlags0.setMutatesThis();
        sideEffectFlags0.setMutatesGlobalState();
        sideEffectFlags0.setMutatesGlobalState();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.Node node5 = node1.getLastSibling();
        boolean boolean6 = node1.isNE();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isOnlyModifiesThisCall();
        boolean boolean3 = node1.isWhile();
        com.google.javascript.rhino.Node node4 = node1.getNext();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node6 = node1.cloneNode();
        boolean boolean7 = node6.isObjectLit();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(409700, 36, 54);
        boolean boolean4 = node3.isNumber();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        boolean boolean6 = node1.isAssignAdd();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("");
        node8.setSourceEncodedPosition(4095);
        boolean boolean11 = node8.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = node8.getStaticSourceFile();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFromForTree(node8);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("");
        boolean boolean16 = node15.isOnlyModifiesThisCall();
        boolean boolean17 = node15.isEmpty();
        boolean boolean18 = node15.isArrayLit();
        com.google.javascript.rhino.Node node19 = node1.useSourceInfoFrom(node15);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder20 = node1.new FileLevelJsDocBuilder();
        boolean boolean21 = node1.isDefaultCase();
        boolean boolean22 = node1.isFalse();
        int int23 = node1.getChildCount();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(staticSourceFile12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        boolean boolean5 = node1.isBreak();
        boolean boolean6 = node1.isTypeOf();
        int int7 = node1.getCharno();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        boolean boolean10 = node9.isOnlyModifiesThisCall();
        int int11 = node9.getSourceOffset();
        boolean boolean12 = node9.isExprResult();
        com.google.javascript.rhino.Node node13 = node1.srcref(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("");
        node15.setSourceEncodedPosition(4095);
        boolean boolean18 = node15.isCall();
        boolean boolean19 = node1.isEquivalentTo(node15);
        node1.setIsSyntheticBlock(true);
        node1.setVarArgs(false);
        node1.setCharno(0);
        boolean boolean26 = node1.isSetterDef();
        boolean boolean27 = node1.isFunction();
        boolean boolean28 = node1.isSetterDef();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4095 + "'", int7 == 4095);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        node2.setSourceEncodedPosition(4095);
        boolean boolean5 = node2.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node2.getStaticSourceFile();
        boolean boolean7 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isEmpty();
        boolean boolean19 = node16.isArrayLit();
        com.google.javascript.rhino.Node node20 = node2.useSourceInfoFrom(node16);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] { node2 };
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(32, nodeArray21);
        int int24 = node22.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("");
        boolean boolean27 = node26.isOnlyModifiesThisCall();
        boolean boolean28 = node26.isEmpty();
        boolean boolean29 = node26.isReturn();
        boolean boolean30 = node26.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        node32.setSourceEncodedPosition(4095);
        boolean boolean35 = node32.isNot();
        boolean boolean36 = node32.isBreak();
        boolean boolean37 = node32.isIn();
        com.google.javascript.rhino.Node node38 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node39 = node22.useSourceInfoFrom(node32);
        boolean boolean40 = node32.isLocalResultCall();
        int int41 = node32.getSideEffectFlags();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        node2.setSourceEncodedPosition(4095);
        boolean boolean5 = node2.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node2.getStaticSourceFile();
        boolean boolean7 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isEmpty();
        boolean boolean19 = node16.isArrayLit();
        com.google.javascript.rhino.Node node20 = node2.useSourceInfoFrom(node16);
        boolean boolean21 = node20.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        boolean boolean24 = node23.isOnlyModifiesThisCall();
        boolean boolean25 = node23.isEmpty();
        boolean boolean26 = node23.isArrayLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("");
        boolean boolean29 = node28.isOnlyModifiesThisCall();
        boolean boolean30 = node28.isEmpty();
        boolean boolean31 = node28.isReturn();
        boolean boolean32 = node28.isNE();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(4095, node20, node23, node28, (int) (byte) 10, 32);
        boolean boolean36 = node28.isOptionalArg();
        node28.setCharno(0);
        boolean boolean39 = node28.hasChildren();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("");
        node42.setSourceEncodedPosition(4095);
        com.google.javascript.rhino.Node node45 = node42.getLastSibling();
        boolean boolean46 = node42.isExprResult();
        node28.putProp(8, (java.lang.Object) node42);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder48 = node42.getJsDocBuilderForNode();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder48);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        boolean boolean5 = node4.isBlock();
        boolean boolean6 = node4.isNE();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(40992, node4);
        boolean boolean8 = node7.isCall();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(10, 42, (int) (byte) 1);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        boolean boolean6 = node5.isOnlyModifiesThisCall();
        boolean boolean7 = node5.isEmpty();
        boolean boolean8 = node5.isArrayLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("");
        boolean boolean11 = node10.isOnlyModifiesThisCall();
        boolean boolean12 = node10.isSetterDef();
        com.google.javascript.rhino.Node node13 = node5.srcref(node10);
        com.google.javascript.rhino.Node node14 = node13.getLastSibling();
        boolean boolean15 = node14.isSetterDef();
        com.google.javascript.rhino.Node node16 = node3.clonePropsFrom(node14);
        boolean boolean17 = node14.isDo();
        boolean boolean18 = node14.isContinue();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        boolean boolean1 = sideEffectFlags0.areAllFlagsSet();
        sideEffectFlags0.setMutatesThis();
        sideEffectFlags0.setAllFlags();
        sideEffectFlags0.setThrows();
        sideEffectFlags0.setReturnsTainted();
        sideEffectFlags0.clearAllFlags();
        sideEffectFlags0.setMutatesArguments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        boolean boolean5 = node1.isBreak();
        boolean boolean6 = node1.isTypeOf();
        int int7 = node1.getCharno();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        boolean boolean10 = node9.isOnlyModifiesThisCall();
        int int11 = node9.getSourceOffset();
        boolean boolean12 = node9.isExprResult();
        com.google.javascript.rhino.Node node13 = node1.srcref(node9);
        boolean boolean14 = node1.isAssign();
        int int15 = node1.getType();
        boolean boolean16 = node1.isReturn();
        node1.setCharno(45);
        boolean boolean19 = node1.isTry();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4095 + "'", int7 == 4095);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        boolean boolean5 = node1.isBreak();
        boolean boolean6 = node1.isTypeOf();
        int int7 = node1.getCharno();
        boolean boolean9 = node1.getBooleanProp(45);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("");
        node11.setSourceEncodedPosition(4095);
        boolean boolean14 = node11.isNot();
        boolean boolean15 = node11.isBreak();
        boolean boolean16 = node11.isTypeOf();
        node11.setVarArgs(false);
        boolean boolean19 = node1.hasChild(node11);
        boolean boolean20 = node11.isLocalResultCall();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4095 + "'", int7 == 4095);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) 'a', "STRING NUMBER 8.0\n", 50, (int) (short) -1);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        boolean boolean5 = node1.isBreak();
        boolean boolean6 = node1.isTypeOf();
        int int7 = node1.getCharno();
        node1.putBooleanProp((int) (byte) 10, false);
        boolean boolean11 = node1.isCall();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("");
        node14.setSourceEncodedPosition(4095);
        boolean boolean17 = node14.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile18 = node14.getStaticSourceFile();
        boolean boolean19 = node14.isAssignAdd();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        node21.setSourceEncodedPosition(4095);
        boolean boolean24 = node21.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile25 = node21.getStaticSourceFile();
        com.google.javascript.rhino.Node node26 = node14.copyInformationFromForTree(node21);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("");
        boolean boolean29 = node28.isOnlyModifiesThisCall();
        boolean boolean30 = node28.isEmpty();
        boolean boolean31 = node28.isArrayLit();
        com.google.javascript.rhino.Node node32 = node14.useSourceInfoFrom(node28);
        boolean boolean33 = node32.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("");
        boolean boolean36 = node35.isOnlyModifiesThisCall();
        boolean boolean37 = node35.isEmpty();
        boolean boolean38 = node35.isArrayLit();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("");
        boolean boolean41 = node40.isOnlyModifiesThisCall();
        boolean boolean42 = node40.isEmpty();
        boolean boolean43 = node40.isReturn();
        boolean boolean44 = node40.isNE();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(4095, node32, node35, node40, (int) (byte) 10, 32);
        com.google.javascript.rhino.Node node48 = null;
        int int49 = node32.getIndexOfChild(node48);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("");
        boolean boolean52 = node51.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node53 = node32.clonePropsFrom(node51);
        node51.setQuotedString();
        java.lang.String[] strArray57 = new java.lang.String[] { "STRING ", "Node tree inequality:\nTree1:\nSTRING \n\n\nTree2:\nTYPEOF 0\n    STRING \n\n\nSubtree1: STRING \n\n\nSubtree2: TYPEOF 0\n    STRING \n" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        node51.setDirectives((java.util.Set<java.lang.String>) strSet58);
        node1.setDirectives((java.util.Set<java.lang.String>) strSet58);
        boolean boolean62 = node1.isQualifiedName();
        boolean boolean63 = node1.wasEmptyNode();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4095 + "'", int7 == 4095);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(staticSourceFile18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(staticSourceFile25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        node2.setSourceEncodedPosition(4095);
        boolean boolean5 = node2.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node2.getStaticSourceFile();
        boolean boolean7 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isEmpty();
        boolean boolean19 = node16.isArrayLit();
        com.google.javascript.rhino.Node node20 = node2.useSourceInfoFrom(node16);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] { node2 };
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(32, nodeArray21);
        int int24 = node22.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("");
        boolean boolean27 = node26.isOnlyModifiesThisCall();
        boolean boolean28 = node26.isEmpty();
        boolean boolean29 = node26.isReturn();
        boolean boolean30 = node26.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        node32.setSourceEncodedPosition(4095);
        boolean boolean35 = node32.isNot();
        boolean boolean36 = node32.isBreak();
        boolean boolean37 = node32.isIn();
        com.google.javascript.rhino.Node node38 = node26.useSourceInfoIfMissingFromForTree(node32);
        com.google.javascript.rhino.Node node39 = node22.useSourceInfoFrom(node32);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("");
        node41.setSourceEncodedPosition(4095);
        boolean boolean44 = node41.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = node41.getStaticSourceFile();
        boolean boolean46 = node41.isAssignAdd();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        node48.setSourceEncodedPosition(4095);
        boolean boolean51 = node48.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile52 = node48.getStaticSourceFile();
        com.google.javascript.rhino.Node node53 = node41.copyInformationFromForTree(node48);
        boolean boolean54 = node41.isWith();
        node32.addChildToFront(node41);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("");
        node57.setSourceEncodedPosition(4095);
        boolean boolean60 = node57.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile61 = node57.getStaticSourceFile();
        boolean boolean62 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("");
        node64.setSourceEncodedPosition(4095);
        boolean boolean67 = node64.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile68 = node64.getStaticSourceFile();
        com.google.javascript.rhino.Node node69 = node57.copyInformationFromForTree(node64);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("");
        boolean boolean72 = node71.isOnlyModifiesThisCall();
        boolean boolean73 = node71.isEmpty();
        boolean boolean74 = node71.isArrayLit();
        com.google.javascript.rhino.Node node75 = node57.useSourceInfoFrom(node71);
        boolean boolean76 = node71.hasChildren();
        com.google.javascript.rhino.Node node77 = node32.copyInformationFrom(node71);
        boolean boolean78 = node32.isGetterDef();
        java.lang.String str79 = node32.getSourceFileName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(staticSourceFile45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(staticSourceFile52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(staticSourceFile61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(staticSourceFile68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNew();
        node1.setIsSyntheticBlock(true);
        boolean boolean7 = node1.isBreak();
        boolean boolean8 = node1.isDo();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        boolean boolean6 = node1.isAssignAdd();
        com.google.javascript.rhino.Node node7 = node1.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = node7.isWhile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        boolean boolean5 = node1.isBreak();
        boolean boolean6 = node1.isTypeOf();
        boolean boolean7 = node1.isDec();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        boolean boolean14 = node9.isAssignAdd();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        node16.setSourceEncodedPosition(4095);
        boolean boolean19 = node16.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = node16.getStaticSourceFile();
        com.google.javascript.rhino.Node node21 = node9.copyInformationFromForTree(node16);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        boolean boolean24 = node23.isOnlyModifiesThisCall();
        boolean boolean25 = node23.isEmpty();
        boolean boolean26 = node23.isArrayLit();
        com.google.javascript.rhino.Node node27 = node9.useSourceInfoFrom(node23);
        boolean boolean28 = node27.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node29 = node1.useSourceInfoFromForTree(node27);
        boolean boolean30 = node29.isStringKey();
        boolean boolean31 = node29.isOptionalArg();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("");
        node36.setSourceEncodedPosition(4095);
        boolean boolean39 = node36.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile40 = node36.getStaticSourceFile();
        boolean boolean41 = node36.isAssignAdd();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("");
        node43.setSourceEncodedPosition(4095);
        boolean boolean46 = node43.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile47 = node43.getStaticSourceFile();
        com.google.javascript.rhino.Node node48 = node36.copyInformationFromForTree(node43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("");
        boolean boolean51 = node50.isOnlyModifiesThisCall();
        boolean boolean52 = node50.isEmpty();
        boolean boolean53 = node50.isArrayLit();
        com.google.javascript.rhino.Node node54 = node36.useSourceInfoFrom(node50);
        boolean boolean55 = node54.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("");
        boolean boolean58 = node57.isOnlyModifiesThisCall();
        boolean boolean59 = node57.isEmpty();
        boolean boolean60 = node57.isArrayLit();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("");
        boolean boolean63 = node62.isOnlyModifiesThisCall();
        boolean boolean64 = node62.isEmpty();
        boolean boolean65 = node62.isReturn();
        boolean boolean66 = node62.isNE();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(4095, node54, node57, node62, (int) (byte) 10, 32);
        com.google.javascript.rhino.Node node70 = node33.useSourceInfoIfMissingFrom(node69);
        boolean boolean71 = node70.isNull();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("");
        boolean boolean74 = node73.isOnlyModifiesThisCall();
        boolean boolean75 = node73.isEmpty();
        boolean boolean76 = node73.isReturn();
        boolean boolean77 = node73.isSyntheticBlock();
        com.google.javascript.rhino.jstype.JSType jSType78 = node73.getJSType();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString("");
        node80.setSourceEncodedPosition(4095);
        boolean boolean83 = node80.isNot();
        boolean boolean84 = node80.isBreak();
        boolean boolean85 = node80.isTypeOf();
        boolean boolean86 = node80.isInc();
        boolean boolean87 = node80.isWhile();
        node80.setSourceEncodedPosition((-1));
        boolean boolean90 = node73.hasChild(node80);
        com.google.javascript.rhino.Node node91 = node70.copyInformationFrom(node80);
        com.google.javascript.rhino.Node node92 = node29.useSourceInfoFromForTree(node80);
        boolean boolean93 = node29.hasChildren();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(staticSourceFile20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(staticSourceFile40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(staticSourceFile47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(jSType78);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        node2.setSourceEncodedPosition(4095);
        boolean boolean5 = node2.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node2.getStaticSourceFile();
        boolean boolean7 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isEmpty();
        boolean boolean19 = node16.isArrayLit();
        com.google.javascript.rhino.Node node20 = node2.useSourceInfoFrom(node16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node2.new FileLevelJsDocBuilder();
        boolean boolean22 = node2.isDefaultCase();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 0, node2, (int) ' ', 53);
        boolean boolean26 = node2.isQuotedString();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("");
        node28.setSourceEncodedPosition(4095);
        com.google.javascript.rhino.Node node31 = node28.getLastSibling();
        node28.setSourceFileForTesting("");
        node2.addChildrenToFront(node28);
        int int35 = node28.getLength();
        boolean boolean36 = node28.isComma();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        node2.setSourceEncodedPosition(4095);
        boolean boolean5 = node2.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node2.getStaticSourceFile();
        boolean boolean7 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isEmpty();
        boolean boolean19 = node16.isArrayLit();
        com.google.javascript.rhino.Node node20 = node2.useSourceInfoFrom(node16);
        boolean boolean21 = node20.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        boolean boolean24 = node23.isOnlyModifiesThisCall();
        boolean boolean25 = node23.isEmpty();
        boolean boolean26 = node23.isArrayLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("");
        boolean boolean29 = node28.isOnlyModifiesThisCall();
        boolean boolean30 = node28.isEmpty();
        boolean boolean31 = node28.isReturn();
        boolean boolean32 = node28.isNE();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(4095, node20, node23, node28, (int) (byte) 10, 32);
        com.google.javascript.rhino.Node node36 = null;
        int int37 = node20.getIndexOfChild(node36);
        boolean boolean38 = node20.isTypeOf();
        boolean boolean39 = node20.isDec();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("");
        node3.setSourceEncodedPosition(4095);
        boolean boolean6 = node3.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = node3.getStaticSourceFile();
        boolean boolean8 = node3.isAssignAdd();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("");
        node10.setSourceEncodedPosition(4095);
        boolean boolean13 = node10.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = node10.getStaticSourceFile();
        com.google.javascript.rhino.Node node15 = node3.copyInformationFromForTree(node10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        boolean boolean18 = node17.isOnlyModifiesThisCall();
        boolean boolean19 = node17.isEmpty();
        boolean boolean20 = node17.isArrayLit();
        com.google.javascript.rhino.Node node21 = node3.useSourceInfoFrom(node17);
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] { node3 };
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(32, nodeArray22);
        int int25 = node23.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("");
        boolean boolean28 = node27.isOnlyModifiesThisCall();
        boolean boolean29 = node27.isEmpty();
        boolean boolean30 = node27.isReturn();
        boolean boolean31 = node27.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("");
        node33.setSourceEncodedPosition(4095);
        boolean boolean36 = node33.isNot();
        boolean boolean37 = node33.isBreak();
        boolean boolean38 = node33.isIn();
        com.google.javascript.rhino.Node node39 = node27.useSourceInfoIfMissingFromForTree(node33);
        com.google.javascript.rhino.Node node40 = node23.useSourceInfoFrom(node33);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("");
        node42.setSourceEncodedPosition(4095);
        boolean boolean45 = node42.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile46 = node42.getStaticSourceFile();
        boolean boolean47 = node42.isAssignAdd();
        java.util.Set<java.lang.String> strSet48 = node42.getDirectives();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("");
        node50.setSourceEncodedPosition(4095);
        boolean boolean53 = node50.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile54 = node50.getStaticSourceFile();
        node50.setVarArgs(false);
        boolean boolean57 = node50.isFromExterns();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("");
        node59.setSourceEncodedPosition(4095);
        boolean boolean62 = node59.isNot();
        com.google.javascript.rhino.Node node63 = node59.getLastSibling();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(37, node23, node42, node50, node63);
        int int65 = node23.getSideEffectFlags();
        boolean boolean66 = node23.isFromExterns();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("");
        boolean boolean69 = node68.isOnlyModifiesThisCall();
        boolean boolean70 = node68.isEmpty();
        com.google.javascript.rhino.Node node71 = node68.removeFirstChild();
        com.google.javascript.rhino.Node node72 = node23.useSourceInfoFrom(node68);
        boolean boolean73 = node23.isEmpty();
        boolean boolean74 = node23.isQualifiedName();
        boolean boolean75 = node23.isVoid();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(staticSourceFile7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(staticSourceFile14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(staticSourceFile46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(strSet48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(staticSourceFile54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        boolean boolean4 = node3.isTypeOf();
        boolean boolean5 = node3.isInc();
        com.google.javascript.rhino.Node node6 = node3.cloneTree();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node6.new FileLevelJsDocBuilder();
        int int8 = node6.getSourceOffset();
        boolean boolean9 = node6.isIf();
        boolean boolean10 = node6.isName();
        boolean boolean11 = node6.isReturn();
        boolean boolean12 = node6.isVarArgs();
        boolean boolean13 = node6.isOnlyModifiesThisCall();
        boolean boolean14 = node6.isInc();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(41);
        boolean boolean2 = node1.isTypeOf();
        java.lang.String str3 = node1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NULL" + "'", str3, "NULL");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        boolean boolean3 = node2.isOnlyModifiesThisCall();
        boolean boolean4 = node2.isEmpty();
        boolean boolean5 = node2.isReturn();
        boolean boolean6 = node2.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("");
        node8.setSourceEncodedPosition(4095);
        boolean boolean11 = node8.isNot();
        boolean boolean12 = node8.isBreak();
        boolean boolean13 = node8.isIn();
        com.google.javascript.rhino.Node node14 = node2.useSourceInfoIfMissingFromForTree(node8);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        node16.setSourceEncodedPosition(4095);
        boolean boolean19 = node16.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = node16.getStaticSourceFile();
        boolean boolean21 = node16.isAssignAdd();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        node23.setSourceEncodedPosition(4095);
        boolean boolean26 = node23.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = node23.getStaticSourceFile();
        com.google.javascript.rhino.Node node28 = node16.copyInformationFromForTree(node23);
        boolean boolean29 = node16.isNE();
        boolean boolean30 = node16.isThrow();
        boolean boolean31 = node16.isFor();
        com.google.javascript.rhino.Node node32 = node8.useSourceInfoFrom(node16);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("");
        node36.setSourceEncodedPosition(4095);
        boolean boolean39 = node36.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile40 = node36.getStaticSourceFile();
        boolean boolean41 = node36.isAssignAdd();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("");
        node43.setSourceEncodedPosition(4095);
        boolean boolean46 = node43.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile47 = node43.getStaticSourceFile();
        com.google.javascript.rhino.Node node48 = node36.copyInformationFromForTree(node43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("");
        boolean boolean51 = node50.isOnlyModifiesThisCall();
        boolean boolean52 = node50.isEmpty();
        boolean boolean53 = node50.isArrayLit();
        com.google.javascript.rhino.Node node54 = node36.useSourceInfoFrom(node50);
        com.google.javascript.rhino.Node[] nodeArray55 = new com.google.javascript.rhino.Node[] { node36 };
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, nodeArray55);
        int int58 = node56.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("");
        boolean boolean61 = node60.isOnlyModifiesThisCall();
        boolean boolean62 = node60.isEmpty();
        boolean boolean63 = node60.isReturn();
        boolean boolean64 = node60.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("");
        node66.setSourceEncodedPosition(4095);
        boolean boolean69 = node66.isNot();
        boolean boolean70 = node66.isBreak();
        boolean boolean71 = node66.isIn();
        com.google.javascript.rhino.Node node72 = node60.useSourceInfoIfMissingFromForTree(node66);
        com.google.javascript.rhino.Node node73 = node56.useSourceInfoFrom(node66);
        boolean boolean74 = node66.isNE();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("");
        boolean boolean77 = node76.isOnlyModifiesThisCall();
        boolean boolean78 = node76.isEmpty();
        boolean boolean79 = node76.isReturn();
        boolean boolean80 = node76.isRegExp();
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node(52, node66, node76);
        com.google.javascript.rhino.Node node82 = node32.useSourceInfoIfMissingFrom(node66);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(29, node82, (int) (short) 100, 37);
        node82.removeProp((int) (short) -1);
        boolean boolean88 = node82.isOnlyModifiesThisCall();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(staticSourceFile20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(staticSourceFile40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(staticSourceFile47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeArray55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        boolean boolean6 = node1.isAssignAdd();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("");
        node8.setSourceEncodedPosition(4095);
        boolean boolean11 = node8.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = node8.getStaticSourceFile();
        com.google.javascript.rhino.Node node13 = node1.copyInformationFromForTree(node8);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("");
        boolean boolean16 = node15.isOnlyModifiesThisCall();
        boolean boolean17 = node15.isEmpty();
        boolean boolean18 = node15.isArrayLit();
        com.google.javascript.rhino.Node node19 = node1.useSourceInfoFrom(node15);
        boolean boolean20 = node15.hasChildren();
        boolean boolean21 = node15.isAssignAdd();
        int int22 = node15.getChildCount();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(staticSourceFile12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        node2.setSourceEncodedPosition(4095);
        boolean boolean5 = node2.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = node2.getStaticSourceFile();
        boolean boolean7 = node2.isAssignAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        node9.setSourceEncodedPosition(4095);
        boolean boolean12 = node9.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isEmpty();
        boolean boolean19 = node16.isArrayLit();
        com.google.javascript.rhino.Node node20 = node2.useSourceInfoFrom(node16);
        boolean boolean21 = node20.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        boolean boolean24 = node23.isOnlyModifiesThisCall();
        boolean boolean25 = node23.isEmpty();
        boolean boolean26 = node23.isArrayLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("");
        boolean boolean29 = node28.isOnlyModifiesThisCall();
        boolean boolean30 = node28.isEmpty();
        boolean boolean31 = node28.isReturn();
        boolean boolean32 = node28.isNE();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(4095, node20, node23, node28, (int) (byte) 10, 32);
        node28.setSourceEncodedPositionForTree(43);
        boolean boolean38 = node28.isFromExterns();
        com.google.javascript.rhino.jstype.JSType jSType39 = node28.getJSType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(jSType39);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("NUMBER 8.0\n");
        boolean boolean2 = node1.isCall();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        boolean boolean6 = node5.isOnlyModifiesThisCall();
        boolean boolean7 = node5.isEmpty();
        boolean boolean8 = node5.isReturn();
        boolean boolean9 = node5.isRegExp();
        com.google.javascript.rhino.Node node10 = node5.getLastSibling();
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) 10, nodeArray14, 12, 100);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(53, nodeArray14);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) '#', nodeArray14, (int) 'a', (int) (byte) 0);
        java.lang.String str22 = node21.getQualifiedName();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) '#', node10, node21, 8, 46);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("");
        boolean boolean28 = node27.isOnlyModifiesThisCall();
        boolean boolean29 = node27.isEmpty();
        boolean boolean30 = node27.isReturn();
        boolean boolean31 = node27.isEmpty();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("");
        node34.setSourceEncodedPosition(4095);
        boolean boolean37 = node34.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile38 = node34.getStaticSourceFile();
        boolean boolean39 = node34.isAssignAdd();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("");
        node41.setSourceEncodedPosition(4095);
        boolean boolean44 = node41.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = node41.getStaticSourceFile();
        com.google.javascript.rhino.Node node46 = node34.copyInformationFromForTree(node41);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        boolean boolean49 = node48.isOnlyModifiesThisCall();
        boolean boolean50 = node48.isEmpty();
        boolean boolean51 = node48.isArrayLit();
        com.google.javascript.rhino.Node node52 = node34.useSourceInfoFrom(node48);
        boolean boolean53 = node52.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("");
        boolean boolean56 = node55.isOnlyModifiesThisCall();
        boolean boolean57 = node55.isEmpty();
        boolean boolean58 = node55.isArrayLit();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("");
        boolean boolean61 = node60.isOnlyModifiesThisCall();
        boolean boolean62 = node60.isEmpty();
        boolean boolean63 = node60.isReturn();
        boolean boolean64 = node60.isNE();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(4095, node52, node55, node60, (int) (byte) 10, 32);
        boolean boolean68 = node60.isCase();
        com.google.javascript.rhino.Node node69 = node27.srcref(node60);
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildBefore(node21, node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(staticSourceFile38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(staticSourceFile45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
    }
}

