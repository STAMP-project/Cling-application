import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str4 = node3.toString();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("");
        node10.removeProp(23);
        node6.addChildToFront(node10);
        com.google.javascript.rhino.head.Node node14 = node6.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node3, node14);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str2 = node1.toString();
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasChildren();
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        boolean boolean13 = node10.hasSideEffects();
        node8.addChildrenToFront(node10);
        node10.setDouble((double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.addChildBefore(node4, node10);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node2 = node1.getLastSibling();
        java.lang.String str3 = node1.getJsDoc();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node6 = node5.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node7 = node1.getChildBefore(node5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node50 = node19.getChildBefore(node44);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        boolean boolean4 = node1.hasSideEffects();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        boolean boolean10 = node7.hasSideEffects();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(0, node7);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(0, node14, node17);
        int int19 = node14.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.addChildBefore(node11, node14);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(23);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        node4.addChildToFront(node8);
        node1.putProp((int) ' ', (java.lang.Object) node8);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.hasConsistentReturnUsage();
        boolean boolean19 = node16.hasSideEffects();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node(0, node16);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString("");
        node27.removeProp(23);
        node23.addChildToFront(node27);
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean33 = node32.hasChildren();
        node23.addChildrenToFront(node32);
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str37 = node36.toString();
        boolean boolean38 = node36.hasChildren();
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) (short) -1, node32, node36, (int) (short) 10);
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node16, node36, node43, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node43);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node2 = node1.getLastSibling();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(0, node5, node8);
        int int10 = node5.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node11 = node2.getChildBefore(node5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("");
        node15.removeProp(23);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor18 = node15.iterator();
        java.lang.Object obj20 = node15.getProp((int) (byte) 1);
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
        boolean boolean37 = node36.hasChildren();
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str41 = node40.toString();
        boolean boolean42 = node40.hasConsistentReturnUsage();
        boolean boolean43 = node40.hasSideEffects();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node(0, node40);
        int int45 = node40.getLineno();
        node36.addChildToFront(node40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.addChildBefore(node15, node36);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("");
        int int4 = node1.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str13 = node12.toString();
        boolean boolean14 = node12.hasConsistentReturnUsage();
        boolean boolean15 = node12.hasSideEffects();
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(0, node12);
        node7.addChildrenToBack(node16);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(9, node7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node19 = node1.getChildBefore(node18);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str2 = node1.toString();
        int int3 = node1.getLineno();
        node1.putProp(0, (java.lang.Object) 10);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("");
        node12.removeProp(23);
        node8.addChildToFront(node12);
        com.google.javascript.rhino.head.Node node16 = node8.getFirstChild();
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node16.addChildrenToBack(node18);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.hasConsistentReturnUsage();
        boolean boolean26 = node23.hasSideEffects();
        node21.addChildrenToFront(node23);
        node23.removeChildren();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("hi!");
        node23.addChildrenToBack(node30);
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
        node43.removeProp((int) (byte) -1);
        node30.addChildrenToFront(node43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChildAfter(node16, node30);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
        boolean boolean20 = node11.hasChildren();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str26 = node25.toString();
        boolean boolean27 = node25.hasConsistentReturnUsage();
        boolean boolean28 = node25.hasSideEffects();
        node23.addChildrenToFront(node25);
        node25.removeChildren();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString("hi!");
        node25.addChildrenToBack(node32);
        node11.putProp(23, (java.lang.Object) node32);
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString("");
        node36.removeProp(23);
        node36.setLineno((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.removeChild(node36);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        boolean boolean5 = node2.hasSideEffects();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, node2);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        boolean boolean12 = node9.hasSideEffects();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str15 = node14.toString();
        boolean boolean16 = node14.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newString("");
        node18.removeProp(23);
        node14.addChildToFront(node18);
        com.google.javascript.rhino.head.Node node22 = node14.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment23 = node14.getJsDocNode();
        node9.addChildToBack(node14);
        boolean boolean25 = node14.hasConsistentReturnUsage();
        node2.putProp((int) (short) 1, (java.lang.Object) node14);
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str31 = node30.toString();
        boolean boolean32 = node30.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString("");
        node34.removeProp(23);
        node30.addChildToFront(node34);
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean40 = node39.hasChildren();
        node30.addChildrenToFront(node39);
        int int42 = node39.getLineno();
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str45 = node44.toString();
        boolean boolean46 = node44.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newString("");
        node48.removeProp(23);
        node44.addChildToFront(node48);
        com.google.javascript.rhino.head.Node node52 = node44.getFirstChild();
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node((int) (short) 0, node39, node44, 9);
        boolean boolean55 = node39.hasSideEffects();
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str60 = node59.toString();
        boolean boolean61 = node59.hasConsistentReturnUsage();
        boolean boolean62 = node59.hasSideEffects();
        node57.addChildrenToFront(node59);
        node59.removeChildren();
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newString("hi!");
        node59.addChildrenToBack(node66);
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str70 = node69.toString();
        boolean boolean71 = node69.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node73 = com.google.javascript.rhino.head.Node.newString("");
        node73.removeProp(23);
        node69.addChildToFront(node73);
        com.google.javascript.rhino.head.Node node77 = node69.getFirstChild();
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node77.addChildrenToBack(node79);
        com.google.javascript.rhino.head.Node node81 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node39, node59, node79);
        com.google.javascript.rhino.head.Node node83 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str84 = node83.toString();
        boolean boolean85 = node83.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node87 = com.google.javascript.rhino.head.Node.newString("");
        node87.removeProp(23);
        node83.addChildToFront(node87);
        com.google.javascript.rhino.head.Node node92 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean93 = node92.hasChildren();
        node83.addChildrenToFront(node92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node79, node92);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(12);
        node1.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(13, node7);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("");
        node15.removeProp(23);
        node11.addChildToFront(node15);
        com.google.javascript.rhino.head.Node node19 = node11.getFirstChild();
        node19.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope22 = node19.getScope();
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) ' ', node19, 2);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator25 = node19.spliterator();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(23);
        node19.addChildToBack(node27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChildAfter(node8, node27);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node9 = node1.getFirstChild();
        node9.setString("100");
        com.google.javascript.rhino.head.Node node12 = node9.getLastSibling();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("");
        node20.removeProp(23);
        node16.addChildToFront(node20);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean26 = node25.hasChildren();
        node16.addChildrenToFront(node25);
        int int28 = node25.getLineno();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str31 = node30.toString();
        boolean boolean32 = node30.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString("");
        node34.removeProp(23);
        node30.addChildToFront(node34);
        com.google.javascript.rhino.head.Node node38 = node30.getFirstChild();
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) (short) 0, node25, node30, 9);
        boolean boolean41 = node25.hasSideEffects();
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node45 = node44.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator46 = node45.new NodeIterator();
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str49 = node48.toString();
        boolean boolean50 = node48.hasConsistentReturnUsage();
        boolean boolean51 = node48.hasSideEffects();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str54 = node53.toString();
        boolean boolean55 = node53.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newString("");
        node57.removeProp(23);
        node53.addChildToFront(node57);
        com.google.javascript.rhino.head.Node node61 = node53.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment62 = node53.getJsDocNode();
        node48.addChildToBack(node53);
        java.lang.String str64 = node48.toString();
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(0, node25, node45, node48, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node9.removeChild(node66);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node2 = node1.getLastSibling();
        java.lang.String str3 = node1.getJsDoc();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("");
        node12.removeProp(23);
        node8.addChildToFront(node12);
        com.google.javascript.rhino.head.Node node16 = node8.getFirstChild();
        node16.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope19 = node16.getScope();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) ' ', node16, 2);
        boolean boolean22 = node21.hasChildren();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("");
        node30.removeProp(23);
        node26.addChildToFront(node30);
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean36 = node35.hasChildren();
        node26.addChildrenToFront(node35);
        int int38 = node35.getLineno();
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str41 = node40.toString();
        boolean boolean42 = node40.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newString("");
        node44.removeProp(23);
        node40.addChildToFront(node44);
        com.google.javascript.rhino.head.Node node48 = node40.getFirstChild();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (short) 0, node35, node40, 9);
        boolean boolean51 = node35.hasSideEffects();
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node55 = node54.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator56 = node55.new NodeIterator();
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str59 = node58.toString();
        boolean boolean60 = node58.hasConsistentReturnUsage();
        boolean boolean61 = node58.hasSideEffects();
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str64 = node63.toString();
        boolean boolean65 = node63.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node67 = com.google.javascript.rhino.head.Node.newString("");
        node67.removeProp(23);
        node63.addChildToFront(node67);
        com.google.javascript.rhino.head.Node node71 = node63.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment72 = node63.getJsDocNode();
        node58.addChildToBack(node63);
        java.lang.String str74 = node58.toString();
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node(0, node35, node55, node58, 1);
        com.google.javascript.rhino.head.Node node78 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node80 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str81 = node80.toString();
        boolean boolean82 = node80.hasConsistentReturnUsage();
        boolean boolean83 = node80.hasSideEffects();
        node78.addChildrenToFront(node80);
        node80.removeChildren();
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node((int) (short) 0, node21, node55, node80);
        com.google.javascript.rhino.head.Node node89 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str90 = node89.toString();
        boolean boolean91 = node89.hasConsistentReturnUsage();
        boolean boolean92 = node89.hasSideEffects();
        com.google.javascript.rhino.head.Node node93 = new com.google.javascript.rhino.head.Node(0, node89);
        com.google.javascript.rhino.head.ast.Comment comment94 = node89.getJsDocNode();
        com.google.javascript.rhino.head.Node node95 = new com.google.javascript.rhino.head.Node(18, node21, node89);
        double double96 = node89.getDouble();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node89);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(12);
        node2.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(6, node2);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        node8.setLineno((int) '4');
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("");
        node14.removeProp(23);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor17 = node14.iterator();
        java.lang.Object obj19 = node14.getProp((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChildAfter(node8, node14);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) '4', 7);
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        boolean boolean9 = node6.hasSideEffects();
        node4.addChildrenToFront(node6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node11 = node2.getChildBefore(node6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        com.google.javascript.rhino.head.Node node83 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean84 = node83.hasChildren();
        com.google.javascript.rhino.head.Node node85 = node83.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node86 = node75.getChildBefore(node83);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node3 = node2.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator4 = node3.new NodeIterator();
        node3.setLineno(13);
        boolean boolean7 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        boolean boolean14 = node11.hasSideEffects();
        node9.addChildrenToFront(node11);
        com.google.javascript.rhino.head.Node node16 = node11.getLastSibling();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str21 = node20.toString();
        boolean boolean22 = node20.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString("");
        node24.removeProp(23);
        node20.addChildToFront(node24);
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean30 = node29.hasChildren();
        node20.addChildrenToFront(node29);
        int int32 = node29.getLineno();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str35 = node34.toString();
        boolean boolean36 = node34.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("");
        node38.removeProp(23);
        node34.addChildToFront(node38);
        com.google.javascript.rhino.head.Node node42 = node34.getFirstChild();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) 0, node29, node34, 9);
        boolean boolean45 = node29.hasSideEffects();
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node49 = node48.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator50 = node49.new NodeIterator();
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str53 = node52.toString();
        boolean boolean54 = node52.hasConsistentReturnUsage();
        boolean boolean55 = node52.hasSideEffects();
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str58 = node57.toString();
        boolean boolean59 = node57.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newString("");
        node61.removeProp(23);
        node57.addChildToFront(node61);
        com.google.javascript.rhino.head.Node node65 = node57.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment66 = node57.getJsDocNode();
        node52.addChildToBack(node57);
        java.lang.String str68 = node52.toString();
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(0, node29, node49, node52, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node16, node70);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        java.lang.String str9 = node5.getString();
        com.google.javascript.rhino.head.ast.Scope scope10 = node5.getScope();
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
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str41 = node40.toString();
        int int42 = node40.getLineno();
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newNumber((double) 0);
        com.google.javascript.rhino.head.ast.Comment comment45 = node44.getJsDocNode();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str50 = node49.toString();
        boolean boolean51 = node49.hasConsistentReturnUsage();
        boolean boolean52 = node49.hasSideEffects();
        node47.addChildrenToFront(node49);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(8, node40, node44, node47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.replaceChildAfter(node27, node40);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        com.google.javascript.rhino.head.Node node20 = node19.getLastChild();
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString(12, "40");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node24 = node20.getChildBefore(node23);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
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
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(97, node3, node9);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        boolean boolean29 = node26.hasSideEffects();
        node24.addChildrenToFront(node26);
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString("");
        node36.removeProp(23);
        node32.addChildToFront(node36);
        com.google.javascript.rhino.head.Node node40 = node32.getFirstChild();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node40.addChildrenToBack(node42);
        node26.addChildrenToBack(node42);
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str48 = node47.toString();
        boolean boolean49 = node47.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newString("");
        node51.removeProp(23);
        node47.addChildToFront(node51);
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean57 = node56.hasChildren();
        node47.addChildrenToFront(node56);
        com.google.javascript.rhino.head.Node node60 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str61 = node60.toString();
        boolean boolean62 = node60.hasConsistentReturnUsage();
        boolean boolean63 = node60.hasSideEffects();
        com.google.javascript.rhino.head.Node node65 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str66 = node65.toString();
        boolean boolean67 = node65.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newString("");
        node69.removeProp(23);
        node65.addChildToFront(node69);
        com.google.javascript.rhino.head.Node node73 = node65.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment74 = node65.getJsDocNode();
        node60.addChildToBack(node65);
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node(15, node47, node60);
        node42.addChildrenToFront(node47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node47);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str31 = node30.toString();
        boolean boolean32 = node30.hasConsistentReturnUsage();
        boolean boolean33 = node30.hasSideEffects();
        node28.addChildrenToFront(node30);
        node30.removeChildren();
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newString("hi!");
        node30.addChildrenToBack(node37);
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str42 = node41.toString();
        boolean boolean43 = node41.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString("");
        node45.removeProp(23);
        node41.addChildToFront(node45);
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean51 = node50.hasChildren();
        node41.addChildrenToFront(node50);
        int int53 = node50.getLineno();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str56 = node55.toString();
        boolean boolean57 = node55.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newString("");
        node59.removeProp(23);
        node55.addChildToFront(node59);
        com.google.javascript.rhino.head.Node node63 = node55.getFirstChild();
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((int) (short) 0, node50, node55, 9);
        boolean boolean66 = node50.hasSideEffects();
        node50.removeProp((int) (byte) -1);
        node37.addChildrenToFront(node50);
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node73 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str74 = node73.toString();
        boolean boolean75 = node73.hasConsistentReturnUsage();
        boolean boolean76 = node73.hasSideEffects();
        node71.addChildrenToFront(node73);
        com.google.javascript.rhino.head.Node node79 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str80 = node79.toString();
        boolean boolean81 = node79.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node83 = com.google.javascript.rhino.head.Node.newString("");
        node83.removeProp(23);
        node79.addChildToFront(node83);
        com.google.javascript.rhino.head.Node node87 = node79.getFirstChild();
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node87.addChildrenToBack(node89);
        node73.addChildrenToBack(node89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node22.replaceChild(node50, node73);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
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
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator64 = node63.new NodeIterator();
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
        com.google.javascript.rhino.head.Node node85 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node86 = node85.getLastSibling();
        com.google.javascript.rhino.head.Node node87 = new com.google.javascript.rhino.head.Node((int) ' ', node82, node85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.replaceChild(node63, node82);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(0, node19, node22);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(12);
        node26.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(6, node26);
        com.google.javascript.rhino.head.Node node31 = node30.getLastChild();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("");
        node39.removeProp(23);
        node35.addChildToFront(node39);
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean45 = node44.hasChildren();
        node35.addChildrenToFront(node44);
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str49 = node48.toString();
        boolean boolean50 = node48.hasChildren();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) (short) -1, node44, node48, (int) (short) 10);
        com.google.javascript.rhino.head.Node node53 = node52.getLastChild();
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str59 = node58.toString();
        boolean boolean60 = node58.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newString("");
        node62.removeProp(23);
        node58.addChildToFront(node62);
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node((int) 'a', node58);
        com.google.javascript.rhino.head.Node node68 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node70 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str71 = node70.toString();
        com.google.javascript.rhino.head.Node node72 = node70.getLastChild();
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node((int) (short) -1, node58, node68, node70, (int) (short) -1);
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node((int) (short) 1, node70, 12);
        com.google.javascript.rhino.head.Node node78 = new com.google.javascript.rhino.head.Node(23);
        node78.removeProp(25);
        boolean boolean81 = node78.hasChildren();
        com.google.javascript.rhino.head.Node node82 = new com.google.javascript.rhino.head.Node((-1), node53, node70, node78);
        node31.addChildToBack(node53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.replaceChildAfter(node22, node53);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        node5.addChildToFront(node9);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean15 = node14.hasChildren();
        node5.addChildrenToFront(node14);
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str19 = node18.toString();
        boolean boolean20 = node18.hasConsistentReturnUsage();
        boolean boolean21 = node18.hasSideEffects();
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString("");
        node27.removeProp(23);
        node23.addChildToFront(node27);
        com.google.javascript.rhino.head.Node node31 = node23.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment32 = node23.getJsDocNode();
        node18.addChildToBack(node23);
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(15, node5, node18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node34);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(23, 6);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newString("23");
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("");
        node6.removeProp(23);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        boolean boolean14 = node11.hasSideEffects();
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(0, node11);
        node6.addChildrenToBack(node15);
        node4.addChildrenToBack(node15);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString(15, "40");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChildAfter(node4, node20);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
        int int26 = node19.getType();
        java.lang.String str27 = node19.getJsDoc();
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
        boolean boolean44 = node43.hasChildren();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str48 = node47.toString();
        boolean boolean49 = node47.hasConsistentReturnUsage();
        boolean boolean50 = node47.hasSideEffects();
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node(0, node47);
        int int52 = node47.getLineno();
        node43.addChildToFront(node47);
        boolean boolean54 = node47.hasSideEffects();
        boolean boolean55 = node47.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node56 = node19.getChildBefore(node47);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(15, "40");
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        boolean boolean9 = node6.hasSideEffects();
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(0, node6);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString("");
        node17.removeProp(23);
        node13.addChildToFront(node17);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean23 = node22.hasChildren();
        node13.addChildrenToFront(node22);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasChildren();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) -1, node22, node26, (int) (short) 10);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node6, node26, node33, (int) (short) 0);
        com.google.javascript.rhino.head.Node node37 = node35.setType(16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node35);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node18 = node17.getLastSibling();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasConsistentReturnUsage();
        boolean boolean25 = node22.hasSideEffects();
        node20.addChildrenToFront(node22);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(26, node17, node20, 20);
        boolean boolean29 = node28.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.removeChild(node28);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str2 = node1.toString();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        boolean boolean16 = node13.hasSideEffects();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(0, node13);
        node8.addChildrenToBack(node17);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(9, node8);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(13, node23);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(7, node23);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) 'a', node5, node19, node23, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node28 = node1.getChildBefore(node23);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node3 = node2.getLastSibling();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) 10);
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(12, 25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.addChildBefore(node5, node8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        boolean boolean20 = node17.hasSideEffects();
        node15.addChildrenToFront(node17);
        node17.removeChildren();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString("hi!");
        node17.addChildrenToBack(node24);
        int int28 = node24.getIntProp(0, 22);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("");
        node31.removeProp(23);
        node31.setLineno((int) '4');
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str41 = node40.toString();
        boolean boolean42 = node40.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newString("");
        node44.removeProp(23);
        node40.addChildToFront(node44);
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean50 = node49.hasChildren();
        node40.addChildrenToFront(node49);
        int int52 = node49.getLineno();
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str55 = node54.toString();
        boolean boolean56 = node54.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newString("");
        node58.removeProp(23);
        node54.addChildToFront(node58);
        com.google.javascript.rhino.head.Node node62 = node54.getFirstChild();
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) (short) 0, node49, node54, 9);
        boolean boolean65 = node49.hasSideEffects();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str70 = node69.toString();
        boolean boolean71 = node69.hasConsistentReturnUsage();
        boolean boolean72 = node69.hasSideEffects();
        node67.addChildrenToFront(node69);
        node69.removeChildren();
        com.google.javascript.rhino.head.Node node76 = com.google.javascript.rhino.head.Node.newString("hi!");
        node69.addChildrenToBack(node76);
        com.google.javascript.rhino.head.Node node79 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str80 = node79.toString();
        boolean boolean81 = node79.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node83 = com.google.javascript.rhino.head.Node.newString("");
        node83.removeProp(23);
        node79.addChildToFront(node83);
        com.google.javascript.rhino.head.Node node87 = node79.getFirstChild();
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node87.addChildrenToBack(node89);
        com.google.javascript.rhino.head.Node node91 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node49, node69, node89);
        com.google.javascript.rhino.head.Node node92 = new com.google.javascript.rhino.head.Node(9, node49);
        com.google.javascript.rhino.head.Node node94 = com.google.javascript.rhino.head.Node.newNumber((double) 13);
        com.google.javascript.rhino.head.Node node95 = new com.google.javascript.rhino.head.Node(12, node31, node92, node94);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.replaceChild(node24, node92);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        boolean boolean11 = node8.hasSideEffects();
        node6.addChildrenToFront(node8);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(26, node3, node6, 20);
        int int15 = node14.getType();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean18 = node17.hasChildren();
        node14.addChildrenToBack(node17);
        com.google.javascript.rhino.head.Node node20 = node14.getFirstChild();
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(21, 3);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) 0);
        com.google.javascript.rhino.head.ast.Comment comment27 = node26.getJsDocNode();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str32 = node31.toString();
        boolean boolean33 = node31.hasConsistentReturnUsage();
        boolean boolean34 = node31.hasSideEffects();
        node29.addChildrenToFront(node31);
        boolean boolean36 = node31.hasSideEffects();
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) ' ', node24, node26, node31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node20.removeChild(node24);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        node1.addChildrenToFront(node3);
        node3.removeChildren();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("hi!");
        node3.addChildrenToBack(node10);
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str16 = node15.toString();
        boolean boolean17 = node15.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString("");
        node19.removeProp(23);
        node15.addChildToFront(node19);
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean25 = node24.hasChildren();
        node15.addChildrenToFront(node24);
        int int27 = node24.getLineno();
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str30 = node29.toString();
        boolean boolean31 = node29.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("");
        node33.removeProp(23);
        node29.addChildToFront(node33);
        com.google.javascript.rhino.head.Node node37 = node29.getFirstChild();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) (short) 0, node24, node29, 9);
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
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str62 = node61.toString();
        boolean boolean63 = node61.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node65 = com.google.javascript.rhino.head.Node.newString("");
        node65.removeProp(23);
        node61.addChildToFront(node65);
        com.google.javascript.rhino.head.Node node69 = node61.getFirstChild();
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node69.addChildrenToBack(node71);
        com.google.javascript.rhino.head.Node node73 = node71.getLastChild();
        java.lang.String str74 = node71.getJsDoc();
        java.lang.Object obj76 = node71.getProp(0);
        com.google.javascript.rhino.head.Node node77 = new com.google.javascript.rhino.head.Node(3, node24, node43, node71);
        com.google.javascript.rhino.head.Node node79 = com.google.javascript.rhino.head.Node.newNumber((double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.addChildBefore(node71, node79);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node3 = node2.getLastSibling();
        int int4 = node2.getLineno();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("");
        node10.removeProp(23);
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str16 = node15.toString();
        boolean boolean17 = node15.hasConsistentReturnUsage();
        boolean boolean18 = node15.hasSideEffects();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(0, node15);
        node10.addChildrenToBack(node19);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(9, node10);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(13, node25);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(7, node25);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) 'a', node7, node21, node25, (int) (short) 1);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node34 = node32.setType((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChildAfter(node29, node34);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("");
        node20.removeProp(23);
        node16.addChildToFront(node20);
        com.google.javascript.rhino.head.Node node24 = node16.getFirstChild();
        node24.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope27 = node24.getScope();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) ' ', node24, 2);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str35 = node34.toString();
        boolean boolean36 = node34.hasConsistentReturnUsage();
        boolean boolean37 = node34.hasSideEffects();
        node32.addChildrenToFront(node34);
        node34.removeChildren();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newString("hi!");
        node34.addChildrenToBack(node41);
        int int45 = node41.getIntProp(0, 22);
        node24.putProp(15, (java.lang.Object) 22);
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str51 = node50.toString();
        boolean boolean52 = node50.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newString("");
        node54.removeProp(23);
        node50.addChildToFront(node54);
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean60 = node59.hasChildren();
        node50.addChildrenToFront(node59);
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str64 = node63.toString();
        boolean boolean65 = node63.hasConsistentReturnUsage();
        boolean boolean66 = node63.hasSideEffects();
        com.google.javascript.rhino.head.Node node68 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str69 = node68.toString();
        boolean boolean70 = node68.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node72 = com.google.javascript.rhino.head.Node.newString("");
        node72.removeProp(23);
        node68.addChildToFront(node72);
        com.google.javascript.rhino.head.Node node76 = node68.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment77 = node68.getJsDocNode();
        node63.addChildToBack(node68);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node(15, node50, node63);
        com.google.javascript.rhino.head.Node node82 = com.google.javascript.rhino.head.Node.newString(23, "");
        java.lang.String str83 = node82.toString();
        com.google.javascript.rhino.head.Node node86 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node89 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node90 = new com.google.javascript.rhino.head.Node(0, node86, node89);
        com.google.javascript.rhino.head.Node node91 = new com.google.javascript.rhino.head.Node(24, node50, node82, node90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.addChildBefore(node24, node82);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node9 = node1.getFirstChild();
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
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str70 = node69.toString();
        boolean boolean71 = node69.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node73 = com.google.javascript.rhino.head.Node.newString("");
        node73.removeProp(23);
        node69.addChildToFront(node73);
        com.google.javascript.rhino.head.Node node77 = new com.google.javascript.rhino.head.Node((int) 'a', node69);
        com.google.javascript.rhino.head.Node node79 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node81 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str82 = node81.toString();
        com.google.javascript.rhino.head.Node node83 = node81.getLastChild();
        com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node((int) (short) -1, node69, node79, node81, (int) (short) -1);
        com.google.javascript.rhino.head.Node node87 = com.google.javascript.rhino.head.Node.newString("23");
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node(26, node85, node87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node9.replaceChild(node22, node85);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node11);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator17 = node11.new NodeIterator();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean20 = node19.hasChildren();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString("");
        node26.removeProp(23);
        node22.addChildToFront(node26);
        com.google.javascript.rhino.head.Node node30 = node26.getLastChild();
        node26.setString("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.addChildBefore(node19, node26);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
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
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator18 = node12.spliterator();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node(23);
        node12.addChildToBack(node20);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.hasConsistentReturnUsage();
        boolean boolean26 = node23.hasSideEffects();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str29 = node28.toString();
        boolean boolean30 = node28.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString("");
        node32.removeProp(23);
        node28.addChildToFront(node32);
        com.google.javascript.rhino.head.Node node36 = node28.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment37 = node28.getJsDocNode();
        node23.addChildToBack(node28);
        java.lang.String str39 = node23.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.addChildBefore(node20, node23);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("");
        node1.removeProp(23);
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        boolean boolean9 = node6.hasSideEffects();
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(0, node6);
        node1.addChildrenToBack(node10);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node15 = node14.getLastSibling();
        node10.addChildrenToBack(node15);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator17 = node10.new NodeIterator();
        com.google.javascript.rhino.head.Node node18 = nodeIterator17.next();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str21 = node20.toString();
        boolean boolean22 = node20.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString("");
        node24.removeProp(23);
        node20.addChildToFront(node24);
        com.google.javascript.rhino.head.Node node28 = node20.getFirstChild();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node33 = node32.getLastSibling();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str38 = node37.toString();
        boolean boolean39 = node37.hasConsistentReturnUsage();
        boolean boolean40 = node37.hasSideEffects();
        node35.addChildrenToFront(node37);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node(26, node32, node35, 20);
        node20.addChildToBack(node32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node18.removeChild(node32);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node25 = node1.getChildBefore(node24);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        boolean boolean5 = node2.hasSideEffects();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, node2);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        boolean boolean12 = node9.hasSideEffects();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str15 = node14.toString();
        boolean boolean16 = node14.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newString("");
        node18.removeProp(23);
        node14.addChildToFront(node18);
        com.google.javascript.rhino.head.Node node22 = node14.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment23 = node14.getJsDocNode();
        node9.addChildToBack(node14);
        boolean boolean25 = node14.hasConsistentReturnUsage();
        node2.putProp((int) (short) 1, (java.lang.Object) node14);
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(13, node34);
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(7, node34);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node36.addChildToFront(node38);
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(12);
        node42.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(6, node42);
        com.google.javascript.rhino.head.Node node47 = node46.getLastChild();
        node36.addChildToFront(node46);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(97, node30, node36);
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str55 = node54.toString();
        boolean boolean56 = node54.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newString("");
        node58.removeProp(23);
        node54.addChildToFront(node58);
        com.google.javascript.rhino.head.Node node62 = node54.getFirstChild();
        node62.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope65 = node62.getScope();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) ' ', node62, 2);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node72 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str73 = node72.toString();
        boolean boolean74 = node72.hasConsistentReturnUsage();
        boolean boolean75 = node72.hasSideEffects();
        node70.addChildrenToFront(node72);
        node72.removeChildren();
        com.google.javascript.rhino.head.Node node79 = com.google.javascript.rhino.head.Node.newString("hi!");
        node72.addChildrenToBack(node79);
        int int83 = node79.getIntProp(0, 22);
        node62.putProp(15, (java.lang.Object) 22);
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node((int) (short) -1, node62, 2);
        com.google.javascript.rhino.head.Node node87 = new com.google.javascript.rhino.head.Node(1, node86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.replaceChildAfter(node49, node87);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str54 = node53.toString();
        boolean boolean55 = node53.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newString("");
        node57.removeProp(23);
        node53.addChildToFront(node57);
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean63 = node62.hasChildren();
        node53.addChildrenToFront(node62);
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
        com.google.javascript.rhino.head.Node node82 = new com.google.javascript.rhino.head.Node(15, node53, node66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.removeChild(node66);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str44 = node43.toString();
        boolean boolean45 = node43.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString("");
        node47.removeProp(23);
        node43.addChildToFront(node47);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean53 = node52.hasChildren();
        node43.addChildrenToFront(node52);
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str57 = node56.toString();
        boolean boolean58 = node56.hasChildren();
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node((int) (short) -1, node52, node56, (int) (short) 10);
        node60.removeProp(24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node26.replaceChildAfter(node38, node60);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean3 = node2.hasChildren();
        com.google.javascript.rhino.head.Node node4 = node2.getLastSibling();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node9 = node8.getLastSibling();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(13, node13);
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(12);
        node17.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(6, node17);
        com.google.javascript.rhino.head.Node node22 = node21.getLastChild();
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node13, node21, 0);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node27.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node(20, node9, node13, node27);
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str35 = node34.toString();
        boolean boolean36 = node34.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("");
        node38.removeProp(23);
        node34.addChildToFront(node38);
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) 'a', node34);
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
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node64 = node63.getLastSibling();
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((int) ' ', node60, node63);
        node34.addChildrenToFront(node65);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node(24, node4, node31, node65, (int) (short) -1);
        com.google.javascript.rhino.head.Node node71 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str72 = node71.toString();
        boolean boolean73 = node71.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node75 = com.google.javascript.rhino.head.Node.newString("");
        node75.removeProp(23);
        node71.addChildToFront(node75);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node((int) 'a', node71);
        com.google.javascript.rhino.head.Node node81 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node82 = node81.getLastSibling();
        java.lang.Object obj84 = node81.getProp(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node65.replaceChildAfter(node71, node81);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(1, 26);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        node5.addChildToFront(node9);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean15 = node14.hasChildren();
        node5.addChildrenToFront(node14);
        int int17 = node14.getLineno();
        int int18 = node14.getType();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node14);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        node21.removeProp(23);
        node21.setLineno((int) '4');
        int int28 = node21.getIntProp(6, 22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.addChildBefore(node19, node21);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node9 = node1.getFirstChild();
        node9.setString("100");
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node16 = node15.getLastSibling();
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str21 = node20.toString();
        boolean boolean22 = node20.hasConsistentReturnUsage();
        boolean boolean23 = node20.hasSideEffects();
        node18.addChildrenToFront(node20);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(26, node15, node18, 20);
        boolean boolean27 = node26.hasSideEffects();
        com.google.javascript.rhino.head.Node node28 = node26.getLastChild();
        java.lang.String str29 = node26.getJsDoc();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("-1");
        node31.removeProp(25);
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newString("");
        int int38 = node35.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str45 = node44.toString();
        boolean boolean46 = node44.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newString("");
        node48.removeProp(23);
        node44.addChildToFront(node48);
        com.google.javascript.rhino.head.Node node52 = node44.getFirstChild();
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node52.addChildrenToBack(node54);
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newString("");
        int int60 = node57.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (short) 10, node52, node57);
        com.google.javascript.rhino.head.Node node63 = node52.setType(18);
        node35.addChildAfter(node41, node63);
        node31.addChildToFront(node63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node9.replaceChild(node26, node31);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        node1.addChildrenToFront(node3);
        node3.setDouble((double) (short) 0);
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(4, 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node13 = node3.getChildBefore(node12);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(13, node33);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(12);
        node37.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(6, node37);
        com.google.javascript.rhino.head.Node node42 = node41.getLastChild();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node33, node41, 0);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(17, node29, node44);
        com.google.javascript.rhino.head.Node node46 = node29.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node47 = node8.getChildBefore(node29);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, node2, node5);
        int int7 = node2.getLineno();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor8 = node2.iterator();
        boolean boolean9 = node2.hasSideEffects();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(13, node17);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(7, node17);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node19.addChildToFront(node21);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(12);
        node25.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(6, node25);
        com.google.javascript.rhino.head.Node node30 = node29.getLastChild();
        node19.addChildToFront(node29);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(97, node13, node19);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(1, 26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChildAfter(node32, node35);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(13, node6);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(12);
        node10.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(6, node10);
        com.google.javascript.rhino.head.Node node15 = node14.getLastChild();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node6, node14, 0);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(17, node2, node17);
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
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(23);
        node29.addChildToBack(node37);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newString("");
        node42.removeProp(23);
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str48 = node47.toString();
        boolean boolean49 = node47.hasConsistentReturnUsage();
        boolean boolean50 = node47.hasSideEffects();
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node(0, node47);
        node42.addChildrenToBack(node51);
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(9, node42);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node((int) '#', node53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node29, node53);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator17 = node11.spliterator();
        node11.putIntProp(100, (int) (byte) 0);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str25 = node24.toString();
        boolean boolean26 = node24.hasConsistentReturnUsage();
        boolean boolean27 = node24.hasSideEffects();
        node22.addChildrenToFront(node24);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str32 = node31.toString();
        boolean boolean33 = node31.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newString("");
        node35.removeProp(23);
        node31.addChildToFront(node35);
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean41 = node40.hasChildren();
        node31.addChildrenToFront(node40);
        int int43 = node40.getLineno();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str46 = node45.toString();
        boolean boolean47 = node45.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString("");
        node49.removeProp(23);
        node45.addChildToFront(node49);
        com.google.javascript.rhino.head.Node node53 = node45.getFirstChild();
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node((int) (short) 0, node40, node45, 9);
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node((int) (short) 100, node11, node24, node40, 25);
        com.google.javascript.rhino.head.Node node60 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str61 = node60.toString();
        boolean boolean62 = node60.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node64 = com.google.javascript.rhino.head.Node.newString("");
        node64.removeProp(23);
        node60.addChildToFront(node64);
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean70 = node69.hasChildren();
        node60.addChildrenToFront(node69);
        com.google.javascript.rhino.head.Node node73 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str74 = node73.toString();
        boolean boolean75 = node73.hasConsistentReturnUsage();
        boolean boolean76 = node73.hasSideEffects();
        com.google.javascript.rhino.head.Node node78 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str79 = node78.toString();
        boolean boolean80 = node78.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node82 = com.google.javascript.rhino.head.Node.newString("");
        node82.removeProp(23);
        node78.addChildToFront(node82);
        com.google.javascript.rhino.head.Node node86 = node78.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment87 = node78.getJsDocNode();
        node73.addChildToBack(node78);
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node(15, node60, node73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node40.removeChild(node73);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 15);
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str4 = node3.toString();
        com.google.javascript.rhino.head.Node node5 = node3.getFirstChild();
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
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator23 = node17.spliterator();
        node17.putIntProp(100, (int) (byte) 0);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str31 = node30.toString();
        boolean boolean32 = node30.hasConsistentReturnUsage();
        boolean boolean33 = node30.hasSideEffects();
        node28.addChildrenToFront(node30);
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
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str52 = node51.toString();
        boolean boolean53 = node51.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString("");
        node55.removeProp(23);
        node51.addChildToFront(node55);
        com.google.javascript.rhino.head.Node node59 = node51.getFirstChild();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (short) 0, node46, node51, 9);
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 100, node17, node30, node46, 25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node3, node17);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        boolean boolean35 = node32.hasChildren();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node40 = node39.getLastSibling();
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str45 = node44.toString();
        boolean boolean46 = node44.hasConsistentReturnUsage();
        boolean boolean47 = node44.hasSideEffects();
        node42.addChildrenToFront(node44);
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node(26, node39, node42, 20);
        int int51 = node50.getType();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean54 = node53.hasChildren();
        node50.addChildrenToBack(node53);
        com.google.javascript.rhino.head.Node node56 = node50.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node57 = node32.getChildBefore(node50);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) 7);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(0, node12, node22, (-1));
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str27 = node26.toString();
        int int28 = node26.getLineno();
        node26.putProp(0, (java.lang.Object) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node32 = node12.getChildBefore(node26);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(13, node33);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(7, node33);
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(0, node38, node41);
        com.google.javascript.rhino.head.Node node43 = node42.getLastSibling();
        node27.addChildAfter(node35, node42);
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str47 = node46.toString();
        int int48 = node46.getLineno();
        node46.putProp(0, (java.lang.Object) 10);
        int int52 = node46.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node27.removeChild(node46);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean2 = node1.hasChildren();
        com.google.javascript.rhino.head.Node node3 = node1.getLastSibling();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        node5.addChildToFront(node9);
        com.google.javascript.rhino.head.Node node13 = node9.getLastChild();
        node9.setString("");
        com.google.javascript.rhino.head.Node node17 = node9.setType(25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node18 = node3.getChildBefore(node9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.hasConsistentReturnUsage();
        boolean boolean19 = node16.hasSideEffects();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node(0, node16);
        int int21 = node16.getLineno();
        node16.removeProp(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node24 = node9.getChildBefore(node16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        boolean boolean11 = node8.hasSideEffects();
        node6.addChildrenToFront(node8);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(26, node3, node6, 20);
        int int15 = node14.getType();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean18 = node17.hasChildren();
        node14.addChildrenToBack(node17);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        java.lang.String str23 = node22.toString();
        com.google.javascript.rhino.head.Node node24 = node22.getLastChild();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node28 = node27.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator29 = node28.new NodeIterator();
        node28.setLineno(13);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator32 = node28.spliterator();
        java.lang.String str33 = node28.toString();
        node22.addChildrenToBack(node28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node35 = node17.getChildBefore(node28);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        boolean boolean27 = node11.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node30 = node11.getChildBefore(node29);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(12, 25);
        java.lang.String str3 = node2.toString();
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        boolean boolean10 = node7.hasSideEffects();
        node5.addChildrenToFront(node7);
        boolean boolean12 = node7.hasSideEffects();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor13 = node7.iterator();
        node7.putIntProp(17, (int) 'a');
        com.google.javascript.rhino.head.Node node17 = node7.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (short) 0, "-1");
        node2.setString("23");
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        boolean boolean12 = node9.hasSideEffects();
        node7.addChildrenToFront(node9);
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str16 = node15.toString();
        boolean boolean17 = node15.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString("");
        node19.removeProp(23);
        node15.addChildToFront(node19);
        com.google.javascript.rhino.head.Node node23 = node15.getFirstChild();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node23.addChildrenToBack(node25);
        node9.addChildrenToBack(node25);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(14, node9, 26);
        java.lang.String str30 = node29.getJsDoc();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str35 = node34.toString();
        boolean boolean36 = node34.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("");
        node38.removeProp(23);
        node34.addChildToFront(node38);
        com.google.javascript.rhino.head.Node node42 = node34.getFirstChild();
        node42.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope45 = node42.getScope();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((int) ' ', node42, 2);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator48 = node42.spliterator();
        node42.putIntProp(100, (int) (byte) 0);
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str56 = node55.toString();
        boolean boolean57 = node55.hasConsistentReturnUsage();
        boolean boolean58 = node55.hasSideEffects();
        node53.addChildrenToFront(node55);
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str63 = node62.toString();
        boolean boolean64 = node62.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newString("");
        node66.removeProp(23);
        node62.addChildToFront(node66);
        com.google.javascript.rhino.head.Node node71 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean72 = node71.hasChildren();
        node62.addChildrenToFront(node71);
        int int74 = node71.getLineno();
        com.google.javascript.rhino.head.Node node76 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str77 = node76.toString();
        boolean boolean78 = node76.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node80 = com.google.javascript.rhino.head.Node.newString("");
        node80.removeProp(23);
        node76.addChildToFront(node80);
        com.google.javascript.rhino.head.Node node84 = node76.getFirstChild();
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node((int) (short) 0, node71, node76, 9);
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node((int) (short) 100, node42, node55, node71, 25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.addChildBefore(node29, node55);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node21 = node20.getLastSibling();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) ' ', node17, node20);
        java.lang.String str23 = node17.getString();
        java.lang.String str24 = node17.getJsDoc();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString("");
        node27.removeProp(23);
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasConsistentReturnUsage();
        boolean boolean35 = node32.hasSideEffects();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(0, node32);
        node27.addChildrenToBack(node36);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(9, node27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node17.removeChild(node38);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("23");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        boolean boolean13 = node10.hasSideEffects();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(0, node10);
        node5.addChildrenToBack(node14);
        node3.addChildToFront(node5);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor17 = node3.iterator();
        com.google.javascript.rhino.head.Node node18 = node3.getFirstChild();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString("");
        node26.removeProp(23);
        node22.addChildToFront(node26);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean32 = node31.hasChildren();
        node22.addChildrenToFront(node31);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasChildren();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) (short) -1, node31, node35, (int) (short) 10);
        com.google.javascript.rhino.head.Node node40 = node39.getLastChild();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str46 = node45.toString();
        boolean boolean47 = node45.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString("");
        node49.removeProp(23);
        node45.addChildToFront(node49);
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node((int) 'a', node45);
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str58 = node57.toString();
        com.google.javascript.rhino.head.Node node59 = node57.getLastChild();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (short) -1, node45, node55, node57, (int) (short) -1);
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 1, node57, 12);
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node(23);
        node65.removeProp(25);
        boolean boolean68 = node65.hasChildren();
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node((-1), node40, node57, node65);
        com.google.javascript.rhino.head.Node node70 = node69.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChildAfter(node18, node69);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        com.google.javascript.rhino.head.Node node20 = node19.getLastChild();
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) 7);
        node23.putIntProp(0, 18);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(0, node23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node28 = node20.getChildBefore(node23);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) '4', "40");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(0, node5, node8);
        int int10 = node5.getLineno();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator11 = node5.new NodeIterator();
        node5.removeProp(5);
        node2.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("");
        node20.removeProp(23);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str26 = node25.toString();
        boolean boolean27 = node25.hasConsistentReturnUsage();
        boolean boolean28 = node25.hasSideEffects();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(0, node25);
        node20.addChildrenToBack(node29);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node(9, node20);
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(13, node35);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(7, node35);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) 'a', node17, node31, node35, (int) (short) 1);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(7);
        node35.addChildrenToBack(node41);
        com.google.javascript.rhino.head.Node node43 = node41.getLastSibling();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(23, 6);
        int int47 = node46.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.addChildBefore(node41, node46);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(16, 5);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        node5.addChildToFront(node9);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean15 = node14.hasChildren();
        node5.addChildrenToFront(node14);
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str19 = node18.toString();
        boolean boolean20 = node18.hasConsistentReturnUsage();
        boolean boolean21 = node18.hasSideEffects();
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString("");
        node27.removeProp(23);
        node23.addChildToFront(node27);
        com.google.javascript.rhino.head.Node node31 = node23.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment32 = node23.getJsDocNode();
        node18.addChildToBack(node23);
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(15, node5, node18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node2 = node1.getNext();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        boolean boolean16 = node13.hasSideEffects();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(0, node13);
        node8.addChildrenToBack(node17);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(9, node8);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(13, node23);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(7, node23);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) 'a', node5, node19, node23, (int) (short) 1);
        boolean boolean28 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node30 = node5.setType(3);
        node5.removeChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node32 = node1.getChildBefore(node5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        boolean boolean2 = node1.hasSideEffects();
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node5 = node4.getLastSibling();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("");
        node12.removeProp(23);
        node8.addChildToFront(node12);
        com.google.javascript.rhino.head.Node node16 = node8.getFirstChild();
        node16.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope19 = node16.getScope();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) ' ', node16, 2);
        com.google.javascript.rhino.head.Node node22 = node16.getLastSibling();
        com.google.javascript.rhino.head.Node node23 = node16.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChildAfter(node5, node16);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(13, node6);
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(12);
        node10.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(6, node10);
        com.google.javascript.rhino.head.Node node15 = node14.getLastChild();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node6, node14, 0);
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node(17, node2, node17);
        com.google.javascript.rhino.head.Node node19 = node2.getNext();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString("");
        node25.removeProp(23);
        node21.addChildToFront(node25);
        com.google.javascript.rhino.head.Node node29 = node25.getLastChild();
        node25.setString("");
        com.google.javascript.rhino.head.Node node33 = node25.setType(25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node34 = node2.getChildBefore(node25);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) '4', "1");
        com.google.javascript.rhino.head.Node node3 = node2.getFirstChild();
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
        com.google.javascript.rhino.head.ast.Comment comment21 = node14.getJsDocNode();
        node14.putIntProp(4, 2);
        int int25 = node14.getType();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) (short) -1, 12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.addChildBefore(node14, node28);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str2 = node1.toString();
        com.google.javascript.rhino.head.ast.Comment comment3 = node1.getJsDocNode();
        com.google.javascript.rhino.head.ast.Comment comment4 = node1.getJsDocNode();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        node1.addChildToBack(node6);
        java.lang.String str10 = node6.getJsDoc();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString("");
        node17.removeProp(23);
        node13.addChildToFront(node17);
        com.google.javascript.rhino.head.Node node21 = node13.getFirstChild();
        node21.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope24 = node21.getScope();
        node21.setLineno(12);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) (byte) 0, node21, (int) '#');
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str33 = node32.toString();
        boolean boolean34 = node32.hasConsistentReturnUsage();
        boolean boolean35 = node32.hasSideEffects();
        node30.addChildrenToFront(node32);
        int int37 = node30.getType();
        com.google.javascript.rhino.head.ast.Comment comment38 = node30.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node6.replaceChildAfter(node28, node30);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        boolean boolean8 = node5.hasSideEffects();
        node3.addChildrenToFront(node5);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("");
        node15.removeProp(23);
        node11.addChildToFront(node15);
        com.google.javascript.rhino.head.Node node19 = node11.getFirstChild();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node19.addChildrenToBack(node21);
        node5.addChildrenToBack(node21);
        com.google.javascript.rhino.head.Node node25 = node5.setType(23);
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str29 = node28.toString();
        boolean boolean30 = node28.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString("");
        node32.removeProp(23);
        node28.addChildToFront(node32);
        java.lang.String str36 = node32.getString();
        com.google.javascript.rhino.head.ast.Scope scope37 = node32.getScope();
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str41 = node40.toString();
        boolean boolean42 = node40.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newString("");
        node44.removeProp(23);
        node40.addChildToFront(node44);
        com.google.javascript.rhino.head.Node node48 = node40.getFirstChild();
        node48.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope51 = node48.getScope();
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node((int) ' ', node48, 2);
        boolean boolean54 = node53.hasChildren();
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str58 = node57.toString();
        boolean boolean59 = node57.hasConsistentReturnUsage();
        boolean boolean60 = node57.hasSideEffects();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(0, node57);
        int int62 = node57.getLineno();
        node53.addChildToFront(node57);
        int int64 = node57.getType();
        boolean boolean65 = node57.hasChildren();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str68 = node67.toString();
        boolean boolean69 = node67.hasChildren();
        com.google.javascript.rhino.head.Node node73 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str74 = node73.toString();
        boolean boolean75 = node73.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node77 = com.google.javascript.rhino.head.Node.newString("");
        node77.removeProp(23);
        node73.addChildToFront(node77);
        com.google.javascript.rhino.head.Node node81 = node73.getFirstChild();
        node81.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope84 = node81.getScope();
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node((int) ' ', node81, 2);
        com.google.javascript.rhino.head.Node node87 = node81.getLastSibling();
        com.google.javascript.rhino.head.Node node90 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node91 = node90.getLastSibling();
        com.google.javascript.rhino.head.Node node92 = new com.google.javascript.rhino.head.Node((int) ' ', node87, node90);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor93 = node90.iterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator94 = node90.new NodeIterator();
        node67.addChildrenToBack(node90);
        com.google.javascript.rhino.head.Node node96 = new com.google.javascript.rhino.head.Node(0, node32, node57, node90);
        node5.addChildrenToFront(node90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node98 = node1.getChildBefore(node90);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("");
        int int2 = node1.getLineno();
        com.google.javascript.rhino.head.Node node4 = node1.setType((-1));
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator5 = node1.new NodeIterator();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("");
        node11.removeProp(23);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.hasConsistentReturnUsage();
        boolean boolean19 = node16.hasSideEffects();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node(0, node16);
        node11.addChildrenToBack(node20);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(9, node11);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(13, node26);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(7, node26);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) 'a', node8, node22, node26, (int) (short) 1);
        boolean boolean31 = node8.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node33 = node8.setType(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node33);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
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
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(97, node3, node9);
        com.google.javascript.rhino.head.Node node23 = node3.getLastChild();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("");
        node30.removeProp(23);
        node26.addChildToFront(node30);
        com.google.javascript.rhino.head.Node node34 = node26.getFirstChild();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node34.addChildrenToBack(node36);
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("");
        int int42 = node39.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) (short) 10, node34, node39);
        boolean boolean44 = node39.hasSideEffects();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(12);
        node46.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str53 = node52.toString();
        boolean boolean54 = node52.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newString("");
        node56.removeProp(23);
        node52.addChildToFront(node56);
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean62 = node61.hasChildren();
        node52.addChildrenToFront(node61);
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str66 = node65.toString();
        boolean boolean67 = node65.hasChildren();
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node((int) (short) -1, node61, node65, (int) (short) 10);
        node46.addChildToBack(node69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.addChildBefore(node39, node69);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, node2, node5);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("");
        node12.removeProp(23);
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        boolean boolean20 = node17.hasSideEffects();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(0, node17);
        node12.addChildrenToBack(node21);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(9, node12);
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(13, node27);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(7, node27);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) 'a', node9, node23, node27, (int) (short) 1);
        boolean boolean32 = node9.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node34 = node9.setType(3);
        int int35 = node9.getLineno();
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str38 = node37.toString();
        boolean boolean39 = node37.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newString("");
        node41.removeProp(23);
        node37.addChildToFront(node41);
        com.google.javascript.rhino.head.Node node45 = node37.getFirstChild();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node45.addChildrenToBack(node47);
        com.google.javascript.rhino.head.Node node49 = node45.getLastChild();
        com.google.javascript.rhino.head.Node node50 = node45.getNext();
        com.google.javascript.rhino.head.Node node51 = node45.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.replaceChild(node9, node51);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("");
        node39.removeProp(23);
        node35.addChildToFront(node39);
        com.google.javascript.rhino.head.Node node43 = node39.getLastChild();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString("1");
        node39.addChildrenToBack(node45);
        int int47 = node45.getLineno();
        node45.removeProp(16);
        node3.putProp(19, (java.lang.Object) 16);
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString(26, "32");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node53);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator44 = node38.spliterator();
        node38.putIntProp(100, (int) (byte) 0);
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str50 = node49.toString();
        boolean boolean51 = node49.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString("");
        node53.removeProp(23);
        node49.addChildToFront(node53);
        com.google.javascript.rhino.head.Node node57 = node49.getFirstChild();
        node57.setString("100");
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(5, node3, node38, node57, 17);
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str64 = node63.toString();
        boolean boolean65 = node63.hasConsistentReturnUsage();
        boolean boolean66 = node63.hasSideEffects();
        com.google.javascript.rhino.head.Node node68 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str69 = node68.toString();
        boolean boolean70 = node68.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node72 = com.google.javascript.rhino.head.Node.newString("");
        node72.removeProp(23);
        node68.addChildToFront(node72);
        com.google.javascript.rhino.head.Node node76 = node68.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment77 = node68.getJsDocNode();
        node63.addChildToBack(node68);
        boolean boolean79 = node68.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node80 = node68.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node57.removeChild(node68);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str34 = node33.toString();
        com.google.javascript.rhino.head.Node node35 = node33.getLastSibling();
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
        com.google.javascript.rhino.head.Node node52 = node46.getLastSibling();
        node35.addChildToFront(node52);
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node58 = node57.getLastSibling();
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node(13, node62);
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(12);
        node66.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(6, node66);
        com.google.javascript.rhino.head.Node node71 = node70.getLastChild();
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node62, node70, 0);
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node76.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node80 = new com.google.javascript.rhino.head.Node(20, node58, node62, node76);
        com.google.javascript.rhino.head.Node node81 = node58.getLastChild();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node85 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str86 = node85.toString();
        boolean boolean87 = node85.hasConsistentReturnUsage();
        boolean boolean88 = node85.hasSideEffects();
        node83.addChildrenToFront(node85);
        com.google.javascript.rhino.head.Node node90 = node85.getLastSibling();
        com.google.javascript.rhino.head.Node node92 = new com.google.javascript.rhino.head.Node((-1), node52, node58, node90, 3);
        boolean boolean93 = node58.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node19.removeChild(node58);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        com.google.javascript.rhino.head.ast.Comment comment31 = node26.getJsDocNode();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str35 = node34.toString();
        boolean boolean36 = node34.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("");
        node38.removeProp(23);
        node34.addChildToFront(node38);
        com.google.javascript.rhino.head.Node node42 = node34.getFirstChild();
        node42.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope45 = node42.getScope();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((int) ' ', node42, 2);
        com.google.javascript.rhino.head.Node node48 = node47.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node26.removeChild(node48);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        java.lang.String str9 = node5.getString();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("");
        node15.removeProp(23);
        node11.addChildToFront(node15);
        com.google.javascript.rhino.head.Node node19 = node11.getFirstChild();
        node19.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope22 = node19.getScope();
        node19.setLineno(12);
        node19.putProp(23, (java.lang.Object) 9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node28 = node5.getChildBefore(node19);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        boolean boolean11 = node8.hasSideEffects();
        node6.addChildrenToFront(node8);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(26, node3, node6, 20);
        java.lang.String str15 = node14.getJsDoc();
        node14.setLineno(2);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) 2);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node23 = node22.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator24 = node23.new NodeIterator();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(0, node23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.replaceChildAfter(node19, node25);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        boolean boolean14 = node10.hasChildren();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(97, (int) (byte) 100);
        node17.putIntProp(10, 13);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasConsistentReturnUsage();
        boolean boolean25 = node22.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.replaceChild(node17, node22);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, node2, node5);
        com.google.javascript.rhino.head.Node node7 = node6.getLastSibling();
        boolean boolean8 = node6.hasSideEffects();
        com.google.javascript.rhino.head.ast.Comment comment9 = node6.getJsDocNode();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node14 = node13.getLastSibling();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(13, node18);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node(12);
        node22.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(6, node22);
        com.google.javascript.rhino.head.Node node27 = node26.getLastChild();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node18, node26, 0);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node32.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(20, node14, node18, node32);
        java.lang.String str37 = node32.getJsDoc();
        boolean boolean38 = node32.hasSideEffects();
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str44 = node43.toString();
        boolean boolean45 = node43.hasConsistentReturnUsage();
        boolean boolean46 = node43.hasSideEffects();
        node41.addChildrenToFront(node43);
        double double48 = node43.getDouble();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str53 = node52.toString();
        boolean boolean54 = node52.hasConsistentReturnUsage();
        boolean boolean55 = node52.hasSideEffects();
        node50.addChildrenToFront(node52);
        node52.removeChildren();
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newString("hi!");
        node52.addChildrenToBack(node59);
        com.google.javascript.rhino.head.Node node62 = node52.setType((int) (short) -1);
        com.google.javascript.rhino.head.Node node64 = node62.setType(23);
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(16, node43, node64, 18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node6.replaceChildAfter(node32, node66);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(25, 24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node17 = node13.getChildBefore(node16);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) -1, 12);
        com.google.javascript.rhino.head.Node node4 = node2.setType(97);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newString("");
        node13.removeProp(23);
        node9.addChildToFront(node13);
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) 'a', node9);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        com.google.javascript.rhino.head.Node node23 = node21.getLastChild();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node((int) (short) -1, node9, node19, node21, (int) (short) -1);
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString("23");
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(26, node25, node27);
        int int31 = node28.getIntProp(3, 10);
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        boolean boolean38 = node35.hasSideEffects();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(0, node35);
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
        boolean boolean58 = node47.hasConsistentReturnUsage();
        node35.putProp((int) (short) 1, (java.lang.Object) node47);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) '#');
        com.google.javascript.rhino.head.Node node63 = new com.google.javascript.rhino.head.Node((int) (short) 100, node35, node61, 17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node28, node35);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(13, node47);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(7, node47);
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node49.addChildToFront(node51);
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(12);
        node55.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node(6, node55);
        com.google.javascript.rhino.head.Node node60 = node59.getLastChild();
        node49.addChildToFront(node59);
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node(97, node43, node49);
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(23, (int) (short) -1);
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str70 = node69.toString();
        boolean boolean71 = node69.hasConsistentReturnUsage();
        boolean boolean72 = node69.hasSideEffects();
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node(0, node69);
        com.google.javascript.rhino.head.Node node74 = node73.getLastChild();
        node73.removeChildren();
        com.google.javascript.rhino.head.Node node77 = new com.google.javascript.rhino.head.Node(19, node66, node73, 24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.addChildBefore(node49, node66);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newString(0, "100");
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str59 = node58.toString();
        boolean boolean60 = node58.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newString("");
        node62.removeProp(23);
        node58.addChildToFront(node62);
        com.google.javascript.rhino.head.Node node66 = node58.getFirstChild();
        node66.setLineno(18);
        boolean boolean69 = node66.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node70 = node66.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.addChildBefore(node56, node66);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator27 = node8.new NodeIterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator28 = node8.new NodeIterator();
        int int31 = node8.getIntProp((int) (byte) -1, 14);
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str35 = node34.toString();
        boolean boolean36 = node34.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node38 = com.google.javascript.rhino.head.Node.newString("");
        node38.removeProp(23);
        node34.addChildToFront(node38);
        com.google.javascript.rhino.head.Node node42 = node34.getFirstChild();
        node42.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope45 = node42.getScope();
        com.google.javascript.rhino.head.Node node47 = new com.google.javascript.rhino.head.Node((int) ' ', node42, 2);
        com.google.javascript.rhino.head.Node node48 = node42.getLastSibling();
        node42.removeChildren();
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(9, 41);
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str59 = node58.toString();
        boolean boolean60 = node58.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newString("");
        node62.removeProp(23);
        node58.addChildToFront(node62);
        com.google.javascript.rhino.head.Node node67 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean68 = node67.hasChildren();
        node58.addChildrenToFront(node67);
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str72 = node71.toString();
        boolean boolean73 = node71.hasChildren();
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node((int) (short) -1, node67, node71, (int) (short) 10);
        com.google.javascript.rhino.head.Node node77 = com.google.javascript.rhino.head.Node.newNumber((double) 7);
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node(0, node67, node77, (-1));
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node(23, (int) (short) -1);
        com.google.javascript.rhino.head.Node node86 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str87 = node86.toString();
        boolean boolean88 = node86.hasConsistentReturnUsage();
        boolean boolean89 = node86.hasSideEffects();
        com.google.javascript.rhino.head.Node node90 = new com.google.javascript.rhino.head.Node(0, node86);
        com.google.javascript.rhino.head.Node node91 = node90.getLastChild();
        node90.removeChildren();
        com.google.javascript.rhino.head.Node node94 = new com.google.javascript.rhino.head.Node(19, node83, node90, 24);
        com.google.javascript.rhino.head.Node node95 = new com.google.javascript.rhino.head.Node((int) (short) 100, node79, node94);
        com.google.javascript.rhino.head.Node node97 = new com.google.javascript.rhino.head.Node((-1), node53, node79, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.replaceChild(node42, node79);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(41, "23");
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("");
        node6.removeProp(23);
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
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str44 = node43.toString();
        boolean boolean45 = node43.hasConsistentReturnUsage();
        boolean boolean46 = node43.hasSideEffects();
        node41.addChildrenToFront(node43);
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str50 = node49.toString();
        boolean boolean51 = node49.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString("");
        node53.removeProp(23);
        node49.addChildToFront(node53);
        com.google.javascript.rhino.head.Node node57 = node49.getFirstChild();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node57.addChildrenToBack(node59);
        node43.addChildrenToBack(node59);
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node6, node30, node59);
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node(13, node59, 22);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator65 = node64.new NodeIterator();
        com.google.javascript.rhino.head.Node node68 = com.google.javascript.rhino.head.Node.newString(19, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.addChildBefore(node64, node68);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        node10.removeChildren();
        java.lang.String str18 = node10.getJsDoc();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str21 = node20.toString();
        boolean boolean22 = node20.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString("");
        node24.removeProp(23);
        node20.addChildToFront(node24);
        com.google.javascript.rhino.head.Node node28 = node20.getFirstChild();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node28.addChildrenToBack(node30);
        int int34 = node30.getIntProp(9, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node35 = node10.getChildBefore(node30);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node4 = node2.setType((int) (short) 10);
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
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str25 = node24.toString();
        boolean boolean26 = node24.hasConsistentReturnUsage();
        boolean boolean27 = node24.hasSideEffects();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(0, node24);
        int int29 = node24.getLineno();
        node20.addChildToFront(node24);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator31 = node20.new NodeIterator();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newString("");
        node37.removeProp(23);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str43 = node42.toString();
        boolean boolean44 = node42.hasConsistentReturnUsage();
        boolean boolean45 = node42.hasSideEffects();
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(0, node42);
        node37.addChildrenToBack(node46);
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(9, node37);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(13, node52);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(7, node52);
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) 'a', node34, node48, node52, (int) (short) 1);
        boolean boolean57 = node34.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node59 = node34.setType(3);
        java.lang.String str60 = node59.getJsDoc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChildAfter(node20, node59);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node9 = node5.getLastChild();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("1");
        node5.addChildrenToBack(node11);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString(12, "40");
        boolean boolean17 = node16.hasConsistentReturnUsage();
        int int20 = node16.getIntProp(15, 21);
        boolean boolean21 = node16.hasChildren();
        com.google.javascript.rhino.head.Node node23 = node16.setType(0);
        node5.putProp(17, (java.lang.Object) node16);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node16.removeChild(node26);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(97);
        int int2 = node1.getType();
        com.google.javascript.rhino.head.Node node4 = node1.setType(97);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor5 = node4.iterator();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("");
        node12.removeProp(23);
        node8.addChildToFront(node12);
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean18 = node17.hasChildren();
        node8.addChildrenToFront(node17);
        int int20 = node17.getLineno();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString("");
        node26.removeProp(23);
        node22.addChildToFront(node26);
        com.google.javascript.rhino.head.Node node30 = node22.getFirstChild();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (short) 0, node17, node22, 9);
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newString("");
        node39.removeProp(23);
        node35.addChildToFront(node39);
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean45 = node44.hasChildren();
        node35.addChildrenToFront(node44);
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str49 = node48.toString();
        boolean boolean50 = node48.hasConsistentReturnUsage();
        boolean boolean51 = node48.hasSideEffects();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str54 = node53.toString();
        boolean boolean55 = node53.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newString("");
        node57.removeProp(23);
        node53.addChildToFront(node57);
        com.google.javascript.rhino.head.Node node61 = node53.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment62 = node53.getJsDocNode();
        node48.addChildToBack(node53);
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node(15, node35, node48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.addChildBefore(node32, node64);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(5, "");
        int int3 = node2.getType();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        com.google.javascript.rhino.head.Node node7 = node5.getLastSibling();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("");
        node14.removeProp(23);
        node10.addChildToFront(node14);
        com.google.javascript.rhino.head.Node node18 = node10.getFirstChild();
        node18.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope21 = node18.getScope();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) ' ', node18, 2);
        com.google.javascript.rhino.head.Node node24 = node18.getLastSibling();
        node7.addChildToFront(node24);
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str29 = node28.toString();
        boolean boolean30 = node28.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString("");
        node32.removeProp(23);
        node28.addChildToFront(node32);
        com.google.javascript.rhino.head.Node node36 = node28.getFirstChild();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node36.addChildrenToBack(node38);
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newString("");
        int int44 = node41.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node((int) (short) 10, node36, node41);
        boolean boolean46 = node41.hasSideEffects();
        node24.addChildrenToFront(node41);
        com.google.javascript.rhino.head.Node node48 = node24.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node24);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(12);
        node2.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(6, node2);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("1");
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor10 = node9.iterator();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node9, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node13 = node2.getChildBefore(node9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) -1, 23);
        int int3 = node2.getLineno();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("12");
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        boolean boolean12 = node9.hasSideEffects();
        node7.addChildrenToFront(node9);
        com.google.javascript.rhino.head.Node node14 = node9.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChild(node5, node14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(32);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(13, node8);
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(12);
        node12.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(6, node12);
        com.google.javascript.rhino.head.Node node17 = node16.getLastChild();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node8, node16, 0);
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node(17, node4, node19);
        com.google.javascript.rhino.head.Node node21 = node20.getLastSibling();
        com.google.javascript.rhino.head.Node node22 = node20.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node23 = node1.getChildBefore(node20);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        int int28 = node27.getType();
        int int29 = node27.getLineno();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str32 = node31.toString();
        boolean boolean33 = node31.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newString("");
        node35.removeProp(23);
        node31.addChildToFront(node35);
        com.google.javascript.rhino.head.Node node39 = node31.getFirstChild();
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node39.addChildrenToBack(node41);
        com.google.javascript.rhino.head.Node node43 = node39.getLastChild();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node48 = node47.getLastSibling();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str53 = node52.toString();
        boolean boolean54 = node52.hasConsistentReturnUsage();
        boolean boolean55 = node52.hasSideEffects();
        node50.addChildrenToFront(node52);
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(26, node47, node50, 20);
        java.lang.String str59 = node58.getJsDoc();
        node58.setLineno(2);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator62 = node58.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node27.replaceChild(node39, node58);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.head.Node node5 = node2.setType((-1));
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str8 = node7.toString();
        node7.removeChildren();
        boolean boolean10 = node7.hasChildren();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("");
        node14.removeProp(23);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str20 = node19.toString();
        boolean boolean21 = node19.hasConsistentReturnUsage();
        boolean boolean22 = node19.hasSideEffects();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(0, node19);
        node14.addChildrenToBack(node23);
        node12.addChildToFront(node14);
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node(6, node2, node7, node12);
        com.google.javascript.rhino.head.Node node28 = node7.setType(8);
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(97);
        int int31 = node30.getType();
        com.google.javascript.rhino.head.Node node33 = node30.setType(97);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor34 = node33.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node35 = node28.getChildBefore(node33);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newNumber((double) 14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node34);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str60 = node59.toString();
        boolean boolean61 = node59.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newString("");
        node63.removeProp(23);
        node59.addChildToFront(node63);
        com.google.javascript.rhino.head.Node node68 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean69 = node68.hasChildren();
        node59.addChildrenToFront(node68);
        int int71 = node68.getLineno();
        int int72 = node68.getType();
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node68);
        node73.putIntProp(25, (int) (byte) 10);
        com.google.javascript.rhino.head.Node node78 = com.google.javascript.rhino.head.Node.newNumber(1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.replaceChildAfter(node73, node78);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(24);
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node(97, node2, 41);
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString("hi!");
        java.lang.String str7 = node6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node8 = node2.getChildBefore(node6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(13, node45);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node(12);
        node49.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(6, node49);
        com.google.javascript.rhino.head.Node node54 = node53.getLastChild();
        com.google.javascript.rhino.head.Node node56 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node45, node53, 0);
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newNumber((double) 1.0f);
        node53.addChildrenToFront(node58);
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str64 = node63.toString();
        boolean boolean65 = node63.hasConsistentReturnUsage();
        boolean boolean66 = node63.hasSideEffects();
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node(0, node63);
        com.google.javascript.rhino.head.Node node70 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str71 = node70.toString();
        boolean boolean72 = node70.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newString("");
        node74.removeProp(23);
        node70.addChildToFront(node74);
        com.google.javascript.rhino.head.Node node79 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean80 = node79.hasChildren();
        node70.addChildrenToFront(node79);
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str84 = node83.toString();
        boolean boolean85 = node83.hasChildren();
        com.google.javascript.rhino.head.Node node87 = new com.google.javascript.rhino.head.Node((int) (short) -1, node79, node83, (int) (short) 10);
        com.google.javascript.rhino.head.Node node90 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node92 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node63, node83, node90, (int) (short) 0);
        com.google.javascript.rhino.head.Node node94 = node92.setType(16);
        com.google.javascript.rhino.head.Node node95 = node92.getLastSibling();
        com.google.javascript.rhino.head.Node node97 = new com.google.javascript.rhino.head.Node(21, node53, node95, (int) (byte) 10);
        com.google.javascript.rhino.head.Node node98 = node97.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node97);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        com.google.javascript.rhino.head.Node node35 = node7.getNext();
        node7.setLineno(7);
        boolean boolean38 = node7.hasSideEffects();
        node7.setLineno(8);
        com.google.javascript.rhino.head.Node node42 = node7.setType(4);
        java.lang.String str43 = node7.getJsDoc();
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString("");
        node49.removeProp(23);
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str55 = node54.toString();
        boolean boolean56 = node54.hasConsistentReturnUsage();
        boolean boolean57 = node54.hasSideEffects();
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(0, node54);
        node49.addChildrenToBack(node58);
        com.google.javascript.rhino.head.Node node60 = new com.google.javascript.rhino.head.Node(9, node49);
        com.google.javascript.rhino.head.Node node64 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node(13, node64);
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(7, node64);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node((int) 'a', node46, node60, node64, (int) (short) 1);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(7);
        node64.addChildrenToBack(node70);
        com.google.javascript.rhino.head.Node node72 = node70.getLastSibling();
        com.google.javascript.rhino.head.Node node75 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str76 = node75.toString();
        boolean boolean77 = node75.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node79 = com.google.javascript.rhino.head.Node.newString("");
        node79.removeProp(23);
        node75.addChildToFront(node79);
        com.google.javascript.rhino.head.Node node83 = node75.getFirstChild();
        com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node83.addChildrenToBack(node85);
        com.google.javascript.rhino.head.Node node88 = com.google.javascript.rhino.head.Node.newString("");
        int int91 = node88.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node92 = new com.google.javascript.rhino.head.Node((int) (short) 10, node83, node88);
        com.google.javascript.rhino.head.Node node93 = node83.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.replaceChildAfter(node72, node93);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 0);
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
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str37 = node36.toString();
        com.google.javascript.rhino.head.Node node38 = node36.getFirstChild();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str42 = node41.toString();
        boolean boolean43 = node41.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString("");
        node45.removeProp(23);
        node41.addChildToFront(node45);
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean51 = node50.hasChildren();
        node41.addChildrenToFront(node50);
        int int53 = node50.getLineno();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str56 = node55.toString();
        boolean boolean57 = node55.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node59 = com.google.javascript.rhino.head.Node.newString("");
        node59.removeProp(23);
        node55.addChildToFront(node59);
        com.google.javascript.rhino.head.Node node63 = node55.getFirstChild();
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((int) (short) 0, node50, node55, 9);
        node36.addChildrenToFront(node65);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node(100, node31, node34, node36, (int) ' ');
        com.google.javascript.rhino.head.Node node69 = node34.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChildAfter(node24, node69);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) '#', (int) (short) 10);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        node4.addChildToFront(node8);
        com.google.javascript.rhino.head.Node node12 = node4.getFirstChild();
        node12.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope15 = node12.getScope();
        node12.setLineno(12);
        node12.putIntProp(16, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node(13, node3);
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node(7, node3);
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node5.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node9 = node5.getFirstChild();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString(23, "");
        java.lang.String str13 = node12.toString();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("");
        node20.removeProp(23);
        node16.addChildToFront(node20);
        com.google.javascript.rhino.head.Node node24 = node16.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment25 = node16.getJsDocNode();
        int int26 = node16.getType();
        node16.setDouble((double) 17);
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str31 = node30.toString();
        boolean boolean32 = node30.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString("");
        node34.removeProp(23);
        node30.addChildToFront(node34);
        java.lang.String str38 = node34.getString();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newString((int) (short) 0, "-1");
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node(10, node16, node34, node41, 14);
        int int44 = node43.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node9.replaceChildAfter(node12, node43);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node4 = node1.getLastSibling();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node51 = node4.getChildBefore(node47);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(8);
        com.google.javascript.rhino.head.Node node2 = node1.getFirstChild();
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node5 = node4.getLastSibling();
        boolean boolean6 = node5.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((-1.0d));
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node(4, (int) (short) 0);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        boolean boolean16 = node13.hasSideEffects();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(0, node13);
        node8.addChildrenToBack(node17);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(9, node8);
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) '#', node19);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str25 = node24.toString();
        boolean boolean26 = node24.hasConsistentReturnUsage();
        boolean boolean27 = node24.hasSideEffects();
        node22.addChildrenToFront(node24);
        node24.removeChildren();
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (short) 0);
        node19.addChildAfter(node24, node31);
        com.google.javascript.rhino.head.Node node33 = node31.getNext();
        int int34 = node31.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node4, node31);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 1.0f);
        boolean boolean2 = node1.hasSideEffects();
        int int5 = node1.getIntProp(9, 15);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString(4, "41");
        node8.setString("32");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node11 = node1.getChildBefore(node8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(15, "40");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str11 = node10.toString();
        com.google.javascript.rhino.head.Node node12 = node10.getFirstChild();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str16 = node15.toString();
        boolean boolean17 = node15.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString("");
        node19.removeProp(23);
        node15.addChildToFront(node19);
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean25 = node24.hasChildren();
        node15.addChildrenToFront(node24);
        int int27 = node24.getLineno();
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str30 = node29.toString();
        boolean boolean31 = node29.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("");
        node33.removeProp(23);
        node29.addChildToFront(node33);
        com.google.javascript.rhino.head.Node node37 = node29.getFirstChild();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) (short) 0, node24, node29, 9);
        node10.addChildrenToFront(node39);
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(100, node5, node8, node10, (int) ' ');
        com.google.javascript.rhino.head.Node node43 = node8.getNext();
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
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator60 = node54.spliterator();
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node(23);
        node54.addChildToBack(node62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChildAfter(node43, node54);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        node19.removeProp(24);
        com.google.javascript.rhino.head.Node node22 = node19.getLastChild();
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString("");
        int int26 = node25.getLineno();
        com.google.javascript.rhino.head.Node node28 = node25.setType((-1));
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator29 = node25.new NodeIterator();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(97, node25);
        java.lang.String str31 = node30.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node22.removeChild(node30);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(0, node21, node24);
        int int26 = node21.getLineno();
        boolean boolean27 = node21.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node28 = node10.getChildBefore(node21);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(0, 15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node27.removeChild(node32);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(25, 26);
        boolean boolean3 = node2.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        node5.addChildToFront(node9);
        java.lang.String str13 = node9.getString();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator14 = node9.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node15 = node2.getChildBefore(node9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(8, 0);
        java.lang.String str3 = node2.toString();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        node5.addChildToFront(node9);
        com.google.javascript.rhino.head.Node node13 = node5.getFirstChild();
        node13.setString("100");
        com.google.javascript.rhino.head.Node node16 = node13.getLastSibling();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(4, 8);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator20 = node19.new NodeIterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.addChildBefore(node16, node19);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        node1.addChildrenToFront(node3);
        int int8 = node1.getType();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("");
        node10.removeProp(23);
        node10.setLineno((int) '4');
        com.google.javascript.rhino.head.ast.Comment comment15 = node10.getJsDocNode();
        node1.addChildrenToBack(node10);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) 7);
        node21.putIntProp(0, 18);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(0, node21);
        java.lang.String str26 = node25.getJsDoc();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(23, node25, 7);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(2, node25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.removeChild(node29);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node9 = node1.getFirstChild();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node9.addChildrenToBack(node11);
        com.google.javascript.rhino.head.Node node13 = node9.getLastChild();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str16 = node15.toString();
        boolean boolean17 = node15.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node18 = node15.getLastSibling();
        node18.setDouble((double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node21 = node13.getChildBefore(node18);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean11 = node10.hasChildren();
        node1.addChildrenToFront(node10);
        node10.setDouble((double) (-1));
        boolean boolean15 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node21 = node20.getLastSibling();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str26 = node25.toString();
        boolean boolean27 = node25.hasConsistentReturnUsage();
        boolean boolean28 = node25.hasSideEffects();
        node23.addChildrenToFront(node25);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node(26, node20, node23, 20);
        boolean boolean32 = node31.hasSideEffects();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(97);
        int int35 = node34.getType();
        com.google.javascript.rhino.head.Node node37 = node34.setType(97);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(22, node31, node37, 25);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) 0.0f);
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node(7);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(22, node42, node44);
        node42.setLineno(6);
        com.google.javascript.rhino.head.Node node48 = node42.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.addChildBefore(node39, node42);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        node2.addChildrenToBack(node36);
        java.lang.Object obj68 = node36.getProp((int) (short) 0);
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node((int) '#', node36, (int) ' ');
        node36.removeChildren();
        java.lang.String str72 = node36.getJsDoc();
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newString("");
        boolean boolean75 = node74.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node76 = node36.getChildBefore(node74);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(0);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        boolean boolean13 = node10.hasSideEffects();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(0, node10);
        node5.addChildrenToBack(node14);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(9, node5);
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
        com.google.javascript.rhino.head.Node node77 = new com.google.javascript.rhino.head.Node((int) (short) -1, node2, node16, node46);
        com.google.javascript.rhino.head.Node node79 = com.google.javascript.rhino.head.Node.newString("-1");
        node79.removeProp(25);
        node2.addChildToBack(node79);
        java.lang.String str83 = node79.toString();
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node(0, 1);
        com.google.javascript.rhino.head.Node node89 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node90 = node89.getLastSibling();
        node86.putProp(20, (java.lang.Object) node90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node92 = node79.getChildBefore(node86);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(25, 0);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node6 = node5.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = node6.new NodeIterator();
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(0, node6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        com.google.javascript.rhino.head.Node node18 = node11.getLastSibling();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator19 = node11.spliterator();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(9, node11, 10);
        int int22 = node11.getLineno();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str25 = node24.toString();
        boolean boolean26 = node24.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString("");
        node28.removeProp(23);
        node24.addChildToFront(node28);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean34 = node33.hasChildren();
        java.lang.String str35 = node33.getJsDoc();
        node28.addChildrenToBack(node33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.removeChild(node28);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("");
        node1.removeProp(23);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor4 = node1.iterator();
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("");
        node12.removeProp(23);
        node8.addChildToFront(node12);
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean18 = node17.hasChildren();
        node8.addChildrenToFront(node17);
        int int20 = node17.getLineno();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString("");
        node26.removeProp(23);
        node22.addChildToFront(node26);
        com.google.javascript.rhino.head.Node node30 = node22.getFirstChild();
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node((int) (short) 0, node17, node22, 9);
        boolean boolean33 = node17.hasSideEffects();
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node37 = node36.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator38 = node37.new NodeIterator();
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
        java.lang.String str56 = node40.toString();
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(0, node17, node37, node40, 1);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator59 = node40.new NodeIterator();
        com.google.javascript.rhino.head.Node node60 = nodeIterator59.next();
        java.lang.String str61 = node60.getJsDoc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node62 = node1.getChildBefore(node60);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        java.lang.String str20 = node11.getJsDoc();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str26 = node25.toString();
        boolean boolean27 = node25.hasConsistentReturnUsage();
        boolean boolean28 = node25.hasSideEffects();
        node23.addChildrenToFront(node25);
        node25.removeChildren();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString("hi!");
        node25.addChildrenToBack(node32);
        boolean boolean34 = node25.hasSideEffects();
        com.google.javascript.rhino.head.Node node35 = node25.getFirstChild();
        boolean boolean36 = node25.hasSideEffects();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator37 = node25.new NodeIterator();
        com.google.javascript.rhino.head.Node node38 = nodeIterator37.next();
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newString("");
        node40.removeProp(23);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor43 = node40.iterator();
        java.lang.Object obj45 = node40.getProp((int) (byte) 1);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator46 = node40.new NodeIterator();
        java.lang.String str47 = node40.getJsDoc();
        java.lang.String str48 = node40.getJsDoc();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node(2, node38, node40, (int) (byte) 0);
        node38.setString("11");
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str57 = node56.toString();
        boolean boolean58 = node56.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node60 = com.google.javascript.rhino.head.Node.newString("");
        node60.removeProp(23);
        node56.addChildToFront(node60);
        com.google.javascript.rhino.head.Node node64 = node56.getFirstChild();
        node64.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope67 = node64.getScope();
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node((int) ' ', node64, 2);
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str75 = node74.toString();
        boolean boolean76 = node74.hasConsistentReturnUsage();
        boolean boolean77 = node74.hasSideEffects();
        node72.addChildrenToFront(node74);
        node74.removeChildren();
        com.google.javascript.rhino.head.Node node81 = com.google.javascript.rhino.head.Node.newString("hi!");
        node74.addChildrenToBack(node81);
        int int85 = node81.getIntProp(0, 22);
        node64.putProp(15, (java.lang.Object) 22);
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node((int) (short) -1, node64, 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node11.replaceChild(node38, node64);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) '#');
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        node7.removeProp(23);
        node3.addChildToFront(node7);
        com.google.javascript.rhino.head.Node node11 = node3.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment12 = node3.getJsDocNode();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node17 = node16.getLastSibling();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str22 = node21.toString();
        boolean boolean23 = node21.hasConsistentReturnUsage();
        boolean boolean24 = node21.hasSideEffects();
        node19.addChildrenToFront(node21);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node(26, node16, node19, 20);
        boolean boolean28 = node27.hasSideEffects();
        com.google.javascript.rhino.head.Node node29 = node27.getLastChild();
        int int32 = node27.getIntProp(97, (int) (short) 10);
        com.google.javascript.rhino.head.Node node34 = node27.setType(22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node3, node34);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString("");
        int int50 = node47.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str57 = node56.toString();
        boolean boolean58 = node56.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node60 = com.google.javascript.rhino.head.Node.newString("");
        node60.removeProp(23);
        node56.addChildToFront(node60);
        com.google.javascript.rhino.head.Node node64 = node56.getFirstChild();
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node64.addChildrenToBack(node66);
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newString("");
        int int72 = node69.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node((int) (short) 10, node64, node69);
        com.google.javascript.rhino.head.Node node75 = node64.setType(18);
        node47.addChildAfter(node53, node75);
        com.google.javascript.rhino.head.Node node78 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean79 = node78.hasSideEffects();
        node53.addChildrenToFront(node78);
        com.google.javascript.rhino.head.Node node81 = node53.getNext();
        int int82 = node53.getLineno();
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node((int) 'a', node53, (int) (byte) 100);
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.replaceChildAfter(node84, node86);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node3 = node2.getLastSibling();
        int int4 = node2.getLineno();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator5 = node2.spliterator();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str15 = node14.toString();
        com.google.javascript.rhino.head.Node node16 = node14.getFirstChild();
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
        node14.addChildrenToFront(node43);
        com.google.javascript.rhino.head.Node node46 = new com.google.javascript.rhino.head.Node(100, node9, node12, node14, (int) ' ');
        com.google.javascript.rhino.head.Node node47 = node14.getLastSibling();
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(21, node47);
        java.lang.Object obj50 = node48.getProp((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node51 = node2.getChildBefore(node48);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str31 = node30.toString();
        boolean boolean32 = node30.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString("");
        node34.removeProp(23);
        node30.addChildToFront(node34);
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean40 = node39.hasChildren();
        java.lang.String str41 = node39.getJsDoc();
        node34.addChildrenToBack(node39);
        com.google.javascript.rhino.head.ast.Scope scope43 = node34.getScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node44 = node28.getChildBefore(node34);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str30 = node29.toString();
        boolean boolean31 = node29.hasConsistentReturnUsage();
        boolean boolean32 = node29.hasSideEffects();
        node29.setLineno((int) '4');
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str37 = node36.toString();
        com.google.javascript.rhino.head.ast.Comment comment38 = node36.getJsDocNode();
        com.google.javascript.rhino.head.ast.Comment comment39 = node36.getJsDocNode();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str42 = node41.toString();
        boolean boolean43 = node41.hasConsistentReturnUsage();
        node36.addChildToBack(node41);
        java.lang.String str45 = node41.getJsDoc();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node(13, node49);
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node(7, node49);
        node51.removeChildren();
        node41.addChildrenToFront(node51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node27.replaceChild(node29, node41);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) '4', "hi!");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.ast.Comment comment5 = node4.getJsDocNode();
        java.lang.String str6 = node4.getJsDoc();
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(40, 8);
        node2.addChildAfter(node4, node9);
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str15 = node14.toString();
        boolean boolean16 = node14.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newString("");
        node18.removeProp(23);
        node14.addChildToFront(node18);
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) 'a', node14);
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
        com.google.javascript.rhino.head.Node node40 = node34.getLastSibling();
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node44 = node43.getLastSibling();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node((int) ' ', node40, node43);
        node14.addChildrenToFront(node45);
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(26, node45, 11);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator49 = node45.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node50 = node2.getChildBefore(node45);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node6 = node5.getLastSibling();
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        boolean boolean13 = node10.hasSideEffects();
        node8.addChildrenToFront(node10);
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(26, node5, node8, 20);
        int int17 = node8.getLineno();
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
        node37.removeProp(24);
        com.google.javascript.rhino.head.Node node40 = node37.getLastChild();
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) 0);
        com.google.javascript.rhino.head.ast.Comment comment43 = node42.getJsDocNode();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node(12, node8, node37, node42);
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(0, node42);
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node50 = node49.getLastSibling();
        com.google.javascript.rhino.head.Node node54 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(13, node54);
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(12);
        node58.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node(6, node58);
        com.google.javascript.rhino.head.Node node63 = node62.getLastChild();
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node54, node62, 0);
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node68.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(20, node50, node54, node68);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node50.addChildToFront(node74);
        com.google.javascript.rhino.head.Node node76 = node50.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node77 = node42.getChildBefore(node50);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str2 = node1.toString();
        com.google.javascript.rhino.head.Node node3 = node1.getFirstChild();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor4 = node1.iterator();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(0, node7, node10);
        int int12 = node7.getLineno();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator13 = node7.new NodeIterator();
        node7.removeProp(5);
        java.lang.String str16 = node7.getJsDoc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node17 = node1.getChildBefore(node7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node((-1), 0);
        com.google.javascript.rhino.head.Node node4 = new com.google.javascript.rhino.head.Node((int) (byte) 0, node3);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node9 = node8.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator10 = node9.new NodeIterator();
        node9.setLineno(13);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator13 = node9.spliterator();
        java.lang.String str14 = node9.toString();
        int int15 = node9.getType();
        node4.putProp(24, (java.lang.Object) node9);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str21 = node20.toString();
        boolean boolean22 = node20.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString("");
        node24.removeProp(23);
        node20.addChildToFront(node24);
        com.google.javascript.rhino.head.Node node28 = node20.getFirstChild();
        node28.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope31 = node28.getScope();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) ' ', node28, 2);
        com.google.javascript.rhino.head.Node node34 = node28.getLastSibling();
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node38 = node37.getLastSibling();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) ' ', node34, node37);
        boolean boolean40 = node37.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node41 = node37.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node42 = node9.getChildBefore(node41);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString("");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.head.Node node5 = node2.setType((-1));
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(23, node5, 22);
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
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newNumber((double) 7);
        com.google.javascript.rhino.head.Node node32 = new com.google.javascript.rhino.head.Node(0, node20, node30, (-1));
        com.google.javascript.rhino.head.Node node33 = node32.getLastSibling();
        com.google.javascript.rhino.head.Node node34 = node32.getLastChild();
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
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newString("-1");
        node63.removeProp(25);
        com.google.javascript.rhino.head.Node node67 = new com.google.javascript.rhino.head.Node(7, node55, node63, 1);
        com.google.javascript.rhino.head.ast.Scope scope68 = node63.getScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.replaceChildAfter(node32, node63);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str64 = node63.toString();
        boolean boolean65 = node63.hasConsistentReturnUsage();
        boolean boolean66 = node63.hasSideEffects();
        node61.addChildrenToFront(node63);
        node63.removeChildren();
        com.google.javascript.rhino.head.Node node70 = com.google.javascript.rhino.head.Node.newString("hi!");
        node63.addChildrenToBack(node70);
        com.google.javascript.rhino.head.Node node73 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str74 = node73.toString();
        boolean boolean75 = node73.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node77 = com.google.javascript.rhino.head.Node.newString("");
        node77.removeProp(23);
        node73.addChildToFront(node77);
        com.google.javascript.rhino.head.Node node81 = node73.getFirstChild();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node81.addChildrenToBack(node83);
        com.google.javascript.rhino.head.Node node85 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node43, node63, node83);
        node63.setLineno(7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node88 = node21.getChildBefore(node63);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.hasConsistentReturnUsage();
        boolean boolean7 = node4.hasSideEffects();
        node2.addChildrenToFront(node4);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("");
        node14.removeProp(23);
        node10.addChildToFront(node14);
        com.google.javascript.rhino.head.Node node18 = node10.getFirstChild();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node18.addChildrenToBack(node20);
        node4.addChildrenToBack(node20);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString((int) (byte) -1, "100");
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newString("");
        node29.removeProp(23);
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str35 = node34.toString();
        boolean boolean36 = node34.hasConsistentReturnUsage();
        boolean boolean37 = node34.hasSideEffects();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(0, node34);
        node29.addChildrenToBack(node38);
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node(9, node29);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) '#', node40);
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str46 = node45.toString();
        boolean boolean47 = node45.hasConsistentReturnUsage();
        boolean boolean48 = node45.hasSideEffects();
        node43.addChildrenToFront(node45);
        node45.removeChildren();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) (short) 0);
        node40.addChildAfter(node45, node52);
        com.google.javascript.rhino.head.Node node54 = node40.getLastSibling();
        com.google.javascript.rhino.head.Node node55 = new com.google.javascript.rhino.head.Node(23, node4, node25, node40);
        com.google.javascript.rhino.head.Node node58 = com.google.javascript.rhino.head.Node.newString(12, "40");
        com.google.javascript.rhino.head.Node node64 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str65 = node64.toString();
        boolean boolean66 = node64.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node68 = com.google.javascript.rhino.head.Node.newString("");
        node68.removeProp(23);
        node64.addChildToFront(node68);
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node((int) 'a', node64);
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node76 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str77 = node76.toString();
        com.google.javascript.rhino.head.Node node78 = node76.getLastChild();
        com.google.javascript.rhino.head.Node node80 = new com.google.javascript.rhino.head.Node((int) (short) -1, node64, node74, node76, (int) (short) -1);
        com.google.javascript.rhino.head.Node node82 = com.google.javascript.rhino.head.Node.newString("23");
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node(26, node80, node82);
        com.google.javascript.rhino.head.Node node87 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node(13, node87);
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node(7, node87);
        com.google.javascript.rhino.head.Node node90 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node83, node87);
        int int91 = node90.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node25.addChildBefore(node58, node90);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node(25, 26);
        com.google.javascript.rhino.head.ast.Comment comment4 = node3.getJsDocNode();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(7, node3, 25);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean10 = node9.hasChildren();
        com.google.javascript.rhino.head.Node node11 = node9.getLastSibling();
        node3.putProp((int) '#', (java.lang.Object) node9);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("");
        node20.removeProp(23);
        node16.addChildToFront(node20);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean26 = node25.hasChildren();
        node16.addChildrenToFront(node25);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str30 = node29.toString();
        boolean boolean31 = node29.hasChildren();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) (short) -1, node25, node29, (int) (short) 10);
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) 7);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(0, node25, node35, (-1));
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str44 = node43.toString();
        boolean boolean45 = node43.hasConsistentReturnUsage();
        boolean boolean46 = node43.hasSideEffects();
        node41.addChildrenToFront(node43);
        com.google.javascript.rhino.head.Node node48 = node43.getLastSibling();
        int int49 = node43.getLineno();
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str52 = node51.toString();
        boolean boolean53 = node51.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString("");
        node55.removeProp(23);
        node51.addChildToFront(node55);
        com.google.javascript.rhino.head.Node node60 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean61 = node60.hasChildren();
        node51.addChildrenToFront(node60);
        int int63 = node60.getLineno();
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((int) (byte) 1);
        node65.removeProp((int) (short) 10);
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node((int) (short) 10, node43, node60, node65, 0);
        node35.putProp(15, (java.lang.Object) 0);
        java.lang.String str71 = node35.toString();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator72 = node35.spliterator();
        boolean boolean73 = node35.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node74 = node9.getChildBefore(node35);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("12");
        java.lang.String str2 = node1.getJsDoc();
        com.google.javascript.rhino.head.Node node3 = node1.getLastChild();
        java.lang.String str4 = node1.getJsDoc();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(32);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(23);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str13 = node12.toString();
        boolean boolean14 = node12.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString("");
        node16.removeProp(23);
        node12.addChildToFront(node16);
        node9.putProp((int) ' ', (java.lang.Object) node16);
        com.google.javascript.rhino.head.ast.Comment comment21 = node9.getJsDocNode();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 1, node9);
        boolean boolean23 = node9.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.addChildBefore(node6, node9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(0, node3);
        int int8 = node3.getLineno();
        node3.removeProp(0);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("12");
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(32, node3, node12, (int) (byte) 1);
        java.lang.String str15 = node12.getString();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        node21.removeProp(23);
        node17.addChildToFront(node21);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean27 = node26.hasChildren();
        node17.addChildrenToFront(node26);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator29 = node26.new NodeIterator();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str32 = node31.toString();
        com.google.javascript.rhino.head.Node node33 = node31.getLastSibling();
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str37 = node36.toString();
        boolean boolean38 = node36.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newString("");
        node40.removeProp(23);
        node36.addChildToFront(node40);
        com.google.javascript.rhino.head.Node node44 = node36.getFirstChild();
        node44.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope47 = node44.getScope();
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) ' ', node44, 2);
        com.google.javascript.rhino.head.Node node50 = node44.getLastSibling();
        node33.addChildToFront(node50);
        node26.addChildrenToFront(node33);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.replaceChild(node26, node54);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        boolean boolean32 = node30.hasChildren();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str38 = node37.toString();
        boolean boolean39 = node37.hasConsistentReturnUsage();
        boolean boolean40 = node37.hasSideEffects();
        node35.addChildrenToFront(node37);
        com.google.javascript.rhino.head.Node node42 = node37.getLastSibling();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) ' ', node37);
        java.lang.String str44 = node37.toString();
        node37.setDouble((double) 10L);
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(17);
        node37.addChildrenToBack(node48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node30.removeChild(node37);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) '4', "1");
        java.lang.String str3 = node2.toString();
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
        com.google.javascript.rhino.head.Node node61 = node60.getLastChild();
        com.google.javascript.rhino.head.Node node65 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(13, node65);
        com.google.javascript.rhino.head.Node node69 = new com.google.javascript.rhino.head.Node(12);
        node69.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node(6, node69);
        com.google.javascript.rhino.head.Node node74 = node73.getLastChild();
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node65, node73, 0);
        node73.setLineno(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.addChildBefore(node60, node73);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        com.google.javascript.rhino.head.Node node35 = node7.getNext();
        boolean boolean36 = node7.hasSideEffects();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str40 = node39.toString();
        boolean boolean41 = node39.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString("");
        node43.removeProp(23);
        node39.addChildToFront(node43);
        com.google.javascript.rhino.head.Node node47 = node39.getFirstChild();
        node47.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope50 = node47.getScope();
        node47.setLineno(12);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node((int) (byte) 0, node47, (int) '#');
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str57 = node56.toString();
        boolean boolean58 = node56.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node59 = node56.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.replaceChildAfter(node47, node59);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        boolean boolean17 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("");
        node20.removeProp(23);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str26 = node25.toString();
        boolean boolean27 = node25.hasConsistentReturnUsage();
        boolean boolean28 = node25.hasSideEffects();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(0, node25);
        node20.addChildrenToBack(node29);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node(9, node20);
        int int34 = node20.getIntProp((int) (short) -1, 14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node35 = node10.getChildBefore(node20);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString(10, "100");
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(13, node29);
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node(7, node29);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node31.addChildToFront(node33);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(12);
        node37.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node(6, node37);
        com.google.javascript.rhino.head.Node node42 = node41.getLastChild();
        node31.addChildToFront(node41);
        node25.addChildToFront(node31);
        java.lang.Object obj46 = node25.getProp(21);
        node25.removeChildren();
        int int48 = node25.getLineno();
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(13, node52);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(7, node52);
        node54.removeChildren();
        java.lang.String str56 = node54.getJsDoc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.replaceChildAfter(node25, node54);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        boolean boolean17 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString(5, "");
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString(8, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.replaceChild(node20, node23);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str28 = node27.toString();
        boolean boolean29 = node27.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("");
        node31.removeProp(23);
        node27.addChildToFront(node31);
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean37 = node36.hasChildren();
        node27.addChildrenToFront(node36);
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str41 = node40.toString();
        boolean boolean42 = node40.hasChildren();
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (short) -1, node36, node40, (int) (short) 10);
        com.google.javascript.rhino.head.Node node45 = node44.getLastChild();
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newNumber((double) 0.0f);
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node(7);
        com.google.javascript.rhino.head.Node node51 = new com.google.javascript.rhino.head.Node(22, node48, node50);
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(6, node22, node44, node50, 100);
        com.google.javascript.rhino.head.Node node54 = new com.google.javascript.rhino.head.Node(0, node22);
        node54.removeChildren();
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node(12);
        node58.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node62 = new com.google.javascript.rhino.head.Node(6, node58);
        com.google.javascript.rhino.head.Node node63 = node62.getNext();
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newString("");
        int int67 = node66.getLineno();
        com.google.javascript.rhino.head.Node node69 = node66.setType((-1));
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str72 = node71.toString();
        node71.removeChildren();
        boolean boolean74 = node71.hasChildren();
        com.google.javascript.rhino.head.Node node76 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node78 = com.google.javascript.rhino.head.Node.newString("");
        node78.removeProp(23);
        com.google.javascript.rhino.head.Node node83 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str84 = node83.toString();
        boolean boolean85 = node83.hasConsistentReturnUsage();
        boolean boolean86 = node83.hasSideEffects();
        com.google.javascript.rhino.head.Node node87 = new com.google.javascript.rhino.head.Node(0, node83);
        node78.addChildrenToBack(node87);
        node76.addChildToFront(node78);
        com.google.javascript.rhino.head.Node node90 = new com.google.javascript.rhino.head.Node(6, node66, node71, node76);
        com.google.javascript.rhino.head.Node node92 = node71.setType(8);
        boolean boolean93 = node71.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node54.replaceChildAfter(node62, node71);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        int int17 = node12.getType();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str20 = node19.toString();
        boolean boolean21 = node19.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString("");
        node23.removeProp(23);
        node19.addChildToFront(node23);
        com.google.javascript.rhino.head.Node node27 = node19.getFirstChild();
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node27.addChildrenToBack(node29);
        com.google.javascript.rhino.head.Node node31 = node29.getLastChild();
        java.lang.String str32 = node29.getJsDoc();
        java.lang.Object obj34 = node29.getProp(0);
        com.google.javascript.rhino.head.Node node35 = node29.getLastSibling();
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str38 = node37.toString();
        boolean boolean39 = node37.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newString("");
        node41.removeProp(23);
        node37.addChildToFront(node41);
        com.google.javascript.rhino.head.Node node45 = node37.getFirstChild();
        node45.setLineno(18);
        boolean boolean48 = node45.hasConsistentReturnUsage();
        node45.putIntProp(23, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.replaceChild(node29, node45);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) (-1L));
        boolean boolean2 = node1.hasSideEffects();
        com.google.javascript.rhino.head.Node node3 = node1.getLastSibling();
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node(23);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("");
        node12.removeProp(23);
        node8.addChildToFront(node12);
        node5.putProp((int) ' ', (java.lang.Object) node12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("24");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) 10.0f);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator4 = node3.new NodeIterator();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("");
        node11.removeProp(23);
        node7.addChildToFront(node11);
        com.google.javascript.rhino.head.Node node15 = node7.getFirstChild();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node15.addChildrenToBack(node17);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("");
        int int23 = node20.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) (short) 10, node15, node20);
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node29 = node28.getLastSibling();
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str34 = node33.toString();
        boolean boolean35 = node33.hasConsistentReturnUsage();
        boolean boolean36 = node33.hasSideEffects();
        node31.addChildrenToFront(node33);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(26, node28, node31, 20);
        boolean boolean40 = node39.hasSideEffects();
        java.lang.String str41 = node39.getJsDoc();
        node20.addChildToFront(node39);
        node3.addChildToFront(node20);
        boolean boolean44 = node3.hasChildren();
        node3.removeChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node9 = node1.getFirstChild();
        node9.setLineno(18);
        boolean boolean12 = node9.hasChildren();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str16 = node15.toString();
        boolean boolean17 = node15.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newString("");
        node19.removeProp(23);
        node15.addChildToFront(node19);
        com.google.javascript.rhino.head.Node node23 = node15.getFirstChild();
        node23.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope26 = node23.getScope();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) ' ', node23, 2);
        boolean boolean29 = node28.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node9.removeChild(node28);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(3, 3);
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node(12);
        node5.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(6, node5);
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(4, 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChildAfter(node9, node12);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(100, "52");
        com.google.javascript.rhino.head.Node node3 = node2.getLastSibling();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str8 = node7.toString();
        boolean boolean9 = node7.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("");
        node11.removeProp(23);
        node7.addChildToFront(node11);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean17 = node16.hasChildren();
        node7.addChildrenToFront(node16);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str21 = node20.toString();
        boolean boolean22 = node20.hasConsistentReturnUsage();
        boolean boolean23 = node20.hasSideEffects();
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str26 = node25.toString();
        boolean boolean27 = node25.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newString("");
        node29.removeProp(23);
        node25.addChildToFront(node29);
        com.google.javascript.rhino.head.Node node33 = node25.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment34 = node25.getJsDocNode();
        node20.addChildToBack(node25);
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(15, node7, node20);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(100, node36, (int) '4');
        com.google.javascript.rhino.head.Node node40 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str43 = node42.toString();
        boolean boolean44 = node42.hasConsistentReturnUsage();
        boolean boolean45 = node42.hasSideEffects();
        node40.addChildrenToFront(node42);
        node42.removeChildren();
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newString("hi!");
        node42.addChildrenToBack(node49);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor51 = node49.iterator();
        node49.setLineno((int) (byte) -1);
        node49.removeProp(32);
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newString("-1");
        node57.removeProp(25);
        node49.addChildToBack(node57);
        com.google.javascript.rhino.head.Node node61 = node49.getFirstChild();
        boolean boolean62 = node61.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.replaceChildAfter(node38, node61);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        node1.addChildrenToFront(node3);
        node3.removeChildren();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("hi!");
        node3.addChildrenToBack(node10);
        java.lang.String str12 = node10.getJsDoc();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str18 = node17.toString();
        boolean boolean19 = node17.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node21 = com.google.javascript.rhino.head.Node.newString("");
        node21.removeProp(23);
        node17.addChildToFront(node21);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node((int) 'a', node17);
        com.google.javascript.rhino.head.Node node27 = com.google.javascript.rhino.head.Node.newString("-1");
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str30 = node29.toString();
        com.google.javascript.rhino.head.Node node31 = node29.getLastChild();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) (short) -1, node17, node27, node29, (int) (short) -1);
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newString("23");
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node(26, node33, node35);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor37 = node35.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.removeChild(node35);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(24, "hi!");
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node7 = node6.getLastSibling();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(13, node11);
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(12);
        node15.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(6, node15);
        com.google.javascript.rhino.head.Node node20 = node19.getLastChild();
        com.google.javascript.rhino.head.Node node22 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node11, node19, 0);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node25.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(20, node7, node11, node25);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator30 = node11.new NodeIterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node31 = node2.getChildBefore(node11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node(12);
        node3.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(6, node3);
        com.google.javascript.rhino.head.Node node8 = node7.getLastChild();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node12 = node11.getLastSibling();
        com.google.javascript.rhino.head.Node node13 = node11.getLastSibling();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str16 = node15.toString();
        boolean boolean17 = node15.hasConsistentReturnUsage();
        boolean boolean18 = node15.hasSideEffects();
        node15.setLineno((int) '4');
        com.google.javascript.rhino.head.Node node22 = node15.setType((int) '4');
        int int23 = node22.getLineno();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(24, node8, node11, node22, 8);
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
        java.lang.Object obj47 = node29.getProp(0);
        java.lang.String str48 = node29.getJsDoc();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator49 = node29.spliterator();
        com.google.javascript.rhino.head.Node node50 = node29.getLastChild();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString("");
        int int54 = node53.getLineno();
        com.google.javascript.rhino.head.Node node56 = node53.setType((-1));
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str59 = node58.toString();
        node58.removeChildren();
        boolean boolean61 = node58.hasChildren();
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node65 = com.google.javascript.rhino.head.Node.newString("");
        node65.removeProp(23);
        com.google.javascript.rhino.head.Node node70 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str71 = node70.toString();
        boolean boolean72 = node70.hasConsistentReturnUsage();
        boolean boolean73 = node70.hasSideEffects();
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(0, node70);
        node65.addChildrenToBack(node74);
        node63.addChildToFront(node65);
        com.google.javascript.rhino.head.Node node77 = new com.google.javascript.rhino.head.Node(6, node53, node58, node63);
        com.google.javascript.rhino.head.Node node78 = node63.getLastChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.addChildBefore(node50, node63);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator16 = node10.spliterator();
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str20 = node19.toString();
        com.google.javascript.rhino.head.ast.Comment comment21 = node19.getJsDocNode();
        node10.putProp((int) '#', (java.lang.Object) node19);
        java.lang.String str23 = node10.toString();
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newString(41, "23");
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor27 = node26.iterator();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str31 = node30.toString();
        boolean boolean32 = node30.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node34 = com.google.javascript.rhino.head.Node.newString("");
        node34.removeProp(23);
        node30.addChildToFront(node34);
        com.google.javascript.rhino.head.Node node38 = node30.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment39 = node30.getJsDocNode();
        int int40 = node30.getType();
        node30.setDouble((double) 17);
        com.google.javascript.rhino.head.Node node44 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str45 = node44.toString();
        boolean boolean46 = node44.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newString("");
        node48.removeProp(23);
        node44.addChildToFront(node48);
        java.lang.String str52 = node48.getString();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString((int) (short) 0, "-1");
        com.google.javascript.rhino.head.Node node57 = new com.google.javascript.rhino.head.Node(10, node30, node48, node55, 14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.replaceChild(node26, node48);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) '4', "40");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node(0, node5, node8);
        int int10 = node5.getLineno();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator11 = node5.new NodeIterator();
        node5.removeProp(5);
        node2.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str19 = node18.toString();
        boolean boolean20 = node18.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newString("");
        node22.removeProp(23);
        node18.addChildToFront(node22);
        com.google.javascript.rhino.head.Node node26 = node18.getFirstChild();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node26.addChildrenToBack(node28);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString("");
        int int34 = node31.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node((int) (short) 10, node26, node31);
        com.google.javascript.rhino.head.Node node36 = node26.getNext();
        node36.removeProp(6);
        com.google.javascript.rhino.head.Node node40 = node36.setType(6);
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node41);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber(1.0d);
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
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator18 = node12.spliterator();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str22 = node21.toString();
        com.google.javascript.rhino.head.ast.Comment comment23 = node21.getJsDocNode();
        node12.putProp((int) '#', (java.lang.Object) node21);
        boolean boolean25 = node21.hasSideEffects();
        int int26 = node21.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node27 = node1.getChildBefore(node21);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        boolean boolean44 = node43.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node45 = node19.getChildBefore(node43);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node4 = node3.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator5 = node4.new NodeIterator();
        node4.setLineno(13);
        boolean boolean8 = node4.hasSideEffects();
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
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str62 = node61.toString();
        boolean boolean63 = node61.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node65 = com.google.javascript.rhino.head.Node.newString("");
        node65.removeProp(23);
        node61.addChildToFront(node65);
        com.google.javascript.rhino.head.Node node69 = node61.getFirstChild();
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node69.addChildrenToBack(node71);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(19, node4, node30, node69, 6);
        com.google.javascript.rhino.head.Node node77 = new com.google.javascript.rhino.head.Node(13, 32);
        int int78 = node77.getType();
        com.google.javascript.rhino.head.Node node82 = com.google.javascript.rhino.head.Node.newString("");
        int int83 = node82.getLineno();
        com.google.javascript.rhino.head.Node node85 = node82.setType((-1));
        com.google.javascript.rhino.head.Node node87 = new com.google.javascript.rhino.head.Node(23, node85, 22);
        com.google.javascript.rhino.head.Node node88 = new com.google.javascript.rhino.head.Node(15, node85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node77, node88);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        boolean boolean4 = node1.hasSideEffects();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("");
        node10.removeProp(23);
        node6.addChildToFront(node10);
        com.google.javascript.rhino.head.Node node14 = node6.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment15 = node6.getJsDocNode();
        node1.addChildToBack(node6);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor17 = node1.iterator();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor20 = node19.iterator();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node25 = node24.getLastSibling();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str30 = node29.toString();
        boolean boolean31 = node29.hasConsistentReturnUsage();
        boolean boolean32 = node29.hasSideEffects();
        node27.addChildrenToFront(node29);
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(26, node24, node27, 20);
        java.lang.String str36 = node35.getJsDoc();
        node35.setLineno(2);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator39 = node35.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChildAfter(node19, node35);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node4 = node1.getLastSibling();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString(12, "40");
        boolean boolean8 = node7.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.ast.Comment comment9 = node7.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node10 = node4.getChildBefore(node7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((int) (short) -1);
        com.google.javascript.rhino.head.Node node2 = node1.getFirstChild();
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node5 = node4.getLastSibling();
        boolean boolean6 = node5.hasSideEffects();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean10 = node9.hasChildren();
        com.google.javascript.rhino.head.Node node11 = node9.getLastSibling();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node16 = node15.getLastSibling();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node(13, node20);
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(12);
        node24.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(6, node24);
        com.google.javascript.rhino.head.Node node29 = node28.getLastChild();
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node20, node28, 0);
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node34.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(20, node16, node20, node34);
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str42 = node41.toString();
        boolean boolean43 = node41.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString("");
        node45.removeProp(23);
        node41.addChildToFront(node45);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) 'a', node41);
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str54 = node53.toString();
        boolean boolean55 = node53.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newString("");
        node57.removeProp(23);
        node53.addChildToFront(node57);
        com.google.javascript.rhino.head.Node node61 = node53.getFirstChild();
        node61.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope64 = node61.getScope();
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node((int) ' ', node61, 2);
        com.google.javascript.rhino.head.Node node67 = node61.getLastSibling();
        com.google.javascript.rhino.head.Node node70 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node71 = node70.getLastSibling();
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node((int) ' ', node67, node70);
        node41.addChildrenToFront(node72);
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node(24, node11, node38, node72, (int) (short) -1);
        node5.addChildToFront(node38);
        com.google.javascript.rhino.head.Node node81 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node82 = node81.getLastSibling();
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node86 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str87 = node86.toString();
        boolean boolean88 = node86.hasConsistentReturnUsage();
        boolean boolean89 = node86.hasSideEffects();
        node84.addChildrenToFront(node86);
        com.google.javascript.rhino.head.Node node92 = new com.google.javascript.rhino.head.Node(26, node81, node84, 20);
        com.google.javascript.rhino.head.Node node94 = new com.google.javascript.rhino.head.Node((int) (short) 0, node81, 19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node5, node94);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) -1, 10);
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean5 = node4.hasChildren();
        java.lang.String str6 = node4.getJsDoc();
        com.google.javascript.rhino.head.Node node7 = node4.getLastSibling();
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str13 = node12.toString();
        boolean boolean14 = node12.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString("");
        node16.removeProp(23);
        node12.addChildToFront(node16);
        com.google.javascript.rhino.head.Node node20 = node12.getFirstChild();
        node20.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope23 = node20.getScope();
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node((int) ' ', node20, 2);
        com.google.javascript.rhino.head.Node node26 = node20.getLastSibling();
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node30 = node29.getLastSibling();
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node((int) ' ', node26, node29);
        node29.setLineno((int) (byte) 0);
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(13, node29);
        com.google.javascript.rhino.head.Node node36 = node29.setType(2);
        node29.putIntProp(40, (int) (short) 100);
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newString("");
        int int45 = node42.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node46 = node42.getFirstChild();
        node29.putProp((int) 'a', (java.lang.Object) node42);
        com.google.javascript.rhino.head.Node node49 = node42.setType((int) ' ');
        com.google.javascript.rhino.head.Node node50 = node42.getFirstChild();
        com.google.javascript.rhino.head.Node node51 = node42.getFirstChild();
        node7.addChildToFront(node42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node42);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        int int19 = node7.getIntProp(6, 8);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (short) 0, node7, 7);
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str26 = node25.toString();
        boolean boolean27 = node25.hasConsistentReturnUsage();
        boolean boolean28 = node25.hasSideEffects();
        node23.addChildrenToFront(node25);
        node25.removeChildren();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString("hi!");
        node25.addChildrenToBack(node32);
        com.google.javascript.rhino.head.Node node34 = node25.getFirstChild();
        com.google.javascript.rhino.head.Node node39 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str40 = node39.toString();
        boolean boolean41 = node39.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newString("");
        node43.removeProp(23);
        node39.addChildToFront(node43);
        com.google.javascript.rhino.head.Node node47 = node39.getFirstChild();
        node47.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope50 = node47.getScope();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) ' ', node47, 2);
        com.google.javascript.rhino.head.Node node53 = node47.getLastSibling();
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node57 = node56.getLastSibling();
        com.google.javascript.rhino.head.Node node58 = new com.google.javascript.rhino.head.Node((int) ' ', node53, node56);
        node56.setLineno((int) (byte) 0);
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(13, node56);
        com.google.javascript.rhino.head.Node node63 = node56.setType(2);
        node56.putIntProp(40, (int) (short) 100);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor67 = node56.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.replaceChildAfter(node34, node56);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node(23);
        node1.removeProp(25);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) (-1L));
        boolean boolean6 = node5.hasSideEffects();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor7 = node5.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node8 = node1.getChildBefore(node5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("");
        node1.removeProp(23);
        com.google.javascript.rhino.head.Node node4 = node1.getFirstChild();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newNumber((double) 7);
        node7.putIntProp(0, 18);
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(0, node7);
        node11.putIntProp(14, 13);
        boolean boolean15 = node11.hasConsistentReturnUsage();
        node11.setLineno(0);
        java.lang.Object obj19 = node11.getProp(1);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor20 = node11.iterator();
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        com.google.javascript.rhino.head.Node node24 = node22.getLastChild();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str29 = node28.toString();
        boolean boolean30 = node28.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newString("");
        node32.removeProp(23);
        node28.addChildToFront(node32);
        com.google.javascript.rhino.head.Node node37 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean38 = node37.hasChildren();
        node28.addChildrenToFront(node37);
        int int40 = node37.getLineno();
        com.google.javascript.rhino.head.Node node42 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str43 = node42.toString();
        boolean boolean44 = node42.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node46 = com.google.javascript.rhino.head.Node.newString("");
        node46.removeProp(23);
        node42.addChildToFront(node46);
        com.google.javascript.rhino.head.Node node50 = node42.getFirstChild();
        com.google.javascript.rhino.head.Node node52 = new com.google.javascript.rhino.head.Node((int) (short) 0, node37, node42, 9);
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
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str75 = node74.toString();
        boolean boolean76 = node74.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node78 = com.google.javascript.rhino.head.Node.newString("");
        node78.removeProp(23);
        node74.addChildToFront(node78);
        com.google.javascript.rhino.head.Node node82 = node74.getFirstChild();
        com.google.javascript.rhino.head.Node node84 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node82.addChildrenToBack(node84);
        com.google.javascript.rhino.head.Node node86 = node84.getLastChild();
        java.lang.String str87 = node84.getJsDoc();
        java.lang.Object obj89 = node84.getProp(0);
        com.google.javascript.rhino.head.Node node90 = new com.google.javascript.rhino.head.Node(3, node37, node56, node84);
        com.google.javascript.rhino.head.ast.Comment comment91 = node90.getJsDocNode();
        node22.addChildrenToFront(node90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChildAfter(node11, node22);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(0, node3);
        int int8 = node3.getLineno();
        node3.removeProp(0);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("12");
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(32, node3, node12, (int) (byte) 1);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean17 = node16.hasSideEffects();
        com.google.javascript.rhino.head.Node node19 = node16.setType(3);
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str24 = node23.toString();
        boolean boolean25 = node23.hasConsistentReturnUsage();
        boolean boolean26 = node23.hasSideEffects();
        node21.addChildrenToFront(node23);
        com.google.javascript.rhino.head.Node node29 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str30 = node29.toString();
        boolean boolean31 = node29.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("");
        node33.removeProp(23);
        node29.addChildToFront(node33);
        com.google.javascript.rhino.head.Node node37 = node29.getFirstChild();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node37.addChildrenToBack(node39);
        node23.addChildrenToBack(node39);
        com.google.javascript.rhino.head.Node node43 = node23.setType(23);
        boolean boolean44 = node43.hasConsistentReturnUsage();
        node16.addChildrenToFront(node43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node16);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node11);
        node16.putIntProp(25, (int) (byte) 10);
        com.google.javascript.rhino.head.Node node25 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node26 = node25.getLastSibling();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node31 = new com.google.javascript.rhino.head.Node(13, node30);
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node(12);
        node34.putIntProp(14, 3);
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node(6, node34);
        com.google.javascript.rhino.head.Node node39 = node38.getLastChild();
        com.google.javascript.rhino.head.Node node41 = new com.google.javascript.rhino.head.Node((int) (byte) 100, node30, node38, 0);
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        node44.putIntProp(20, 100);
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(20, node26, node30, node44);
        com.google.javascript.rhino.head.Node node49 = new com.google.javascript.rhino.head.Node((int) (short) 0, node44);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node53 = node52.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator54 = node53.new NodeIterator();
        node53.setLineno(13);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator57 = node53.spliterator();
        java.lang.String str58 = node53.toString();
        int int59 = node53.getType();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node(97, node44, node53, 22);
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((int) (byte) 1, 8);
        java.lang.String str66 = node65.toString();
        com.google.javascript.rhino.head.Node node67 = node65.getLastChild();
        com.google.javascript.rhino.head.Node node70 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node71 = node70.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator72 = node71.new NodeIterator();
        node71.setLineno(13);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator75 = node71.spliterator();
        java.lang.String str76 = node71.toString();
        node65.addChildrenToBack(node71);
        com.google.javascript.rhino.head.Node node78 = new com.google.javascript.rhino.head.Node(13, node65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node16.replaceChildAfter(node61, node65);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) '4', "1");
        com.google.javascript.rhino.head.Node node3 = node2.getFirstChild();
        com.google.javascript.rhino.head.Node node5 = node2.setType(6);
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        boolean boolean12 = node9.hasSideEffects();
        node7.addChildrenToFront(node9);
        node9.removeChildren();
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newString("hi!");
        node9.addChildrenToBack(node16);
        boolean boolean18 = node9.hasSideEffects();
        java.lang.String str19 = node9.getJsDoc();
        com.google.javascript.rhino.head.ast.Comment comment20 = node9.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
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
        com.google.javascript.rhino.head.Node node68 = new com.google.javascript.rhino.head.Node(10, node66, 4);
        com.google.javascript.rhino.head.Node node70 = com.google.javascript.rhino.head.Node.newNumber((double) (-1.0f));
        node68.addChildToBack(node70);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str74 = node73.toString();
        com.google.javascript.rhino.head.ast.Comment comment75 = node73.getJsDocNode();
        com.google.javascript.rhino.head.ast.Comment comment76 = node73.getJsDocNode();
        com.google.javascript.rhino.head.Node node78 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str79 = node78.toString();
        boolean boolean80 = node78.hasConsistentReturnUsage();
        node73.addChildToBack(node78);
        com.google.javascript.rhino.head.Node node83 = com.google.javascript.rhino.head.Node.newNumber((double) 17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node70.replaceChildAfter(node73, node83);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node(40, 8);
        int int5 = node2.getIntProp(0, 0);
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str11 = node10.toString();
        boolean boolean12 = node10.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newString("");
        node14.removeProp(23);
        node10.addChildToFront(node14);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean20 = node19.hasChildren();
        node10.addChildrenToFront(node19);
        int int22 = node19.getLineno();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str25 = node24.toString();
        boolean boolean26 = node24.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString("");
        node28.removeProp(23);
        node24.addChildToFront(node28);
        com.google.javascript.rhino.head.Node node32 = node24.getFirstChild();
        com.google.javascript.rhino.head.Node node34 = new com.google.javascript.rhino.head.Node((int) (short) 0, node19, node24, 9);
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
        com.google.javascript.rhino.head.Node node56 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str57 = node56.toString();
        boolean boolean58 = node56.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node60 = com.google.javascript.rhino.head.Node.newString("");
        node60.removeProp(23);
        node56.addChildToFront(node60);
        com.google.javascript.rhino.head.Node node64 = node56.getFirstChild();
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node64.addChildrenToBack(node66);
        com.google.javascript.rhino.head.Node node68 = node66.getLastChild();
        java.lang.String str69 = node66.getJsDoc();
        java.lang.Object obj71 = node66.getProp(0);
        com.google.javascript.rhino.head.Node node72 = new com.google.javascript.rhino.head.Node(3, node19, node38, node66);
        com.google.javascript.rhino.head.Node node73 = node66.getLastSibling();
        com.google.javascript.rhino.head.Node node75 = new com.google.javascript.rhino.head.Node(52, node73, 16);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator76 = node75.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node75);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString("");
        node5.removeProp(23);
        node1.addChildToFront(node5);
        com.google.javascript.rhino.head.Node node9 = node1.getFirstChild();
        node9.setString("100");
        boolean boolean12 = node9.hasSideEffects();
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(1);
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
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node37 = node36.getLastSibling();
        com.google.javascript.rhino.head.Node node38 = new com.google.javascript.rhino.head.Node((int) ' ', node33, node36);
        java.lang.String str39 = node33.getString();
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str42 = node41.toString();
        boolean boolean43 = node41.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString("");
        node45.removeProp(23);
        node41.addChildToFront(node45);
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean51 = node50.hasChildren();
        node41.addChildrenToFront(node50);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator53 = node50.new NodeIterator();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str56 = node55.toString();
        com.google.javascript.rhino.head.Node node57 = node55.getLastSibling();
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
        com.google.javascript.rhino.head.Node node74 = node68.getLastSibling();
        node57.addChildToFront(node74);
        node50.addChildrenToFront(node57);
        com.google.javascript.rhino.head.Node node78 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str79 = node78.toString();
        com.google.javascript.rhino.head.Node node81 = new com.google.javascript.rhino.head.Node((int) (short) 10, node33, node50, node78, 24);
        node50.setDouble((double) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node9.addChildBefore(node14, node50);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) '#');
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node((int) (short) 0, node2);
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasConsistentReturnUsage();
        boolean boolean11 = node8.hasSideEffects();
        node6.addChildrenToFront(node8);
        int int13 = node6.getType();
        com.google.javascript.rhino.head.Node node15 = node6.setType(23);
        com.google.javascript.rhino.head.Node node16 = node6.getFirstChild();
        com.google.javascript.rhino.head.Node node18 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str21 = node20.toString();
        boolean boolean22 = node20.hasConsistentReturnUsage();
        boolean boolean23 = node20.hasSideEffects();
        node18.addChildrenToFront(node20);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("");
        node30.removeProp(23);
        node26.addChildToFront(node30);
        com.google.javascript.rhino.head.Node node34 = node26.getFirstChild();
        com.google.javascript.rhino.head.Node node36 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node34.addChildrenToBack(node36);
        node20.addChildrenToBack(node36);
        com.google.javascript.rhino.head.Node node41 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str42 = node41.toString();
        boolean boolean43 = node41.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node45 = com.google.javascript.rhino.head.Node.newString("");
        node45.removeProp(23);
        node41.addChildToFront(node45);
        com.google.javascript.rhino.head.Node node50 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean51 = node50.hasChildren();
        node41.addChildrenToFront(node50);
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
        com.google.javascript.rhino.head.Node node70 = new com.google.javascript.rhino.head.Node(15, node41, node54);
        node36.addChildrenToFront(node41);
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node(14, node16, node41, 16);
        com.google.javascript.rhino.head.Node node76 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str77 = node76.toString();
        boolean boolean78 = node76.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node80 = com.google.javascript.rhino.head.Node.newString("");
        node80.removeProp(23);
        node76.addChildToFront(node80);
        com.google.javascript.rhino.head.Node node84 = node76.getFirstChild();
        com.google.javascript.rhino.head.Node node86 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node84.addChildrenToBack(node86);
        com.google.javascript.rhino.head.Node node88 = node86.getLastChild();
        int int89 = node86.getLineno();
        node41.putProp(35, (java.lang.Object) node86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node91 = node2.getChildBefore(node86);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newString("11");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        boolean boolean8 = node5.hasSideEffects();
        node3.addChildrenToFront(node5);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("");
        node15.removeProp(23);
        node11.addChildToFront(node15);
        com.google.javascript.rhino.head.Node node19 = node11.getFirstChild();
        com.google.javascript.rhino.head.Node node21 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node19.addChildrenToBack(node21);
        node5.addChildrenToBack(node21);
        com.google.javascript.rhino.head.Node node25 = node5.setType(23);
        boolean boolean26 = node25.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node25);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node3 = node2.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator4 = node3.new NodeIterator();
        node3.setLineno(13);
        boolean boolean7 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str12 = node11.toString();
        boolean boolean13 = node11.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("");
        node15.removeProp(23);
        node11.addChildToFront(node15);
        com.google.javascript.rhino.head.Node node19 = node11.getFirstChild();
        node19.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope22 = node19.getScope();
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node((int) ' ', node19, 2);
        boolean boolean25 = node24.hasChildren();
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
        com.google.javascript.rhino.head.Node node43 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str44 = node43.toString();
        boolean boolean45 = node43.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node47 = com.google.javascript.rhino.head.Node.newString("");
        node47.removeProp(23);
        node43.addChildToFront(node47);
        com.google.javascript.rhino.head.Node node51 = node43.getFirstChild();
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node((int) (short) 0, node38, node43, 9);
        boolean boolean54 = node38.hasSideEffects();
        com.google.javascript.rhino.head.Node node57 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node58 = node57.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator59 = node58.new NodeIterator();
        com.google.javascript.rhino.head.Node node61 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str62 = node61.toString();
        boolean boolean63 = node61.hasConsistentReturnUsage();
        boolean boolean64 = node61.hasSideEffects();
        com.google.javascript.rhino.head.Node node66 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str67 = node66.toString();
        boolean boolean68 = node66.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node70 = com.google.javascript.rhino.head.Node.newString("");
        node70.removeProp(23);
        node66.addChildToFront(node70);
        com.google.javascript.rhino.head.Node node74 = node66.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment75 = node66.getJsDocNode();
        node61.addChildToBack(node66);
        java.lang.String str77 = node61.toString();
        com.google.javascript.rhino.head.Node node79 = new com.google.javascript.rhino.head.Node(0, node38, node58, node61, 1);
        com.google.javascript.rhino.head.Node node81 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node83 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str84 = node83.toString();
        boolean boolean85 = node83.hasConsistentReturnUsage();
        boolean boolean86 = node83.hasSideEffects();
        node81.addChildrenToFront(node83);
        node83.removeChildren();
        com.google.javascript.rhino.head.Node node89 = new com.google.javascript.rhino.head.Node((int) (short) 0, node24, node58, node83);
        java.lang.String str90 = node24.toString();
        boolean boolean91 = node24.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node92 = node3.getChildBefore(node24);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str20 = node19.toString();
        boolean boolean21 = node19.hasConsistentReturnUsage();
        boolean boolean22 = node19.hasSideEffects();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node(0, node19);
        int int24 = node19.getLineno();
        node19.removeProp(0);
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newString("12");
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node(32, node19, node28, (int) (byte) 1);
        java.lang.String str31 = node28.getString();
        node28.removeProp(0);
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str37 = node36.toString();
        boolean boolean38 = node36.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newString("");
        node40.removeProp(23);
        node36.addChildToFront(node40);
        com.google.javascript.rhino.head.Node node44 = new com.google.javascript.rhino.head.Node((int) 'a', node36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.replaceChildAfter(node28, node36);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        java.lang.Object obj49 = node31.getProp(0);
        java.lang.String str50 = node31.getJsDoc();
        com.google.javascript.rhino.head.Node node53 = new com.google.javascript.rhino.head.Node(4, 8);
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
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor77 = node74.iterator();
        node53.addChildrenToFront(node74);
        com.google.javascript.rhino.head.Node node80 = com.google.javascript.rhino.head.Node.newString("23");
        node80.removeChildren();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node31, node53, node80, 25);
        com.google.javascript.rhino.head.Node node84 = node80.getFirstChild();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator85 = node80.new NodeIterator();
        boolean boolean86 = node80.hasSideEffects();
        node80.setLineno(23);
        com.google.javascript.rhino.head.Node node92 = new com.google.javascript.rhino.head.Node(25, 26);
        com.google.javascript.rhino.head.ast.Comment comment93 = node92.getJsDocNode();
        com.google.javascript.rhino.head.Node node95 = new com.google.javascript.rhino.head.Node(7, node92, 25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.replaceChild(node80, node95);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(15, "41");
        com.google.javascript.rhino.head.Node node4 = com.google.javascript.rhino.head.Node.newString("32");
        java.lang.String str5 = node4.toString();
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str9 = node8.toString();
        boolean boolean10 = node8.hasChildren();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str15 = node14.toString();
        boolean boolean16 = node14.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newString("");
        node18.removeProp(23);
        node14.addChildToFront(node18);
        com.google.javascript.rhino.head.Node node22 = node14.getFirstChild();
        node22.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope25 = node22.getScope();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) ' ', node22, 2);
        com.google.javascript.rhino.head.Node node28 = node22.getLastSibling();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node32 = node31.getLastSibling();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) ' ', node28, node31);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor34 = node31.iterator();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator35 = node31.new NodeIterator();
        node8.addChildrenToBack(node31);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node(26, node8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.addChildBefore(node4, node37);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(1, "40");
        com.google.javascript.rhino.head.Node node5 = new com.google.javascript.rhino.head.Node((int) '#');
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(19, node5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node7 = node2.getChildBefore(node6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str3 = node2.toString();
        boolean boolean4 = node2.hasConsistentReturnUsage();
        boolean boolean5 = node2.hasSideEffects();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(0, node2);
        node6.putProp(40, (java.lang.Object) 9);
        com.google.javascript.rhino.head.Node node10 = node6.getFirstChild();
        com.google.javascript.rhino.head.Node node12 = node10.setType(19);
        com.google.javascript.rhino.head.Node node15 = new com.google.javascript.rhino.head.Node(12, 25);
        boolean boolean16 = node15.hasChildren();
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str20 = node19.toString();
        boolean boolean21 = node19.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString("");
        node23.removeProp(23);
        node19.addChildToFront(node23);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) 'a', node19);
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
        com.google.javascript.rhino.head.Node node45 = node39.getLastSibling();
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node49 = node48.getLastSibling();
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) ' ', node45, node48);
        node19.addChildrenToFront(node50);
        node15.addChildrenToBack(node50);
        boolean boolean53 = node15.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node54 = node10.getChildBefore(node15);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.javascript.rhino.head.Node node2 = new com.google.javascript.rhino.head.Node((int) (short) 0, 32);
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) 19);
        com.google.javascript.rhino.head.Node node8 = com.google.javascript.rhino.head.Node.newString("");
        node8.removeProp(23);
        com.google.javascript.rhino.head.Node node13 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str14 = node13.toString();
        boolean boolean15 = node13.hasConsistentReturnUsage();
        boolean boolean16 = node13.hasSideEffects();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(0, node13);
        node8.addChildrenToBack(node17);
        com.google.javascript.rhino.head.Node node19 = new com.google.javascript.rhino.head.Node(9, node8);
        com.google.javascript.rhino.head.Node node23 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node24 = new com.google.javascript.rhino.head.Node(13, node23);
        com.google.javascript.rhino.head.Node node25 = new com.google.javascript.rhino.head.Node(7, node23);
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) 'a', node5, node19, node23, (int) (short) 1);
        com.google.javascript.rhino.head.Node node29 = new com.google.javascript.rhino.head.Node(7);
        node23.addChildrenToBack(node29);
        com.google.javascript.rhino.head.Node node31 = node29.getLastSibling();
        boolean boolean32 = node31.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node31);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newString("");
        node3.removeProp(23);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor6 = node3.iterator();
        com.google.javascript.rhino.head.Node node8 = new com.google.javascript.rhino.head.Node(22, node3, 7);
        java.lang.String str9 = node8.getJsDoc();
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("");
        int int14 = node11.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(40, 8);
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str21 = node20.toString();
        boolean boolean22 = node20.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newString("");
        node24.removeProp(23);
        node20.addChildToFront(node24);
        com.google.javascript.rhino.head.Node node28 = node20.getFirstChild();
        com.google.javascript.rhino.head.Node node30 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node28.addChildrenToBack(node30);
        com.google.javascript.rhino.head.Node node33 = com.google.javascript.rhino.head.Node.newString("");
        int int36 = node33.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node37 = new com.google.javascript.rhino.head.Node((int) (short) 10, node28, node33);
        com.google.javascript.rhino.head.Node node39 = node28.setType(18);
        node11.addChildAfter(node17, node39);
        node8.addChildToBack(node11);
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
        com.google.javascript.rhino.head.Node node64 = com.google.javascript.rhino.head.Node.newNumber((double) 7);
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node(0, node54, node64, (-1));
        com.google.javascript.rhino.head.Node node67 = node66.getLastSibling();
        com.google.javascript.rhino.head.Node node69 = com.google.javascript.rhino.head.Node.newNumber((double) (byte) 100);
        com.google.javascript.rhino.head.Node node71 = new com.google.javascript.rhino.head.Node(41, node8, node66, node69, 22);
        com.google.javascript.rhino.head.Node node73 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str74 = node73.toString();
        boolean boolean75 = node73.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node77 = com.google.javascript.rhino.head.Node.newString("");
        node77.removeProp(23);
        node73.addChildToFront(node77);
        com.google.javascript.rhino.head.Node node81 = node73.getFirstChild();
        com.google.javascript.rhino.head.Node node83 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node81.addChildrenToBack(node83);
        com.google.javascript.rhino.head.Node node85 = node83.getLastChild();
        java.lang.String str86 = node83.getJsDoc();
        java.lang.Object obj88 = node83.getProp(0);
        boolean boolean89 = node83.hasChildren();
        com.google.javascript.rhino.head.Node node91 = new com.google.javascript.rhino.head.Node(23);
        node91.removeProp(25);
        boolean boolean94 = node91.hasChildren();
        node91.putIntProp(21, 25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node69.replaceChild(node83, node91);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        boolean boolean4 = node1.hasSideEffects();
        com.google.javascript.rhino.head.Node node6 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str7 = node6.toString();
        boolean boolean8 = node6.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node10 = com.google.javascript.rhino.head.Node.newString("");
        node10.removeProp(23);
        node6.addChildToFront(node10);
        com.google.javascript.rhino.head.Node node14 = node6.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment15 = node6.getJsDocNode();
        node1.addChildToBack(node6);
        java.lang.String str17 = node1.toString();
        com.google.javascript.rhino.head.Node node19 = node1.setType(25);
        com.google.javascript.rhino.head.Node node20 = node1.getFirstChild();
        com.google.javascript.rhino.head.Node node24 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str25 = node24.toString();
        boolean boolean26 = node24.hasConsistentReturnUsage();
        boolean boolean27 = node24.hasSideEffects();
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(0, node24);
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str32 = node31.toString();
        boolean boolean33 = node31.hasConsistentReturnUsage();
        boolean boolean34 = node31.hasSideEffects();
        com.google.javascript.rhino.head.Node node36 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str37 = node36.toString();
        boolean boolean38 = node36.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node40 = com.google.javascript.rhino.head.Node.newString("");
        node40.removeProp(23);
        node36.addChildToFront(node40);
        com.google.javascript.rhino.head.Node node44 = node36.getFirstChild();
        com.google.javascript.rhino.head.ast.Comment comment45 = node36.getJsDocNode();
        node31.addChildToBack(node36);
        boolean boolean47 = node36.hasConsistentReturnUsage();
        node24.putProp((int) (short) 1, (java.lang.Object) node36);
        com.google.javascript.rhino.head.Node node51 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str52 = node51.toString();
        boolean boolean53 = node51.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node55 = com.google.javascript.rhino.head.Node.newString("");
        node55.removeProp(23);
        node51.addChildToFront(node55);
        com.google.javascript.rhino.head.Node node59 = node51.getFirstChild();
        node59.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope62 = node59.getScope();
        com.google.javascript.rhino.head.Node node64 = new com.google.javascript.rhino.head.Node((int) ' ', node59, 2);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator65 = node59.spliterator();
        node59.putIntProp(100, (int) (byte) 0);
        com.google.javascript.rhino.head.Node node70 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str71 = node70.toString();
        boolean boolean72 = node70.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newString("");
        node74.removeProp(23);
        node70.addChildToFront(node74);
        com.google.javascript.rhino.head.Node node78 = node70.getFirstChild();
        node78.setString("100");
        com.google.javascript.rhino.head.Node node82 = new com.google.javascript.rhino.head.Node(5, node24, node59, node78, 17);
        com.google.javascript.rhino.head.Node node85 = com.google.javascript.rhino.head.Node.newString(0, "100");
        java.lang.Object obj87 = node85.getProp((int) (short) -1);
        int int90 = node85.getIntProp((int) (short) 10, 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChildAfter(node78, node85);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.javascript.rhino.head.Node node3 = new com.google.javascript.rhino.head.Node(0, 1);
        node3.removeChildren();
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(19, node3, 1);
        com.google.javascript.rhino.head.Node node9 = new com.google.javascript.rhino.head.Node((int) '#');
        com.google.javascript.rhino.head.Node node10 = new com.google.javascript.rhino.head.Node(19, node9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node11 = node3.getChildBefore(node10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) 0);
        com.google.javascript.rhino.head.ast.Comment comment2 = node1.getJsDocNode();
        node1.removeChildren();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((-1.0d));
        node5.putIntProp((int) (byte) -1, (int) (byte) 0);
        boolean boolean9 = node5.hasConsistentReturnUsage();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node5);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.javascript.rhino.head.Node node1 = new com.google.javascript.rhino.head.Node((-1));
        com.google.javascript.rhino.head.Node node3 = node1.setType(12);
        boolean boolean4 = node1.hasSideEffects();
        com.google.javascript.rhino.head.Node node7 = com.google.javascript.rhino.head.Node.newString("");
        int int8 = node7.getLineno();
        com.google.javascript.rhino.head.Node node10 = node7.setType((-1));
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator11 = node7.new NodeIterator();
        com.google.javascript.rhino.head.Node node12 = new com.google.javascript.rhino.head.Node(97, node7);
        java.lang.String str13 = node12.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str2 = node1.toString();
        boolean boolean3 = node1.hasConsistentReturnUsage();
        boolean boolean4 = node1.hasSideEffects();
        node1.setLineno((int) '4');
        com.google.javascript.rhino.head.Node node8 = node1.setType((int) '4');
        node1.putIntProp(5, 10);
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node((int) '#', 12);
        com.google.javascript.rhino.head.Node node16 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node20 = com.google.javascript.rhino.head.Node.newString("");
        node20.removeProp(23);
        node16.addChildToFront(node20);
        com.google.javascript.rhino.head.Node node24 = node16.getFirstChild();
        com.google.javascript.rhino.head.Node node26 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node24.addChildrenToBack(node26);
        com.google.javascript.rhino.head.Node node28 = node26.getLastChild();
        java.lang.String str29 = node26.getJsDoc();
        java.lang.Object obj31 = node26.getProp(0);
        com.google.javascript.rhino.head.ast.Comment comment32 = node26.getJsDocNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node14, node26);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(0, "10");
        com.google.javascript.rhino.head.Node node6 = new com.google.javascript.rhino.head.Node(23, (int) (short) -1);
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.hasConsistentReturnUsage();
        boolean boolean12 = node9.hasSideEffects();
        com.google.javascript.rhino.head.Node node13 = new com.google.javascript.rhino.head.Node(0, node9);
        com.google.javascript.rhino.head.Node node14 = node13.getLastChild();
        node13.removeChildren();
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(19, node6, node13, 24);
        com.google.javascript.rhino.head.Node node18 = node6.getLastSibling();
        com.google.javascript.rhino.head.Node node19 = node6.getLastSibling();
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor20 = node19.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node19);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString((int) (byte) -1, "12");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node6 = node5.getLastSibling();
        int int7 = node5.getLineno();
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator8 = node5.spliterator();
        com.google.javascript.rhino.head.Node node14 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str15 = node14.toString();
        boolean boolean16 = node14.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newString("");
        node18.removeProp(23);
        node14.addChildToFront(node18);
        com.google.javascript.rhino.head.Node node22 = node14.getFirstChild();
        node22.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope25 = node22.getScope();
        com.google.javascript.rhino.head.Node node27 = new com.google.javascript.rhino.head.Node((int) ' ', node22, 2);
        com.google.javascript.rhino.head.Node node28 = node22.getLastSibling();
        com.google.javascript.rhino.head.Node node31 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node32 = node31.getLastSibling();
        com.google.javascript.rhino.head.Node node33 = new com.google.javascript.rhino.head.Node((int) ' ', node28, node31);
        java.lang.String str34 = node28.getString();
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
        com.google.javascript.rhino.head.Node node73 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str74 = node73.toString();
        com.google.javascript.rhino.head.Node node76 = new com.google.javascript.rhino.head.Node((int) (short) 10, node28, node45, node73, 24);
        com.google.javascript.rhino.head.Node node78 = new com.google.javascript.rhino.head.Node(0, node28, 17);
        com.google.javascript.rhino.head.Node node80 = node78.setType(22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.addChildBefore(node5, node80);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node6 = node5.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator7 = node6.new NodeIterator();
        node6.setLineno(13);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator10 = node6.spliterator();
        com.google.javascript.rhino.head.Node node11 = new com.google.javascript.rhino.head.Node(97, node6);
        com.google.javascript.rhino.head.Node node15 = com.google.javascript.rhino.head.Node.newString("hi!");
        com.google.javascript.rhino.head.Node node16 = new com.google.javascript.rhino.head.Node(13, node15);
        com.google.javascript.rhino.head.Node node17 = new com.google.javascript.rhino.head.Node(7, node15);
        com.google.javascript.rhino.head.Node node19 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        node17.addChildToFront(node19);
        com.google.javascript.rhino.head.Node node21 = node17.getLastSibling();
        com.google.javascript.rhino.head.Node node22 = node17.getLastChild();
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (byte) 10, node11, node22);
        com.google.javascript.rhino.head.Node node26 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str27 = node26.toString();
        boolean boolean28 = node26.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("");
        node30.removeProp(23);
        node26.addChildToFront(node30);
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        boolean boolean36 = node35.hasChildren();
        node26.addChildrenToFront(node35);
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str40 = node39.toString();
        boolean boolean41 = node39.hasChildren();
        com.google.javascript.rhino.head.Node node43 = new com.google.javascript.rhino.head.Node((int) (short) -1, node35, node39, (int) (short) 10);
        com.google.javascript.rhino.head.ast.Comment comment44 = node35.getJsDocNode();
        com.google.javascript.rhino.head.Node node45 = new com.google.javascript.rhino.head.Node(41, node22, node35);
        com.google.javascript.rhino.head.Node node49 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str50 = node49.toString();
        boolean boolean51 = node49.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node53 = com.google.javascript.rhino.head.Node.newString("");
        node53.removeProp(23);
        node49.addChildToFront(node53);
        com.google.javascript.rhino.head.Node node57 = node49.getFirstChild();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        node57.addChildrenToBack(node59);
        com.google.javascript.rhino.head.Node node62 = com.google.javascript.rhino.head.Node.newString("");
        int int65 = node62.getIntProp(17, (int) (byte) -1);
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node((int) (short) 10, node57, node62);
        com.google.javascript.rhino.head.Node node68 = node57.setType(18);
        com.google.javascript.rhino.head.Node node69 = node57.getNext();
        java.lang.String str70 = node69.toString();
        node35.putProp(0, (java.lang.Object) node69);
        com.google.javascript.rhino.head.Node node74 = com.google.javascript.rhino.head.Node.newString(52, "12");
        com.google.javascript.rhino.head.Node node76 = node74.setType(20);
        com.google.javascript.rhino.head.Node node78 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str79 = node78.toString();
        boolean boolean80 = node78.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node82 = com.google.javascript.rhino.head.Node.newString("");
        node82.removeProp(23);
        node78.addChildToFront(node82);
        com.google.javascript.rhino.head.Node node86 = node78.getFirstChild();
        node86.setLineno(18);
        boolean boolean89 = node86.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node90 = node86.getLastChild();
        node76.addChildToFront(node86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node92 = node69.getChildBefore(node76);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.google.javascript.rhino.head.Node node2 = com.google.javascript.rhino.head.Node.newString(12, "40");
        boolean boolean3 = node2.hasConsistentReturnUsage();
        int int6 = node2.getIntProp(15, 21);
        boolean boolean7 = node2.hasChildren();
        com.google.javascript.rhino.head.Node node9 = node2.setType(0);
        com.google.javascript.rhino.head.Node node11 = com.google.javascript.rhino.head.Node.newString("");
        node11.removeProp(23);
        java.util.Iterator<com.google.javascript.rhino.head.Node> nodeItor14 = node11.iterator();
        java.lang.Object obj16 = node11.getProp((int) (byte) 1);
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator17 = node11.new NodeIterator();
        com.google.javascript.rhino.head.Node node18 = node11.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node19 = node2.getChildBefore(node18);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        java.lang.String str44 = node37.getJsDoc();
        node37.removeChildren();
        com.google.javascript.rhino.head.Node node48 = new com.google.javascript.rhino.head.Node(97);
        com.google.javascript.rhino.head.Node node50 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str53 = node52.toString();
        boolean boolean54 = node52.hasConsistentReturnUsage();
        boolean boolean55 = node52.hasSideEffects();
        node50.addChildrenToFront(node52);
        node52.removeChildren();
        com.google.javascript.rhino.head.Node node59 = new com.google.javascript.rhino.head.Node((-1), node48, node52, 10);
        com.google.javascript.rhino.head.Node node63 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node64 = node63.getLastSibling();
        com.google.javascript.rhino.head.Node node66 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node68 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str69 = node68.toString();
        boolean boolean70 = node68.hasConsistentReturnUsage();
        boolean boolean71 = node68.hasSideEffects();
        node66.addChildrenToFront(node68);
        com.google.javascript.rhino.head.Node node74 = new com.google.javascript.rhino.head.Node(26, node63, node66, 20);
        int int75 = node74.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node37.replaceChild(node59, node74);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.google.javascript.rhino.head.Node node1 = com.google.javascript.rhino.head.Node.newNumber((double) (-1L));
        boolean boolean2 = node1.hasSideEffects();
        com.google.javascript.rhino.head.Node node3 = node1.getLastSibling();
        com.google.javascript.rhino.head.Node node5 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str6 = node5.toString();
        boolean boolean7 = node5.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node9 = com.google.javascript.rhino.head.Node.newString("");
        node9.removeProp(23);
        node5.addChildToFront(node9);
        com.google.javascript.rhino.head.Node node13 = node5.getFirstChild();
        com.google.javascript.rhino.head.Node node17 = com.google.javascript.rhino.head.Node.newString(23, "");
        com.google.javascript.rhino.head.Node node18 = node17.getLastSibling();
        com.google.javascript.rhino.head.Node node20 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        com.google.javascript.rhino.head.Node node22 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str23 = node22.toString();
        boolean boolean24 = node22.hasConsistentReturnUsage();
        boolean boolean25 = node22.hasSideEffects();
        node20.addChildrenToFront(node22);
        com.google.javascript.rhino.head.Node node28 = new com.google.javascript.rhino.head.Node(26, node17, node20, 20);
        node5.addChildToBack(node17);
        com.google.javascript.rhino.head.Node node32 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        com.google.javascript.rhino.head.Node node33 = node32.getLastSibling();
        com.google.javascript.rhino.head.Node.NodeIterator nodeIterator34 = node33.new NodeIterator();
        com.google.javascript.rhino.head.Node node35 = new com.google.javascript.rhino.head.Node(0, node33);
        boolean boolean36 = node35.hasSideEffects();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.addChildBefore(node17, node35);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.google.javascript.rhino.head.Node node3 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str4 = node3.toString();
        boolean boolean5 = node3.hasConsistentReturnUsage();
        boolean boolean6 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node node7 = new com.google.javascript.rhino.head.Node(0, node3);
        int int8 = node3.getLineno();
        node3.removeProp(0);
        com.google.javascript.rhino.head.Node node12 = com.google.javascript.rhino.head.Node.newString("12");
        com.google.javascript.rhino.head.Node node14 = new com.google.javascript.rhino.head.Node(32, node3, node12, (int) (byte) 1);
        boolean boolean15 = node3.hasSideEffects();
        com.google.javascript.rhino.head.Node node18 = com.google.javascript.rhino.head.Node.newString("");
        int int19 = node18.getLineno();
        com.google.javascript.rhino.head.Node node21 = node18.setType((-1));
        com.google.javascript.rhino.head.Node node23 = new com.google.javascript.rhino.head.Node((int) (short) 100);
        java.lang.String str24 = node23.toString();
        node23.removeChildren();
        boolean boolean26 = node23.hasChildren();
        com.google.javascript.rhino.head.Node node28 = com.google.javascript.rhino.head.Node.newNumber((double) 0L);
        com.google.javascript.rhino.head.Node node30 = com.google.javascript.rhino.head.Node.newString("");
        node30.removeProp(23);
        com.google.javascript.rhino.head.Node node35 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str36 = node35.toString();
        boolean boolean37 = node35.hasConsistentReturnUsage();
        boolean boolean38 = node35.hasSideEffects();
        com.google.javascript.rhino.head.Node node39 = new com.google.javascript.rhino.head.Node(0, node35);
        node30.addChildrenToBack(node39);
        node28.addChildToFront(node30);
        com.google.javascript.rhino.head.Node node42 = new com.google.javascript.rhino.head.Node(6, node18, node23, node28);
        node28.putIntProp(0, (int) (byte) 10);
        com.google.javascript.rhino.head.Node node48 = com.google.javascript.rhino.head.Node.newNumber((double) ' ');
        java.lang.String str49 = node48.toString();
        boolean boolean50 = node48.hasConsistentReturnUsage();
        com.google.javascript.rhino.head.Node node52 = com.google.javascript.rhino.head.Node.newString("");
        node52.removeProp(23);
        node48.addChildToFront(node52);
        com.google.javascript.rhino.head.Node node56 = node48.getFirstChild();
        node56.setString("100");
        com.google.javascript.rhino.head.ast.Scope scope59 = node56.getScope();
        com.google.javascript.rhino.head.Node node61 = new com.google.javascript.rhino.head.Node((int) ' ', node56, 2);
        java.util.Spliterator<com.google.javascript.rhino.head.Node> nodeSpliterator62 = node56.spliterator();
        com.google.javascript.rhino.head.Node node65 = new com.google.javascript.rhino.head.Node((int) (byte) -1);
        java.lang.String str66 = node65.toString();
        com.google.javascript.rhino.head.ast.Comment comment67 = node65.getJsDocNode();
        node56.putProp((int) '#', (java.lang.Object) node65);
        boolean boolean69 = node65.hasSideEffects();
        com.google.javascript.rhino.head.Node node70 = node65.getFirstChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.addChildBefore(node28, node65);
    }
}

