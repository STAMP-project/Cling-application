import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(0, 8);
        int int3 = node2.getLineno();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node5 = node4.getLastSibling();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(13, node9);
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(12);
        node13.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(6, node13);
        com.google.javascript.rhino.head.Node node18 = node17.getLastChild();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node9, node17, 0);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node23.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(20, node5, node9, node23);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node5.addChildToFront(node29);
        com.google.javascript.rhino.head.Node node31 = node5.getNext();
        java.lang.String str32 = node31.getJsDoc();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = null;
        java.lang.String str36 = node34.toStringTree(scriptNode35);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(13, node31, node34, (int) (byte) 0);
        int int39 = node34.getLineno();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(24, 9);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node(21, 3);
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) 0);
        com.google.javascript.rhino.head.ast.Comment comment7 = node6.getJsDocNode();
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        boolean boolean14 = node11.hasSideEffects();
        node9.addChildrenToFront(node11);
        boolean boolean16 = node11.hasSideEffects();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) ' ', node4, node6, node11);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node((int) '#', node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "40" + "'", str12, "40");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(0, "32");
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(13, node8);
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(12);
        node12.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(6, node12);
        com.google.javascript.rhino.head.Node node17 = node16.getLastChild();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node8, node16, 0);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) 1.0f);
        node16.addChildrenToFront(node21);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        boolean boolean29 = node26.hasSideEffects();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(0, node26);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str34 = node33.toString();
        boolean boolean35 = node33.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newString("");
        node37.removeProp(23);
        node33.addChildToFront(node37);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean43 = node42.hasChildren();
        node33.addChildrenToFront(node42);
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str47 = node46.toString();
        boolean boolean48 = node46.hasChildren();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (short) -1, node42, node46, (int) (short) 10);
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node26, node46, node53, (int) (short) 0);
        com.google.javascript.rhino.head.Node node57 = node55.setType(16);
        com.google.javascript.rhino.head.Node node58 = node55.getLastSibling();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node(21, node16, node58, (int) (byte) 10);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator61 = node60.new NodeIterator();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node(11, node3, node60, 1);
        // The following exception was thrown during execution in test generation
        try {
            node3.resetTargets();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "40" + "'", str27, "40");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "40" + "'", str34, "40");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-1" + "'", str47, "-1");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str9 = node8.toString();
        com.google.javascript.rhino.head.Node node10 = node8.getFirstChild();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString("");
        node17.removeProp(23);
        node13.addChildToFront(node17);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean23 = node22.hasChildren();
        node13.addChildrenToFront(node22);
        int int25 = node22.getLineno();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str28 = node27.toString();
        boolean boolean29 = node27.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("");
        node31.removeProp(23);
        node27.addChildToFront(node31);
        com.google.javascript.rhino.head.Node node35 = node27.getFirstChild();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (short) 0, node22, node27, 9);
        node8.addChildrenToFront(node37);
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node(100, node3, node6, node8, (int) ' ');
        com.google.javascript.rhino.head.Node node41 = node8.getLastSibling();
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node47 = node46.getLastSibling();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str52 = node51.toString();
        boolean boolean53 = node51.hasConsistentReturnUsage();
        boolean boolean54 = node51.hasSideEffects();
        node49.addChildrenToFront(node51);
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(26, node46, node49, 20);
        boolean boolean58 = node57.hasSideEffects();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node(97);
        int int61 = node60.getType();
        com.google.javascript.rhino.head.Node node63 = node60.setType(97);
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node(22, node57, node63, 25);
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) ' ', node8, node63, (int) (byte) 0);
        boolean boolean68 = node63.hasConsistentReturnUsage();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "40" + "'", str14, "40");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "40" + "'", str28, "40");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "40" + "'", str52, "40");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node3 = node2.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator4 = node3.new NodeIterator();
        node3.setLineno(13);
        boolean boolean7 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node14 = node10.setType(7);
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str19 = node18.toString();
        boolean boolean20 = node18.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newString("");
        node22.removeProp(23);
        node18.addChildToFront(node22);
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean28 = node27.hasChildren();
        node18.addChildrenToFront(node27);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str32 = node31.toString();
        boolean boolean33 = node31.hasChildren();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (short) -1, node27, node31, (int) (short) 10);
        com.google.javascript.rhino.head.Node node36 = node35.getLastChild();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str42 = node41.toString();
        boolean boolean43 = node41.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString("");
        node45.removeProp(23);
        node41.addChildToFront(node45);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) 'a', node41);
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str54 = node53.toString();
        com.google.javascript.rhino.head.Node node55 = node53.getLastChild();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node((int) (short) -1, node41, node51, node53, (int) (short) -1);
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (short) 1, node53, 12);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(23);
        node61.removeProp(25);
        boolean boolean64 = node61.hasChildren();
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((-1), node36, node53, node61);
        node10.addChildrenToBack(node61);
        node3.putProp(9, (java.lang.Object) node61);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor68 = node3.iterator();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "40" + "'", str19, "40");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-1" + "'", str32, "-1");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "40" + "'", str42, "40");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "40" + "'", str54, "40");
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(nodeItor68);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node(21, 12);
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node(41, node3, (int) (byte) -1);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("");
        node6.removeProp(23);
        node2.addChildToFront(node6);
        com.google.javascript.rhino.head.Node node10 = node2.getFirstChild();
        node10.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope13 = node10.getScope();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) ' ', node10, 2);
        boolean boolean16 = node15.hasChildren();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str20 = node19.toString();
        boolean boolean21 = node19.hasConsistentReturnUsage();
        boolean boolean22 = node19.hasSideEffects();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(0, node19);
        int int24 = node19.getLineno();
        node15.addChildToFront(node19);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator26 = node15.new NodeIterator();
        com.google.javascript.rhino.head.Node node27 = nodeIterator26.next();
        com.google.javascript.rhino.head.Node node28 = node27.getNext();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "40" + "'", str20, "40");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(25, 26);
        boolean boolean3 = node2.hasConsistentReturnUsage();
        // The following exception was thrown during execution in test generation
        try {
            node2.resetTargets();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        com.google.javascript.rhino.head.ast.Comment comment3 = null;
        node2.setJsDocNode(comment3);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node((int) (short) 100, node2, 100);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        boolean boolean8 = node5.hasSideEffects();
        node3.addChildrenToFront(node5);
        int int10 = node3.getType();
        com.google.javascript.rhino.head.Node node12 = node3.setType(23);
        com.google.javascript.rhino.head.Node node13 = node3.getFirstChild();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        boolean boolean20 = node17.hasSideEffects();
        node15.addChildrenToFront(node17);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString("");
        node27.removeProp(23);
        node23.addChildToFront(node27);
        com.google.javascript.rhino.head.Node node31 = node23.getFirstChild();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node31.addChildrenToBack(node33);
        node17.addChildrenToBack(node33);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str39 = node38.toString();
        boolean boolean40 = node38.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newString("");
        node42.removeProp(23);
        node38.addChildToFront(node42);
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean48 = node47.hasChildren();
        node38.addChildrenToFront(node47);
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str52 = node51.toString();
        boolean boolean53 = node51.hasConsistentReturnUsage();
        boolean boolean54 = node51.hasSideEffects();
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str57 = node56.toString();
        boolean boolean58 = node56.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node60 = com.google.javascript.rhino.head.Node.newString("");
        node60.removeProp(23);
        node56.addChildToFront(node60);
        com.google.javascript.rhino.head.Node node64 = node56.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment65 = node56.getJsDocNode();
        node51.addChildToBack(node56);
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node(15, node38, node51);
        node33.addChildrenToFront(node38);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(14, node13, node38, 16);
        node38.putIntProp((int) (byte) 100, (int) '#');
        com.google.javascript.rhino.head.Node node74 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node(0, node38, node74, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "40" + "'", str6, "40");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "40" + "'", str24, "40");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "40" + "'", str39, "40");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "40" + "'", str52, "40");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "40" + "'", str57, "40");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(comment65);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(3);
        java.lang.String str2 = node1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3" + "'", str2, "3");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) ' ', 18);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(0, 15);
        int int3 = node2.getLineno();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        boolean boolean8 = node5.hasSideEffects();
        node3.addChildrenToFront(node5);
        com.google.javascript.rhino.head.Node node10 = node5.getLastSibling();
        int int11 = node5.getLineno();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString("");
        node17.removeProp(23);
        node13.addChildToFront(node17);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean23 = node22.hasChildren();
        node13.addChildrenToFront(node22);
        int int25 = node22.getLineno();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (byte) 1);
        node27.removeProp((int) (short) 10);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (short) 10, node5, node22, node27, 0);
        java.lang.Object obj33 = node5.getProp((int) (byte) 1);
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str37 = node36.toString();
        boolean boolean38 = node36.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newString("");
        node40.removeProp(23);
        node36.addChildToFront(node40);
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean46 = node45.hasChildren();
        node36.addChildrenToFront(node45);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator48 = node45.new NodeIterator();
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str51 = node50.toString();
        com.google.javascript.rhino.head.Node node52 = node50.getLastSibling();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str56 = node55.toString();
        boolean boolean57 = node55.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newString("");
        node59.removeProp(23);
        node55.addChildToFront(node59);
        com.google.javascript.rhino.head.Node node63 = node55.getFirstChild();
        node63.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope66 = node63.getScope();
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node((int) ' ', node63, 2);
        com.google.javascript.rhino.head.Node node69 = node63.getLastSibling();
        node52.addChildToFront(node69);
        node45.addChildrenToFront(node52);
        int int74 = node52.getIntProp(0, (int) ' ');
        int int77 = node52.getIntProp(14, 6);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node(18, node52, (int) (short) 10);
        com.google.javascript.rhino.head.Node node81 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node83 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str84 = node83.toString();
        boolean boolean85 = node83.hasConsistentReturnUsage();
        boolean boolean86 = node83.hasSideEffects();
        node81.addChildrenToFront(node83);
        node83.removeChildren();
        com.google.javascript.rhino.head.Node node90 = com.google.javascript.rhino.head.Node.newString("hi!");
        node83.addChildrenToBack(node90);
        boolean boolean92 = node83.hasSideEffects();
        com.google.javascript.rhino.head.Node node93 = node83.getFirstChild();
        boolean boolean94 = node83.hasSideEffects();
        com.google.javascript.rhino.head.Node node96 = new com.google.javascript.rhino.head.Node(0, node5, node52, node83, (int) '#');
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator97 = node52.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            node52.resetTargets();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "40" + "'", str6, "40");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "40" + "'", str14, "40");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "40" + "'", str37, "40");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "40" + "'", str51, "40");
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "40" + "'", str56, "40");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(scope66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 32 + "'", int74 == 32);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 6 + "'", int77 == 6);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "40" + "'", str84, "40");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator97);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        node1.addChildrenToFront(node3);
        node3.removeChildren();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("hi!");
        node3.addChildrenToBack(node10);
        com.google.javascript.rhino.head.Node node13 = node3.setType((int) (short) -1);
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(19);
        node3.addChildToBack(node15);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator17 = node3.new NodeIterator();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("");
        node6.removeProp(23);
        node2.addChildToFront(node6);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean12 = node11.hasChildren();
        node2.addChildrenToFront(node11);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator14 = node11.new NodeIterator();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str17 = node16.toString();
        com.google.javascript.rhino.head.Node node18 = node16.getLastSibling();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString("");
        node25.removeProp(23);
        node21.addChildToFront(node25);
        com.google.javascript.rhino.head.Node node29 = node21.getFirstChild();
        node29.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope32 = node29.getScope();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) ' ', node29, 2);
        com.google.javascript.rhino.head.Node node35 = node29.getLastSibling();
        node18.addChildToFront(node35);
        node11.addChildrenToFront(node18);
        int int40 = node18.getIntProp(0, (int) ' ');
        int int43 = node18.getIntProp(14, 6);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(18, node18, (int) (short) 10);
        node45.removeProp(23);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Scope scope48 = node45.getScope();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "40" + "'", str17, "40");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 6 + "'", int43 == 6);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newString("");
        node4.removeProp(23);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        boolean boolean12 = node9.hasSideEffects();
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(0, node9);
        node4.addChildrenToBack(node13);
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(9, node4);
        node4.removeProp(4);
        com.google.javascript.rhino.head.Node node19 = node4.setType(23);
        node1.addChildrenToFront(node19);
        java.lang.Class<?> wildcardClass21 = node19.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "40" + "'", str10, "40");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        com.google.javascript.rhino.head.ast.Comment comment4 = null;
        node2.setJsDocNode(comment4);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("");
        node14.removeProp(23);
        node10.addChildToFront(node14);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node((int) 'a', node10);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        com.google.javascript.rhino.head.Node node24 = node22.getLastChild();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (short) -1, node10, node20, node22, (int) (short) -1);
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString("23");
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(26, node26, node28);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node(19, node2, node29, 17);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor32 = node2.iterator();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "40" + "'", str23, "40");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeItor32);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(12, "41");
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor3 = node2.iterator();
        com.google.javascript.rhino.head.ast.Scope scope4 = null;
        node2.setScope(scope4);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeItor3);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(23, "");
        java.lang.String str3 = node2.toString();
        java.lang.String str4 = node2.getString();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = node2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            node2.resetTargets();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23" + "'", str3, "23");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeItor5);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber(7.0d);
        node1.removeChildren();
        node1.removeProp(0);
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) 0);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(3, node7, 22);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator10 = node7.new NodeIterator();
        node1.addChildToFront(node7);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (byte) 1, "35");
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor3 = node2.iterator();
        boolean boolean4 = node2.hasSideEffects();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node(8, 0);
        java.lang.String str4 = node3.toString();
        int int7 = node3.getIntProp((int) (short) -1, (int) (short) 0);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str13 = node12.toString();
        boolean boolean14 = node12.hasConsistentReturnUsage();
        boolean boolean15 = node12.hasSideEffects();
        node10.addChildrenToFront(node12);
        node12.removeChildren();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString("hi!");
        node12.addChildrenToBack(node19);
        node19.setLineno(22);
        boolean boolean23 = node19.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString("-1");
        node25.removeProp(25);
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newString("");
        int int32 = node29.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str39 = node38.toString();
        boolean boolean40 = node38.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newString("");
        node42.removeProp(23);
        node38.addChildToFront(node42);
        com.google.javascript.rhino.head.Node node46 = node38.getFirstChild();
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node46.addChildrenToBack(node48);
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newString("");
        int int54 = node51.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node((int) (short) 10, node46, node51);
        com.google.javascript.rhino.head.Node node57 = node46.setType(18);
        node29.addChildAfter(node35, node57);
        node25.addChildToFront(node57);
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node19, node57);
        node3.addChildrenToBack(node19);
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str64 = node63.toString();
        boolean boolean65 = node63.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node67 = com.google.javascript.rhino.head.Node.newString("");
        node67.removeProp(23);
        node63.addChildToFront(node67);
        com.google.javascript.rhino.head.Node node72 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean73 = node72.hasChildren();
        node63.addChildrenToFront(node72);
        int int75 = node72.getLineno();
        int int76 = node72.getType();
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node(22, 7);
        com.google.javascript.rhino.head.Node node80 = new com.google.javascript.rhino.head.Node(10, node3, node72, node79);
        // The following exception was thrown during execution in test generation
        try {
            int int81 = node80.labelId();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8" + "'", str4, "8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "40" + "'", str13, "40");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "40" + "'", str39, "40");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "40" + "'", str64, "40");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 40 + "'", int76 == 40);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(3, 0);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        node4.addChildToFront(node8);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean14 = node13.hasChildren();
        node4.addChildrenToFront(node13);
        boolean boolean16 = node13.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator17 = node13.new NodeIterator();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        node2.replaceChildAfter(node13, node19);
        com.google.javascript.rhino.head.Node node21 = node2.getNext();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node((int) 'a', node3);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str16 = node15.toString();
        com.google.javascript.rhino.head.Node node17 = node15.getLastChild();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) -1, node3, node13, node15, (int) (short) -1);
        java.lang.Object obj21 = node3.getProp(0);
        java.lang.String str22 = node3.getJsDoc();
        node3.setLineno((int) (byte) 1);
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString(41, "12");
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str32 = node31.toString();
        boolean boolean33 = node31.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newString("");
        node35.removeProp(23);
        node31.addChildToFront(node35);
        com.google.javascript.rhino.head.Node node39 = node31.getFirstChild();
        node39.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope42 = node39.getScope();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) ' ', node39, 2);
        boolean boolean45 = node44.hasChildren();
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str49 = node48.toString();
        boolean boolean50 = node48.hasConsistentReturnUsage();
        boolean boolean51 = node48.hasSideEffects();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node(0, node48);
        int int53 = node48.getLineno();
        node44.addChildToFront(node48);
        boolean boolean55 = node48.hasSideEffects();
        boolean boolean56 = node48.hasChildren();
        node48.setLineno((int) (short) 1);
        double double59 = node48.getDouble();
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node(13, node66);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(12);
        node70.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(6, node70);
        com.google.javascript.rhino.head.Node node75 = node74.getLastChild();
        com.google.javascript.rhino.head.Node node77 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node66, node74, 0);
        com.google.javascript.rhino.head.Node node78 = new com.google.javascript.rhino.head.Node(17, node62, node77);
        com.google.javascript.rhino.head.Node node79 = node78.getLastSibling();
        node78.putIntProp((int) (byte) 100, (int) (byte) 0);
        node48.addChildToFront(node78);
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node(0, node28, node48);
        com.google.javascript.rhino.head.Node node86 = com.google.javascript.rhino.head.Node.newString("100");
        node86.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildBefore(node84, node86);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "40" + "'", str16, "40");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "40" + "'", str32, "40");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(scope42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "40" + "'", str49, "40");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 32.0d + "'", double59 == 32.0d);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node86);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node2 = node1.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator3 = node2.new NodeIterator();
        boolean boolean4 = nodeIterator3.hasNext();
        boolean boolean5 = nodeIterator3.hasNext();
        java.lang.Class<?> wildcardClass6 = nodeIterator3.getClass();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        boolean boolean11 = node8.hasSideEffects();
        node6.addChildrenToFront(node8);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(26, node3, node6, 20);
        int int15 = node6.getLineno();
        int int18 = node6.getIntProp(6, 8);
        java.lang.String str19 = node6.getJsDoc();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40" + "'", str9, "40");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) 1.0f);
        java.lang.Object obj4 = node2.getProp((int) 'a');
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = node2.iterator();
        int int8 = node2.getIntProp((int) (byte) -1, 17);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString("");
        node17.removeProp(23);
        node13.addChildToFront(node17);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean23 = node22.hasChildren();
        node13.addChildrenToFront(node22);
        int int25 = node22.getLineno();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str28 = node27.toString();
        boolean boolean29 = node27.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("");
        node31.removeProp(23);
        node27.addChildToFront(node31);
        com.google.javascript.rhino.head.Node node35 = node27.getFirstChild();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (short) 0, node22, node27, 9);
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str42 = node41.toString();
        boolean boolean43 = node41.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString("");
        node45.removeProp(23);
        node41.addChildToFront(node45);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) 'a', node41);
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str54 = node53.toString();
        com.google.javascript.rhino.head.Node node55 = node53.getLastChild();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node((int) (short) -1, node41, node51, node53, (int) (short) -1);
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str60 = node59.toString();
        boolean boolean61 = node59.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newString("");
        node63.removeProp(23);
        node59.addChildToFront(node63);
        com.google.javascript.rhino.head.Node node67 = node59.getFirstChild();
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node67.addChildrenToBack(node69);
        com.google.javascript.rhino.head.Node node71 = node69.getLastChild();
        java.lang.String str72 = node69.getJsDoc();
        java.lang.Object obj74 = node69.getProp(0);
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node(3, node22, node41, node69);
        com.google.javascript.rhino.head.ast.Comment comment76 = node75.getJsDocNode();
        com.google.javascript.rhino.head.Node node78 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str79 = node78.toString();
        boolean boolean80 = node78.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node82 = com.google.javascript.rhino.head.Node.newString("");
        node82.removeProp(23);
        node78.addChildToFront(node82);
        com.google.javascript.rhino.head.Node node86 = node78.getFirstChild();
        node86.setString("100");
        com.google.javascript.rhino.head.Node node89 = node86.getLastSibling();
        node75.addChildrenToBack(node86);
        node75.removeChildren();
        node2.putProp(32, (java.lang.Object) node75);
        com.google.javascript.rhino.head.Node node93 = new com.google.javascript.rhino.head.Node(18, node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(nodeItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "40" + "'", str14, "40");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "40" + "'", str28, "40");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "40" + "'", str42, "40");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "40" + "'", str54, "40");
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "40" + "'", str60, "40");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(comment76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "40" + "'", str79, "40");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNotNull(node89);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newString(19, "");
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node((int) (short) 1, node4, (int) (byte) 10);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(10, node4);
        // The following exception was thrown during execution in test generation
        try {
            node7.resetTargets();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) 7);
        node3.putIntProp(0, 18);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(0, node3);
        node7.putIntProp(14, 13);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str15 = node14.toString();
        boolean boolean16 = node14.hasConsistentReturnUsage();
        boolean boolean17 = node14.hasSideEffects();
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(0, node14);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.hasConsistentReturnUsage();
        boolean boolean24 = node21.hasSideEffects();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("");
        node30.removeProp(23);
        node26.addChildToFront(node30);
        com.google.javascript.rhino.head.Node node34 = node26.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment35 = node26.getJsDocNode();
        node21.addChildToBack(node26);
        boolean boolean37 = node26.hasConsistentReturnUsage();
        node14.putProp((int) (short) 1, (java.lang.Object) node26);
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) '#');
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) (short) 100, node14, node40, 17);
        node7.addChildrenToBack(node40);
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str47 = node46.toString();
        boolean boolean48 = node46.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newString("");
        node50.removeProp(23);
        node46.addChildToFront(node50);
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean56 = node55.hasChildren();
        node46.addChildrenToFront(node55);
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str60 = node59.toString();
        boolean boolean61 = node59.hasChildren();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) -1, node55, node59, (int) (short) 10);
        node59.setLineno(0);
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newString(24, "100");
        int int70 = node69.getType();
        boolean boolean71 = node69.hasChildren();
        com.google.javascript.rhino.head.Node node73 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str74 = node73.toString();
        boolean boolean75 = node73.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node77 = com.google.javascript.rhino.head.Node.newString("");
        node77.removeProp(23);
        node73.addChildToFront(node77);
        com.google.javascript.rhino.head.Node node82 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean83 = node82.hasChildren();
        node73.addChildrenToFront(node82);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator85 = node82.new NodeIterator();
        boolean boolean86 = node82.hasChildren();
        com.google.javascript.rhino.head.Node node87 = new com.google.javascript.rhino.head.Node(11, node69, node82);
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node7, node59, node87);
        // The following exception was thrown during execution in test generation
        try {
            node7.labelId((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "40" + "'", str15, "40");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "40" + "'", str27, "40");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(comment35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "40" + "'", str47, "40");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "-1" + "'", str60, "-1");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 24 + "'", int70 == 24);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "40" + "'", str74, "40");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString("");
        node3.removeProp(23);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        boolean boolean11 = node8.hasSideEffects();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(0, node8);
        node3.addChildrenToBack(node12);
        node1.addChildToFront(node3);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor15 = node1.iterator();
        com.google.javascript.rhino.head.Node node16 = node1.getFirstChild();
        boolean boolean17 = node16.hasSideEffects();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString("");
        node25.removeProp(23);
        node21.addChildToFront(node25);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) 'a', node21);
        boolean boolean30 = node29.hasSideEffects();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString("");
        node36.removeProp(23);
        node32.addChildToFront(node36);
        com.google.javascript.rhino.head.Node node40 = node32.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment41 = node32.getJsDocNode();
        int int42 = node32.getType();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator43 = node32.new NodeIterator();
        boolean boolean44 = nodeIterator43.hasNext();
        com.google.javascript.rhino.head.Node node45 = nodeIterator43.next();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString((int) (byte) -1, "100");
        node45.putProp((int) (byte) 100, (java.lang.Object) (byte) -1);
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node((int) ' ', node29, node45);
        node29.putIntProp(41, 9);
        node16.addChildrenToBack(node29);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40" + "'", str9, "40");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeItor15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "40" + "'", str33, "40");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(comment41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 40 + "'", int42 == 40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node(23, (int) (short) -1);
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        boolean boolean9 = node6.hasSideEffects();
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(0, node6);
        com.google.javascript.rhino.head.Node node11 = node10.getLastChild();
        node10.removeChildren();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(19, node3, node10, 24);
        com.google.javascript.rhino.head.Node node15 = node3.getLastSibling();
        com.google.javascript.rhino.head.Node node16 = node3.getLastSibling();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean19 = node18.hasChildren();
        java.lang.String str20 = node18.getJsDoc();
        com.google.javascript.rhino.head.Node node21 = node18.getLastSibling();
        node3.addChildToFront(node18);
        boolean boolean23 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node node24 = node3.getLastChild();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "40" + "'", str7, "40");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        node4.addChildToFront(node8);
        com.google.javascript.rhino.head.Node node12 = node4.getFirstChild();
        node12.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope15 = node12.getScope();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) ' ', node12, 2);
        boolean boolean18 = node17.hasChildren();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.hasConsistentReturnUsage();
        boolean boolean24 = node21.hasSideEffects();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(0, node21);
        int int26 = node21.getLineno();
        node17.addChildToFront(node21);
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newString("-1");
        node29.removeProp(25);
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node(7, node21, node29, 1);
        com.google.javascript.rhino.head.Node node35 = node33.setType(12);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator36 = node33.new NodeIterator();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("23");
        java.lang.Object obj40 = node38.getProp(17);
        boolean boolean41 = node38.hasSideEffects();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node(20, node33, node38, 0);
        int int44 = node38.getType();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 41 + "'", int44 == 41);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(32, 97);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean13 = node12.hasChildren();
        node3.addChildrenToFront(node12);
        int int15 = node12.getLineno();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        node21.removeProp(23);
        node17.addChildToFront(node21);
        com.google.javascript.rhino.head.Node node25 = node17.getFirstChild();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (short) 0, node12, node17, 9);
        boolean boolean28 = node12.hasSideEffects();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasConsistentReturnUsage();
        boolean boolean35 = node32.hasSideEffects();
        node30.addChildrenToFront(node32);
        node32.removeChildren();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("hi!");
        node32.addChildrenToBack(node39);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str43 = node42.toString();
        boolean boolean44 = node42.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newString("");
        node46.removeProp(23);
        node42.addChildToFront(node46);
        com.google.javascript.rhino.head.Node node50 = node42.getFirstChild();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node50.addChildrenToBack(node52);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node12, node32, node52);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator55 = node54.new NodeIterator();
        boolean boolean56 = nodeIterator55.hasNext();
        com.google.javascript.rhino.head.Node node57 = nodeIterator55.next();
        nodeIterator55.remove();
        nodeIterator55.remove();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "40" + "'", str33, "40");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "40" + "'", str43, "40");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(node57);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        boolean boolean5 = node2.hasSideEffects();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, node2);
        int int7 = node2.getLineno();
        com.google.javascript.rhino.head.ast.Comment comment8 = node2.getJsDocNode();
        int int11 = node2.getIntProp(15, 21);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(comment8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("");
        node2.removeProp(23);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = node2.iterator();
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(22, node2, 7);
        java.lang.String str8 = node7.getJsDoc();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        boolean boolean16 = node13.hasSideEffects();
        node11.addChildrenToFront(node13);
        node13.removeChildren();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        node21.removeProp(23);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        boolean boolean29 = node26.hasSideEffects();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(0, node26);
        node21.addChildrenToBack(node30);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(9, node21);
        node13.addChildrenToBack(node32);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(97);
        int int36 = node35.getType();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(7, node13, node35);
        // The following exception was thrown during execution in test generation
        try {
            node7.removeChild(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeItor5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "40" + "'", str14, "40");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "40" + "'", str27, "40");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("");
        int int4 = node1.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("");
        node14.removeProp(23);
        node10.addChildToFront(node14);
        com.google.javascript.rhino.head.Node node18 = node10.getFirstChild();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node18.addChildrenToBack(node20);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString("");
        int int26 = node23.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (short) 10, node18, node23);
        com.google.javascript.rhino.head.Node node29 = node18.setType(18);
        node1.addChildAfter(node7, node29);
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean33 = node32.hasSideEffects();
        node7.addChildrenToFront(node32);
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str38 = node37.toString();
        boolean boolean39 = node37.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newString("");
        node41.removeProp(23);
        node37.addChildToFront(node41);
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean47 = node46.hasChildren();
        node37.addChildrenToFront(node46);
        int int49 = node46.getLineno();
        int int50 = node46.getType();
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node46);
        node7.addChildrenToFront(node51);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator53 = node7.new NodeIterator();
        int int56 = node7.getIntProp(15, 9);
        com.google.javascript.rhino.head.Node node60 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node61 = node60.getLastSibling();
        com.google.javascript.rhino.head.Node node65 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(13, node65);
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node(12);
        node69.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node(6, node69);
        com.google.javascript.rhino.head.Node node74 = node73.getLastChild();
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node65, node73, 0);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node79.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node(20, node61, node65, node79);
        com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node61.addChildToFront(node85);
        node7.addChildrenToBack(node85);
        node85.setLineno(7);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "40" + "'", str38, "40");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 40 + "'", int50 == 40);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 9 + "'", int56 == 9);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node74);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(2, 0);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        com.google.javascript.rhino.head.ast.Comment comment5 = null;
        node3.setJsDocNode(comment5);
        java.lang.String str7 = node3.toString();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString("");
        node13.removeProp(23);
        node9.addChildToFront(node13);
        com.google.javascript.rhino.head.Node node17 = node9.getFirstChild();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node22 = node21.getLastSibling();
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        boolean boolean29 = node26.hasSideEffects();
        node24.addChildrenToFront(node26);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(26, node21, node24, 20);
        node9.addChildToBack(node21);
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(22, node3, node9);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str39 = node38.toString();
        boolean boolean40 = node38.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newString("");
        node42.removeProp(23);
        node38.addChildToFront(node42);
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) 'a', node38);
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str51 = node50.toString();
        com.google.javascript.rhino.head.Node node52 = node50.getLastChild();
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node((int) (short) -1, node38, node48, node50, (int) (short) -1);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(10, node3, node50);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "40" + "'", str7, "40");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "40" + "'", str10, "40");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "40" + "'", str27, "40");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "40" + "'", str39, "40");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "40" + "'", str51, "40");
        org.junit.Assert.assertNull(node52);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("");
        node6.removeProp(23);
        node2.addChildToFront(node6);
        com.google.javascript.rhino.head.Node node10 = node2.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment11 = node2.getJsDocNode();
        int int12 = node2.getType();
        node2.setDouble((double) 17);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("");
        node20.removeProp(23);
        node16.addChildToFront(node20);
        java.lang.String str24 = node20.getString();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString((int) (short) 0, "-1");
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(10, node2, node20, node27, 14);
        boolean boolean30 = node27.hasChildren();
        java.lang.String str31 = node27.getJsDoc();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(comment11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "40" + "'", str17, "40");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(13, node8);
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(12);
        node12.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(6, node12);
        com.google.javascript.rhino.head.Node node17 = node16.getLastChild();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node8, node16, 0);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node22.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(20, node4, node8, node22);
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str30 = node29.toString();
        boolean boolean31 = node29.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("");
        node33.removeProp(23);
        node29.addChildToFront(node33);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean39 = node38.hasChildren();
        node29.addChildrenToFront(node38);
        int int41 = node38.getLineno();
        int int42 = node38.getType();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node38);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator44 = node38.new NodeIterator();
        node26.addChildToBack(node38);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator46 = node38.new NodeIterator();
        boolean boolean47 = nodeIterator46.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            nodeIterator46.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: next() has not been called");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "40" + "'", str30, "40");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 40 + "'", int42 == 40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        com.google.javascript.rhino.head.Node node3 = node1.getLastSibling();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString(24, "100");
        int int9 = node8.getType();
        boolean boolean10 = node8.hasChildren();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str13 = node12.toString();
        boolean boolean14 = node12.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString("");
        node16.removeProp(23);
        node12.addChildToFront(node16);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean22 = node21.hasChildren();
        node12.addChildrenToFront(node21);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator24 = node21.new NodeIterator();
        boolean boolean25 = node21.hasChildren();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(11, node8, node21);
        boolean boolean27 = node26.hasConsistentReturnUsage();
        node1.putProp(17, (java.lang.Object) node26);
        // The following exception was thrown during execution in test generation
        try {
            node1.labelId(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 24 + "'", int9 == 24);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "40" + "'", str13, "40");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean11 = node10.hasChildren();
        node1.addChildrenToFront(node10);
        int int13 = node10.getLineno();
        int int14 = node10.getType();
        com.google.javascript.rhino.head.Node node15 = node10.getLastChild();
        com.google.javascript.rhino.head.Node node16 = node10.getNext();
        int int17 = node10.getType();
        int int18 = node10.getLineno();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 40 + "'", int14 == 40);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node11 = node3.getFirstChild();
        node11.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope14 = node11.getScope();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) ' ', node11, 2);
        com.google.javascript.rhino.head.Node node17 = node11.getLastSibling();
        com.google.javascript.rhino.head.ast.Comment comment18 = node11.getJsDocNode();
        node11.putIntProp(4, 2);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node26 = node25.getLastSibling();
        int int27 = node25.getLineno();
        com.google.javascript.rhino.head.Node node28 = node25.getFirstChild();
        node11.putProp(16, (java.lang.Object) node25);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(11, node11);
        // The following exception was thrown during execution in test generation
        try {
            node30.setString("22");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("");
        node6.removeProp(23);
        node2.addChildToFront(node6);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean12 = node11.hasChildren();
        node2.addChildrenToFront(node11);
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str16 = node15.toString();
        boolean boolean17 = node15.hasChildren();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) -1, node11, node15, (int) (short) 10);
        node15.setLineno(0);
        com.google.javascript.rhino.head.ast.Comment comment22 = node15.getJsDocNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = node15.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(comment22);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("");
        node10.removeProp(23);
        node6.addChildToFront(node10);
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean16 = node15.hasChildren();
        node6.addChildrenToFront(node15);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str20 = node19.toString();
        boolean boolean21 = node19.hasChildren();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (short) -1, node15, node19, (int) (short) 10);
        com.google.javascript.rhino.head.Node node24 = node23.getLastChild();
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str30 = node29.toString();
        boolean boolean31 = node29.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("");
        node33.removeProp(23);
        node29.addChildToFront(node33);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) 'a', node29);
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str42 = node41.toString();
        com.google.javascript.rhino.head.Node node43 = node41.getLastChild();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node((int) (short) -1, node29, node39, node41, (int) (short) -1);
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((int) (short) 1, node41, 12);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(23);
        node49.removeProp(25);
        boolean boolean52 = node49.hasChildren();
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node((-1), node24, node41, node49);
        boolean boolean54 = node41.hasSideEffects();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) (short) 10, node41, (int) (short) 1);
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(4, node56, 7);
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node(16, node56, 17);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator61 = node60.new NodeIterator();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "40" + "'", str7, "40");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1" + "'", str20, "-1");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "40" + "'", str30, "40");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "40" + "'", str42, "40");
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        boolean boolean7 = node4.hasSideEffects();
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(0, node4);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("");
        node15.removeProp(23);
        node11.addChildToFront(node15);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean21 = node20.hasChildren();
        node11.addChildrenToFront(node20);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str25 = node24.toString();
        boolean boolean26 = node24.hasChildren();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) (short) -1, node20, node24, (int) (short) 10);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node4, node24, node31, (int) (short) 0);
        com.google.javascript.rhino.head.ast.Comment comment34 = null;
        node33.setJsDocNode(comment34);
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str40 = node39.toString();
        boolean boolean41 = node39.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString("");
        node43.removeProp(23);
        node39.addChildToFront(node43);
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean49 = node48.hasChildren();
        node39.addChildrenToFront(node48);
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str53 = node52.toString();
        boolean boolean54 = node52.hasChildren();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) (short) -1, node48, node52, (int) (short) 10);
        com.google.javascript.rhino.head.Node node57 = node56.getLastChild();
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str63 = node62.toString();
        boolean boolean64 = node62.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newString("");
        node66.removeProp(23);
        node62.addChildToFront(node66);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node((int) 'a', node62);
        com.google.javascript.rhino.head.Node node72 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str75 = node74.toString();
        com.google.javascript.rhino.head.Node node76 = node74.getLastChild();
        com.google.javascript.rhino.head.Node node78 = new com.google.javascript.rhino.head.Node((int) (short) -1, node62, node72, node74, (int) (short) -1);
        com.google.javascript.rhino.head.Node node80 = new com.google.javascript.rhino.head.Node((int) (short) 1, node74, 12);
        com.google.javascript.rhino.head.Node node82 = new com.google.javascript.rhino.head.Node(23);
        node82.removeProp(25);
        boolean boolean85 = node82.hasChildren();
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node((-1), node57, node74, node82);
        boolean boolean87 = node74.hasSideEffects();
        com.google.javascript.rhino.head.Node node91 = com.google.javascript.rhino.head.Node.newString(0, "hi!");
        node74.putProp(22, (java.lang.Object) 0);
        com.google.javascript.rhino.head.Node node93 = node74.getLastChild();
        com.google.javascript.rhino.head.Node node95 = new com.google.javascript.rhino.head.Node(22, node33, node74, 11);
        boolean boolean96 = node95.hasConsistentReturnUsage();
        java.lang.Class<?> wildcardClass97 = node95.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "40" + "'", str12, "40");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1" + "'", str25, "-1");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "40" + "'", str40, "40");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-1" + "'", str53, "-1");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "40" + "'", str63, "40");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "40" + "'", str75, "40");
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNull(node93);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node(12);
        node5.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(6, node5);
        com.google.javascript.rhino.head.Node node10 = node9.getLastChild();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node14 = node13.getLastSibling();
        com.google.javascript.rhino.head.Node node15 = node13.getLastSibling();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        boolean boolean20 = node17.hasSideEffects();
        node17.setLineno((int) '4');
        com.google.javascript.rhino.head.Node node24 = node17.setType((int) '4');
        int int25 = node24.getLineno();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(24, node10, node13, node24, 8);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(0, node33, node36);
        int int38 = node33.getLineno();
        boolean boolean39 = node33.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node(8, node13, node30, node33);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newString("");
        int int45 = node42.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str52 = node51.toString();
        boolean boolean53 = node51.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString("");
        node55.removeProp(23);
        node51.addChildToFront(node55);
        com.google.javascript.rhino.head.Node node59 = node51.getFirstChild();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node59.addChildrenToBack(node61);
        com.google.javascript.rhino.head.Node node64 = com.google.javascript.rhino.head.Node.newString("");
        int int67 = node64.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node((int) (short) 10, node59, node64);
        com.google.javascript.rhino.head.Node node70 = node59.setType(18);
        node42.addChildAfter(node48, node70);
        node42.removeChildren();
        node30.addChildrenToBack(node42);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(40, node30);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "40" + "'", str52, "40");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(node70);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(100, 97);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("");
        node2.removeProp(23);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = node2.iterator();
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(22, node2, 7);
        int int10 = node7.getIntProp(18, 23);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString("");
        node13.removeProp(23);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor16 = node13.iterator();
        java.lang.Object obj18 = node13.getProp((int) (byte) 1);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator19 = node13.new NodeIterator();
        node7.putProp((int) (short) 1, (java.lang.Object) node13);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeItor5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 23 + "'", int10 == 23);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeItor16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("");
        node2.removeProp(23);
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        boolean boolean10 = node7.hasSideEffects();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(0, node7);
        node2.addChildrenToBack(node11);
        int int13 = node2.getLineno();
        node2.removeChildren();
        node2.setString("23");
        java.lang.String str17 = node2.toString();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(25, node2, (int) '4');
        node19.setLineno((int) (byte) 10);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "40" + "'", str8, "40");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "41" + "'", str17, "41");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        boolean boolean5 = node2.hasSideEffects();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, node2);
        int int7 = node2.getLineno();
        node2.removeProp(0);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString("");
        node17.removeProp(23);
        node13.addChildToFront(node17);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean23 = node22.hasChildren();
        node13.addChildrenToFront(node22);
        int int25 = node22.getLineno();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str28 = node27.toString();
        boolean boolean29 = node27.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("");
        node31.removeProp(23);
        node27.addChildToFront(node31);
        com.google.javascript.rhino.head.Node node35 = node27.getFirstChild();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (short) 0, node22, node27, 9);
        boolean boolean38 = node22.hasSideEffects();
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str43 = node42.toString();
        boolean boolean44 = node42.hasConsistentReturnUsage();
        boolean boolean45 = node42.hasSideEffects();
        node40.addChildrenToFront(node42);
        node42.removeChildren();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString("hi!");
        node42.addChildrenToBack(node49);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str53 = node52.toString();
        boolean boolean54 = node52.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newString("");
        node56.removeProp(23);
        node52.addChildToFront(node56);
        com.google.javascript.rhino.head.Node node60 = node52.getFirstChild();
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node60.addChildrenToBack(node62);
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node22, node42, node62);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator65 = node64.new NodeIterator();
        int int66 = node64.getLineno();
        node2.addChildToBack(node64);
        com.google.javascript.rhino.head.Node node71 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node72 = node71.getLastSibling();
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node76 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str77 = node76.toString();
        boolean boolean78 = node76.hasConsistentReturnUsage();
        boolean boolean79 = node76.hasSideEffects();
        node74.addChildrenToFront(node76);
        com.google.javascript.rhino.head.Node node82 = new com.google.javascript.rhino.head.Node(26, node71, node74, 20);
        int int83 = node82.getType();
        com.google.javascript.rhino.head.Node node85 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean86 = node85.hasChildren();
        node82.addChildrenToBack(node85);
        node2.addChildrenToBack(node82);
        // The following exception was thrown during execution in test generation
        try {
            int int90 = node82.getExistingIntProp(18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "40" + "'", str14, "40");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "40" + "'", str28, "40");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "40" + "'", str43, "40");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "40" + "'", str53, "40");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "40" + "'", str77, "40");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 26 + "'", int83 == 26);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node9 = node1.getFirstChild();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node9.addChildrenToBack(node11);
        com.google.javascript.rhino.head.Node node13 = node11.getLastChild();
        java.lang.String str14 = node11.getJsDoc();
        java.lang.Object obj16 = node11.getProp(0);
        com.google.javascript.rhino.head.Node node17 = node11.getLastSibling();
        java.lang.Object obj19 = node17.getProp(9);
        com.google.javascript.rhino.head.Node node20 = node17.getFirstChild();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber(10.0d);
        com.google.javascript.rhino.head.Node node2 = node1.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            node2.putIntProp(100, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.google.javascript.rhino.head.Node node1 = null;
        com.google.javascript.rhino.head.Node node2 = null;
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node((int) (byte) 100, 22);
        int int6 = node5.getType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(19, node1, node2, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        boolean boolean7 = node4.hasSideEffects();
        node2.addChildrenToFront(node4);
        node4.removeChildren();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("");
        node12.removeProp(23);
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        boolean boolean20 = node17.hasSideEffects();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(0, node17);
        node12.addChildrenToBack(node21);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(9, node12);
        node4.addChildrenToBack(node23);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(97);
        int int27 = node26.getType();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(7, node4, node26);
        com.google.javascript.rhino.head.Node node29 = node28.getLastChild();
        boolean boolean30 = node28.hasSideEffects();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("");
        int int4 = node1.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("");
        node14.removeProp(23);
        node10.addChildToFront(node14);
        com.google.javascript.rhino.head.Node node18 = node10.getFirstChild();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node18.addChildrenToBack(node20);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString("");
        int int26 = node23.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (short) 10, node18, node23);
        com.google.javascript.rhino.head.Node node29 = node18.setType(18);
        node1.addChildAfter(node7, node29);
        node1.putIntProp(32, 26);
        java.lang.String str34 = node1.getString();
        node1.removeProp(19);
        node1.removeProp(12);
        node1.setLineno(3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        boolean boolean7 = node4.hasSideEffects();
        node2.addChildrenToFront(node4);
        node4.removeChildren();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("");
        node12.removeProp(23);
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        boolean boolean20 = node17.hasSideEffects();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(0, node17);
        node12.addChildrenToBack(node21);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(9, node12);
        node4.addChildrenToBack(node23);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(97);
        int int27 = node26.getType();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(7, node4, node26);
        com.google.javascript.rhino.head.Node node29 = node4.getLastChild();
        node29.setLineno(19);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        node1.addChildrenToFront(node3);
        node3.removeChildren();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("hi!");
        node3.addChildrenToBack(node10);
        int int14 = node10.getIntProp(0, 22);
        java.lang.String str15 = node10.getString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("23");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString("");
        node3.removeProp(23);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        boolean boolean11 = node8.hasSideEffects();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(0, node8);
        node3.addChildrenToBack(node12);
        node1.addChildrenToBack(node12);
        node12.removeProp((int) (short) 100);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node((-1));
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString("");
        node27.removeProp(23);
        node23.addChildToFront(node27);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) 'a', node23);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        com.google.javascript.rhino.head.Node node37 = node35.getLastChild();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) (short) -1, node23, node33, node35, (int) (short) -1);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (short) 1, node35, 12);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator42 = node41.new NodeIterator();
        int int43 = node41.getLineno();
        node41.removeChildren();
        node18.addChildToFront(node41);
        java.lang.String str46 = node18.getJsDoc();
        node12.addChildToFront(node18);
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str52 = node51.toString();
        boolean boolean53 = node51.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString("");
        node55.removeProp(23);
        node51.addChildToFront(node55);
        com.google.javascript.rhino.head.Node node59 = node51.getFirstChild();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node59.addChildrenToBack(node61);
        com.google.javascript.rhino.head.Node node64 = com.google.javascript.rhino.head.Node.newString("");
        int int67 = node64.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node((int) (short) 10, node59, node64);
        com.google.javascript.rhino.head.Node node69 = node59.getNext();
        node18.putProp(6, (java.lang.Object) node69);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40" + "'", str9, "40");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "40" + "'", str24, "40");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "40" + "'", str36, "40");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 12 + "'", int43 == 12);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "40" + "'", str52, "40");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(node69);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 10);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor2 = node1.iterator();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("");
        node10.removeProp(23);
        node6.addChildToFront(node10);
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean16 = node15.hasChildren();
        node6.addChildrenToFront(node15);
        int int18 = node15.getLineno();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str21 = node20.toString();
        boolean boolean22 = node20.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString("");
        node24.removeProp(23);
        node20.addChildToFront(node24);
        com.google.javascript.rhino.head.Node node28 = node20.getFirstChild();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 0, node15, node20, 9);
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str35 = node34.toString();
        boolean boolean36 = node34.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("");
        node38.removeProp(23);
        node34.addChildToFront(node38);
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) 'a', node34);
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str47 = node46.toString();
        com.google.javascript.rhino.head.Node node48 = node46.getLastChild();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (short) -1, node34, node44, node46, (int) (short) -1);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str53 = node52.toString();
        boolean boolean54 = node52.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newString("");
        node56.removeProp(23);
        node52.addChildToFront(node56);
        com.google.javascript.rhino.head.Node node60 = node52.getFirstChild();
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node60.addChildrenToBack(node62);
        com.google.javascript.rhino.head.Node node64 = node62.getLastChild();
        java.lang.String str65 = node62.getJsDoc();
        java.lang.Object obj67 = node62.getProp(0);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node(3, node15, node34, node62);
        com.google.javascript.rhino.head.Node node69 = node62.getLastSibling();
        node62.removeProp(40);
        com.google.javascript.rhino.head.Node node72 = node62.getLastSibling();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode73 = null;
        java.lang.String str74 = node62.toStringTree(scriptNode73);
        java.lang.Object obj76 = node62.getProp(5);
        node1.addChildToFront(node62);
        boolean boolean78 = node62.hasConsistentReturnUsage();
        int int79 = node62.getLineno();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeItor2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "40" + "'", str7, "40");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "40" + "'", str21, "40");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "40" + "'", str35, "40");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "40" + "'", str47, "40");
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "40" + "'", str53, "40");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (short) 100, "");
        boolean boolean3 = node2.hasConsistentReturnUsage();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (short) 0, "8");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("");
        int int4 = node1.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("");
        node14.removeProp(23);
        node10.addChildToFront(node14);
        com.google.javascript.rhino.head.Node node18 = node10.getFirstChild();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node18.addChildrenToBack(node20);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString("");
        int int26 = node23.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (short) 10, node18, node23);
        com.google.javascript.rhino.head.Node node29 = node18.setType(18);
        node1.addChildAfter(node7, node29);
        node1.putIntProp(32, 26);
        java.lang.String str34 = node1.getString();
        com.google.javascript.rhino.head.ast.Comment comment35 = null;
        node1.setJsDocNode(comment35);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node(5, 11);
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("");
        node11.removeProp(23);
        node7.addChildToFront(node11);
        com.google.javascript.rhino.head.Node node15 = node7.getFirstChild();
        node15.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope18 = node15.getScope();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) ' ', node15, 2);
        boolean boolean21 = node20.hasChildren();
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str26 = node25.toString();
        boolean boolean27 = node25.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newString("");
        node29.removeProp(23);
        node25.addChildToFront(node29);
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean35 = node34.hasChildren();
        node25.addChildrenToFront(node34);
        int int37 = node34.getLineno();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str40 = node39.toString();
        boolean boolean41 = node39.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString("");
        node43.removeProp(23);
        node39.addChildToFront(node43);
        com.google.javascript.rhino.head.Node node47 = node39.getFirstChild();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (short) 0, node34, node39, 9);
        boolean boolean50 = node34.hasSideEffects();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node54 = node53.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator55 = node54.new NodeIterator();
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str58 = node57.toString();
        boolean boolean59 = node57.hasConsistentReturnUsage();
        boolean boolean60 = node57.hasSideEffects();
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str63 = node62.toString();
        boolean boolean64 = node62.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newString("");
        node66.removeProp(23);
        node62.addChildToFront(node66);
        com.google.javascript.rhino.head.Node node70 = node62.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment71 = node62.getJsDocNode();
        node57.addChildToBack(node62);
        java.lang.String str73 = node57.toString();
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node(0, node34, node54, node57, 1);
        com.google.javascript.rhino.head.Node node77 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node79 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str80 = node79.toString();
        boolean boolean81 = node79.hasConsistentReturnUsage();
        boolean boolean82 = node79.hasSideEffects();
        node77.addChildrenToFront(node79);
        node79.removeChildren();
        com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node((int) (short) 0, node20, node54, node79);
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node(19, node3, node85);
        // The following exception was thrown during execution in test generation
        try {
            int int87 = node85.labelId();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "40" + "'", str8, "40");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "40" + "'", str26, "40");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "40" + "'", str40, "40");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "40" + "'", str58, "40");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "40" + "'", str63, "40");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(comment71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "40" + "'", str73, "40");
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "40" + "'", str80, "40");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        boolean boolean5 = node2.hasSideEffects();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, node2);
        int int7 = node2.getLineno();
        node2.removeProp(0);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString("");
        node17.removeProp(23);
        node13.addChildToFront(node17);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean23 = node22.hasChildren();
        node13.addChildrenToFront(node22);
        int int25 = node22.getLineno();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str28 = node27.toString();
        boolean boolean29 = node27.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("");
        node31.removeProp(23);
        node27.addChildToFront(node31);
        com.google.javascript.rhino.head.Node node35 = node27.getFirstChild();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (short) 0, node22, node27, 9);
        boolean boolean38 = node22.hasSideEffects();
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str43 = node42.toString();
        boolean boolean44 = node42.hasConsistentReturnUsage();
        boolean boolean45 = node42.hasSideEffects();
        node40.addChildrenToFront(node42);
        node42.removeChildren();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString("hi!");
        node42.addChildrenToBack(node49);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str53 = node52.toString();
        boolean boolean54 = node52.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newString("");
        node56.removeProp(23);
        node52.addChildToFront(node56);
        com.google.javascript.rhino.head.Node node60 = node52.getFirstChild();
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node60.addChildrenToBack(node62);
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node22, node42, node62);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator65 = node64.new NodeIterator();
        int int66 = node64.getLineno();
        node2.addChildToBack(node64);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator68 = node64.spliterator();
        com.google.javascript.rhino.head.Node node70 = node64.setType(35);
        node70.removeChildren();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "40" + "'", str14, "40");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "40" + "'", str28, "40");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "40" + "'", str43, "40");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "40" + "'", str53, "40");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(nodeSpliterator68);
        org.junit.Assert.assertNotNull(node70);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(23, "");
        java.lang.String str3 = node2.getJsDoc();
        boolean boolean4 = node2.hasSideEffects();
        node2.removeProp(97);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(26, 1);
        java.lang.Class<?> wildcardClass3 = node2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        node4.addChildToFront(node8);
        com.google.javascript.rhino.head.Node node12 = node4.getFirstChild();
        node12.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope15 = node12.getScope();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) ' ', node12, 2);
        boolean boolean18 = node17.hasChildren();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString("");
        node26.removeProp(23);
        node22.addChildToFront(node26);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean32 = node31.hasChildren();
        node22.addChildrenToFront(node31);
        int int34 = node31.getLineno();
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str37 = node36.toString();
        boolean boolean38 = node36.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newString("");
        node40.removeProp(23);
        node36.addChildToFront(node40);
        com.google.javascript.rhino.head.Node node44 = node36.getFirstChild();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) (short) 0, node31, node36, 9);
        boolean boolean47 = node31.hasSideEffects();
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node51 = node50.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator52 = node51.new NodeIterator();
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str55 = node54.toString();
        boolean boolean56 = node54.hasConsistentReturnUsage();
        boolean boolean57 = node54.hasSideEffects();
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str60 = node59.toString();
        boolean boolean61 = node59.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newString("");
        node63.removeProp(23);
        node59.addChildToFront(node63);
        com.google.javascript.rhino.head.Node node67 = node59.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment68 = node59.getJsDocNode();
        node54.addChildToBack(node59);
        java.lang.String str70 = node54.toString();
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(0, node31, node51, node54, 1);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node76 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str77 = node76.toString();
        boolean boolean78 = node76.hasConsistentReturnUsage();
        boolean boolean79 = node76.hasSideEffects();
        node74.addChildrenToFront(node76);
        node76.removeChildren();
        com.google.javascript.rhino.head.Node node82 = new com.google.javascript.rhino.head.Node((int) (short) 0, node17, node51, node76);
        com.google.javascript.rhino.head.Node node83 = node76.getLastChild();
        boolean boolean84 = node76.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node85 = node76.getNext();
        com.google.javascript.rhino.head.Node node87 = new com.google.javascript.rhino.head.Node(19, node76, 13);
        com.google.javascript.rhino.head.Node node88 = node87.getNext();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "40" + "'", str23, "40");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "40" + "'", str37, "40");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "40" + "'", str55, "40");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "40" + "'", str60, "40");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNull(comment68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "40" + "'", str70, "40");
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "40" + "'", str77, "40");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertNull(node88);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newString("");
        node4.removeProp(23);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        boolean boolean12 = node9.hasSideEffects();
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(0, node9);
        node4.addChildrenToBack(node13);
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(9, node4);
        node4.removeProp(4);
        com.google.javascript.rhino.head.Node node19 = node4.setType(23);
        node1.addChildrenToFront(node19);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator21 = node1.new NodeIterator();
        com.google.javascript.rhino.head.Node node22 = nodeIterator21.next();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node23 = nodeIterator21.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "40" + "'", str10, "40");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        node1.addChildrenToFront(node3);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString("");
        node13.removeProp(23);
        node9.addChildToFront(node13);
        com.google.javascript.rhino.head.Node node17 = node9.getFirstChild();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node17.addChildrenToBack(node19);
        node3.addChildrenToBack(node19);
        com.google.javascript.rhino.head.Node node23 = node3.setType(23);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("");
        node30.removeProp(23);
        node26.addChildToFront(node30);
        java.lang.String str34 = node30.getString();
        com.google.javascript.rhino.head.ast.Scope scope35 = node30.getScope();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str39 = node38.toString();
        boolean boolean40 = node38.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newString("");
        node42.removeProp(23);
        node38.addChildToFront(node42);
        com.google.javascript.rhino.head.Node node46 = node38.getFirstChild();
        node46.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope49 = node46.getScope();
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node((int) ' ', node46, 2);
        boolean boolean52 = node51.hasChildren();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str56 = node55.toString();
        boolean boolean57 = node55.hasConsistentReturnUsage();
        boolean boolean58 = node55.hasSideEffects();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node(0, node55);
        int int60 = node55.getLineno();
        node51.addChildToFront(node55);
        int int62 = node55.getType();
        boolean boolean63 = node55.hasChildren();
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str66 = node65.toString();
        boolean boolean67 = node65.hasChildren();
        com.google.javascript.rhino.head.Node node71 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str72 = node71.toString();
        boolean boolean73 = node71.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node75 = com.google.javascript.rhino.head.Node.newString("");
        node75.removeProp(23);
        node71.addChildToFront(node75);
        com.google.javascript.rhino.head.Node node79 = node71.getFirstChild();
        node79.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope82 = node79.getScope();
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node((int) ' ', node79, 2);
        com.google.javascript.rhino.head.Node node85 = node79.getLastSibling();
        com.google.javascript.rhino.head.Node node88 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node89 = node88.getLastSibling();
        com.google.javascript.rhino.head.Node node90 = new com.google.javascript.rhino.head.Node((int) ' ', node85, node88);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor91 = node88.iterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator92 = node88.new NodeIterator();
        node65.addChildrenToBack(node88);
        com.google.javascript.rhino.head.Node node94 = new com.google.javascript.rhino.head.Node(0, node30, node55, node88);
        node3.addChildrenToFront(node88);
        int int96 = node88.getType();
        boolean boolean97 = node88.hasConsistentReturnUsage();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "40" + "'", str10, "40");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "40" + "'", str27, "40");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "40" + "'", str39, "40");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(scope49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "40" + "'", str56, "40");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 40 + "'", int62 == 40);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "-1" + "'", str66, "-1");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "40" + "'", str72, "40");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNull(scope82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(nodeItor91);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 23 + "'", int96 == 23);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        java.lang.String str3 = node2.toString();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(97, (int) (byte) 100);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString("");
        node13.removeProp(23);
        node9.addChildToFront(node13);
        com.google.javascript.rhino.head.Node node17 = node9.getFirstChild();
        node17.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope20 = node17.getScope();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) ' ', node17, 2);
        boolean boolean23 = node22.hasChildren();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        boolean boolean29 = node26.hasSideEffects();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(0, node26);
        int int31 = node26.getLineno();
        node22.addChildToFront(node26);
        int int33 = node26.getType();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = null;
        java.lang.String str35 = node26.toStringTree(scriptNode34);
        node2.addChildBefore(node6, (com.google.javascript.rhino.head.Node) scriptNode34);
        java.lang.String str37 = node2.getJsDoc();
        node2.setLineno((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "40" + "'", str10, "40");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "40" + "'", str27, "40");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40 + "'", int33 == 40);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Comment comment5 = null;
        node2.setJsDocNode(comment5);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str15 = node14.toString();
        boolean boolean16 = node14.hasConsistentReturnUsage();
        boolean boolean17 = node14.hasSideEffects();
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(0, node14);
        node9.addChildrenToBack(node18);
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node(9, node9);
        node2.addChildrenToFront(node20);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(12);
        node24.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(6, node24);
        com.google.javascript.rhino.head.Node node29 = node28.getLastChild();
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str34 = node33.toString();
        boolean boolean35 = node33.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newString("");
        node37.removeProp(23);
        node33.addChildToFront(node37);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean43 = node42.hasChildren();
        node33.addChildrenToFront(node42);
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str47 = node46.toString();
        boolean boolean48 = node46.hasChildren();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (short) -1, node42, node46, (int) (short) 10);
        com.google.javascript.rhino.head.Node node51 = node50.getLastChild();
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str57 = node56.toString();
        boolean boolean58 = node56.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node60 = com.google.javascript.rhino.head.Node.newString("");
        node60.removeProp(23);
        node56.addChildToFront(node60);
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) 'a', node56);
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node68 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str69 = node68.toString();
        com.google.javascript.rhino.head.Node node70 = node68.getLastChild();
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node((int) (short) -1, node56, node66, node68, (int) (short) -1);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node((int) (short) 1, node68, 12);
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node(23);
        node76.removeProp(25);
        boolean boolean79 = node76.hasChildren();
        com.google.javascript.rhino.head.Node node80 = new com.google.javascript.rhino.head.Node((-1), node51, node68, node76);
        node29.addChildToBack(node51);
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node((-1), 0);
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node(7, node20, node29, node84, 20);
        com.google.javascript.rhino.head.Node node87 = node29.getLastChild();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "40" + "'", str15, "40");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "40" + "'", str34, "40");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-1" + "'", str47, "-1");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "40" + "'", str57, "40");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "40" + "'", str69, "40");
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node87);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) '4', "40");
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("");
        node10.removeProp(23);
        node6.addChildToFront(node10);
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean16 = node15.hasChildren();
        node6.addChildrenToFront(node15);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str20 = node19.toString();
        boolean boolean21 = node19.hasConsistentReturnUsage();
        boolean boolean22 = node19.hasSideEffects();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str25 = node24.toString();
        boolean boolean26 = node24.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString("");
        node28.removeProp(23);
        node24.addChildToFront(node28);
        com.google.javascript.rhino.head.Node node32 = node24.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment33 = node24.getJsDocNode();
        node19.addChildToBack(node24);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(15, node6, node19);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString(23, "");
        java.lang.String str39 = node38.toString();
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(0, node42, node45);
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node(24, node6, node38, node46);
        com.google.javascript.rhino.head.Node node48 = node47.getNext();
        com.google.javascript.rhino.head.Node node49 = node2.getChildBefore(node48);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str53 = node52.toString();
        boolean boolean54 = node52.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newString("");
        node56.removeProp(23);
        node52.addChildToFront(node56);
        com.google.javascript.rhino.head.Node node60 = node52.getFirstChild();
        node60.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope63 = node60.getScope();
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((int) ' ', node60, 2);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator66 = node60.spliterator();
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node(23);
        node60.addChildToBack(node68);
        node2.addChildrenToFront(node60);
        int int73 = node2.getIntProp((int) '#', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int74 = node2.labelId();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "40" + "'", str7, "40");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "40" + "'", str20, "40");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "40" + "'", str25, "40");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(comment33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "23" + "'", str39, "23");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "40" + "'", str53, "40");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNull(scope63);
        org.junit.Assert.assertNotNull(nodeSpliterator66);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        node4.addChildToFront(node8);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean14 = node13.hasChildren();
        node4.addChildrenToFront(node13);
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasChildren();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (short) -1, node13, node17, (int) (short) 10);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) 7);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(0, node13, node23, (-1));
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(23, (int) (short) -1);
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasConsistentReturnUsage();
        boolean boolean35 = node32.hasSideEffects();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(0, node32);
        com.google.javascript.rhino.head.Node node37 = node36.getLastChild();
        node36.removeChildren();
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node(19, node29, node36, 24);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (short) 100, node25, node40);
        int int44 = node40.getIntProp((int) '4', 23);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "40" + "'", str33, "40");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 23 + "'", int44 == 23);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((-1.0d));
        node2.putIntProp((int) (byte) -1, (int) (byte) 0);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node((int) (byte) 0, node2);
        node2.setDouble((double) (byte) 1);
        int int11 = node2.getIntProp(3, 23);
        boolean boolean12 = node2.hasSideEffects();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 23 + "'", int11 == 23);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        java.lang.String str5 = node4.toString();
        com.google.javascript.rhino.head.Node node6 = node4.getLastChild();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node10 = node9.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator11 = node10.new NodeIterator();
        node10.setLineno(13);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator14 = node10.spliterator();
        java.lang.String str15 = node10.toString();
        node4.addChildrenToBack(node10);
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(13, node4);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(6, node4);
        node18.removeChildren();
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString("");
        node27.removeProp(23);
        node23.addChildToFront(node27);
        com.google.javascript.rhino.head.Node node31 = node23.getFirstChild();
        node31.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope34 = node31.getScope();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) ' ', node31, 2);
        com.google.javascript.rhino.head.Node node37 = node31.getLastSibling();
        node31.removeChildren();
        boolean boolean39 = node31.hasChildren();
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node44 = node43.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator45 = node44.new NodeIterator();
        node44.setLineno(13);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator48 = node44.spliterator();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(97, node44);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(12);
        node54.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(6, node54);
        com.google.javascript.rhino.head.Node node59 = node58.getLastChild();
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node63 = node62.getLastSibling();
        com.google.javascript.rhino.head.Node node64 = node62.getLastSibling();
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str67 = node66.toString();
        boolean boolean68 = node66.hasConsistentReturnUsage();
        boolean boolean69 = node66.hasSideEffects();
        node66.setLineno((int) '4');
        com.google.javascript.rhino.head.Node node73 = node66.setType((int) '4');
        int int74 = node73.getLineno();
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node(24, node59, node62, node73, 8);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        com.google.javascript.rhino.head.Node node82 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node85 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node(0, node82, node85);
        int int87 = node82.getLineno();
        boolean boolean88 = node82.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node(8, node62, node79, node82);
        com.google.javascript.rhino.head.Node node91 = new com.google.javascript.rhino.head.Node(0, node31, node44, node79, (int) (short) 0);
        node18.addChildrenToBack(node31);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeSpliterator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "23" + "'", str15, "23");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "40" + "'", str24, "40");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeSpliterator48);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "40" + "'", str67, "40");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 52 + "'", int74 == 52);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (byte) -1, 15);
        java.lang.String str3 = node2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        node4.addChildToFront(node8);
        com.google.javascript.rhino.head.Node node12 = node4.getFirstChild();
        node12.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope15 = node12.getScope();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) ' ', node12, 2);
        com.google.javascript.rhino.head.Node node18 = node12.getLastSibling();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node22 = node21.getLastSibling();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) ' ', node18, node21);
        node21.setLineno((int) (byte) 0);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(13, node21);
        com.google.javascript.rhino.head.Node node28 = node21.setType(2);
        node21.putIntProp(40, (int) (short) 100);
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString("");
        int int37 = node34.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node38 = node34.getFirstChild();
        node21.putProp((int) 'a', (java.lang.Object) node34);
        java.lang.String str40 = node34.toString();
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString(0, "100");
        java.lang.Object obj45 = node43.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.Comment comment46 = null;
        node43.setJsDocNode(comment46);
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str52 = node51.toString();
        boolean boolean53 = node51.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString("");
        node55.removeProp(23);
        node51.addChildToFront(node55);
        com.google.javascript.rhino.head.Node node59 = node51.getFirstChild();
        node59.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope62 = node59.getScope();
        node59.setLineno(12);
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node((int) (byte) 0, node59, (int) '#');
        java.lang.String str67 = node59.toString();
        node43.putProp(97, (java.lang.Object) node59);
        node34.addChildrenToBack(node59);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "41" + "'", str40, "41");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "40" + "'", str52, "40");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(scope62);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "41" + "'", str67, "41");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str9 = node8.toString();
        com.google.javascript.rhino.head.Node node10 = node8.getFirstChild();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString("");
        node17.removeProp(23);
        node13.addChildToFront(node17);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean23 = node22.hasChildren();
        node13.addChildrenToFront(node22);
        int int25 = node22.getLineno();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str28 = node27.toString();
        boolean boolean29 = node27.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("");
        node31.removeProp(23);
        node27.addChildToFront(node31);
        com.google.javascript.rhino.head.Node node35 = node27.getFirstChild();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (short) 0, node22, node27, 9);
        node8.addChildrenToFront(node37);
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node(100, node3, node6, node8, (int) ' ');
        com.google.javascript.rhino.head.Node node41 = node8.getLastSibling();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(21, node41);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str48 = node47.toString();
        boolean boolean49 = node47.hasConsistentReturnUsage();
        boolean boolean50 = node47.hasSideEffects();
        node45.addChildrenToFront(node47);
        com.google.javascript.rhino.head.Node node52 = node47.getLastSibling();
        int int53 = node47.getLineno();
        com.google.javascript.rhino.head.ast.Comment comment54 = node47.getJsDocNode();
        node42.putProp((int) (byte) 10, (java.lang.Object) node47);
        com.google.javascript.rhino.head.Node node57 = node47.setType(5);
        boolean boolean58 = node47.hasConsistentReturnUsage();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "40" + "'", str14, "40");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "40" + "'", str28, "40");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "40" + "'", str48, "40");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(comment54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        node1.addChildrenToFront(node3);
        node3.removeChildren();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("hi!");
        node3.addChildrenToBack(node10);
        int int14 = node3.getIntProp((int) (short) -1, 5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Scope scope15 = node3.getScope();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.NumberLiteral cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(23, 22);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Comment comment7 = null;
        node4.setJsDocNode(comment7);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("");
        node11.removeProp(23);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.hasConsistentReturnUsage();
        boolean boolean19 = node16.hasSideEffects();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node(0, node16);
        node11.addChildrenToBack(node20);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(9, node11);
        node4.addChildrenToFront(node22);
        com.google.javascript.rhino.head.Node node25 = node4.setType(18);
        boolean boolean26 = node4.hasSideEffects();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str29 = node28.toString();
        boolean boolean30 = node28.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString("");
        node32.removeProp(23);
        node28.addChildToFront(node32);
        com.google.javascript.rhino.head.Node node36 = node32.getLastChild();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("1");
        node32.addChildrenToBack(node38);
        int int40 = node38.getLineno();
        node38.removeProp(16);
        node4.addChildrenToBack(node38);
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator47 = node46.new NodeIterator();
        boolean boolean48 = node46.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node(6, node46, 0);
        node2.addChildAfter(node4, node46);
        // The following exception was thrown during execution in test generation
        try {
            node4.resetTargets();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "40" + "'", str17, "40");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "40" + "'", str29, "40");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean13 = node12.hasChildren();
        node3.addChildrenToFront(node12);
        int int15 = node12.getLineno();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        node21.removeProp(23);
        node17.addChildToFront(node21);
        com.google.javascript.rhino.head.Node node25 = node17.getFirstChild();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (short) 0, node12, node17, 9);
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newString("1");
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor30 = node29.iterator();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(21, node27, node29, (int) '4');
        int int35 = node32.getIntProp(0, (int) ' ');
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeItor30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node(23);
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("");
        node10.removeProp(23);
        node6.addChildToFront(node10);
        node3.putProp((int) ' ', (java.lang.Object) node10);
        com.google.javascript.rhino.head.ast.Comment comment15 = node3.getJsDocNode();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node3);
        java.lang.Object obj18 = node3.getProp(15);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(12, 25);
        java.lang.String str23 = node22.toString();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(23);
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str29 = node28.toString();
        boolean boolean30 = node28.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString("");
        node32.removeProp(23);
        node28.addChildToFront(node32);
        node25.putProp((int) ' ', (java.lang.Object) node32);
        node22.addChildToBack(node32);
        node3.putProp((-1), (java.lang.Object) node22);
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node(20, node22, 20);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "40" + "'", str7, "40");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(comment15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12" + "'", str23, "12");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "40" + "'", str29, "40");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("");
        node6.removeProp(23);
        node2.addChildToFront(node6);
        com.google.javascript.rhino.head.Node node10 = node2.getFirstChild();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node10.addChildrenToBack(node12);
        com.google.javascript.rhino.head.Node node14 = node12.getLastChild();
        java.lang.String str15 = node12.getJsDoc();
        java.lang.Object obj17 = node12.getProp(0);
        com.google.javascript.rhino.head.Node node18 = node12.getLastSibling();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node23 = node22.getLastSibling();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str28 = node27.toString();
        boolean boolean29 = node27.hasConsistentReturnUsage();
        boolean boolean30 = node27.hasSideEffects();
        node25.addChildrenToFront(node27);
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node(26, node22, node25, 20);
        int int34 = node33.getType();
        com.google.javascript.rhino.head.Node node35 = node33.getNext();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator36 = node33.spliterator();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean39 = node38.hasSideEffects();
        com.google.javascript.rhino.head.Node node41 = node38.setType(3);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node(18, node18, node33, node38, 13);
        int int44 = node18.getLineno();
        com.google.javascript.rhino.head.ast.Comment comment45 = null;
        node18.setJsDocNode(comment45);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "40" + "'", str28, "40");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 26 + "'", int34 == 26);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(nodeSpliterator36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str9 = node8.toString();
        com.google.javascript.rhino.head.Node node10 = node8.getFirstChild();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString("");
        node17.removeProp(23);
        node13.addChildToFront(node17);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean23 = node22.hasChildren();
        node13.addChildrenToFront(node22);
        int int25 = node22.getLineno();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str28 = node27.toString();
        boolean boolean29 = node27.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("");
        node31.removeProp(23);
        node27.addChildToFront(node31);
        com.google.javascript.rhino.head.Node node35 = node27.getFirstChild();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (short) 0, node22, node27, 9);
        node8.addChildrenToFront(node37);
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node(100, node3, node6, node8, (int) ' ');
        com.google.javascript.rhino.head.Node node41 = node8.getLastSibling();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(21, node41);
        java.lang.Object obj44 = node42.getProp((int) 'a');
        int int47 = node42.getIntProp(22, 20);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "40" + "'", str14, "40");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "40" + "'", str28, "40");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20 + "'", int47 == 20);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str8 = node7.toString();
        com.google.javascript.rhino.head.Node node9 = node7.getFirstChild();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str13 = node12.toString();
        boolean boolean14 = node12.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString("");
        node16.removeProp(23);
        node12.addChildToFront(node16);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean22 = node21.hasChildren();
        node12.addChildrenToFront(node21);
        int int24 = node21.getLineno();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("");
        node30.removeProp(23);
        node26.addChildToFront(node30);
        com.google.javascript.rhino.head.Node node34 = node26.getFirstChild();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (short) 0, node21, node26, 9);
        node7.addChildrenToFront(node36);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(100, node2, node5, node7, (int) ' ');
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str44 = node43.toString();
        boolean boolean45 = node43.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString("");
        node47.removeProp(23);
        node43.addChildToFront(node47);
        com.google.javascript.rhino.head.Node node51 = node43.getFirstChild();
        node51.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope54 = node51.getScope();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) ' ', node51, 2);
        com.google.javascript.rhino.head.Node node57 = node51.getLastSibling();
        com.google.javascript.rhino.head.Node node60 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node61 = node60.getLastSibling();
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node((int) ' ', node57, node60);
        com.google.javascript.rhino.head.ast.Comment comment63 = node60.getJsDocNode();
        // The following exception was thrown during execution in test generation
        try {
            node39.addChildToBack((com.google.javascript.rhino.head.Node) comment63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "40" + "'", str13, "40");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "40" + "'", str27, "40");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "40" + "'", str44, "40");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNull(scope54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNull(comment63);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        node5.addChildToFront(node9);
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node((int) 'a', node5);
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        com.google.javascript.rhino.head.Node node19 = node17.getLastChild();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (short) -1, node5, node15, node17, (int) (short) -1);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString("23");
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(26, node21, node23);
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(13, node28);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(7, node28);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node24, node28);
        com.google.javascript.rhino.head.ast.Comment comment32 = null;
        node31.setJsDocNode(comment32);
        com.google.javascript.rhino.head.ast.Comment comment34 = null;
        node31.setJsDocNode(comment34);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "40" + "'", str6, "40");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(23);
        node2.removeProp(25);
        boolean boolean5 = node2.hasChildren();
        node2.putIntProp(21, 25);
        int int9 = node2.getLineno();
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(20, node2);
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node((int) (byte) 0, (int) (byte) -1);
        com.google.javascript.rhino.head.ast.Comment comment14 = null;
        node13.setJsDocNode(comment14);
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str19 = node18.toString();
        boolean boolean20 = node18.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newString("");
        node22.removeProp(23);
        node18.addChildToFront(node22);
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean28 = node27.hasChildren();
        node18.addChildrenToFront(node27);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str32 = node31.toString();
        boolean boolean33 = node31.hasChildren();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (short) -1, node27, node31, (int) (short) 10);
        com.google.javascript.rhino.head.Node node36 = node35.getLastChild();
        com.google.javascript.rhino.head.Node node37 = node35.getNext();
        node10.addChildAfter(node13, node35);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor39 = node35.iterator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "40" + "'", str19, "40");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-1" + "'", str32, "-1");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(nodeItor39);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("");
        node6.removeProp(23);
        node2.addChildToFront(node6);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean12 = node11.hasChildren();
        node2.addChildrenToFront(node11);
        int int14 = node11.getLineno();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("");
        node20.removeProp(23);
        node16.addChildToFront(node20);
        com.google.javascript.rhino.head.Node node24 = node16.getFirstChild();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (short) 0, node11, node16, 9);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator27 = node16.new NodeIterator();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node32 = node31.getLastSibling();
        int int33 = node31.getLineno();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator34 = node31.spliterator();
        node16.putProp((int) '4', (java.lang.Object) node31);
        double double36 = node16.getDouble();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "40" + "'", str17, "40");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(nodeSpliterator34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 32.0d + "'", double36 == 32.0d);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(17, 22);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor3 = node2.iterator();
        org.junit.Assert.assertNotNull(nodeItor3);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node9 = node1.getFirstChild();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node9.addChildrenToBack(node11);
        com.google.javascript.rhino.head.Node node13 = node11.getLastChild();
        java.lang.String str14 = node11.getJsDoc();
        java.lang.Object obj16 = node11.getProp(0);
        boolean boolean17 = node11.hasChildren();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node(12);
        node20.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(6, node20);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor25 = node24.iterator();
        node24.removeChildren();
        node11.addChildToFront(node24);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator28 = node11.new NodeIterator();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeItor25);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean13 = node12.hasChildren();
        node3.addChildrenToFront(node12);
        int int15 = node12.getLineno();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        node21.removeProp(23);
        node17.addChildToFront(node21);
        com.google.javascript.rhino.head.Node node25 = node17.getFirstChild();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (short) 0, node12, node17, 9);
        boolean boolean28 = node12.hasSideEffects();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasConsistentReturnUsage();
        boolean boolean35 = node32.hasSideEffects();
        node30.addChildrenToFront(node32);
        node32.removeChildren();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("hi!");
        node32.addChildrenToBack(node39);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str43 = node42.toString();
        boolean boolean44 = node42.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newString("");
        node46.removeProp(23);
        node42.addChildToFront(node46);
        com.google.javascript.rhino.head.Node node50 = node42.getFirstChild();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node50.addChildrenToBack(node52);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node12, node32, node52);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator55 = node54.new NodeIterator();
        com.google.javascript.rhino.head.Node node56 = nodeIterator55.next();
        boolean boolean57 = nodeIterator55.hasNext();
        com.google.javascript.rhino.head.Node node58 = nodeIterator55.next();
        int int61 = node58.getIntProp(52, (int) (byte) 1);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator62 = node58.spliterator();
        com.google.javascript.rhino.head.Node node63 = node58.getNext();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor64 = node63.iterator();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "40" + "'", str33, "40");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "40" + "'", str43, "40");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(nodeSpliterator62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(nodeItor64);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node5 = node4.getLastSibling();
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        boolean boolean12 = node9.hasSideEffects();
        node7.addChildrenToFront(node9);
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(26, node4, node7, 20);
        int int16 = node7.getLineno();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str20 = node19.toString();
        boolean boolean21 = node19.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString("");
        node23.removeProp(23);
        node19.addChildToFront(node23);
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean29 = node28.hasChildren();
        node19.addChildrenToFront(node28);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasChildren();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (short) -1, node28, node32, (int) (short) 10);
        node36.removeProp(24);
        com.google.javascript.rhino.head.Node node39 = node36.getLastChild();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) 0);
        com.google.javascript.rhino.head.ast.Comment comment42 = node41.getJsDocNode();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node(12, node7, node36, node41);
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str48 = node47.toString();
        boolean boolean49 = node47.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newString("");
        node51.removeProp(23);
        node47.addChildToFront(node51);
        com.google.javascript.rhino.head.Node node55 = node47.getFirstChild();
        node55.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope58 = node55.getScope();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node((int) ' ', node55, 2);
        com.google.javascript.rhino.head.Node node61 = node55.getLastSibling();
        com.google.javascript.rhino.head.Node node64 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node65 = node64.getLastSibling();
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node((int) ' ', node61, node64);
        java.lang.String str67 = node61.getString();
        com.google.javascript.rhino.head.Node node70 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str71 = node70.toString();
        boolean boolean72 = node70.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newString("");
        node74.removeProp(23);
        node70.addChildToFront(node74);
        com.google.javascript.rhino.head.Node node78 = node70.getFirstChild();
        com.google.javascript.rhino.head.Node node80 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node78.addChildrenToBack(node80);
        com.google.javascript.rhino.head.Node node83 = com.google.javascript.rhino.head.Node.newString("");
        int int86 = node83.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node87 = new com.google.javascript.rhino.head.Node((int) (short) 10, node78, node83);
        node61.addChildrenToBack(node83);
        node43.addChildrenToFront(node61);
        int int92 = node43.getIntProp(7, 0);
        com.google.javascript.rhino.head.Node node93 = node43.getFirstChild();
        node93.setLineno(0);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "40" + "'", str10, "40");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "40" + "'", str20, "40");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1" + "'", str33, "-1");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(comment42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "40" + "'", str48, "40");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(scope58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "100" + "'", str67, "100");
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "40" + "'", str71, "40");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(node93);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node11 = node3.getFirstChild();
        node11.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope14 = node11.getScope();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) ' ', node11, 2);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.hasConsistentReturnUsage();
        boolean boolean24 = node21.hasSideEffects();
        node19.addChildrenToFront(node21);
        node21.removeChildren();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString("hi!");
        node21.addChildrenToBack(node28);
        int int32 = node28.getIntProp(0, 22);
        node11.putProp(15, (java.lang.Object) 22);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (short) -1, node11, 2);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = null;
        java.lang.String str37 = node11.toStringTree(scriptNode36);
        java.lang.String str38 = node11.getJsDoc();
        // The following exception was thrown during execution in test generation
        try {
            node11.resetTargets();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 22 + "'", int32 == 22);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(5, "41");
        java.lang.String str3 = node2.getString();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Comment comment8 = null;
        node5.setJsDocNode(comment8);
        com.google.javascript.rhino.head.Node node10 = node5.getLastSibling();
        node2.addChildToBack(node10);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "41" + "'", str3, "41");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "40" + "'", str6, "40");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        boolean boolean7 = node4.hasSideEffects();
        node2.addChildrenToFront(node4);
        com.google.javascript.rhino.head.Node node9 = node4.getLastSibling();
        int int10 = node4.getLineno();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str13 = node12.toString();
        boolean boolean14 = node12.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString("");
        node16.removeProp(23);
        node12.addChildToFront(node16);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean22 = node21.hasChildren();
        node12.addChildrenToFront(node21);
        int int24 = node21.getLineno();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (byte) 1);
        node26.removeProp((int) (short) 10);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 10, node4, node21, node26, 0);
        node30.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            node30.labelId(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "40" + "'", str13, "40");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(13, node8);
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(12);
        node12.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(6, node12);
        com.google.javascript.rhino.head.Node node17 = node16.getLastChild();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node8, node16, 0);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node22.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(20, node4, node8, node22);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node4.addChildToFront(node28);
        com.google.javascript.rhino.head.Node node30 = node4.getNext();
        java.lang.Object obj32 = node30.getProp((int) ' ');
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("");
        node38.removeProp(23);
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str44 = node43.toString();
        boolean boolean45 = node43.hasConsistentReturnUsage();
        boolean boolean46 = node43.hasSideEffects();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node(0, node43);
        node38.addChildrenToBack(node47);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(9, node38);
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(13, node53);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(7, node53);
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node((int) 'a', node35, node49, node53, (int) (short) 1);
        boolean boolean58 = node35.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node60 = node35.setType(3);
        node30.addChildToFront(node60);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator62 = node30.spliterator();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "40" + "'", str44, "40");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(nodeSpliterator62);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString("");
        node3.removeProp(23);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        boolean boolean11 = node8.hasSideEffects();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(0, node8);
        node3.addChildrenToBack(node12);
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(24, node3, (int) (short) 10);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str20 = node19.toString();
        boolean boolean21 = node19.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString("");
        node23.removeProp(23);
        node19.addChildToFront(node23);
        com.google.javascript.rhino.head.Node node27 = node19.getFirstChild();
        node27.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope30 = node27.getScope();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) ' ', node27, 2);
        com.google.javascript.rhino.head.Node node33 = node27.getLastSibling();
        com.google.javascript.rhino.head.ast.Comment comment34 = node27.getJsDocNode();
        node27.putIntProp(4, 2);
        int int38 = node27.getType();
        node3.putProp((int) '#', (java.lang.Object) int38);
        int int40 = node3.getType();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(7, node3, (int) (byte) 100);
        boolean boolean43 = node3.hasChildren();
        int int46 = node3.getIntProp(8, 15);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40" + "'", str9, "40");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "40" + "'", str20, "40");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(comment34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 41 + "'", int38 == 41);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 41 + "'", int40 == 41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 15 + "'", int46 == 15);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean13 = node12.hasChildren();
        node3.addChildrenToFront(node12);
        int int15 = node12.getLineno();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        node21.removeProp(23);
        node17.addChildToFront(node21);
        com.google.javascript.rhino.head.Node node25 = node17.getFirstChild();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (short) 0, node12, node17, 9);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str32 = node31.toString();
        boolean boolean33 = node31.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newString("");
        node35.removeProp(23);
        node31.addChildToFront(node35);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) 'a', node31);
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str44 = node43.toString();
        com.google.javascript.rhino.head.Node node45 = node43.getLastChild();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((int) (short) -1, node31, node41, node43, (int) (short) -1);
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str50 = node49.toString();
        boolean boolean51 = node49.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString("");
        node53.removeProp(23);
        node49.addChildToFront(node53);
        com.google.javascript.rhino.head.Node node57 = node49.getFirstChild();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node57.addChildrenToBack(node59);
        com.google.javascript.rhino.head.Node node61 = node59.getLastChild();
        java.lang.String str62 = node59.getJsDoc();
        java.lang.Object obj64 = node59.getProp(0);
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node(3, node12, node31, node59);
        java.lang.Object obj67 = node31.getProp(5);
        // The following exception was thrown during execution in test generation
        try {
            node31.labelId(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "40" + "'", str32, "40");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "40" + "'", str44, "40");
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "40" + "'", str50, "40");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj67);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(0, node3);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("");
        node14.removeProp(23);
        node10.addChildToFront(node14);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean20 = node19.hasChildren();
        node10.addChildrenToFront(node19);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.hasChildren();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (short) -1, node19, node23, (int) (short) 10);
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node3, node23, node30, (int) (short) 0);
        com.google.javascript.rhino.head.ast.Comment comment33 = null;
        node32.setJsDocNode(comment33);
        com.google.javascript.rhino.head.Node node35 = node32.getLastChild();
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str41 = node40.toString();
        boolean boolean42 = node40.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newString("");
        node44.removeProp(23);
        node40.addChildToFront(node44);
        com.google.javascript.rhino.head.Node node48 = node40.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment49 = node40.getJsDocNode();
        int int50 = node40.getType();
        node40.setDouble((double) 17);
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str55 = node54.toString();
        boolean boolean56 = node54.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newString("");
        node58.removeProp(23);
        node54.addChildToFront(node58);
        java.lang.String str62 = node58.getString();
        com.google.javascript.rhino.head.Node node65 = com.google.javascript.rhino.head.Node.newString((int) (short) 0, "-1");
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node(10, node40, node58, node65, 14);
        java.lang.String str68 = node67.getJsDoc();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(17, node67, (int) (byte) 0);
        com.google.javascript.rhino.head.Node node71 = node67.getLastChild();
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node(23, (int) (short) -1);
        com.google.javascript.rhino.head.Node node78 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str79 = node78.toString();
        boolean boolean80 = node78.hasConsistentReturnUsage();
        boolean boolean81 = node78.hasSideEffects();
        com.google.javascript.rhino.head.Node node82 = new com.google.javascript.rhino.head.Node(0, node78);
        com.google.javascript.rhino.head.Node node83 = node82.getLastChild();
        node82.removeChildren();
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node(19, node75, node82, 24);
        com.google.javascript.rhino.head.Node node87 = node75.getLastSibling();
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node(52, node71, node75);
        node32.addChildToFront(node71);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "40" + "'", str41, "40");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(comment49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 40 + "'", int50 == 40);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "40" + "'", str55, "40");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "40" + "'", str79, "40");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node87);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) 1.0f);
        java.lang.Object obj4 = node2.getProp((int) 'a');
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = node2.iterator();
        int int8 = node2.getIntProp((int) (byte) -1, 17);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(13, node12);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(7, node12);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node14.addChildToFront(node16);
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node(12);
        node20.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(6, node20);
        com.google.javascript.rhino.head.Node node25 = node24.getLastChild();
        node14.addChildToFront(node24);
        node2.addChildToFront(node24);
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node2, node29);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator31 = node2.new NodeIterator();
        com.google.javascript.rhino.head.Node node32 = nodeIterator31.next();
        node32.removeProp(18);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(nodeItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (short) 0, "20");
        node2.putIntProp((int) (byte) -1, 13);
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 40);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean13 = node12.hasChildren();
        node3.addChildrenToFront(node12);
        int int15 = node12.getLineno();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        node21.removeProp(23);
        node17.addChildToFront(node21);
        com.google.javascript.rhino.head.Node node25 = node17.getFirstChild();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (short) 0, node12, node17, 9);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str32 = node31.toString();
        boolean boolean33 = node31.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newString("");
        node35.removeProp(23);
        node31.addChildToFront(node35);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) 'a', node31);
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str44 = node43.toString();
        com.google.javascript.rhino.head.Node node45 = node43.getLastChild();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((int) (short) -1, node31, node41, node43, (int) (short) -1);
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str50 = node49.toString();
        boolean boolean51 = node49.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString("");
        node53.removeProp(23);
        node49.addChildToFront(node53);
        com.google.javascript.rhino.head.Node node57 = node49.getFirstChild();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node57.addChildrenToBack(node59);
        com.google.javascript.rhino.head.Node node61 = node59.getLastChild();
        java.lang.String str62 = node59.getJsDoc();
        java.lang.Object obj64 = node59.getProp(0);
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node(3, node12, node31, node59);
        com.google.javascript.rhino.head.ast.Comment comment66 = node65.getJsDocNode();
        com.google.javascript.rhino.head.Node node68 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str69 = node68.toString();
        boolean boolean70 = node68.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node72 = com.google.javascript.rhino.head.Node.newString("");
        node72.removeProp(23);
        node68.addChildToFront(node72);
        com.google.javascript.rhino.head.Node node76 = node68.getFirstChild();
        node76.setString("100");
        com.google.javascript.rhino.head.Node node79 = node76.getLastSibling();
        node65.addChildrenToBack(node76);
        int int83 = node65.getIntProp(25, 40);
        // The following exception was thrown during execution in test generation
        try {
            node65.setDouble((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "40" + "'", str32, "40");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "40" + "'", str44, "40");
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "40" + "'", str50, "40");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(comment66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "40" + "'", str69, "40");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 40 + "'", int83 == 40);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean13 = node12.hasChildren();
        node3.addChildrenToFront(node12);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.hasChildren();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (short) -1, node12, node16, (int) (short) 10);
        com.google.javascript.rhino.head.Node node21 = node20.getLastChild();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("");
        node30.removeProp(23);
        node26.addChildToFront(node30);
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) 'a', node26);
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str39 = node38.toString();
        com.google.javascript.rhino.head.Node node40 = node38.getLastChild();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) (short) -1, node26, node36, node38, (int) (short) -1);
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 1, node38, 12);
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(23);
        node46.removeProp(25);
        boolean boolean49 = node46.hasChildren();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((-1), node21, node38, node46);
        boolean boolean51 = node38.hasSideEffects();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node(13, node55);
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node(12);
        node59.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node(6, node59);
        com.google.javascript.rhino.head.Node node64 = node63.getLastChild();
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node55, node63, 0);
        node38.addChildToBack(node66);
        java.lang.Object obj69 = node66.getProp(7);
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(16, 19);
        boolean boolean73 = node72.hasSideEffects();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node74 = node66.getChildBefore(node72);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "40" + "'", str27, "40");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "40" + "'", str39, "40");
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        node1.addChildrenToFront(node3);
        boolean boolean8 = node3.hasSideEffects();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor9 = node3.iterator();
        node3.putIntProp(17, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            node3.resetTargets();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeItor9);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        node5.addChildToFront(node9);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean15 = node14.hasChildren();
        node5.addChildrenToFront(node14);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str19 = node18.toString();
        boolean boolean20 = node18.hasChildren();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (short) -1, node14, node18, (int) (short) 10);
        com.google.javascript.rhino.head.Node node23 = node22.getLastChild();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str29 = node28.toString();
        boolean boolean30 = node28.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString("");
        node32.removeProp(23);
        node28.addChildToFront(node32);
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) 'a', node28);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str41 = node40.toString();
        com.google.javascript.rhino.head.Node node42 = node40.getLastChild();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) -1, node28, node38, node40, (int) (short) -1);
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) (short) 1, node40, 12);
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(23);
        node48.removeProp(25);
        boolean boolean51 = node48.hasChildren();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((-1), node23, node40, node48);
        boolean boolean53 = node40.hasSideEffects();
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newString(0, "hi!");
        node40.putProp(22, (java.lang.Object) 0);
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node((int) '4', node40, (int) (short) 0);
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node(13, node60, 41);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "40" + "'", str6, "40");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1" + "'", str19, "-1");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "40" + "'", str29, "40");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "40" + "'", str41, "40");
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        node4.addChildToFront(node8);
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node((int) 'a', node4);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str17 = node16.toString();
        com.google.javascript.rhino.head.Node node18 = node16.getLastChild();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (short) -1, node4, node14, node16, (int) (short) -1);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newString("23");
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(26, node20, node22);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor24 = node22.iterator();
        com.google.javascript.rhino.head.ast.Comment comment25 = null;
        node22.setJsDocNode(comment25);
        node22.setString("");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "40" + "'", str17, "40");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeItor24);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("");
        node6.removeProp(23);
        node2.addChildToFront(node6);
        com.google.javascript.rhino.head.Node node10 = node2.getFirstChild();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node10.addChildrenToBack(node12);
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("");
        int int18 = node15.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) 10, node10, node15);
        com.google.javascript.rhino.head.Node node20 = node15.getFirstChild();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("");
        node30.removeProp(23);
        node26.addChildToFront(node30);
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) 'a', node26);
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str39 = node38.toString();
        com.google.javascript.rhino.head.Node node40 = node38.getLastChild();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) (short) -1, node26, node36, node38, (int) (short) -1);
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newString("23");
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(26, node42, node44);
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node(13, node49);
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node(7, node49);
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node45, node49);
        node15.addChildToBack(node49);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "40" + "'", str27, "40");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "40" + "'", str39, "40");
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node11 = node3.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment12 = node3.getJsDocNode();
        int int13 = node3.getType();
        node3.setDouble((double) 17);
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        node21.removeProp(23);
        node17.addChildToFront(node21);
        java.lang.String str25 = node21.getString();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString((int) (short) 0, "-1");
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(10, node3, node21, node28, 14);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString(24, "100");
        int int34 = node33.getType();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str39 = node38.toString();
        boolean boolean40 = node38.hasConsistentReturnUsage();
        boolean boolean41 = node38.hasSideEffects();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(0, node38);
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str46 = node45.toString();
        boolean boolean47 = node45.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString("");
        node49.removeProp(23);
        node45.addChildToFront(node49);
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean55 = node54.hasChildren();
        node45.addChildrenToFront(node54);
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str59 = node58.toString();
        boolean boolean60 = node58.hasChildren();
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node((int) (short) -1, node54, node58, (int) (short) 10);
        com.google.javascript.rhino.head.Node node65 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node38, node58, node65, (int) (short) 0);
        com.google.javascript.rhino.head.ast.Comment comment68 = null;
        node58.setJsDocNode(comment68);
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str73 = node72.toString();
        int int74 = node72.getLineno();
        com.google.javascript.rhino.head.Node node76 = com.google.javascript.rhino.head.Node.newNumber((double) 0);
        com.google.javascript.rhino.head.ast.Comment comment77 = node76.getJsDocNode();
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node81 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str82 = node81.toString();
        boolean boolean83 = node81.hasConsistentReturnUsage();
        boolean boolean84 = node81.hasSideEffects();
        node79.addChildrenToFront(node81);
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node(8, node72, node76, node79);
        node58.addChildrenToFront(node76);
        node76.putIntProp((int) (short) 0, (int) (short) 10);
        com.google.javascript.rhino.head.Node node91 = new com.google.javascript.rhino.head.Node(25, node3, node33, node76);
        node33.setString("22");
        node33.removeChildren();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(comment12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 40 + "'", int13 == 40);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 24 + "'", int34 == 24);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "40" + "'", str39, "40");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "40" + "'", str46, "40");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "-1" + "'", str59, "-1");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "100" + "'", str73, "100");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNull(comment77);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "40" + "'", str82, "40");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(97);
        int int3 = node2.getType();
        com.google.javascript.rhino.head.Node node5 = node2.setType(97);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor6 = node5.iterator();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator7 = node5.spliterator();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) 'a');
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("");
        node12.removeProp(23);
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        boolean boolean20 = node17.hasSideEffects();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(0, node17);
        node12.addChildrenToBack(node21);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(40, node21, 19);
        java.lang.Object obj26 = node21.getProp(26);
        com.google.javascript.rhino.head.Node node27 = node21.getNext();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(5, node5, node9, node21, 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeItor6);
        org.junit.Assert.assertNotNull(nodeSpliterator7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, node2, node5);
        com.google.javascript.rhino.head.Node node7 = node2.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = node7.getLineno();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        boolean boolean11 = node8.hasSideEffects();
        node6.addChildrenToFront(node8);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(26, node3, node6, 20);
        boolean boolean15 = node14.hasSideEffects();
        com.google.javascript.rhino.head.Node node16 = node14.getLastChild();
        int int19 = node14.getIntProp(97, (int) (short) 10);
        boolean boolean20 = node14.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString(20, "23");
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("");
        node30.removeProp(23);
        node26.addChildToFront(node30);
        com.google.javascript.rhino.head.Node node34 = node26.getFirstChild();
        node34.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope37 = node34.getScope();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) ' ', node34, 2);
        boolean boolean40 = node39.hasChildren();
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str44 = node43.toString();
        boolean boolean45 = node43.hasConsistentReturnUsage();
        boolean boolean46 = node43.hasSideEffects();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node(0, node43);
        int int48 = node43.getLineno();
        node39.addChildToFront(node43);
        boolean boolean50 = node43.hasSideEffects();
        boolean boolean51 = node43.hasChildren();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator52 = node43.spliterator();
        node14.addChildAfter(node23, node43);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40" + "'", str9, "40");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "40" + "'", str27, "40");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "40" + "'", str44, "40");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator52);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node11 = node3.getFirstChild();
        node11.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope14 = node11.getScope();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) ' ', node11, 2);
        boolean boolean17 = node16.hasChildren();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString("");
        node25.removeProp(23);
        node21.addChildToFront(node25);
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean31 = node30.hasChildren();
        node21.addChildrenToFront(node30);
        int int33 = node30.getLineno();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("");
        node39.removeProp(23);
        node35.addChildToFront(node39);
        com.google.javascript.rhino.head.Node node43 = node35.getFirstChild();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node((int) (short) 0, node30, node35, 9);
        boolean boolean46 = node30.hasSideEffects();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node50 = node49.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator51 = node50.new NodeIterator();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str54 = node53.toString();
        boolean boolean55 = node53.hasConsistentReturnUsage();
        boolean boolean56 = node53.hasSideEffects();
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str59 = node58.toString();
        boolean boolean60 = node58.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newString("");
        node62.removeProp(23);
        node58.addChildToFront(node62);
        com.google.javascript.rhino.head.Node node66 = node58.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment67 = node58.getJsDocNode();
        node53.addChildToBack(node58);
        java.lang.String str69 = node53.toString();
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node(0, node30, node50, node53, 1);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node75 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str76 = node75.toString();
        boolean boolean77 = node75.hasConsistentReturnUsage();
        boolean boolean78 = node75.hasSideEffects();
        node73.addChildrenToFront(node75);
        node75.removeChildren();
        com.google.javascript.rhino.head.Node node81 = new com.google.javascript.rhino.head.Node((int) (short) 0, node16, node50, node75);
        node75.setDouble((double) 11);
        com.google.javascript.rhino.head.Node node84 = node75.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment85 = node75.getJsDocNode();
        node75.putIntProp(2, 0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "40" + "'", str36, "40");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "40" + "'", str54, "40");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "40" + "'", str59, "40");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(comment67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "40" + "'", str69, "40");
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "40" + "'", str76, "40");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertNull(comment85);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(41, "");
        com.google.javascript.rhino.head.ast.Comment comment3 = node2.getJsDocNode();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = node2.getExistingIntProp((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(comment3);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        node4.addChildToFront(node8);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean14 = node13.hasChildren();
        node4.addChildrenToFront(node13);
        int int16 = node13.getLineno();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str19 = node18.toString();
        boolean boolean20 = node18.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newString("");
        node22.removeProp(23);
        node18.addChildToFront(node22);
        com.google.javascript.rhino.head.Node node26 = node18.getFirstChild();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) (short) 0, node13, node18, 9);
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("1");
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor31 = node30.iterator();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node(21, node28, node30, (int) '4');
        com.google.javascript.rhino.head.Node node35 = node30.setType(19);
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (short) 0, node35);
        com.google.javascript.rhino.head.Node node37 = node36.getFirstChild();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "40" + "'", str19, "40");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeItor31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str3 = node2.toString();
        int int4 = node2.getLineno();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) 0);
        com.google.javascript.rhino.head.ast.Comment comment7 = node6.getJsDocNode();
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        boolean boolean14 = node11.hasSideEffects();
        node9.addChildrenToFront(node11);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(8, node2, node6, node9);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString(13, "");
        node2.addChildToBack(node19);
        node2.setLineno(22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "40" + "'", str12, "40");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(15, (-1));
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(22, 25);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(32, "32");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node11 = node3.getFirstChild();
        node11.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope14 = node11.getScope();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) ' ', node11, 2);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.hasConsistentReturnUsage();
        boolean boolean24 = node21.hasSideEffects();
        node19.addChildrenToFront(node21);
        node21.removeChildren();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString("hi!");
        node21.addChildrenToBack(node28);
        int int32 = node28.getIntProp(0, 22);
        node11.putProp(15, (java.lang.Object) 22);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (short) -1, node11, 2);
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean38 = node37.hasSideEffects();
        com.google.javascript.rhino.head.Node node40 = node37.setType(3);
        node35.addChildToFront(node37);
        com.google.javascript.rhino.head.Node node42 = node37.getLastSibling();
        com.google.javascript.rhino.head.Node node43 = node37.getLastSibling();
        java.lang.Class<?> wildcardClass44 = node43.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 22 + "'", int32 == 22);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(10, "100");
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(13, node7);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(7, node7);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node9.addChildToFront(node11);
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(12);
        node15.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(6, node15);
        com.google.javascript.rhino.head.Node node20 = node19.getLastChild();
        node9.addChildToFront(node19);
        node3.addChildToFront(node9);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString((int) '4', "40");
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str30 = node29.toString();
        boolean boolean31 = node29.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("");
        node33.removeProp(23);
        node29.addChildToFront(node33);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean39 = node38.hasChildren();
        node29.addChildrenToFront(node38);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str43 = node42.toString();
        boolean boolean44 = node42.hasConsistentReturnUsage();
        boolean boolean45 = node42.hasSideEffects();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str48 = node47.toString();
        boolean boolean49 = node47.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newString("");
        node51.removeProp(23);
        node47.addChildToFront(node51);
        com.google.javascript.rhino.head.Node node55 = node47.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment56 = node47.getJsDocNode();
        node42.addChildToBack(node47);
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(15, node29, node42);
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newString(23, "");
        java.lang.String str62 = node61.toString();
        com.google.javascript.rhino.head.Node node65 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node68 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node(0, node65, node68);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(24, node29, node61, node69);
        com.google.javascript.rhino.head.Node node71 = node70.getNext();
        com.google.javascript.rhino.head.Node node72 = node25.getChildBefore(node71);
        com.google.javascript.rhino.head.Node node75 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str76 = node75.toString();
        boolean boolean77 = node75.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node79 = com.google.javascript.rhino.head.Node.newString("");
        node79.removeProp(23);
        node75.addChildToFront(node79);
        com.google.javascript.rhino.head.Node node83 = node75.getFirstChild();
        node83.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope86 = node83.getScope();
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node((int) ' ', node83, 2);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator89 = node83.spliterator();
        com.google.javascript.rhino.head.Node node91 = new com.google.javascript.rhino.head.Node(23);
        node83.addChildToBack(node91);
        node25.addChildrenToFront(node83);
        com.google.javascript.rhino.head.Node node94 = new com.google.javascript.rhino.head.Node(23, node3, node25);
        com.google.javascript.rhino.head.Node node95 = node3.getNext();
        node95.setLineno(15);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "40" + "'", str30, "40");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "40" + "'", str43, "40");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "40" + "'", str48, "40");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(comment56);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "23" + "'", str62, "23");
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "40" + "'", str76, "40");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNull(scope86);
        org.junit.Assert.assertNotNull(nodeSpliterator89);
        org.junit.Assert.assertNotNull(node95);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((-1), 25);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString("");
        node3.removeProp(23);
        node3.setLineno((int) '4');
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str13 = node12.toString();
        boolean boolean14 = node12.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString("");
        node16.removeProp(23);
        node12.addChildToFront(node16);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean22 = node21.hasChildren();
        node12.addChildrenToFront(node21);
        int int24 = node21.getLineno();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("");
        node30.removeProp(23);
        node26.addChildToFront(node30);
        com.google.javascript.rhino.head.Node node34 = node26.getFirstChild();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (short) 0, node21, node26, 9);
        boolean boolean37 = node21.hasSideEffects();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str42 = node41.toString();
        boolean boolean43 = node41.hasConsistentReturnUsage();
        boolean boolean44 = node41.hasSideEffects();
        node39.addChildrenToFront(node41);
        node41.removeChildren();
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newString("hi!");
        node41.addChildrenToBack(node48);
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str52 = node51.toString();
        boolean boolean53 = node51.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString("");
        node55.removeProp(23);
        node51.addChildToFront(node55);
        com.google.javascript.rhino.head.Node node59 = node51.getFirstChild();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node59.addChildrenToBack(node61);
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node21, node41, node61);
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node(9, node21);
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newNumber((double) 13);
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node(12, node3, node64, node66);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node(16, node67);
        int int69 = node67.getType();
        com.google.javascript.rhino.head.Node node70 = node67.getLastSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "40" + "'", str13, "40");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "40" + "'", str27, "40");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "40" + "'", str42, "40");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "40" + "'", str52, "40");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 12 + "'", int69 == 12);
        org.junit.Assert.assertNotNull(node70);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(0, node3);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("");
        node14.removeProp(23);
        node10.addChildToFront(node14);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean20 = node19.hasChildren();
        node10.addChildrenToFront(node19);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.hasChildren();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (short) -1, node19, node23, (int) (short) 10);
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node3, node23, node30, (int) (short) 0);
        com.google.javascript.rhino.head.Node node34 = node32.setType(16);
        com.google.javascript.rhino.head.Node node35 = node32.getLastSibling();
        com.google.javascript.rhino.head.ast.Comment comment36 = node35.getJsDocNode();
        boolean boolean37 = node35.hasChildren();
        com.google.javascript.rhino.head.ast.Comment comment38 = node35.getJsDocNode();
        // The following exception was thrown during execution in test generation
        try {
            int int39 = node35.labelId();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(comment36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(comment38);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean13 = node12.hasChildren();
        node3.addChildrenToFront(node12);
        int int15 = node12.getLineno();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        node21.removeProp(23);
        node17.addChildToFront(node21);
        com.google.javascript.rhino.head.Node node25 = node17.getFirstChild();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (short) 0, node12, node17, 9);
        boolean boolean28 = node12.hasSideEffects();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node32 = node31.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator33 = node32.new NodeIterator();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        boolean boolean38 = node35.hasSideEffects();
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str41 = node40.toString();
        boolean boolean42 = node40.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newString("");
        node44.removeProp(23);
        node40.addChildToFront(node44);
        com.google.javascript.rhino.head.Node node48 = node40.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment49 = node40.getJsDocNode();
        node35.addChildToBack(node40);
        java.lang.String str51 = node35.toString();
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(0, node12, node32, node35, 1);
        boolean boolean54 = node35.hasSideEffects();
        node35.removeProp((int) '4');
        java.lang.Object obj58 = node35.getProp((int) '4');
        com.google.javascript.rhino.head.Node node59 = null;
        com.google.javascript.rhino.head.Node node60 = node35.getChildBefore(node59);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "40" + "'", str36, "40");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "40" + "'", str41, "40");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(comment49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "40" + "'", str51, "40");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(node60);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (byte) 1);
        node2.removeProp((int) (short) 10);
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        boolean boolean10 = node7.hasSideEffects();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(0, node7);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str15 = node14.toString();
        boolean boolean16 = node14.hasConsistentReturnUsage();
        boolean boolean17 = node14.hasSideEffects();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str20 = node19.toString();
        boolean boolean21 = node19.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString("");
        node23.removeProp(23);
        node19.addChildToFront(node23);
        com.google.javascript.rhino.head.Node node27 = node19.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment28 = node19.getJsDocNode();
        node14.addChildToBack(node19);
        boolean boolean30 = node19.hasConsistentReturnUsage();
        node7.putProp((int) (short) 1, (java.lang.Object) node19);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) '#', node2, node19);
        com.google.javascript.rhino.head.Node node33 = node19.getFirstChild();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str37 = node36.toString();
        boolean boolean38 = node36.hasChildren();
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str43 = node42.toString();
        boolean boolean44 = node42.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newString("");
        node46.removeProp(23);
        node42.addChildToFront(node46);
        com.google.javascript.rhino.head.Node node50 = node42.getFirstChild();
        node50.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope53 = node50.getScope();
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node((int) ' ', node50, 2);
        com.google.javascript.rhino.head.Node node56 = node50.getLastSibling();
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node60 = node59.getLastSibling();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) ' ', node56, node59);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor62 = node59.iterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator63 = node59.new NodeIterator();
        node36.addChildrenToBack(node59);
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node(26, node36);
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newString("23");
        java.lang.Object obj71 = node69.getProp(17);
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(3, node69);
        com.google.javascript.rhino.head.Node node73 = node72.getFirstChild();
        node65.putProp((int) (short) 10, (java.lang.Object) node72);
        java.lang.String str75 = node72.getJsDoc();
        com.google.javascript.rhino.head.Node node76 = null;
        // The following exception was thrown during execution in test generation
        try {
            node19.replaceChild(node72, node76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "40" + "'", str8, "40");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "40" + "'", str15, "40");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "40" + "'", str20, "40");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(comment28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-1" + "'", str37, "-1");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "40" + "'", str43, "40");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(scope53);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(nodeItor62);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString((int) (byte) -1, "41");
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("");
        node11.removeProp(23);
        node7.addChildToFront(node11);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean17 = node16.hasChildren();
        node7.addChildrenToFront(node16);
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str21 = node20.toString();
        boolean boolean22 = node20.hasChildren();
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) (short) -1, node16, node20, (int) (short) 10);
        com.google.javascript.rhino.head.Node node25 = node24.getLastChild();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str31 = node30.toString();
        boolean boolean32 = node30.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString("");
        node34.removeProp(23);
        node30.addChildToFront(node34);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) 'a', node30);
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str43 = node42.toString();
        com.google.javascript.rhino.head.Node node44 = node42.getLastChild();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) (short) -1, node30, node40, node42, (int) (short) -1);
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node((int) (short) 1, node42, 12);
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node(23);
        node50.removeProp(25);
        boolean boolean53 = node50.hasChildren();
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node((-1), node25, node42, node50);
        com.google.javascript.rhino.head.Node node55 = node54.getLastSibling();
        com.google.javascript.rhino.head.Node node56 = node54.getLastChild();
        int int59 = node56.getIntProp((int) (short) 1, 9);
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node(9, node3, node56);
        // The following exception was thrown during execution in test generation
        try {
            node3.labelId(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "40" + "'", str8, "40");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1" + "'", str21, "-1");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "40" + "'", str31, "40");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "40" + "'", str43, "40");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(19, "");
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node((int) (short) 1, node3, (int) (byte) 10);
        com.google.javascript.rhino.head.Node node6 = node3.getLastSibling();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str15 = node14.toString();
        boolean boolean16 = node14.hasConsistentReturnUsage();
        boolean boolean17 = node14.hasSideEffects();
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(0, node14);
        node9.addChildrenToBack(node18);
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node(9, node9);
        node9.removeProp(4);
        com.google.javascript.rhino.head.Node node24 = node9.setType(23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = null;
        java.lang.String str26 = node24.toStringTree(scriptNode25);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor27 = node24.iterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor28 = node24.iterator();
        node3.addChildrenToBack(node24);
        node3.removeProp((int) (short) 0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "40" + "'", str15, "40");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(nodeItor27);
        org.junit.Assert.assertNotNull(nodeItor28);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString("");
        node3.removeProp(23);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        boolean boolean11 = node8.hasSideEffects();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(0, node8);
        node3.addChildrenToBack(node12);
        node1.addChildToFront(node3);
        com.google.javascript.rhino.head.Node node15 = node3.getLastChild();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = null;
        java.lang.String str17 = node3.toStringTree(scriptNode16);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40" + "'", str9, "40");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("");
        node6.removeProp(23);
        node2.addChildToFront(node6);
        com.google.javascript.rhino.head.Node node10 = node6.getLastChild();
        node6.setString("");
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str16 = node15.toString();
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = null;
        java.lang.String str18 = node15.toStringTree(scriptNode17);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString(24, "100");
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(23, 6);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(0, node15, node21, node24, 6);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = null;
        java.lang.String str28 = node21.toStringTree(scriptNode27);
        node6.addChildToFront(node21);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 10, node21);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        com.google.javascript.rhino.head.Node node4 = node2.getLastSibling();
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node((int) (short) 1, node4);
        boolean boolean6 = node5.hasChildren();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("");
        node2.removeProp(23);
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        boolean boolean10 = node7.hasSideEffects();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(0, node7);
        node2.addChildrenToBack(node11);
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(9, node2);
        node2.removeProp(4);
        com.google.javascript.rhino.head.Node node17 = node2.setType(23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = null;
        java.lang.String str19 = node17.toStringTree(scriptNode18);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor20 = node17.iterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor21 = node17.iterator();
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString("");
        node27.removeProp(23);
        node23.addChildToFront(node27);
        com.google.javascript.rhino.head.Node node31 = node23.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment32 = node23.getJsDocNode();
        int int33 = node23.getType();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator34 = node23.new NodeIterator();
        com.google.javascript.rhino.head.Node node35 = null;
        com.google.javascript.rhino.head.Node node36 = node23.getChildBefore(node35);
        node36.setString("40");
        node17.addChildToFront(node36);
        com.google.javascript.rhino.head.ast.Comment comment40 = node17.getJsDocNode();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "40" + "'", str8, "40");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(nodeItor20);
        org.junit.Assert.assertNotNull(nodeItor21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "40" + "'", str24, "40");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(comment32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40 + "'", int33 == 40);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(comment40);
    }
}

