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
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = node1.setType(7);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString("");
        node13.removeProp(23);
        node9.addChildToFront(node13);
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean19 = node18.hasChildren();
        node9.addChildrenToFront(node18);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasChildren();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (short) -1, node18, node22, (int) (short) 10);
        com.google.javascript.rhino.head.Node node27 = node26.getLastChild();
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
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (short) 1, node44, 12);
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node(23);
        node52.removeProp(25);
        boolean boolean55 = node52.hasChildren();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((-1), node27, node44, node52);
        node1.addChildrenToBack(node52);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator58 = node1.spliterator();
        java.lang.String str59 = node1.toString();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "40" + "'", str10, "40");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1" + "'", str23, "-1");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "40" + "'", str33, "40");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "40" + "'", str45, "40");
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "7" + "'", str59, "7");
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
        node35.setLineno((int) (short) 0);
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
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node4 = node1.getLastSibling();
        com.google.javascript.rhino.head.Node node6 = node4.setType(100);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode7 = null;
        java.lang.String str8 = node4.toStringTree(scriptNode7);
        int int9 = node4.getType();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
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
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean11 = node10.hasChildren();
        node1.addChildrenToFront(node10);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator13 = node10.new NodeIterator();
        boolean boolean14 = nodeIterator13.hasNext();
        boolean boolean15 = nodeIterator13.hasNext();
        boolean boolean16 = nodeIterator13.hasNext();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40" + "'", str2, "40");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
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
        boolean boolean29 = node13.hasSideEffects();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node33 = node32.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator34 = node33.new NodeIterator();
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str37 = node36.toString();
        boolean boolean38 = node36.hasConsistentReturnUsage();
        boolean boolean39 = node36.hasSideEffects();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str42 = node41.toString();
        boolean boolean43 = node41.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString("");
        node45.removeProp(23);
        node41.addChildToFront(node45);
        com.google.javascript.rhino.head.Node node49 = node41.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment50 = node41.getJsDocNode();
        node36.addChildToBack(node41);
        java.lang.String str52 = node36.toString();
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(0, node13, node33, node36, 1);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator55 = node36.new NodeIterator();
        com.google.javascript.rhino.head.Node node56 = nodeIterator55.next();
        java.lang.String str57 = node56.getJsDoc();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor58 = node56.iterator();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node56, 26);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "40" + "'", str37, "40");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "40" + "'", str42, "40");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(comment50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "40" + "'", str52, "40");
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(nodeItor58);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        int int25 = node23.getLineno();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(17, node23, (int) (byte) 100);
        node23.setLineno((int) (short) 1);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "40" + "'", str6, "40");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40" + "'", str18, "40");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 0, 15);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
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
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
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
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
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
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
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
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
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
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
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
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
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
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
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
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("10");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
}

