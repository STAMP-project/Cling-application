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
        com.google.javascript.rhino.InputId inputId1 = com.google.javascript.jscomp.NodeUtil.getInputId(node0);
        org.junit.Assert.assertNull(inputId1);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '#', node1, node2, node3, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        com.google.javascript.rhino.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(36, node1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(39, node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        node10.addChildrenToBack(node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node23 = node10.useSourceInfoIfMissingFrom(node21);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean28 = node27.hasOneChild();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node37.children();
        node32.addChildrenToBack(node37);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int44 = node43.getSourceOffset();
        com.google.javascript.rhino.Node node45 = node32.useSourceInfoIfMissingFrom(node43);
        com.google.javascript.rhino.Node[] nodeArray46 = new com.google.javascript.rhino.Node[] { node5, node10, node27, node43 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 0, nodeArray46, 36, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(nodeArray46);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        node14.addChildrenToBack(node19);
        // The following exception was thrown during execution in test generation
        try {
            node3.replaceChildAfter(node8, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.String str3 = objList2.toString();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int9 = node8.getSourceOffset();
        // The following exception was thrown during execution in test generation
        try {
            objList2.add((int) (byte) 100, (java.lang.Object) node8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10, 0]" + "'", str3, "[10, 0]");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream7 = objList6.parallelStream();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList18 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList18, objArray17);
        java.lang.Object[] objArray20 = objList18.toArray();
        java.util.List<java.lang.Object> objList21 = null;
        java.lang.Object[] objArray31 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList32, objArray31);
        java.lang.Object[] objArray34 = objList32.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream38 = objList37.parallelStream();
        java.lang.Object[] objArray48 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList49 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList49, objArray48);
        java.lang.Object[] objArray51 = objList49.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList55 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray75 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList76 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList76, objArray75);
        boolean boolean79 = objList76.add((java.lang.Object) 100.0d);
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable84 = node83.children();
        boolean boolean85 = objList76.contains((java.lang.Object) nodeIterable84);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.util.List<java.lang.Object>> objListList86 = com.google.common.collect.ImmutableList.of((java.util.List<java.lang.Object>) objList2, (java.util.List<java.lang.Object>) objList6, (java.util.List<java.lang.Object>) objList18, objList21, (java.util.List<java.lang.Object>) objList32, (java.util.List<java.lang.Object>) objList37, (java.util.List<java.lang.Object>) objList49, (java.util.List<java.lang.Object>) objList76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 3");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objStream7);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNotNull(objStream38);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objList55);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(nodeIterable84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray27 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList28 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList28, objArray27);
        boolean boolean31 = objList28.add((java.lang.Object) 100.0d);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = objList28.contains((java.lang.Object) nodeIterable36);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = objList2.addAll((java.util.Collection<java.lang.Object>) objList28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.isGetElem();
        int int12 = node8.getType();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = node8.srcref(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 39 + "'", int12 == 39);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        boolean boolean21 = node4.isComma();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node30.children();
        node25.addChildrenToBack(node30);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int37 = node36.getSourceOffset();
        com.google.javascript.rhino.Node node38 = node25.useSourceInfoIfMissingFrom(node36);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int41 = node25.getIndexOfChild(node40);
        node25.detachChildren();
        // The following exception was thrown during execution in test generation
        try {
            node4.removeChild(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeIterable31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        boolean boolean6 = node4.isDo();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        node10.addChildrenToBack(node15);
        boolean boolean18 = node15.isGetElem();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int23 = node22.getSourceOffset();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        node22.addChildrenToBack(node27);
        node22.detachChildren();
        node22.setLineno(16);
        node15.addChildrenToFront(node22);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int38 = node37.getSourceOffset();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        node37.addChildrenToBack(node42);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int49 = node48.getSourceOffset();
        com.google.javascript.rhino.Node node50 = node37.useSourceInfoIfMissingFrom(node48);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int53 = node37.getIndexOfChild(node52);
        node37.detachChildren();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node58.children();
        node58.setSourceFileForTesting("[10, 0]");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(53, node4, node22, node37, node58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(nodeIterable59);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        java.lang.String str5 = node3.getQualifiedName();
        node3.setSourceFileForTesting("");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry1.getNativeObjectType(jSTypeNative2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        // The following exception was thrown during execution in test generation
        try {
            node3.setString("[10, 0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 36 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            functionType10.matchConstraint(objectType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = com.google.javascript.rhino.Node.SIDE_EFFECTS_FLAGS_MASK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 31 + "'", int0 == 31);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "[10, 0]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "InputId: hi!", "", "hi!", "[10, 0]" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        int int8 = strSet6.size();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "InputId: hi!", "", "hi!", "[10, 0]" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        int int17 = strSet15.size();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "InputId: hi!", "", "hi!", "[10, 0]" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        int int26 = strSet24.size();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "InputId: hi!", "", "hi!", "[10, 0]" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        int int35 = strSet33.size();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "InputId: hi!", "", "hi!", "[10, 0]" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        int int44 = strSet42.size();
        java.util.AbstractSet[] abstractSetArray46 = new java.util.AbstractSet[4];
        @SuppressWarnings("unchecked")
        java.util.AbstractSet<java.lang.String>[] strSetArray47 = (java.util.AbstractSet<java.lang.String>[]) abstractSetArray46;
        strSetArray47[0] = strSet15;
        strSetArray47[1] = strSet24;
        strSetArray47[2] = strSet33;
        strSetArray47[3] = strSet42;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractSet<java.lang.String>[] strSetArray56 = strSet6.toArray(strSetArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertNotNull(abstractSetArray46);
        org.junit.Assert.assertNotNull(strSetArray47);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        boolean boolean16 = node14.isQuotedString();
        com.google.javascript.rhino.Node node17 = node14.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry9.createFunctionType(jSType10, node17);
        boolean boolean19 = functionType18.isArrayType();
        boolean boolean20 = functionType18.isRegexpType();
        boolean boolean22 = functionType18.isPropertyTypeDeclared("InputId: hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node29.children();
        boolean boolean31 = node29.isQuotedString();
        com.google.javascript.rhino.Node node32 = node29.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry24.createFunctionType(jSType25, node32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeExpression7.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType18, jSTypeRegistry24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: NUMBER 0.0 36");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(functionType33);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getType("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.children();
        boolean boolean13 = node11.isQuotedString();
        com.google.javascript.rhino.Node node14 = node11.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry6.createFunctionType(jSType7, node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = functionType15.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.registerPropertyOnType("[10, 0]", (com.google.javascript.rhino.jstype.JSType) functionType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNull(functionType16);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        int int14 = objList10.size();
        boolean boolean15 = objList10.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = objList10.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = functionType10.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = functionType11.getPropertiesCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(functionType11);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType10.getOwnSlot("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType18 = functionType10.getTopMostDefiningType("NUMBER 0.0 36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int6 = stringPosition5.getEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int9 = stringPosition8.getEndLine();
        int int10 = stringPosition8.getStartLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition11 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int12 = stringPosition11.getEndLine();
        com.google.javascript.rhino.SourcePosition[] sourcePositionArray14 = new com.google.javascript.rhino.SourcePosition[4];
        @SuppressWarnings("unchecked")
        com.google.javascript.rhino.SourcePosition<java.lang.String>[] strSourcePositionArray15 = (com.google.javascript.rhino.SourcePosition<java.lang.String>[]) sourcePositionArray14;
        strSourcePositionArray15[0] = stringPosition5;
        strSourcePositionArray15[1] = stringPosition7;
        strSourcePositionArray15[2] = stringPosition8;
        strSourcePositionArray15[3] = stringPosition11;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.SourcePosition<java.lang.String>[] strSourcePositionArray24 = objList2.toArray(strSourcePositionArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(sourcePositionArray14);
        org.junit.Assert.assertNotNull(strSourcePositionArray15);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("NUMBER 0.0 36", (java.lang.Throwable) iOException6);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = functionType10.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = functionType11.isNoResolvedType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(functionType11);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean8 = node3.isCatch();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo9 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getNativeType(jSTypeNative2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        int int0 = com.google.javascript.rhino.jstype.JSType.ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.String str3 = objList2.toString();
        java.lang.Object[] objArray4 = objList2.toArray();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        java.lang.String str10 = node8.getQualifiedName();
        node8.setDouble((double) 53);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = objList2.remove((java.lang.Object) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10, 0]" + "'", str3, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 0]");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean8 = node3.isCatch();
        java.lang.String str9 = node3.getQualifiedName();
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            node3.appendStringTree(appendable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        boolean boolean29 = jSType28.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        boolean boolean38 = node36.isQuotedString();
        com.google.javascript.rhino.Node node39 = node36.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry31.createFunctionType(jSType32, node39);
        boolean boolean41 = functionType40.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType40.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType44 = functionType40.toMaybeFunctionType();
        boolean boolean45 = functionType40.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType28.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType40);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType48 = functionType40.getTopMostDefiningType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSType46);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean9 = jSTypeExpression7.equals((java.lang.Object) (short) -1);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        boolean boolean18 = node16.isQuotedString();
        com.google.javascript.rhino.Node node19 = node16.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry11.createFunctionType(jSType12, node19);
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry11.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node29.children();
        boolean boolean31 = node29.isQuotedString();
        com.google.javascript.rhino.Node node32 = node29.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry24.createFunctionType(jSType25, node32);
        boolean boolean34 = functionType33.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet35 = functionType33.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        com.google.javascript.rhino.Node node47 = node44.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry39.createFunctionType(jSType40, node47);
        boolean boolean49 = functionType48.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList50 = functionType48.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        boolean boolean59 = node57.isQuotedString();
        com.google.javascript.rhino.Node node60 = node57.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry52.createFunctionType(jSType53, node60);
        boolean boolean62 = functionType61.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] { functionType48, functionType61 };
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry37.createUnionType(jSTypeArray63);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry11.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) functionType33, jSTypeArray63);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeExpression7.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType33, jSTypeRegistry67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: NUMBER 0.0 36");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet35 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet35.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(functionTypeList50);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertNotNull(functionType65);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.children();
        boolean boolean13 = node11.isQuotedString();
        com.google.javascript.rhino.Node node14 = node11.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry6.createFunctionType(jSType7, node14);
        com.google.javascript.rhino.jstype.JSType jSType17 = jSTypeRegistry6.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node24.children();
        boolean boolean26 = node24.isQuotedString();
        com.google.javascript.rhino.Node node27 = node24.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry19.createFunctionType(jSType20, node27);
        boolean boolean29 = functionType28.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = functionType28.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList45 = functionType43.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { functionType43, functionType56 };
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry32.createUnionType(jSTypeArray58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry6.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) functionType28, jSTypeArray58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray61 = objList2.toArray((java.lang.Object[]) jSTypeArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(functionTypeList45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(functionType60);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType10.getOwnSlot("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType27.restrictByNotNullOrUndefined();
        boolean boolean30 = jSType29.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList45 = functionType43.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { functionType43, functionType56 };
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry32.createUnionType(jSTypeArray58);
        boolean boolean60 = jSType59.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        boolean boolean69 = node67.isQuotedString();
        com.google.javascript.rhino.Node node70 = node67.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry62.createFunctionType(jSType63, node70);
        boolean boolean72 = functionType71.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType71.toMaybeFunctionType();
        boolean boolean76 = functionType71.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType77 = jSType59.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean78 = jSType29.canAssignTo(jSType77);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair79 = functionType10.getTypesUnderShallowInequality(jSType29);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType80 = functionType10.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(functionTypeList45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(typePair79);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.Node node6 = node3.removeFirstChild();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int12 = node11.getSourceOffset();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        node11.addChildrenToBack(node16);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int23 = node22.getSourceOffset();
        com.google.javascript.rhino.Node node24 = node11.useSourceInfoIfMissingFrom(node22);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(10, node11, 49, (int) (short) 100);
        boolean boolean28 = node11.isComma();
        boolean boolean29 = node11.isDec();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(39, node34);
        boolean boolean36 = node35.isIf();
        node35.detachChildren();
        // The following exception was thrown during execution in test generation
        try {
            node6.replaceChild(node11, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.hasModifies();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo2.getEnumParameterType();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable8 = node3.getAncestors();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node3.children();
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ancestorIterable8);
        org.junit.Assert.assertNotNull(nodeIterable9);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.NOT_A_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Not declared as a type name" + "'", str0, "Not declared as a type name");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility0 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility4 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityEnum9 = null;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility11 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray12 = new com.google.javascript.rhino.JSDocInfo.Visibility[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>> visibilityEnumList13 = com.google.common.collect.ImmutableList.of((java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility0, (java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility1, (java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility2, (java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility3, (java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility4, (java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility5, (java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility6, (java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility7, (java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility8, visibilityEnum9, (java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility10, (java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>) visibility11, (java.lang.Enum<com.google.javascript.rhino.JSDocInfo.Visibility>[]) visibilityArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 9");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + visibility0 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility0.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertTrue("'" + visibility1 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility1.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility3 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility3.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertTrue("'" + visibility4 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility4.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertTrue("'" + visibility5 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility5.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + visibility6 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility6.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility7 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility7.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertTrue("'" + visibility8 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility8.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility10 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility10.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility11 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility11.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNotNull(visibilityArray12);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean8 = node3.isCatch();
        // The following exception was thrown during execution in test generation
        try {
            node3.setString("InputId: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 36 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType10.isPropertyTypeInferred("NUMBER 0.0 36");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType18 = functionType10.getTopMostDefiningType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        com.google.javascript.rhino.Node node44 = node41.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry36.createFunctionType(jSType37, node44);
        boolean boolean46 = functionType45.isArrayType();
        boolean boolean47 = jSType34.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate48 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = functionType45.setValidator(jSTypePredicate48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType10.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList25 = functionType23.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.children();
        boolean boolean34 = node32.isQuotedString();
        com.google.javascript.rhino.Node node35 = node32.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry27.createFunctionType(jSType28, node35);
        boolean boolean37 = functionType36.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] { functionType23, functionType36 };
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry12.createUnionType(jSTypeArray38);
        com.google.javascript.rhino.Node node40 = jSTypeRegistry1.createOptionalParameters(jSTypeArray38);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node50 = node47.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry42.createFunctionType(jSType43, node50);
        boolean boolean52 = functionType51.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList53 = functionType51.getSubTypes();
        com.google.javascript.rhino.Node node54 = functionType51.getRootNode();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable62 = node61.children();
        boolean boolean63 = node61.isQuotedString();
        com.google.javascript.rhino.Node node64 = node61.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry56.createFunctionType(jSType57, node64);
        boolean boolean66 = functionType65.isArrayType();
        boolean boolean67 = functionType65.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType65.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot71 = functionType65.getOwnSlot("hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo75 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList77 = com.google.common.collect.ImmutableList.of(jSDocInfo73, jSDocInfo74, jSDocInfo75, jSDocInfo76);
        java.util.Set<java.lang.String> strSet78 = jSDocInfo76.getSuppressions();
        functionType65.setPropertyJSDocInfo("", jSDocInfo76);
        java.util.List<com.google.javascript.rhino.jstype.JSType> jSTypeList80 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry1.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.ObjectType) functionType51, (com.google.javascript.rhino.jstype.JSType) functionType65, jSTypeList80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(functionTypeList25);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(functionTypeList53);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeIterable62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(jSType69);
        org.junit.Assert.assertNull(jSTypeStaticSlot71);
        org.junit.Assert.assertNotNull(jSDocInfoList77);
        org.junit.Assert.assertNotNull(strSet78);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        boolean boolean17 = node14.isGetElem();
        int int18 = node14.getType();
        boolean boolean19 = objList2.equals((java.lang.Object) node14);
        java.util.Collection<java.lang.Object> objCollection20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = objList2.removeAll(objCollection20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        boolean boolean17 = node14.isGetElem();
        int int18 = node14.getType();
        boolean boolean19 = objList2.equals((java.lang.Object) node14);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(false);
        boolean boolean24 = booleanLiteralSet22.contains(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = objList2.set((int) (byte) 100, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        java.lang.Object[] objArray14 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList15 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList15, objArray14);
        java.lang.Object[] objArray17 = objList15.toArray();
        java.util.stream.Stream<java.lang.Object> objStream18 = objList15.parallelStream();
        int int19 = objList15.size();
        objList15.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = objList4.retainAll((java.util.Collection<java.lang.Object>) objList15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        com.google.common.collect.ImmutableList<java.lang.Object> objList9 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray29 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList30 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList30, objArray29);
        boolean boolean33 = objList30.add((java.lang.Object) 100.0d);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node37.children();
        boolean boolean39 = objList30.contains((java.lang.Object) nodeIterable38);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = objList5.retainAll((java.util.Collection<java.lang.Object>) objList30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objList9);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType10.getOwnSlot("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType27.restrictByNotNullOrUndefined();
        boolean boolean30 = jSType29.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList45 = functionType43.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { functionType43, functionType56 };
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry32.createUnionType(jSTypeArray58);
        boolean boolean60 = jSType59.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        boolean boolean69 = node67.isQuotedString();
        com.google.javascript.rhino.Node node70 = node67.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry62.createFunctionType(jSType63, node70);
        boolean boolean72 = functionType71.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType71.toMaybeFunctionType();
        boolean boolean76 = functionType71.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType77 = jSType59.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean78 = jSType29.canAssignTo(jSType77);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair79 = functionType10.getTypesUnderShallowInequality(jSType29);
        boolean boolean80 = functionType10.matchesObjectContext();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate81 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = functionType10.setValidator(jSTypePredicate81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(functionTypeList45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(typePair79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType10.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            functionType13.clearCachedValues();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(functionType13);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isScript();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        boolean boolean14 = node12.isQuotedString();
        node12.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable17 = node12.getAncestors();
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = node12.hasChild(node18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node20 = node3.clonePropsFrom(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ancestorIterable17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        jSTypeRegistry1.forwardDeclareType("");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType47.restrictByNotNullOrUndefined();
        boolean boolean50 = jSType49.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType49.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable62 = node61.children();
        boolean boolean63 = node61.isQuotedString();
        com.google.javascript.rhino.Node node64 = node61.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry56.createFunctionType(jSType57, node64);
        boolean boolean66 = functionType65.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList67 = functionType65.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable75 = node74.children();
        boolean boolean76 = node74.isQuotedString();
        com.google.javascript.rhino.Node node77 = node74.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry69.createFunctionType(jSType70, node77);
        boolean boolean79 = functionType78.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] { functionType65, functionType78 };
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry54.createUnionType(jSTypeArray80);
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType51, false, jSTypeArray80);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode83 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry1.setResolveMode(resolveMode83);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeIterable62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(functionTypeList67);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(nodeIterable75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jSTypeArray80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertTrue("'" + resolveMode83 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode83.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        boolean boolean17 = node14.isGetElem();
        int int18 = node14.getType();
        boolean boolean19 = objList2.equals((java.lang.Object) node14);
        com.google.common.collect.ImmutableList<java.lang.Object> objList22 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = objList2.retainAll((java.util.Collection<java.lang.Object>) objList22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objList22);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        java.lang.String str12 = functionType10.toAnnotationString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType10.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "function (...[?]): ?" + "'", str12, "function (...[?]): ?");
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        node14.addChildrenToBack(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node14.useSourceInfoIfMissingFrom(node25);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(10, node14, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean33 = node30.isEquivalentTo(node32);
        int int34 = objList2.lastIndexOf((java.lang.Object) node30);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node36.setCharno((int) (short) 1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int43 = node42.getSourceOffset();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        node42.addChildrenToBack(node47);
        boolean boolean50 = node47.isGetElem();
        int int51 = node47.getType();
        com.google.javascript.rhino.jstype.JSType jSType52 = node47.getJSType();
        boolean boolean53 = node47.isAssignAdd();
        boolean boolean54 = node47.isInc();
        // The following exception was thrown during execution in test generation
        try {
            node30.replaceChild(node36, node47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The new child node already has a parent.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 39 + "'", int51 == 39);
        org.junit.Assert.assertNull(jSType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean9 = jSTypeExpression7.equals((java.lang.Object) (short) -1);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        boolean boolean18 = node16.isQuotedString();
        com.google.javascript.rhino.Node node19 = node16.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry11.createFunctionType(jSType12, node19);
        boolean boolean21 = functionType20.isArrayType();
        boolean boolean23 = functionType20.isPropertyTypeInferred("JSDocInfo");
        boolean boolean25 = functionType20.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.children();
        boolean boolean34 = node32.isQuotedString();
        com.google.javascript.rhino.Node node35 = node32.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry27.createFunctionType(jSType28, node35);
        boolean boolean37 = functionType36.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType36.getPropertyType("InputId: hi!");
        boolean boolean40 = functionType20.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node50 = node47.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry42.createFunctionType(jSType43, node50);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry42.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable61 = node60.children();
        boolean boolean62 = node60.isQuotedString();
        com.google.javascript.rhino.Node node63 = node60.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry55.createFunctionType(jSType56, node63);
        boolean boolean65 = functionType64.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet66 = functionType64.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable76 = node75.children();
        boolean boolean77 = node75.isQuotedString();
        com.google.javascript.rhino.Node node78 = node75.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry70.createFunctionType(jSType71, node78);
        boolean boolean80 = functionType79.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList81 = functionType79.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82);
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable89 = node88.children();
        boolean boolean90 = node88.isQuotedString();
        com.google.javascript.rhino.Node node91 = node88.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry83.createFunctionType(jSType84, node91);
        boolean boolean93 = functionType92.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray94 = new com.google.javascript.rhino.jstype.JSType[] { functionType79, functionType92 };
        com.google.javascript.rhino.jstype.JSType jSType95 = jSTypeRegistry68.createUnionType(jSTypeArray94);
        com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry42.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) functionType64, jSTypeArray94);
        boolean boolean98 = jSTypeRegistry42.isForwardDeclaredType("JSDocInfo");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType99 = jSTypeExpression7.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType36, jSTypeRegistry42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: NUMBER 0.0 36");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(nodeIterable61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet66 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet66.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(nodeIterable76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(functionTypeList81);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(nodeIterable89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(node91);
        org.junit.Assert.assertNotNull(functionType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(jSTypeArray94);
        org.junit.Assert.assertNotNull(jSType95);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList8 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray28 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList29 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList29, objArray28);
        boolean boolean32 = objList29.add((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = objList4.addAll((java.util.Collection<java.lang.Object>) objList29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList8);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        boolean boolean13 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        boolean boolean22 = node20.isQuotedString();
        com.google.javascript.rhino.Node node23 = node20.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry15.createFunctionType(jSType16, node23);
        boolean boolean25 = functionType24.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType24.restrictByNotNullOrUndefined();
        boolean boolean27 = jSType26.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createOptionalNullableType(jSType26);
        java.util.List<com.google.javascript.rhino.jstype.JSType> jSTypeList29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node30 = jSTypeRegistry1.createParametersWithVarArgs(jSTypeList29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType28);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(39, node4);
        node5.setSourceFileForTesting("");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags8 = null;
        // The following exception was thrown during execution in test generation
        try {
            node5.setSideEffectFlags(sideEffectFlags8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        node14.addChildrenToBack(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node14.useSourceInfoIfMissingFrom(node25);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(10, node14, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean33 = node30.isEquivalentTo(node32);
        int int34 = objList2.lastIndexOf((java.lang.Object) node30);
        int int36 = objList2.lastIndexOf((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        node41.setLength(0);
        boolean boolean46 = node41.isVar();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean51 = node50.hasOneChild();
        node41.addChildToBack(node50);
        boolean boolean53 = node50.isInc();
        // The following exception was thrown during execution in test generation
        try {
            objList2.add(0, (java.lang.Object) boolean53);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        boolean boolean44 = node42.isQuotedString();
        com.google.javascript.rhino.Node node45 = node42.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry37.createFunctionType(jSType38, node45);
        boolean boolean48 = functionType46.isPropertyTypeDeclared("");
        boolean boolean50 = functionType46.isPropertyInExterns("JSDocInfo");
        boolean boolean51 = functionType46.isRecordType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType52 = jSType34.forceResolve(errorReporter35, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean31 = functionType14.isNullable();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = functionType14.getOwnImplementedInterfaces();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable32);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = functionType23.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node37 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry29.createFunctionType(jSType30, node37);
        boolean boolean39 = functionType38.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList40 = functionType38.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node50 = node47.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry42.createFunctionType(jSType43, node50);
        boolean boolean52 = functionType51.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] { functionType38, functionType51 };
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry27.createUnionType(jSTypeArray53);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry1.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) functionType23, jSTypeArray53);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = jSTypeRegistry1.getErrorReporter();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(functionTypeList40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertNull(errorReporter56);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        boolean boolean17 = node14.isGetElem();
        int int18 = node14.getType();
        boolean boolean19 = objList2.equals((java.lang.Object) node14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = objList2.remove(36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        node3.setSourceFileForTesting("[10, 0]");
        boolean boolean7 = node3.isLocalResultCall();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int12 = node11.getSourceOffset();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        node11.addChildrenToBack(node16);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int23 = node22.getSourceOffset();
        com.google.javascript.rhino.Node node24 = node11.useSourceInfoIfMissingFrom(node22);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node29.addChildrenToBack(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node29.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node29, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean48 = node45.isEquivalentTo(node47);
        boolean boolean49 = node45.isSwitch();
        // The following exception was thrown during execution in test generation
        try {
            node3.addChildBefore(node24, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean12 = functionType10.isPropertyTypeDeclared("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType10.getTopMostDefiningType("[10, 0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(32, "JSDocInfo", (int) (byte) 100, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = node4.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = objList16.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor18 = objList16.listIterator();
        boolean boolean20 = objList16.contains((java.lang.Object) (short) 10);
        java.lang.Object obj21 = null;
        boolean boolean22 = objList16.equals(obj21);
        java.lang.String str23 = objList16.toString();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        node27.setLength(0);
        boolean boolean32 = node27.isScript();
        boolean boolean33 = node27.hasChildren();
        int int34 = objList16.lastIndexOf((java.lang.Object) node27);
        boolean boolean35 = objList10.addAll((java.util.Collection<java.lang.Object>) objList16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object> objList38 = objList16.subList(9, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (9) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[10, 0]" + "'", str23, "[10, 0]");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        boolean boolean12 = node10.isQuotedString();
        com.google.javascript.rhino.Node node13 = node10.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry5.createFunctionType(jSType6, node13);
        boolean boolean15 = functionType14.isArrayType();
        boolean boolean16 = functionType14.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = functionType14.getOwnSlot("hi!");
        boolean boolean21 = objList2.contains((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            objList2.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSTypeStaticSlot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        int int0 = com.google.javascript.rhino.Node.FREE_CALL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 50 + "'", int0 == 50);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        boolean boolean29 = jSType28.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        boolean boolean38 = node36.isQuotedString();
        com.google.javascript.rhino.Node node39 = node36.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry31.createFunctionType(jSType32, node39);
        boolean boolean41 = functionType40.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType40.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType44 = functionType40.toMaybeFunctionType();
        boolean boolean45 = functionType40.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType28.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType40);
        java.lang.Class<?> wildcardClass47 = functionType40.getClass();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo1.getTypedefType();
        boolean boolean6 = jSDocInfo1.hasType();
        boolean boolean7 = jSDocInfo1.hasThisType();
        boolean boolean8 = jSDocInfo1.hasType();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "JSDocInfo", "", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        int int7 = strSet5.size();
        java.lang.Object[] objArray8 = strSet5.toArray();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[, JSDocInfo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[, JSDocInfo]");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor0 = null;
        com.google.common.collect.ImmutableList<java.lang.Object> objList3 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = objList3.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor5 = objList3.listIterator();
        int int6 = objList3.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor8 = objList3.listIterator((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Object> objList11 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream12 = objList11.parallelStream();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor13 = objList11.listIterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = objList16.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor18 = objList16.listIterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList21 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray22 = objList21.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor23 = objList21.listIterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray27 = objList26.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor28 = objList26.listIterator();
        int int29 = objList26.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor31 = objList26.listIterator((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Object> objList34 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream35 = objList34.parallelStream();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor36 = objList34.listIterator();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor37 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.common.collect.UnmodifiableListIterator<java.lang.Object>> objItorList38 = com.google.common.collect.ImmutableList.of(objItor0, objItor8, objItor13, objItor18, objItor23, objItor31, objItor36, objItor37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 0");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(objList11);
        org.junit.Assert.assertNotNull(objStream12);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor18);
        org.junit.Assert.assertNotNull(objList21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor23);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(objItor31);
        org.junit.Assert.assertNotNull(objList34);
        org.junit.Assert.assertNotNull(objStream35);
        org.junit.Assert.assertNotNull(objItor36);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        node3.detachChildren();
        boolean boolean12 = node3.isOr();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean17 = node16.hasOneChild();
        node16.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable20 = node16.getAncestors();
        int int21 = node16.getChildCount();
        node16.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node24 = node3.copyInformationFrom(node16);
        com.google.javascript.rhino.Node node25 = node16.removeChildren();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(ancestorIterable20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = objList16.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor18 = objList16.listIterator();
        boolean boolean20 = objList16.contains((java.lang.Object) (short) 10);
        java.lang.Object obj21 = null;
        boolean boolean22 = objList16.equals(obj21);
        java.lang.String str23 = objList16.toString();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        node27.setLength(0);
        boolean boolean32 = node27.isScript();
        boolean boolean33 = node27.hasChildren();
        int int34 = objList16.lastIndexOf((java.lang.Object) node27);
        boolean boolean35 = objList10.addAll((java.util.Collection<java.lang.Object>) objList16);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet49 = functionType47.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet52 = booleanLiteralSet49.union(booleanLiteralSet51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = objList10.set(31, (java.lang.Object) booleanLiteralSet51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 31, Size: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[10, 0]" + "'", str23, "[10, 0]");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet49 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet49.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet51 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet51.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet52 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet52.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        int int0 = com.google.javascript.rhino.Node.NO_SIDE_EFFECTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        boolean boolean2 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        jSTypeRegistry1.identifyNonNullableName("NUMBER 0.0 36");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.children();
        boolean boolean13 = node11.isQuotedString();
        com.google.javascript.rhino.Node node14 = node11.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry6.createFunctionType(jSType7, node14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = functionType15.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType17 = objectType16.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node24.children();
        boolean boolean26 = node24.isQuotedString();
        com.google.javascript.rhino.Node node27 = node24.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry19.createFunctionType(jSType20, node27);
        boolean boolean29 = functionType28.isArrayType();
        boolean boolean31 = functionType28.isPropertyTypeInferred("JSDocInfo");
        boolean boolean33 = functionType28.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.children();
        boolean boolean42 = node40.isQuotedString();
        com.google.javascript.rhino.Node node43 = node40.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry35.createFunctionType(jSType36, node43);
        boolean boolean45 = functionType44.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType44.getPropertyType("InputId: hi!");
        boolean boolean48 = functionType28.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean49 = functionType28.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node56.children();
        boolean boolean58 = node56.isQuotedString();
        com.google.javascript.rhino.Node node59 = node56.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry51.createFunctionType(jSType52, node59);
        boolean boolean61 = functionType60.isArrayType();
        boolean boolean63 = functionType60.isPropertyTypeInferred("JSDocInfo");
        boolean boolean65 = functionType60.hasOwnProperty("");
        com.google.javascript.rhino.Node node66 = functionType60.getParametersNode();
        boolean boolean67 = functionType60.hasCachedValues();
        functionType28.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType60);
        boolean boolean69 = jSType17.equals((java.lang.Object) functionType28);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry1.createFunctionType(jSType17, true, jSTypeArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList20 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList20, objArray19);
        java.lang.Object[] objArray22 = objList20.toArray();
        java.util.stream.Stream<java.lang.Object> objStream23 = objList20.parallelStream();
        int int24 = objList20.size();
        boolean boolean25 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList20);
        java.util.ListIterator<java.lang.Object> objItor26 = objList2.listIterator();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node33.children();
        boolean boolean35 = node33.isQuotedString();
        com.google.javascript.rhino.Node node36 = node33.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry28.createFunctionType(jSType29, node36);
        boolean boolean38 = functionType37.isArrayType();
        boolean boolean40 = functionType37.isPropertyTypeInferred("JSDocInfo");
        boolean boolean42 = functionType37.hasOwnProperty("");
        com.google.javascript.rhino.Node node43 = functionType37.getParametersNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = objList2.add((java.lang.Object) functionType37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objItor26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable8 = node3.getAncestors();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = node3.getExistingIntProp((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 52");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ancestorIterable8);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int19 = node3.getIndexOfChild(node18);
        boolean boolean20 = node18.isIn();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = node18.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean2 = node1.isBlock();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int8 = node7.getSourceOffset();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        node7.addChildrenToBack(node12);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int19 = node18.getSourceOffset();
        com.google.javascript.rhino.Node node20 = node7.useSourceInfoIfMissingFrom(node18);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(10, node7, 49, (int) (short) 100);
        boolean boolean24 = node7.isComma();
        boolean boolean25 = node7.isAssignAdd();
        node7.removeProp((int) (short) 0);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean32 = node31.hasOneChild();
        node31.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable35 = node31.getAncestors();
        int int36 = node31.getChildCount();
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildBefore(node7, node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(ancestorIterable35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("function (...[?]): ?", 1, (-1));
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean9 = node8.hasOneChild();
        boolean boolean10 = node8.isOnlyModifiesThisCall();
        boolean boolean11 = node8.isLabel();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        boolean boolean17 = node15.isQuotedString();
        node15.setLength(0);
        boolean boolean20 = node15.isNew();
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] { node4, node8, node15 };
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(2, nodeArray21);
        java.lang.String str23 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node22);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        node14.addChildrenToBack(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node14.useSourceInfoIfMissingFrom(node25);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(10, node14, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean33 = node30.isEquivalentTo(node32);
        int int34 = objList2.lastIndexOf((java.lang.Object) node30);
        int int35 = node30.getSourceOffset();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node30.children();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator37 = nodeIterable36.spliterator();
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertNotNull(nodeSpliterator37);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.Node node16 = functionType10.getParametersNode();
        boolean boolean17 = functionType10.hasCachedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = functionType10.getParentScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType20 = functionType10.getTopMostDefiningType("JSDocInfo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectType18);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType10.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = functionType13.getRootNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(functionType13);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        java.lang.String str5 = node3.getQualifiedName();
        boolean boolean6 = node3.isNE();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        node10.addChildrenToBack(node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node23 = node10.useSourceInfoIfMissingFrom(node21);
        node23.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(39, node30);
        com.google.javascript.rhino.Node node32 = node23.srcref(node31);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int37 = node36.getSourceOffset();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        node36.addChildrenToBack(node41);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int48 = node47.getSourceOffset();
        com.google.javascript.rhino.Node node49 = node36.useSourceInfoIfMissingFrom(node47);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int52 = node36.getIndexOfChild(node51);
        com.google.javascript.rhino.Node node53 = node23.srcref(node51);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node54 = node3.removeChildAfter(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = com.google.javascript.rhino.Node.OPT_ARG_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 37 + "'", int0 == 37);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        // The following exception was thrown during execution in test generation
        try {
            node8.setSideEffectFlags(38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.String str3 = objList2.toString();
        java.lang.Object[] objArray4 = objList2.toArray();
        // The following exception was thrown during execution in test generation
        try {
            objList2.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10, 0]" + "'", str3, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 0]");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getType("hi!");
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        boolean boolean14 = node12.isQuotedString();
        com.google.javascript.rhino.Node node15 = node12.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry7.createFunctionType(jSType8, node15);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType29.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList31 = functionType29.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        boolean boolean40 = node38.isQuotedString();
        com.google.javascript.rhino.Node node41 = node38.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry33.createFunctionType(jSType34, node41);
        boolean boolean43 = functionType42.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] { functionType29, functionType42 };
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry18.createUnionType(jSTypeArray44);
        com.google.javascript.rhino.Node node46 = jSTypeRegistry7.createOptionalParameters(jSTypeArray44);
        com.google.javascript.rhino.Node node47 = jSTypeRegistry1.createOptionalParameters(jSTypeArray44);
        // The following exception was thrown during execution in test generation
        try {
            node47.setDouble(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PARAM_LIST is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(functionTypeList31);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = functionType10.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = functionType11.hasCachedValues();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(functionType11);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean5 = jSDocInfo1.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getModifies();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strSet7.add("Unknown class name");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        node3.detachChildren();
        node3.setLineno(16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(39, node18);
        boolean boolean20 = node19.isIf();
        node19.detachChildren();
        boolean boolean22 = node19.isVoid();
        com.google.javascript.rhino.Node node23 = node3.useSourceInfoIfMissingFrom(node19);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.siblings();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node28.children();
        java.lang.String str30 = node28.getQualifiedName();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression39 = new com.google.javascript.rhino.JSTypeExpression(node35, "hi!");
        boolean boolean40 = node35.isCatch();
        java.lang.String str41 = node35.getQualifiedName();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("{1936444324}", (int) ' ', (int) (short) 1);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship46 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType31, node35, node45);
        // The following exception was thrown during execution in test generation
        try {
            node23.replaceChildAfter(node28, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(node45);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList14 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList14, objArray13);
        java.lang.Object[] objArray16 = objList14.toArray();
        java.util.stream.Stream<java.lang.Object> objStream17 = objList14.parallelStream();
        java.lang.Object[] objArray18 = objList14.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = objList2.removeAll((java.util.Collection<java.lang.Object>) objList14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        node16.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(39, node23);
        com.google.javascript.rhino.Node node25 = node16.srcref(node24);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node29.addChildrenToBack(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node29.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.Node node43 = node24.clonePropsFrom(node42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = node43.toStringTree();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Number node not created with Node.newNumber");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        node6.setSourceFileForTesting("[10, 0]");
        node6.setVarArgs(true);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        boolean boolean17 = node15.isQuotedString();
        node15.setLength(0);
        boolean boolean20 = node15.isVar();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int25 = node24.getSourceOffset();
        boolean boolean26 = node24.isDo();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int31 = node30.getSourceOffset();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        node30.addChildrenToBack(node35);
        node30.detachChildren();
        node30.setLineno(16);
        boolean boolean41 = node30.isSwitch();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(39, node46);
        boolean boolean48 = node47.isIf();
        node47.detachChildren();
        boolean boolean50 = node30.hasChild(node47);
        boolean boolean51 = node30.isDebugger();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(52, node6, node15, node24, node30, (int) '#', (-1));
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean59 = node58.hasOneChild();
        boolean boolean60 = node58.isOnlyModifiesThisCall();
        boolean boolean61 = node58.isLabel();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(51, node1, node15, node58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            objList2.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = iOException7.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.lang.Throwable[] throwableArray14 = iOException11.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException("");
        java.io.IOException iOException19 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray20 = iOException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = iOException19.getSuppressed();
        java.io.IOException iOException22 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException19);
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList23 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException2, (java.lang.Throwable) iOException7, (java.lang.Throwable) iOException11, (java.lang.Throwable) iOException16, (java.lang.Throwable) iOException22);
        java.io.IOException iOException25 = new java.io.IOException("");
        iOException11.addSuppressed((java.lang.Throwable) iOException25);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableList23);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        com.google.javascript.rhino.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(35, node1, 31, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isVar();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean13 = node12.hasOneChild();
        node3.addChildToBack(node12);
        boolean boolean15 = node12.isDefaultCase();
        // The following exception was thrown during execution in test generation
        try {
            node12.setSideEffectFlags(43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "{1936444324}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int int0 = com.google.javascript.rhino.Node.IS_DISPATCHER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 47 + "'", int0 == 47);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int6 = node5.getSourceOffset();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        node5.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node18 = node5.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(10, node5, 49, (int) (short) 100);
        boolean boolean22 = node5.isComma();
        boolean boolean23 = node5.isDec();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0, node5, 50, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType26.hasReferenceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType32 = functionType26.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType10.restrictByNotNullOrUndefined();
        boolean boolean13 = jSType12.isNoResolvedType();
        boolean boolean14 = jSType12.isInstanceType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSType12.matchConstraint(objectType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType10.getOwnSlot("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType27.restrictByNotNullOrUndefined();
        boolean boolean30 = jSType29.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList45 = functionType43.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { functionType43, functionType56 };
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry32.createUnionType(jSTypeArray58);
        boolean boolean60 = jSType59.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        boolean boolean69 = node67.isQuotedString();
        com.google.javascript.rhino.Node node70 = node67.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry62.createFunctionType(jSType63, node70);
        boolean boolean72 = functionType71.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType71.toMaybeFunctionType();
        boolean boolean76 = functionType71.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType77 = jSType59.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean78 = jSType29.canAssignTo(jSType77);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair79 = functionType10.getTypesUnderShallowInequality(jSType29);
        boolean boolean80 = functionType10.matchesObjectContext();
        int int81 = functionType10.getPropertiesCount();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType10.getAllImplementedInterfaces();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate83 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean84 = functionType10.setValidator(jSTypePredicate83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(functionTypeList45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(typePair79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "()" + "'", str1, "()");
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        boolean boolean17 = node14.isAssign();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.findPropertyType("");
        functionType10.clearCachedValues();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType16 = functionType10.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = functionType10.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType12 = functionType11.toMaybeEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = enumElementType12.toAnnotationString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNull(enumElementType12);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        int int14 = objList10.size();
        com.google.common.collect.ImmutableList<java.lang.Object> objList17 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray18 = objList17.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor19 = objList17.listIterator();
        boolean boolean21 = objList17.contains((java.lang.Object) (short) 10);
        java.lang.Object obj22 = null;
        boolean boolean23 = objList17.equals(obj22);
        java.lang.String str24 = objList17.toString();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node29.addChildrenToBack(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node29.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node29, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean48 = node45.isEquivalentTo(node47);
        int int49 = objList17.lastIndexOf((java.lang.Object) node45);
        int int51 = objList17.lastIndexOf((java.lang.Object) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.Object> objList54 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray55 = objList54.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor56 = objList54.listIterator();
        int int57 = objList54.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor59 = objList54.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(39, node64);
        boolean boolean66 = node65.isIf();
        node65.detachChildren();
        boolean boolean68 = node65.isVoid();
        boolean boolean69 = node65.isNE();
        int int70 = objList54.indexOf((java.lang.Object) node65);
        boolean boolean71 = objList54.isEmpty();
        java.util.Collection[] collectionArray73 = new java.util.Collection[3];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Object>[] objCollectionArray74 = (java.util.Collection<java.lang.Object>[]) collectionArray73;
        objCollectionArray74[0] = objList10;
        objCollectionArray74[1] = objList17;
        objCollectionArray74[2] = objList54;
        com.google.common.collect.ImmutableList<java.util.Collection<java.lang.Object>> objCollectionList81 = com.google.common.collect.ImmutableList.of(objCollectionArray74);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(objList17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[10, 0]" + "'", str24, "[10, 0]");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(objList54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(objItor59);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(collectionArray73);
        org.junit.Assert.assertNotNull(objCollectionArray74);
        org.junit.Assert.assertNotNull(objCollectionList81);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType10.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType12 = objectType11.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        boolean boolean26 = functionType23.isPropertyTypeInferred("JSDocInfo");
        boolean boolean28 = functionType23.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType39.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.getPropertyType("InputId: hi!");
        boolean boolean43 = functionType23.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType39);
        boolean boolean44 = functionType23.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.children();
        boolean boolean53 = node51.isQuotedString();
        com.google.javascript.rhino.Node node54 = node51.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry46.createFunctionType(jSType47, node54);
        boolean boolean56 = functionType55.isArrayType();
        boolean boolean58 = functionType55.isPropertyTypeInferred("JSDocInfo");
        boolean boolean60 = functionType55.hasOwnProperty("");
        com.google.javascript.rhino.Node node61 = functionType55.getParametersNode();
        boolean boolean62 = functionType55.hasCachedValues();
        functionType23.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType55);
        boolean boolean64 = jSType12.equals((java.lang.Object) functionType23);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = functionType23.isSubtype(jSType65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int8 = node7.getSourceOffset();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        node7.addChildrenToBack(node12);
        node7.detachChildren();
        node7.setLineno(16);
        // The following exception was thrown during execution in test generation
        try {
            objList2.add((int) (short) 100, (java.lang.Object) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int7 = node6.getSourceOffset();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.children();
        node6.addChildrenToBack(node11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int18 = node17.getSourceOffset();
        com.google.javascript.rhino.Node node19 = node6.useSourceInfoIfMissingFrom(node17);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node6, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet23 = node22.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable24 = node22.getAncestors();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean29 = node28.hasOneChild();
        node28.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable32 = node28.getAncestors();
        int int33 = node28.getChildCount();
        node22.addChildrenToFront(node28);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int39 = node38.getSourceOffset();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        node38.addChildrenToBack(node43);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int50 = node49.getSourceOffset();
        com.google.javascript.rhino.Node node51 = node38.useSourceInfoIfMissingFrom(node49);
        java.lang.String str52 = node51.toString();
        boolean boolean53 = node51.isThis();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int59 = node58.getSourceOffset();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable64 = node63.children();
        node58.addChildrenToBack(node63);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int70 = node69.getSourceOffset();
        com.google.javascript.rhino.Node node71 = node58.useSourceInfoIfMissingFrom(node69);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(10, node58, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean77 = node74.isEquivalentTo(node76);
        com.google.javascript.rhino.Node[] nodeArray78 = new com.google.javascript.rhino.Node[] { node22, node51, node76 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node> nodeList79 = com.google.common.collect.ImmutableList.copyOf(nodeArray78);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray78, 30, 48);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(39, nodeArray78, 15, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertNotNull(ancestorIterable24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(ancestorIterable32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NUMBER 0.0 36" + "'", str52, "NUMBER 0.0 36");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(nodeIterable64);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(nodeArray78);
        org.junit.Assert.assertNotNull(nodeList79);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        int int8 = node3.getChildCount();
        java.lang.String str9 = node3.toString();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        boolean boolean18 = node16.isQuotedString();
        com.google.javascript.rhino.Node node19 = node16.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry11.createFunctionType(jSType12, node19);
        boolean boolean21 = functionType20.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType20.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType24 = functionType20.toMaybeFunctionType();
        boolean boolean26 = functionType24.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType24.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType24.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType24.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType39);
        boolean boolean41 = functionType24.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType24.getPropertyType("");
        boolean boolean44 = functionType24.isOrdinaryFunction();
        boolean boolean45 = functionType24.matchesNumberContext();
        node3.setJSType((com.google.javascript.rhino.jstype.JSType) functionType24);
        // The following exception was thrown during execution in test generation
        try {
            node3.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "NUMBER 0.0 36" + "'", str9, "NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node22 = node4.getAncestor(51);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags23 = new com.google.javascript.rhino.Node.SideEffectFlags();
        // The following exception was thrown during execution in test generation
        try {
            node22.setSideEffectFlags(sideEffectFlags23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        int int0 = com.google.javascript.rhino.Node.IS_NAMESPACE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 46 + "'", int0 == 46);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.isThis();
        boolean boolean19 = node16.isComma();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = node16.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 36 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "NUMBER 0.0 36" + "'", str17, "NUMBER 0.0 36");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "InputId: hi!", "", "hi!", "[10, 0]" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        int int8 = strSet6.size();
        boolean boolean10 = strSet6.add("false");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        boolean boolean12 = node10.isQuotedString();
        com.google.javascript.rhino.Node node13 = node10.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry5.createFunctionType(jSType6, node13);
        boolean boolean15 = functionType14.isArrayType();
        boolean boolean16 = functionType14.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = functionType14.getOwnSlot("hi!");
        boolean boolean21 = objList2.contains((java.lang.Object) "hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList24 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream25 = objList24.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = objList24.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList27 = objList24.reverse();
        java.lang.Object[] objArray28 = objList27.toArray();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node37.children();
        node32.addChildrenToBack(node37);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int44 = node43.getSourceOffset();
        com.google.javascript.rhino.Node node45 = node32.useSourceInfoIfMissingFrom(node43);
        boolean boolean46 = objList27.contains((java.lang.Object) node45);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = objList2.retainAll((java.util.Collection<java.lang.Object>) objList27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSTypeStaticSlot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objList24);
        org.junit.Assert.assertNotNull(objStream25);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(objList27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0, 10]");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = objList16.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor18 = objList16.listIterator();
        boolean boolean20 = objList16.contains((java.lang.Object) (short) 10);
        java.lang.Object obj21 = null;
        boolean boolean22 = objList16.equals(obj21);
        java.lang.String str23 = objList16.toString();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        node27.setLength(0);
        boolean boolean32 = node27.isScript();
        boolean boolean33 = node27.hasChildren();
        int int34 = objList16.lastIndexOf((java.lang.Object) node27);
        boolean boolean35 = objList10.addAll((java.util.Collection<java.lang.Object>) objList16);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.children();
        boolean boolean42 = node40.isQuotedString();
        node40.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable45 = node40.getAncestors();
        com.google.javascript.rhino.Node node46 = null;
        boolean boolean47 = node40.hasChild(node46);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int53 = node52.getSourceOffset();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        node52.addChildrenToBack(node57);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int64 = node63.getSourceOffset();
        com.google.javascript.rhino.Node node65 = node52.useSourceInfoIfMissingFrom(node63);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node52, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean71 = node68.isEquivalentTo(node70);
        boolean boolean72 = node68.isSwitch();
        com.google.javascript.rhino.InputId inputId74 = new com.google.javascript.rhino.InputId("hi!");
        node68.setInputId(inputId74);
        java.lang.String str76 = inputId74.toString();
        node40.setInputId(inputId74);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj78 = objList16.set(45, (java.lang.Object) node40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[10, 0]" + "'", str23, "[10, 0]");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(ancestorIterable45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "InputId: hi!" + "'", str76, "InputId: hi!");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.util.Spliterator<com.google.javascript.rhino.Node>[] nodeSpliteratorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.util.Spliterator<com.google.javascript.rhino.Node>> nodeSpliteratorList1 = com.google.common.collect.ImmutableList.copyOf(nodeSpliteratorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        boolean boolean3 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean4 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        node14.addChildrenToBack(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node14.useSourceInfoIfMissingFrom(node25);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(10, node14, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean33 = node30.isEquivalentTo(node32);
        int int34 = objList2.lastIndexOf((java.lang.Object) node30);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        boolean boolean44 = node42.isQuotedString();
        com.google.javascript.rhino.Node node45 = node42.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry37.createFunctionType(jSType38, node45);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = functionType46.getParentScope();
        boolean boolean48 = functionType46.isNoResolvedType();
        com.google.javascript.rhino.Node node49 = functionType46.getParametersNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = objList2.set(12, (java.lang.Object) functionType46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.lang.Object[] objArray6 = objList5.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList9 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream10 = objList9.parallelStream();
        com.google.common.collect.UnmodifiableIterator<java.lang.Object> objItor11 = objList9.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = objList5.add((java.lang.Object) objList9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10]");
        org.junit.Assert.assertNotNull(objList9);
        org.junit.Assert.assertNotNull(objStream10);
        org.junit.Assert.assertNotNull(objItor11);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean8 = jSTypeExpression7.isVarArgs();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isIdGenerator();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean7 = jSDocInfo0.isInterface();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        boolean boolean21 = node4.isComma();
        boolean boolean22 = node4.isAssignAdd();
        boolean boolean23 = node4.isQualifiedName();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean28 = node27.hasOneChild();
        node27.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable31 = node27.getAncestors();
        int int32 = node27.getChildCount();
        java.lang.String str33 = node27.toString();
        com.google.javascript.rhino.Node node34 = node4.useSourceInfoIfMissingFromForTree(node27);
        com.google.javascript.rhino.Node node35 = node4.cloneTree();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int40 = node39.getSourceOffset();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        node39.addChildrenToBack(node44);
        boolean boolean47 = node44.isGetElem();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int52 = node51.getSourceOffset();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node56.children();
        node51.addChildrenToBack(node56);
        node51.detachChildren();
        node51.setLineno(16);
        node44.addChildrenToFront(node51);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int67 = node66.getSourceOffset();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable72 = node71.children();
        node66.addChildrenToBack(node71);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int78 = node77.getSourceOffset();
        com.google.javascript.rhino.Node node79 = node66.useSourceInfoIfMissingFrom(node77);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int82 = node66.getIndexOfChild(node81);
        node66.detachChildren();
        boolean boolean84 = node44.isEquivalentToTyped(node66);
        boolean boolean85 = node66.isNoSideEffectsCall();
        boolean boolean86 = node66.isTypeOf();
        com.google.javascript.rhino.Node node88 = node66.getAncestor(44);
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildToBack(node88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(ancestorIterable31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "NUMBER 0.0 36" + "'", str33, "NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(nodeIterable72);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(node88);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "Not declared as a type name");
        boolean boolean7 = node6.isDebugger();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.children();
        boolean boolean13 = node11.isQuotedString();
        node11.setLength(0);
        boolean boolean16 = node11.isLabelName();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean21 = node20.hasOneChild();
        node20.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable24 = node20.getAncestors();
        boolean boolean25 = node20.isNoSideEffectsCall();
        node20.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(2, node6, node11, node20, 15, 0);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int36 = node35.getSourceOffset();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.children();
        node35.addChildrenToBack(node40);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int47 = node46.getSourceOffset();
        com.google.javascript.rhino.Node node48 = node35.useSourceInfoIfMissingFrom(node46);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(10, node35, 49, (int) (short) 100);
        boolean boolean52 = node35.isComma();
        boolean boolean53 = node35.isAssignAdd();
        boolean boolean54 = node35.isQualifiedName();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean59 = node58.hasOneChild();
        node58.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable62 = node58.getAncestors();
        int int63 = node58.getChildCount();
        java.lang.String str64 = node58.toString();
        com.google.javascript.rhino.Node node65 = node35.useSourceInfoIfMissingFromForTree(node58);
        com.google.javascript.rhino.Node node66 = node35.cloneTree();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(100, node2, node30, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(ancestorIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(ancestorIterable62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "NUMBER 0.0 36" + "'", str64, "NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node66);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = objList16.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor18 = objList16.listIterator();
        boolean boolean20 = objList16.contains((java.lang.Object) (short) 10);
        java.lang.Object obj21 = null;
        boolean boolean22 = objList16.equals(obj21);
        java.lang.String str23 = objList16.toString();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        node27.setLength(0);
        boolean boolean32 = node27.isScript();
        boolean boolean33 = node27.hasChildren();
        int int34 = objList16.lastIndexOf((java.lang.Object) node27);
        boolean boolean35 = objList10.addAll((java.util.Collection<java.lang.Object>) objList16);
        com.google.common.collect.ImmutableList<java.lang.Object> objList38 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray39 = objList38.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor40 = objList38.listIterator();
        boolean boolean42 = objList38.contains((java.lang.Object) (short) 10);
        java.lang.Object obj43 = null;
        boolean boolean44 = objList38.equals(obj43);
        com.google.common.collect.ImmutableList<java.lang.Object> objList47 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray48 = objList47.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor49 = objList47.listIterator();
        int int50 = objList47.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor52 = objList47.listIterator((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Object> objList55 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray56 = objList55.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor57 = objList55.listIterator();
        int int58 = objList55.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor60 = objList55.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(39, node65);
        boolean boolean67 = node66.isIf();
        node66.detachChildren();
        boolean boolean69 = node66.isVoid();
        boolean boolean70 = node66.isNE();
        int int71 = objList55.indexOf((java.lang.Object) node66);
        boolean boolean72 = objList55.isEmpty();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Object>> objListList73 = com.google.common.collect.ImmutableList.of(objList16, objList38, objList47, objList55);
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean75 = jSDocInfo74.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression76 = jSDocInfo74.getEnumParameterType();
        boolean boolean77 = jSDocInfo74.isExterns();
        boolean boolean78 = jSDocInfo74.hasThisType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = objList38.add((java.lang.Object) jSDocInfo74);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[10, 0]" + "'", str23, "[10, 0]");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objList38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objList47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(objItor52);
        org.junit.Assert.assertNotNull(objList55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(objItor60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objListList73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(jSTypeExpression76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(38);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        boolean boolean14 = node12.isQuotedString();
        com.google.javascript.rhino.Node node15 = node12.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry7.createFunctionType(jSType8, node15);
        boolean boolean18 = functionType16.isPropertyTypeDeclared("");
        boolean boolean19 = functionType16.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.children();
        boolean boolean28 = node26.isQuotedString();
        com.google.javascript.rhino.Node node29 = node26.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry21.createFunctionType(jSType22, node29);
        boolean boolean31 = functionType30.isArrayType();
        boolean boolean32 = functionType30.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType33 = functionType30.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable34 = functionType30.getAllImplementedInterfaces();
        functionType16.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType30);
        boolean boolean36 = functionType30.hasInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = objList4.set(15, (java.lang.Object) boolean36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNotNull(objectTypeIterable34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = objList16.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor18 = objList16.listIterator();
        boolean boolean20 = objList16.contains((java.lang.Object) (short) 10);
        java.lang.Object obj21 = null;
        boolean boolean22 = objList16.equals(obj21);
        java.lang.String str23 = objList16.toString();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        node27.setLength(0);
        boolean boolean32 = node27.isScript();
        boolean boolean33 = node27.hasChildren();
        int int34 = objList16.lastIndexOf((java.lang.Object) node27);
        boolean boolean35 = objList10.addAll((java.util.Collection<java.lang.Object>) objList16);
        com.google.common.collect.ImmutableList<java.lang.Object> objList38 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray39 = objList38.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor40 = objList38.listIterator();
        boolean boolean42 = objList38.contains((java.lang.Object) (short) 10);
        java.lang.Object obj43 = null;
        boolean boolean44 = objList38.equals(obj43);
        java.lang.String str45 = objList38.toString();
        java.lang.Object[] objArray55 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList56, objArray55);
        java.lang.Object[] objArray58 = objList56.toArray();
        java.util.stream.Stream<java.lang.Object> objStream59 = objList56.parallelStream();
        int int60 = objList56.size();
        boolean boolean61 = objList38.containsAll((java.util.Collection<java.lang.Object>) objList56);
        java.util.ListIterator<java.lang.Object> objItor62 = objList38.listIterator();
        boolean boolean63 = objList10.removeAll((java.util.Collection<java.lang.Object>) objList38);
        com.google.common.collect.ImmutableList<java.lang.Object> objList67 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray87 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList88 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList88, objArray87);
        boolean boolean91 = objList88.add((java.lang.Object) 100.0d);
        com.google.javascript.rhino.Node node95 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable96 = node95.children();
        boolean boolean97 = objList88.contains((java.lang.Object) nodeIterable96);
        boolean boolean98 = objList38.containsAll((java.util.Collection<java.lang.Object>) objList88);
        java.lang.Object[] objArray99 = objList38.toArray();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[10, 0]" + "'", str23, "[10, 0]");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objList38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[10, 0]" + "'", str45, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objItor62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(objList67);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertNotNull(nodeIterable96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(objArray99);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray99), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray99), "[10, 0]");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList20 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList20, objArray19);
        java.lang.Object[] objArray22 = objList20.toArray();
        java.util.stream.Stream<java.lang.Object> objStream23 = objList20.parallelStream();
        int int24 = objList20.size();
        boolean boolean25 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList20);
        java.util.ListIterator<java.lang.Object> objItor26 = objList2.listIterator();
        java.util.stream.Stream<java.lang.Object> objStream27 = objList2.stream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList30 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream31 = objList30.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList32 = objList30.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList33 = objList30.reverse();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = objList2.addAll((java.util.Collection<java.lang.Object>) objList30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objItor26);
        org.junit.Assert.assertNotNull(objStream27);
        org.junit.Assert.assertNotNull(objList30);
        org.junit.Assert.assertNotNull(objStream31);
        org.junit.Assert.assertNotNull(objList32);
        org.junit.Assert.assertNotNull(objList33);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean16 = objList10.equals((java.lang.Object) (byte) 0);
        int int17 = objList10.size();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType10.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList28 = functionType26.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType39.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] { functionType26, functionType39 };
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry15.createUnionType(jSTypeArray41);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int47 = node46.getSourceOffset();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.children();
        node46.addChildrenToBack(node51);
        boolean boolean54 = node51.isGetElem();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int59 = node58.getSourceOffset();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable64 = node63.children();
        node58.addChildrenToBack(node63);
        node58.detachChildren();
        node58.setLineno(16);
        node51.addChildrenToFront(node58);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int74 = node73.getSourceOffset();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable79 = node78.children();
        node73.addChildrenToBack(node78);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int85 = node84.getSourceOffset();
        com.google.javascript.rhino.Node node86 = node73.useSourceInfoIfMissingFrom(node84);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int89 = node73.getIndexOfChild(node88);
        node73.detachChildren();
        boolean boolean91 = node51.isEquivalentToTyped(node73);
        boolean boolean92 = node73.isNoSideEffectsCall();
        boolean boolean93 = node73.isTypeOf();
        boolean boolean94 = functionType10.defineInferredProperty("", jSType42, node73);
        boolean boolean95 = node73.isEmpty();
        boolean boolean96 = node73.isNull();
        boolean boolean97 = node73.isVarArgs();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(functionTypeList28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(nodeIterable64);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(nodeIterable79);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.String str7 = objList6.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objList2.retainAll((java.util.Collection<java.lang.Object>) objList6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[10, 0]" + "'", str7, "[10, 0]");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        java.lang.String str31 = functionType29.getDisplayName();
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = functionType29.isSubtype(jSType32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList45 = functionType43.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { functionType43, functionType56 };
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry32.createUnionType(jSTypeArray58);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope60 = null;
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry32.getType(jSTypeStaticScope60, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable73 = node72.children();
        boolean boolean74 = node72.isQuotedString();
        com.google.javascript.rhino.Node node75 = node72.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry67.createFunctionType(jSType68, node75);
        boolean boolean77 = functionType76.isArrayType();
        boolean boolean78 = jSType65.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue79 = functionType26.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue80 = ternaryValue79.not();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(functionTypeList45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(nodeIterable73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(ternaryValue79);
        org.junit.Assert.assertNotNull(ternaryValue80);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        node14.addChildrenToBack(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node14.useSourceInfoIfMissingFrom(node25);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(10, node14, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean33 = node30.isEquivalentTo(node32);
        int int34 = objList2.lastIndexOf((java.lang.Object) node30);
        int int36 = objList2.lastIndexOf((java.lang.Object) (byte) 100);
        com.google.common.collect.ImmutableList<java.lang.Object> objList39 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream40 = objList39.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = objList2.removeAll((java.util.Collection<java.lang.Object>) objList39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objList39);
        org.junit.Assert.assertNotNull(objStream40);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        node3.setLineno(9);
        node3.putProp(53, (java.lang.Object) 12);
        boolean boolean9 = node3.isNot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = node3.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 9 [input_id: 12] is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean5 = jSDocInfo1.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getModifies();
        boolean boolean8 = jSDocInfo1.containsDeclaration();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.children();
        boolean boolean6 = node4.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = new com.google.javascript.rhino.JSTypeExpression(node4, "hi!");
        boolean boolean9 = node4.isCatch();
        java.lang.String str10 = node4.getQualifiedName();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean16 = node15.hasOneChild();
        node15.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable19 = node15.getAncestors();
        int int20 = node15.getChildCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(49, node4, node11, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ancestorIterable19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int19 = node3.getIndexOfChild(node18);
        node3.detachChildren();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int25 = node24.getSourceOffset();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node29.children();
        node24.addChildrenToBack(node29);
        boolean boolean32 = node3.isEquivalentTo(node24);
        java.lang.Appendable appendable33 = null;
        // The following exception was thrown during execution in test generation
        try {
            node24.appendStringTree(appendable33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        node3.detachChildren();
        node3.setLineno(16);
        boolean boolean14 = node3.isSwitch();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(39, node19);
        boolean boolean21 = node20.isIf();
        node20.detachChildren();
        boolean boolean23 = node3.hasChild(node20);
        boolean boolean24 = node3.isDebugger();
        boolean boolean25 = node3.isFalse();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo26 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getAllImplementedInterfaces();
        java.lang.String str15 = functionType10.getReferenceName();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = functionType10.getPossibleToBooleanOutcomes();
        boolean boolean17 = functionType10.canBeCalled();
        java.util.Set<java.lang.String> strSet18 = functionType10.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType29.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet31 = functionType29.getPossibleToBooleanOutcomes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = functionType29.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType29.getParameterType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = functionType10.differsFrom(jSType33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet31 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet31.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable32);
        org.junit.Assert.assertNull(jSType33);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable8 = node3.getAncestors();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = node3.hasChild(node9);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        boolean boolean16 = node14.isQuotedString();
        node14.setLength(0);
        boolean boolean19 = node14.isLabelName();
        com.google.javascript.rhino.Node node20 = node3.srcrefTree(node14);
        boolean boolean21 = node3.isDebugger();
        int int22 = node3.getType();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ancestorIterable8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 39 + "'", int22 == 39);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType10.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType12 = objectType11.collapseUnion();
        com.google.javascript.rhino.jstype.ObjectType.Property property14 = objectType11.getSlot("");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        boolean boolean20 = node18.isQuotedString();
        node18.setLength(0);
        boolean boolean23 = node18.isVar();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean28 = node27.hasOneChild();
        node18.addChildToBack(node27);
        node18.setType(49);
        boolean boolean32 = objectType11.equals((java.lang.Object) 49);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        com.google.javascript.rhino.Node node44 = node41.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry36.createFunctionType(jSType37, node44);
        boolean boolean46 = functionType45.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList47 = functionType45.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node54.children();
        boolean boolean56 = node54.isQuotedString();
        com.google.javascript.rhino.Node node57 = node54.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry49.createFunctionType(jSType50, node57);
        boolean boolean59 = functionType58.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] { functionType45, functionType58 };
        com.google.javascript.rhino.jstype.JSType jSType61 = jSTypeRegistry34.createUnionType(jSTypeArray60);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope62 = null;
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry34.getType(jSTypeStaticScope62, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        boolean boolean68 = jSType67.isStringValueType();
        java.lang.String str69 = jSType67.getDisplayName();
        com.google.javascript.rhino.jstype.JSType jSType70 = objectType11.getLeastSupertype(jSType67);
        com.google.javascript.rhino.jstype.UnionType unionType71 = jSType67.toMaybeUnionType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertNull(property14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(functionTypeList47);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "[10, 0]" + "'", str69, "[10, 0]");
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertNull(unionType71);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.lang.String str25 = functionType23.toAnnotationString();
        boolean boolean26 = functionType23.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType23, "NUMBER 0.0 36");
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType39.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType39.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.common.collect.ImmutableList<java.lang.Object> objList48 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray49 = objList48.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor50 = objList48.listIterator();
        boolean boolean52 = objList48.contains((java.lang.Object) (short) 10);
        java.lang.Object obj53 = null;
        boolean boolean54 = objList48.equals(obj53);
        java.lang.String str55 = objList48.toString();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int61 = node60.getSourceOffset();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable66 = node65.children();
        node60.addChildrenToBack(node65);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int72 = node71.getSourceOffset();
        com.google.javascript.rhino.Node node73 = node60.useSourceInfoIfMissingFrom(node71);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(10, node60, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean79 = node76.isEquivalentTo(node78);
        int int80 = objList48.lastIndexOf((java.lang.Object) node76);
        int int81 = node76.getSourceOffset();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable82 = node76.children();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry1.createInterfaceType("Unknown class name", node76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (...[?]): ?" + "'", str25, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(objList48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[10, 0]" + "'", str55, "[10, 0]");
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeIterable66);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(nodeIterable82);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        boolean boolean14 = node12.isQuotedString();
        com.google.javascript.rhino.Node node15 = node12.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry7.createFunctionType(jSType8, node15);
        boolean boolean17 = functionType16.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType16.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType20 = functionType16.toMaybeFunctionType();
        boolean boolean22 = functionType20.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType20.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType20.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.children();
        boolean boolean33 = node31.isQuotedString();
        com.google.javascript.rhino.Node node34 = node31.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry26.createFunctionType(jSType27, node34);
        boolean boolean36 = functionType20.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType35);
        boolean boolean37 = functionType20.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType20.getPropertyType("");
        boolean boolean40 = functionType20.isOrdinaryFunction();
        boolean boolean41 = functionType20.matchesNumberContext();
        boolean boolean42 = functionType20.hasCachedValues();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = objList5.add((java.lang.Object) functionType20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNull(jSType24);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setMutatesThis();
        sideEffectFlags0.setMutatesThis();
        sideEffectFlags0.clearAllFlags();
        sideEffectFlags0.clearAllFlags();
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        node6.setLength(0);
        boolean boolean11 = node6.isVar();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean16 = node15.hasOneChild();
        node6.addChildToBack(node15);
        boolean boolean18 = node15.isInc();
        node15.addSuppression("false");
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        com.google.javascript.rhino.Node node30 = node27.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry22.createFunctionType(jSType23, node30);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry22.getType("");
        boolean boolean35 = jSTypeRegistry22.hasNamespace("InputId: hi!");
        com.google.javascript.rhino.jstype.JSType jSType36 = assertionFunctionSpec2.getAssertedType(node15, jSTypeRegistry22);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        boolean boolean50 = functionType47.isPropertyTypeInferred("JSDocInfo");
        boolean boolean52 = functionType47.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = node59.children();
        boolean boolean61 = node59.isQuotedString();
        com.google.javascript.rhino.Node node62 = node59.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry54.createFunctionType(jSType55, node62);
        boolean boolean64 = functionType63.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType63.getPropertyType("InputId: hi!");
        boolean boolean67 = functionType47.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType63);
        boolean boolean68 = functionType63.hasReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable76 = node75.children();
        boolean boolean77 = node75.isQuotedString();
        com.google.javascript.rhino.Node node78 = node75.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry70.createFunctionType(jSType71, node78);
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry70.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82);
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable89 = node88.children();
        boolean boolean90 = node88.isQuotedString();
        com.google.javascript.rhino.Node node91 = node88.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry83.createFunctionType(jSType84, node91);
        boolean boolean93 = functionType92.isArrayType();
        java.lang.String str94 = functionType92.toAnnotationString();
        boolean boolean95 = functionType92.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType97 = jSTypeRegistry70.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType92, "NUMBER 0.0 36");
        boolean boolean98 = jSType97.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType99 = jSTypeRegistry22.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType63, jSType97);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(nodeIterable76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertNull(jSType81);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(nodeIterable89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(node91);
        org.junit.Assert.assertNotNull(functionType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "function (...[?]): ?" + "'", str94, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(jSType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(parameterizedType99);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.String str3 = objList2.toString();
        // The following exception was thrown during execution in test generation
        try {
            objList2.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10, 0]" + "'", str3, "[10, 0]");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getAllImplementedInterfaces();
        boolean boolean15 = functionType10.isNativeObjectType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType16 = functionType10.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType10.getOwnSlot("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType27.restrictByNotNullOrUndefined();
        boolean boolean30 = jSType29.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList45 = functionType43.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { functionType43, functionType56 };
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry32.createUnionType(jSTypeArray58);
        boolean boolean60 = jSType59.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        boolean boolean69 = node67.isQuotedString();
        com.google.javascript.rhino.Node node70 = node67.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry62.createFunctionType(jSType63, node70);
        boolean boolean72 = functionType71.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType71.toMaybeFunctionType();
        boolean boolean76 = functionType71.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType77 = jSType59.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean78 = jSType29.canAssignTo(jSType77);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair79 = functionType10.getTypesUnderShallowInequality(jSType29);
        boolean boolean80 = functionType10.matchesObjectContext();
        int int81 = functionType10.getPropertiesCount();
        boolean boolean82 = functionType10.hasCachedValues();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(functionTypeList45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(typePair79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        com.google.javascript.rhino.Node node44 = node41.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry36.createFunctionType(jSType37, node44);
        boolean boolean46 = functionType45.isArrayType();
        boolean boolean47 = jSType34.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = functionType45.getJSDocInfo();
        boolean boolean49 = functionType45.matchesStringContext();
        java.lang.Class<?> wildcardClass50 = functionType45.getClass();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(jSDocInfo48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean23 = node20.isEquivalentTo(node22);
        boolean boolean24 = node20.isSwitch();
        com.google.javascript.rhino.InputId inputId26 = new com.google.javascript.rhino.InputId("hi!");
        node20.setInputId(inputId26);
        java.lang.String str28 = inputId26.toString();
        java.lang.String str29 = inputId26.getIdName();
        java.lang.String str30 = inputId26.toString();
        com.google.common.collect.ImmutableList<java.lang.Object> objList33 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray34 = objList33.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor35 = objList33.listIterator();
        boolean boolean37 = objList33.contains((java.lang.Object) (short) 10);
        java.lang.Object obj38 = null;
        boolean boolean39 = objList33.equals(obj38);
        java.lang.String str40 = objList33.toString();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        node44.setLength(0);
        boolean boolean49 = node44.isScript();
        boolean boolean50 = node44.hasChildren();
        int int51 = objList33.lastIndexOf((java.lang.Object) node44);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile52 = node44.getStaticSourceFile();
        boolean boolean53 = inputId26.equals((java.lang.Object) staticSourceFile52);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "InputId: hi!" + "'", str28, "InputId: hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "InputId: hi!" + "'", str30, "InputId: hi!");
        org.junit.Assert.assertNotNull(objList33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[10, 0]" + "'", str40, "[10, 0]");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(staticSourceFile52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean15 = functionType14.isNullable();
        java.util.Set<java.lang.String> strSet16 = functionType14.getOwnPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = strSet16.add("function ({1839678788}): {1839678788}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int19 = node3.getIndexOfChild(node18);
        boolean boolean20 = node18.isIf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList25 = com.google.common.collect.ImmutableList.of(jSDocInfo21, jSDocInfo22, jSDocInfo23, jSDocInfo24);
        boolean boolean27 = jSDocInfo23.hasParameterType("hi!");
        boolean boolean28 = jSDocInfo23.hasReturnType();
        boolean boolean29 = jSDocInfo23.hasModifies();
        java.util.Set<java.lang.String> strSet30 = jSDocInfo23.getParameterNames();
        int int31 = strSet30.size();
        node18.setDirectives(strSet30);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = strSet30.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.hasModifies();
        boolean boolean10 = jSDocInfo2.hasParameter("java.io.IOException: ");
        boolean boolean11 = jSDocInfo2.isNoAlias();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.isGetElem();
        int int12 = node8.getType();
        com.google.javascript.rhino.jstype.JSType jSType13 = node8.getJSType();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        node18.setSourceFileForTesting("[10, 0]");
        node18.setVarArgs(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        node27.setLength(0);
        boolean boolean32 = node27.isVar();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int37 = node36.getSourceOffset();
        boolean boolean38 = node36.isDo();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int43 = node42.getSourceOffset();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        node42.addChildrenToBack(node47);
        node42.detachChildren();
        node42.setLineno(16);
        boolean boolean53 = node42.isSwitch();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(39, node58);
        boolean boolean60 = node59.isIf();
        node59.detachChildren();
        boolean boolean62 = node42.hasChild(node59);
        boolean boolean63 = node42.isDebugger();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(52, node18, node27, node36, node42, (int) '#', (-1));
        com.google.javascript.rhino.Node node67 = node8.copyInformationFromForTree(node18);
        boolean boolean68 = node67.isGetProp();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 39 + "'", int12 == 39);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.children();
        boolean boolean6 = node4.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = new com.google.javascript.rhino.JSTypeExpression(node4, "hi!");
        boolean boolean9 = node4.isCatch();
        java.lang.String str10 = node4.getQualifiedName();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("{1936444324}", (int) ' ', (int) (short) 1);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship15 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node4, node14);
        // The following exception was thrown during execution in test generation
        try {
            node14.setSideEffectFlags(43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "Unknown class name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean15 = functionType14.isNullable();
        java.util.Set<java.lang.String> strSet16 = functionType14.getOwnPropertyNames();
        java.util.Spliterator<java.lang.String> strSpliterator17 = strSet16.spliterator();
        java.util.Iterator<java.lang.String> strItor18 = strSet16.iterator();
        boolean boolean19 = strItor18.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strItor18.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        boolean boolean36 = jSTypeRegistry1.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        boolean boolean50 = functionType47.isPropertyTypeInferred("JSDocInfo");
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        boolean boolean59 = node57.isQuotedString();
        com.google.javascript.rhino.Node node60 = node57.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry52.createFunctionType(jSType53, node60);
        boolean boolean62 = functionType61.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType64 = functionType61.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType65 = functionType61.toMaybeFunctionType();
        boolean boolean66 = functionType61.isNominalType();
        boolean boolean67 = functionType61.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry1.createFunctionTypeWithNewReturnType(functionType47, (com.google.javascript.rhino.jstype.JSType) functionType61);
        java.lang.String[] strArray95 = new java.lang.String[] { "()", "function ({1976643146}): {1976643146}", "NUMBER 0.0 36", "function (...[?]): ?", "[10, 0]", "java.io.IOException: ", "Unknown class name", "function ({1012611201}): {1012611201}", "{671747480}", "NUMBER 0.0 36\n", "false", "Node tree inequality:\nTree1:\nNUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nTree2:\nSTRING {1936444324} 32\n\n\nSubtree1: NUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nSubtree2: STRING {1936444324} 32\n", "function ({1265812580}): {1265812580}", "function ({1265812580}): {1265812580}", "function ({1265812580}): {1265812580}", "()", "Unknown class name", "{1936444324}", "java.io.IOException: ", "NUMBER 0.0 36\n", "[10, 0]", "function ({2062255495}): {2062255495}", "java.io.IOException: ", "NUMBER 0.0 36 [input_id: InputId: hi!]", "Node tree inequality:\nTree1:\nNUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nTree2:\nSTRING {1936444324} 32\n\n\nSubtree1: NUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nSubtree2: STRING {1936444324} 32\n", "{1936444324}" };
        java.util.ArrayList<java.lang.String> strList96 = new java.util.ArrayList<java.lang.String>();
        boolean boolean97 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList96, strArray95);
        jSTypeRegistry1.setTemplateTypeNames((java.util.List<java.lang.String>) strList96);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("java.io.IOException: ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor7 = objList2.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(39, node12);
        boolean boolean14 = node13.isIf();
        node13.detachChildren();
        boolean boolean16 = node13.isVoid();
        boolean boolean17 = node13.isNE();
        int int18 = objList2.indexOf((java.lang.Object) node13);
        boolean boolean19 = objList2.isEmpty();
        int int20 = objList2.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = objList2.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        node3.setIsSyntheticBlock(false);
        node3.setOptionalArg(true);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.children();
        boolean boolean6 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int12 = node11.getSourceOffset();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        node11.addChildrenToBack(node16);
        node11.detachChildren();
        boolean boolean20 = node11.isOr();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean25 = node24.hasOneChild();
        node24.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable28 = node24.getAncestors();
        int int29 = node24.getChildCount();
        node24.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node32 = node11.copyInformationFrom(node24);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean37 = node36.hasOneChild();
        boolean boolean38 = node36.isOnlyModifiesThisCall();
        boolean boolean39 = node36.isLabel();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(39, node44);
        boolean boolean46 = node45.isIf();
        node45.detachChildren();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((int) (short) 0, node11, node36, node45);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int54 = node53.getSourceOffset();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node58.children();
        node53.addChildrenToBack(node58);
        node53.detachChildren();
        boolean boolean62 = node53.isOr();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean67 = node66.hasOneChild();
        node66.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable70 = node66.getAncestors();
        int int71 = node66.getChildCount();
        node66.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node74 = node53.copyInformationFrom(node66);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean79 = node78.hasOneChild();
        boolean boolean80 = node78.isOnlyModifiesThisCall();
        boolean boolean81 = node78.isLabel();
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(39, node86);
        boolean boolean88 = node87.isIf();
        node87.detachChildren();
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node((int) (short) 0, node53, node78, node87);
        node90.addSuppression("java.io.IOException: ");
        boolean boolean93 = node90.isVarArgs();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node96 = new com.google.javascript.rhino.Node(50, node4, node36, node90, 36, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(ancestorIterable28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(ancestorIterable70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet21 = node20.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable22 = node20.getAncestors();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean27 = node26.hasOneChild();
        node26.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable30 = node26.getAncestors();
        int int31 = node26.getChildCount();
        node20.addChildrenToFront(node26);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        boolean boolean38 = node36.isQuotedString();
        node36.setLength(0);
        boolean boolean41 = node36.isVar();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean46 = node45.hasOneChild();
        node36.addChildToBack(node45);
        node45.detachChildren();
        boolean boolean49 = node26.isEquivalentTo(node45);
        double double50 = node45.getDouble();
        com.google.javascript.rhino.Node node51 = node45.cloneNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo52 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(ancestorIterable22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ancestorIterable30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        com.google.common.collect.ImmutableList<java.lang.Object> objList3 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray23 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList24 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList24, objArray23);
        boolean boolean27 = objList24.add((java.lang.Object) 100.0d);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.children();
        boolean boolean33 = objList24.contains((java.lang.Object) nodeIterable32);
        java.lang.Object[] objArray34 = objList24.toArray();
        java.lang.Object[] objArray35 = objList24.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = objList24.get(49);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 49, Size: 22");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList3);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        java.lang.String str5 = node3.getQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        node9.detachChildren();
        node9.setLineno(16);
        boolean boolean20 = node9.isSwitch();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(39, node25);
        boolean boolean27 = node26.isIf();
        node26.detachChildren();
        boolean boolean29 = node9.hasChild(node26);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = null;
        node9.setStaticSourceFile(staticSourceFile30);
        int int32 = node3.getIndexOfChild(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = node3.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 36 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        boolean boolean14 = functionType10.isPropertyTypeDeclared("InputId: hi!");
        java.lang.String str15 = functionType10.toDebugHashCodeString();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType26.toMaybeFunctionType();
        com.google.javascript.rhino.Node node31 = functionType26.getRootNode();
        boolean boolean32 = functionType26.matchesStringContext();
        com.google.javascript.rhino.Node node34 = functionType26.getPropertyNode("{1936444324}");
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        com.google.javascript.rhino.Node node44 = node41.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry36.createFunctionType(jSType37, node44);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = functionType45.getParentScope();
        boolean boolean47 = functionType45.isCheckedUnknownType();
        boolean boolean48 = functionType45.matchesNumberContext();
        com.google.javascript.rhino.jstype.EnumType enumType49 = functionType45.toMaybeEnumType();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node56.children();
        boolean boolean58 = node56.isQuotedString();
        com.google.javascript.rhino.Node node59 = node56.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry51.createFunctionType(jSType52, node59);
        boolean boolean61 = functionType60.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = functionType60.getPossibleToBooleanOutcomes();
        boolean boolean63 = functionType60.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable71 = node70.children();
        boolean boolean72 = node70.isQuotedString();
        com.google.javascript.rhino.Node node73 = node70.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry65.createFunctionType(jSType66, node73);
        boolean boolean75 = functionType74.isArrayType();
        boolean boolean77 = functionType74.isPropertyTypeInferred("JSDocInfo");
        boolean boolean79 = functionType74.hasOwnProperty("");
        com.google.javascript.rhino.Node node80 = functionType74.getParametersNode();
        boolean boolean81 = functionType74.hasCachedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = functionType74.getParentScope();
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray83 = new com.google.javascript.rhino.jstype.ObjectType[] { functionType26, enumType49, functionType60, functionType74 };
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList84 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList84, objectTypeArray83);
        // The following exception was thrown during execution in test generation
        try {
            functionType10.setImplementedInterfaces((java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "function ({762283835}): {762283835}" + "'", str15, "function ({762283835}): {762283835}");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(enumType49);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(nodeIterable71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(objectTypeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int9 = node8.getSourceOffset();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.children();
        node8.addChildrenToBack(node13);
        node8.detachChildren();
        boolean boolean17 = node8.isOr();
        com.google.javascript.rhino.Node node18 = node3.copyInformationFrom(node8);
        boolean boolean19 = node8.isNE();
        node8.setLength(0);
        boolean boolean22 = node8.isDec();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        node3.detachChildren();
        node3.setLineno(16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(39, node18);
        boolean boolean20 = node19.isIf();
        node19.detachChildren();
        boolean boolean22 = node19.isVoid();
        com.google.javascript.rhino.Node node23 = node3.useSourceInfoIfMissingFrom(node19);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        java.lang.String str29 = node27.getQualifiedName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int34 = node33.getSourceOffset();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        node33.addChildrenToBack(node38);
        node33.detachChildren();
        node33.setLineno(16);
        boolean boolean44 = node33.isSwitch();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(39, node49);
        boolean boolean51 = node50.isIf();
        node50.detachChildren();
        boolean boolean53 = node33.hasChild(node50);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile54 = null;
        node33.setStaticSourceFile(staticSourceFile54);
        int int56 = node27.getIndexOfChild(node33);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node57 = node3.getChildBefore(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Object> objList16 = objList10.subList(41, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor7 = objList2.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(39, node12);
        boolean boolean14 = node13.isIf();
        node13.detachChildren();
        boolean boolean16 = node13.isVoid();
        boolean boolean17 = node13.isNE();
        int int18 = objList2.indexOf((java.lang.Object) node13);
        boolean boolean19 = objList2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            objList2.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType26.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType26.unboxesTo();
        boolean boolean33 = functionType26.isInterface();
        boolean boolean35 = functionType26.isPropertyInExterns("NUMBER 0.0 36\n");
        java.util.Set<java.lang.String> strSet36 = functionType26.getPropertyNames();
        java.lang.String str37 = functionType26.toDebugHashCodeString();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = node45.children();
        boolean boolean47 = node45.isQuotedString();
        com.google.javascript.rhino.Node node48 = node45.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry40.createFunctionType(jSType41, node48);
        boolean boolean50 = functionType49.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType51 = functionType49.restrictByNotNullOrUndefined();
        boolean boolean52 = jSType51.isNoResolvedType();
        boolean boolean53 = jSType51.isInstanceType();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int58 = node57.getSourceOffset();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable63 = node62.children();
        node57.addChildrenToBack(node62);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int69 = node68.getSourceOffset();
        com.google.javascript.rhino.Node node70 = node57.useSourceInfoIfMissingFrom(node68);
        boolean boolean71 = functionType26.defineDeclaredProperty("false", jSType51, node68);
        boolean boolean72 = functionType26.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strSet36);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "function ({1160807699}): {1160807699}" + "'", str37, "function ({1160807699}): {1160807699}");
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(nodeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(nodeIterable63);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        java.lang.String str5 = jSDocInfo1.getDeprecationReason();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node3 = node1.getAncestor(47);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node7.children();
        boolean boolean9 = node7.isEmpty();
        node7.detachChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = node3.isEquivalentTo(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean23 = node20.isEquivalentTo(node22);
        boolean boolean24 = node20.isSwitch();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile25 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node20);
        java.lang.Object obj27 = node20.getProp(54);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node37.children();
        node32.addChildrenToBack(node37);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int44 = node43.getSourceOffset();
        com.google.javascript.rhino.Node node45 = node32.useSourceInfoIfMissingFrom(node43);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node32, 49, (int) (short) 100);
        boolean boolean49 = node32.isComma();
        boolean boolean50 = node32.isAssignAdd();
        boolean boolean51 = node32.isQualifiedName();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean56 = node55.hasOneChild();
        node55.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable59 = node55.getAncestors();
        int int60 = node55.getChildCount();
        java.lang.String str61 = node55.toString();
        com.google.javascript.rhino.Node node62 = node32.useSourceInfoIfMissingFromForTree(node55);
        com.google.javascript.rhino.Node node63 = node32.cloneTree();
        boolean boolean64 = node63.isFromExterns();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 10);
        // The following exception was thrown during execution in test generation
        try {
            node20.replaceChild(node63, node66);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(staticSourceFile25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(ancestorIterable59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "NUMBER 0.0 36" + "'", str61, "NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node66);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setMutatesThis();
        sideEffectFlags0.setAllFlags();
        boolean boolean3 = sideEffectFlags0.areAllFlagsSet();
        sideEffectFlags0.clearAllFlags();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator6 = objList2.spliterator();
        java.util.Spliterator<java.lang.Object> objSpliterator7 = objList2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = objList2.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objSpliterator6);
        org.junit.Assert.assertNotNull(objSpliterator7);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        boolean boolean5 = node4.isThrow();
        com.google.common.collect.ImmutableList<java.lang.Object> objList8 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray9 = objList8.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor10 = objList8.listIterator();
        boolean boolean12 = objList8.contains((java.lang.Object) (short) 10);
        java.lang.Object obj13 = null;
        boolean boolean14 = objList8.equals(obj13);
        java.lang.String str15 = objList8.toString();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int21 = node20.getSourceOffset();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        node20.addChildrenToBack(node25);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int32 = node31.getSourceOffset();
        com.google.javascript.rhino.Node node33 = node20.useSourceInfoIfMissingFrom(node31);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(10, node20, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean39 = node36.isEquivalentTo(node38);
        int int40 = objList8.lastIndexOf((java.lang.Object) node36);
        com.google.javascript.rhino.Node node41 = node36.cloneNode();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int46 = node45.getSourceOffset();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node50.children();
        node45.addChildrenToBack(node50);
        node45.detachChildren();
        node45.setLineno(16);
        boolean boolean56 = node45.isSwitch();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int62 = node61.getSourceOffset();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable67 = node66.children();
        node61.addChildrenToBack(node66);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int73 = node72.getSourceOffset();
        com.google.javascript.rhino.Node node74 = node61.useSourceInfoIfMissingFrom(node72);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(10, node61, 49, (int) (short) 100);
        boolean boolean78 = node61.isComma();
        boolean boolean79 = node61.isAssignAdd();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean84 = node83.hasOneChild();
        node83.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable87 = node83.getAncestors();
        int int88 = node83.getChildCount();
        com.google.javascript.rhino.Node node89 = node61.srcref(node83);
        boolean boolean90 = node61.isGetElem();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node((-1), node4, node41, node45, node61, 46, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objList8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[10, 0]" + "'", str15, "[10, 0]");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeIterable51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(nodeIterable67);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(ancestorIterable87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType10.restrictByNotNullOrUndefined();
        boolean boolean13 = jSType12.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList28 = functionType26.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType39.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] { functionType26, functionType39 };
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry15.createUnionType(jSTypeArray41);
        boolean boolean43 = jSType42.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node50.children();
        boolean boolean52 = node50.isQuotedString();
        com.google.javascript.rhino.Node node53 = node50.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry45.createFunctionType(jSType46, node53);
        boolean boolean55 = functionType54.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType54.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType58 = functionType54.toMaybeFunctionType();
        boolean boolean59 = functionType54.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType60 = jSType42.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType54);
        boolean boolean61 = jSType12.canAssignTo(jSType60);
        boolean boolean62 = jSType12.isTemplateType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(functionTypeList28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeIterable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        node16.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(39, node23);
        com.google.javascript.rhino.Node node25 = node16.srcref(node24);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node29.addChildrenToBack(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node29.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int45 = node29.getIndexOfChild(node44);
        com.google.javascript.rhino.Node node46 = node16.srcref(node44);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int52 = node51.getSourceOffset();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node56.children();
        node51.addChildrenToBack(node56);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int63 = node62.getSourceOffset();
        com.google.javascript.rhino.Node node64 = node51.useSourceInfoIfMissingFrom(node62);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(10, node51, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet68 = node67.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable69 = node67.getAncestors();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node70 = node16.removeChildAfter(node67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(strSet68);
        org.junit.Assert.assertNotNull(ancestorIterable69);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = functionType23.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node37 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry29.createFunctionType(jSType30, node37);
        boolean boolean39 = functionType38.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList40 = functionType38.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node50 = node47.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry42.createFunctionType(jSType43, node50);
        boolean boolean52 = functionType51.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] { functionType38, functionType51 };
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry27.createUnionType(jSTypeArray53);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry1.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) functionType23, jSTypeArray53);
        boolean boolean57 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry1.incrementGeneration();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative59 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry1.getNativeType(jSTypeNative59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(functionTypeList40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isNew();
        boolean boolean9 = node3.isQuotedString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int19 = node3.getIndexOfChild(node18);
        node3.detachChildren();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node24.children();
        boolean boolean26 = node24.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = new com.google.javascript.rhino.JSTypeExpression(node24, "hi!");
        boolean boolean29 = node24.isCatch();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node34.setSourceFileForTesting("[10, 0]");
        node34.setVarArgs(true);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        node43.setLength(0);
        boolean boolean48 = node43.isVar();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int53 = node52.getSourceOffset();
        boolean boolean54 = node52.isDo();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int59 = node58.getSourceOffset();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable64 = node63.children();
        node58.addChildrenToBack(node63);
        node58.detachChildren();
        node58.setLineno(16);
        boolean boolean69 = node58.isSwitch();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(39, node74);
        boolean boolean76 = node75.isIf();
        node75.detachChildren();
        boolean boolean78 = node58.hasChild(node75);
        boolean boolean79 = node58.isDebugger();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(52, node34, node43, node52, node58, (int) '#', (-1));
        boolean boolean83 = node34.isInc();
        boolean boolean84 = node34.isRegExp();
        // The following exception was thrown during execution in test generation
        try {
            node3.replaceChild(node24, node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The new child node has siblings.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(nodeIterable64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList7 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream8 = objList7.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList9 = objList7.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList10 = objList7.reverse();
        java.lang.Object[] objArray11 = objList10.toArray();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        node15.addChildrenToBack(node20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int27 = node26.getSourceOffset();
        com.google.javascript.rhino.Node node28 = node15.useSourceInfoIfMissingFrom(node26);
        boolean boolean29 = objList10.contains((java.lang.Object) node28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = objList2.addAll(12, (java.util.Collection<java.lang.Object>) objList10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList7);
        org.junit.Assert.assertNotNull(objStream8);
        org.junit.Assert.assertNotNull(objList9);
        org.junit.Assert.assertNotNull(objList10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0, 10]");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.Node node16 = functionType10.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        boolean boolean29 = functionType27.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType30 = functionType27.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = functionType27.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = functionType10.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean33 = functionType27.isConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType34 = functionType27.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("function ({1535407544}): {1535407544}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(function ({1535407544}): {1535407544})" + "'", str1, "(function ({1535407544}): {1535407544})");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.Node node6 = node3.removeFirstChild();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean11 = node10.hasOneChild();
        node10.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable14 = node10.getAncestors();
        int int15 = node10.getChildCount();
        java.lang.String str16 = node10.toString();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType27.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType31 = functionType27.toMaybeFunctionType();
        boolean boolean33 = functionType31.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable34 = functionType31.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType31.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        boolean boolean44 = node42.isQuotedString();
        com.google.javascript.rhino.Node node45 = node42.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry37.createFunctionType(jSType38, node45);
        boolean boolean47 = functionType31.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean48 = functionType31.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType31.getPropertyType("");
        boolean boolean51 = functionType31.isOrdinaryFunction();
        boolean boolean52 = functionType31.matchesNumberContext();
        node10.setJSType((com.google.javascript.rhino.jstype.JSType) functionType31);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int58 = node57.getSourceOffset();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable63 = node62.children();
        node57.addChildrenToBack(node62);
        node57.detachChildren();
        node57.setLineno(16);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(39, node72);
        boolean boolean74 = node73.isIf();
        node73.detachChildren();
        boolean boolean76 = node73.isVoid();
        com.google.javascript.rhino.Node node77 = node57.useSourceInfoIfMissingFrom(node73);
        boolean boolean78 = node57.isAdd();
        // The following exception was thrown during execution in test generation
        try {
            node3.replaceChild(node10, node57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ancestorIterable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "NUMBER 0.0 36" + "'", str16, "NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable34);
        org.junit.Assert.assertNull(jSType35);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(nodeIterable63);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }
}
