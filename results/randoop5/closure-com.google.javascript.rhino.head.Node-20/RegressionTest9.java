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
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node(13, node3);
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node(7, node3);
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node5.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node9 = node5.getLastSibling();
        com.google.javascript.rhino.head.Node node10 = node5.getLastChild();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString("");
        node16.removeProp(23);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.hasConsistentReturnUsage();
        boolean boolean24 = node21.hasSideEffects();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(0, node21);
        node16.addChildrenToBack(node25);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(9, node16);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(13, node31);
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node(7, node31);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) 'a', node13, node27, node31, (int) (short) 1);
        boolean boolean36 = node13.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node38 = node13.setType(3);
        node13.removeChildren();
        node13.setDouble((-1.0d));
        node13.removeChildren();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(0, (int) (short) 10);
        node13.addChildrenToFront(node45);
        node45.putIntProp(35, 4);
        node5.addChildToBack(node45);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str78 = node12.getString();
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
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        boolean boolean56 = nodeIterator54.hasNext();
        boolean boolean57 = nodeIterator54.hasNext();
        boolean boolean58 = nodeIterator54.hasNext();
        boolean boolean59 = nodeIterator54.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node9 = node5.getLastChild();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str13 = node12.toString();
        com.google.javascript.rhino.head.Node node14 = node12.getLastSibling();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        node21.removeProp(23);
        node17.addChildToFront(node21);
        com.google.javascript.rhino.head.Node node25 = node17.getFirstChild();
        node25.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope28 = node25.getScope();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) ' ', node25, 2);
        com.google.javascript.rhino.head.Node node31 = node25.getLastSibling();
        node14.addChildToFront(node31);
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node37 = node36.getLastSibling();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(13, node41);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(12);
        node45.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(6, node45);
        com.google.javascript.rhino.head.Node node50 = node49.getLastChild();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node41, node49, 0);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node55.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node(20, node37, node41, node55);
        com.google.javascript.rhino.head.Node node60 = node37.getLastChild();
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node64 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str65 = node64.toString();
        boolean boolean66 = node64.hasConsistentReturnUsage();
        boolean boolean67 = node64.hasSideEffects();
        node62.addChildrenToFront(node64);
        com.google.javascript.rhino.head.Node node69 = node64.getLastSibling();
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node((-1), node31, node37, node69, 3);
        node5.addChildrenToFront(node71);
        com.google.javascript.rhino.head.Node node73 = node5.getLastSibling();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "40" + "'", str13, "40");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "40" + "'", str65, "40");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
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
        com.google.javascript.rhino.head.ast.Scope scope90 = null;
        // The following exception was thrown during execution in test generation
        try {
            node89.setScope(scope90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
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
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Comment comment4 = null;
        node1.setJsDocNode(comment4);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        boolean boolean16 = node13.hasSideEffects();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(0, node13);
        node8.addChildrenToBack(node17);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(9, node8);
        node1.addChildrenToFront(node19);
        boolean boolean21 = node1.hasSideEffects();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(12);
        node26.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(6, node26);
        com.google.javascript.rhino.head.Node node31 = node30.getLastChild();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node35 = node34.getLastSibling();
        com.google.javascript.rhino.head.Node node36 = node34.getLastSibling();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str39 = node38.toString();
        boolean boolean40 = node38.hasConsistentReturnUsage();
        boolean boolean41 = node38.hasSideEffects();
        node38.setLineno((int) '4');
        com.google.javascript.rhino.head.Node node45 = node38.setType((int) '4');
        int int46 = node45.getLineno();
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(24, node31, node34, node45, 8);
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(0, node54, node57);
        int int59 = node54.getLineno();
        boolean boolean60 = node54.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(8, node34, node51, node54);
        com.google.javascript.rhino.head.Node node64 = com.google.javascript.rhino.head.Node.newString(35, "");
        // The following exception was thrown during execution in test generation
        try {
            node1.replaceChildAfter(node61, node64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "40" + "'", str14, "40");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "40" + "'", str39, "40");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node64);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(24, "100");
        int int3 = node2.getType();
        java.lang.String str4 = node2.getString();
        node2.removeChildren();
        com.google.javascript.rhino.head.Node node6 = node2.getNext();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100" + "'", str4, "100");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) 'a', "41");
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        boolean boolean10 = node7.hasSideEffects();
        node5.addChildrenToFront(node7);
        node7.removeChildren();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("hi!");
        node7.addChildrenToBack(node14);
        boolean boolean16 = node7.hasSideEffects();
        com.google.javascript.rhino.head.Node node17 = node7.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment18 = node17.getJsDocNode();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString(52, "12");
        com.google.javascript.rhino.head.Node node23 = node21.setType(20);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node17, node23, 0);
        node2.addChildrenToFront(node23);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "40" + "'", str8, "40");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(comment18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
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
        boolean boolean38 = node11.hasSideEffects();
        boolean boolean39 = node11.hasSideEffects();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("10");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(19, "-1");
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString(6, "52");
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node12 = node11.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator13 = node12.new NodeIterator();
        node12.setLineno(13);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator16 = node12.spliterator();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(97, node12);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(13, node21);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(7, node21);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node23.addChildToFront(node25);
        com.google.javascript.rhino.head.Node node27 = node23.getLastSibling();
        com.google.javascript.rhino.head.Node node28 = node23.getLastChild();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node17, node28);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node3, node6, node17, 100);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor32 = node6.iterator();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeSpliterator16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeItor32);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor2 = node1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            node1.labelId(24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(nodeItor2);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
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
        com.google.javascript.rhino.head.Node node17 = node10.getLastSibling();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator18 = node10.spliterator();
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
        boolean boolean35 = node34.hasChildren();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str39 = node38.toString();
        boolean boolean40 = node38.hasConsistentReturnUsage();
        boolean boolean41 = node38.hasSideEffects();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(0, node38);
        int int43 = node38.getLineno();
        node34.addChildToFront(node38);
        boolean boolean45 = node38.hasSideEffects();
        node10.addChildToFront(node38);
        boolean boolean47 = node38.hasChildren();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40" + "'", str3, "40");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeSpliterator18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "40" + "'", str39, "40");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
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
        com.google.javascript.rhino.head.Node node15 = node13.setType(23);
        double double16 = node15.getDouble();
        com.google.javascript.rhino.head.Node node17 = node15.getLastSibling();
        com.google.javascript.rhino.head.Node node19 = node15.setType(20);
        double double20 = node19.getDouble();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "40" + "'", str4, "40");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str2 = node1.toString();
        com.google.javascript.rhino.head.Node node3 = node1.getNext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = node3.hasSideEffects();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, node2, node5);
        int int7 = node2.getLineno();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator8 = node2.new NodeIterator();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        boolean boolean16 = node13.hasSideEffects();
        node11.addChildrenToFront(node13);
        com.google.javascript.rhino.head.Node node18 = node13.getLastSibling();
        int int19 = node13.getLineno();
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
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (byte) 1);
        node35.removeProp((int) (short) 10);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) (short) 10, node13, node30, node35, 0);
        java.lang.String str40 = node35.getJsDoc();
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str44 = node43.toString();
        boolean boolean45 = node43.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString("");
        node47.removeProp(23);
        node43.addChildToFront(node47);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean53 = node52.hasChildren();
        node43.addChildrenToFront(node52);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator55 = node52.new NodeIterator();
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str58 = node57.toString();
        com.google.javascript.rhino.head.Node node59 = node57.getLastSibling();
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str63 = node62.toString();
        boolean boolean64 = node62.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newString("");
        node66.removeProp(23);
        node62.addChildToFront(node66);
        com.google.javascript.rhino.head.Node node70 = node62.getFirstChild();
        node70.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope73 = node70.getScope();
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node((int) ' ', node70, 2);
        com.google.javascript.rhino.head.Node node76 = node70.getLastSibling();
        node59.addChildToFront(node76);
        node52.addChildrenToFront(node59);
        int int81 = node59.getIntProp(0, (int) ' ');
        int int84 = node59.getIntProp(14, 6);
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node(18, node59, (int) (short) 10);
        node86.removeProp(23);
        node86.removeProp((int) (byte) 1);
        com.google.javascript.rhino.head.Node node92 = node86.setType((int) (byte) -1);
        node35.addChildToBack(node86);
        com.google.javascript.rhino.head.Node node94 = node86.getFirstChild();
        node94.setDouble((double) 1L);
        node2.addChildrenToBack(node94);
        // The following exception was thrown during execution in test generation
        try {
            int int98 = node2.labelId();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "40" + "'", str14, "40");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "40" + "'", str22, "40");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "40" + "'", str44, "40");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "40" + "'", str58, "40");
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "40" + "'", str63, "40");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(scope73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 32 + "'", int81 == 32);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 6 + "'", int84 == 6);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertNotNull(node94);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 1, 13);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
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
        // The following exception was thrown during execution in test generation
        try {
            int int57 = node47.labelId();
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
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) '4', 7);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode3 = null;
        java.lang.String str4 = node2.toStringTree(scriptNode3);
        java.lang.Object obj6 = node2.getProp(18);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        boolean boolean7 = node4.hasSideEffects();
        node2.addChildrenToFront(node4);
        com.google.javascript.rhino.head.Node node9 = node4.getLastSibling();
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node((int) ' ', node4);
        com.google.javascript.rhino.head.Node node11 = null;
        com.google.javascript.rhino.head.Node node12 = node10.getChildBefore(node11);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node2 = node1.getLastSibling();
        com.google.javascript.rhino.head.ast.Comment comment3 = null;
        node2.setJsDocNode(comment3);
        node2.putIntProp(5, (int) (short) 10);
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(21, 3);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) 0);
        com.google.javascript.rhino.head.ast.Comment comment14 = node13.getJsDocNode();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str19 = node18.toString();
        boolean boolean20 = node18.hasConsistentReturnUsage();
        boolean boolean21 = node18.hasSideEffects();
        node16.addChildrenToFront(node18);
        boolean boolean23 = node18.hasSideEffects();
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) ' ', node11, node13, node18);
        boolean boolean25 = node18.hasChildren();
        node2.addChildrenToBack(node18);
        node18.removeChildren();
        com.google.javascript.rhino.head.ast.Comment comment28 = node18.getJsDocNode();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(comment14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "40" + "'", str19, "40");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(comment28);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str2 = node1.toString();
        int int3 = node1.getLineno();
        node1.putProp(0, (java.lang.Object) 10);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor7 = node1.iterator();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor8 = node1.iterator();
        int int11 = node1.getIntProp(5, 0);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor12 = node1.iterator();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator13 = node1.spliterator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(nodeItor7);
        org.junit.Assert.assertNotNull(nodeItor8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeItor12);
        org.junit.Assert.assertNotNull(nodeSpliterator13);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        boolean boolean41 = node8.hasSideEffects();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((-1), node8);
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(16, 5);
        int int47 = node46.getType();
        node8.putProp(1, (java.lang.Object) node46);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 16 + "'", int47 == 16);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(23);
        node1.removeProp(25);
        boolean boolean4 = node1.hasChildren();
        node1.putIntProp(21, 25);
        node1.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            node1.setDouble((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.head.Node cannot be cast to com.google.javascript.rhino.head.ast.NumberLiteral");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
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
        boolean boolean35 = node7.hasConsistentReturnUsage();
        java.lang.String str36 = node7.toString();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "40" + "'", str36, "40");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(3, "100");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        boolean boolean8 = node5.hasSideEffects();
        node5.setLineno((int) '4');
        com.google.javascript.rhino.head.Node node12 = node5.setType((int) '4');
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node17 = node16.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator18 = node17.new NodeIterator();
        node17.setLineno(13);
        boolean boolean21 = node17.hasSideEffects();
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str26 = node25.toString();
        boolean boolean27 = node25.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newString("");
        node29.removeProp(23);
        node25.addChildToFront(node29);
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean35 = node34.hasChildren();
        node25.addChildrenToFront(node34);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str39 = node38.toString();
        boolean boolean40 = node38.hasChildren();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) (short) -1, node34, node38, (int) (short) 10);
        com.google.javascript.rhino.head.Node node43 = node42.getLastChild();
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str49 = node48.toString();
        boolean boolean50 = node48.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newString("");
        node52.removeProp(23);
        node48.addChildToFront(node52);
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) 'a', node48);
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node60 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str61 = node60.toString();
        com.google.javascript.rhino.head.Node node62 = node60.getLastChild();
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (short) -1, node48, node58, node60, (int) (short) -1);
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node((int) (short) 1, node60, 12);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node(23);
        node68.removeProp(25);
        boolean boolean71 = node68.hasChildren();
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node((-1), node43, node60, node68);
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str75 = node74.toString();
        boolean boolean76 = node74.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node78 = com.google.javascript.rhino.head.Node.newString("");
        node78.removeProp(23);
        node74.addChildToFront(node78);
        com.google.javascript.rhino.head.Node node82 = node74.getFirstChild();
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node82.addChildrenToBack(node84);
        com.google.javascript.rhino.head.Node node87 = new com.google.javascript.rhino.head.Node(19, node17, node43, node82, 6);
        com.google.javascript.rhino.head.Node node88 = node82.getFirstChild();
        node3.addChildAfter(node12, node88);
        com.google.javascript.rhino.head.Node node91 = new com.google.javascript.rhino.head.Node(8, node3, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int93 = node3.getExistingIntProp(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "40" + "'", str6, "40");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "40" + "'", str26, "40");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-1" + "'", str39, "-1");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "40" + "'", str49, "40");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "40" + "'", str61, "40");
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "40" + "'", str75, "40");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node88);
    }
}

