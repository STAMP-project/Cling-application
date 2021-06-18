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
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
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
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (short) 100, "");
        boolean boolean3 = node2.hasConsistentReturnUsage();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (short) 0, "8");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
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
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
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
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
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
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(23, "");
        java.lang.String str3 = node2.getJsDoc();
        boolean boolean4 = node2.hasSideEffects();
        node2.removeProp(97);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(26, 1);
        java.lang.Class<?> wildcardClass3 = node2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
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
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
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
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
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
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
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
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
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
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (byte) -1, 15);
        java.lang.String str3 = node2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
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
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
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
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
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
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
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
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
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
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
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
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
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
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
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
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
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
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(17, 22);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor3 = node2.iterator();
        org.junit.Assert.assertNotNull(nodeItor3);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
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
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
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
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
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
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
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
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
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
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
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
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
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
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (short) 0, "20");
        node2.putIntProp((int) (byte) -1, 13);
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 40);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
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
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
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
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
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
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
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
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
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
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
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
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
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
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
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
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
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
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
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
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
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
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
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
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(15, (-1));
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(22, 25);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(32, "32");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
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
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
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
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((-1), 25);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
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
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
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
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
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
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
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
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
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
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
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
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
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
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
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
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
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

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("");
        node2.removeProp(23);
        node2.setLineno((int) '4');
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("");
        node15.removeProp(23);
        node11.addChildToFront(node15);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean21 = node20.hasChildren();
        node11.addChildrenToFront(node20);
        int int23 = node20.getLineno();
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str26 = node25.toString();
        boolean boolean27 = node25.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newString("");
        node29.removeProp(23);
        node25.addChildToFront(node29);
        com.google.javascript.rhino.head.Node node33 = node25.getFirstChild();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (short) 0, node20, node25, 9);
        boolean boolean36 = node20.hasSideEffects();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str41 = node40.toString();
        boolean boolean42 = node40.hasConsistentReturnUsage();
        boolean boolean43 = node40.hasSideEffects();
        node38.addChildrenToFront(node40);
        node40.removeChildren();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString("hi!");
        node40.addChildrenToBack(node47);
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str51 = node50.toString();
        boolean boolean52 = node50.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newString("");
        node54.removeProp(23);
        node50.addChildToFront(node54);
        com.google.javascript.rhino.head.Node node58 = node50.getFirstChild();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node58.addChildrenToBack(node60);
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node20, node40, node60);
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node(9, node20);
        com.google.javascript.rhino.head.Node node65 = com.google.javascript.rhino.head.Node.newNumber((double) 13);
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(12, node2, node63, node65);
        int int67 = node66.getType();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator68 = node66.new NodeIterator();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "40" + "'", str12, "40");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "40" + "'", str26, "40");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "40" + "'", str41, "40");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "40" + "'", str51, "40");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 12 + "'", int67 == 12);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(9, "-1");
        java.lang.Class<?> wildcardClass3 = node2.getClass();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
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
        com.google.javascript.rhino.head.Node node16 = node10.getLastSibling();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(12);
        node19.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(6, node19);
        com.google.javascript.rhino.head.Node node24 = node23.getLastChild();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str29 = node28.toString();
        boolean boolean30 = node28.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString("");
        node32.removeProp(23);
        node28.addChildToFront(node32);
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean38 = node37.hasChildren();
        node28.addChildrenToFront(node37);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str42 = node41.toString();
        boolean boolean43 = node41.hasChildren();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node((int) (short) -1, node37, node41, (int) (short) 10);
        com.google.javascript.rhino.head.Node node46 = node45.getLastChild();
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str52 = node51.toString();
        boolean boolean53 = node51.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString("");
        node55.removeProp(23);
        node51.addChildToFront(node55);
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) 'a', node51);
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str64 = node63.toString();
        com.google.javascript.rhino.head.Node node65 = node63.getLastChild();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (short) -1, node51, node61, node63, (int) (short) -1);
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node((int) (short) 1, node63, 12);
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node(23);
        node71.removeProp(25);
        boolean boolean74 = node71.hasChildren();
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node((-1), node46, node63, node71);
        node24.addChildToBack(node46);
        node10.addChildToBack(node24);
        boolean boolean78 = node24.hasChildren();
        com.google.javascript.rhino.head.Node node79 = node24.getFirstChild();
        boolean boolean80 = node79.hasChildren();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "40" + "'", str29, "40");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-1" + "'", str42, "-1");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "40" + "'", str52, "40");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "40" + "'", str64, "40");
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(20, "23");
        com.google.javascript.rhino.head.Node node4 = node2.setType(0);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node(13, node3);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(12);
        node7.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(6, node7);
        com.google.javascript.rhino.head.Node node12 = node11.getLastChild();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node3, node11, 0);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) 1.0f);
        node11.addChildrenToFront(node16);
        int int18 = node11.getLineno();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString("");
        node24.removeProp(23);
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str30 = node29.toString();
        boolean boolean31 = node29.hasConsistentReturnUsage();
        boolean boolean32 = node29.hasSideEffects();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node(0, node29);
        node24.addChildrenToBack(node33);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(9, node24);
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node(13, node39);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(7, node39);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) 'a', node21, node35, node39, (int) (short) 1);
        node11.addChildrenToBack(node43);
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) (byte) 1);
        java.lang.Object obj48 = node46.getProp(22);
        node43.addChildrenToFront(node46);
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str55 = node54.toString();
        boolean boolean56 = node54.hasConsistentReturnUsage();
        boolean boolean57 = node54.hasSideEffects();
        node52.addChildrenToFront(node54);
        node54.removeChildren();
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newString("hi!");
        node54.addChildrenToBack(node61);
        node61.setLineno(22);
        boolean boolean65 = node61.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node66 = node61.getFirstChild();
        node43.putProp(41, (java.lang.Object) node61);
        java.lang.Object obj69 = node61.getProp(12);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "40" + "'", str30, "40");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "40" + "'", str55, "40");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node9 = node1.getFirstChild();
        node9.setLineno(18);
        boolean boolean12 = node9.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node13 = node9.getLastChild();
        com.google.javascript.rhino.head.ast.Scope scope14 = null;
        node9.setScope(scope14);
        node9.setLineno(2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = node9.labelId();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
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
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(23);
        node35.removeProp(25);
        boolean boolean38 = node35.hasChildren();
        node35.putIntProp(21, 25);
        int int42 = node35.getLineno();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node(20, node35);
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str46 = node45.toString();
        boolean boolean47 = node45.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString("");
        node49.removeProp(23);
        node45.addChildToFront(node49);
        com.google.javascript.rhino.head.Node node53 = node45.getFirstChild();
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node53.addChildrenToBack(node55);
        com.google.javascript.rhino.head.Node node57 = node55.getLastChild();
        java.lang.String str58 = node55.getJsDoc();
        java.lang.Object obj60 = node55.getProp(0);
        boolean boolean61 = node55.hasChildren();
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node(12);
        node64.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node(6, node64);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor69 = node68.iterator();
        node68.removeChildren();
        node55.addChildToFront(node68);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor72 = node68.iterator();
        node2.addChildAfter(node43, node68);
        com.google.javascript.rhino.head.ast.Scope scope74 = null;
        // The following exception was thrown during execution in test generation
        try {
            node68.setScope(scope74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "40" + "'", str46, "40");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(nodeItor69);
        org.junit.Assert.assertNotNull(nodeItor72);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString("");
        node3.removeProp(23);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        boolean boolean11 = node8.hasSideEffects();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(0, node8);
        node3.addChildrenToBack(node12);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(9, node3);
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) '#', node14);
        int int16 = node14.getLineno();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40" + "'", str9, "40");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(8, 0);
        java.lang.String str3 = node2.toString();
        int int6 = node2.getIntProp((int) (short) -1, (int) (short) 0);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        boolean boolean14 = node11.hasSideEffects();
        node9.addChildrenToFront(node11);
        node11.removeChildren();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newString("hi!");
        node11.addChildrenToBack(node18);
        node18.setLineno(22);
        boolean boolean22 = node18.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString("-1");
        node24.removeProp(25);
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString("");
        int int31 = node28.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str38 = node37.toString();
        boolean boolean39 = node37.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newString("");
        node41.removeProp(23);
        node37.addChildToFront(node41);
        com.google.javascript.rhino.head.Node node45 = node37.getFirstChild();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node45.addChildrenToBack(node47);
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newString("");
        int int53 = node50.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node((int) (short) 10, node45, node50);
        com.google.javascript.rhino.head.Node node56 = node45.setType(18);
        node28.addChildAfter(node34, node56);
        node24.addChildToFront(node56);
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node18, node56);
        node2.addChildrenToBack(node18);
        boolean boolean61 = node18.hasChildren();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "40" + "'", str12, "40");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "40" + "'", str38, "40");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
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
        boolean boolean28 = node12.hasConsistentReturnUsage();
        java.lang.Object obj30 = node12.getProp((int) 'a');
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
        com.google.javascript.rhino.head.Node node52 = node50.getNext();
        java.lang.Object obj54 = node50.getProp((int) '4');
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str58 = node57.toString();
        boolean boolean59 = node57.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newString("");
        node61.removeProp(23);
        node57.addChildToFront(node61);
        com.google.javascript.rhino.head.Node node65 = node57.getFirstChild();
        node65.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope68 = node65.getScope();
        node65.setLineno(12);
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node((int) (byte) 0, node65, (int) '#');
        java.lang.String str73 = node65.toString();
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node(0, node12, node50, node65, 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode76 = null;
        java.lang.String str77 = node12.toStringTree(scriptNode76);
        com.google.javascript.rhino.head.ast.Comment comment78 = node12.getJsDocNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = comment78.hasSideEffects();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "40" + "'", str34, "40");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-1" + "'", str47, "-1");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "40" + "'", str58, "40");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(scope68);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "41" + "'", str73, "41");
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(comment78);
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
        boolean boolean26 = node19.hasSideEffects();
        boolean boolean27 = node19.hasChildren();
        node19.setLineno((int) (short) 1);
        double double30 = node19.getDouble();
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(13, node37);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(12);
        node41.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(6, node41);
        com.google.javascript.rhino.head.Node node46 = node45.getLastChild();
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node37, node45, 0);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(17, node33, node48);
        com.google.javascript.rhino.head.Node node50 = node49.getLastSibling();
        node49.putIntProp((int) (byte) 100, (int) (byte) 0);
        node19.addChildToFront(node49);
        node49.removeProp(24);
        node49.putIntProp(25, (int) '#');
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (byte) -1, 5);
        node49.putProp(0, (java.lang.Object) node63);
        com.google.javascript.rhino.head.Node node65 = node63.getNext();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 32.0d + "'", double30 == 32.0d);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(node65);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("32");
        com.google.javascript.rhino.head.ast.Scope scope2 = node1.getScope();
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("");
        node6.removeProp(23);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        boolean boolean14 = node11.hasSideEffects();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(0, node11);
        node6.addChildrenToBack(node15);
        node4.addChildToFront(node6);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str21 = node20.toString();
        boolean boolean22 = node20.hasConsistentReturnUsage();
        boolean boolean23 = node20.hasSideEffects();
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(0, node20);
        node1.addChildAfter(node4, node20);
        node20.setDouble((double) (-1));
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(scope2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "40" + "'", str12, "40");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "40" + "'", str21, "40");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(0, node3);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        boolean boolean13 = node10.hasSideEffects();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str16 = node15.toString();
        boolean boolean17 = node15.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString("");
        node19.removeProp(23);
        node15.addChildToFront(node19);
        com.google.javascript.rhino.head.Node node23 = node15.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment24 = node15.getJsDocNode();
        node10.addChildToBack(node15);
        boolean boolean26 = node15.hasConsistentReturnUsage();
        node3.putProp((int) (short) 1, (java.lang.Object) node15);
        com.google.javascript.rhino.head.ast.Comment comment28 = null;
        node15.setJsDocNode(comment28);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((-1.0d));
        node31.putIntProp((int) (byte) -1, (int) (byte) 0);
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(17, node15, node31, 41);
        node15.setLineno(11);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "40" + "'", str16, "40");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(comment24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) '#');
        node1.removeProp(11);
        com.google.javascript.rhino.head.ast.Comment comment4 = null;
        node1.setJsDocNode(comment4);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(1, "40");
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node(17, node3, 24);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator3 = node2.new NodeIterator();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(6, node2, 0);
        com.google.javascript.rhino.head.ast.Comment comment7 = node2.getJsDocNode();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(comment7);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) -1);
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node(20, 5);
        node1.addChildrenToBack(node4);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = null;
        java.lang.String str7 = node4.toStringTree(scriptNode6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (short) 0, "20");
        int int3 = node2.getType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node9 = node5.getLastChild();
        node5.setString("");
        com.google.javascript.rhino.head.Node node13 = node5.setType(25);
        node5.removeChildren();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
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
        // The following exception was thrown during execution in test generation
        try {
            node16.setDouble(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
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
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (short) 1, node16, 12);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator23 = node22.new NodeIterator();
        int int24 = node22.getLineno();
        node22.removeChildren();
        int int26 = node22.getType();
        com.google.javascript.rhino.head.Node node28 = node22.setType((int) (short) -1);
        java.lang.Object obj30 = node22.getProp((int) ' ');
        java.lang.String str31 = node22.toString();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "40" + "'", str17, "40");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        boolean boolean7 = node4.hasSideEffects();
        node2.addChildrenToFront(node4);
        node4.removeChildren();
        boolean boolean10 = node4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node((int) (short) 0);
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newString("");
        node18.removeProp(23);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.hasConsistentReturnUsage();
        boolean boolean26 = node23.hasSideEffects();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(0, node23);
        node18.addChildrenToBack(node27);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(9, node18);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(13, node33);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(7, node33);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) 'a', node15, node29, node33, (int) (short) 1);
        boolean boolean38 = node15.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node40 = node15.setType(3);
        int int41 = node40.getLineno();
        node12.addChildToFront(node40);
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 1, node4, node40, (-1));
        // The following exception was thrown during execution in test generation
        try {
            node4.setString("8");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.NumberLiteral cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "40" + "'", str24, "40");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        boolean boolean13 = node10.hasSideEffects();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(0, node10);
        node5.addChildrenToBack(node14);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(9, node5);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(13, node20);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(7, node20);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) 'a', node2, node16, node20, (int) (short) 1);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(7);
        node20.addChildrenToBack(node26);
        com.google.javascript.rhino.head.Node node28 = node26.getLastSibling();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString("");
        node36.removeProp(23);
        node32.addChildToFront(node36);
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean42 = node41.hasChildren();
        node32.addChildrenToFront(node41);
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str46 = node45.toString();
        boolean boolean47 = node45.hasConsistentReturnUsage();
        boolean boolean48 = node45.hasSideEffects();
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str51 = node50.toString();
        boolean boolean52 = node50.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newString("");
        node54.removeProp(23);
        node50.addChildToFront(node54);
        com.google.javascript.rhino.head.Node node58 = node50.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment59 = node50.getJsDocNode();
        node45.addChildToBack(node50);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(15, node32, node45);
        com.google.javascript.rhino.head.Node node64 = com.google.javascript.rhino.head.Node.newString(23, "");
        java.lang.String str65 = node64.toString();
        com.google.javascript.rhino.head.Node node68 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node71 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(0, node68, node71);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node(24, node32, node64, node72);
        com.google.javascript.rhino.head.Node node74 = node73.getLastChild();
        node73.setLineno(12);
        node26.addChildToBack(node73);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "40" + "'", str33, "40");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "40" + "'", str46, "40");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "40" + "'", str51, "40");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(comment59);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "23" + "'", str65, "23");
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node74);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode2 = null;
        java.lang.String str3 = node1.toStringTree(scriptNode2);
        int int6 = node1.getIntProp((-1), 26);
        com.google.javascript.rhino.head.Node node7 = null;
        com.google.javascript.rhino.head.Node node8 = node1.getChildBefore(node7);
        node1.setLineno(1);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("");
        node14.removeProp(23);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str20 = node19.toString();
        boolean boolean21 = node19.hasConsistentReturnUsage();
        boolean boolean22 = node19.hasSideEffects();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(0, node19);
        node14.addChildrenToBack(node23);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(9, node14);
        node14.removeProp(4);
        com.google.javascript.rhino.head.Node node29 = node14.setType(23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = null;
        java.lang.String str31 = node29.toStringTree(scriptNode30);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator32 = node29.spliterator();
        java.lang.String str33 = node29.getString();
        node29.setLineno((int) 'a');
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor36 = node29.iterator();
        node1.putProp(6, (java.lang.Object) nodeItor36);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 26 + "'", int6 == 26);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "40" + "'", str20, "40");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(nodeSpliterator32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(nodeItor36);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
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
        com.google.javascript.rhino.head.Node node36 = node33.getLastChild();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str39 = node38.toString();
        boolean boolean40 = node38.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newString("");
        node42.removeProp(23);
        node38.addChildToFront(node42);
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean48 = node47.hasChildren();
        node38.addChildrenToFront(node47);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator50 = node47.new NodeIterator();
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str53 = node52.toString();
        com.google.javascript.rhino.head.Node node54 = node52.getLastSibling();
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str58 = node57.toString();
        boolean boolean59 = node57.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newString("");
        node61.removeProp(23);
        node57.addChildToFront(node61);
        com.google.javascript.rhino.head.Node node65 = node57.getFirstChild();
        node65.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope68 = node65.getScope();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node((int) ' ', node65, 2);
        com.google.javascript.rhino.head.Node node71 = node65.getLastSibling();
        node54.addChildToFront(node71);
        node47.addChildrenToFront(node54);
        node36.addChildToFront(node54);
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node36, (int) (byte) 10);
        com.google.javascript.rhino.head.Node node78 = node36.setType(97);
        com.google.javascript.rhino.head.ast.Scope scope79 = node36.getScope();
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
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "40" + "'", str39, "40");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "40" + "'", str53, "40");
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "40" + "'", str58, "40");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(scope68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNull(scope79);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(15, "40");
        com.google.javascript.rhino.head.Node node4 = node2.setType(15);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator5 = node2.new NodeIterator();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
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
        int int35 = node29.getIntProp(0, (int) (byte) 1);
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node40 = node39.getLastSibling();
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(13, node44);
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(12);
        node48.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node(6, node48);
        com.google.javascript.rhino.head.Node node53 = node52.getLastChild();
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node44, node52, 0);
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node58.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node(20, node40, node44, node58);
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node40.addChildToFront(node64);
        com.google.javascript.rhino.head.ast.Comment comment66 = null;
        node40.setJsDocNode(comment66);
        node29.addChildrenToBack(node40);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        boolean boolean7 = node4.hasSideEffects();
        node2.addChildrenToFront(node4);
        node4.removeChildren();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("hi!");
        node4.addChildrenToBack(node11);
        com.google.javascript.rhino.head.Node node14 = node4.setType((int) (short) -1);
        java.lang.Object obj16 = null;
        node14.putProp(3, obj16);
        double double18 = node14.getDouble();
        int int21 = node14.getIntProp(0, 14);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) 1.0f);
        java.lang.Object obj25 = node23.getProp((int) 'a');
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor26 = node23.iterator();
        int int29 = node23.getIntProp((int) (byte) -1, 17);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(13, node33);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(7, node33);
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node35.addChildToFront(node37);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(12);
        node41.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(6, node41);
        com.google.javascript.rhino.head.Node node46 = node45.getLastChild();
        node35.addChildToFront(node45);
        node23.addChildToFront(node45);
        node23.putIntProp(0, 0);
        node14.addChildrenToBack(node23);
        java.lang.String str53 = node14.toString();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str56 = node55.toString();
        boolean boolean57 = node55.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newString("");
        node59.removeProp(23);
        node55.addChildToFront(node59);
        com.google.javascript.rhino.head.Node node63 = node55.getFirstChild();
        node63.setLineno(18);
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(23, node14, node63);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(nodeItor26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 17 + "'", int29 == 17);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-1" + "'", str53, "-1");
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "40" + "'", str56, "40");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) 41);
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node(12);
        node4.putIntProp(14, 3);
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
        node4.addChildToBack(node27);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str34 = node33.toString();
        boolean boolean35 = node33.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newString("");
        node37.removeProp(23);
        node33.addChildToFront(node37);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean43 = node42.hasChildren();
        node33.addChildrenToFront(node42);
        int int45 = node42.getLineno();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str48 = node47.toString();
        boolean boolean49 = node47.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newString("");
        node51.removeProp(23);
        node47.addChildToFront(node51);
        com.google.javascript.rhino.head.Node node55 = node47.getFirstChild();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node((int) (short) 0, node42, node47, 9);
        boolean boolean58 = node42.hasSideEffects();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str63 = node62.toString();
        boolean boolean64 = node62.hasConsistentReturnUsage();
        boolean boolean65 = node62.hasSideEffects();
        node60.addChildrenToFront(node62);
        node62.removeChildren();
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newString("hi!");
        node62.addChildrenToBack(node69);
        com.google.javascript.rhino.head.Node node72 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str73 = node72.toString();
        boolean boolean74 = node72.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node76 = com.google.javascript.rhino.head.Node.newString("");
        node76.removeProp(23);
        node72.addChildToFront(node76);
        com.google.javascript.rhino.head.Node node80 = node72.getFirstChild();
        com.google.javascript.rhino.head.Node node82 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node80.addChildrenToBack(node82);
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node42, node62, node82);
        com.google.javascript.rhino.head.Node node87 = com.google.javascript.rhino.head.Node.newString(19, "");
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node(0, node42, node87);
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node(0, node2, node27, node88);
        // The following exception was thrown during execution in test generation
        try {
            node2.setString("41");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.NumberLiteral cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "40" + "'", str34, "40");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "40" + "'", str48, "40");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "40" + "'", str63, "40");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "40" + "'", str73, "40");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node87);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
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
        boolean boolean25 = node24.hasConsistentReturnUsage();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
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
        java.lang.Object obj22 = node4.getProp(0);
        java.lang.String str23 = node4.getJsDoc();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(4, 8);
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str31 = node30.toString();
        boolean boolean32 = node30.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString("");
        node34.removeProp(23);
        node30.addChildToFront(node34);
        com.google.javascript.rhino.head.Node node38 = node30.getFirstChild();
        node38.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope41 = node38.getScope();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) ' ', node38, 2);
        com.google.javascript.rhino.head.Node node44 = node38.getLastSibling();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node48 = node47.getLastSibling();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) ' ', node44, node47);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor50 = node47.iterator();
        node26.addChildrenToFront(node47);
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString("23");
        node53.removeChildren();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node4, node26, node53, 25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = null;
        java.lang.String str58 = node4.toStringTree(scriptNode57);
        com.google.javascript.rhino.head.Node node59 = node4.getLastSibling();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "40" + "'", str17, "40");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "40" + "'", str31, "40");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(scope41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeItor50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(node59);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        boolean boolean7 = node4.hasSideEffects();
        node2.addChildrenToFront(node4);
        node4.removeChildren();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("hi!");
        node4.addChildrenToBack(node11);
        boolean boolean13 = node4.hasSideEffects();
        java.lang.String str14 = node4.getJsDoc();
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
        com.google.javascript.rhino.head.ast.Comment comment66 = null;
        node61.setJsDocNode(comment66);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node(0, node4, node61);
        com.google.javascript.rhino.head.ast.Comment comment69 = null;
        node4.setJsDocNode(comment69);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Scope scope71 = node4.getScope();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.NumberLiteral cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
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
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Scope scope96 = node33.getScope();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node2 = node1.getLastSibling();
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node(11);
        com.google.javascript.rhino.head.Node node6 = node4.setType(2);
        node6.removeChildren();
        node2.addChildrenToFront(node6);
        com.google.javascript.rhino.head.Node node9 = node2.getFirstChild();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
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
        int int15 = node11.getType();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str19 = node18.toString();
        boolean boolean20 = node18.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newString("");
        node22.removeProp(23);
        node18.addChildToFront(node22);
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean28 = node27.hasChildren();
        node18.addChildrenToFront(node27);
        int int30 = node27.getLineno();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString("");
        node36.removeProp(23);
        node32.addChildToFront(node36);
        com.google.javascript.rhino.head.Node node40 = node32.getFirstChild();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) (short) 0, node27, node32, 9);
        boolean boolean43 = node27.hasSideEffects();
        node27.removeProp((int) (byte) -1);
        int int48 = node27.getIntProp(22, 11);
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node(25, node11, node27, 21);
        java.lang.String str51 = node11.getJsDoc();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "40" + "'", str19, "40");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "40" + "'", str33, "40");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 11 + "'", int48 == 11);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
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
        com.google.javascript.rhino.head.ast.Scope scope82 = null;
        node50.setScope(scope82);
        boolean boolean84 = node50.hasSideEffects();
        node50.removeProp((int) (short) 100);
        node50.removeChildren();
        java.lang.String str88 = node50.getJsDoc();
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
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
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
        // The following exception was thrown during execution in test generation
        try {
            node23.setDouble((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
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
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        node1.addChildrenToFront(node3);
        node3.removeChildren();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("hi!");
        node3.addChildrenToBack(node10);
        com.google.javascript.rhino.head.Node node12 = node3.getFirstChild();
        java.lang.String str13 = node12.getJsDoc();
        int int16 = node12.getIntProp(12, 8);
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node20.putIntProp(20, 100);
        node12.putProp((int) ' ', (java.lang.Object) 20);
        com.google.javascript.rhino.head.Node node25 = node12.getNext();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node26 = node25.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node(13, node4);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(7, node4);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node((int) (short) 10, node4, 41);
        com.google.javascript.rhino.head.ast.Comment comment9 = node4.getJsDocNode();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(comment9);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        java.lang.String str3 = node2.toString();
        com.google.javascript.rhino.head.Node node4 = node2.getLastChild();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator5 = node2.new NodeIterator();
        java.lang.Class<?> wildcardClass6 = nodeIterator5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        com.google.javascript.rhino.head.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(15, node1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(8);
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str4 = node3.toString();
        com.google.javascript.rhino.head.ast.Comment comment5 = node3.getJsDocNode();
        com.google.javascript.rhino.head.Node node6 = node3.getFirstChild();
        node1.addChildToFront(node3);
        com.google.javascript.rhino.head.ast.Comment comment8 = null;
        node1.setJsDocNode(comment8);
        node1.removeProp(21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertNull(comment5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
        double double68 = node31.getDouble();
        boolean boolean69 = node31.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator70 = node31.new NodeIterator();
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
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 32.0d + "'", double68 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
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
        node2.putIntProp(100, (int) (byte) 0);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator35 = node2.new NodeIterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node36 = nodeIterator35.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        boolean boolean5 = node2.hasSideEffects();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("");
        node11.removeProp(23);
        node7.addChildToFront(node11);
        com.google.javascript.rhino.head.Node node15 = node7.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment16 = node7.getJsDocNode();
        node2.addChildToBack(node7);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor18 = node2.iterator();
        com.google.javascript.rhino.head.ast.Comment comment19 = node2.getJsDocNode();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator20 = node2.new NodeIterator();
        double double21 = node2.getDouble();
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        boolean boolean29 = node26.hasSideEffects();
        node24.addChildrenToFront(node26);
        node26.removeChildren();
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("hi!");
        node26.addChildrenToBack(node33);
        node33.setLineno(22);
        boolean boolean37 = node33.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("-1");
        node39.removeProp(25);
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString("");
        int int46 = node43.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str53 = node52.toString();
        boolean boolean54 = node52.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newString("");
        node56.removeProp(23);
        node52.addChildToFront(node56);
        com.google.javascript.rhino.head.Node node60 = node52.getFirstChild();
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node60.addChildrenToBack(node62);
        com.google.javascript.rhino.head.Node node65 = com.google.javascript.rhino.head.Node.newString("");
        int int68 = node65.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node((int) (short) 10, node60, node65);
        com.google.javascript.rhino.head.Node node71 = node60.setType(18);
        node43.addChildAfter(node49, node71);
        node39.addChildToFront(node71);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node33, node71);
        node2.addChildrenToBack(node71);
        boolean boolean76 = node71.hasSideEffects();
        com.google.javascript.rhino.head.Node node78 = new com.google.javascript.rhino.head.Node(0, node71, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = node78.getExistingIntProp(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "40" + "'", str8, "40");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(comment16);
        org.junit.Assert.assertNotNull(nodeItor18);
        org.junit.Assert.assertNull(comment19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "40" + "'", str27, "40");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "40" + "'", str53, "40");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
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
        com.google.javascript.rhino.head.Node node40 = node5.getNext();
        // The following exception was thrown during execution in test generation
        try {
            int int42 = node40.getExistingIntProp(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node(12);
        node3.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(6, node3);
        com.google.javascript.rhino.head.Node node8 = node7.getLastChild();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str13 = node12.toString();
        boolean boolean14 = node12.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString("");
        node16.removeProp(23);
        node12.addChildToFront(node16);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean22 = node21.hasChildren();
        node12.addChildrenToFront(node21);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str26 = node25.toString();
        boolean boolean27 = node25.hasChildren();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) (short) -1, node21, node25, (int) (short) 10);
        com.google.javascript.rhino.head.Node node30 = node29.getLastChild();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("");
        node39.removeProp(23);
        node35.addChildToFront(node39);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) 'a', node35);
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str48 = node47.toString();
        com.google.javascript.rhino.head.Node node49 = node47.getLastChild();
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node((int) (short) -1, node35, node45, node47, (int) (short) -1);
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node((int) (short) 1, node47, 12);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(23);
        node55.removeProp(25);
        boolean boolean58 = node55.hasChildren();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((-1), node30, node47, node55);
        node8.addChildToBack(node30);
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node(18, node8, 0);
        node8.putIntProp((int) (short) 0, 2);
        java.lang.String str66 = node8.getJsDoc();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "40" + "'", str13, "40");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1" + "'", str26, "-1");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "40" + "'", str36, "40");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "40" + "'", str48, "40");
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(str66);
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
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean13 = node12.hasChildren();
        node3.addChildrenToFront(node12);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.hasChildren();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (short) -1, node12, node16, (int) (short) 10);
        com.google.javascript.rhino.head.Node node21 = node20.getLastChild();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(97, node21);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = node21.labelId();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
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
        boolean boolean36 = node32.hasChildren();
        com.google.javascript.rhino.head.Node node37 = node32.getLastChild();
        java.lang.String str38 = node32.toString();
        java.lang.String str39 = node32.getJsDoc();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "10" + "'", str38, "10");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        boolean boolean7 = node4.hasSideEffects();
        node2.addChildrenToFront(node4);
        node4.removeChildren();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("hi!");
        node4.addChildrenToBack(node11);
        com.google.javascript.rhino.head.Node node14 = node4.setType((int) (short) -1);
        com.google.javascript.rhino.head.Node node16 = node14.setType(23);
        double double17 = node16.getDouble();
        com.google.javascript.rhino.head.Node node18 = node16.getLastSibling();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(12);
        node21.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(6, node21);
        int int28 = node25.getIntProp(18, 26);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str34 = node33.toString();
        boolean boolean35 = node33.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newString("");
        node37.removeProp(23);
        node33.addChildToFront(node37);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean43 = node42.hasChildren();
        node33.addChildrenToFront(node42);
        int int45 = node42.getLineno();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str48 = node47.toString();
        boolean boolean49 = node47.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newString("");
        node51.removeProp(23);
        node47.addChildToFront(node51);
        com.google.javascript.rhino.head.Node node55 = node47.getFirstChild();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node((int) (short) 0, node42, node47, 9);
        boolean boolean58 = node42.hasSideEffects();
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node62 = node61.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator63 = node62.new NodeIterator();
        com.google.javascript.rhino.head.Node node65 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str66 = node65.toString();
        boolean boolean67 = node65.hasConsistentReturnUsage();
        boolean boolean68 = node65.hasSideEffects();
        com.google.javascript.rhino.head.Node node70 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str71 = node70.toString();
        boolean boolean72 = node70.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newString("");
        node74.removeProp(23);
        node70.addChildToFront(node74);
        com.google.javascript.rhino.head.Node node78 = node70.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment79 = node70.getJsDocNode();
        node65.addChildToBack(node70);
        java.lang.String str81 = node65.toString();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node(0, node42, node62, node65, 1);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator84 = node65.new NodeIterator();
        node25.putProp(19, (java.lang.Object) node65);
        node25.removeChildren();
        com.google.javascript.rhino.head.Node node87 = new com.google.javascript.rhino.head.Node(100, node16, node25);
        node87.putIntProp(41, (int) (short) 10);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator91 = node87.new NodeIterator();
        node87.removeProp(13);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 26 + "'", int28 == 26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "40" + "'", str34, "40");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "40" + "'", str48, "40");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "40" + "'", str66, "40");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "40" + "'", str71, "40");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNull(comment79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "40" + "'", str81, "40");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.hasConsistentReturnUsage();
        boolean boolean24 = node21.hasSideEffects();
        node19.addChildrenToFront(node21);
        node21.removeChildren();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString("hi!");
        node21.addChildrenToBack(node28);
        node17.addChildToFront(node21);
        int int31 = node17.getType();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("");
        node39.removeProp(23);
        node35.addChildToFront(node39);
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean45 = node44.hasChildren();
        node35.addChildrenToFront(node44);
        int int47 = node44.getLineno();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str50 = node49.toString();
        boolean boolean51 = node49.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString("");
        node53.removeProp(23);
        node49.addChildToFront(node53);
        com.google.javascript.rhino.head.Node node57 = node49.getFirstChild();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (short) 0, node44, node49, 9);
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newString("1");
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor62 = node61.iterator();
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node(21, node59, node61, (int) '4');
        node17.addChildrenToFront(node64);
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node64, 0);
        node67.putIntProp((int) '4', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str71 = node67.getString();
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 41 + "'", int31 == 41);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "40" + "'", str36, "40");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "40" + "'", str50, "40");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeItor62);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        node1.addChildrenToFront(node3);
        node3.removeChildren();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("hi!");
        node3.addChildrenToBack(node10);
        node10.setLineno(22);
        boolean boolean14 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node15 = node10.getFirstChild();
        int int16 = node10.getType();
        com.google.javascript.rhino.head.Node node17 = node10.getLastSibling();
        int int18 = node10.getType();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 41 + "'", int16 == 41);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 41 + "'", int18 == 41);
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
        com.google.javascript.rhino.head.Node node11 = node3.getFirstChild();
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node11.addChildrenToBack(node13);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString("");
        int int19 = node16.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (short) 10, node11, node16);
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(13, node24);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(7, node24);
        node26.removeChildren();
        java.lang.String str28 = node26.getJsDoc();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(5, node20, node26, 10);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator31 = node26.new NodeIterator();
        // The following exception was thrown during execution in test generation
        try {
            nodeIterator31.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: next() has not been called");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, node2, node5);
        int int7 = node2.getLineno();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor8 = node2.iterator();
        boolean boolean9 = node2.hasSideEffects();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(0, node12, node15);
        node2.addChildrenToBack(node12);
        com.google.javascript.rhino.head.Node node18 = node2.getNext();
        java.lang.String str19 = node18.getJsDoc();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(nodeItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(8);
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str5 = node4.toString();
        com.google.javascript.rhino.head.ast.Comment comment6 = node4.getJsDocNode();
        com.google.javascript.rhino.head.Node node7 = node4.getFirstChild();
        node2.addChildToFront(node4);
        com.google.javascript.rhino.head.ast.Comment comment9 = null;
        node2.setJsDocNode(comment9);
        com.google.javascript.rhino.head.Node node11 = node2.getLastChild();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(11, node11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node(21, 3);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) 0);
        com.google.javascript.rhino.head.ast.Comment comment6 = node5.getJsDocNode();
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        boolean boolean13 = node10.hasSideEffects();
        node8.addChildrenToFront(node10);
        boolean boolean15 = node10.hasSideEffects();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) ' ', node3, node5, node10);
        boolean boolean17 = node10.hasChildren();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor18 = node10.iterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor19 = node10.iterator();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(comment6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeItor18);
        org.junit.Assert.assertNotNull(nodeItor19);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) 0.0f);
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node(7);
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node(22, node2, node4);
        node2.setLineno(6);
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        java.lang.String str12 = node11.toString();
        com.google.javascript.rhino.head.Node node13 = node11.getLastChild();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node17 = node16.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator18 = node17.new NodeIterator();
        node17.setLineno(13);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator21 = node17.spliterator();
        java.lang.String str22 = node17.toString();
        node11.addChildrenToBack(node17);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(13, node11);
        node2.addChildToBack(node24);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeSpliterator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "23" + "'", str22, "23");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
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
        boolean boolean28 = node12.hasConsistentReturnUsage();
        java.lang.Object obj30 = node12.getProp((int) 'a');
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
        com.google.javascript.rhino.head.Node node52 = node50.getNext();
        java.lang.Object obj54 = node50.getProp((int) '4');
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str58 = node57.toString();
        boolean boolean59 = node57.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newString("");
        node61.removeProp(23);
        node57.addChildToFront(node61);
        com.google.javascript.rhino.head.Node node65 = node57.getFirstChild();
        node65.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope68 = node65.getScope();
        node65.setLineno(12);
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node((int) (byte) 0, node65, (int) '#');
        java.lang.String str73 = node65.toString();
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node(0, node12, node50, node65, 0);
        boolean boolean76 = node12.hasConsistentReturnUsage();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "40" + "'", str34, "40");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-1" + "'", str47, "-1");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "40" + "'", str58, "40");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(scope68);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "41" + "'", str73, "41");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
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
        node3.setJsDocNode(comment33);
        java.lang.Object obj36 = node3.getProp(26);
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
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 3);
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
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
        com.google.javascript.rhino.head.Node node22 = node3.getLastChild();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(13, node31);
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node(7, node31);
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node33.addChildToFront(node35);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(12);
        node39.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node(6, node39);
        com.google.javascript.rhino.head.Node node44 = node43.getLastChild();
        node33.addChildToFront(node43);
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(97, node27, node33);
        com.google.javascript.rhino.head.Node node47 = node27.getLastChild();
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str51 = node50.toString();
        boolean boolean52 = node50.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newString("");
        node54.removeProp(23);
        node50.addChildToFront(node54);
        com.google.javascript.rhino.head.Node node58 = node50.getFirstChild();
        node58.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope61 = node58.getScope();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) ' ', node58, 2);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator64 = node58.spliterator();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str68 = node67.toString();
        com.google.javascript.rhino.head.ast.Comment comment69 = node67.getJsDocNode();
        node58.putProp((int) '#', (java.lang.Object) node67);
        boolean boolean71 = node67.hasSideEffects();
        int int72 = node67.getLineno();
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str75 = node74.toString();
        boolean boolean76 = node74.hasConsistentReturnUsage();
        boolean boolean77 = node74.hasSideEffects();
        com.google.javascript.rhino.head.Node node79 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str80 = node79.toString();
        boolean boolean81 = node79.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node83 = com.google.javascript.rhino.head.Node.newString("");
        node83.removeProp(23);
        node79.addChildToFront(node83);
        com.google.javascript.rhino.head.Node node87 = node79.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment88 = node79.getJsDocNode();
        node74.addChildToBack(node79);
        java.lang.String str90 = node74.toString();
        com.google.javascript.rhino.head.Node node92 = node74.setType(25);
        com.google.javascript.rhino.head.Node node93 = new com.google.javascript.rhino.head.Node(25, node27, node67, node92);
        java.lang.Object obj95 = node27.getProp((int) '4');
        node22.addChildToBack(node27);
        int int99 = node27.getIntProp(2, 8);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "40" + "'", str16, "40");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "40" + "'", str51, "40");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(scope61);
        org.junit.Assert.assertNotNull(nodeSpliterator64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "-1" + "'", str68, "-1");
        org.junit.Assert.assertNull(comment69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "40" + "'", str75, "40");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "40" + "'", str80, "40");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNull(comment88);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "40" + "'", str90, "40");
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 8 + "'", int99 == 8);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
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
        int int27 = node15.getType();
        int int30 = node15.getIntProp(100, 35);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("");
        int int5 = node2.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("");
        node15.removeProp(23);
        node11.addChildToFront(node15);
        com.google.javascript.rhino.head.Node node19 = node11.getFirstChild();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node19.addChildrenToBack(node21);
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString("");
        int int27 = node24.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) (short) 10, node19, node24);
        com.google.javascript.rhino.head.Node node30 = node19.setType(18);
        node2.addChildAfter(node8, node30);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean34 = node33.hasSideEffects();
        node8.addChildrenToFront(node33);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str39 = node38.toString();
        boolean boolean40 = node38.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newString("");
        node42.removeProp(23);
        node38.addChildToFront(node42);
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean48 = node47.hasChildren();
        node38.addChildrenToFront(node47);
        int int50 = node47.getLineno();
        int int51 = node47.getType();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node47);
        node8.addChildrenToFront(node52);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator54 = node8.new NodeIterator();
        com.google.javascript.rhino.head.Node node55 = node8.getLastSibling();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node8);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "40" + "'", str12, "40");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "40" + "'", str39, "40");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 40 + "'", int51 == 40);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) 10.0f);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator3 = node2.new NodeIterator();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("");
        node10.removeProp(23);
        node6.addChildToFront(node10);
        com.google.javascript.rhino.head.Node node14 = node6.getFirstChild();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node14.addChildrenToBack(node16);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString("");
        int int22 = node19.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (short) 10, node14, node19);
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node28 = node27.getLastSibling();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasConsistentReturnUsage();
        boolean boolean35 = node32.hasSideEffects();
        node30.addChildrenToFront(node32);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(26, node27, node30, 20);
        boolean boolean39 = node38.hasSideEffects();
        java.lang.String str40 = node38.getJsDoc();
        node19.addChildToFront(node38);
        node2.addChildToFront(node19);
        boolean boolean43 = node2.hasChildren();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor44 = node2.iterator();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString((int) (short) -1, "4");
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) 7);
        node50.putIntProp(0, 18);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(0, node50);
        boolean boolean55 = node50.hasChildren();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node(3, node2, node47, node50);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = null;
        java.lang.String str58 = node56.toStringTree(scriptNode57);
        boolean boolean59 = node56.hasSideEffects();
        // The following exception was thrown during execution in test generation
        try {
            int int60 = node56.labelId();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "40" + "'", str7, "40");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "40" + "'", str33, "40");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(nodeItor44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator5 = node4.new NodeIterator();
        node4.setLineno(13);
        boolean boolean8 = node4.hasSideEffects();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str13 = node12.toString();
        boolean boolean14 = node12.hasConsistentReturnUsage();
        boolean boolean15 = node12.hasSideEffects();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(0, node12);
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
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node12, node32, node39, (int) (short) 0);
        com.google.javascript.rhino.head.Node node43 = node41.setType(16);
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(13, node47);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(7, node47);
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node(97, node4, node43, node47, 8);
        com.google.javascript.rhino.head.Node node52 = node43.getLastSibling();
        int int53 = node43.getType();
        int int56 = node43.getIntProp(22, 25);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "40" + "'", str13, "40");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "40" + "'", str20, "40");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1" + "'", str33, "-1");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 16 + "'", int53 == 16);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 25 + "'", int56 == 25);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
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
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node31 = node30.getLastSibling();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        boolean boolean38 = node35.hasSideEffects();
        node33.addChildrenToFront(node35);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(26, node30, node33, 20);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str46 = node45.toString();
        boolean boolean47 = node45.hasConsistentReturnUsage();
        boolean boolean48 = node45.hasSideEffects();
        node43.addChildrenToFront(node45);
        node45.removeChildren();
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newString("hi!");
        node45.addChildrenToBack(node52);
        boolean boolean54 = node45.hasSideEffects();
        com.google.javascript.rhino.head.Node node55 = node45.getFirstChild();
        node11.replaceChildAfter(node30, node45);
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newString("");
        int int60 = node59.getLineno();
        com.google.javascript.rhino.head.Node node62 = node59.setType((-1));
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str65 = node64.toString();
        node64.removeChildren();
        boolean boolean67 = node64.hasChildren();
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node71 = com.google.javascript.rhino.head.Node.newString("");
        node71.removeProp(23);
        com.google.javascript.rhino.head.Node node76 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str77 = node76.toString();
        boolean boolean78 = node76.hasConsistentReturnUsage();
        boolean boolean79 = node76.hasSideEffects();
        com.google.javascript.rhino.head.Node node80 = new com.google.javascript.rhino.head.Node(0, node76);
        node71.addChildrenToBack(node80);
        node69.addChildToFront(node71);
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node(6, node59, node64, node69);
        node69.putIntProp(0, (int) (byte) 10);
        node11.addChildrenToFront(node69);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator88 = node11.spliterator();
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
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "40" + "'", str36, "40");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "40" + "'", str46, "40");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "100" + "'", str65, "100");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "40" + "'", str77, "40");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator88);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        node4.addChildToFront(node8);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean14 = node13.hasChildren();
        node4.addChildrenToFront(node13);
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        boolean boolean20 = node17.hasSideEffects();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString("");
        node26.removeProp(23);
        node22.addChildToFront(node26);
        com.google.javascript.rhino.head.Node node30 = node22.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment31 = node22.getJsDocNode();
        node17.addChildToBack(node22);
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node(15, node4, node17);
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString(23, "");
        java.lang.String str37 = node36.toString();
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node(0, node40, node43);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(24, node4, node36, node44);
        int int48 = node36.getIntProp((int) 'a', 14);
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newString("");
        node51.removeProp(23);
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str57 = node56.toString();
        boolean boolean58 = node56.hasConsistentReturnUsage();
        boolean boolean59 = node56.hasSideEffects();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node(0, node56);
        node51.addChildrenToBack(node60);
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node(9, node51);
        node51.removeProp(4);
        com.google.javascript.rhino.head.ast.Scope scope65 = null;
        node51.setScope(scope65);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node(21, node36, node51, 5);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator69 = node51.new NodeIterator();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "40" + "'", str23, "40");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(comment31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "23" + "'", str37, "23");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 14 + "'", int48 == 14);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "40" + "'", str57, "40");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
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
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator55 = node44.new NodeIterator();
        com.google.javascript.rhino.head.Node node56 = nodeIterator55.next();
        com.google.javascript.rhino.head.Node node57 = node56.getNext();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node(23);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode60 = null;
        java.lang.String str61 = node59.toStringTree(scriptNode60);
        int int64 = node59.getIntProp((-1), 26);
        // The following exception was thrown during execution in test generation
        try {
            node4.replaceChildAfter(node57, node59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 26 + "'", int64 == 26);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(10, (int) ' ');
        java.lang.Class<?> wildcardClass3 = node2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node4 = node2.setType((int) (short) 10);
        int int7 = node4.getIntProp(4, 12);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = node4.new NodeIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = node4.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node9 = node1.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment10 = node1.getJsDocNode();
        int int11 = node1.getType();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator12 = node1.new NodeIterator();
        boolean boolean13 = nodeIterator12.hasNext();
        boolean boolean14 = nodeIterator12.hasNext();
        com.google.javascript.rhino.head.Node node15 = nodeIterator12.next();
        boolean boolean16 = nodeIterator12.hasNext();
        nodeIterator12.remove();
        boolean boolean18 = nodeIterator12.hasNext();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(comment10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(0, "hi!");
        boolean boolean3 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(0, node6, node9);
        int int11 = node6.getLineno();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor12 = node6.iterator();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) 0.0f);
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(7);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(22, node15, node17);
        node6.addChildrenToBack(node15);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str22 = node21.toString();
        com.google.javascript.rhino.head.ast.Comment comment23 = node21.getJsDocNode();
        com.google.javascript.rhino.head.ast.Comment comment24 = node21.getJsDocNode();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        node21.addChildToBack(node26);
        java.lang.String str30 = node26.getJsDoc();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(13, node34);
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(7, node34);
        node36.removeChildren();
        node26.addChildrenToFront(node36);
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildAfter(node6, node36);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: newChild had siblings in addChildAfter");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(nodeItor12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1" + "'", str22, "-1");
        org.junit.Assert.assertNull(comment23);
        org.junit.Assert.assertNull(comment24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "40" + "'", str27, "40");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
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
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator54 = node35.spliterator();
        com.google.javascript.rhino.head.Node node55 = node35.getNext();
        boolean boolean56 = node35.hasChildren();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = node35.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.NumberLiteral cannot be cast to com.google.javascript.rhino.head.ast.Name");
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
        org.junit.Assert.assertNotNull(nodeSpliterator54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(11);
        com.google.javascript.rhino.head.Node node3 = node1.setType(2);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator4 = node3.spliterator();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeSpliterator4);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(5, "41");
        com.google.javascript.rhino.head.ast.Comment comment4 = null;
        node3.setJsDocNode(comment4);
        boolean boolean6 = node3.hasChildren();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node9 = node8.getLastSibling();
        com.google.javascript.rhino.head.ast.Comment comment10 = null;
        node9.setJsDocNode(comment10);
        node9.putIntProp(5, (int) (short) 10);
        com.google.javascript.rhino.head.Node node16 = node9.setType(0);
        node3.addChildToBack(node16);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) 0, node16, 97);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node6 = node5.getLastSibling();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(13, node10);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(12);
        node14.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(6, node14);
        com.google.javascript.rhino.head.Node node19 = node18.getLastChild();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node10, node18, 0);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node24.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(20, node6, node10, node24);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) (short) 0, node24);
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node33 = node32.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator34 = node33.new NodeIterator();
        node33.setLineno(13);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator37 = node33.spliterator();
        java.lang.String str38 = node33.toString();
        int int39 = node33.getType();
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(97, node24, node33, 22);
        node41.removeChildren();
        com.google.javascript.rhino.head.Node node43 = node41.getNext();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeSpliterator37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "23" + "'", str38, "23");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 23 + "'", int39 == 23);
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
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
        java.lang.Object obj22 = node4.getProp(0);
        java.lang.String str23 = node4.getJsDoc();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(4, 8);
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str31 = node30.toString();
        boolean boolean32 = node30.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString("");
        node34.removeProp(23);
        node30.addChildToFront(node34);
        com.google.javascript.rhino.head.Node node38 = node30.getFirstChild();
        node38.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope41 = node38.getScope();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) ' ', node38, 2);
        com.google.javascript.rhino.head.Node node44 = node38.getLastSibling();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node48 = node47.getLastSibling();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) ' ', node44, node47);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor50 = node47.iterator();
        node26.addChildrenToFront(node47);
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString("23");
        node53.removeChildren();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node4, node26, node53, 25);
        int int57 = node56.getType();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        java.lang.String str62 = node61.toString();
        com.google.javascript.rhino.head.Node node63 = node61.getLastChild();
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node67 = node66.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator68 = node67.new NodeIterator();
        node67.setLineno(13);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator71 = node67.spliterator();
        java.lang.String str72 = node67.toString();
        node61.addChildrenToBack(node67);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(13, node61);
        node56.addChildToBack(node74);
        // The following exception was thrown during execution in test generation
        try {
            double double76 = node74.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "40" + "'", str17, "40");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "40" + "'", str31, "40");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(scope41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeItor50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1" + "'", str62, "1");
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeSpliterator71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "23" + "'", str72, "23");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("");
        node11.removeProp(23);
        node7.addChildToFront(node11);
        com.google.javascript.rhino.head.Node node15 = node7.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment16 = node7.getJsDocNode();
        int int17 = node7.getType();
        node7.setDouble((double) 17);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString("");
        node25.removeProp(23);
        node21.addChildToFront(node25);
        java.lang.String str29 = node25.getString();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString((int) (short) 0, "-1");
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(10, node7, node25, node32, 14);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(13, node38);
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node(7, node38);
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node(0, node43, node46);
        com.google.javascript.rhino.head.Node node48 = node47.getLastSibling();
        node32.addChildAfter(node40, node47);
        boolean boolean50 = node47.hasSideEffects();
        com.google.javascript.rhino.head.Node node51 = node47.getFirstChild();
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str58 = node57.toString();
        boolean boolean59 = node57.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newString("");
        node61.removeProp(23);
        node57.addChildToFront(node61);
        com.google.javascript.rhino.head.Node node65 = node57.getFirstChild();
        node65.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope68 = node65.getScope();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node((int) ' ', node65, 2);
        com.google.javascript.rhino.head.Node node71 = node65.getLastSibling();
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node75 = node74.getLastSibling();
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node((int) ' ', node71, node74);
        node74.setLineno((int) (byte) 0);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node(13, node74);
        com.google.javascript.rhino.head.Node node81 = com.google.javascript.rhino.head.Node.newNumber((double) 16);
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node(20, node79, node81, 11);
        com.google.javascript.rhino.head.ast.Comment comment84 = node83.getJsDocNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node((int) (short) -1, node4, node47, (com.google.javascript.rhino.head.Node) comment84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "40" + "'", str8, "40");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(comment16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "40" + "'", str58, "40");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(scope68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNull(comment84);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
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
        com.google.javascript.rhino.head.Node node21 = node13.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment22 = node13.getJsDocNode();
        int int23 = node13.getType();
        node13.setDouble((double) 17);
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str28 = node27.toString();
        boolean boolean29 = node27.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("");
        node31.removeProp(23);
        node27.addChildToFront(node31);
        java.lang.String str35 = node31.getString();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString((int) (short) 0, "-1");
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node(10, node13, node31, node38, 14);
        java.lang.String str41 = node40.getJsDoc();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node(17, node40, (int) (byte) 0);
        com.google.javascript.rhino.head.Node node44 = node40.getLastChild();
        node2.addChildrenToBack(node40);
        com.google.javascript.rhino.head.Node node46 = node2.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator47 = node46.new NodeIterator();
        boolean boolean48 = nodeIterator47.hasNext();
        com.google.javascript.rhino.head.Node node49 = nodeIterator47.next();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "40" + "'", str14, "40");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(comment22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 40 + "'", int23 == 40);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "40" + "'", str28, "40");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        com.google.javascript.rhino.head.ast.Comment comment4 = null;
        node3.setJsDocNode(comment4);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node((int) (short) 100, node3, 100);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) 1.0f);
        java.lang.Object obj12 = node10.getProp((int) 'a');
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor13 = node10.iterator();
        int int16 = node10.getIntProp((int) (byte) -1, 17);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(13, node20);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(7, node20);
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node22.addChildToFront(node24);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(12);
        node28.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(6, node28);
        com.google.javascript.rhino.head.Node node33 = node32.getLastChild();
        node22.addChildToFront(node32);
        node10.addChildToFront(node32);
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node10, node37);
        java.lang.String str39 = node10.getJsDoc();
        node10.removeProp((int) (byte) 10);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) (byte) 1);
        node43.removeProp((int) (short) 10);
        java.lang.Object obj47 = node43.getProp(15);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator48 = node43.spliterator();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(32, node3, node10, node43);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(nodeItor13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(nodeSpliterator48);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node11 = node3.getFirstChild();
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node11.addChildrenToBack(node13);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString("");
        int int19 = node16.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (short) 10, node11, node16);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str24 = node23.toString();
        int int25 = node23.getLineno();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) 0);
        com.google.javascript.rhino.head.ast.Comment comment28 = node27.getJsDocNode();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasConsistentReturnUsage();
        boolean boolean35 = node32.hasSideEffects();
        node30.addChildrenToFront(node32);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(8, node23, node27, node30);
        java.lang.Object obj39 = node30.getProp((int) (short) -1);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str44 = node43.toString();
        boolean boolean45 = node43.hasConsistentReturnUsage();
        boolean boolean46 = node43.hasSideEffects();
        node41.addChildrenToFront(node43);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = null;
        java.lang.String str49 = node43.toStringTree(scriptNode48);
        node11.addChildAfter(node30, node43);
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node(7, node11, 0);
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString((int) (byte) 100, "11");
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node(23, (int) (short) -1);
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str63 = node62.toString();
        boolean boolean64 = node62.hasConsistentReturnUsage();
        boolean boolean65 = node62.hasSideEffects();
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(0, node62);
        com.google.javascript.rhino.head.Node node67 = node66.getLastChild();
        node66.removeChildren();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(19, node59, node66, 24);
        com.google.javascript.rhino.head.Node node71 = node70.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            node11.addChildBefore(node55, node70);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100" + "'", str24, "100");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(comment28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "40" + "'", str33, "40");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "40" + "'", str44, "40");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "40" + "'", str63, "40");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node71);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        node1.addChildrenToFront(node3);
        node3.removeChildren();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("hi!");
        node3.addChildrenToBack(node10);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str15 = node14.toString();
        boolean boolean16 = node14.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newString("");
        node18.removeProp(23);
        node14.addChildToFront(node18);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean24 = node23.hasChildren();
        node14.addChildrenToFront(node23);
        int int26 = node23.getLineno();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str29 = node28.toString();
        boolean boolean30 = node28.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString("");
        node32.removeProp(23);
        node28.addChildToFront(node32);
        com.google.javascript.rhino.head.Node node36 = node28.getFirstChild();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (short) 0, node23, node28, 9);
        boolean boolean39 = node23.hasSideEffects();
        node23.removeProp((int) (byte) -1);
        node10.addChildrenToFront(node23);
        node10.setLineno((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double45 = node10.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.Name cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "40" + "'", str15, "40");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "40" + "'", str29, "40");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(10, "100");
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(13, node6);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(7, node6);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node8.addChildToFront(node10);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(12);
        node14.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(6, node14);
        com.google.javascript.rhino.head.Node node19 = node18.getLastChild();
        node8.addChildToFront(node18);
        node2.addChildToFront(node8);
        java.lang.Object obj23 = node2.getProp(21);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString(0, "100");
        java.lang.Object obj28 = node26.getProp((int) (short) -1);
        com.google.javascript.rhino.head.ast.Scope scope29 = node26.getScope();
        node2.addChildToBack(node26);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(scope29);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
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
        com.google.javascript.rhino.head.Node node19 = node12.getLastSibling();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator20 = node12.spliterator();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(9, node12, 10);
        int int23 = node12.getLineno();
        int int24 = node12.getType();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(8, node12, 0);
        node12.setLineno(16);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeSpliterator20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41 + "'", int24 == 41);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node11 = node3.getFirstChild();
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node11.addChildrenToBack(node13);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString("");
        int int19 = node16.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (short) 10, node11, node16);
        com.google.javascript.rhino.head.Node node21 = node11.getNext();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString(26, "32");
        int int27 = node24.getIntProp((int) ' ', 20);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator28 = node24.spliterator();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString(100, "52");
        com.google.javascript.rhino.head.Node node33 = node32.getLastSibling();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((-1), 0);
        com.google.javascript.rhino.head.Node node38 = node36.setType((int) (byte) -1);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(4, 12);
        node38.addChildToFront(node41);
        com.google.javascript.rhino.head.Node node43 = node41.getFirstChild();
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node48.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) 'a', node48);
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str55 = node54.toString();
        boolean boolean56 = node54.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newString("");
        node58.removeProp(23);
        node54.addChildToFront(node58);
        com.google.javascript.rhino.head.Node node62 = node54.getFirstChild();
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node62.addChildrenToBack(node64);
        node62.setString("40");
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node(40, node48, node62);
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node(0, node32, node41, node68);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(32, node21, node24, node69);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertNotNull(nodeSpliterator28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "40" + "'", str55, "40");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node62);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        boolean boolean8 = node5.hasSideEffects();
        node3.addChildrenToFront(node5);
        node5.removeChildren();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("hi!");
        node5.addChildrenToBack(node12);
        com.google.javascript.rhino.head.Node node15 = node5.setType((int) (short) -1);
        com.google.javascript.rhino.head.Node node17 = node15.setType(23);
        double double18 = node17.getDouble();
        com.google.javascript.rhino.head.Node node19 = node17.getLastSibling();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(12);
        node22.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(6, node22);
        int int29 = node26.getIntProp(18, 26);
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str35 = node34.toString();
        boolean boolean36 = node34.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("");
        node38.removeProp(23);
        node34.addChildToFront(node38);
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean44 = node43.hasChildren();
        node34.addChildrenToFront(node43);
        int int46 = node43.getLineno();
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str49 = node48.toString();
        boolean boolean50 = node48.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newString("");
        node52.removeProp(23);
        node48.addChildToFront(node52);
        com.google.javascript.rhino.head.Node node56 = node48.getFirstChild();
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node((int) (short) 0, node43, node48, 9);
        boolean boolean59 = node43.hasSideEffects();
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node63 = node62.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator64 = node63.new NodeIterator();
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str67 = node66.toString();
        boolean boolean68 = node66.hasConsistentReturnUsage();
        boolean boolean69 = node66.hasSideEffects();
        com.google.javascript.rhino.head.Node node71 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str72 = node71.toString();
        boolean boolean73 = node71.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node75 = com.google.javascript.rhino.head.Node.newString("");
        node75.removeProp(23);
        node71.addChildToFront(node75);
        com.google.javascript.rhino.head.Node node79 = node71.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment80 = node71.getJsDocNode();
        node66.addChildToBack(node71);
        java.lang.String str82 = node66.toString();
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node(0, node43, node63, node66, 1);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator85 = node66.new NodeIterator();
        node26.putProp(19, (java.lang.Object) node66);
        node26.removeChildren();
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node(100, node17, node26);
        com.google.javascript.rhino.head.Node node90 = new com.google.javascript.rhino.head.Node(24, node88, (int) (byte) 10);
        int int93 = node90.getIntProp((int) (byte) -1, 1);
        com.google.javascript.rhino.head.ast.Comment comment94 = null;
        node90.setJsDocNode(comment94);
        node90.removeChildren();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "40" + "'", str6, "40");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 26 + "'", int29 == 26);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "40" + "'", str35, "40");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "40" + "'", str49, "40");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "40" + "'", str67, "40");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "40" + "'", str72, "40");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNull(comment80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "40" + "'", str82, "40");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(0, "32");
        java.lang.String str3 = node2.getJsDoc();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("");
        node2.removeProp(23);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = node2.iterator();
        java.lang.Object obj7 = node2.getProp((int) (byte) 1);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(21, node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(nodeItor5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
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
        boolean boolean22 = node2.hasSideEffects();
        com.google.javascript.rhino.head.Node node23 = node2.getFirstChild();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node((int) (byte) 1);
        boolean boolean26 = node25.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) '#', node2, node25, 35);
        com.google.javascript.rhino.head.ast.Comment comment29 = node2.getJsDocNode();
        double double30 = node2.getDouble();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "40" + "'", str15, "40");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(comment29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 32.0d + "'", double30 == 32.0d);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node3 = node2.getLastSibling();
        com.google.javascript.rhino.head.Node node4 = node2.getLastSibling();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString("");
        node13.removeProp(23);
        node9.addChildToFront(node13);
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean19 = node18.hasChildren();
        node9.addChildrenToFront(node18);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasConsistentReturnUsage();
        boolean boolean25 = node22.hasSideEffects();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str28 = node27.toString();
        boolean boolean29 = node27.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("");
        node31.removeProp(23);
        node27.addChildToFront(node31);
        com.google.javascript.rhino.head.Node node35 = node27.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment36 = node27.getJsDocNode();
        node22.addChildToBack(node27);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(15, node9, node22);
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newString(23, "");
        java.lang.String str42 = node41.toString();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(0, node45, node48);
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node(24, node9, node41, node49);
        com.google.javascript.rhino.head.Node node51 = node50.getLastChild();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) '4', node51);
        node4.addChildrenToBack(node51);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "40" + "'", str10, "40");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "40" + "'", str23, "40");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "40" + "'", str28, "40");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(comment36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "23" + "'", str42, "23");
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        node4.addChildToFront(node8);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean14 = node13.hasChildren();
        node4.addChildrenToFront(node13);
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        boolean boolean20 = node17.hasSideEffects();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString("");
        node26.removeProp(23);
        node22.addChildToFront(node26);
        com.google.javascript.rhino.head.Node node30 = node22.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment31 = node22.getJsDocNode();
        node17.addChildToBack(node22);
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node(15, node4, node17);
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString(23, "");
        java.lang.String str37 = node36.toString();
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node(0, node40, node43);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(24, node4, node36, node44);
        node44.setLineno(12);
        node44.removeChildren();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str51 = node50.toString();
        com.google.javascript.rhino.head.Node node52 = node50.getFirstChild();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str56 = node55.toString();
        boolean boolean57 = node55.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newString("");
        node59.removeProp(23);
        node55.addChildToFront(node59);
        com.google.javascript.rhino.head.Node node64 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean65 = node64.hasChildren();
        node55.addChildrenToFront(node64);
        int int67 = node64.getLineno();
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str70 = node69.toString();
        boolean boolean71 = node69.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node73 = com.google.javascript.rhino.head.Node.newString("");
        node73.removeProp(23);
        node69.addChildToFront(node73);
        com.google.javascript.rhino.head.Node node77 = node69.getFirstChild();
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node((int) (short) 0, node64, node69, 9);
        node50.addChildrenToFront(node79);
        com.google.javascript.rhino.head.Node node81 = new com.google.javascript.rhino.head.Node(0, node44, node79);
        node79.putIntProp(2, (int) (byte) 0);
        com.google.javascript.rhino.head.Node node85 = node79.getFirstChild();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "40" + "'", str23, "40");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(comment31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "23" + "'", str37, "23");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-1" + "'", str51, "-1");
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "40" + "'", str56, "40");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "40" + "'", str70, "40");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node85);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        com.google.javascript.rhino.head.ast.Comment comment3 = null;
        node1.setJsDocNode(comment3);
        node1.setLineno((int) (short) 1);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = node1.new NodeIterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = node1.new NodeIterator();
        boolean boolean9 = nodeIterator8.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node10 = nodeIterator8.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) '#', 5);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node2 = node1.getLastSibling();
        boolean boolean3 = node2.hasSideEffects();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean7 = node6.hasChildren();
        com.google.javascript.rhino.head.Node node8 = node6.getLastSibling();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node13 = node12.getLastSibling();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(13, node17);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(12);
        node21.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(6, node21);
        com.google.javascript.rhino.head.Node node26 = node25.getLastChild();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node17, node25, 0);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node31.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(20, node13, node17, node31);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str39 = node38.toString();
        boolean boolean40 = node38.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newString("");
        node42.removeProp(23);
        node38.addChildToFront(node42);
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) 'a', node38);
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str51 = node50.toString();
        boolean boolean52 = node50.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newString("");
        node54.removeProp(23);
        node50.addChildToFront(node54);
        com.google.javascript.rhino.head.Node node58 = node50.getFirstChild();
        node58.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope61 = node58.getScope();
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) ' ', node58, 2);
        com.google.javascript.rhino.head.Node node64 = node58.getLastSibling();
        com.google.javascript.rhino.head.Node node67 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node68 = node67.getLastSibling();
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node((int) ' ', node64, node67);
        node38.addChildrenToFront(node69);
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(24, node8, node35, node69, (int) (short) -1);
        node2.addChildToFront(node35);
        boolean boolean74 = node35.hasChildren();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor75 = node35.iterator();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "40" + "'", str39, "40");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "40" + "'", str51, "40");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(scope61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(nodeItor75);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(1, (-1));
        int int5 = node2.getIntProp(16, 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
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
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.hasConsistentReturnUsage();
        boolean boolean24 = node21.hasSideEffects();
        node19.addChildrenToFront(node21);
        node21.removeChildren();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString("hi!");
        node21.addChildrenToBack(node28);
        node17.addChildToFront(node21);
        int int31 = node17.getType();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("");
        node39.removeProp(23);
        node35.addChildToFront(node39);
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean45 = node44.hasChildren();
        node35.addChildrenToFront(node44);
        int int47 = node44.getLineno();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str50 = node49.toString();
        boolean boolean51 = node49.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString("");
        node53.removeProp(23);
        node49.addChildToFront(node53);
        com.google.javascript.rhino.head.Node node57 = node49.getFirstChild();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (short) 0, node44, node49, 9);
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newString("1");
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor62 = node61.iterator();
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node(21, node59, node61, (int) '4');
        node17.addChildrenToFront(node64);
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node64, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = node64.getExistingIntProp(10);
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
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 41 + "'", int31 == 41);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "40" + "'", str36, "40");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "40" + "'", str50, "40");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeItor62);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        boolean boolean7 = node4.hasSideEffects();
        node2.addChildrenToFront(node4);
        double double9 = node4.getDouble();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        boolean boolean16 = node13.hasSideEffects();
        node11.addChildrenToFront(node13);
        node13.removeChildren();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("hi!");
        node13.addChildrenToBack(node20);
        com.google.javascript.rhino.head.Node node23 = node13.setType((int) (short) -1);
        com.google.javascript.rhino.head.Node node25 = node23.setType(23);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(16, node4, node25, 18);
        java.lang.String str28 = node25.toString();
        java.lang.Class<?> wildcardClass29 = node25.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "40" + "'", str14, "40");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "23" + "'", str28, "23");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
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
        com.google.javascript.rhino.head.Node node36 = node33.getLastChild();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(4);
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node44 = node43.getLastSibling();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str49 = node48.toString();
        boolean boolean50 = node48.hasConsistentReturnUsage();
        boolean boolean51 = node48.hasSideEffects();
        node46.addChildrenToFront(node48);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(26, node43, node46, 20);
        boolean boolean55 = node54.hasSideEffects();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(97);
        int int58 = node57.getType();
        com.google.javascript.rhino.head.Node node60 = node57.setType(97);
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node(22, node54, node60, 25);
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 1, node33, node38, node62);
        java.lang.String str64 = node38.toString();
        com.google.javascript.rhino.head.Node node65 = node38.getNext();
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
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "40" + "'", str49, "40");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 97 + "'", int58 == 97);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "4" + "'", str64, "4");
        org.junit.Assert.assertNotNull(node65);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
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
        boolean boolean32 = nodeIterator31.hasNext();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(nodeItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        node1.addChildrenToFront(node3);
        node3.removeChildren();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("hi!");
        node3.addChildrenToBack(node10);
        boolean boolean12 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node node13 = node3.getFirstChild();
        boolean boolean14 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator15 = node3.new NodeIterator();
        com.google.javascript.rhino.head.Node node16 = nodeIterator15.next();
        boolean boolean17 = nodeIterator15.hasNext();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
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
        com.google.javascript.rhino.head.ast.Comment comment55 = null;
        node12.setJsDocNode(comment55);
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node59 = node58.getLastSibling();
        com.google.javascript.rhino.head.ast.Comment comment60 = null;
        node59.setJsDocNode(comment60);
        node12.addChildToFront(node59);
        double double63 = node59.getDouble();
        // The following exception was thrown during execution in test generation
        try {
            node59.setString("5");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.NumberLiteral cannot be cast to com.google.javascript.rhino.head.ast.Name");
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
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 32.0d + "'", double63 == 32.0d);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("23");
        java.lang.Object obj3 = node1.getProp(17);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = node1.getExistingIntProp(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        boolean boolean13 = node10.hasSideEffects();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(0, node10);
        node5.addChildrenToBack(node14);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(9, node5);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(13, node20);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(7, node20);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) 'a', node2, node16, node20, (int) (short) 1);
        boolean boolean25 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node27 = node2.setType(3);
        node2.removeChildren();
        java.lang.Class<?> wildcardClass29 = node2.getClass();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        node5.addChildToFront(node9);
        com.google.javascript.rhino.head.Node node13 = node5.getFirstChild();
        node13.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope16 = node13.getScope();
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node((int) ' ', node13, 2);
        com.google.javascript.rhino.head.Node node19 = node13.getLastSibling();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node23 = node22.getLastSibling();
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) ' ', node19, node22);
        java.lang.String str25 = node19.getString();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str28 = node27.toString();
        boolean boolean29 = node27.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("");
        node31.removeProp(23);
        node27.addChildToFront(node31);
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean37 = node36.hasChildren();
        node27.addChildrenToFront(node36);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator39 = node36.new NodeIterator();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str42 = node41.toString();
        com.google.javascript.rhino.head.Node node43 = node41.getLastSibling();
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str47 = node46.toString();
        boolean boolean48 = node46.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newString("");
        node50.removeProp(23);
        node46.addChildToFront(node50);
        com.google.javascript.rhino.head.Node node54 = node46.getFirstChild();
        node54.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope57 = node54.getScope();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) ' ', node54, 2);
        com.google.javascript.rhino.head.Node node60 = node54.getLastSibling();
        node43.addChildToFront(node60);
        node36.addChildrenToFront(node43);
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str65 = node64.toString();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (short) 10, node19, node36, node64, 24);
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node(0, node19, 17);
        com.google.javascript.rhino.head.Node node71 = node69.setType(22);
        com.google.javascript.rhino.head.Node node72 = node69.getLastChild();
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node76 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str77 = node76.toString();
        boolean boolean78 = node76.hasConsistentReturnUsage();
        boolean boolean79 = node76.hasSideEffects();
        node74.addChildrenToFront(node76);
        node76.removeChildren();
        com.google.javascript.rhino.head.Node node83 = com.google.javascript.rhino.head.Node.newString("hi!");
        node76.addChildrenToBack(node83);
        boolean boolean85 = node76.hasSideEffects();
        com.google.javascript.rhino.head.Node node86 = node76.getFirstChild();
        int int87 = node86.getLineno();
        node69.addChildToBack(node86);
        java.lang.Class<?> wildcardClass89 = node69.getClass();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "40" + "'", str6, "40");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "100" + "'", str25, "100");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "40" + "'", str28, "40");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "40" + "'", str42, "40");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "40" + "'", str47, "40");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(scope57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "100" + "'", str65, "100");
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "40" + "'", str77, "40");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("");
        node6.removeProp(23);
        node2.addChildToFront(node6);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node((int) 'a', node2);
        com.google.javascript.rhino.head.ast.Comment comment11 = node2.getJsDocNode();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str15 = node14.toString();
        com.google.javascript.rhino.head.ast.Comment comment16 = node14.getJsDocNode();
        com.google.javascript.rhino.head.ast.Comment comment17 = node14.getJsDocNode();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str20 = node19.toString();
        boolean boolean21 = node19.hasConsistentReturnUsage();
        node14.addChildToBack(node19);
        java.lang.String str23 = node19.getJsDoc();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(13, node27);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(7, node27);
        node29.removeChildren();
        node19.addChildrenToFront(node29);
        node2.putProp(20, (java.lang.Object) node19);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(comment11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertNull(comment16);
        org.junit.Assert.assertNull(comment17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "40" + "'", str20, "40");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString("");
        node3.removeProp(23);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        boolean boolean13 = node10.hasSideEffects();
        node8.addChildrenToFront(node10);
        com.google.javascript.rhino.head.Node node15 = node10.getLastSibling();
        int int16 = node10.getLineno();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str19 = node18.toString();
        boolean boolean20 = node18.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newString("");
        node22.removeProp(23);
        node18.addChildToFront(node22);
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean28 = node27.hasChildren();
        node18.addChildrenToFront(node27);
        int int30 = node27.getLineno();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (byte) 1);
        node32.removeProp((int) (short) 10);
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (short) 10, node10, node27, node32, 0);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str41 = node40.toString();
        boolean boolean42 = node40.hasConsistentReturnUsage();
        boolean boolean43 = node40.hasSideEffects();
        node38.addChildrenToFront(node40);
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str47 = node46.toString();
        boolean boolean48 = node46.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newString("");
        node50.removeProp(23);
        node46.addChildToFront(node50);
        com.google.javascript.rhino.head.Node node54 = node46.getFirstChild();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node54.addChildrenToBack(node56);
        node40.addChildrenToBack(node56);
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node3, node27, node56);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(13, node56, 22);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator62 = node61.new NodeIterator();
        com.google.javascript.rhino.head.Node node63 = nodeIterator62.next();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "40" + "'", str19, "40");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "40" + "'", str41, "40");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "40" + "'", str47, "40");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node63);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString((-1), "97");
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str6 = node5.toString();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString("");
        node13.removeProp(23);
        node9.addChildToFront(node13);
        com.google.javascript.rhino.head.Node node17 = node9.getFirstChild();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node17.addChildrenToBack(node19);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newString("");
        int int25 = node22.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (short) 10, node17, node22);
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node31 = node30.getLastSibling();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        boolean boolean38 = node35.hasSideEffects();
        node33.addChildrenToFront(node35);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(26, node30, node33, 20);
        boolean boolean42 = node41.hasSideEffects();
        java.lang.String str43 = node41.getJsDoc();
        node22.addChildToFront(node41);
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) (short) 1, node3, node5, node22, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = node3.getExistingIntProp(25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "40" + "'", str10, "40");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "40" + "'", str36, "40");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) 41);
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node(12);
        node4.putIntProp(14, 3);
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
        node4.addChildToBack(node27);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str34 = node33.toString();
        boolean boolean35 = node33.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newString("");
        node37.removeProp(23);
        node33.addChildToFront(node37);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean43 = node42.hasChildren();
        node33.addChildrenToFront(node42);
        int int45 = node42.getLineno();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str48 = node47.toString();
        boolean boolean49 = node47.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newString("");
        node51.removeProp(23);
        node47.addChildToFront(node51);
        com.google.javascript.rhino.head.Node node55 = node47.getFirstChild();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node((int) (short) 0, node42, node47, 9);
        boolean boolean58 = node42.hasSideEffects();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str63 = node62.toString();
        boolean boolean64 = node62.hasConsistentReturnUsage();
        boolean boolean65 = node62.hasSideEffects();
        node60.addChildrenToFront(node62);
        node62.removeChildren();
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newString("hi!");
        node62.addChildrenToBack(node69);
        com.google.javascript.rhino.head.Node node72 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str73 = node72.toString();
        boolean boolean74 = node72.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node76 = com.google.javascript.rhino.head.Node.newString("");
        node76.removeProp(23);
        node72.addChildToFront(node76);
        com.google.javascript.rhino.head.Node node80 = node72.getFirstChild();
        com.google.javascript.rhino.head.Node node82 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node80.addChildrenToBack(node82);
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node42, node62, node82);
        com.google.javascript.rhino.head.Node node87 = com.google.javascript.rhino.head.Node.newString(19, "");
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node(0, node42, node87);
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node(0, node2, node27, node88);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.Scope scope90 = node27.getScope();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "40" + "'", str34, "40");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "40" + "'", str48, "40");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "40" + "'", str63, "40");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "40" + "'", str73, "40");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node87);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        boolean boolean2 = node1.hasSideEffects();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor3 = node1.iterator();
        java.lang.String str4 = node1.getJsDoc();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(nodeItor3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber(1.0d);
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        boolean boolean9 = node6.hasSideEffects();
        node4.addChildrenToFront(node6);
        node6.removeChildren();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString("hi!");
        node6.addChildrenToBack(node13);
        boolean boolean15 = node6.hasSideEffects();
        java.lang.String str16 = node6.getJsDoc();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str21 = node20.toString();
        boolean boolean22 = node20.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString("");
        node24.removeProp(23);
        node20.addChildToFront(node24);
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean30 = node29.hasChildren();
        node20.addChildrenToFront(node29);
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str34 = node33.toString();
        boolean boolean35 = node33.hasChildren();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (short) -1, node29, node33, (int) (short) 10);
        com.google.javascript.rhino.head.Node node38 = node37.getLastChild();
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str44 = node43.toString();
        boolean boolean45 = node43.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString("");
        node47.removeProp(23);
        node43.addChildToFront(node47);
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node((int) 'a', node43);
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str56 = node55.toString();
        com.google.javascript.rhino.head.Node node57 = node55.getLastChild();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (short) -1, node43, node53, node55, (int) (short) -1);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (short) 1, node55, 12);
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node(23);
        node63.removeProp(25);
        boolean boolean66 = node63.hasChildren();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((-1), node38, node55, node63);
        com.google.javascript.rhino.head.ast.Comment comment68 = null;
        node63.setJsDocNode(comment68);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(0, node6, node63);
        com.google.javascript.rhino.head.ast.Comment comment71 = null;
        node6.setJsDocNode(comment71);
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newNumber((double) (-1L));
        boolean boolean75 = node74.hasSideEffects();
        node1.replaceChildAfter(node6, node74);
        int int77 = node1.getType();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "40" + "'", str7, "40");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "40" + "'", str21, "40");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-1" + "'", str34, "-1");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "40" + "'", str44, "40");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "40" + "'", str56, "40");
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 40 + "'", int77 == 40);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (byte) 10, "1");
        java.lang.String str3 = node2.toString();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(100, "52");
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node8 = node7.getLastSibling();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(13, node12);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(12);
        node16.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node(6, node16);
        com.google.javascript.rhino.head.Node node21 = node20.getLastChild();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node12, node20, 0);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node26.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(20, node8, node12, node26);
        java.lang.String str31 = node26.getJsDoc();
        com.google.javascript.rhino.head.Node node33 = node26.setType(24);
        java.lang.String str34 = node26.getJsDoc();
        node2.putProp(13, (java.lang.Object) node26);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        boolean boolean5 = node2.hasSideEffects();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("");
        node11.removeProp(23);
        node7.addChildToFront(node11);
        com.google.javascript.rhino.head.Node node15 = node7.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment16 = node7.getJsDocNode();
        node2.addChildToBack(node7);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor18 = node2.iterator();
        com.google.javascript.rhino.head.ast.Comment comment19 = node2.getJsDocNode();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator20 = node2.new NodeIterator();
        double double21 = node2.getDouble();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str28 = node27.toString();
        boolean boolean29 = node27.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("");
        node31.removeProp(23);
        node27.addChildToFront(node31);
        com.google.javascript.rhino.head.Node node35 = node27.getFirstChild();
        node35.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope38 = node35.getScope();
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) ' ', node35, 2);
        com.google.javascript.rhino.head.Node node41 = node35.getLastSibling();
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node45 = node44.getLastSibling();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) ' ', node41, node44);
        java.lang.String str47 = node41.getString();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str50 = node49.toString();
        boolean boolean51 = node49.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString("");
        node53.removeProp(23);
        node49.addChildToFront(node53);
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean59 = node58.hasChildren();
        node49.addChildrenToFront(node58);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator61 = node58.new NodeIterator();
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str64 = node63.toString();
        com.google.javascript.rhino.head.Node node65 = node63.getLastSibling();
        com.google.javascript.rhino.head.Node node68 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str69 = node68.toString();
        boolean boolean70 = node68.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node72 = com.google.javascript.rhino.head.Node.newString("");
        node72.removeProp(23);
        node68.addChildToFront(node72);
        com.google.javascript.rhino.head.Node node76 = node68.getFirstChild();
        node76.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope79 = node76.getScope();
        com.google.javascript.rhino.head.Node node81 = new com.google.javascript.rhino.head.Node((int) ' ', node76, 2);
        com.google.javascript.rhino.head.Node node82 = node76.getLastSibling();
        node65.addChildToFront(node82);
        node58.addChildrenToFront(node65);
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str87 = node86.toString();
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node((int) (short) 10, node41, node58, node86, 24);
        com.google.javascript.rhino.head.Node node91 = new com.google.javascript.rhino.head.Node(0, node41, 17);
        com.google.javascript.rhino.head.Node node93 = new com.google.javascript.rhino.head.Node(21, node2, node41, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str94 = node2.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.ast.NumberLiteral cannot be cast to com.google.javascript.rhino.head.ast.Name");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "40" + "'", str8, "40");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(comment16);
        org.junit.Assert.assertNotNull(nodeItor18);
        org.junit.Assert.assertNull(comment19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 32.0d + "'", double21 == 32.0d);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "40" + "'", str28, "40");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(scope38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "100" + "'", str47, "100");
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "40" + "'", str50, "40");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "40" + "'", str64, "40");
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "40" + "'", str69, "40");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNull(scope79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "100" + "'", str87, "100");
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(7);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("");
        node12.removeProp(23);
        node8.addChildToFront(node12);
        com.google.javascript.rhino.head.Node node16 = node8.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment17 = node8.getJsDocNode();
        node3.addChildToBack(node8);
        java.lang.String str19 = node3.toString();
        com.google.javascript.rhino.head.Node node21 = node3.setType(25);
        com.google.javascript.rhino.head.Node node22 = node3.getFirstChild();
        node1.addChildrenToBack(node3);
        int int24 = node3.getLineno();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40" + "'", str9, "40");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(comment17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "40" + "'", str19, "40");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("");
        node2.removeProp(23);
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        boolean boolean10 = node7.hasSideEffects();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(0, node7);
        node2.addChildrenToBack(node11);
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(9, node2);
        node13.removeProp(24);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str20 = node19.toString();
        boolean boolean21 = node19.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString("");
        node23.removeProp(23);
        node19.addChildToFront(node23);
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean29 = node28.hasChildren();
        node19.addChildrenToFront(node28);
        int int31 = node28.getLineno();
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str34 = node33.toString();
        boolean boolean35 = node33.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newString("");
        node37.removeProp(23);
        node33.addChildToFront(node37);
        com.google.javascript.rhino.head.Node node41 = node33.getFirstChild();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) (short) 0, node28, node33, 9);
        boolean boolean44 = node28.hasSideEffects();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node48 = node47.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator49 = node48.new NodeIterator();
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
        java.lang.String str67 = node51.toString();
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node(0, node28, node48, node51, 1);
        node13.addChildToBack(node28);
        // The following exception was thrown during execution in test generation
        try {
            node13.labelId(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "40" + "'", str8, "40");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "40" + "'", str20, "40");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "40" + "'", str34, "40");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
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
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "40" + "'", str67, "40");
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
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
        com.google.javascript.rhino.head.ast.Comment comment35 = null;
        node32.setJsDocNode(comment35);
        node32.setLineno((int) 'a');
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node(13, node42);
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node(7, node42);
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node44.addChildToFront(node46);
        com.google.javascript.rhino.head.ast.Comment comment48 = null;
        node44.setJsDocNode(comment48);
        java.lang.String str50 = node44.getJsDoc();
        node32.addChildToFront(node44);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator52 = node32.spliterator();
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
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(nodeSpliterator52);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(32, 26);
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str13 = node12.toString();
        com.google.javascript.rhino.head.Node node14 = node12.getFirstChild();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        node21.removeProp(23);
        node17.addChildToFront(node21);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean27 = node26.hasChildren();
        node17.addChildrenToFront(node26);
        int int29 = node26.getLineno();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str32 = node31.toString();
        boolean boolean33 = node31.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newString("");
        node35.removeProp(23);
        node31.addChildToFront(node35);
        com.google.javascript.rhino.head.Node node39 = node31.getFirstChild();
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (short) 0, node26, node31, 9);
        node12.addChildrenToFront(node41);
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node(100, node7, node10, node12, (int) ' ');
        boolean boolean45 = node12.hasSideEffects();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((-1), node12);
        node2.putProp(6, (java.lang.Object) node46);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "40" + "'", str32, "40");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (byte) -1, "12");
        boolean boolean3 = node2.hasConsistentReturnUsage();
        // The following exception was thrown during execution in test generation
        try {
            node2.resetTargets();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(23);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        node5.addChildToFront(node9);
        node2.putProp((int) ' ', (java.lang.Object) node9);
        com.google.javascript.rhino.head.ast.Comment comment14 = node2.getJsDocNode();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node2);
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        boolean boolean20 = node17.hasSideEffects();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString("");
        node26.removeProp(23);
        node22.addChildToFront(node26);
        com.google.javascript.rhino.head.Node node30 = node22.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment31 = node22.getJsDocNode();
        node17.addChildToBack(node22);
        boolean boolean33 = node22.hasSideEffects();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("");
        node39.removeProp(23);
        node35.addChildToFront(node39);
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean45 = node44.hasChildren();
        node35.addChildrenToFront(node44);
        node22.addChildToBack(node44);
        node2.addChildrenToBack(node44);
        int int49 = node2.getLineno();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str56 = node55.toString();
        boolean boolean57 = node55.hasConsistentReturnUsage();
        boolean boolean58 = node55.hasSideEffects();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node(0, node55);
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str63 = node62.toString();
        boolean boolean64 = node62.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newString("");
        node66.removeProp(23);
        node62.addChildToFront(node66);
        com.google.javascript.rhino.head.Node node71 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean72 = node71.hasChildren();
        node62.addChildrenToFront(node71);
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str76 = node75.toString();
        boolean boolean77 = node75.hasChildren();
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node((int) (short) -1, node71, node75, (int) (short) 10);
        com.google.javascript.rhino.head.Node node82 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node55, node75, node82, (int) (short) 0);
        com.google.javascript.rhino.head.ast.Comment comment85 = null;
        node84.setJsDocNode(comment85);
        com.google.javascript.rhino.head.Node node87 = node84.getLastChild();
        boolean boolean88 = node84.hasChildren();
        com.google.javascript.rhino.head.Node node90 = new com.google.javascript.rhino.head.Node(26, node84, 3);
        boolean boolean91 = node84.hasSideEffects();
        node2.putProp((int) (byte) 100, (java.lang.Object) node84);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "40" + "'", str6, "40");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "40" + "'", str23, "40");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(comment31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "40" + "'", str36, "40");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "40" + "'", str56, "40");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "40" + "'", str63, "40");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "-1" + "'", str76, "-1");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        com.google.javascript.rhino.head.Node node0 = com.google.javascript.rhino.head.Node.newTarget();
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
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str25 = node24.toString();
        boolean boolean26 = node24.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString("");
        node28.removeProp(23);
        node24.addChildToFront(node28);
        com.google.javascript.rhino.head.Node node32 = node24.getFirstChild();
        node32.setString("100");
        com.google.javascript.rhino.head.Node node35 = node32.getLastSibling();
        node21.putProp(10, (java.lang.Object) node35);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("");
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newString("");
        node44.removeProp(23);
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str50 = node49.toString();
        boolean boolean51 = node49.hasConsistentReturnUsage();
        boolean boolean52 = node49.hasSideEffects();
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(0, node49);
        node44.addChildrenToBack(node53);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(9, node44);
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node(13, node59);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(7, node59);
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) 'a', node41, node55, node59, (int) (short) 1);
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node(7);
        node59.addChildrenToBack(node65);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node((int) (byte) -1, node21, node38, node59, 97);
        node0.addChildToFront(node59);
        com.google.javascript.rhino.head.ast.Comment comment70 = null;
        node59.setJsDocNode(comment70);
        com.google.javascript.rhino.head.Node node73 = node59.setType(22);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator74 = node73.spliterator();
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "40" + "'", str6, "40");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "40" + "'", str25, "40");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "40" + "'", str50, "40");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(nodeSpliterator74);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 1.0f);
        java.lang.Object obj3 = node1.getProp((int) 'a');
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor4 = node1.iterator();
        int int7 = node1.getIntProp((int) (byte) -1, 17);
        java.lang.String str8 = node1.toString();
        int int9 = node1.getType();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(nodeItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 17 + "'", int7 == 17);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "40" + "'", str8, "40");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        com.google.javascript.rhino.head.Node node3 = node1.getLastSibling();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("");
        node10.removeProp(23);
        node6.addChildToFront(node10);
        com.google.javascript.rhino.head.Node node14 = node6.getFirstChild();
        node14.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope17 = node14.getScope();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) ' ', node14, 2);
        com.google.javascript.rhino.head.Node node20 = node14.getLastSibling();
        node3.addChildToFront(node20);
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str25 = node24.toString();
        boolean boolean26 = node24.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString("");
        node28.removeProp(23);
        node24.addChildToFront(node28);
        com.google.javascript.rhino.head.Node node32 = node24.getFirstChild();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node32.addChildrenToBack(node34);
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newString("");
        int int40 = node37.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (short) 10, node32, node37);
        boolean boolean42 = node37.hasSideEffects();
        node20.addChildrenToFront(node37);
        com.google.javascript.rhino.head.Node node44 = node20.getLastChild();
        java.lang.Object obj46 = node20.getProp(32);
        int int49 = node20.getIntProp(52, 40);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "40" + "'", str7, "40");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "40" + "'", str25, "40");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 40 + "'", int49 == 40);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
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
        com.google.javascript.rhino.head.Node node51 = node50.getLastSibling();
        com.google.javascript.rhino.head.Node node52 = node50.getLastChild();
        node50.removeProp(14);
        com.google.javascript.rhino.head.ast.Comment comment55 = null;
        node50.setJsDocNode(comment55);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = null;
        java.lang.String str58 = node50.toStringTree(scriptNode57);
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
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
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
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString("");
        node36.removeProp(23);
        node32.addChildToFront(node36);
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) 'a', node32);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str45 = node44.toString();
        com.google.javascript.rhino.head.Node node46 = node44.getLastChild();
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node((int) (short) -1, node32, node42, node44, (int) (short) -1);
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str51 = node50.toString();
        boolean boolean52 = node50.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newString("");
        node54.removeProp(23);
        node50.addChildToFront(node54);
        com.google.javascript.rhino.head.Node node58 = node50.getFirstChild();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node58.addChildrenToBack(node60);
        com.google.javascript.rhino.head.Node node62 = node60.getLastChild();
        java.lang.String str63 = node60.getJsDoc();
        java.lang.Object obj65 = node60.getProp(0);
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(3, node13, node32, node60);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor67 = node32.iterator();
        double double68 = node32.getDouble();
        com.google.javascript.rhino.head.Node node69 = node32.getFirstChild();
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(25, 19);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node(3, node32, node72);
        com.google.javascript.rhino.head.Node node75 = com.google.javascript.rhino.head.Node.newString("");
        node75.removeProp(23);
        com.google.javascript.rhino.head.Node node80 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str81 = node80.toString();
        boolean boolean82 = node80.hasConsistentReturnUsage();
        boolean boolean83 = node80.hasSideEffects();
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node(0, node80);
        node75.addChildrenToBack(node84);
        int int86 = node75.getLineno();
        node75.putIntProp(15, 0);
        node73.addChildToFront(node75);
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
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "40" + "'", str33, "40");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "40" + "'", str45, "40");
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "40" + "'", str51, "40");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(nodeItor67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 32.0d + "'", double68 == 32.0d);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "40" + "'", str81, "40");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((-1), 21);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) '#', "22");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
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
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        int int22 = node21.getLineno();
        node19.addChildToBack(node21);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(97, (int) (byte) 100);
        node26.putIntProp(10, 13);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str34 = node33.toString();
        boolean boolean35 = node33.hasConsistentReturnUsage();
        boolean boolean36 = node33.hasSideEffects();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(0, node33);
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str41 = node40.toString();
        boolean boolean42 = node40.hasConsistentReturnUsage();
        boolean boolean43 = node40.hasSideEffects();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str46 = node45.toString();
        boolean boolean47 = node45.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString("");
        node49.removeProp(23);
        node45.addChildToFront(node49);
        com.google.javascript.rhino.head.Node node53 = node45.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment54 = node45.getJsDocNode();
        node40.addChildToBack(node45);
        boolean boolean56 = node45.hasConsistentReturnUsage();
        node33.putProp((int) (short) 1, (java.lang.Object) node45);
        com.google.javascript.rhino.head.Node node60 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str61 = node60.toString();
        boolean boolean62 = node60.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node64 = com.google.javascript.rhino.head.Node.newString("");
        node64.removeProp(23);
        node60.addChildToFront(node64);
        com.google.javascript.rhino.head.Node node68 = node60.getFirstChild();
        node68.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope71 = node68.getScope();
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node((int) ' ', node68, 2);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator74 = node68.spliterator();
        node68.putIntProp(100, (int) (byte) 0);
        com.google.javascript.rhino.head.Node node79 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str80 = node79.toString();
        boolean boolean81 = node79.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node83 = com.google.javascript.rhino.head.Node.newString("");
        node83.removeProp(23);
        node79.addChildToFront(node83);
        com.google.javascript.rhino.head.Node node87 = node79.getFirstChild();
        node87.setString("100");
        com.google.javascript.rhino.head.Node node91 = new com.google.javascript.rhino.head.Node(5, node33, node68, node87, 17);
        node26.addChildrenToBack(node33);
        node21.addChildrenToBack(node33);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "40" + "'", str16, "40");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "40" + "'", str34, "40");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "40" + "'", str41, "40");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "40" + "'", str46, "40");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(comment54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "40" + "'", str61, "40");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNull(scope71);
        org.junit.Assert.assertNotNull(nodeSpliterator74);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "40" + "'", str80, "40");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node87);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
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
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node31 = node30.getLastSibling();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        boolean boolean38 = node35.hasSideEffects();
        node33.addChildrenToFront(node35);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(26, node30, node33, 20);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str46 = node45.toString();
        boolean boolean47 = node45.hasConsistentReturnUsage();
        boolean boolean48 = node45.hasSideEffects();
        node43.addChildrenToFront(node45);
        node45.removeChildren();
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newString("hi!");
        node45.addChildrenToBack(node52);
        boolean boolean54 = node45.hasSideEffects();
        com.google.javascript.rhino.head.Node node55 = node45.getFirstChild();
        node11.replaceChildAfter(node30, node45);
        com.google.javascript.rhino.head.ast.Scope scope57 = null;
        // The following exception was thrown during execution in test generation
        try {
            node45.setScope(scope57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "40" + "'", str36, "40");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "40" + "'", str46, "40");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(23);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        node5.addChildToFront(node9);
        node2.putProp((int) ' ', (java.lang.Object) node9);
        com.google.javascript.rhino.head.ast.Comment comment14 = node2.getJsDocNode();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node2);
        java.lang.Object obj17 = node2.getProp(15);
        java.lang.String str18 = node2.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = node2.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "40" + "'", str6, "40");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "23" + "'", str18, "23");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(24, 5);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) 10.0f);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator3 = node2.new NodeIterator();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("");
        node10.removeProp(23);
        node6.addChildToFront(node10);
        com.google.javascript.rhino.head.Node node14 = node6.getFirstChild();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node14.addChildrenToBack(node16);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString("");
        int int22 = node19.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (short) 10, node14, node19);
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node28 = node27.getLastSibling();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasConsistentReturnUsage();
        boolean boolean35 = node32.hasSideEffects();
        node30.addChildrenToFront(node32);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(26, node27, node30, 20);
        boolean boolean39 = node38.hasSideEffects();
        java.lang.String str40 = node38.getJsDoc();
        node19.addChildToFront(node38);
        node2.addChildToFront(node19);
        boolean boolean43 = node2.hasChildren();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor44 = node2.iterator();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString((int) (short) -1, "4");
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) 7);
        node50.putIntProp(0, 18);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(0, node50);
        boolean boolean55 = node50.hasChildren();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node(3, node2, node47, node50);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode57 = null;
        java.lang.String str58 = node56.toStringTree(scriptNode57);
        boolean boolean59 = node56.hasSideEffects();
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newString("23");
        java.lang.Object obj64 = node62.getProp(17);
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node(3, node62);
        node56.addChildrenToBack(node65);
        node56.setLineno(13);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "40" + "'", str7, "40");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "40" + "'", str33, "40");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(nodeItor44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
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
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator54 = node35.new NodeIterator();
        boolean boolean55 = nodeIterator54.hasNext();
        com.google.javascript.rhino.head.Node node56 = nodeIterator54.next();
        java.lang.String str57 = node56.toString();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "40" + "'", str57, "40");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        boolean boolean7 = node4.hasSideEffects();
        node2.addChildrenToFront(node4);
        com.google.javascript.rhino.head.Node node9 = node4.getLastSibling();
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node((int) ' ', node4);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator11 = node4.spliterator();
        node4.removeChildren();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeSpliterator11);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
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
        int int21 = node2.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(comment7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "40" + "'", str12, "40");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(13, node6);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(12);
        node10.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(6, node10);
        com.google.javascript.rhino.head.Node node15 = node14.getLastChild();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node6, node14, 0);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(17, node2, node17);
        com.google.javascript.rhino.head.Node node19 = node18.getLastSibling();
        int int20 = node18.getLineno();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString("");
        node26.removeProp(23);
        node22.addChildToFront(node26);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean32 = node31.hasChildren();
        node22.addChildrenToFront(node31);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator34 = node31.new NodeIterator();
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str37 = node36.toString();
        com.google.javascript.rhino.head.Node node38 = node36.getLastSibling();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str42 = node41.toString();
        boolean boolean43 = node41.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString("");
        node45.removeProp(23);
        node41.addChildToFront(node45);
        com.google.javascript.rhino.head.Node node49 = node41.getFirstChild();
        node49.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope52 = node49.getScope();
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node((int) ' ', node49, 2);
        com.google.javascript.rhino.head.Node node55 = node49.getLastSibling();
        node38.addChildToFront(node55);
        node31.addChildrenToFront(node38);
        node18.addChildrenToBack(node38);
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newString("");
        node61.removeProp(23);
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str67 = node66.toString();
        boolean boolean68 = node66.hasConsistentReturnUsage();
        boolean boolean69 = node66.hasSideEffects();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(0, node66);
        node61.addChildrenToBack(node70);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node(24, node61, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            node38.removeChild(node61);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "40" + "'", str23, "40");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "40" + "'", str37, "40");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "40" + "'", str42, "40");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(scope52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "40" + "'", str67, "40");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString("");
        int int4 = node3.getLineno();
        com.google.javascript.rhino.head.Node node6 = node3.setType((-1));
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(23, node6, 22);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        boolean boolean13 = node10.hasSideEffects();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str16 = node15.toString();
        boolean boolean17 = node15.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString("");
        node19.removeProp(23);
        node15.addChildToFront(node19);
        com.google.javascript.rhino.head.Node node23 = node15.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment24 = node15.getJsDocNode();
        node10.addChildToBack(node15);
        boolean boolean26 = node15.hasSideEffects();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str29 = node28.toString();
        boolean boolean30 = node28.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString("");
        node32.removeProp(23);
        node28.addChildToFront(node32);
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean38 = node37.hasChildren();
        node28.addChildrenToFront(node37);
        node15.addChildToBack(node37);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str46 = node45.toString();
        boolean boolean47 = node45.hasConsistentReturnUsage();
        boolean boolean48 = node45.hasSideEffects();
        node43.addChildrenToFront(node45);
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str52 = node51.toString();
        boolean boolean53 = node51.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString("");
        node55.removeProp(23);
        node51.addChildToFront(node55);
        com.google.javascript.rhino.head.Node node59 = node51.getFirstChild();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node59.addChildrenToBack(node61);
        node45.addChildrenToBack(node61);
        com.google.javascript.rhino.head.ast.Comment comment64 = node61.getJsDocNode();
        node37.putProp(9, (java.lang.Object) comment64);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) 'a', node6, (com.google.javascript.rhino.head.Node) comment64, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40" + "'", str11, "40");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "40" + "'", str16, "40");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(comment24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "40" + "'", str29, "40");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "40" + "'", str46, "40");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "40" + "'", str52, "40");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(comment64);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
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
        java.lang.String str17 = node14.getJsDoc();
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
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator35 = node29.spliterator();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str39 = node38.toString();
        com.google.javascript.rhino.head.ast.Comment comment40 = node38.getJsDocNode();
        node29.putProp((int) '#', (java.lang.Object) node38);
        boolean boolean42 = node38.hasSideEffects();
        node14.putProp((int) 'a', (java.lang.Object) boolean42);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator44 = node14.spliterator();
        com.google.javascript.rhino.head.Node node45 = node14.getLastSibling();
        node14.removeChildren();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40" + "'", str9, "40");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertNotNull(nodeSpliterator35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-1" + "'", str39, "-1");
        org.junit.Assert.assertNull(comment40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(nodeSpliterator44);
        org.junit.Assert.assertNotNull(node45);
    }
}

