import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("");
        boolean boolean4 = node3.isOnlyModifiesThisCall();
        boolean boolean5 = node3.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        boolean boolean8 = node7.isOnlyModifiesThisCall();
        boolean boolean9 = node7.isEmpty();
        node1.putProp((int) '4', (java.lang.Object) node7);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("");
        node12.setSourceEncodedPosition(4095);
        boolean boolean15 = node12.isNot();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        node17.setSourceEncodedPosition(4095);
        boolean boolean20 = node17.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = node17.getStaticSourceFile();
        boolean boolean22 = node17.isAssignAdd();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("");
        node24.setSourceEncodedPosition(4095);
        boolean boolean27 = node24.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node24.getStaticSourceFile();
        com.google.javascript.rhino.Node node29 = node17.copyInformationFromForTree(node24);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("");
        boolean boolean32 = node31.isOnlyModifiesThisCall();
        boolean boolean33 = node31.isEmpty();
        boolean boolean34 = node31.isArrayLit();
        com.google.javascript.rhino.Node node35 = node17.useSourceInfoFrom(node31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.replaceChild(node12, node17);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        boolean boolean5 = node4.isOnlyModifiesThisCall();
        boolean boolean6 = node4.isEmpty();
        boolean boolean7 = node4.isArrayLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        boolean boolean10 = node9.isOnlyModifiesThisCall();
        boolean boolean11 = node9.isSetterDef();
        com.google.javascript.rhino.Node node12 = node4.srcref(node9);
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node12, node32);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        boolean boolean14 = node1.isWith();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("");
        boolean boolean17 = node16.isOnlyModifiesThisCall();
        boolean boolean18 = node16.isEmpty();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("");
        node20.setSourceEncodedPosition(4095);
        boolean boolean23 = node20.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile24 = node20.getStaticSourceFile();
        boolean boolean25 = node20.isAssignAdd();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("");
        node27.setSourceEncodedPosition(4095);
        boolean boolean30 = node27.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile31 = node27.getStaticSourceFile();
        com.google.javascript.rhino.Node node32 = node20.copyInformationFromForTree(node27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node16, node20);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        boolean boolean22 = node21.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("");
        boolean boolean25 = node24.isOnlyModifiesThisCall();
        boolean boolean26 = node24.isEmpty();
        boolean boolean27 = node24.isReturn();
        boolean boolean28 = node24.isNE();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node21, node24);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("");
        node37.setSourceEncodedPosition(4095);
        boolean boolean40 = node37.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = node37.getStaticSourceFile();
        boolean boolean42 = node37.isAssignAdd();
        java.util.Set<java.lang.String> strSet43 = node37.getDirectives();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node20.removeChild(node37);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        int int4 = node3.getLength();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("");
        node6.setSourceEncodedPosition(4095);
        boolean boolean9 = node6.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = node6.getStaticSourceFile();
        boolean boolean11 = node6.isAssignAdd();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("");
        node13.setSourceEncodedPosition(4095);
        boolean boolean16 = node13.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = node13.getStaticSourceFile();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFromForTree(node13);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("");
        boolean boolean21 = node20.isOnlyModifiesThisCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node6, node20);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = node9.getJSDocInfo();
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
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("");
        boolean boolean31 = node30.isOnlyModifiesThisCall();
        boolean boolean32 = node30.isEmpty();
        boolean boolean33 = node30.isArrayLit();
        com.google.javascript.rhino.Node node34 = node16.useSourceInfoFrom(node30);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("");
        node36.setSourceEncodedPosition(4095);
        boolean boolean39 = node36.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile40 = node36.getStaticSourceFile();
        node36.setVarArgs(false);
        boolean boolean43 = node36.isFromExterns();
        boolean boolean44 = node36.isNull();
        boolean boolean45 = node36.isFalse();
        boolean boolean46 = node30.hasChild(node36);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        node48.setSourceEncodedPosition(4095);
        boolean boolean51 = node48.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile52 = node48.getStaticSourceFile();
        boolean boolean53 = node48.isAssignAdd();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("");
        node55.setSourceEncodedPosition(4095);
        boolean boolean58 = node55.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile59 = node55.getStaticSourceFile();
        com.google.javascript.rhino.Node node60 = node48.copyInformationFromForTree(node55);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("");
        boolean boolean63 = node62.isOnlyModifiesThisCall();
        boolean boolean64 = node62.isEmpty();
        boolean boolean65 = node62.isArrayLit();
        com.google.javascript.rhino.Node node66 = node48.useSourceInfoFrom(node62);
        boolean boolean67 = node62.hasChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node9.replaceChild(node30, node62);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        boolean boolean8 = node7.isOnlyModifiesThisCall();
        boolean boolean9 = node7.isEmpty();
        node1.putProp((int) '4', (java.lang.Object) node7);
        boolean boolean11 = node7.isDebugger();
        boolean boolean12 = node7.isVar();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("");
        node15.setSourceEncodedPosition(4095);
        boolean boolean18 = node15.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node15.getStaticSourceFile();
        boolean boolean20 = node15.isAssignAdd();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("");
        node22.setSourceEncodedPosition(4095);
        boolean boolean25 = node22.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile26 = node22.getStaticSourceFile();
        com.google.javascript.rhino.Node node27 = node15.copyInformationFromForTree(node22);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("");
        boolean boolean30 = node29.isOnlyModifiesThisCall();
        boolean boolean31 = node29.isEmpty();
        boolean boolean32 = node29.isArrayLit();
        com.google.javascript.rhino.Node node33 = node15.useSourceInfoFrom(node29);
        com.google.javascript.rhino.Node[] nodeArray34 = new com.google.javascript.rhino.Node[] { node15 };
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(32, nodeArray34);
        int int37 = node35.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        boolean boolean40 = node39.isOnlyModifiesThisCall();
        boolean boolean41 = node39.isEmpty();
        boolean boolean42 = node39.isReturn();
        boolean boolean43 = node39.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("");
        node45.setSourceEncodedPosition(4095);
        boolean boolean48 = node45.isNot();
        boolean boolean49 = node45.isBreak();
        boolean boolean50 = node45.isIn();
        com.google.javascript.rhino.Node node51 = node39.useSourceInfoIfMissingFromForTree(node45);
        com.google.javascript.rhino.Node node52 = node35.useSourceInfoFrom(node45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.removeChild(node45);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        boolean boolean22 = node21.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("");
        boolean boolean25 = node24.isOnlyModifiesThisCall();
        boolean boolean26 = node24.isEmpty();
        boolean boolean27 = node24.isArrayLit();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("");
        boolean boolean30 = node29.isOnlyModifiesThisCall();
        boolean boolean31 = node29.isEmpty();
        boolean boolean32 = node29.isReturn();
        boolean boolean33 = node29.isNE();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(4095, node21, node24, node29, (int) (byte) 10, 32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("");
        node38.setSourceEncodedPosition(4095);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(0, "STRING  0", 53, 100);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(36, node36, node38, node45);
        boolean boolean47 = node45.isTypeOf();
        boolean boolean48 = node45.isGetterDef();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("");
        node50.setSourceEncodedPosition(4095);
        boolean boolean53 = node50.isNot();
        boolean boolean54 = node50.isBreak();
        boolean boolean55 = node50.isTypeOf();
        boolean boolean56 = node50.isDec();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node45.getChildBefore(node50);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        boolean boolean79 = node32.isQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = node32.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        node1.setVarArgs(false);
        boolean boolean8 = node1.isFromExterns();
        boolean boolean9 = node1.isNull();
        boolean boolean10 = node1.isFalse();
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
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node14 };
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(32, nodeArray33);
        int int36 = node34.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("");
        boolean boolean39 = node38.isOnlyModifiesThisCall();
        boolean boolean40 = node38.isEmpty();
        boolean boolean41 = node38.isReturn();
        boolean boolean42 = node38.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        node44.setSourceEncodedPosition(4095);
        boolean boolean47 = node44.isNot();
        boolean boolean48 = node44.isBreak();
        boolean boolean49 = node44.isIn();
        com.google.javascript.rhino.Node node50 = node38.useSourceInfoIfMissingFromForTree(node44);
        com.google.javascript.rhino.Node node51 = node34.useSourceInfoFrom(node44);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("");
        node53.setSourceEncodedPosition(4095);
        boolean boolean56 = node53.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile57 = node53.getStaticSourceFile();
        boolean boolean58 = node53.isAssignAdd();
        java.util.Set<java.lang.String> strSet59 = node53.getDirectives();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("");
        node61.setSourceEncodedPosition(4095);
        boolean boolean64 = node61.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile65 = node61.getStaticSourceFile();
        node61.setVarArgs(false);
        boolean boolean68 = node61.isFromExterns();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("");
        node70.setSourceEncodedPosition(4095);
        boolean boolean73 = node70.isNot();
        com.google.javascript.rhino.Node node74 = node70.getLastSibling();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(37, node34, node53, node61, node74);
        node74.setVarArgs(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node74);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        int int4 = node3.getLength();
        com.google.javascript.rhino.Node node5 = node3.getFirstChild();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("NUMBER 8.0\n", 10, 49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node9);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isOnlyModifiesThisCall();
        boolean boolean3 = node1.isEmpty();
        boolean boolean4 = node1.isCatch();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        node7.setSourceEncodedPosition(4095);
        boolean boolean10 = node7.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = node7.getStaticSourceFile();
        boolean boolean12 = node7.isAssignAdd();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("");
        node14.setSourceEncodedPosition(4095);
        boolean boolean17 = node14.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile18 = node14.getStaticSourceFile();
        com.google.javascript.rhino.Node node19 = node7.copyInformationFromForTree(node14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        boolean boolean22 = node21.isOnlyModifiesThisCall();
        boolean boolean23 = node21.isEmpty();
        boolean boolean24 = node21.isArrayLit();
        com.google.javascript.rhino.Node node25 = node7.useSourceInfoFrom(node21);
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] { node7 };
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(32, nodeArray26);
        int int29 = node27.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("");
        boolean boolean32 = node31.isOnlyModifiesThisCall();
        boolean boolean33 = node31.isEmpty();
        boolean boolean34 = node31.isReturn();
        boolean boolean35 = node31.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("");
        node37.setSourceEncodedPosition(4095);
        boolean boolean40 = node37.isNot();
        boolean boolean41 = node37.isBreak();
        boolean boolean42 = node37.isIn();
        com.google.javascript.rhino.Node node43 = node31.useSourceInfoIfMissingFromForTree(node37);
        com.google.javascript.rhino.Node node44 = node27.useSourceInfoFrom(node37);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("");
        node46.setSourceEncodedPosition(4095);
        boolean boolean49 = node46.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = node46.getStaticSourceFile();
        boolean boolean51 = node46.isAssignAdd();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("");
        node53.setSourceEncodedPosition(4095);
        boolean boolean56 = node53.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile57 = node53.getStaticSourceFile();
        com.google.javascript.rhino.Node node58 = node46.copyInformationFromForTree(node53);
        boolean boolean59 = node46.isWith();
        node37.addChildToFront(node46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node61 = node1.getChildBefore(node46);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        boolean boolean36 = node23.isCase();
        boolean boolean37 = node23.isCase();
        java.lang.String str38 = node23.toString();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("");
        node40.setSourceEncodedPosition(4095);
        boolean boolean43 = node40.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile44 = node40.getStaticSourceFile();
        node40.setVarArgs(false);
        boolean boolean47 = node40.isFromExterns();
        boolean boolean48 = node40.isNull();
        boolean boolean49 = node40.isFalse();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("");
        node51.setSourceEncodedPosition(4095);
        boolean boolean54 = node51.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile55 = node51.getStaticSourceFile();
        boolean boolean56 = node51.isAssignAdd();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("");
        node58.setSourceEncodedPosition(4095);
        boolean boolean61 = node58.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile62 = node58.getStaticSourceFile();
        com.google.javascript.rhino.Node node63 = node51.copyInformationFromForTree(node58);
        com.google.javascript.rhino.Node node64 = node58.removeFirstChild();
        com.google.javascript.rhino.Node node65 = node40.useSourceInfoIfMissingFrom(node58);
        com.google.javascript.rhino.Node node66 = node65.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node23.removeChild(node65);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        boolean boolean8 = node7.isOnlyModifiesThisCall();
        boolean boolean9 = node7.isEmpty();
        node1.putProp((int) '4', (java.lang.Object) node7);
        boolean boolean11 = node7.isDebugger();
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
        node28.setSourceEncodedPosition(4095);
        boolean boolean31 = node28.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile32 = node28.getStaticSourceFile();
        node28.setVarArgs(false);
        boolean boolean35 = node28.isFromExterns();
        boolean boolean36 = node28.isNull();
        boolean boolean37 = node28.isFalse();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        node39.setSourceEncodedPosition(4095);
        boolean boolean42 = node39.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile43 = node39.getStaticSourceFile();
        boolean boolean44 = node39.isAssignAdd();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("");
        node46.setSourceEncodedPosition(4095);
        boolean boolean49 = node46.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = node46.getStaticSourceFile();
        com.google.javascript.rhino.Node node51 = node39.copyInformationFromForTree(node46);
        com.google.javascript.rhino.Node node52 = node46.removeFirstChild();
        com.google.javascript.rhino.Node node53 = node28.useSourceInfoIfMissingFrom(node46);
        com.google.javascript.rhino.Node node54 = node26.useSourceInfoFromForTree(node53);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(45, node54);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("");
        node60.setSourceEncodedPosition(4095);
        boolean boolean63 = node60.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile64 = node60.getStaticSourceFile();
        boolean boolean65 = node60.isAssignAdd();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("");
        node67.setSourceEncodedPosition(4095);
        boolean boolean70 = node67.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile71 = node67.getStaticSourceFile();
        com.google.javascript.rhino.Node node72 = node60.copyInformationFromForTree(node67);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("");
        boolean boolean75 = node74.isOnlyModifiesThisCall();
        boolean boolean76 = node74.isEmpty();
        boolean boolean77 = node74.isArrayLit();
        com.google.javascript.rhino.Node node78 = node60.useSourceInfoFrom(node74);
        boolean boolean79 = node78.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString("");
        boolean boolean82 = node81.isOnlyModifiesThisCall();
        boolean boolean83 = node81.isEmpty();
        boolean boolean84 = node81.isArrayLit();
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString("");
        boolean boolean87 = node86.isOnlyModifiesThisCall();
        boolean boolean88 = node86.isEmpty();
        boolean boolean89 = node86.isReturn();
        boolean boolean90 = node86.isNE();
        com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node(4095, node78, node81, node86, (int) (byte) 10, 32);
        com.google.javascript.rhino.Node node94 = node57.useSourceInfoIfMissingFrom(node93);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.replaceChild(node54, node57);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        boolean boolean56 = node54.isWhile();
        boolean boolean57 = node54.isComma();
        java.util.Set<java.lang.String> strSet58 = node54.getDirectives();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node59 = node28.getChildBefore(node54);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isOnlyModifiesThisCall();
        boolean boolean3 = node1.isEmpty();
        boolean boolean4 = node1.isReturn();
        boolean boolean5 = node1.isEmpty();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("");
        node8.setSourceEncodedPosition(4095);
        boolean boolean11 = node8.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = node8.getStaticSourceFile();
        boolean boolean13 = node8.isAssignAdd();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("");
        node15.setSourceEncodedPosition(4095);
        boolean boolean18 = node15.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = node15.getStaticSourceFile();
        com.google.javascript.rhino.Node node20 = node8.copyInformationFromForTree(node15);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("");
        boolean boolean23 = node22.isOnlyModifiesThisCall();
        boolean boolean24 = node22.isEmpty();
        boolean boolean25 = node22.isArrayLit();
        com.google.javascript.rhino.Node node26 = node8.useSourceInfoFrom(node22);
        boolean boolean27 = node26.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("");
        boolean boolean30 = node29.isOnlyModifiesThisCall();
        boolean boolean31 = node29.isEmpty();
        boolean boolean32 = node29.isArrayLit();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("");
        boolean boolean35 = node34.isOnlyModifiesThisCall();
        boolean boolean36 = node34.isEmpty();
        boolean boolean37 = node34.isReturn();
        boolean boolean38 = node34.isNE();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(4095, node26, node29, node34, (int) (byte) 10, 32);
        boolean boolean42 = node34.isOptionalArg();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        node44.setSourceEncodedPosition(4095);
        boolean boolean47 = node44.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile48 = node44.getStaticSourceFile();
        node44.setVarArgs(false);
        boolean boolean51 = node44.isFromExterns();
        boolean boolean52 = node44.isNull();
        boolean boolean53 = node44.isFalse();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        boolean boolean58 = node57.isTypeOf();
        boolean boolean59 = node57.isInc();
        boolean boolean60 = node57.isSwitch();
        boolean boolean61 = node44.hasChild(node57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node34, node57);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        node16.setSourceEncodedPosition(4095);
        boolean boolean19 = node16.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = node16.getStaticSourceFile();
        node16.setVarArgs(false);
        boolean boolean23 = node16.isFromExterns();
        boolean boolean24 = node16.isNull();
        boolean boolean25 = node16.isFalse();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("");
        node27.setSourceEncodedPosition(4095);
        boolean boolean30 = node27.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile31 = node27.getStaticSourceFile();
        boolean boolean32 = node27.isAssignAdd();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("");
        node34.setSourceEncodedPosition(4095);
        boolean boolean37 = node34.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile38 = node34.getStaticSourceFile();
        com.google.javascript.rhino.Node node39 = node27.copyInformationFromForTree(node34);
        com.google.javascript.rhino.Node node40 = node34.removeFirstChild();
        com.google.javascript.rhino.Node node41 = node16.useSourceInfoIfMissingFrom(node34);
        com.google.javascript.rhino.Node node42 = node14.useSourceInfoFromForTree(node41);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(45, node42);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("");
        node45.setSourceEncodedPosition(4095);
        boolean boolean48 = node45.isNot();
        boolean boolean49 = node45.isBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node50 = node42.getChildBefore(node45);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 8);
        int int3 = node1.getIntProp(15);
        node1.detachChildren();
        java.lang.String str5 = node1.toStringTree();
        boolean boolean6 = node1.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node1.getChildAtIndex(46);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        boolean boolean6 = node5.isOnlyModifiesThisCall();
        boolean boolean7 = node5.isEmpty();
        boolean boolean8 = node5.isArrayLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("");
        boolean boolean11 = node10.isOnlyModifiesThisCall();
        boolean boolean12 = node10.isSetterDef();
        com.google.javascript.rhino.Node node13 = node5.srcref(node10);
        com.google.javascript.rhino.Node node14 = node13.getLastSibling();
        boolean boolean15 = node14.isIf();
        node14.setLength(4);
        int int18 = node14.getSourcePosition();
        boolean boolean19 = node14.isThrow();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node14);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("");
        node17.setSourceEncodedPosition(4095);
        boolean boolean20 = node17.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = node17.getStaticSourceFile();
        boolean boolean22 = node17.isAssignAdd();
        boolean boolean23 = node17.isStringKey();
        boolean boolean24 = node17.isIf();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("STRING \n");
        boolean boolean27 = node26.isExprResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.replaceChild(node17, node26);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        boolean boolean36 = node28.isCase();
        boolean boolean37 = node28.hasMoreThanOneChild();
        boolean boolean38 = node28.isLocalResultCall();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("");
        boolean boolean41 = node40.isOnlyModifiesThisCall();
        boolean boolean42 = node40.isEmpty();
        boolean boolean43 = node40.isArrayLit();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("");
        boolean boolean46 = node45.isOnlyModifiesThisCall();
        boolean boolean47 = node45.isSetterDef();
        com.google.javascript.rhino.Node node48 = node40.srcref(node45);
        node48.detachChildren();
        int int50 = node48.getSourcePosition();
        node48.setSourceFileForTesting("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node53 = node28.getChildBefore(node48);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isOnlyModifiesThisCall();
        boolean boolean3 = node1.isSetterDef();
        com.google.javascript.rhino.Node node5 = node1.getAncestor((int) (short) 0);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.new FileLevelJsDocBuilder();
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
        com.google.javascript.rhino.Node[] nodeArray28 = new com.google.javascript.rhino.Node[] { node9 };
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(32, nodeArray28);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("");
        boolean boolean32 = node31.isOnlyModifiesThisCall();
        boolean boolean33 = node31.isEmpty();
        boolean boolean34 = node31.isReturn();
        com.google.javascript.rhino.Node node35 = node29.useSourceInfoFromForTree(node31);
        node31.removeProp(53);
        java.util.Set<java.lang.String> strSet38 = node31.getDirectives();
        boolean boolean39 = node31.isQualifiedName();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder40 = node31.new FileLevelJsDocBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node41 = node5.getChildBefore(node31);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        boolean boolean5 = node1.isBreak();
        boolean boolean6 = node1.isIn();
        boolean boolean7 = node1.isLabel();
        boolean boolean8 = node1.isLabel();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable9 = node1.getAncestors();
        boolean boolean10 = node1.isNE();
        int int11 = node1.getChildCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node1.getChildAtIndex(32);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(52);
        boolean boolean2 = node1.isSyntheticBlock();
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
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] { node5 };
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(32, nodeArray24);
        int int27 = node25.getIntProp((int) (byte) 100);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("");
        boolean boolean30 = node29.isOnlyModifiesThisCall();
        boolean boolean31 = node29.isEmpty();
        boolean boolean32 = node29.isReturn();
        boolean boolean33 = node29.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("");
        node35.setSourceEncodedPosition(4095);
        boolean boolean38 = node35.isNot();
        boolean boolean39 = node35.isBreak();
        boolean boolean40 = node35.isIn();
        com.google.javascript.rhino.Node node41 = node29.useSourceInfoIfMissingFromForTree(node35);
        com.google.javascript.rhino.Node node42 = node25.useSourceInfoFrom(node35);
        node42.putIntProp((int) (short) 10, 16);
        boolean boolean46 = node42.hasMoreThanOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node42);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isOnlyModifiesThisCall();
        boolean boolean3 = node1.isEmpty();
        com.google.javascript.rhino.Node node4 = node1.removeFirstChild();
        boolean boolean5 = node1.isIf();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        node7.setSourceEncodedPosition(4095);
        boolean boolean10 = node7.isNot();
        com.google.javascript.rhino.Node node11 = node1.srcrefTree(node7);
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
        com.google.javascript.rhino.Node node26 = node20.removeFirstChild();
        boolean boolean27 = node20.isAnd();
        node20.putProp(46, (java.lang.Object) 45);
        com.google.javascript.rhino.Node node32 = node20.getAncestor(0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.siblings();
        node32.putIntProp(12, 43);
        com.google.javascript.rhino.Node node37 = node11.useSourceInfoFromForTree(node32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node37.getChildAtIndex(44);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("TRUE\n    STRING STRING \n    STRING  [length: 4]\n    SHEQ\n        STRING  0\n");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 1, node2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(32);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(16, 30, 0);
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
        com.google.javascript.rhino.Node node23 = node17.removeFirstChild();
        boolean boolean24 = node17.isAnd();
        boolean boolean25 = node17.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("");
        boolean boolean28 = node27.isOnlyModifiesThisCall();
        boolean boolean29 = node27.isEmpty();
        boolean boolean30 = node27.isArrayLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        boolean boolean33 = node32.isOnlyModifiesThisCall();
        boolean boolean34 = node32.isSetterDef();
        com.google.javascript.rhino.Node node35 = node27.srcref(node32);
        node17.addChildToFront(node27);
        com.google.javascript.rhino.Node node37 = node17.getLastChild();
        com.google.javascript.rhino.Node node38 = node8.useSourceInfoIfMissingFromForTree(node17);
        node8.addSuppression("STRING  0\n    NUMBER 0.0 [synthetic: 1]\n");
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("");
        boolean boolean43 = node42.isOnlyModifiesThisCall();
        boolean boolean44 = node42.isSetterDef();
        com.google.javascript.rhino.Node node46 = node42.getAncestor((int) (short) 0);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("");
        boolean boolean49 = node48.isOnlyModifiesThisCall();
        boolean boolean50 = node48.isEmpty();
        com.google.javascript.rhino.Node node51 = node48.removeFirstChild();
        boolean boolean52 = node48.isIf();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("");
        node54.setSourceEncodedPosition(4095);
        boolean boolean57 = node54.isNot();
        com.google.javascript.rhino.Node node58 = node48.srcrefTree(node54);
        boolean boolean59 = node48.isContinue();
        com.google.javascript.rhino.Node node60 = node42.srcrefTree(node48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node8, node60);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        int int4 = node3.getLength();
        int int5 = node3.getCharno();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("");
        node7.setSourceEncodedPosition(4095);
        boolean boolean10 = node7.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = node7.getStaticSourceFile();
        boolean boolean12 = node7.isAssignAdd();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("");
        node14.setSourceEncodedPosition(4095);
        boolean boolean17 = node14.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile18 = node14.getStaticSourceFile();
        com.google.javascript.rhino.Node node19 = node7.copyInformationFromForTree(node14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("");
        boolean boolean22 = node21.isOnlyModifiesThisCall();
        boolean boolean23 = node21.isEmpty();
        boolean boolean24 = node21.isArrayLit();
        com.google.javascript.rhino.Node node25 = node7.useSourceInfoFrom(node21);
        int int27 = node25.getIntProp(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node3.getChildBefore(node25);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node8.getChildAtIndex((int) (short) 100);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node22.getChildAtIndex(48);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        int int4 = node3.getLength();
        boolean boolean5 = node3.isStringKey();
        com.google.javascript.rhino.Node node6 = node3.removeFirstChild();
        boolean boolean7 = node3.isGetterDef();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("NUMBER 37.0 100\n");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("");
        node11.setSourceEncodedPosition(4095);
        boolean boolean14 = node11.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = node11.getStaticSourceFile();
        node11.setVarArgs(false);
        boolean boolean18 = node11.isFromExterns();
        boolean boolean19 = node11.isNull();
        boolean boolean20 = node11.isFalse();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("");
        node22.setSourceEncodedPosition(4095);
        boolean boolean25 = node22.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile26 = node22.getStaticSourceFile();
        boolean boolean27 = node22.isAssignAdd();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("");
        node29.setSourceEncodedPosition(4095);
        boolean boolean32 = node29.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile33 = node29.getStaticSourceFile();
        com.google.javascript.rhino.Node node34 = node22.copyInformationFromForTree(node29);
        com.google.javascript.rhino.Node node35 = node29.removeFirstChild();
        com.google.javascript.rhino.Node node36 = node11.useSourceInfoIfMissingFrom(node29);
        com.google.javascript.rhino.Node node37 = node36.cloneNode();
        int int38 = node37.getLength();
        boolean boolean39 = node37.isEmpty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node9, node37);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nTYPEOF 0\n    STRING \n\n\nTree2:\nSTRING \n\n\nSubtree1: TYPEOF 0\n    STRING \n\n\nSubtree2: STRING \n", 15, 8);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("");
        boolean boolean6 = node5.isOnlyModifiesThisCall();
        boolean boolean7 = node5.isEmpty();
        boolean boolean8 = node5.isArrayLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("");
        boolean boolean11 = node10.isOnlyModifiesThisCall();
        boolean boolean12 = node10.isEmpty();
        boolean boolean13 = node10.isReturn();
        boolean boolean14 = node10.isNE();
        boolean boolean15 = node10.isAssign();
        boolean boolean16 = node10.isQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node5, node10);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(16, 30, 0);
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
        com.google.javascript.rhino.Node node18 = node12.removeFirstChild();
        boolean boolean19 = node12.isAnd();
        boolean boolean20 = node12.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("");
        boolean boolean23 = node22.isOnlyModifiesThisCall();
        boolean boolean24 = node22.isEmpty();
        boolean boolean25 = node22.isArrayLit();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("");
        boolean boolean28 = node27.isOnlyModifiesThisCall();
        boolean boolean29 = node27.isSetterDef();
        com.google.javascript.rhino.Node node30 = node22.srcref(node27);
        node12.addChildToFront(node22);
        com.google.javascript.rhino.Node node32 = node12.getLastChild();
        com.google.javascript.rhino.Node node33 = node3.useSourceInfoIfMissingFromForTree(node12);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node3.getStaticSourceFile();
        java.lang.String str35 = node3.toStringTree();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        node39.setSourceEncodedPosition(4095);
        boolean boolean42 = node39.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile43 = node39.getStaticSourceFile();
        boolean boolean44 = node39.isAssignAdd();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("");
        node46.setSourceEncodedPosition(4095);
        boolean boolean49 = node46.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = node46.getStaticSourceFile();
        com.google.javascript.rhino.Node node51 = node39.copyInformationFromForTree(node46);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("");
        boolean boolean54 = node53.isOnlyModifiesThisCall();
        boolean boolean55 = node53.isEmpty();
        boolean boolean56 = node53.isArrayLit();
        com.google.javascript.rhino.Node node57 = node39.useSourceInfoFrom(node53);
        boolean boolean58 = node57.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("");
        boolean boolean61 = node60.isOnlyModifiesThisCall();
        boolean boolean62 = node60.isEmpty();
        boolean boolean63 = node60.isArrayLit();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("");
        boolean boolean66 = node65.isOnlyModifiesThisCall();
        boolean boolean67 = node65.isEmpty();
        boolean boolean68 = node65.isReturn();
        boolean boolean69 = node65.isNE();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(4095, node57, node60, node65, (int) (byte) 10, 32);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("");
        node74.setSourceEncodedPosition(4095);
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(0, "STRING  0", 53, 100);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(36, node72, node74, node81);
        boolean boolean83 = node72.isGetElem();
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString("");
        boolean boolean86 = node85.isOnlyModifiesThisCall();
        boolean boolean87 = node85.isEmpty();
        boolean boolean88 = node85.isArrayLit();
        boolean boolean89 = node85.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node90 = node72.srcref(node85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node91 = node3.getChildBefore(node72);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(0, "STRING  0", 53, 100);
        boolean boolean5 = node4.isAnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node4.getChildAtIndex(38);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        boolean boolean5 = node1.isBreak();
        boolean boolean6 = node1.isTypeOf();
        boolean boolean7 = node1.isDec();
        boolean boolean8 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("");
        node10.setSourceEncodedPosition(4095);
        boolean boolean13 = node10.isNot();
        boolean boolean14 = node10.isBreak();
        boolean boolean15 = node10.isTypeOf();
        boolean boolean16 = node10.isDec();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("");
        node18.setSourceEncodedPosition(4095);
        boolean boolean21 = node18.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = node18.getStaticSourceFile();
        boolean boolean23 = node18.isAssignAdd();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("");
        node25.setSourceEncodedPosition(4095);
        boolean boolean28 = node25.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = node25.getStaticSourceFile();
        com.google.javascript.rhino.Node node30 = node18.copyInformationFromForTree(node25);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        boolean boolean33 = node32.isOnlyModifiesThisCall();
        boolean boolean34 = node32.isEmpty();
        boolean boolean35 = node32.isArrayLit();
        com.google.javascript.rhino.Node node36 = node18.useSourceInfoFrom(node32);
        boolean boolean37 = node36.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node38 = node10.useSourceInfoFromForTree(node36);
        boolean boolean39 = node38.isStringKey();
        boolean boolean40 = node38.isNumber();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = node38.getStaticSourceFile();
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
        node50.putProp(46, (java.lang.Object) 45);
        com.google.javascript.rhino.Node node62 = node50.getAncestor(0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable63 = node62.siblings();
        node62.putIntProp(12, 43);
        node62.setType(49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node38, node62);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
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
        com.google.javascript.rhino.Node node37 = node28.getLastSibling();
        boolean boolean38 = node28.isFalse();
        int int39 = node28.getChildCount();
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
        com.google.javascript.rhino.Node node54 = node48.removeFirstChild();
        boolean boolean55 = node48.isAnd();
        boolean boolean56 = node48.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("");
        boolean boolean59 = node58.isOnlyModifiesThisCall();
        boolean boolean60 = node58.isEmpty();
        boolean boolean61 = node58.isArrayLit();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("");
        boolean boolean64 = node63.isOnlyModifiesThisCall();
        boolean boolean65 = node63.isSetterDef();
        com.google.javascript.rhino.Node node66 = node58.srcref(node63);
        node48.addChildToFront(node58);
        com.google.javascript.rhino.Node node68 = node58.getLastChild();
        int int69 = node58.getChildCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node70 = node28.getChildBefore(node58);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node1.getChildAtIndex(44);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
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
        boolean boolean40 = node22.isRegExp();
        com.google.javascript.rhino.Node node41 = node22.getLastChild();
        boolean boolean42 = node41.isDo();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        boolean boolean45 = node44.isOnlyModifiesThisCall();
        boolean boolean46 = node44.isEmpty();
        boolean boolean47 = node44.isReturn();
        boolean boolean48 = node44.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("");
        node50.setSourceEncodedPosition(4095);
        boolean boolean53 = node50.isNot();
        boolean boolean54 = node50.isBreak();
        boolean boolean55 = node50.isIn();
        com.google.javascript.rhino.Node node56 = node44.useSourceInfoIfMissingFromForTree(node50);
        com.google.javascript.rhino.Node node57 = node56.cloneNode();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("");
        node60.setSourceEncodedPosition(4095);
        boolean boolean63 = node60.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile64 = node60.getStaticSourceFile();
        boolean boolean65 = node60.isAssignAdd();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("");
        node67.setSourceEncodedPosition(4095);
        boolean boolean70 = node67.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile71 = node67.getStaticSourceFile();
        com.google.javascript.rhino.Node node72 = node60.copyInformationFromForTree(node67);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("");
        boolean boolean75 = node74.isOnlyModifiesThisCall();
        boolean boolean76 = node74.isEmpty();
        boolean boolean77 = node74.isArrayLit();
        com.google.javascript.rhino.Node node78 = node60.useSourceInfoFrom(node74);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder79 = node60.new FileLevelJsDocBuilder();
        boolean boolean80 = node60.isDefaultCase();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (byte) 0, node60, (int) ' ', 53);
        boolean boolean84 = node60.isQuotedString();
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString("");
        node86.setSourceEncodedPosition(4095);
        com.google.javascript.rhino.Node node89 = node86.getLastSibling();
        node86.setSourceFileForTesting("");
        node60.addChildrenToFront(node86);
        boolean boolean93 = node56.isEquivalentToTyped(node60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node94 = node41.getChildBefore(node56);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
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
        boolean boolean65 = node64.isExprResult();
        com.google.javascript.rhino.Node node66 = node64.removeFirstChild();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        boolean boolean71 = node70.isTypeOf();
        boolean boolean72 = node70.isInc();
        com.google.javascript.rhino.Node node73 = node70.cloneTree();
        node66.addChildToBack(node70);
        boolean boolean75 = node70.isOr();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node77 = node70.getChildAtIndex(35);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
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
        boolean boolean16 = node1.isFor();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("");
        boolean boolean19 = node18.isOnlyModifiesThisCall();
        boolean boolean20 = node18.isEmpty();
        boolean boolean21 = node18.isArrayLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("");
        boolean boolean24 = node23.isOnlyModifiesThisCall();
        boolean boolean25 = node23.isSetterDef();
        com.google.javascript.rhino.Node node26 = node18.srcref(node23);
        com.google.javascript.rhino.Node node27 = node26.getLastSibling();
        boolean boolean28 = node27.isIf();
        com.google.javascript.rhino.Node node29 = node1.clonePropsFrom(node27);
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
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder51 = node32.new FileLevelJsDocBuilder();
        boolean boolean52 = node32.isDefaultCase();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (byte) 0, node32, (int) ' ', 53);
        boolean boolean56 = node32.isQuotedString();
        boolean boolean57 = node32.isDelProp();
        int int58 = node27.getIndexOfChild(node32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node60 = node27.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
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
        node9.putProp(46, (java.lang.Object) 45);
        com.google.javascript.rhino.Node node21 = node9.getAncestor(0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.siblings();
        node21.putIntProp(12, 43);
        node21.setType(49);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0, node21, 38, (int) (short) 10);
        boolean boolean31 = node21.isAnd();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(46, "STRING \n");
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("");
        node37.setSourceEncodedPosition(4095);
        boolean boolean40 = node37.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = node37.getStaticSourceFile();
        boolean boolean42 = node37.isAssignAdd();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("");
        node44.setSourceEncodedPosition(4095);
        boolean boolean47 = node44.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile48 = node44.getStaticSourceFile();
        com.google.javascript.rhino.Node node49 = node37.copyInformationFromForTree(node44);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("");
        boolean boolean52 = node51.isOnlyModifiesThisCall();
        boolean boolean53 = node51.isEmpty();
        boolean boolean54 = node51.isArrayLit();
        com.google.javascript.rhino.Node node55 = node37.useSourceInfoFrom(node51);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(32, nodeArray56);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("");
        boolean boolean60 = node59.isOnlyModifiesThisCall();
        boolean boolean61 = node59.isEmpty();
        boolean boolean62 = node59.isReturn();
        com.google.javascript.rhino.Node node63 = node57.useSourceInfoFromForTree(node59);
        boolean boolean64 = node57.isCall();
        com.google.javascript.rhino.Node node65 = node57.getLastChild();
        com.google.javascript.rhino.Node node66 = node65.cloneNode();
        boolean boolean67 = node66.isNew();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node21.replaceChild(node34, node66);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isOnlyModifiesThisCall();
        boolean boolean3 = node1.isEmpty();
        boolean boolean4 = node1.isArrayLit();
        boolean boolean5 = node1.isBreak();
        boolean boolean6 = node1.isFor();
        boolean boolean7 = node1.isWith();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("");
        boolean boolean10 = node9.isOnlyModifiesThisCall();
        boolean boolean11 = node9.isEmpty();
        boolean boolean12 = node9.isArrayLit();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("");
        boolean boolean15 = node14.isOnlyModifiesThisCall();
        boolean boolean16 = node14.isSetterDef();
        com.google.javascript.rhino.Node node17 = node9.srcref(node14);
        java.lang.String str18 = node9.getQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node1.getChildBefore(node9);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isOnlyModifiesThisCall();
        int int3 = node1.getSourceOffset();
        boolean boolean4 = node1.isExprResult();
        int int6 = node1.getIntProp(0);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node1.getChildBefore(node8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        node1.setSourceEncodedPosition(4095);
        boolean boolean4 = node1.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = node1.getStaticSourceFile();
        boolean boolean6 = node1.isAssignAdd();
        boolean boolean7 = node1.isStringKey();
        boolean boolean8 = node1.isIf();
        int int9 = node1.getLength();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("");
        node11.setSourceEncodedPosition(4095);
        boolean boolean14 = node11.isNot();
        boolean boolean15 = node11.isBreak();
        boolean boolean16 = node11.isTypeOf();
        int int17 = node11.getCharno();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("");
        boolean boolean20 = node19.isOnlyModifiesThisCall();
        int int21 = node19.getSourceOffset();
        boolean boolean22 = node19.isExprResult();
        com.google.javascript.rhino.Node node23 = node11.srcref(node19);
        boolean boolean24 = node23.isNE();
        java.lang.String str25 = node23.toStringTree();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("");
        node27.setSourceEncodedPosition(4095);
        boolean boolean30 = node27.isNot();
        boolean boolean31 = node27.isBreak();
        boolean boolean32 = node27.isTypeOf();
        boolean boolean33 = node27.isInc();
        boolean boolean34 = node27.isWhile();
        node27.setSourceEncodedPosition((-1));
        com.google.javascript.rhino.Node node37 = node27.getNext();
        boolean boolean38 = node27.isCall();
        com.google.javascript.rhino.Node node39 = node23.useSourceInfoIfMissingFromForTree(node27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node40 = node1.getChildBefore(node27);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
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
        boolean boolean20 = node1.isVarArgs();
        int int21 = node1.getType();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("");
        node25.setSourceEncodedPosition(4095);
        boolean boolean28 = node25.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = node25.getStaticSourceFile();
        boolean boolean30 = node25.isAssignAdd();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("");
        node32.setSourceEncodedPosition(4095);
        boolean boolean35 = node32.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = node32.getStaticSourceFile();
        com.google.javascript.rhino.Node node37 = node25.copyInformationFromForTree(node32);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("");
        boolean boolean40 = node39.isOnlyModifiesThisCall();
        boolean boolean41 = node39.isEmpty();
        boolean boolean42 = node39.isArrayLit();
        com.google.javascript.rhino.Node node43 = node25.useSourceInfoFrom(node39);
        boolean boolean44 = node43.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("");
        boolean boolean47 = node46.isOnlyModifiesThisCall();
        boolean boolean48 = node46.isEmpty();
        boolean boolean49 = node46.isArrayLit();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("");
        boolean boolean52 = node51.isOnlyModifiesThisCall();
        boolean boolean53 = node51.isEmpty();
        boolean boolean54 = node51.isReturn();
        boolean boolean55 = node51.isNE();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(4095, node43, node46, node51, (int) (byte) 10, 32);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("");
        node60.setSourceEncodedPosition(4095);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(0, "STRING  0", 53, 100);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(36, node58, node60, node67);
        boolean boolean69 = node67.isTypeOf();
        boolean boolean70 = node67.isGetterDef();
        boolean boolean71 = node67.isFor();
        boolean boolean72 = node1.isEquivalentToTyped(node67);
        java.lang.Object obj74 = node1.getProp(0);
        boolean boolean75 = node1.isSyntheticBlock();
        node1.setLength(35);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString("");
        boolean boolean80 = node79.isOnlyModifiesThisCall();
        boolean boolean81 = node79.isEmpty();
        com.google.javascript.rhino.Node node82 = node79.removeFirstChild();
        boolean boolean83 = node79.isCall();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable84 = node79.siblings();
        boolean boolean85 = node79.isGetProp();
        com.google.javascript.rhino.Node node86 = node1.useSourceInfoIfMissingFromForTree(node79);
        boolean boolean87 = node86.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node91 = com.google.javascript.rhino.Node.newNumber((double) 37, (int) (short) 100, 100);
        boolean boolean92 = node91.isTypeOf();
        boolean boolean93 = node91.isInc();
        com.google.javascript.rhino.Node node94 = node91.cloneTree();
        boolean boolean95 = node91.isNot();
        boolean boolean96 = node91.isDec();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile97 = node91.getStaticSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node86.removeChild(node91);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nNUMBER 37.0 100\n\n\nTree2:\nSTRING  0\n\n\nSubtree1: NUMBER 37.0 100\n\n\nSubtree2: STRING  0\n", (int) (short) 100, 31);
        boolean boolean4 = node3.isNumber();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
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
        com.google.javascript.rhino.Node node43 = node6.useSourceInfoIfMissingFrom(node42);
        boolean boolean44 = node43.isIf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node45 = node3.getChildBefore(node43);
    }
}

