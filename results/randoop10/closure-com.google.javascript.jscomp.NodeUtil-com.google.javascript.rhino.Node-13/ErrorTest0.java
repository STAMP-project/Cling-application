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
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        boolean boolean12 = node3.isFromExterns();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node16);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        node7.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int17 = node16.getLineno();
        boolean boolean18 = node7.isEquivalentToTyped(node16);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node26.setString("");
        com.google.javascript.rhino.Node node29 = node22.useSourceInfoIfMissingFromForTree(node26);
        node26.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int36 = node35.getLineno();
        boolean boolean37 = node26.isEquivalentToTyped(node35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node7.getChildBefore(node26);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        boolean boolean30 = node28.isDelProp();
        boolean boolean31 = node28.isNumber();
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
        boolean boolean61 = node60.isDec();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 52);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node71.setString("");
        com.google.javascript.rhino.Node node74 = node67.useSourceInfoIfMissingFromForTree(node71);
        boolean boolean75 = node67.isGetElem();
        com.google.javascript.rhino.Node node76 = node67.cloneNode();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node84.setString("");
        com.google.javascript.rhino.Node node87 = node80.useSourceInfoIfMissingFromForTree(node84);
        boolean boolean88 = node80.isGetElem();
        int int90 = node80.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node91 = com.google.javascript.jscomp.NodeUtil.newExpr(node80);
        com.google.javascript.rhino.Node node92 = node67.clonePropsFrom(node80);
        boolean boolean93 = node92.isReturn();
        com.google.javascript.jscomp.CodingConvention.Bind bind94 = new com.google.javascript.jscomp.CodingConvention.Bind(node60, node63, node92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node28.removeChild(node92);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        boolean boolean27 = node19.isGetElem();
        int int29 = node19.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newExpr(node19);
        com.google.javascript.rhino.Node node31 = node19.detachFromParent();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(4, node19, 30, (int) (short) 0);
        boolean boolean35 = node34.isScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node36 = node12.getChildBefore(node34);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node[] nodeArray3 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), nodeArray3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(44, nodeArray3, 40, 42);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(37, node7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node7.getChildAtIndex(44);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isDebugger();
        boolean boolean14 = node12.isArrayLit();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(40);
        boolean boolean17 = node16.isAdd();
        int int18 = node16.getSideEffectFlags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node12.getChildBefore(node16);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        node3.setQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node3.getChildAtIndex((int) 'a');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int4 = node3.getLineno();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node13.setString("");
        com.google.javascript.rhino.Node node16 = node9.useSourceInfoIfMissingFromForTree(node13);
        boolean boolean17 = node9.isGetElem();
        int int19 = node9.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newExpr(node9);
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
        com.google.javascript.rhino.Node node51 = node20.useSourceInfoFrom(node24);
        node51.detachChildren();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(31, node51, 36, 51);
        boolean boolean56 = node55.isAdd();
        com.google.javascript.rhino.Node node57 = node55.removeChildren();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node58 = node3.getChildBefore(node57);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(8, "unknown");
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean4 = jSDocInfo3.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo3.setVisibility(visibility5);
        java.util.Set<java.lang.String> strSet7 = jSDocInfo3.getParameterNames();
        java.lang.String str8 = jSDocInfo3.getMeaning();
        java.lang.String str9 = jSDocInfo3.getDeprecationReason();
        node2.setJSDocInfo(jSDocInfo3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node2.getChildAtIndex((int) (short) 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder2 = nodeSourcePositionBuilder0.add((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node10.setString("");
        com.google.javascript.rhino.Node node13 = node6.useSourceInfoIfMissingFromForTree(node10);
        boolean boolean14 = node6.isGetElem();
        int int16 = node6.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node6);
        com.google.javascript.rhino.Node node18 = node6.detachFromParent();
        boolean boolean19 = node6.isQuotedString();
        boolean boolean20 = node6.isNoSideEffectsCall();
        typePosition1.setItem(node6);
        boolean boolean22 = node6.isInc();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        com.google.javascript.rhino.Node node36 = node27.cloneNode();
        boolean boolean37 = node36.isContinue();
        com.google.javascript.rhino.Node node38 = node36.cloneTree();
        node38.setSourceEncodedPosition((int) (short) 10);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = node38.getStaticSourceFile();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node49.setString("");
        com.google.javascript.rhino.Node node52 = node45.useSourceInfoIfMissingFromForTree(node49);
        boolean boolean53 = node45.isGetElem();
        com.google.javascript.rhino.Node node54 = node45.cloneNode();
        boolean boolean55 = node54.isContinue();
        com.google.javascript.rhino.Node node56 = node54.cloneTree();
        node56.setSourceEncodedPosition((int) (short) 10);
        boolean boolean59 = node56.isSetterDef();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(41, node38, node56);
        node38.setQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node62 = node6.getChildBefore(node38);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node15 = node3.detachFromParent();
        boolean boolean16 = node3.isStringKey();
        node3.removeProp((int) (short) 1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node27.setString("");
        com.google.javascript.rhino.Node node30 = node23.useSourceInfoIfMissingFromForTree(node27);
        boolean boolean31 = node23.isGetElem();
        int int33 = node23.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newExpr(node23);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node42.setString("");
        com.google.javascript.rhino.Node node45 = node38.useSourceInfoIfMissingFromForTree(node42);
        boolean boolean46 = node38.isGetElem();
        com.google.javascript.rhino.Node node47 = node38.cloneNode();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node55.setString("");
        com.google.javascript.rhino.Node node58 = node51.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean59 = node51.isGetElem();
        int int61 = node51.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newExpr(node51);
        com.google.javascript.rhino.Node node63 = node38.clonePropsFrom(node51);
        boolean boolean64 = node38.isGetElem();
        com.google.javascript.rhino.Node node65 = node34.useSourceInfoFrom(node38);
        com.google.javascript.rhino.Node node66 = node65.removeFirstChild();
        boolean boolean67 = node65.isCase();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(51, node65);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node76.setString("");
        com.google.javascript.rhino.Node node79 = node72.useSourceInfoIfMissingFromForTree(node76);
        boolean boolean80 = node72.isGetElem();
        int int82 = node72.getIntProp((int) (byte) -1);
        boolean boolean83 = node72.isLabel();
        com.google.javascript.rhino.Node node84 = node72.getLastChild();
        boolean boolean85 = node72.isDebugger();
        node65.addChildToBack(node72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node65);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 1, 100, (int) ' ');
        boolean boolean4 = node3.isGetterDef();
        boolean boolean5 = node3.isFalse();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex((int) (byte) 10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = node12.getStaticSourceFile();
        com.google.javascript.rhino.Node node16 = node12.getChildAtIndex((int) (short) -1);
        node12.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node20 = node12.getAncestor(15);
        boolean boolean21 = node12.isInstanceOf();
        boolean boolean22 = node12.isBlock();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node30.setString("");
        com.google.javascript.rhino.Node node33 = node26.useSourceInfoIfMissingFromForTree(node30);
        boolean boolean34 = node26.isGetElem();
        com.google.javascript.rhino.Node node35 = node26.cloneNode();
        boolean boolean36 = node35.isDebugger();
        node35.setQuotedString();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node35.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node12.getChildBefore(node35);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        node7.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node13 = node7.cloneNode();
        boolean boolean14 = node7.isUnscopedQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = node7.getChildAtIndex(42);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        boolean boolean15 = node12.isVarArgs();
        boolean boolean16 = node12.isDebugger();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        com.google.javascript.rhino.Node node29 = node20.cloneNode();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node37.setString("");
        com.google.javascript.rhino.Node node40 = node33.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean41 = node33.isGetElem();
        int int43 = node33.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newExpr(node33);
        com.google.javascript.rhino.Node node45 = node20.clonePropsFrom(node33);
        boolean boolean46 = node45.isFalse();
        boolean boolean47 = node45.isVar();
        com.google.javascript.rhino.InputId inputId48 = com.google.javascript.jscomp.NodeUtil.getInputId(node45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.removeChild(node45);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 52);
        boolean boolean2 = node1.isLabel();
        boolean boolean3 = node1.isQuotedString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node1.getChildAtIndex(32);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        int int14 = node4.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
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
        boolean boolean45 = node19.isGetElem();
        com.google.javascript.rhino.Node node46 = node15.useSourceInfoFrom(node19);
        node46.detachChildren();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(31, node46, 36, 51);
        boolean boolean51 = node50.isAdd();
        com.google.javascript.rhino.Node node52 = node50.removeChildren();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node60.setString("");
        com.google.javascript.rhino.Node node63 = node56.useSourceInfoIfMissingFromForTree(node60);
        boolean boolean64 = node56.isGetElem();
        int int66 = node56.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newExpr(node56);
        com.google.javascript.rhino.Node node68 = node56.detachFromParent();
        boolean boolean69 = node56.isStringKey();
        boolean boolean70 = node56.isVar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node52.removeChild(node56);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        boolean boolean47 = node45.isFalse();
        boolean boolean48 = node45.isNot();
        int int49 = node45.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node51 = node45.getChildAtIndex(4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        boolean boolean29 = node28.isReturn();
        java.util.Set<java.lang.String> strSet30 = node28.getDirectives();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node32 = node28.getChildAtIndex(8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node18);
        boolean boolean29 = node18.isTypeOf();
        boolean boolean30 = node3.hasChild(node18);
        com.google.javascript.rhino.Node node31 = node3.cloneTree();
        int int32 = node31.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node34 = node31.getChildAtIndex(4095);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int4 = node3.getLineno();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = new com.google.javascript.rhino.JSTypeExpression(node3, "unknown");
        boolean boolean7 = jSTypeExpression6.isOptionalArg();
        com.google.javascript.rhino.Node node8 = jSTypeExpression6.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node8.getChildAtIndex(12);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        node7.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node7.srcrefTree(node27);
        boolean boolean29 = node28.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node30 = node28.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node32 = node30.getChildAtIndex(100);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node18);
        boolean boolean29 = node18.isTypeOf();
        boolean boolean30 = node3.hasChild(node18);
        boolean boolean31 = node3.isInstanceOf();
        boolean boolean32 = node3.isOnlyModifiesThisCall();
        boolean boolean33 = node3.isThrow();
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), nodeArray37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(16, nodeArray37, 8, (int) (byte) 0);
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList42 = com.google.common.collect.ImmutableList.copyOf((java.lang.Cloneable[]) nodeArray37);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(16, nodeArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node44 = node3.getChildBefore(node43);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        node7.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int17 = node16.getLineno();
        boolean boolean18 = node7.isEquivalentToTyped(node16);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node27.setString("");
        com.google.javascript.rhino.Node node30 = node23.useSourceInfoIfMissingFromForTree(node27);
        boolean boolean31 = node23.isGetElem();
        int int33 = node23.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newExpr(node23);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node42.setString("");
        com.google.javascript.rhino.Node node45 = node38.useSourceInfoIfMissingFromForTree(node42);
        boolean boolean46 = node38.isGetElem();
        com.google.javascript.rhino.Node node47 = node38.cloneNode();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node55.setString("");
        com.google.javascript.rhino.Node node58 = node51.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean59 = node51.isGetElem();
        int int61 = node51.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newExpr(node51);
        com.google.javascript.rhino.Node node63 = node38.clonePropsFrom(node51);
        boolean boolean64 = node38.isGetElem();
        com.google.javascript.rhino.Node node65 = node34.useSourceInfoFrom(node38);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(40);
        boolean boolean68 = node67.isAdd();
        node65.addChildToFront(node67);
        boolean boolean70 = node67.isIf();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable71 = node67.siblings();
        boolean boolean72 = node67.isBlock();
        boolean boolean73 = node67.isCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node7.removeChild(node67);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node12);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition16 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        com.google.javascript.rhino.Node node29 = node20.cloneNode();
        boolean boolean30 = node29.isContinue();
        com.google.javascript.rhino.Node node31 = node29.cloneTree();
        boolean boolean32 = node29.isLocalResultCall();
        typePosition16.setItem(node29);
        com.google.javascript.rhino.Node node34 = typePosition16.getItem();
        com.google.javascript.rhino.Node node35 = node12.copyInformationFrom(node34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node37 = node12.getChildAtIndex((int) (byte) 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        node12.detachChildren();
        boolean boolean15 = node12.isWhile();
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        com.google.javascript.rhino.Node node17 = node12.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node19 = node12.getChildAtIndex((int) (short) 100);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
        boolean boolean29 = node28.isFalse();
        boolean boolean30 = node28.isVar();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node38.setString("");
        com.google.javascript.rhino.Node node41 = node34.useSourceInfoIfMissingFromForTree(node38);
        boolean boolean42 = node34.isGetElem();
        int int44 = node34.getIntProp((int) (byte) -1);
        boolean boolean45 = node34.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression47 = new com.google.javascript.rhino.JSTypeExpression(node34, "STRING hi!");
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node55.setString("");
        com.google.javascript.rhino.Node node58 = node51.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean59 = node51.isGetElem();
        com.google.javascript.rhino.Node node60 = node51.cloneNode();
        boolean boolean61 = node60.isDebugger();
        node34.addChildToFront(node60);
        com.google.javascript.rhino.InputId inputId63 = node60.getInputId();
        boolean boolean64 = node60.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node65 = node28.getChildBefore(node60);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int4 = node3.getLineno();
        boolean boolean5 = node3.isEmpty();
        node3.setSourceEncodedPosition(54);
        int int8 = node3.getChildCount();
        boolean boolean9 = node3.isQuotedString();
        boolean boolean11 = node3.getBooleanProp(29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node3.getChildAtIndex(1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry21.createFunctionType(jSType22, jSTypeArray23);
        boolean boolean25 = functionType24.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        boolean boolean38 = functionType37.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType44.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType44.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType44.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = functionType37.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean50 = functionType44.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, false);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry53.createFunctionType(jSType54, jSTypeArray55);
        boolean boolean57 = functionType56.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, false);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry60.createFunctionType(jSType61, jSTypeArray62);
        boolean boolean64 = functionType63.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable65 = functionType63.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType63.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType63.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = functionType56.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.Node node69 = functionType56.getSource();
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType56.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, false);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry74.createFunctionType(jSType75, jSTypeArray76);
        boolean boolean78 = functionType77.isNominalType();
        int int79 = functionType77.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, false);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray84 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry82.createFunctionType(jSType83, jSTypeArray84);
        boolean boolean86 = functionType85.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList91 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor92 = strComparableList91.iterator();
        boolean boolean93 = functionType85.equals((java.lang.Object) strComparableItor92);
        com.google.javascript.rhino.Node node94 = functionType85.getSource();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.FunctionType> functionTypeList95 = com.google.common.collect.ImmutableList.of(functionType31, functionType44, functionType56, functionType77, functionType85);
        functionType85.clearCachedValues();
        boolean boolean97 = functionType85.isGlobalThisType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean99 = functionType85.isUnionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType98.", functionType24.equals(parameterizedType98) == parameterizedType98.equals(functionType24));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
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
        node28.setLineno(8);
        boolean boolean31 = node28.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(8, "unknown");
        com.google.javascript.rhino.Node node35 = node28.copyInformationFrom(node34);
        int int36 = node28.getLength();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node44.setString("");
        com.google.javascript.rhino.Node node47 = node40.useSourceInfoIfMissingFromForTree(node44);
        boolean boolean48 = node40.isGetElem();
        boolean boolean49 = node40.isFromExterns();
        boolean boolean50 = node40.isUnscopedQualifiedName();
        boolean boolean51 = node40.isVoid();
        boolean boolean52 = node40.isScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node53 = node28.getChildBefore(node40);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        int int14 = node4.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int20 = node19.getLineno();
        boolean boolean21 = node19.isEmpty();
        com.google.javascript.rhino.InputId inputId22 = com.google.javascript.jscomp.NodeUtil.getInputId(node19);
        boolean boolean23 = node15.isEquivalentToTyped(node19);
        com.google.javascript.rhino.Node node24 = node19.getLastSibling();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node32.setString("");
        com.google.javascript.rhino.Node node35 = node28.useSourceInfoIfMissingFromForTree(node32);
        boolean boolean36 = node28.isGetElem();
        com.google.javascript.rhino.Node node37 = node28.cloneNode();
        boolean boolean38 = node37.isExprResult();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), node24, node37, 0, 42);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node24);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int47 = node46.getLineno();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = new com.google.javascript.rhino.JSTypeExpression(node46, "unknown");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node50 = node24.getChildBefore(node46);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        int int14 = node4.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
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
        boolean boolean45 = node19.isGetElem();
        com.google.javascript.rhino.Node node46 = node15.useSourceInfoFrom(node19);
        node46.detachChildren();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(31, node46, 36, 51);
        boolean boolean51 = node50.isAdd();
        com.google.javascript.rhino.Node node52 = node50.removeChildren();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node60.setString("");
        com.google.javascript.rhino.Node node63 = node56.useSourceInfoIfMissingFromForTree(node60);
        boolean boolean64 = node56.isGetElem();
        com.google.javascript.rhino.Node node65 = node56.cloneNode();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node73.setString("");
        com.google.javascript.rhino.Node node76 = node69.useSourceInfoIfMissingFromForTree(node73);
        boolean boolean77 = node69.isGetElem();
        int int79 = node69.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.newExpr(node69);
        com.google.javascript.rhino.Node node81 = node56.clonePropsFrom(node69);
        com.google.javascript.rhino.Node node82 = node50.srcref(node69);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node85 = node69.getChildAtIndex(4095);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int4 = node3.getLineno();
        int int5 = node3.getLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex(1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
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
        boolean boolean18 = node14.isFor();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node14.getChildBefore(node20);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isDebugger();
        boolean boolean14 = node12.isArrayLit();
        boolean boolean15 = node12.isReturn();
        boolean boolean16 = node12.isVar();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        com.google.javascript.rhino.Node node29 = node20.cloneNode();
        boolean boolean30 = node29.isContinue();
        com.google.javascript.rhino.Node node31 = node29.cloneTree();
        boolean boolean32 = node31.isAssignAdd();
        boolean boolean33 = node31.isSyntheticBlock();
        boolean boolean34 = node31.isParamList();
        boolean boolean35 = node31.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.removeChild(node31);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
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
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry21.createFunctionType(jSType22, jSTypeArray23);
        boolean boolean25 = functionType24.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        boolean boolean38 = functionType37.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType44.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType44.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType44.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = functionType37.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean50 = functionType44.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, false);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry53.createFunctionType(jSType54, jSTypeArray55);
        boolean boolean57 = functionType56.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, false);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry60.createFunctionType(jSType61, jSTypeArray62);
        boolean boolean64 = functionType63.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable65 = functionType63.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType63.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType63.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = functionType56.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.Node node69 = functionType56.getSource();
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType56.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, false);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry74.createFunctionType(jSType75, jSTypeArray76);
        boolean boolean78 = functionType77.isNominalType();
        int int79 = functionType77.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, false);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray84 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry82.createFunctionType(jSType83, jSTypeArray84);
        boolean boolean86 = functionType85.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList91 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor92 = strComparableList91.iterator();
        boolean boolean93 = functionType85.equals((java.lang.Object) strComparableItor92);
        com.google.javascript.rhino.Node node94 = functionType85.getSource();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.FunctionType> functionTypeList95 = com.google.common.collect.ImmutableList.of(functionType31, functionType44, functionType56, functionType77, functionType85);
        functionType85.clearCachedValues();
        boolean boolean97 = functionType85.isGlobalThisType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType85);
        com.google.javascript.rhino.jstype.FunctionType functionType99 = functionType85.toMaybeFunctionType();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on functionType24 and parameterizedType98.", functionType24.equals(parameterizedType98) == parameterizedType98.equals(functionType24));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        boolean boolean12 = node3.isFromExterns();
        boolean boolean13 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node3.new FileLevelJsDocBuilder();
        boolean boolean15 = node3.isEmpty();
        boolean boolean16 = node3.isAssignAdd();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        com.google.javascript.rhino.Node node29 = node20.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node20);
        boolean boolean31 = node20.isTypeOf();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node39.setString("");
        com.google.javascript.rhino.Node node42 = node35.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean43 = node35.isGetElem();
        com.google.javascript.rhino.Node node44 = node35.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node35);
        boolean boolean46 = node35.isTypeOf();
        boolean boolean47 = node20.hasChild(node35);
        com.google.javascript.rhino.Node node48 = node20.cloneTree();
        node3.addChildrenToFront(node20);
        node3.removeProp(39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node53 = node3.getChildAtIndex(3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        int int14 = node4.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
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
        boolean boolean45 = node19.isGetElem();
        com.google.javascript.rhino.Node node46 = node15.useSourceInfoFrom(node19);
        node46.detachChildren();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(31, node46, 36, 51);
        boolean boolean51 = node50.isAdd();
        com.google.javascript.rhino.Node node52 = node50.removeChildren();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node60.setString("");
        com.google.javascript.rhino.Node node63 = node56.useSourceInfoIfMissingFromForTree(node60);
        boolean boolean64 = node56.isGetElem();
        com.google.javascript.rhino.Node node65 = node56.cloneNode();
        boolean boolean66 = node65.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile67 = node65.getStaticSourceFile();
        com.google.javascript.rhino.Node node69 = node65.getChildAtIndex((int) (short) -1);
        int int70 = node65.getSideEffectFlags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node52.removeChild(node65);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("{proxy:function (): {2022554163}}", 39, 14);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(40);
        boolean boolean6 = node5.isAdd();
        boolean boolean7 = node5.isDefaultCase();
        node5.setLength(130);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node5);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
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
        com.google.javascript.rhino.InputId inputId19 = node12.getInputId();
        boolean boolean20 = node12.isNoSideEffectsCall();
        boolean boolean21 = node12.isContinue();
        int int22 = node12.getCharno();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        int int37 = node27.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int43 = node42.getLineno();
        boolean boolean44 = node42.isEmpty();
        com.google.javascript.rhino.InputId inputId45 = com.google.javascript.jscomp.NodeUtil.getInputId(node42);
        boolean boolean46 = node38.isEquivalentToTyped(node42);
        com.google.javascript.rhino.Node node47 = node42.getLastSibling();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node55.setString("");
        com.google.javascript.rhino.Node node58 = node51.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean59 = node51.isGetElem();
        com.google.javascript.rhino.Node node60 = node51.cloneNode();
        boolean boolean61 = node60.isExprResult();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((-1), node47, node60, 0, 42);
        boolean boolean65 = node64.isAssignAdd();
        java.lang.String str66 = node64.toStringTree();
        boolean boolean67 = node64.isIf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node12.removeChild(node64);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(46);
        boolean boolean2 = node1.isUnscopedQualifiedName();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList7 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList8 = strComparableList7.reverse();
        com.google.javascript.rhino.InputId inputId10 = new com.google.javascript.rhino.InputId("hi!");
        boolean boolean11 = strComparableList7.contains((java.lang.Object) inputId10);
        node1.setInputId(inputId10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int17 = node16.getLineno();
        boolean boolean18 = node16.isParamList();
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        boolean boolean20 = node19.isSwitch();
        boolean boolean21 = node19.wasEmptyNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = node1.getChildBefore(node19);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        boolean boolean15 = node14.isLabel();
        boolean boolean16 = node14.isFromExterns();
        node14.setVarArgs(false);
        boolean boolean19 = node14.isThis();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        boolean boolean24 = node23.isVar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node14.getChildBefore(node23);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "(function (): {672212780})");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = node2.getChildAtIndex(14);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(35);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node9.setString("");
        com.google.javascript.rhino.Node node12 = node5.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean13 = node5.isGetElem();
        int int15 = node5.getIntProp((int) (byte) -1);
        boolean boolean16 = node5.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node5, "STRING hi!");
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node26.setString("");
        com.google.javascript.rhino.Node node29 = node22.useSourceInfoIfMissingFromForTree(node26);
        boolean boolean30 = node22.isGetElem();
        com.google.javascript.rhino.Node node31 = node22.cloneNode();
        boolean boolean32 = node31.isDebugger();
        node5.addChildToFront(node31);
        boolean boolean34 = node5.isNot();
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newExpr(node5);
        com.google.javascript.rhino.Node node36 = node1.useSourceInfoIfMissingFrom(node5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node1.getChildAtIndex(130);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) -1, "true");
        boolean boolean3 = node2.isBlock();
        boolean boolean4 = node2.isFor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node2.getChildAtIndex(11);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int5 = node4.getLineno();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node13.setString("");
        com.google.javascript.rhino.Node node16 = node9.useSourceInfoIfMissingFromForTree(node13);
        boolean boolean17 = node9.isGetElem();
        com.google.javascript.rhino.Node node18 = node9.cloneNode();
        boolean boolean19 = node18.isContinue();
        com.google.javascript.rhino.Node node20 = node18.cloneTree();
        node20.setSourceEncodedPosition((int) (short) 10);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = node20.getStaticSourceFile();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(46, node4, node20, (int) (byte) -1, (-1));
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node34.setString("");
        com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFromForTree(node34);
        boolean boolean38 = node30.isGetElem();
        int int40 = node30.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newExpr(node30);
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
        boolean boolean71 = node45.isGetElem();
        com.google.javascript.rhino.Node node72 = node41.useSourceInfoFrom(node45);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(40);
        boolean boolean75 = node74.isAdd();
        node72.addChildToFront(node74);
        com.google.javascript.rhino.Node node77 = node4.useSourceInfoFrom(node74);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder78 = node74.new FileLevelJsDocBuilder();
        java.lang.String str79 = node74.getQualifiedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = node74.getChildAtIndex(43);
    }
}

