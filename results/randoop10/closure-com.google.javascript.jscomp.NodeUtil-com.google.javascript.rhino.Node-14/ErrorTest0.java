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
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean2 = node1.isLabelName();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean6 = node5.isLabelName();
        java.util.Set<java.lang.String> strSet7 = node5.getDirectives();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean10 = node9.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] { node5, node9 };
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray11, 50, 50);
        boolean boolean15 = node1.isEquivalentTo(node14);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean18 = node17.isLabelName();
        java.util.Set<java.lang.String> strSet19 = node17.getDirectives();
        boolean boolean20 = node17.isGetterDef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node1.getChildBefore(node17);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (short) 100);
        boolean boolean2 = node1.isFor();
        boolean boolean3 = node1.isParamList();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean7 = node6.isLabelName();
        java.util.Set<java.lang.String> strSet8 = node6.getDirectives();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean11 = node10.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] { node6, node10 };
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray12, 50, 50);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node15.addChildToFront(node17);
        boolean boolean19 = node17.isDefaultCase();
        com.google.javascript.rhino.Node node20 = node17.getParent();
        node17.detachChildren();
        boolean boolean22 = node17.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node23 = node1.useSourceInfoIfMissingFrom(node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node23.getChildAtIndex(52);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = node1.getChildAtIndex(35);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean3 = node2.isLabelName();
        java.util.Set<java.lang.String> strSet4 = node2.getDirectives();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean7 = node6.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node2, node6 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray8, 50, 50);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node11.addChildToFront(node13);
        boolean boolean15 = node11.isNew();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoFrom(node17);
        int int19 = node17.getSourcePosition();
        node17.putIntProp(0, 10);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node17.siblings();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile24 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node17);
        node17.setString("Not declared as a constructor");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 10.0f, (int) (short) -1, (int) (short) 100);
        boolean boolean31 = node30.isSetterDef();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("{111306604}", 35, 6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node17.replaceChild(node30, node35);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean4 = node3.isLabelName();
        java.util.Set<java.lang.String> strSet5 = node3.getDirectives();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean8 = node7.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray9 = new com.google.javascript.rhino.Node[] { node3, node7 };
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray9, 50, 50);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node12.addChildToFront(node14);
        boolean boolean16 = node14.isDefaultCase();
        com.google.javascript.rhino.Node node17 = node14.getParent();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean21 = node20.isLabelName();
        java.util.Set<java.lang.String> strSet22 = node20.getDirectives();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean25 = node24.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] { node20, node24 };
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray26, 50, 50);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node29.addChildToFront(node31);
        boolean boolean33 = node29.isNew();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = node29.getJSDocInfo();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean38 = node37.isLabelName();
        java.util.Set<java.lang.String> strSet39 = node37.getDirectives();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean42 = node41.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray43 = new com.google.javascript.rhino.Node[] { node37, node41 };
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray43, 50, 50);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node46.addChildToFront(node48);
        com.google.javascript.rhino.Node node50 = node48.detachFromParent();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean54 = node53.isLabelName();
        java.util.Set<java.lang.String> strSet55 = node53.getDirectives();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean58 = node57.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray59 = new com.google.javascript.rhino.Node[] { node53, node57 };
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray59, 50, 50);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node62.addChildToFront(node64);
        boolean boolean66 = node62.isNew();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node69 = node62.useSourceInfoFrom(node68);
        boolean boolean70 = node62.isFromExterns();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((int) (byte) 100, node17, node29, node48, node62);
        boolean boolean72 = node29.isNoSideEffectsCall();
        boolean boolean73 = node29.isDec();
        boolean boolean74 = node29.isSwitch();
        boolean boolean75 = node29.isAdd();
        boolean boolean76 = node29.isName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node78 = node29.getChildAtIndex(40);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean3 = node2.isLabelName();
        java.util.Set<java.lang.String> strSet4 = node2.getDirectives();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean7 = node6.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node2, node6 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray8, 50, 50);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node11.addChildToFront(node13);
        java.lang.String str15 = node13.getString();
        node13.setQuotedString();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean20 = node19.isLabelName();
        java.util.Set<java.lang.String> strSet21 = node19.getDirectives();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean24 = node23.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray25 = new com.google.javascript.rhino.Node[] { node19, node23 };
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray25, 50, 50);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node28.addChildToFront(node30);
        boolean boolean32 = node28.isNew();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile33 = node28.getStaticSourceFile();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean37 = node36.isLabelName();
        java.util.Set<java.lang.String> strSet38 = node36.getDirectives();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean41 = node40.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] { node36, node40 };
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray42, 50, 50);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node45.addChildToFront(node47);
        boolean boolean49 = node47.isDefaultCase();
        com.google.javascript.rhino.Node node50 = node47.getParent();
        node47.detachChildren();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean55 = node54.isLabelName();
        java.util.Set<java.lang.String> strSet56 = node54.getDirectives();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean59 = node58.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray60 = new com.google.javascript.rhino.Node[] { node54, node58 };
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray60, 50, 50);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node63.addChildToFront(node65);
        boolean boolean67 = node63.isNew();
        java.lang.String[] strArray70 = new java.lang.String[] { "function (): ?", "" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        node63.setDirectives((java.util.Set<java.lang.String>) strSet71);
        int int74 = node47.getIndexOfChild(node63);
        com.google.javascript.rhino.Node node75 = node28.srcrefTree(node47);
        java.lang.Object obj77 = node75.getProp((int) '4');
        boolean boolean78 = node75.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = node13.getChildBefore(node75);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean3 = node2.isLabelName();
        java.util.Set<java.lang.String> strSet4 = node2.getDirectives();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean7 = node6.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node2, node6 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray8, 50, 50);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node11.addChildToFront(node13);
        boolean boolean15 = node13.isDefaultCase();
        com.google.javascript.rhino.Node node16 = node13.getParent();
        node13.detachChildren();
        java.lang.String str18 = node13.toString();
        boolean boolean19 = node13.isAssign();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean23 = node22.isLabelName();
        java.util.Set<java.lang.String> strSet24 = node22.getDirectives();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean27 = node26.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray28 = new com.google.javascript.rhino.Node[] { node22, node26 };
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray28, 50, 50);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node31.addChildToFront(node33);
        boolean boolean35 = node31.isNew();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoFrom(node37);
        boolean boolean39 = node37.isContinue();
        boolean boolean40 = node37.isGetElem();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node37.siblings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node42 = node13.getChildBefore(node37);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        boolean boolean3 = node1.isScript();
        boolean boolean4 = node1.isComma();
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node1);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec7 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a constructor");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean11 = node10.isLabelName();
        java.util.Set<java.lang.String> strSet12 = node10.getDirectives();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean15 = node14.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] { node10, node14 };
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray16, 50, 50);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node19.addChildToFront(node21);
        boolean boolean23 = node21.isDefaultCase();
        com.google.javascript.rhino.Node node24 = node21.getParent();
        node21.detachChildren();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean29 = node28.isLabelName();
        java.util.Set<java.lang.String> strSet30 = node28.getDirectives();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean33 = node32.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray34 = new com.google.javascript.rhino.Node[] { node28, node32 };
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray34, 50, 50);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node37.addChildToFront(node39);
        boolean boolean41 = node37.isNew();
        java.lang.String[] strArray44 = new java.lang.String[] { "function (): ?", "" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        node37.setDirectives((java.util.Set<java.lang.String>) strSet45);
        int int48 = node21.getIndexOfChild(node37);
        boolean boolean49 = node21.isAssignAdd();
        com.google.javascript.rhino.Node node50 = assertionFunctionSpec7.getAssertedParam(node21);
        com.google.javascript.rhino.Node node51 = node1.copyInformationFrom(node50);
        boolean boolean52 = node50.isSetterDef();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 100, 42, 4);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean60 = node59.isLabelName();
        java.util.Set<java.lang.String> strSet61 = node59.getDirectives();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean64 = node63.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray65 = new com.google.javascript.rhino.Node[] { node59, node63 };
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray65, 50, 50);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node68.addChildToFront(node70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node50.replaceChild(node56, node68);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean3 = node2.isLabelName();
        java.util.Set<java.lang.String> strSet4 = node2.getDirectives();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean7 = node6.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node2, node6 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray8, 50, 50);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node11.addChildToFront(node13);
        boolean boolean15 = node13.isDefaultCase();
        com.google.javascript.rhino.Node node16 = node13.getParent();
        node13.detachChildren();
        boolean boolean18 = node13.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean21 = node20.isLabelName();
        java.util.Set<java.lang.String> strSet22 = node20.getDirectives();
        boolean boolean23 = node20.isGetterDef();
        com.google.javascript.rhino.Node node24 = node13.clonePropsFrom(node20);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean28 = node27.isLabelName();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean32 = node31.isLabelName();
        java.util.Set<java.lang.String> strSet33 = node31.getDirectives();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean36 = node35.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] { node31, node35 };
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray37, 50, 50);
        boolean boolean41 = node27.isEquivalentTo(node40);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(50, node40);
        boolean boolean43 = node42.hasOneChild();
        boolean boolean44 = node42.isFunction();
        boolean boolean45 = node42.isIf();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection46 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node42);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("function (): {434720206}", 0, 39);
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = node50.getJSDocInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node13.replaceChild(node42, node50);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) ' ', (-1), (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec6 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name");
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node8);
        java.lang.String str10 = node9.toString();
        boolean boolean11 = node9.isLocalResultCall();
        com.google.javascript.rhino.Node node12 = assertionFunctionSpec6.getAssertedParam(node9);
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec14 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a constructor");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean18 = node17.isLabelName();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean22 = node21.isLabelName();
        java.util.Set<java.lang.String> strSet23 = node21.getDirectives();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean26 = node25.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node21, node25 };
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray27, 50, 50);
        boolean boolean31 = node17.isEquivalentTo(node30);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(50, node30);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newExpr(node34);
        boolean boolean36 = node34.isScript();
        com.google.javascript.rhino.Node node37 = node32.useSourceInfoIfMissingFrom(node34);
        com.google.javascript.rhino.Node node38 = assertionFunctionSpec14.getAssertedParam(node37);
        boolean boolean39 = node37.isAdd();
        com.google.javascript.rhino.Node node40 = assertionFunctionSpec6.getAssertedParam(node37);
        java.lang.String str41 = node37.getQualifiedName();
        boolean boolean42 = node37.isAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = node3.getChildBefore(node37);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (short) -1, "function (): {160022603}", 44, 2);
        boolean boolean5 = node4.isCall();
        boolean boolean6 = node4.isFor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node4.getChildAtIndex(10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        boolean boolean3 = node1.isScript();
        boolean boolean4 = node1.isComma();
        node1.setLineno((int) '#');
        com.google.javascript.rhino.Node node7 = node1.getLastChild();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) -1, (int) 'a', 53);
        com.google.javascript.rhino.Node node12 = node11.getLastChild();
        node11.putBooleanProp(204850, false);
        com.google.javascript.rhino.Node node16 = node1.useSourceInfoFrom(node11);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean19 = node18.isLabelName();
        boolean boolean20 = node18.isInc();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean24 = node23.isLabelName();
        java.util.Set<java.lang.String> strSet25 = node23.getDirectives();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean28 = node27.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] { node23, node27 };
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray29, 50, 50);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node32.addChildToFront(node34);
        boolean boolean36 = node34.isDefaultCase();
        com.google.javascript.rhino.Node node37 = node34.getParent();
        node34.detachChildren();
        com.google.javascript.rhino.Node node39 = node34.getParent();
        boolean boolean40 = node18.isEquivalentToTyped(node34);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean44 = node43.isLabelName();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean48 = node47.isLabelName();
        java.util.Set<java.lang.String> strSet49 = node47.getDirectives();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean52 = node51.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray53 = new com.google.javascript.rhino.Node[] { node47, node51 };
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray53, 50, 50);
        boolean boolean57 = node43.isEquivalentTo(node56);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(50, node56);
        boolean boolean59 = node58.isSwitch();
        com.google.javascript.rhino.jstype.JSType jSType60 = node58.getJSType();
        node18.addChildToFront(node58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node18);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean2 = node1.isLabelName();
        boolean boolean3 = node1.isInc();
        int int4 = node1.getChildCount();
        boolean boolean5 = node1.isGetterDef();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean10 = node9.isLabelName();
        java.util.Set<java.lang.String> strSet11 = node9.getDirectives();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean14 = node13.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] { node9, node13 };
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray15, 50, 50);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node18.addChildToFront(node20);
        boolean boolean22 = node20.isDefaultCase();
        com.google.javascript.rhino.Node node23 = node20.getParent();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean27 = node26.isLabelName();
        java.util.Set<java.lang.String> strSet28 = node26.getDirectives();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean31 = node30.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] { node26, node30 };
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray32, 50, 50);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node35.addChildToFront(node37);
        boolean boolean39 = node35.isNew();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = node35.getJSDocInfo();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean44 = node43.isLabelName();
        java.util.Set<java.lang.String> strSet45 = node43.getDirectives();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean48 = node47.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray49 = new com.google.javascript.rhino.Node[] { node43, node47 };
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray49, 50, 50);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node52.addChildToFront(node54);
        com.google.javascript.rhino.Node node56 = node54.detachFromParent();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean60 = node59.isLabelName();
        java.util.Set<java.lang.String> strSet61 = node59.getDirectives();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean64 = node63.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray65 = new com.google.javascript.rhino.Node[] { node59, node63 };
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray65, 50, 50);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node68.addChildToFront(node70);
        boolean boolean72 = node68.isNew();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node75 = node68.useSourceInfoFrom(node74);
        boolean boolean76 = node68.isFromExterns();
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node((int) (byte) 100, node23, node35, node54, node68);
        boolean boolean78 = node35.isNoSideEffectsCall();
        boolean boolean79 = node35.hasOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node35);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("OR\n");
        boolean boolean2 = node1.isReturn();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec4 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a constructor");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean8 = node7.isLabelName();
        java.util.Set<java.lang.String> strSet9 = node7.getDirectives();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean12 = node11.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray13 = new com.google.javascript.rhino.Node[] { node7, node11 };
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray13, 50, 50);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node16.addChildToFront(node18);
        boolean boolean20 = node18.isDefaultCase();
        com.google.javascript.rhino.Node node21 = node18.getParent();
        node18.detachChildren();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean26 = node25.isLabelName();
        java.util.Set<java.lang.String> strSet27 = node25.getDirectives();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean30 = node29.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray31 = new com.google.javascript.rhino.Node[] { node25, node29 };
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray31, 50, 50);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node34.addChildToFront(node36);
        boolean boolean38 = node34.isNew();
        java.lang.String[] strArray41 = new java.lang.String[] { "function (): ?", "" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        node34.setDirectives((java.util.Set<java.lang.String>) strSet42);
        int int45 = node18.getIndexOfChild(node34);
        boolean boolean46 = node18.isAssignAdd();
        com.google.javascript.rhino.Node node47 = assertionFunctionSpec4.getAssertedParam(node18);
        com.google.javascript.rhino.Node node48 = node47.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node49 = node1.getChildBefore(node48);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean2 = node1.isLabelName();
        boolean boolean3 = node1.isInc();
        boolean boolean4 = node1.hasOneChild();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean8 = node7.isLabelName();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean12 = node11.isLabelName();
        java.util.Set<java.lang.String> strSet13 = node11.getDirectives();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean16 = node15.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] { node11, node15 };
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray17, 50, 50);
        boolean boolean21 = node7.isEquivalentTo(node20);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(50, node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newExpr(node24);
        boolean boolean26 = node24.isScript();
        com.google.javascript.rhino.Node node27 = node22.useSourceInfoIfMissingFrom(node24);
        boolean boolean28 = node24.isExprResult();
        boolean boolean29 = node24.isOr();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean33 = node32.isLabelName();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean37 = node36.isLabelName();
        java.util.Set<java.lang.String> strSet38 = node36.getDirectives();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean41 = node40.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] { node36, node40 };
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray42, 50, 50);
        boolean boolean46 = node32.isEquivalentTo(node45);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(50, node45);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newExpr(node49);
        boolean boolean51 = node49.isScript();
        com.google.javascript.rhino.Node node52 = node47.useSourceInfoIfMissingFrom(node49);
        boolean boolean53 = node49.isOnlyModifiesThisCall();
        java.lang.String str54 = node49.toStringTree();
        com.google.javascript.rhino.Node node55 = node24.useSourceInfoFrom(node49);
        boolean boolean56 = node49.isSetterDef();
        boolean boolean57 = node49.isName();
        boolean boolean58 = node49.hasOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node49);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean3 = node2.isLabelName();
        java.util.Set<java.lang.String> strSet4 = node2.getDirectives();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean7 = node6.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node2, node6 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray8, 50, 50);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node11.addChildToFront(node13);
        com.google.javascript.rhino.Node node15 = node13.detachFromParent();
        boolean boolean16 = node13.isWhile();
        boolean boolean17 = node13.isComma();
        com.google.javascript.rhino.InputId inputId18 = com.google.javascript.jscomp.NodeUtil.getInputId(node13);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean22 = node21.isLabelName();
        java.util.Set<java.lang.String> strSet23 = node21.getDirectives();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean26 = node25.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node21, node25 };
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray27, 50, 50);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node30.addChildToFront(node32);
        boolean boolean34 = node32.isDefaultCase();
        com.google.javascript.rhino.Node node35 = node32.getParent();
        node32.detachChildren();
        boolean boolean37 = node32.hasMoreThanOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node13.getChildBefore(node32);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean2 = node1.isLabelName();
        boolean boolean3 = node1.isReturn();
        boolean boolean5 = node1.getBooleanProp(16);
        boolean boolean7 = node1.getBooleanProp(35);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean13 = node12.isLabelName();
        java.util.Set<java.lang.String> strSet14 = node12.getDirectives();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean17 = node16.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] { node12, node16 };
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray18, 50, 50);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node21.addChildToFront(node23);
        boolean boolean25 = node21.isNew();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = node21.getJSDocInfo();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean30 = node29.isLabelName();
        java.util.Set<java.lang.String> strSet31 = node29.getDirectives();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean34 = node33.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] { node29, node33 };
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray35, 50, 50);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node38.addChildToFront(node40);
        boolean boolean42 = node38.isNew();
        node38.setLineno((int) (short) 10);
        boolean boolean45 = node38.isObjectLit();
        com.google.javascript.rhino.Node[] nodeArray46 = new com.google.javascript.rhino.Node[] { node21, node38 };
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(44, nodeArray46, 40, (int) (short) 100);
        boolean boolean50 = node49.isGetProp();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(8, node49, 8, 13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node49);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (short) -1, "function (): {160022603}", 44, 2);
        boolean boolean5 = node4.isCall();
        boolean boolean6 = node4.isFor();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean9 = node8.isLabelName();
        boolean boolean10 = node8.isReturn();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean14 = node13.isLabelName();
        java.util.Set<java.lang.String> strSet15 = node13.getDirectives();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean18 = node17.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] { node13, node17 };
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray19, 50, 50);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node22.addChildToFront(node24);
        boolean boolean26 = node24.isDefaultCase();
        com.google.javascript.rhino.Node node27 = node24.getParent();
        node24.detachChildren();
        boolean boolean29 = node24.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean32 = node31.isLabelName();
        java.util.Set<java.lang.String> strSet33 = node31.getDirectives();
        boolean boolean34 = node31.isGetterDef();
        com.google.javascript.rhino.Node node35 = node24.clonePropsFrom(node31);
        boolean boolean36 = node24.isComma();
        boolean boolean37 = node24.isCatch();
        com.google.javascript.rhino.Node node38 = node8.useSourceInfoFromForTree(node24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node8);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean3 = node2.isLabelName();
        java.util.Set<java.lang.String> strSet4 = node2.getDirectives();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean7 = node6.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node2, node6 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray8, 50, 50);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node11.addChildToFront(node13);
        boolean boolean15 = node11.isNew();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoFrom(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node11.getChildAtIndex(45);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 0, 4);
        boolean boolean5 = node3.getBooleanProp((int) (byte) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "(function (): {889988203})");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec9 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a constructor");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean17 = node16.isLabelName();
        java.util.Set<java.lang.String> strSet18 = node16.getDirectives();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean21 = node20.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] { node16, node20 };
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray22, 50, 50);
        boolean boolean26 = node12.isEquivalentTo(node25);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(50, node25);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newExpr(node29);
        boolean boolean31 = node29.isScript();
        com.google.javascript.rhino.Node node32 = node27.useSourceInfoIfMissingFrom(node29);
        com.google.javascript.rhino.Node node33 = assertionFunctionSpec9.getAssertedParam(node32);
        boolean boolean34 = node33.isDec();
        int int35 = node33.getLineno();
        node33.setSourceFileForTesting("true");
        java.lang.String str38 = com.google.javascript.jscomp.NodeUtil.getSourceName(node33);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean42 = node41.isLabelName();
        java.util.Set<java.lang.String> strSet43 = node41.getDirectives();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean46 = node45.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray47 = new com.google.javascript.rhino.Node[] { node41, node45 };
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray47, 50, 50);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node50.addChildToFront(node52);
        com.google.javascript.rhino.Node node54 = node52.detachFromParent();
        int int55 = node33.getIndexOfChild(node52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node52);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean2 = node1.isLabelName();
        java.util.Set<java.lang.String> strSet3 = node1.getDirectives();
        boolean boolean4 = node1.isNE();
        boolean boolean5 = node1.isLabelName();
        java.lang.String str6 = node1.toString();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean11 = node10.isLabelName();
        java.util.Set<java.lang.String> strSet12 = node10.getDirectives();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean15 = node14.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray16 = new com.google.javascript.rhino.Node[] { node10, node14 };
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray16, 50, 50);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node19.addChildToFront(node21);
        boolean boolean23 = node21.isDefaultCase();
        com.google.javascript.rhino.Node node24 = node21.getParent();
        node21.detachChildren();
        com.google.javascript.rhino.Node node26 = node21.getParent();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) 1, node26, 29, 12);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("(java.io.IOException: java.io.IOException: )");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node26, node31);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean3 = node2.isLabelName();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean7 = node6.isLabelName();
        java.util.Set<java.lang.String> strSet8 = node6.getDirectives();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean11 = node10.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray12 = new com.google.javascript.rhino.Node[] { node6, node10 };
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray12, 50, 50);
        boolean boolean16 = node2.isEquivalentTo(node15);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(50, node15);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newExpr(node19);
        boolean boolean21 = node19.isScript();
        com.google.javascript.rhino.Node node22 = node17.useSourceInfoIfMissingFrom(node19);
        com.google.javascript.rhino.Node node23 = node22.getLastChild();
        com.google.javascript.rhino.Node node24 = node22.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node24.getChildAtIndex(48);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (short) -1, "function (): {160022603}", 44, 2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node6);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean4 = node3.isLabelName();
        java.util.Set<java.lang.String> strSet5 = node3.getDirectives();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean8 = node7.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray9 = new com.google.javascript.rhino.Node[] { node3, node7 };
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray9, 50, 50);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node12.addChildToFront(node14);
        boolean boolean16 = node12.isNew();
        node12.setLineno((int) (short) 10);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newExpr(node20);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship22 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node12, node21);
        int int23 = node21.getCharno();
        int int24 = node21.getSideEffectFlags();
        boolean boolean25 = node21.isDebugger();
        com.google.javascript.rhino.InputId inputId26 = com.google.javascript.jscomp.NodeUtil.getInputId(node21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node21.getChildAtIndex(37);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean3 = node2.isLabelName();
        java.util.Set<java.lang.String> strSet4 = node2.getDirectives();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean7 = node6.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node2, node6 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray8, 50, 50);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node11.addChildToFront(node13);
        boolean boolean15 = node11.isNew();
        node11.setLineno((int) (short) 10);
        boolean boolean18 = node11.isExprResult();
        boolean boolean19 = node11.isBreak();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node11.getChildAtIndex(23);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean3 = node2.isLabelName();
        java.util.Set<java.lang.String> strSet4 = node2.getDirectives();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean7 = node6.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node2, node6 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray8, 50, 50);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node11.addChildToFront(node13);
        boolean boolean15 = node11.isNoSideEffectsCall();
        boolean boolean16 = node11.isName();
        boolean boolean17 = node11.isAdd();
        boolean boolean18 = node11.isHook();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean22 = node21.isLabelName();
        java.util.Set<java.lang.String> strSet23 = node21.getDirectives();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean26 = node25.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node21, node25 };
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray27, 50, 50);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node30.addChildToFront(node32);
        boolean boolean34 = node30.isNoSideEffectsCall();
        boolean boolean35 = node30.isName();
        boolean boolean36 = node30.isAdd();
        boolean boolean37 = node30.isHook();
        com.google.javascript.rhino.Node node38 = node11.useSourceInfoIfMissingFromForTree(node30);
        node38.detachChildren();
        boolean boolean40 = node38.isFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node42 = node38.getChildAtIndex(32);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean2 = node1.isLabelName();
        java.util.Set<java.lang.String> strSet3 = node1.getDirectives();
        boolean boolean4 = node1.isGetterDef();
        boolean boolean5 = node1.isQualifiedName();
        node1.setWasEmptyNode(false);
        boolean boolean8 = node1.isCase();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean12 = node11.isLabelName();
        java.util.Set<java.lang.String> strSet13 = node11.getDirectives();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean16 = node15.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] { node11, node15 };
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray17, 50, 50);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node20.addChildToFront(node22);
        boolean boolean24 = node22.isDefaultCase();
        com.google.javascript.rhino.Node node25 = node22.getParent();
        node22.detachChildren();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean30 = node29.isLabelName();
        java.util.Set<java.lang.String> strSet31 = node29.getDirectives();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean34 = node33.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] { node29, node33 };
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray35, 50, 50);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node38.addChildToFront(node40);
        boolean boolean42 = node38.isNew();
        java.lang.String[] strArray45 = new java.lang.String[] { "function (): ?", "" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        node38.setDirectives((java.util.Set<java.lang.String>) strSet46);
        int int49 = node22.getIndexOfChild(node38);
        boolean boolean50 = node22.isAssignAdd();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node22.siblings();
        java.lang.String str52 = node22.toStringTree();
        boolean boolean53 = node22.isInc();
        com.google.javascript.rhino.Node node54 = node1.srcrefTree(node22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node56 = node22.getChildAtIndex(44);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        java.lang.String str5 = node4.toString();
        boolean boolean6 = node4.isLocalResultCall();
        com.google.javascript.rhino.Node node7 = assertionFunctionSpec1.getAssertedParam(node4);
        node7.setCharno((int) 'a');
        node7.setSourceEncodedPosition(204850);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node7.getChildAtIndex(29);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean4 = node3.isLabelName();
        java.util.Set<java.lang.String> strSet5 = node3.getDirectives();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean8 = node7.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray9 = new com.google.javascript.rhino.Node[] { node3, node7 };
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray9, 50, 50);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node12.addChildToFront(node14);
        boolean boolean16 = node12.isNoSideEffectsCall();
        boolean boolean17 = node12.isName();
        boolean boolean18 = node12.isAdd();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) ' ', node12, (int) (byte) 1, 41);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType22 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean26 = node25.isLabelName();
        java.util.Set<java.lang.String> strSet27 = node25.getDirectives();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean30 = node29.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray31 = new com.google.javascript.rhino.Node[] { node25, node29 };
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray31, 50, 50);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node34.addChildToFront(node36);
        boolean boolean38 = node34.isNew();
        node34.setLineno((int) (short) 10);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newExpr(node42);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship44 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType22, node34, node43);
        boolean boolean45 = node34.isWith();
        boolean boolean46 = node34.isInc();
        boolean boolean47 = node34.isSwitch();
        com.google.javascript.rhino.Node node48 = node21.useSourceInfoFromForTree(node34);
        int int50 = node21.getIntProp(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node52 = node21.getChildAtIndex((int) '#');
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) '4', (int) (byte) 10, 48);
        boolean boolean4 = node3.isDefaultCase();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean6 = jSDocInfo5.hasTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility11 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility13 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility14 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility15 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility16 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility17 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility19 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility20 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility21 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility22 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility23 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility[] visibilityArray24 = new com.google.javascript.rhino.JSDocInfo.Visibility[] { visibility19, visibility20, visibility21, visibility22, visibility23 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList25 = com.google.common.collect.ImmutableList.of(visibility7, visibility8, visibility9, visibility10, visibility11, visibility12, visibility13, visibility14, visibility15, visibility16, visibility17, visibility18, visibilityArray24);
        jSDocInfo5.setVisibility(visibility7);
        jSDocInfo5.addSuppression("(java.io.IOException: java.io.IOException: )");
        boolean boolean29 = jSDocInfo5.isDeprecated();
        boolean boolean31 = jSDocInfo5.hasParameter("OR\n");
        node3.setJSDocInfo(jSDocInfo5);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) 100);
        boolean boolean35 = node34.isCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node36 = node3.getChildBefore(node34);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("java.io.IOException: []");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 10.0f, (int) (short) -1, (int) (short) 100);
        boolean boolean6 = node5.isEmpty();
        com.google.javascript.rhino.Node node7 = assertionFunctionSpec1.getAssertedParam(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean10 = node9.isLabelName();
        boolean boolean11 = node9.isReturn();
        boolean boolean12 = node9.isTry();
        com.google.javascript.rhino.Node node13 = node9.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node9);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a constructor");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean5 = node4.isLabelName();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean9 = node8.isLabelName();
        java.util.Set<java.lang.String> strSet10 = node8.getDirectives();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] { node8, node12 };
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray14, 50, 50);
        boolean boolean18 = node4.isEquivalentTo(node17);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(50, node17);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newExpr(node21);
        boolean boolean23 = node21.isScript();
        com.google.javascript.rhino.Node node24 = node19.useSourceInfoIfMissingFrom(node21);
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node24);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.siblings();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 204850, (int) '#', 2);
        boolean boolean31 = node25.hasChild(node30);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean35 = node34.isLabelName();
        java.util.Set<java.lang.String> strSet36 = node34.getDirectives();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean39 = node38.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray40 = new com.google.javascript.rhino.Node[] { node34, node38 };
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray40, 50, 50);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node43.addChildToFront(node45);
        boolean boolean47 = node43.isNew();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = node43.getJSDocInfo();
        boolean boolean49 = node43.isLabelName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node30.removeChild(node43);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("function (): {160022603}");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(31, "OR", 0, (int) (byte) 100);
        boolean boolean8 = node7.isNE();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(35, node7, (int) (short) 0, 36);
        boolean boolean12 = node11.isNoSideEffectsCall();
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = node1.getChildBefore(node11);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 4096, (int) (short) 0, (-1));
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType4 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean8 = node7.isLabelName();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean12 = node11.isLabelName();
        java.util.Set<java.lang.String> strSet13 = node11.getDirectives();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean16 = node15.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] { node11, node15 };
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray17, 50, 50);
        boolean boolean21 = node7.isEquivalentTo(node20);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(50, node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newExpr(node24);
        boolean boolean26 = node24.isScript();
        com.google.javascript.rhino.Node node27 = node22.useSourceInfoIfMissingFrom(node24);
        boolean boolean28 = node24.isExprResult();
        boolean boolean29 = node24.isOr();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean32 = node31.isLabelName();
        java.util.Set<java.lang.String> strSet33 = node31.getDirectives();
        boolean boolean34 = node31.isNE();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship35 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType4, node24, node31);
        boolean boolean36 = node24.isComma();
        com.google.javascript.rhino.Node node37 = node24.detachFromParent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node3.getChildBefore(node37);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("OR\n");
        java.lang.String str2 = assertionFunctionSpec1.getFunctionName();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        boolean boolean6 = node4.isScript();
        boolean boolean7 = node4.isComma();
        node4.setLineno((int) '#');
        boolean boolean10 = node4.isBreak();
        boolean boolean11 = node4.isNE();
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node4);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (short) 100);
        java.lang.String str16 = node15.getSourceFileName();
        com.google.javascript.rhino.Node node17 = node15.cloneTree();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(43, node15, 0, 15);
        node4.addChildrenToBack(node20);
        boolean boolean22 = node20.isVoid();
        com.google.javascript.rhino.Node node23 = assertionFunctionSpec1.getAssertedParam(node20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node25 = node20.getChildAtIndex(4096);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean2 = node1.isLabelName();
        boolean boolean3 = node1.isInc();
        boolean boolean4 = node1.hasOneChild();
        com.google.javascript.rhino.Node node5 = node1.cloneTree();
        node1.detachChildren();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean10 = node9.isLabelName();
        java.util.Set<java.lang.String> strSet11 = node9.getDirectives();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean14 = node13.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray15 = new com.google.javascript.rhino.Node[] { node9, node13 };
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray15, 50, 50);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node18.addChildToFront(node20);
        boolean boolean22 = node20.isDefaultCase();
        com.google.javascript.rhino.Node node23 = node20.getParent();
        node20.detachChildren();
        boolean boolean25 = node20.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean28 = node27.isLabelName();
        java.util.Set<java.lang.String> strSet29 = node27.getDirectives();
        boolean boolean30 = node27.isGetterDef();
        com.google.javascript.rhino.Node node31 = node20.clonePropsFrom(node27);
        boolean boolean32 = node27.hasOneChild();
        boolean boolean33 = node27.isFor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node27);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("function (): {889988203}");
        boolean boolean2 = node1.isGetProp();
        boolean boolean3 = node1.isSwitch();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable4 = node1.getAncestors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = node1.getChildAtIndex(6);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        boolean boolean3 = node1.isScript();
        boolean boolean4 = node1.isComma();
        node1.setLineno((int) '#');
        boolean boolean7 = node1.isBreak();
        boolean boolean8 = node1.isNE();
        boolean boolean9 = node1.isIn();
        boolean boolean10 = node1.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node11 = node1.detachFromParent();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection12 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean16 = node15.isLabelName();
        java.util.Set<java.lang.String> strSet17 = node15.getDirectives();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean20 = node19.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] { node15, node19 };
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray21, 50, 50);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node24.addChildToFront(node26);
        boolean boolean28 = node24.isNew();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node31 = node24.useSourceInfoFrom(node30);
        boolean boolean32 = node24.isFromExterns();
        boolean boolean33 = node24.isSetterDef();
        boolean boolean34 = node24.isOptionalArg();
        com.google.javascript.rhino.Node node35 = node24.getFirstChild();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean39 = node38.isLabelName();
        java.util.Set<java.lang.String> strSet40 = node38.getDirectives();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean43 = node42.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node38, node42 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray44, 50, 50);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node47.addChildToFront(node49);
        boolean boolean51 = node47.isNew();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        com.google.javascript.rhino.Node node54 = node47.useSourceInfoFrom(node53);
        com.google.javascript.rhino.InputId inputId55 = com.google.javascript.jscomp.NodeUtil.getInputId(node47);
        boolean boolean56 = node47.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node24, node47);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean3 = node2.isLabelName();
        java.util.Set<java.lang.String> strSet4 = node2.getDirectives();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        boolean boolean7 = node6.isLabelName();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node2, node6 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray8, 50, 50);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("Not declared as a constructor");
        node11.addChildToFront(node13);
        boolean boolean15 = node11.isNew();
        node11.setLineno((int) (short) 10);
        boolean boolean18 = node11.isObjectLit();
        boolean boolean19 = node11.isComma();
        boolean boolean20 = node11.isFunction();
        boolean boolean21 = node11.isOnlyModifiesThisCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node11.getChildAtIndex(14);
    }
}

