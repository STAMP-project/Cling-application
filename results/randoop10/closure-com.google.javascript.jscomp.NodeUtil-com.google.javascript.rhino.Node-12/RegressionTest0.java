import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile1 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node0);
        org.junit.Assert.assertNull(staticSourceFile1);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        com.google.javascript.rhino.Node node0 = null;
        java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.getSourceName(node0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((int) '4', node1, node2, node3, node4, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int4 = node3.getLineno();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = node3.removeChildAfter(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        java.lang.String str11 = node3.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo12 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "STRING hi!" + "'", str11, "STRING hi!");
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node9.setString("");
        com.google.javascript.rhino.Node node12 = node5.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean13 = node5.isGetElem();
        com.google.javascript.rhino.Node node14 = node5.cloneNode();
        boolean boolean15 = node14.isContinue();
        com.google.javascript.rhino.Node node16 = node14.cloneTree();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 100, node1, node16, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node3);
        boolean boolean14 = node3.isTypeOf();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        int int41 = node31.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node31);
        boolean boolean44 = node18.isGetElem();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node52.setString("");
        com.google.javascript.rhino.Node node55 = node48.useSourceInfoIfMissingFromForTree(node52);
        boolean boolean56 = node48.isGetElem();
        com.google.javascript.rhino.Node node57 = node48.cloneNode();
        boolean boolean58 = node57.isDebugger();
        node57.setQuotedString();
        // The following exception was thrown during execution in test generation
        try {
            node3.replaceChildAfter(node18, node57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(staticSourceFile13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        int int41 = node31.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node31);
        boolean boolean44 = node18.isGetElem();
        com.google.javascript.rhino.Node node45 = node14.useSourceInfoFrom(node18);
        com.google.javascript.rhino.Node node46 = node45.removeFirstChild();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        boolean boolean58 = node50.isGetElem();
        com.google.javascript.rhino.Node node59 = node50.cloneNode();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node67.setString("");
        com.google.javascript.rhino.Node node70 = node63.useSourceInfoIfMissingFromForTree(node67);
        boolean boolean71 = node63.isGetElem();
        int int73 = node63.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node74 = com.google.javascript.jscomp.NodeUtil.newExpr(node63);
        com.google.javascript.rhino.Node node75 = node50.clonePropsFrom(node63);
        boolean boolean76 = node50.isGetElem();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile77 = null;
        node50.setStaticSourceFile(staticSourceFile77);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node79 = node45.removeChildAfter(node50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        boolean boolean29 = node3.isGetElem();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = null;
        node3.setStaticSourceFile(staticSourceFile30);
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = node3.useSourceInfoIfMissingFromForTree(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        boolean boolean12 = node3.isFromExterns();
        com.google.javascript.rhino.Node node13 = node3.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = node13.isName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        boolean boolean15 = node12.isLocalResultCall();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        boolean boolean27 = node19.isGetElem();
        com.google.javascript.rhino.Node node28 = node19.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node19);
        com.google.javascript.rhino.Node[] nodeArray31 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), nodeArray31);
        // The following exception was thrown during execution in test generation
        try {
            node12.addChildAfter(node19, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(staticSourceFile29);
        org.junit.Assert.assertNotNull(nodeArray31);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node3.setString("");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node13.setString("");
        com.google.javascript.rhino.Node node16 = node9.useSourceInfoIfMissingFromForTree(node13);
        boolean boolean17 = node9.isGetElem();
        com.google.javascript.rhino.Node node18 = node9.cloneNode();
        boolean boolean19 = node18.isContinue();
        boolean boolean20 = node18.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node28.setString("");
        com.google.javascript.rhino.Node node31 = node24.useSourceInfoIfMissingFromForTree(node28);
        boolean boolean32 = node24.isGetElem();
        com.google.javascript.rhino.Node node33 = node24.cloneNode();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node41.setString("");
        com.google.javascript.rhino.Node node44 = node37.useSourceInfoIfMissingFromForTree(node41);
        boolean boolean45 = node37.isGetElem();
        int int47 = node37.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newExpr(node37);
        com.google.javascript.rhino.Node node49 = node24.clonePropsFrom(node37);
        boolean boolean50 = node24.isGetElem();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile51 = null;
        node24.setStaticSourceFile(staticSourceFile51);
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildrenAfter(node18, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node10.setString("");
        com.google.javascript.rhino.Node node13 = node6.useSourceInfoIfMissingFromForTree(node10);
        java.lang.String str14 = node6.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility17 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo15.setVisibility(visibility17);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = jSDocInfo15.getEnumParameterType();
        node6.setJSDocInfo(jSDocInfo15);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node32.setString("");
        com.google.javascript.rhino.Node node35 = node28.useSourceInfoIfMissingFromForTree(node32);
        node32.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, false);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry40.createFunctionType(jSType41, jSTypeArray42);
        boolean boolean44 = functionType43.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry23.createObjectType("hi!", node32, (com.google.javascript.rhino.jstype.ObjectType) functionType43);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry1.createConstructorType("Not declared as a type name", node6, node32, jSType46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "STRING hi!" + "'", str14, "STRING hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + visibility17 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility17.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNull(jSTypeExpression19);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectType45);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node14.setString("");
        com.google.javascript.rhino.Node node17 = node10.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean18 = node10.isGetElem();
        com.google.javascript.rhino.Node node19 = node10.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node10);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node28.setString("");
        com.google.javascript.rhino.Node node31 = node24.useSourceInfoIfMissingFromForTree(node28);
        boolean boolean32 = node24.isGetElem();
        com.google.javascript.rhino.Node node33 = node24.cloneNode();
        com.google.javascript.rhino.Node[] nodeArray34 = new com.google.javascript.rhino.Node[] { node10, node24 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node[] nodeArray35 = strComparableList4.toArray(nodeArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(staticSourceFile20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeArray34);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException("");
        java.io.IOException iOException8 = new java.io.IOException("");
        java.io.IOException iOException10 = new java.io.IOException("");
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException13 = new java.io.IOException("");
        java.io.IOException iOException15 = new java.io.IOException("");
        iOException13.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException18 = new java.io.IOException("");
        java.io.IOException iOException20 = new java.io.IOException("");
        iOException18.addSuppressed((java.lang.Throwable) iOException20);
        java.lang.Exception exception22 = null;
        java.io.IOException iOException23 = new java.io.IOException();
        java.io.IOException iOException25 = new java.io.IOException("");
        java.io.IOException iOException27 = new java.io.IOException("");
        iOException25.addSuppressed((java.lang.Throwable) iOException27);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Exception> exceptionList29 = com.google.common.collect.ImmutableList.of((java.lang.Exception) iOException3, (java.lang.Exception) iOException6, (java.lang.Exception) iOException8, (java.lang.Exception) iOException15, (java.lang.Exception) iOException20, exception22, (java.lang.Exception) iOException23, (java.lang.Exception) iOException25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 5");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable18 = functionType16.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType16.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType16.getReturnType();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType26.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.unboxesTo();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = functionType35.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType38 = functionType35.unboxesTo();
        boolean boolean40 = functionType35.removeProperty("");
        int int41 = functionType35.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, false);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node53.setString("");
        com.google.javascript.rhino.Node node56 = node49.useSourceInfoIfMissingFromForTree(node53);
        node53.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, false);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry61.createFunctionType(jSType62, jSTypeArray63);
        boolean boolean65 = functionType64.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSTypeRegistry44.createObjectType("hi!", node53, (com.google.javascript.rhino.jstype.ObjectType) functionType64);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, false);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry69.createFunctionType(jSType70, jSTypeArray71);
        boolean boolean73 = functionType72.isNominalType();
        boolean boolean74 = functionType72.isInterface();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] { functionType16, jSType29, functionType35, functionType64, functionType72 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = strComparableList4.toArray(jSTypeArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray75);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList9.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableList4.remove(52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        // The following exception was thrown during execution in test generation
        try {
            strComparableList4.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        // The following exception was thrown during execution in test generation
        try {
            strComparableList4.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType3 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType7 = functionType5.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, false);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry11.createFunctionType(jSType12, jSTypeArray13);
        boolean boolean15 = functionType14.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable16 = functionType14.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType14.unboxesTo();
        boolean boolean18 = functionType14.isRecordType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType19 = jSType7.resolve(errorReporter8, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType4 = jSTypeRegistry2.getNativeObjectType(jSTypeNative3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        boolean boolean29 = node28.isNot();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node28.siblings();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator31 = nodeIterable30.spliterator();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertNotNull(nodeSpliterator31);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int4 = node3.getLineno();
        boolean boolean5 = node3.isEmpty();
        boolean boolean6 = node3.isLocalResultCall();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node14.setString("");
        com.google.javascript.rhino.Node node17 = node10.useSourceInfoIfMissingFromForTree(node14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node25.setString("");
        com.google.javascript.rhino.Node node28 = node21.useSourceInfoIfMissingFromForTree(node25);
        boolean boolean29 = node21.isGetElem();
        com.google.javascript.rhino.Node node30 = node21.cloneNode();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node38.setString("");
        com.google.javascript.rhino.Node node41 = node34.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean42 = node34.isGetElem();
        int int44 = node34.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newExpr(node34);
        com.google.javascript.rhino.Node node46 = node21.clonePropsFrom(node34);
        boolean boolean47 = node46.isNot();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node46.siblings();
        boolean boolean49 = node46.isOr();
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildAfter(node10, node46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.String[] strArray7 = new java.lang.String[] { "unknown", "STRING hi!", "Not declared as a type name", "STRING hi!", "hi!", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = strSet8.retainAll(strComparableCollection10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = com.google.javascript.rhino.Node.FREE_CALL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 50 + "'", int0 == 50);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        int int14 = node4.getIntProp((int) (byte) -1);
        boolean boolean15 = node4.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = new com.google.javascript.rhino.JSTypeExpression(node4, "STRING hi!");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node25.setString("");
        com.google.javascript.rhino.Node node28 = node21.useSourceInfoIfMissingFromForTree(node25);
        boolean boolean29 = node21.isGetElem();
        com.google.javascript.rhino.Node node30 = node21.cloneNode();
        boolean boolean31 = node30.isDebugger();
        node4.addChildToFront(node30);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, false);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node44.setString("");
        com.google.javascript.rhino.Node node47 = node40.useSourceInfoIfMissingFromForTree(node44);
        node44.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, false);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry52.createFunctionType(jSType53, jSTypeArray54);
        boolean boolean56 = functionType55.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry35.createObjectType("hi!", node44, (com.google.javascript.rhino.jstype.ObjectType) functionType55);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node59 = jSTypeRegistry35.createParametersWithVarArgs(jSTypeArray58);
        boolean boolean60 = node59.isIn();
        com.google.javascript.rhino.Node[] nodeArray62 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((-1), nodeArray62);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((int) (byte) 10, node30, node59, node63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(nodeArray62);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int19 = node18.getLineno();
        boolean boolean20 = node18.isEmpty();
        com.google.javascript.rhino.InputId inputId21 = com.google.javascript.jscomp.NodeUtil.getInputId(node18);
        boolean boolean22 = node14.isEquivalentToTyped(node18);
        java.lang.Appendable appendable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            node18.appendStringTree(appendable23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node9.setString("");
        com.google.javascript.rhino.Node node12 = node5.useSourceInfoIfMissingFromForTree(node9);
        node9.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        int int28 = node18.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newExpr(node18);
        com.google.javascript.rhino.Node node30 = node9.srcrefTree(node29);
        int int31 = node29.getSideEffectFlags();
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 1, node1, node29, node32, 46, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.isExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = functionType19.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType5.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType19);
        boolean boolean23 = functionType5.isNominalType();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = functionType5.setValidator(jSTypePredicate24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertNull(jSDocInfo21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        long long0 = com.google.javascript.rhino.InputId.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableList6.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableItor7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableItor7);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        int int0 = com.google.javascript.rhino.Node.COLUMN_MASK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4095 + "'", int0 == 4095);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList6.set(2, (java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableList6.iterator();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableItor7.next();
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "STRING hi!" + "'", strComparable8, "STRING hi!");
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int int0 = com.google.javascript.rhino.Node.DIRECTIVES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 48 + "'", int0 == 48);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType5.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType5.getIndexType();
        boolean boolean13 = functionType5.matchesObjectContext();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList7 = strComparableList6.reverse();
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strComparableList6.removeAll(strComparableCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableList7);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        boolean boolean15 = node3.isGetProp();
        com.google.javascript.rhino.Node node16 = node3.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            node16.setSourceFileForTesting("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        node14.setSourceEncodedPosition((int) (short) 10);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = node14.getStaticSourceFile();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node25.setString("");
        com.google.javascript.rhino.Node node28 = node21.useSourceInfoIfMissingFromForTree(node25);
        boolean boolean29 = node21.isGetElem();
        com.google.javascript.rhino.Node node30 = node21.cloneNode();
        boolean boolean31 = node30.isContinue();
        boolean boolean32 = node30.isOnlyModifiesThisCall();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, false);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry35.createFunctionType(jSType36, jSTypeArray37);
        boolean boolean39 = functionType38.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType40 = functionType38.getParameterType();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node48.setString("");
        com.google.javascript.rhino.Node node51 = node44.useSourceInfoIfMissingFromForTree(node48);
        boolean boolean52 = node44.isGetElem();
        com.google.javascript.rhino.Node node53 = node44.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile54 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node44);
        boolean boolean55 = node44.isNot();
        functionType38.setSource(node44);
        // The following exception was thrown during execution in test generation
        try {
            node14.addChildBefore(node30, node44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(staticSourceFile17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(staticSourceFile54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType9 = functionType5.getReturnType();
        boolean boolean10 = jSType9.isNumber();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int0 = com.google.javascript.rhino.Node.SIDE_EFFECTS_ALL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility0 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        org.junit.Assert.assertTrue("'" + visibility0 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility0.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        int int0 = com.google.javascript.rhino.Node.SIDE_EFFECTS_FLAGS_MASK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 31 + "'", int0 == 31);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = functionType19.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType5.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType19);
        boolean boolean23 = functionType5.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType5.autoboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.EnumType enumType25 = jSType24.toMaybeEnumType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertNull(jSDocInfo21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList0 = com.google.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(cloneableList0);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType7 = functionType5.getParameterType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jSType7.isStringValueType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSType7);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.EMPTY_TYPE_COMPONENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Named type with empty name component" + "'", str0, "Named type with empty name component");
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        boolean boolean7 = functionType5.isDateType();
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair9 = functionType5.getTypesUnderInequality(jSType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList8 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList8.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList10 = strComparableList8.reverse();
        boolean boolean11 = strSet2.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList8);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList20 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor21 = strComparableList20.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList22 = strComparableList20.reverse();
        boolean boolean23 = strSet14.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList20);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList32 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor33 = strComparableList32.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList34 = strComparableList32.reverse();
        boolean boolean35 = strSet26.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList32);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList44 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor45 = strComparableList44.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList46 = strComparableList44.reverse();
        boolean boolean47 = strSet38.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        com.google.common.collect.ImmutableList<java.util.AbstractSet<java.lang.String>> strSetList48 = com.google.common.collect.ImmutableList.of((java.util.AbstractSet<java.lang.String>) strSet2, (java.util.AbstractSet<java.lang.String>) strSet14, (java.util.AbstractSet<java.lang.String>) strSet26, (java.util.AbstractSet<java.lang.String>) strSet38);
        java.io.IOException iOException50 = new java.io.IOException("");
        java.io.IOException iOException52 = new java.io.IOException("");
        iOException50.addSuppressed((java.lang.Throwable) iOException52);
        java.io.IOException iOException55 = new java.io.IOException("");
        java.io.IOException iOException57 = new java.io.IOException("");
        iOException55.addSuppressed((java.lang.Throwable) iOException57);
        java.lang.Throwable[] throwableArray59 = new java.lang.Throwable[] { iOException50, iOException57 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Throwable[] throwableArray60 = strSet26.toArray(throwableArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strComparableList8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableList20);
        org.junit.Assert.assertNotNull(strComparableItor21);
        org.junit.Assert.assertNotNull(strComparableList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strComparableList32);
        org.junit.Assert.assertNotNull(strComparableItor33);
        org.junit.Assert.assertNotNull(strComparableList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strComparableList44);
        org.junit.Assert.assertNotNull(strComparableItor45);
        org.junit.Assert.assertNotNull(strComparableList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strSetList48);
        org.junit.Assert.assertNotNull(throwableArray59);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        java.lang.String str11 = node3.toString();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags12 = null;
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags(sideEffectFlags12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "STRING hi!" + "'", str11, "STRING hi!");
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("unknown");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node9.setString("");
        com.google.javascript.rhino.Node node12 = node5.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean13 = node5.isGetElem();
        com.google.javascript.rhino.Node node14 = node5.cloneNode();
        boolean boolean15 = node14.isContinue();
        com.google.javascript.rhino.Node node16 = node14.cloneTree();
        node16.setSourceEncodedPosition((int) (short) 10);
        boolean boolean19 = node16.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        node31.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, false);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry39.createFunctionType(jSType40, jSTypeArray41);
        boolean boolean43 = functionType42.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry22.createObjectType("hi!", node31, (com.google.javascript.rhino.jstype.ObjectType) functionType42);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node46 = jSTypeRegistry22.createParametersWithVarArgs(jSTypeArray45);
        boolean boolean47 = node46.isIn();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(52, node16, node46, 42, (int) (byte) 0);
        boolean boolean51 = node16.isContinue();
        boolean boolean52 = node16.isGetProp();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(40, node16, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        int int41 = node31.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node31);
        boolean boolean44 = node18.isGetElem();
        com.google.javascript.rhino.Node node45 = node14.useSourceInfoFrom(node18);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        boolean boolean58 = node50.isGetElem();
        com.google.javascript.rhino.Node node59 = node50.cloneNode();
        boolean boolean60 = node59.isContinue();
        com.google.javascript.rhino.Node node61 = node59.cloneTree();
        node61.setSourceEncodedPosition((int) (short) 10);
        boolean boolean64 = node61.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, false);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node76.setString("");
        com.google.javascript.rhino.Node node79 = node72.useSourceInfoIfMissingFromForTree(node76);
        node76.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, false);
        com.google.javascript.rhino.jstype.JSType jSType85 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray86 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry84.createFunctionType(jSType85, jSTypeArray86);
        boolean boolean88 = functionType87.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType89 = jSTypeRegistry67.createObjectType("hi!", node76, (com.google.javascript.rhino.jstype.ObjectType) functionType87);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray90 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node91 = jSTypeRegistry67.createParametersWithVarArgs(jSTypeArray90);
        boolean boolean92 = node91.isIn();
        com.google.javascript.rhino.Node node95 = new com.google.javascript.rhino.Node(52, node61, node91, 42, (int) (byte) 0);
        boolean boolean96 = node18.hasChild(node95);
        boolean boolean97 = node95.isHook();
        node95.detachChildren();
        com.google.javascript.rhino.Node node99 = node95.getLastSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(jSTypeArray86);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNotNull(jSTypeArray90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(node99);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        boolean boolean12 = functionType5.hasProperty("true");
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        com.google.javascript.rhino.Node node13 = node4.cloneNode();
        boolean boolean14 = node13.isContinue();
        com.google.javascript.rhino.Node node15 = node13.cloneTree();
        node15.setSourceEncodedPosition((int) (short) 10);
        boolean boolean18 = node15.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node30.setString("");
        com.google.javascript.rhino.Node node33 = node26.useSourceInfoIfMissingFromForTree(node30);
        node30.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, false);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        boolean boolean42 = functionType41.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry21.createObjectType("hi!", node30, (com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry21.createParametersWithVarArgs(jSTypeArray44);
        boolean boolean46 = node45.isIn();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(52, node15, node45, 42, (int) (byte) 0);
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newExpr(node49);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node51 = node50.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        java.lang.Iterable iterable38 = functionType7.getCtorImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = functionType7.getImplementedInterfaces();
        boolean boolean40 = functionType7.hasInstanceType();
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterable38);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        boolean boolean17 = jSDocInfo15.containsDeclaration();
        functionType5.setPropertyJSDocInfo("STRING hi!", jSDocInfo15);
        java.lang.Iterable iterable19 = functionType5.getCtorImplementedInterfaces();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator20 = iterable19.spliterator();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterable19);
        org.junit.Assert.assertNotNull(nodeSpliterator20);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("Not declared as a constructor");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.UNKNOWN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Unknown class name" + "'", str0, "Unknown class name");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, false);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry12.createFunctionType(jSType13, jSTypeArray14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, false);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry18.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        node31.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, false);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry39.createFunctionType(jSType40, jSTypeArray41);
        boolean boolean43 = functionType42.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry22.createObjectType("hi!", node31, (com.google.javascript.rhino.jstype.ObjectType) functionType42);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node46 = jSTypeRegistry22.createParametersWithVarArgs(jSTypeArray45);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, false);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry50.createFunctionType(jSType51, jSTypeArray52);
        boolean boolean54 = functionType53.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable55 = functionType53.getCtorImplementedInterfaces();
        jSTypeRegistry22.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        boolean boolean63 = functionType62.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType62.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType62.unboxesTo();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection66 = jSTypeRegistry22.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType62);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, false);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry69.createFunctionType(jSType70, jSTypeArray71);
        com.google.javascript.rhino.Node node73 = jSTypeRegistry22.createParametersWithVarArgs(jSTypeArray71);
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry18.createUnionType(jSTypeArray71);
        java.io.IOException iOException76 = new java.io.IOException("");
        java.io.IOException iOException78 = new java.io.IOException("");
        java.io.IOException iOException80 = new java.io.IOException("");
        java.io.IOException[] iOExceptionArray81 = new java.io.IOException[] { iOException76, iOException78, iOException80 };
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList82 = com.google.common.collect.ImmutableList.of(iOExceptionArray81);
        com.google.common.collect.ImmutableList<java.lang.Object[]> objArrayList83 = com.google.common.collect.ImmutableList.of((java.lang.Object[]) jSTypeArray14, (java.lang.Object[]) jSTypeArray71, (java.lang.Object[]) iOExceptionArray81);
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType8, false, jSTypeArray71);
        com.google.javascript.rhino.jstype.FunctionType functionType85 = functionType84.getOwnerFunction();
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable55);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNotNull(functionTypeCollection66);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(iOExceptionArray81);
        org.junit.Assert.assertNotNull(iOExceptionList82);
        org.junit.Assert.assertNotNull(objArrayList83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertNull(functionType85);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        com.google.javascript.rhino.Node node13 = node4.cloneNode();
        boolean boolean14 = node13.isContinue();
        com.google.javascript.rhino.Node node15 = node13.cloneTree();
        node15.setSourceEncodedPosition((int) (short) 10);
        boolean boolean18 = node15.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node30.setString("");
        com.google.javascript.rhino.Node node33 = node26.useSourceInfoIfMissingFromForTree(node30);
        node30.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, false);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        boolean boolean42 = functionType41.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry21.createObjectType("hi!", node30, (com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry21.createParametersWithVarArgs(jSTypeArray44);
        boolean boolean46 = node45.isIn();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(52, node15, node45, 42, (int) (byte) 0);
        boolean boolean50 = node15.isContinue();
        boolean boolean51 = node15.isGetProp();
        com.google.javascript.rhino.Node node52 = node15.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            node52.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType7 = functionType5.getParameterType();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node15.setString("");
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean19 = node11.isGetElem();
        com.google.javascript.rhino.Node node20 = node11.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node11);
        boolean boolean22 = node11.isNot();
        functionType5.setSource(node11);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        com.google.javascript.rhino.Node node36 = node27.cloneNode();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node44.setString("");
        com.google.javascript.rhino.Node node47 = node40.useSourceInfoIfMissingFromForTree(node44);
        boolean boolean48 = node40.isGetElem();
        int int50 = node40.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newExpr(node40);
        com.google.javascript.rhino.Node node52 = node27.clonePropsFrom(node40);
        boolean boolean53 = node52.isNot();
        boolean boolean54 = node52.isDelProp();
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1), nodeArray57);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(44, nodeArray57, 40, 42);
        // The following exception was thrown during execution in test generation
        try {
            node11.addChildAfter(node52, node61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(staticSourceFile21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(nodeArray57);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableList6.iterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList6.add((int) (short) 1, (java.lang.Comparable<java.lang.String>) "Named type with empty name component");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableItor7);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList8 = functionType5.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, false);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry11.createFunctionType(jSType12, jSTypeArray13);
        boolean boolean15 = functionType14.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable16 = functionType14.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType14.unboxesTo();
        boolean boolean19 = functionType14.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType20 = functionType14.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = functionType14.dereference();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType5.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType21);
        com.google.javascript.rhino.jstype.ObjectType objectType24 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType21, "PARAM_LIST");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node26 = objectType24.getPropertyNode("function (): {308555690}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(functionTypeList8);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertNull(objectType24);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        java.lang.String str2 = jSDocInfo0.getOriginalCommentString();
        boolean boolean3 = jSDocInfo0.hasBaseType();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getSuppressions();
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList13 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableList13.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList15 = strComparableList13.reverse();
        boolean boolean16 = strSet7.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList13);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList25 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor26 = strComparableList25.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList27 = strComparableList25.reverse();
        boolean boolean28 = strSet19.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList25);
        java.util.AbstractSet[] abstractSetArray30 = new java.util.AbstractSet[2];
        @SuppressWarnings("unchecked")
        java.util.AbstractSet<java.lang.String>[] strSetArray31 = (java.util.AbstractSet<java.lang.String>[]) abstractSetArray30;
        strSetArray31[0] = strSet7;
        strSetArray31[1] = strSet19;
        java.util.AbstractSet<java.lang.String>[] strSetArray36 = strSet4.toArray(strSetArray31);
        java.util.Spliterator<java.lang.String> strSpliterator37 = strSet4.spliterator();
        java.lang.Object[] objArray38 = strSet4.toArray();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableList13);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(strComparableList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strComparableList25);
        org.junit.Assert.assertNotNull(strComparableItor26);
        org.junit.Assert.assertNotNull(strComparableList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(abstractSetArray30);
        org.junit.Assert.assertNotNull(strSetArray31);
        org.junit.Assert.assertNotNull(strSetArray36);
        org.junit.Assert.assertNotNull(strSpliterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable12 = functionType10.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.unboxesTo();
        boolean boolean15 = functionType10.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = functionType10.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType10.dereference();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType10);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType26.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.unboxesTo();
        boolean boolean31 = functionType26.removeProperty("");
        int int32 = functionType26.getMaxArguments();
        java.lang.String str33 = functionType26.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isNominalType();
        functionType26.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType39);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, false);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry44.createFunctionType(jSType45, jSTypeArray46);
        boolean boolean48 = functionType47.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = functionType47.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType47.unboxesTo();
        boolean boolean52 = functionType47.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType53 = functionType47.getImplicitPrototype();
        functionType26.setPrototypeBasedOn(objectType53);
        boolean boolean56 = jSTypeRegistry20.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType26, "hi!");
        java.lang.Iterable iterable57 = functionType26.getCtorImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, false);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, false);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry64.createFunctionType(jSType65, jSTypeArray66);
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = functionType67.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry61.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType67);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, false);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node82.setString("");
        com.google.javascript.rhino.Node node85 = node78.useSourceInfoIfMissingFromForTree(node82);
        node82.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter88 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry90 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter88, false);
        com.google.javascript.rhino.jstype.JSType jSType91 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray92 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry90.createFunctionType(jSType91, jSTypeArray92);
        boolean boolean94 = functionType93.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType95 = jSTypeRegistry73.createObjectType("hi!", node82, (com.google.javascript.rhino.jstype.ObjectType) functionType93);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray96 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node97 = jSTypeRegistry73.createParametersWithVarArgs(jSTypeArray96);
        com.google.javascript.rhino.Node node98 = jSTypeRegistry61.createParametersWithVarArgs(jSTypeArray96);
        com.google.javascript.rhino.jstype.FunctionType functionType99 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType26, false, jSTypeArray96);
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable49);
        org.junit.Assert.assertNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterable57);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertNull(jSDocInfo69);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(jSTypeArray92);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(objectType95);
        org.junit.Assert.assertNotNull(jSTypeArray96);
        org.junit.Assert.assertNotNull(node97);
        org.junit.Assert.assertNotNull(node98);
        org.junit.Assert.assertNotNull(functionType99);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node18.setString("");
        com.google.javascript.rhino.Node node21 = node14.useSourceInfoIfMissingFromForTree(node18);
        node18.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        int int37 = node27.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        com.google.javascript.rhino.Node node39 = node18.srcrefTree(node38);
        java.lang.String str40 = node10.checkTreeEquals(node38);
        int int41 = node10.getSourcePosition();
        node10.setWasEmptyNode(true);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags44 = new com.google.javascript.rhino.Node.SideEffectFlags();
        boolean boolean45 = sideEffectFlags44.areAllFlagsSet();
        // The following exception was thrown during execution in test generation
        try {
            node10.setSideEffectFlags(sideEffectFlags44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str40, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        boolean boolean12 = node3.isFromExterns();
        com.google.javascript.rhino.Node node13 = node3.getParent();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node26.setString("");
        com.google.javascript.rhino.Node node29 = node22.useSourceInfoIfMissingFromForTree(node26);
        node26.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        boolean boolean38 = functionType37.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType39 = jSTypeRegistry17.createObjectType("hi!", node26, (com.google.javascript.rhino.jstype.ObjectType) functionType37);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node47.setString("");
        com.google.javascript.rhino.Node node50 = node43.useSourceInfoIfMissingFromForTree(node47);
        boolean boolean51 = node43.isGetElem();
        com.google.javascript.rhino.Node node52 = node43.cloneNode();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node60.setString("");
        com.google.javascript.rhino.Node node63 = node56.useSourceInfoIfMissingFromForTree(node60);
        boolean boolean64 = node56.isGetElem();
        int int66 = node56.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newExpr(node56);
        com.google.javascript.rhino.Node node68 = node43.clonePropsFrom(node56);
        boolean boolean69 = node68.isNot();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable70 = node68.siblings();
        boolean boolean71 = node68.isOr();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship72 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType14, node26, node68);
        // The following exception was thrown during execution in test generation
        try {
            node3.removeChild(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + subclassType14 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType14.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectType39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(nodeIterable70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1, false);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node12.setString("");
        com.google.javascript.rhino.Node node15 = node8.useSourceInfoIfMissingFromForTree(node12);
        node12.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry3.createObjectType("hi!", node12, (com.google.javascript.rhino.jstype.ObjectType) functionType23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node33.setString("");
        com.google.javascript.rhino.Node node36 = node29.useSourceInfoIfMissingFromForTree(node33);
        boolean boolean37 = node29.isGetElem();
        com.google.javascript.rhino.Node node38 = node29.cloneNode();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node46.setString("");
        com.google.javascript.rhino.Node node49 = node42.useSourceInfoIfMissingFromForTree(node46);
        boolean boolean50 = node42.isGetElem();
        int int52 = node42.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newExpr(node42);
        com.google.javascript.rhino.Node node54 = node29.clonePropsFrom(node42);
        boolean boolean55 = node54.isNot();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node54.siblings();
        boolean boolean57 = node54.isOr();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship58 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node12, node54);
        boolean boolean59 = node12.isGetterDef();
        com.google.javascript.rhino.Node[] nodeArray61 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), nodeArray61);
        int int63 = node62.getSourceOffset();
        com.google.javascript.rhino.Node node64 = null;
        // The following exception was thrown during execution in test generation
        try {
            node12.addChildBefore(node62, node64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(nodeArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.isDefine();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getTypedefType();
        boolean boolean6 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        node23.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry31.createFunctionType(jSType32, jSTypeArray33);
        boolean boolean35 = functionType34.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = jSTypeRegistry14.createObjectType("hi!", node23, (com.google.javascript.rhino.jstype.ObjectType) functionType34);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node38 = jSTypeRegistry14.createParametersWithVarArgs(jSTypeArray37);
        com.google.javascript.rhino.Node node39 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray37);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node48.setString("");
        com.google.javascript.rhino.Node node51 = node44.useSourceInfoIfMissingFromForTree(node48);
        boolean boolean52 = node44.isGetElem();
        com.google.javascript.rhino.Node node53 = node44.cloneNode();
        boolean boolean54 = node53.isExprResult();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry2.createInterfaceType("JSDocInfo", node53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType38, "");
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, false);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry43.createFunctionType(jSType44, jSTypeArray45);
        boolean boolean47 = functionType46.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList52 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor53 = strComparableList52.iterator();
        boolean boolean54 = functionType46.equals((java.lang.Object) strComparableItor53);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, false);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry58.createFunctionType(jSType59, jSTypeArray60);
        boolean boolean62 = functionType61.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable63 = functionType61.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node64 = null;
        boolean boolean65 = functionType46.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType61, node64);
        boolean boolean67 = functionType61.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType61);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType69 = functionType61.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strComparableList52);
        org.junit.Assert.assertNotNull(strComparableItor53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objectType68);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableList4.set(1, (java.lang.Comparable<java.lang.String>) "[, hi!, STRING hi!, STRING hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isContinue();
        com.google.javascript.rhino.Node node28 = node26.cloneTree();
        boolean boolean29 = node26.isLocalResultCall();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry2.createInterfaceType("Named type with empty name component", node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry14.createFunctionType(jSType15, jSTypeArray16);
        boolean boolean18 = functionType17.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = functionType17.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType17.unboxesTo();
        boolean boolean22 = functionType17.removeProperty("");
        int int23 = functionType17.getMaxArguments();
        java.lang.String str24 = functionType17.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isNominalType();
        functionType17.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType30);
        boolean boolean33 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType5, (com.google.javascript.rhino.jstype.JSType) functionType30);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType35 = functionType5.getTopMostDefiningType("Not declared as a type name");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        java.lang.String str11 = node3.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility14 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo12.setVisibility(visibility14);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo12.getEnumParameterType();
        node3.setJSDocInfo(jSDocInfo12);
        jSDocInfo12.setLicense("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility20 = jSDocInfo12.getVisibility();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList21 = jSDocInfo12.getThrownTypes();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "STRING hi!" + "'", str11, "STRING hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + visibility14 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility14.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNull(jSTypeExpression16);
        org.junit.Assert.assertTrue("'" + visibility20 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility20.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNotNull(jSTypeExpressionList21);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "java.io.IOException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder2 = nodeSourcePositionBuilder0.add((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition1);
        int int3 = typePosition1.getStartLine();
        com.google.javascript.rhino.Node node4 = typePosition1.getItem();
        org.junit.Assert.assertNotNull(nodeSourcePositionBuilder0);
        org.junit.Assert.assertNotNull(nodeSourcePositionBuilder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType23.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType23.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType23.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = functionType16.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.Node node29 = functionType16.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList41 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor42 = strComparableList41.iterator();
        boolean boolean43 = functionType35.equals((java.lang.Object) strComparableItor42);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType50.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node53 = null;
        boolean boolean54 = functionType35.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType50, node53);
        boolean boolean56 = functionType50.removeProperty("Not declared as a type name");
        boolean boolean57 = functionType16.hasEqualCallType(functionType50);
        boolean boolean58 = strComparableList9.equals((java.lang.Object) functionType16);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList63 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor64 = strComparableList63.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList65 = strComparableList63.reverse();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream66 = strComparableList65.parallelStream();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility67 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        int int68 = strComparableList65.indexOf((java.lang.Object) visibility67);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = strComparableList9.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strComparableList41);
        org.junit.Assert.assertNotNull(strComparableItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strComparableList63);
        org.junit.Assert.assertNotNull(strComparableItor64);
        org.junit.Assert.assertNotNull(strComparableList65);
        org.junit.Assert.assertNotNull(strComparableStream66);
        org.junit.Assert.assertTrue("'" + visibility67 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility67.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType23.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType23.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType23.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = functionType16.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.Node node29 = functionType16.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList41 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor42 = strComparableList41.iterator();
        boolean boolean43 = functionType35.equals((java.lang.Object) strComparableItor42);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType50.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node53 = null;
        boolean boolean54 = functionType35.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType50, node53);
        boolean boolean56 = functionType50.removeProperty("Not declared as a type name");
        boolean boolean57 = functionType16.hasEqualCallType(functionType50);
        boolean boolean58 = strComparableList9.equals((java.lang.Object) functionType16);
        boolean boolean59 = functionType16.isNativeObjectType();
        java.util.Set<java.lang.String> strSet60 = functionType16.getOwnPropertyNames();
        strSet60.clear();
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strComparableList41);
        org.junit.Assert.assertNotNull(strComparableItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strSet60);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "function (): {522475926}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        boolean boolean12 = jSType11.isGlobalThisType();
        com.google.javascript.rhino.jstype.JSType jSType13 = jSType11.autoboxesTo();
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType13);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        node16.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node38.setString("");
        com.google.javascript.rhino.Node node41 = node34.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean42 = node34.isGetElem();
        com.google.javascript.rhino.Node node43 = node34.cloneNode();
        boolean boolean44 = node43.isContinue();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 52);
        // The following exception was thrown during execution in test generation
        try {
            node16.addChildrenAfter(node43, node46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
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
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        com.google.javascript.rhino.Node node18 = functionType5.getSource();
        com.google.javascript.rhino.jstype.TemplateType templateType19 = functionType5.toMaybeTemplateType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(templateType19);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableList6.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList12 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableList12.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = strComparableList6.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableList12);
        org.junit.Assert.assertNotNull(strComparableItor13);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        java.lang.String str11 = node3.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility14 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo12.setVisibility(visibility14);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo12.getEnumParameterType();
        node3.setJSDocInfo(jSDocInfo12);
        java.lang.String str18 = jSDocInfo12.getDeprecationReason();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList19 = jSDocInfo12.getThrownTypes();
        boolean boolean20 = jSDocInfo12.isOverride();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "STRING hi!" + "'", str11, "STRING hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + visibility14 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility14.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNull(jSTypeExpression16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(jSTypeExpressionList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.JSDocInfo.Marker> markerBuilder0 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.JSDocInfo.Marker>();
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        int int28 = node18.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newExpr(node18);
        com.google.javascript.rhino.Node node30 = node18.detachFromParent();
        boolean boolean31 = node18.isQuotedString();
        boolean boolean32 = node18.isNoSideEffectsCall();
        boolean boolean33 = node18.isCase();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node42.setString("");
        com.google.javascript.rhino.Node node45 = node38.useSourceInfoIfMissingFromForTree(node42);
        boolean boolean46 = node38.isGetElem();
        com.google.javascript.rhino.Node node47 = node38.cloneNode();
        boolean boolean48 = node47.isContinue();
        com.google.javascript.rhino.Node node49 = node47.cloneTree();
        node49.setSourceEncodedPosition((int) (short) 10);
        boolean boolean52 = node49.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, false);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node64.setString("");
        com.google.javascript.rhino.Node node67 = node60.useSourceInfoIfMissingFromForTree(node64);
        node64.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, false);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray74 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry72.createFunctionType(jSType73, jSTypeArray74);
        boolean boolean76 = functionType75.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType77 = jSTypeRegistry55.createObjectType("hi!", node64, (com.google.javascript.rhino.jstype.ObjectType) functionType75);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray78 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node79 = jSTypeRegistry55.createParametersWithVarArgs(jSTypeArray78);
        boolean boolean80 = node79.isIn();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(52, node49, node79, 42, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            node14.replaceChildAfter(node18, node83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objectType77);
        org.junit.Assert.assertNotNull(jSTypeArray78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags11 = new com.google.javascript.rhino.Node.SideEffectFlags();
        int int12 = strComparableList4.lastIndexOf((java.lang.Object) sideEffectFlags11);
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = strComparableList4.removeAll(strComparableCollection13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        com.google.javascript.rhino.Node node15 = node3.getLastChild();
        boolean boolean16 = node3.isLabel();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        boolean boolean29 = node28.isDec();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 52);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node39.setString("");
        com.google.javascript.rhino.Node node42 = node35.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean43 = node35.isGetElem();
        com.google.javascript.rhino.Node node44 = node35.cloneNode();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node52.setString("");
        com.google.javascript.rhino.Node node55 = node48.useSourceInfoIfMissingFromForTree(node52);
        boolean boolean56 = node48.isGetElem();
        int int58 = node48.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newExpr(node48);
        com.google.javascript.rhino.Node node60 = node35.clonePropsFrom(node48);
        boolean boolean61 = node60.isReturn();
        com.google.javascript.jscomp.CodingConvention.Bind bind62 = new com.google.javascript.jscomp.CodingConvention.Bind(node28, node31, node60);
        node31.detachChildren();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, false);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry66.createFunctionType(jSType67, jSTypeArray68);
        boolean boolean70 = functionType69.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, false);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry73.createFunctionType(jSType74, jSTypeArray75);
        boolean boolean77 = functionType76.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = functionType76.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType76.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType76.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue81 = functionType69.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.Node node82 = functionType69.getParametersNode();
        boolean boolean83 = node82.isNot();
        boolean boolean84 = node31.isEquivalentToTyped(node82);
        node31.removeProp(1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSTypeArray68);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable78);
        org.junit.Assert.assertNull(jSType79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(ternaryValue81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        int int0 = com.google.javascript.rhino.Node.MAX_COLUMN_NUMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4095 + "'", int0 == 4095);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        int int25 = node11.getLineno();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags26 = new com.google.javascript.rhino.Node.SideEffectFlags();
        // The following exception was thrown during execution in test generation
        try {
            node11.setSideEffectFlags(sideEffectFlags26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.lang.String str12 = functionType5.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        functionType5.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType18);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType26.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.unboxesTo();
        boolean boolean31 = functionType26.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType32 = functionType26.getImplicitPrototype();
        functionType5.setPrototypeBasedOn(objectType32);
        com.google.javascript.rhino.jstype.FunctionType functionType34 = functionType5.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType35 = functionType34.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNull(functionType34);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        boolean boolean15 = node12.isLocalResultCall();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        boolean boolean27 = node19.isGetElem();
        com.google.javascript.rhino.Node node28 = node19.cloneNode();
        boolean boolean29 = node28.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = node28.getStaticSourceFile();
        com.google.javascript.rhino.Node node32 = node28.getChildAtIndex((int) (short) -1);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        boolean boolean37 = node36.isFor();
        com.google.javascript.rhino.Node node38 = node36.getNext();
        // The following exception was thrown during execution in test generation
        try {
            node12.addChildBefore(node28, node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(staticSourceFile30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node18.setString("");
        com.google.javascript.rhino.Node node21 = node14.useSourceInfoIfMissingFromForTree(node18);
        node18.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        int int37 = node27.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        com.google.javascript.rhino.Node node39 = node18.srcrefTree(node38);
        java.lang.String str40 = node10.checkTreeEquals(node38);
        boolean boolean41 = node38.hasMoreThanOneChild();
        node38.setCharno(37);
        int int44 = node38.getCharno();
        // The following exception was thrown during execution in test generation
        try {
            node38.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str40, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node10.setString("");
        com.google.javascript.rhino.Node node13 = node6.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        node21.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node34.setString("");
        com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFromForTree(node34);
        boolean boolean38 = node30.isGetElem();
        int int40 = node30.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newExpr(node30);
        com.google.javascript.rhino.Node node42 = node21.srcrefTree(node41);
        java.lang.String str43 = node13.checkTreeEquals(node41);
        boolean boolean44 = node41.hasMoreThanOneChild();
        boolean boolean45 = node41.isNE();
        com.google.javascript.rhino.Node node46 = assertionFunctionSpec2.getAssertedParam(node41);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str43, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.lang.String str12 = functionType5.getDisplayName();
        com.google.javascript.rhino.jstype.UnionType unionType13 = functionType5.toMaybeUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry16.createAnonymousObjectType();
        boolean boolean18 = objectType17.isNominalType();
        boolean boolean19 = objectType17.isNominalType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair20 = unionType13.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(unionType13);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableList6.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableList6.set(47, (java.lang.Comparable<java.lang.String>) "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableStream7);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList1 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableList1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        java.util.function.UnaryOperator<java.lang.Comparable<java.lang.String>> strComparableUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableList1.replaceAll(strComparableUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableItor3);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int4 = node3.getLineno();
        boolean boolean5 = node3.isEmpty();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = node3.getJSDocInfo();
        boolean boolean7 = node3.isThis();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node15.setString("");
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoIfMissingFromForTree(node15);
        node15.setSourceEncodedPositionForTree((int) '#');
        boolean boolean21 = node15.isOr();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node29.setString("");
        com.google.javascript.rhino.Node node32 = node25.useSourceInfoIfMissingFromForTree(node29);
        node29.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node42.setString("");
        com.google.javascript.rhino.Node node45 = node38.useSourceInfoIfMissingFromForTree(node42);
        boolean boolean46 = node38.isGetElem();
        int int48 = node38.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newExpr(node38);
        com.google.javascript.rhino.Node node50 = node29.srcrefTree(node49);
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildAfter(node15, node50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType13 = jSTypeRegistry2.getNativeObjectType(jSTypeNative12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("[, hi!, STRING hi!, STRING hi!]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "([, hi!, STRING hi!, STRING hi!])" + "'", str1, "([, hi!, STRING hi!, STRING hi!])");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node7.isTry();
        com.google.javascript.rhino.Node node12 = node7.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = node12.isAssign();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        int int0 = com.google.javascript.rhino.Node.VAR_ARGS_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30 + "'", int0 == 30);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        com.google.javascript.rhino.Node node15 = node3.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = node15.isInc();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableList6.parallelStream();
        com.google.common.collect.ImmutableList<java.util.stream.Stream<java.lang.Comparable<java.lang.String>>> strComparableStreamList8 = com.google.common.collect.ImmutableList.of(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableStreamList8);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        boolean boolean14 = node12.isThrow();
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        boolean boolean27 = node19.isGetElem();
        com.google.javascript.rhino.Node node28 = node19.cloneNode();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node36.setString("");
        com.google.javascript.rhino.Node node39 = node32.useSourceInfoIfMissingFromForTree(node36);
        boolean boolean40 = node32.isGetElem();
        int int42 = node32.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newExpr(node32);
        com.google.javascript.rhino.Node node44 = node19.clonePropsFrom(node32);
        node32.setIsSyntheticBlock(false);
        boolean boolean47 = node32.isVoid();
        boolean boolean48 = node32.isVoid();
        int int49 = node32.getLineno();
        int int50 = node12.getIndexOfChild(node32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType5.getImplicitPrototype();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.isNoCompile();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection14 = jSDocInfo12.getMarkers();
        functionType5.setJSDocInfo(jSDocInfo12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType5.getTopMostDefiningType("Not declared as a type name");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(markerCollection14);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node15 = node3.detachFromParent();
        boolean boolean16 = node3.isQuotedString();
        boolean boolean17 = node3.isNoSideEffectsCall();
        boolean boolean18 = node3.isCase();
        // The following exception was thrown during execution in test generation
        try {
            node3.setDouble((double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING hi! is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo0.setVisibility(visibility2);
        java.lang.String str4 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getType();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.isDefine();
        int int5 = jSDocInfo0.getImplementedInterfaceCount();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getSuppressions();
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = strSet6.removeAll(strComparableCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = functionType18.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType18.unboxesTo();
        boolean boolean23 = functionType18.removeProperty("");
        int int24 = functionType18.getMaxArguments();
        java.lang.String str25 = functionType18.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        boolean boolean32 = functionType31.isNominalType();
        functionType18.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType31);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = functionType39.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.unboxesTo();
        boolean boolean44 = functionType39.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType45 = functionType39.getImplicitPrototype();
        functionType18.setPrototypeBasedOn(objectType45);
        boolean boolean48 = jSTypeRegistry12.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType18, "hi!");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node65.setString("");
        com.google.javascript.rhino.Node node68 = node61.useSourceInfoIfMissingFromForTree(node65);
        node65.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, false);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry73.createFunctionType(jSType74, jSTypeArray75);
        boolean boolean77 = functionType76.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSTypeRegistry56.createObjectType("hi!", node65, (com.google.javascript.rhino.jstype.ObjectType) functionType76);
        com.google.javascript.rhino.jstype.ObjectType objectType79 = jSTypeRegistry12.createObjectType("", node53, (com.google.javascript.rhino.jstype.ObjectType) functionType76);
        boolean boolean80 = functionType76.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType82 = functionType76.getPropertyType("PARAM_LIST");
        boolean boolean83 = functionType76.isNativeObjectType();
        int int84 = strComparableList9.lastIndexOf((java.lang.Object) boolean83);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList89 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor90 = strComparableList89.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList91 = strComparableList89.reverse();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor92 = strComparableList91.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean93 = strComparableList9.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList91);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(strComparableList89);
        org.junit.Assert.assertNotNull(strComparableItor90);
        org.junit.Assert.assertNotNull(strComparableList91);
        org.junit.Assert.assertNotNull(strComparableItor92);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry14.createFunctionType(jSType15, jSTypeArray16);
        boolean boolean18 = functionType17.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = functionType17.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType17.unboxesTo();
        boolean boolean22 = functionType17.removeProperty("");
        int int23 = functionType17.getMaxArguments();
        java.lang.String str24 = functionType17.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isNominalType();
        functionType17.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType30);
        boolean boolean33 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType5, (com.google.javascript.rhino.jstype.JSType) functionType30);
        boolean boolean34 = functionType5.isNullType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList39 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList44 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean45 = strComparableList39.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, false);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry55.createFunctionType(jSType56, jSTypeArray57);
        boolean boolean59 = functionType58.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable60 = functionType58.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType58.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType62 = functionType58.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = functionType51.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType58);
        com.google.javascript.rhino.Node node64 = functionType51.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, false);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry67.createFunctionType(jSType68, jSTypeArray69);
        boolean boolean71 = functionType70.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList76 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor77 = strComparableList76.iterator();
        boolean boolean78 = functionType70.equals((java.lang.Object) strComparableItor77);
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, false);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray84 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry82.createFunctionType(jSType83, jSTypeArray84);
        boolean boolean86 = functionType85.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable87 = functionType85.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node88 = null;
        boolean boolean89 = functionType70.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType85, node88);
        boolean boolean91 = functionType85.removeProperty("Not declared as a type name");
        boolean boolean92 = functionType51.hasEqualCallType(functionType85);
        boolean boolean93 = strComparableList44.equals((java.lang.Object) functionType51);
        boolean boolean94 = functionType51.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType95 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType51);
        boolean boolean96 = functionType5.equals((java.lang.Object) objectType95);
        boolean boolean97 = objectType95.isNoResolvedType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strComparableList39);
        org.junit.Assert.assertNotNull(strComparableList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable60);
        org.junit.Assert.assertNull(jSType61);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strComparableList76);
        org.junit.Assert.assertNotNull(strComparableItor77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jSTypeArray84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(objectType95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        boolean boolean37 = functionType33.matchesStringContext();
        boolean boolean38 = functionType33.canBeCalled();
        boolean boolean39 = functionType33.isCheckedUnknownType();
        boolean boolean40 = functionType33.hasAnyTemplateInternal();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        boolean boolean12 = node3.isCase();
        java.lang.String str13 = node3.getQualifiedName();
        node3.setSourceEncodedPosition(44);
        com.google.javascript.rhino.InputId inputId16 = node3.getInputId();
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(inputId16);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        boolean boolean29 = node28.isNot();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node28.siblings();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node38.setString("");
        com.google.javascript.rhino.Node node41 = node34.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean42 = node34.isGetElem();
        int int44 = node34.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newExpr(node34);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node53.setString("");
        com.google.javascript.rhino.Node node56 = node49.useSourceInfoIfMissingFromForTree(node53);
        boolean boolean57 = node49.isGetElem();
        boolean boolean58 = node49.isCase();
        java.lang.String str59 = node49.getQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            node28.replaceChildAfter(node34, node49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(40);
        boolean boolean2 = node1.isAdd();
        boolean boolean3 = node1.isDefaultCase();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        int int0 = com.google.javascript.rhino.Node.PARENTHESIZED_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 35 + "'", int0 == 35);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        boolean boolean45 = enumType44.matchesStringContext();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList57 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor58 = strComparableList57.iterator();
        boolean boolean59 = functionType51.equals((java.lang.Object) strComparableItor58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, false);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry62.createFunctionType(jSType63, jSTypeArray64);
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = functionType65.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair68 = functionType51.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType65);
        boolean boolean69 = functionType51.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType jSType70 = functionType51.autoboxesTo();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue71 = enumType44.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType51);
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = enumType44.getOwnPropertyJSDocInfo("hi!");
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strComparableList57);
        org.junit.Assert.assertNotNull(strComparableItor58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertNull(jSDocInfo67);
        org.junit.Assert.assertNotNull(typePair68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(jSType70);
        org.junit.Assert.assertNotNull(ternaryValue71);
        org.junit.Assert.assertNull(jSDocInfo73);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        boolean boolean29 = node28.isDec();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 52);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node39.setString("");
        com.google.javascript.rhino.Node node42 = node35.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean43 = node35.isGetElem();
        com.google.javascript.rhino.Node node44 = node35.cloneNode();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node52.setString("");
        com.google.javascript.rhino.Node node55 = node48.useSourceInfoIfMissingFromForTree(node52);
        boolean boolean56 = node48.isGetElem();
        int int58 = node48.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newExpr(node48);
        com.google.javascript.rhino.Node node60 = node35.clonePropsFrom(node48);
        boolean boolean61 = node60.isReturn();
        com.google.javascript.jscomp.CodingConvention.Bind bind62 = new com.google.javascript.jscomp.CodingConvention.Bind(node28, node31, node60);
        com.google.javascript.rhino.Node node63 = node31.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node65 = node63.getChildAtIndex(54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node63);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType5.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType5.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        boolean boolean20 = functionType19.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList25 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor26 = strComparableList25.iterator();
        boolean boolean27 = functionType19.equals((java.lang.Object) strComparableItor26);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry31.createFunctionType(jSType32, jSTypeArray33);
        boolean boolean35 = functionType34.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable36 = functionType34.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node37 = null;
        boolean boolean38 = functionType19.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType34, node37);
        boolean boolean40 = functionType34.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType41 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType34);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node49.setString("");
        com.google.javascript.rhino.Node node52 = node45.useSourceInfoIfMissingFromForTree(node49);
        boolean boolean53 = node45.isGetElem();
        com.google.javascript.rhino.Node node54 = node45.cloneNode();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node62.setString("");
        com.google.javascript.rhino.Node node65 = node58.useSourceInfoIfMissingFromForTree(node62);
        boolean boolean66 = node58.isGetElem();
        int int68 = node58.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newExpr(node58);
        com.google.javascript.rhino.Node node70 = node45.clonePropsFrom(node58);
        boolean boolean71 = node70.isNot();
        boolean boolean72 = functionType5.defineDeclaredProperty("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) objectType41, node70);
        com.google.javascript.rhino.Node node73 = node70.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = node73.isVarArgs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strComparableList25);
        org.junit.Assert.assertNotNull(strComparableItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(node73);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType9 = functionType5.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean10 = jSType9.isNullType();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable18 = functionType16.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType16.unboxesTo();
        boolean boolean21 = functionType16.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType22 = functionType16.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType23 = functionType16.dereference();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = jSType9.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType16);
        boolean boolean25 = functionType16.isStringObjectType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList26 = functionType16.getSubTypes();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(functionTypeList26);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node((-1), nodeArray1);
        int int3 = node2.getSourceOffset();
        boolean boolean4 = node2.isSyntheticBlock();
        // The following exception was thrown during execution in test generation
        try {
            node2.setDouble((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: ERROR 0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        boolean boolean17 = jSDocInfo15.containsDeclaration();
        functionType5.setPropertyJSDocInfo("STRING hi!", jSDocInfo15);
        java.lang.Iterable iterable19 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = functionType5.getTypeOfThis();
        boolean boolean21 = objectType20.canBeCalled();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterable19);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int19 = node18.getLineno();
        boolean boolean20 = node18.isEmpty();
        com.google.javascript.rhino.InputId inputId21 = com.google.javascript.jscomp.NodeUtil.getInputId(node18);
        boolean boolean22 = node14.isEquivalentToTyped(node18);
        boolean boolean23 = node18.isNE();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, false);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry26.createFunctionType(jSType27, jSTypeArray28);
        boolean boolean30 = functionType29.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = functionType29.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType29.unboxesTo();
        boolean boolean34 = functionType29.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType35 = functionType29.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType36 = functionType29.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, false);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry40.createFunctionType(jSType41, jSTypeArray42);
        boolean boolean44 = functionType43.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList49 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor50 = strComparableList49.iterator();
        boolean boolean51 = functionType43.equals((java.lang.Object) strComparableItor50);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, false);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry55.createFunctionType(jSType56, jSTypeArray57);
        boolean boolean59 = functionType58.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable60 = functionType58.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node61 = null;
        boolean boolean62 = functionType43.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType58, node61);
        boolean boolean64 = functionType58.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType65 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType58);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node73.setString("");
        com.google.javascript.rhino.Node node76 = node69.useSourceInfoIfMissingFromForTree(node73);
        boolean boolean77 = node69.isGetElem();
        com.google.javascript.rhino.Node node78 = node69.cloneNode();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node86.setString("");
        com.google.javascript.rhino.Node node89 = node82.useSourceInfoIfMissingFromForTree(node86);
        boolean boolean90 = node82.isGetElem();
        int int92 = node82.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node93 = com.google.javascript.jscomp.NodeUtil.newExpr(node82);
        com.google.javascript.rhino.Node node94 = node69.clonePropsFrom(node82);
        boolean boolean95 = node94.isNot();
        boolean boolean96 = functionType29.defineDeclaredProperty("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) objectType65, node94);
        com.google.javascript.rhino.Node node97 = node94.getParent();
        // The following exception was thrown during execution in test generation
        try {
            node18.addChildrenToFront(node97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(inputId21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strComparableList49);
        org.junit.Assert.assertNotNull(strComparableItor50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNull(node97);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType5.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = functionType5.dereference();
        boolean boolean13 = objectType12.isNominalType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, false);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry39.createFunctionType(jSType40, jSTypeArray41);
        boolean boolean43 = functionType42.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable44 = functionType42.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType42.unboxesTo();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection46 = jSTypeRegistry2.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, false);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node59.setString("");
        com.google.javascript.rhino.Node node62 = node55.useSourceInfoIfMissingFromForTree(node59);
        node59.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, false);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry67.createFunctionType(jSType68, jSTypeArray69);
        boolean boolean71 = functionType70.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType72 = jSTypeRegistry50.createObjectType("hi!", node59, (com.google.javascript.rhino.jstype.ObjectType) functionType70);
        jSTypeRegistry2.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) objectType72);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative74 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry2.getNativeType(jSTypeNative74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable44);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertNotNull(functionTypeCollection46);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objectType72);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = new com.google.javascript.rhino.JSTypeExpression(node3, "STRING hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        com.google.javascript.rhino.Node node29 = node20.cloneNode();
        boolean boolean30 = node29.isDebugger();
        node3.addChildToFront(node29);
        boolean boolean32 = node29.isFromExterns();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString((int) (short) 10, "hi!");
        boolean boolean36 = node35.isIn();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node44.setString("");
        com.google.javascript.rhino.Node node47 = node40.useSourceInfoIfMissingFromForTree(node44);
        boolean boolean48 = node40.isGetElem();
        com.google.javascript.rhino.Node node49 = node40.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node40);
        boolean boolean51 = node40.isNot();
        int int52 = node40.getSourceOffset();
        // The following exception was thrown during execution in test generation
        try {
            node29.addChildrenAfter(node35, node40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(staticSourceFile50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, false);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry39.createFunctionType(jSType40, jSTypeArray41);
        boolean boolean43 = functionType42.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable44 = functionType42.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType42.unboxesTo();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection46 = jSTypeRegistry2.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, false);
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSTypeRegistry49.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, false);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry54.createFunctionType(jSType55, jSTypeArray56);
        boolean boolean58 = functionType57.isNominalType();
        boolean boolean59 = jSTypeRegistry49.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType57);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node68.setString("");
        com.google.javascript.rhino.Node node71 = node64.useSourceInfoIfMissingFromForTree(node68);
        boolean boolean72 = node64.isGetElem();
        com.google.javascript.rhino.Node node73 = node64.cloneNode();
        boolean boolean74 = node73.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile75 = node73.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, false);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79, false);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray83 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry81.createFunctionType(jSType82, jSTypeArray83);
        com.google.javascript.rhino.JSDocInfo jSDocInfo86 = functionType84.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType87 = jSTypeRegistry78.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType84);
        com.google.javascript.rhino.JSDocInfo jSDocInfo88 = functionType84.getJSDocInfo();
        boolean boolean90 = functionType84.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry49.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node73, (com.google.javascript.rhino.jstype.JSType) functionType84);
        boolean boolean93 = jSTypeRegistry2.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType84, "PARAM_LIST");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative94 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray95 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative94 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType96 = jSTypeRegistry2.createUnionType(jSTypeNativeArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable44);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertNotNull(functionTypeCollection46);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(staticSourceFile75);
        org.junit.Assert.assertNotNull(jSTypeArray83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertNull(jSDocInfo86);
        org.junit.Assert.assertNotNull(jSType87);
        org.junit.Assert.assertNull(jSDocInfo88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(jSTypeNativeArray95);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        int int0 = com.google.javascript.rhino.jstype.JSType.ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node9.setString("");
        com.google.javascript.rhino.Node node12 = node5.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean13 = node5.isGetElem();
        int int15 = node5.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newExpr(node5);
        com.google.javascript.rhino.Node node17 = node5.detachFromParent();
        boolean boolean18 = node5.isQuotedString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(0, node1, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry14.createFunctionType(jSType15, jSTypeArray16);
        boolean boolean18 = functionType17.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = functionType17.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType17.unboxesTo();
        boolean boolean22 = functionType17.removeProperty("");
        int int23 = functionType17.getMaxArguments();
        java.lang.String str24 = functionType17.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isNominalType();
        functionType17.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType30);
        boolean boolean33 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType5, (com.google.javascript.rhino.jstype.JSType) functionType30);
        boolean boolean34 = functionType5.isNullType();
        boolean boolean35 = functionType5.isObject();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType36 = functionType5.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node18.setString("");
        com.google.javascript.rhino.Node node21 = node14.useSourceInfoIfMissingFromForTree(node18);
        node18.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        int int37 = node27.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        com.google.javascript.rhino.Node node39 = node18.srcrefTree(node38);
        java.lang.String str40 = node10.checkTreeEquals(node38);
        boolean boolean41 = node38.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node49.setString("");
        com.google.javascript.rhino.Node node52 = node45.useSourceInfoIfMissingFromForTree(node49);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node60.setString("");
        com.google.javascript.rhino.Node node63 = node56.useSourceInfoIfMissingFromForTree(node60);
        node60.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node73.setString("");
        com.google.javascript.rhino.Node node76 = node69.useSourceInfoIfMissingFromForTree(node73);
        boolean boolean77 = node69.isGetElem();
        int int79 = node69.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.newExpr(node69);
        com.google.javascript.rhino.Node node81 = node60.srcrefTree(node80);
        java.lang.String str82 = node52.checkTreeEquals(node80);
        com.google.javascript.rhino.Node node83 = node38.useSourceInfoFrom(node80);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags85 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            node38.setSideEffectFlags(sideEffectFlags85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got EXPR_RESULT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str40, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str82, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertNotNull(node83);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        int int0 = com.google.javascript.rhino.Node.SYNTHETIC_BLOCK_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 38 + "'", int0 == 38);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node18.setString("");
        com.google.javascript.rhino.Node node21 = node14.useSourceInfoIfMissingFromForTree(node18);
        node18.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        int int37 = node27.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        com.google.javascript.rhino.Node node39 = node18.srcrefTree(node38);
        java.lang.String str40 = node10.checkTreeEquals(node38);
        boolean boolean41 = node38.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node49.setString("");
        com.google.javascript.rhino.Node node52 = node45.useSourceInfoIfMissingFromForTree(node49);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node60.setString("");
        com.google.javascript.rhino.Node node63 = node56.useSourceInfoIfMissingFromForTree(node60);
        node60.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node73.setString("");
        com.google.javascript.rhino.Node node76 = node69.useSourceInfoIfMissingFromForTree(node73);
        boolean boolean77 = node69.isGetElem();
        int int79 = node69.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.newExpr(node69);
        com.google.javascript.rhino.Node node81 = node60.srcrefTree(node80);
        java.lang.String str82 = node52.checkTreeEquals(node80);
        com.google.javascript.rhino.Node node83 = node38.useSourceInfoFrom(node80);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection84 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node83);
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator85 = nodeCollection84.spliterator();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str40, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str82, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(nodeCollection84);
        org.junit.Assert.assertNotNull(nodeSpliterator85);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean3 = jSDocInfo0.hasDescriptionForParameter("hi!");
        boolean boolean4 = jSDocInfo0.hasModifies();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = functionType18.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType18.unboxesTo();
        boolean boolean23 = functionType18.removeProperty("");
        int int24 = functionType18.getMaxArguments();
        java.lang.String str25 = functionType18.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        boolean boolean32 = functionType31.isNominalType();
        functionType18.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType31);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = functionType39.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.unboxesTo();
        boolean boolean44 = functionType39.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType45 = functionType39.getImplicitPrototype();
        functionType18.setPrototypeBasedOn(objectType45);
        boolean boolean48 = jSTypeRegistry12.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType18, "hi!");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node65.setString("");
        com.google.javascript.rhino.Node node68 = node61.useSourceInfoIfMissingFromForTree(node65);
        node65.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, false);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry73.createFunctionType(jSType74, jSTypeArray75);
        boolean boolean77 = functionType76.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType78 = jSTypeRegistry56.createObjectType("hi!", node65, (com.google.javascript.rhino.jstype.ObjectType) functionType76);
        com.google.javascript.rhino.jstype.ObjectType objectType79 = jSTypeRegistry12.createObjectType("", node53, (com.google.javascript.rhino.jstype.ObjectType) functionType76);
        boolean boolean80 = functionType76.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType82 = functionType76.getPropertyType("PARAM_LIST");
        boolean boolean83 = functionType76.isNativeObjectType();
        int int84 = strComparableList9.lastIndexOf((java.lang.Object) boolean83);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean86 = strComparableList9.add((java.lang.Comparable<java.lang.String>) "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExterns();
        boolean boolean3 = jSDocInfo0.hasModifies();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry2.getNativeFunctionType(jSTypeNative13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNull(errorReporter12);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        int int41 = node31.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node31);
        boolean boolean44 = node18.isGetElem();
        com.google.javascript.rhino.Node node45 = node14.useSourceInfoFrom(node18);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        boolean boolean58 = node50.isGetElem();
        com.google.javascript.rhino.Node node59 = node50.cloneNode();
        boolean boolean60 = node59.isContinue();
        com.google.javascript.rhino.Node node61 = node59.cloneTree();
        node61.setSourceEncodedPosition((int) (short) 10);
        boolean boolean64 = node61.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, false);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node76.setString("");
        com.google.javascript.rhino.Node node79 = node72.useSourceInfoIfMissingFromForTree(node76);
        node76.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, false);
        com.google.javascript.rhino.jstype.JSType jSType85 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray86 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry84.createFunctionType(jSType85, jSTypeArray86);
        boolean boolean88 = functionType87.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType89 = jSTypeRegistry67.createObjectType("hi!", node76, (com.google.javascript.rhino.jstype.ObjectType) functionType87);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray90 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node91 = jSTypeRegistry67.createParametersWithVarArgs(jSTypeArray90);
        boolean boolean92 = node91.isIn();
        com.google.javascript.rhino.Node node95 = new com.google.javascript.rhino.Node(52, node61, node91, 42, (int) (byte) 0);
        boolean boolean96 = node18.hasChild(node95);
        boolean boolean97 = node95.isHook();
        // The following exception was thrown during execution in test generation
        try {
            node95.setString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: INSTANCEOF 42 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(jSTypeArray86);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNotNull(jSTypeArray90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.isImplicitCast();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.containsDeclaration();
        boolean boolean7 = jSDocInfo0.hasType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative45 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry2.getNativeType(jSTypeNative45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(41);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node36.setString("");
        com.google.javascript.rhino.Node node39 = node32.useSourceInfoIfMissingFromForTree(node36);
        boolean boolean40 = node32.isGetElem();
        com.google.javascript.rhino.Node node41 = node32.cloneNode();
        boolean boolean42 = node41.isContinue();
        com.google.javascript.rhino.Node node43 = node41.cloneTree();
        node43.setSourceEncodedPosition((int) (short) 10);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile46 = node43.getStaticSourceFile();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        boolean boolean58 = node50.isGetElem();
        com.google.javascript.rhino.Node node59 = node50.cloneNode();
        boolean boolean60 = node59.isContinue();
        com.google.javascript.rhino.Node node61 = node59.cloneTree();
        node61.setSourceEncodedPosition((int) (short) 10);
        boolean boolean64 = node61.isSetterDef();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(41, node43, node61);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createInterfaceType("STRING hi!", node65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(staticSourceFile46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, false);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry8.createFunctionType(jSType9, jSTypeArray10);
        boolean boolean12 = functionType11.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = functionType18.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType18.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType18.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = functionType11.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType18);
        boolean boolean24 = functionType18.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        boolean boolean38 = functionType37.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = functionType37.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType40 = functionType37.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType41 = functionType37.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = functionType30.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.Node node43 = functionType30.getSource();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType30.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isNominalType();
        int int53 = functionType51.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList65 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor66 = strComparableList65.iterator();
        boolean boolean67 = functionType59.equals((java.lang.Object) strComparableItor66);
        com.google.javascript.rhino.Node node68 = functionType59.getSource();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.FunctionType> functionTypeList69 = com.google.common.collect.ImmutableList.of(functionType5, functionType18, functionType30, functionType51, functionType59);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, false);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray74 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry72.createFunctionType(jSType73, jSTypeArray74);
        boolean boolean76 = functionType75.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = functionType75.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType75.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean80 = functionType59.hasEqualCallType(functionType75);
        com.google.javascript.rhino.Node node82 = functionType59.getPropertyNode("true");
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strComparableList65);
        org.junit.Assert.assertNotNull(strComparableItor66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(functionTypeList69);
        org.junit.Assert.assertNotNull(jSTypeArray74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable77);
        org.junit.Assert.assertNotNull(jSType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(node82);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node7.isTry();
        com.google.javascript.rhino.Node node12 = node7.removeChildren();
        boolean boolean13 = node7.isStringKey();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = functionType20.getOwnPropertyJSDocInfo("");
        java.lang.Iterable iterable23 = functionType20.getCtorExtendedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            node7.putProp(16, (java.lang.Object) iterable23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.common.collect.EmptyImmutableList cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNull(jSDocInfo22);
        org.junit.Assert.assertNotNull(iterable23);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        node12.detachChildren();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags16 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            node12.setSideEffectFlags(sideEffectFlags16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry2.getNativeFunctionType(jSTypeNative12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList8 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableList8.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList10 = strComparableList8.reverse();
        boolean boolean11 = strSet2.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList8);
        java.io.IOException iOException13 = new java.io.IOException("");
        java.io.IOException iOException15 = new java.io.IOException("");
        iOException13.addSuppressed((java.lang.Throwable) iOException15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = strComparableList8.remove((java.lang.Object) iOException15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strComparableList8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = functionType5.getSlot("hi!");
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType5.unboxesTo();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSType10);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node18.setString("");
        com.google.javascript.rhino.Node node21 = node14.useSourceInfoIfMissingFromForTree(node18);
        node18.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        int int37 = node27.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        com.google.javascript.rhino.Node node39 = node18.srcrefTree(node38);
        java.lang.String str40 = node10.checkTreeEquals(node38);
        boolean boolean41 = node38.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node49.setString("");
        com.google.javascript.rhino.Node node52 = node45.useSourceInfoIfMissingFromForTree(node49);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node60.setString("");
        com.google.javascript.rhino.Node node63 = node56.useSourceInfoIfMissingFromForTree(node60);
        node60.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node73.setString("");
        com.google.javascript.rhino.Node node76 = node69.useSourceInfoIfMissingFromForTree(node73);
        boolean boolean77 = node69.isGetElem();
        int int79 = node69.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.newExpr(node69);
        com.google.javascript.rhino.Node node81 = node60.srcrefTree(node80);
        java.lang.String str82 = node52.checkTreeEquals(node80);
        com.google.javascript.rhino.Node node83 = node38.useSourceInfoFrom(node80);
        boolean boolean84 = node38.isDelProp();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable85 = node38.getAncestors();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor86 = ancestorIterable85.iterator();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str40, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str82, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(ancestorIterable85);
        org.junit.Assert.assertNotNull(nodeItor86);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1, false);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node12.setString("");
        com.google.javascript.rhino.Node node15 = node8.useSourceInfoIfMissingFromForTree(node12);
        node12.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry3.createObjectType("hi!", node12, (com.google.javascript.rhino.jstype.ObjectType) functionType23);
        int int26 = node12.getLineno();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(8, "unknown");
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node37.setString("");
        com.google.javascript.rhino.Node node40 = node33.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean41 = node33.isGetElem();
        com.google.javascript.rhino.Node node42 = node33.cloneNode();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node50.setString("");
        com.google.javascript.rhino.Node node53 = node46.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean54 = node46.isGetElem();
        int int56 = node46.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newExpr(node46);
        com.google.javascript.rhino.Node node58 = node33.clonePropsFrom(node46);
        com.google.javascript.rhino.Node[] nodeArray59 = new com.google.javascript.rhino.Node[] { node12, node29, node46 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (byte) 1, nodeArray59, 32, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(nodeArray59);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry2.getNativeObjectType(jSTypeNative27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        int int0 = com.google.javascript.rhino.Node.IS_CONSTANT_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 43 + "'", int0 == 43);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList8 = functionType5.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, false);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry11.createFunctionType(jSType12, jSTypeArray13);
        boolean boolean15 = functionType14.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable16 = functionType14.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType14.unboxesTo();
        boolean boolean19 = functionType14.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType20 = functionType14.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = functionType14.dereference();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType5.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        int int34 = functionType28.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, false);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry37.createFunctionType(jSType38, jSTypeArray39);
        boolean boolean41 = functionType40.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable42 = functionType40.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType40.unboxesTo();
        boolean boolean45 = functionType40.removeProperty("");
        int int46 = functionType40.getMaxArguments();
        java.lang.String str47 = functionType40.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, false);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry50.createFunctionType(jSType51, jSTypeArray52);
        boolean boolean54 = functionType53.isNominalType();
        functionType40.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType53);
        boolean boolean56 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType28, (com.google.javascript.rhino.jstype.JSType) functionType53);
        boolean boolean57 = functionType28.isNullType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, false);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry60.createFunctionType(jSType61, jSTypeArray62);
        boolean boolean64 = functionType63.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable65 = functionType63.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType63.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean68 = functionType63.matchesUint32Context();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, false);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray73 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry71.createFunctionType(jSType72, jSTypeArray73);
        boolean boolean75 = functionType74.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable76 = functionType74.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType78 = functionType74.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79, false);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray83 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry81.createFunctionType(jSType82, jSTypeArray83);
        boolean boolean85 = functionType84.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable86 = functionType84.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType87 = functionType84.unboxesTo();
        boolean boolean89 = functionType84.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType90 = functionType84.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType91 = functionType84.dereference();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList92 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.jstype.ObjectType) functionType5, (com.google.javascript.rhino.jstype.ObjectType) functionType28, (com.google.javascript.rhino.jstype.ObjectType) functionType63, (com.google.javascript.rhino.jstype.ObjectType) functionType74, objectType91);
        int int93 = objectType91.getPropertiesCount();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(functionTypeList8);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable42);
        org.junit.Assert.assertNull(jSType43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable65);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSTypeArray73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable76);
        org.junit.Assert.assertNotNull(jSType78);
        org.junit.Assert.assertNotNull(jSTypeArray83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable86);
        org.junit.Assert.assertNull(jSType87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objectType90);
        org.junit.Assert.assertNotNull(objectType91);
        org.junit.Assert.assertNotNull(objectTypeList92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        int int41 = node31.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node31);
        boolean boolean44 = node18.isGetElem();
        com.google.javascript.rhino.Node node45 = node14.useSourceInfoFrom(node18);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        boolean boolean58 = node50.isGetElem();
        com.google.javascript.rhino.Node node59 = node50.cloneNode();
        boolean boolean60 = node59.isContinue();
        com.google.javascript.rhino.Node node61 = node59.cloneTree();
        node61.setSourceEncodedPosition((int) (short) 10);
        boolean boolean64 = node61.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, false);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node76.setString("");
        com.google.javascript.rhino.Node node79 = node72.useSourceInfoIfMissingFromForTree(node76);
        node76.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, false);
        com.google.javascript.rhino.jstype.JSType jSType85 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray86 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry84.createFunctionType(jSType85, jSTypeArray86);
        boolean boolean88 = functionType87.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType89 = jSTypeRegistry67.createObjectType("hi!", node76, (com.google.javascript.rhino.jstype.ObjectType) functionType87);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray90 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node91 = jSTypeRegistry67.createParametersWithVarArgs(jSTypeArray90);
        boolean boolean92 = node91.isIn();
        com.google.javascript.rhino.Node node95 = new com.google.javascript.rhino.Node(52, node61, node91, 42, (int) (byte) 0);
        boolean boolean96 = node18.hasChild(node95);
        boolean boolean97 = node95.isBlock();
        node95.setIsSyntheticBlock(false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(jSTypeArray86);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNotNull(jSTypeArray90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable12 = functionType10.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property15 = functionType10.getSlot("unknown");
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType10);
        boolean boolean17 = jSType16.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(property15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        node7.setSourceEncodedPositionForTree((int) '#');
        boolean boolean13 = node7.isOr();
        boolean boolean14 = node7.isWith();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = functionType5.getOwnPropertyJSDocInfo("");
        java.lang.Iterable iterable8 = functionType5.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, false);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = jSTypeRegistry12.createAnonymousObjectType();
        boolean boolean14 = objectType13.isNominalType();
        boolean boolean15 = objectType13.isNominalType();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, false);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry21.createFunctionType(jSType22, jSTypeArray23);
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = functionType24.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType27 = jSTypeRegistry18.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType24);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node39.setString("");
        com.google.javascript.rhino.Node node42 = node35.useSourceInfoIfMissingFromForTree(node39);
        node39.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType52 = jSTypeRegistry30.createObjectType("hi!", node39, (com.google.javascript.rhino.jstype.ObjectType) functionType50);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node54 = jSTypeRegistry30.createParametersWithVarArgs(jSTypeArray53);
        com.google.javascript.rhino.Node node55 = jSTypeRegistry18.createParametersWithVarArgs(jSTypeArray53);
        boolean boolean56 = functionType5.defineInferredProperty("hi!", (com.google.javascript.rhino.jstype.JSType) objectType13, node55);
        boolean boolean57 = objectType13.isTemplateType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertNotNull(iterable8);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNull(jSDocInfo26);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isDebugger();
        boolean boolean14 = node12.isArrayLit();
        boolean boolean15 = node12.isReturn();
        node12.setString("JSDocInfo");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags19 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (short) 10);
        sideEffectFlags19.setMutatesArguments();
        // The following exception was thrown during execution in test generation
        try {
            node12.setSideEffectFlags(sideEffectFlags19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        boolean boolean46 = enumType44.matchesNumberContext();
        com.google.javascript.rhino.jstype.EnumType enumType47 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = enumType47.getOwnPropertyJSDocInfo("([, hi!, STRING hi!, STRING hi!])");
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(enumType47);
        org.junit.Assert.assertNull(jSDocInfo49);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        boolean boolean17 = jSDocInfo15.containsDeclaration();
        functionType5.setPropertyJSDocInfo("STRING hi!", jSDocInfo15);
        java.util.Collection<java.lang.String> strCollection19 = jSDocInfo15.getAuthors();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strCollection19);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        node24.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry15.createObjectType("hi!", node24, (com.google.javascript.rhino.jstype.ObjectType) functionType35);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node39 = jSTypeRegistry15.createParametersWithVarArgs(jSTypeArray38);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, false);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry43.createFunctionType(jSType44, jSTypeArray45);
        boolean boolean47 = functionType46.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = functionType46.getCtorImplementedInterfaces();
        jSTypeRegistry15.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean50 = functionType46.isUnknownType();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry2.overwriteDeclaredType("Unknown class name", (com.google.javascript.rhino.jstype.JSType) functionType46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        functionType5.setJSDocInfo(jSDocInfo9);
        boolean boolean11 = jSDocInfo9.isHidden();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo9.getReturnType();
        java.lang.String str13 = jSDocInfo9.getLicense();
        boolean boolean14 = jSDocInfo9.hasModifies();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable12 = functionType10.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property15 = functionType10.getSlot("unknown");
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = jSTypeRegistry2.getErrorReporter();
        boolean boolean18 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry2.getNativeFunctionType(jSTypeNative19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(property15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNull(errorReporter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        boolean boolean7 = functionType5.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = functionType5.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, false);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry11.createFunctionType(jSType12, jSTypeArray13);
        boolean boolean15 = functionType14.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable16 = functionType14.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType14.unboxesTo();
        boolean boolean19 = functionType14.removeProperty("");
        int int20 = functionType14.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType26.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.unboxesTo();
        boolean boolean31 = functionType26.removeProperty("");
        int int32 = functionType26.getMaxArguments();
        java.lang.String str33 = functionType26.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isNominalType();
        functionType26.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType39);
        boolean boolean42 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType14, (com.google.javascript.rhino.jstype.JSType) functionType39);
        boolean boolean43 = functionType14.isNullType();
        boolean boolean44 = functionType5.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType14);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType50.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.unboxesTo();
        boolean boolean55 = functionType50.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType50.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType50.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType50.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, false);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry61.createFunctionType(jSType62, jSTypeArray63);
        boolean boolean65 = functionType64.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = functionType64.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType64.unboxesTo();
        boolean boolean69 = functionType64.removeProperty("");
        int int70 = functionType64.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, false);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry73.createFunctionType(jSType74, jSTypeArray75);
        boolean boolean77 = functionType76.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = functionType76.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType76.unboxesTo();
        boolean boolean81 = functionType76.removeProperty("");
        int int82 = functionType76.getMaxArguments();
        java.lang.String str83 = functionType76.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84, false);
        com.google.javascript.rhino.jstype.JSType jSType87 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry86.createFunctionType(jSType87, jSTypeArray88);
        boolean boolean90 = functionType89.isNominalType();
        functionType76.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType89);
        boolean boolean92 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType64, (com.google.javascript.rhino.jstype.JSType) functionType89);
        boolean boolean93 = functionType64.isNullType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> jSTypeList94 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.jstype.JSType) functionType50, (com.google.javascript.rhino.jstype.JSType) functionType64);
        functionType5.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType50);
        boolean boolean96 = functionType50.isAllType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo97 = functionType50.getJSDocInfo();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNull(jSType57);
        org.junit.Assert.assertNull(jSType58);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable78);
        org.junit.Assert.assertNull(jSType79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(jSTypeList94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNull(jSDocInfo97);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, false);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        node54.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, false);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry62.createFunctionType(jSType63, jSTypeArray64);
        boolean boolean66 = functionType65.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry45.createObjectType("hi!", node54, (com.google.javascript.rhino.jstype.ObjectType) functionType65);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry1.createObjectType("", node42, (com.google.javascript.rhino.jstype.ObjectType) functionType65);
        boolean boolean69 = objectType68.isEnumType();
        com.google.javascript.rhino.jstype.ObjectType.Property property71 = objectType68.getOwnSlot("hi!");
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate72 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = objectType68.setValidator(jSTypePredicate72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(property71);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        int int41 = node31.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node31);
        boolean boolean44 = node18.isGetElem();
        com.google.javascript.rhino.Node node45 = node14.useSourceInfoFrom(node18);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        boolean boolean58 = node50.isGetElem();
        com.google.javascript.rhino.Node node59 = node50.cloneNode();
        boolean boolean60 = node59.isContinue();
        com.google.javascript.rhino.Node node61 = node59.cloneTree();
        node61.setSourceEncodedPosition((int) (short) 10);
        boolean boolean64 = node61.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, false);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node76.setString("");
        com.google.javascript.rhino.Node node79 = node72.useSourceInfoIfMissingFromForTree(node76);
        node76.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, false);
        com.google.javascript.rhino.jstype.JSType jSType85 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray86 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry84.createFunctionType(jSType85, jSTypeArray86);
        boolean boolean88 = functionType87.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType89 = jSTypeRegistry67.createObjectType("hi!", node76, (com.google.javascript.rhino.jstype.ObjectType) functionType87);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray90 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node91 = jSTypeRegistry67.createParametersWithVarArgs(jSTypeArray90);
        boolean boolean92 = node91.isIn();
        com.google.javascript.rhino.Node node95 = new com.google.javascript.rhino.Node(52, node61, node91, 42, (int) (byte) 0);
        boolean boolean96 = node18.hasChild(node95);
        boolean boolean97 = node95.isHook();
        node95.detachChildren();
        boolean boolean99 = node95.isInc();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(jSTypeArray86);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNotNull(jSTypeArray90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        boolean boolean32 = functionType31.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = functionType31.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType31.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        functionType31.setJSDocInfo(jSDocInfo35);
        boolean boolean37 = jSDocInfo35.isHidden();
        functionType22.setPropertyJSDocInfo("", jSDocInfo35);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression39 = jSDocInfo35.getType();
        boolean boolean40 = jSDocInfo35.isConstructor();
        boolean boolean41 = jSDocInfo35.isDefine();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSTypeExpression39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.Node node14 = functionType5.getSource();
        boolean boolean15 = functionType5.isNumberObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType17 = functionType5.getBindReturnType(0);
        boolean boolean18 = functionType5.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType5.findPropertyType("STRING hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = jSType20.hasDisplayName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType23.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType23.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType23.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = functionType16.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.Node node29 = functionType16.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList41 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor42 = strComparableList41.iterator();
        boolean boolean43 = functionType35.equals((java.lang.Object) strComparableItor42);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType50.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node53 = null;
        boolean boolean54 = functionType35.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType50, node53);
        boolean boolean56 = functionType50.removeProperty("Not declared as a type name");
        boolean boolean57 = functionType16.hasEqualCallType(functionType50);
        boolean boolean58 = strComparableList9.equals((java.lang.Object) functionType16);
        boolean boolean59 = functionType16.isNativeObjectType();
        boolean boolean60 = functionType16.isBooleanValueType();
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strComparableList41);
        org.junit.Assert.assertNotNull(strComparableItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        boolean boolean38 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative39 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray40 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative39 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createUnionType(jSTypeNativeArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeNativeArray40);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        java.lang.String str11 = node3.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility14 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo12.setVisibility(visibility14);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo12.getEnumParameterType();
        node3.setJSDocInfo(jSDocInfo12);
        jSDocInfo12.setLicense("");
        boolean boolean20 = jSDocInfo12.hasThisType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList21 = jSDocInfo12.getThrownTypes();
        java.util.Set<java.lang.String> strSet22 = jSDocInfo12.getModifies();
        java.util.Collection<java.lang.String> strCollection23 = jSDocInfo12.getReferences();
        java.lang.String str24 = jSDocInfo12.getLendsName();
        boolean boolean25 = jSDocInfo12.isHidden();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "STRING hi!" + "'", str11, "STRING hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + visibility14 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility14.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNull(jSTypeExpression16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(strCollection23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = jSTypeRegistry2.getType(jSTypeStaticScope4, "unknown", "Named type with empty name component", (int) (short) 1, 46);
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSType9);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("STRING hi!");
        java.lang.String str2 = inputId1.getIdName();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        boolean boolean15 = node7.isGetElem();
        com.google.javascript.rhino.Node node16 = node7.cloneNode();
        boolean boolean17 = node16.isContinue();
        com.google.javascript.rhino.Node node18 = node16.cloneTree();
        node18.setSourceEncodedPosition((int) (short) 10);
        boolean boolean21 = node18.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, false);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node33.setString("");
        com.google.javascript.rhino.Node node36 = node29.useSourceInfoIfMissingFromForTree(node33);
        node33.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry24.createObjectType("hi!", node33, (com.google.javascript.rhino.jstype.ObjectType) functionType44);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node48 = jSTypeRegistry24.createParametersWithVarArgs(jSTypeArray47);
        boolean boolean49 = node48.isIn();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(52, node18, node48, 42, (int) (byte) 0);
        boolean boolean53 = node18.isContinue();
        boolean boolean54 = node18.isGetProp();
        com.google.javascript.rhino.Node node55 = node18.getFirstChild();
        boolean boolean56 = inputId1.equals((java.lang.Object) node18);
        java.lang.String str57 = inputId1.getIdName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "STRING hi!" + "'", str2, "STRING hi!");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "STRING hi!" + "'", str57, "STRING hi!");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1, false);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node12.setString("");
        com.google.javascript.rhino.Node node15 = node8.useSourceInfoIfMissingFromForTree(node12);
        node12.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry3.createObjectType("hi!", node12, (com.google.javascript.rhino.jstype.ObjectType) functionType23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node33.setString("");
        com.google.javascript.rhino.Node node36 = node29.useSourceInfoIfMissingFromForTree(node33);
        boolean boolean37 = node29.isGetElem();
        com.google.javascript.rhino.Node node38 = node29.cloneNode();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node46.setString("");
        com.google.javascript.rhino.Node node49 = node42.useSourceInfoIfMissingFromForTree(node46);
        boolean boolean50 = node42.isGetElem();
        int int52 = node42.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newExpr(node42);
        com.google.javascript.rhino.Node node54 = node29.clonePropsFrom(node42);
        boolean boolean55 = node54.isNot();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node54.siblings();
        boolean boolean57 = node54.isOr();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship58 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node12, node54);
        boolean boolean59 = node12.isGetterDef();
        // The following exception was thrown during execution in test generation
        try {
            node12.setDouble((double) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING  is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, false);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry10.createFunctionType(jSType11, jSTypeArray12);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = functionType13.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry7.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType13);
        boolean boolean17 = functionType13.isOrdinaryFunction();
        boolean boolean18 = functionType13.isFunctionPrototypeType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry21.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, false);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry26.createFunctionType(jSType27, jSTypeArray28);
        boolean boolean30 = functionType29.isNominalType();
        boolean boolean31 = jSTypeRegistry21.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType29);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node40.setString("");
        com.google.javascript.rhino.Node node43 = node36.useSourceInfoIfMissingFromForTree(node40);
        boolean boolean44 = node36.isGetElem();
        com.google.javascript.rhino.Node node45 = node36.cloneNode();
        boolean boolean46 = node45.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile47 = node45.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, false);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, false);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry53.createFunctionType(jSType54, jSTypeArray55);
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = functionType56.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry50.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType56);
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = functionType56.getJSDocInfo();
        boolean boolean62 = functionType56.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType63 = jSTypeRegistry21.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node45, (com.google.javascript.rhino.jstype.JSType) functionType56);
        com.google.javascript.rhino.Node node64 = enumType63.getSource();
        java.lang.String str65 = enumType63.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = enumType63.getOwnPropertyJSDocInfo("true");
        boolean boolean68 = enumType63.matchesNumberContext();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry2.createFunctionTypeWithNewThisType(functionType13, (com.google.javascript.rhino.jstype.ObjectType) enumType63);
        boolean boolean70 = functionType13.isRecordType();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(staticSourceFile47);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNull(jSDocInfo58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNull(jSDocInfo60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(enumType63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}" + "'", str65, "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}");
        org.junit.Assert.assertNull(jSDocInfo67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, false);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        node54.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, false);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry62.createFunctionType(jSType63, jSTypeArray64);
        boolean boolean66 = functionType65.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry45.createObjectType("hi!", node54, (com.google.javascript.rhino.jstype.ObjectType) functionType65);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry1.createObjectType("", node42, (com.google.javascript.rhino.jstype.ObjectType) functionType65);
        boolean boolean69 = functionType65.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType65.getPropertyType("PARAM_LIST");
        boolean boolean73 = functionType65.isPropertyTypeInferred("[, hi!, STRING hi!, STRING hi!]");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType74 = functionType65.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition2 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int3 = namePosition2.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition4 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int5 = namePosition4.getPositionOnEndLine();
        int int6 = namePosition4.getEndLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition7 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int8 = namePosition7.getPositionOnEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList9 = com.google.common.collect.ImmutableList.of(namePosition0, namePosition2, namePosition4, namePosition7);
        com.google.javascript.rhino.Node node10 = namePosition4.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(namePositionList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int8 = node7.getLineno();
        boolean boolean9 = node7.isEmpty();
        node7.setSourceEncodedPosition(54);
        int int12 = node7.getChildCount();
        boolean boolean13 = node7.isQuotedString();
        int int14 = node7.getType();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        int int41 = node31.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node31);
        boolean boolean44 = node43.isReturn();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry47.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, false);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry52.createFunctionType(jSType53, jSTypeArray54);
        boolean boolean56 = functionType55.isNominalType();
        boolean boolean57 = jSTypeRegistry47.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType55);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node66.setString("");
        com.google.javascript.rhino.Node node69 = node62.useSourceInfoIfMissingFromForTree(node66);
        boolean boolean70 = node62.isGetElem();
        com.google.javascript.rhino.Node node71 = node62.cloneNode();
        boolean boolean72 = node71.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile73 = node71.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, false);
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77, false);
        com.google.javascript.rhino.jstype.JSType jSType80 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray81 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry79.createFunctionType(jSType80, jSTypeArray81);
        com.google.javascript.rhino.JSDocInfo jSDocInfo84 = functionType82.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType85 = jSTypeRegistry76.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType82);
        com.google.javascript.rhino.JSDocInfo jSDocInfo86 = functionType82.getJSDocInfo();
        boolean boolean88 = functionType82.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType89 = jSTypeRegistry47.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node71, (com.google.javascript.rhino.jstype.JSType) functionType82);
        com.google.javascript.rhino.Node node90 = enumType89.getSource();
        boolean boolean92 = enumType89.removeProperty("function (): {621165152}");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry2.createConstructorType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node7, node43, (com.google.javascript.rhino.jstype.JSType) enumType89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 40 + "'", int14 == 40);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(staticSourceFile73);
        org.junit.Assert.assertNotNull(jSTypeArray81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertNull(jSDocInfo84);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertNull(jSDocInfo86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(enumType89);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        int int41 = node31.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node31);
        boolean boolean44 = node18.isGetElem();
        com.google.javascript.rhino.Node node45 = node14.useSourceInfoFrom(node18);
        com.google.javascript.rhino.Node node46 = node45.removeFirstChild();
        java.lang.Appendable appendable47 = null;
        // The following exception was thrown during execution in test generation
        try {
            node46.appendStringTree(appendable47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType23.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType23.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType23.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = functionType16.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.Node node29 = functionType16.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList41 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor42 = strComparableList41.iterator();
        boolean boolean43 = functionType35.equals((java.lang.Object) strComparableItor42);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType50.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node53 = null;
        boolean boolean54 = functionType35.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType50, node53);
        boolean boolean56 = functionType50.removeProperty("Not declared as a type name");
        boolean boolean57 = functionType16.hasEqualCallType(functionType50);
        boolean boolean58 = strComparableList9.equals((java.lang.Object) functionType16);
        boolean boolean59 = functionType16.isNativeObjectType();
        java.util.Set<java.lang.String> strSet60 = functionType16.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType16.unboxesTo();
        boolean boolean62 = functionType16.isNoResolvedType();
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strComparableList41);
        org.junit.Assert.assertNotNull(strComparableItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = node12.getStaticSourceFile();
        com.google.javascript.rhino.Node node16 = node12.getChildAtIndex((int) (short) -1);
        node12.setCharno(53);
        boolean boolean19 = node12.isComma();
        boolean boolean20 = node12.isNoSideEffectsCall();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node12.siblings();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(staticSourceFile14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeIterable21);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry14.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, false);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry18.createFunctionType(jSType19, jSTypeArray20);
        boolean boolean22 = functionType21.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType21.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType21.unboxesTo();
        boolean boolean26 = functionType21.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType21.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType21.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType21.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = functionType35.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType38 = functionType35.unboxesTo();
        boolean boolean40 = functionType35.removeProperty("");
        int int41 = functionType35.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, false);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry44.createFunctionType(jSType45, jSTypeArray46);
        boolean boolean48 = functionType47.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = functionType47.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType47.unboxesTo();
        boolean boolean52 = functionType47.removeProperty("");
        int int53 = functionType47.getMaxArguments();
        java.lang.String str54 = functionType47.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, false);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry57.createFunctionType(jSType58, jSTypeArray59);
        boolean boolean61 = functionType60.isNominalType();
        functionType47.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType60);
        boolean boolean63 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType35, (com.google.javascript.rhino.jstype.JSType) functionType60);
        boolean boolean64 = functionType35.isNullType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> jSTypeList65 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.jstype.JSType) functionType21, (com.google.javascript.rhino.jstype.JSType) functionType35);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType15, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList65);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative67 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry2.getNativeFunctionType(jSTypeNative67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNull(jSType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable49);
        org.junit.Assert.assertNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSTypeList65);
        org.junit.Assert.assertNotNull(functionType66);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        com.google.javascript.rhino.Node node13 = node4.cloneNode();
        boolean boolean14 = node13.isContinue();
        com.google.javascript.rhino.Node node15 = node13.cloneTree();
        node15.setSourceEncodedPosition((int) (short) 10);
        boolean boolean18 = node15.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node30.setString("");
        com.google.javascript.rhino.Node node33 = node26.useSourceInfoIfMissingFromForTree(node30);
        node30.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, false);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        boolean boolean42 = functionType41.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry21.createObjectType("hi!", node30, (com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry21.createParametersWithVarArgs(jSTypeArray44);
        boolean boolean46 = node45.isIn();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(52, node15, node45, 42, (int) (byte) 0);
        boolean boolean50 = node49.isFalse();
        com.google.javascript.rhino.InputId inputId51 = com.google.javascript.jscomp.NodeUtil.getInputId(node49);
        int int52 = node49.getSourceOffset();
        boolean boolean53 = node49.isVoid();
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((-1), nodeArray56);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(44, nodeArray56, 40, 42);
        // The following exception was thrown during execution in test generation
        try {
            node49.removeChild(node60);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(inputId51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(nodeArray56);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int4 = node3.getLineno();
        boolean boolean5 = node3.isEmpty();
        com.google.javascript.rhino.InputId inputId6 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        boolean boolean7 = node3.isStringKey();
        boolean boolean8 = node3.isCase();
        boolean boolean9 = node3.isOnlyModifiesThisCall();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.Node node14 = functionType5.getSource();
        boolean boolean15 = functionType5.isNumberObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType17 = functionType5.getBindReturnType(0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType18 = functionType5.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(functionType17);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        node7.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node13 = node7.cloneNode();
        boolean boolean14 = node13.isDelProp();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        boolean boolean27 = node18.isFromExterns();
        boolean boolean28 = node18.isUnscopedQualifiedName();
        boolean boolean29 = node18.isVoid();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node37.setString("");
        com.google.javascript.rhino.Node node40 = node33.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean41 = node33.isGetElem();
        int int43 = node33.getIntProp((int) (byte) -1);
        boolean boolean44 = node33.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression46 = new com.google.javascript.rhino.JSTypeExpression(node33, "STRING hi!");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        boolean boolean58 = node50.isGetElem();
        com.google.javascript.rhino.Node node59 = node50.cloneNode();
        boolean boolean60 = node59.isDebugger();
        node33.addChildToFront(node59);
        // The following exception was thrown during execution in test generation
        try {
            node13.addChildAfter(node18, node59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, false);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry8.createFunctionType(jSType9, jSTypeArray10);
        boolean boolean12 = functionType11.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList17 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableList17.iterator();
        boolean boolean19 = functionType11.equals((java.lang.Object) strComparableItor18);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType26.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node29 = null;
        boolean boolean30 = functionType11.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType26, node29);
        boolean boolean32 = functionType26.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, false);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry35.createFunctionType(jSType36, jSTypeArray37);
        boolean boolean39 = functionType38.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList44 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor45 = strComparableList44.iterator();
        boolean boolean46 = functionType38.equals((java.lang.Object) strComparableItor45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, false);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry49.createFunctionType(jSType50, jSTypeArray51);
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = functionType52.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair55 = functionType38.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType52);
        boolean boolean56 = jSTypeRegistry2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType26, (com.google.javascript.rhino.jstype.ObjectType) functionType52);
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry2.getType("Not declared as a type name");
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int64 = node63.getLineno();
        boolean boolean65 = node63.isEmpty();
        com.google.javascript.rhino.InputId inputId66 = com.google.javascript.jscomp.NodeUtil.getInputId(node63);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry2.createInterfaceType("([, hi!, STRING hi!, STRING hi!])", node63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableList17);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strComparableList44);
        org.junit.Assert.assertNotNull(strComparableItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNull(jSDocInfo54);
        org.junit.Assert.assertNotNull(typePair55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(jSType58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(inputId66);
    }
}

