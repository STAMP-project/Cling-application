import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(30, "OR [synthetic: 1]");
        java.lang.String str3 = node2.getSourceFileName();
        int int4 = node2.getLineno();
        com.google.javascript.rhino.Node node5 = node2.removeFirstChild();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(100);
        node7.addChildrenToFront(node9);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(100);
        node12.addChildrenToFront(node14);
        boolean boolean16 = node12.isNot();
        boolean boolean17 = node12.isIf();
        com.google.javascript.rhino.Node node18 = node9.copyInformationFromForTree(node12);
        boolean boolean19 = node9.isEmpty();
        boolean boolean20 = node9.isDefaultCase();
        boolean boolean21 = node9.isRegExp();
        com.google.javascript.rhino.Node node22 = node2.srcref(node9);
        node2.addSuppression("((((OR\n    OR\n))))");
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(100);
        node26.addSuppression("");
        java.lang.String str29 = node26.toString();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(100);
        node31.addSuppression("");
        java.lang.String str34 = node31.toString();
        com.google.javascript.rhino.Node node35 = node31.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = node31.getStaticSourceFile();
        com.google.javascript.rhino.Node node37 = node26.copyInformationFromForTree(node31);
        boolean boolean38 = node31.isAssignAdd();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(100);
        node40.addChildrenToFront(node42);
        boolean boolean44 = node40.isTypeOf();
        boolean boolean45 = node40.isVarArgs();
        boolean boolean46 = node40.isIn();
        node31.addChildToFront(node40);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(100);
        node49.addSuppression("");
        java.lang.String str52 = node49.toString();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(100);
        node54.addSuppression("");
        java.lang.String str57 = node54.toString();
        com.google.javascript.rhino.Node node58 = node54.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile59 = node54.getStaticSourceFile();
        com.google.javascript.rhino.Node node60 = node49.copyInformationFromForTree(node54);
        boolean boolean61 = node54.isAssignAdd();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(100);
        node63.addChildrenToFront(node65);
        boolean boolean67 = node63.isTypeOf();
        boolean boolean68 = node63.isVarArgs();
        boolean boolean69 = node63.isIn();
        node54.addChildToFront(node63);
        node63.removeProp(48);
        boolean boolean73 = node63.isAssign();
        boolean boolean74 = node63.isTrue();
        boolean boolean75 = node31.isEquivalentToTyped(node63);
        int int76 = node63.getSourceOffset();
        boolean boolean77 = node63.isCase();
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node(6, (int) (short) 10, 50);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(100);
        node83.addChildrenToFront(node85);
        com.google.javascript.rhino.Node node87 = node85.getParent();
        boolean boolean88 = node87.isDefaultCase();
        boolean boolean89 = node87.isNoSideEffectsCall();
        boolean boolean90 = node87.isNew();
        com.google.javascript.rhino.Node node91 = node81.copyInformationFromForTree(node87);
        boolean boolean92 = node63.hasChild(node91);
        node63.setLineno(37);
        int int95 = node63.getSourceOffset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node63);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("(Unknown class name)");
        com.google.javascript.rhino.Node node3 = node1.getChildAtIndex((int) (byte) 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(100);
        node5.addSuppression("");
        java.lang.String str8 = node5.toString();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        node10.addSuppression("");
        java.lang.String str13 = node10.toString();
        com.google.javascript.rhino.Node node14 = node10.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = node10.getStaticSourceFile();
        com.google.javascript.rhino.Node node16 = node5.copyInformationFromForTree(node10);
        boolean boolean17 = node10.isAssignAdd();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(100);
        node19.addChildrenToFront(node21);
        boolean boolean23 = node19.isTypeOf();
        boolean boolean24 = node19.isVarArgs();
        boolean boolean25 = node19.isIn();
        node10.addChildToFront(node19);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(100);
        node28.addSuppression("");
        java.lang.String str31 = node28.toString();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(100);
        node33.addSuppression("");
        java.lang.String str36 = node33.toString();
        com.google.javascript.rhino.Node node37 = node33.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile38 = node33.getStaticSourceFile();
        com.google.javascript.rhino.Node node39 = node28.copyInformationFromForTree(node33);
        boolean boolean40 = node33.isAssignAdd();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(100);
        node42.addChildrenToFront(node44);
        boolean boolean46 = node42.isTypeOf();
        boolean boolean47 = node42.isVarArgs();
        boolean boolean48 = node42.isIn();
        node33.addChildToFront(node42);
        node42.removeProp(48);
        boolean boolean52 = node42.isAssign();
        boolean boolean53 = node42.isTrue();
        boolean boolean54 = node10.isEquivalentToTyped(node42);
        com.google.javascript.rhino.Node node55 = node42.getParent();
        int int56 = node42.getCharno();
        boolean boolean57 = node42.isDebugger();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) (short) 1, 37, 0);
        java.lang.String str62 = node61.toStringTree();
        boolean boolean64 = node61.getBooleanProp(4095);
        boolean boolean65 = node42.hasChild(node61);
        boolean boolean67 = node42.getBooleanProp(44);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable68 = node42.getAncestors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node69 = node1.getChildBefore(node42);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100);
        node6.addChildrenToFront(node8);
        com.google.javascript.rhino.Node node10 = node8.getParent();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFromForTree(node8);
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.hasBaseType();
        jSDocInfo12.setLicense("Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo12.getBaseType();
        java.util.Set<java.lang.String> strSet17 = jSDocInfo12.getParameterNames();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(100);
        node19.addChildrenToFront(node21);
        int int23 = node19.getCharno();
        boolean boolean24 = node19.isContinue();
        boolean boolean25 = strSet17.equals((java.lang.Object) node19);
        node11.setDirectives(strSet17);
        node11.setSourceEncodedPosition(49);
        boolean boolean29 = node11.isQuotedString();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(43, "OR [jsdoc_info: JSDocInfo]", 39, 49);
        boolean boolean35 = node11.isEquivalentToTyped(node34);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node11.siblings();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(100);
        node38.addSuppression("");
        java.lang.String str41 = node38.toString();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(100);
        node43.addSuppression("");
        java.lang.String str46 = node43.toString();
        com.google.javascript.rhino.Node node47 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile48 = node43.getStaticSourceFile();
        com.google.javascript.rhino.Node node49 = node38.copyInformationFromForTree(node43);
        boolean boolean50 = node43.isAssignAdd();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(100);
        node52.addChildrenToFront(node54);
        boolean boolean56 = node52.isTypeOf();
        boolean boolean57 = node52.isVarArgs();
        boolean boolean58 = node52.isIn();
        node43.addChildToFront(node52);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(100);
        node61.addSuppression("");
        java.lang.String str64 = node61.toString();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(100);
        node66.addSuppression("");
        java.lang.String str69 = node66.toString();
        com.google.javascript.rhino.Node node70 = node66.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile71 = node66.getStaticSourceFile();
        com.google.javascript.rhino.Node node72 = node61.copyInformationFromForTree(node66);
        boolean boolean73 = node66.isAssignAdd();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(100);
        node75.addChildrenToFront(node77);
        boolean boolean79 = node75.isTypeOf();
        boolean boolean80 = node75.isVarArgs();
        boolean boolean81 = node75.isIn();
        node66.addChildToFront(node75);
        node75.removeProp(48);
        boolean boolean85 = node75.isAssign();
        boolean boolean86 = node75.isTrue();
        boolean boolean87 = node43.isEquivalentToTyped(node75);
        com.google.javascript.rhino.Node node88 = node75.getParent();
        int int89 = node75.getCharno();
        boolean boolean90 = node75.isOnlyModifiesThisCall();
        boolean boolean91 = node11.hasChild(node75);
        boolean boolean92 = node11.isTry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node94 = node11.getChildAtIndex(13);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(100);
        node6.addChildrenToFront(node8);
        com.google.javascript.rhino.Node node10 = node8.getParent();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFromForTree(node8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = new com.google.javascript.rhino.JSTypeExpression(node11, "Not declared as a constructor");
        com.google.javascript.rhino.Node node14 = jSTypeExpression13.getRoot();
        boolean boolean15 = node14.isParamList();
        int int16 = node14.getSourcePosition();
        com.google.javascript.rhino.Node node17 = node14.getLastSibling();
        boolean boolean18 = node17.isRegExp();
        boolean boolean19 = node17.isIf();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(100);
        node21.addChildrenToFront(node23);
        int int25 = node23.getType();
        com.google.javascript.rhino.InputId inputId26 = node23.getInputId();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = new com.google.javascript.rhino.JSTypeExpression(node23, "");
        boolean boolean29 = jSTypeExpression28.isOptionalArg();
        com.google.javascript.rhino.Node node30 = jSTypeExpression28.getRoot();
        boolean boolean31 = jSTypeExpression28.isVarArgs();
        com.google.javascript.rhino.Node node32 = jSTypeExpression28.getRoot();
        boolean boolean33 = node17.isEquivalentToTyped(node32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression13 and jSTypeExpression28", jSTypeExpression13.equals(jSTypeExpression28) ? jSTypeExpression13.hashCode() == jSTypeExpression28.hashCode() : true);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        node6.addSuppression("");
        java.lang.String str9 = node6.toString();
        com.google.javascript.rhino.Node node10 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = node6.getStaticSourceFile();
        com.google.javascript.rhino.Node node12 = node1.copyInformationFromForTree(node6);
        boolean boolean13 = node6.isAssignAdd();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(100);
        node15.addChildrenToFront(node17);
        boolean boolean19 = node15.isTypeOf();
        boolean boolean20 = node15.isVarArgs();
        boolean boolean21 = node15.isIn();
        node6.addChildToFront(node15);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(100);
        node24.addSuppression("");
        java.lang.String str27 = node24.toString();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(100);
        node29.addSuppression("");
        java.lang.String str32 = node29.toString();
        com.google.javascript.rhino.Node node33 = node29.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node29.getStaticSourceFile();
        com.google.javascript.rhino.Node node35 = node24.copyInformationFromForTree(node29);
        boolean boolean36 = node29.isAssignAdd();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(100);
        node38.addChildrenToFront(node40);
        boolean boolean42 = node38.isTypeOf();
        boolean boolean43 = node38.isVarArgs();
        boolean boolean44 = node38.isIn();
        node29.addChildToFront(node38);
        node38.removeProp(48);
        boolean boolean48 = node38.isAssign();
        boolean boolean49 = node38.isTrue();
        boolean boolean50 = node6.isEquivalentToTyped(node38);
        int int51 = node38.getSourceOffset();
        boolean boolean52 = node38.isCase();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(6, (int) (short) 10, 50);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(100);
        node58.addChildrenToFront(node60);
        com.google.javascript.rhino.Node node62 = node60.getParent();
        boolean boolean63 = node62.isDefaultCase();
        boolean boolean64 = node62.isNoSideEffectsCall();
        boolean boolean65 = node62.isNew();
        com.google.javascript.rhino.Node node66 = node56.copyInformationFromForTree(node62);
        boolean boolean67 = node38.hasChild(node66);
        boolean boolean68 = node38.isTry();
        boolean boolean69 = node38.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node71 = node38.getChildAtIndex(44);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(43, "", (int) '4', 4);
        int int6 = node4.getIntProp(4096);
        boolean boolean7 = node4.isTrue();
        boolean boolean8 = node4.isAssign();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(1, "unknown", (int) (byte) 10, 39);
        boolean boolean14 = node13.isExprResult();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(100);
        node16.addChildrenToFront(node18);
        boolean boolean20 = node18.isLabel();
        boolean boolean21 = node13.isEquivalentTo(node18);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node18.children();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(100);
        node24.addSuppression("");
        java.lang.String str27 = node24.toString();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(100);
        node29.addSuppression("");
        java.lang.String str32 = node29.toString();
        com.google.javascript.rhino.Node node33 = node29.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node29.getStaticSourceFile();
        com.google.javascript.rhino.Node node35 = node24.copyInformationFromForTree(node29);
        boolean boolean36 = node29.isAssignAdd();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(100);
        node38.addChildrenToFront(node40);
        boolean boolean42 = node38.isTypeOf();
        boolean boolean43 = node38.isVarArgs();
        boolean boolean44 = node38.isIn();
        node29.addChildToFront(node38);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(100);
        node47.addSuppression("");
        java.lang.String str50 = node47.toString();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(100);
        node52.addSuppression("");
        java.lang.String str55 = node52.toString();
        com.google.javascript.rhino.Node node56 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile57 = node52.getStaticSourceFile();
        com.google.javascript.rhino.Node node58 = node47.copyInformationFromForTree(node52);
        boolean boolean59 = node52.isAssignAdd();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(100);
        node61.addChildrenToFront(node63);
        boolean boolean65 = node61.isTypeOf();
        boolean boolean66 = node61.isVarArgs();
        boolean boolean67 = node61.isIn();
        node52.addChildToFront(node61);
        node61.removeProp(48);
        boolean boolean71 = node61.isAssign();
        boolean boolean72 = node61.isTrue();
        boolean boolean73 = node29.isEquivalentToTyped(node61);
        int int74 = node61.getSourceOffset();
        com.google.javascript.rhino.Node node75 = node18.copyInformationFromForTree(node61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node76 = node4.getChildBefore(node75);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        jSDocInfo0.setLicense("Node tree inequality:\nTree1:\nOR 0 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nOR\n    OR\n\n\nSubtree1: OR 0 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: OR\n    OR\n");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getBaseType();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getParameterNames();
        java.util.Spliterator<java.lang.String> strSpliterator6 = strSet5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator7 = strSet5.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator8 = strSet5.spliterator();
        int int9 = strSet5.size();
        java.lang.Object[] objArray10 = strSet5.toArray();
        com.google.common.collect.ImmutableList<java.lang.String> strList17 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        com.google.common.collect.ImmutableList<java.lang.String> strList24 = com.google.common.collect.ImmutableList.of("", "", "hi!", "OR [jsdoc_info: JSDocInfo]", "", "OR [jsdoc_info: JSDocInfo]");
        boolean boolean25 = strList17.containsAll((java.util.Collection<java.lang.String>) strList24);
        java.util.Spliterator<java.lang.String> strSpliterator26 = strList17.spliterator();
        com.google.common.collect.ImmutableList<java.lang.String> strList27 = strList17.asList();
        com.google.common.collect.UnmodifiableIterator<java.lang.String> strItor28 = strList17.iterator();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        boolean boolean31 = ternaryValue29.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        boolean boolean34 = ternaryValue32.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.String str36 = ternaryValue35.toString();
        boolean boolean38 = ternaryValue35.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = ternaryValue32.and(ternaryValue35);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = ternaryValue29.and(ternaryValue35);
        int int41 = strList17.indexOf((java.lang.Object) ternaryValue40);
        java.lang.String str42 = strList17.toString();
        com.google.common.collect.UnmodifiableListIterator<java.lang.String> strItor44 = strList17.listIterator(0);
        boolean boolean45 = strSet5.containsAll((java.util.Collection<java.lang.String>) strList17);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(6, (int) (short) 10, 50);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(100);
        node51.addChildrenToFront(node53);
        com.google.javascript.rhino.Node node55 = node53.getParent();
        boolean boolean56 = node55.isDefaultCase();
        boolean boolean57 = node55.isNoSideEffectsCall();
        boolean boolean58 = node55.isNew();
        com.google.javascript.rhino.Node node59 = node49.copyInformationFromForTree(node55);
        boolean boolean60 = strList17.contains((java.lang.Object) node49);
        boolean boolean61 = node49.isWhile();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(100);
        node63.addChildrenToFront(node65);
        int int67 = node63.getCharno();
        boolean boolean68 = node63.isName();
        boolean boolean69 = node63.isNE();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(100);
        node71.addChildrenToFront(node73);
        boolean boolean75 = node71.isFalse();
        boolean boolean76 = node71.isParamList();
        node63.addChildToFront(node71);
        node71.putIntProp(38, 35);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable81 = node71.siblings();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile82 = node71.getStaticSourceFile();
        int int83 = node71.getChildCount();
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(100);
        node85.addChildrenToFront(node87);
        boolean boolean89 = node85.isNew();
        boolean boolean90 = node71.isEquivalentToTyped(node85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node49.removeChild(node85);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("((OR))");
        boolean boolean2 = node1.isLabelName();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(1, "unknown", (int) (byte) 10, 39);
        boolean boolean8 = node7.isExprResult();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(100);
        node10.addChildrenToFront(node12);
        boolean boolean14 = node12.isLabel();
        boolean boolean15 = node7.isEquivalentTo(node12);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node12.children();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(100);
        node18.addSuppression("");
        java.lang.String str21 = node18.toString();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(100);
        node23.addSuppression("");
        java.lang.String str26 = node23.toString();
        com.google.javascript.rhino.Node node27 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node23.getStaticSourceFile();
        com.google.javascript.rhino.Node node29 = node18.copyInformationFromForTree(node23);
        boolean boolean30 = node23.isAssignAdd();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(100);
        node32.addChildrenToFront(node34);
        boolean boolean36 = node32.isTypeOf();
        boolean boolean37 = node32.isVarArgs();
        boolean boolean38 = node32.isIn();
        node23.addChildToFront(node32);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(100);
        node41.addSuppression("");
        java.lang.String str44 = node41.toString();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(100);
        node46.addSuppression("");
        java.lang.String str49 = node46.toString();
        com.google.javascript.rhino.Node node50 = node46.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile51 = node46.getStaticSourceFile();
        com.google.javascript.rhino.Node node52 = node41.copyInformationFromForTree(node46);
        boolean boolean53 = node46.isAssignAdd();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(100);
        node55.addChildrenToFront(node57);
        boolean boolean59 = node55.isTypeOf();
        boolean boolean60 = node55.isVarArgs();
        boolean boolean61 = node55.isIn();
        node46.addChildToFront(node55);
        node55.removeProp(48);
        boolean boolean65 = node55.isAssign();
        boolean boolean66 = node55.isTrue();
        boolean boolean67 = node23.isEquivalentToTyped(node55);
        int int68 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node69 = node12.copyInformationFromForTree(node55);
        boolean boolean70 = node69.isCase();
        com.google.javascript.rhino.Node node71 = node69.detachFromParent();
        boolean boolean72 = node1.isEquivalentToTyped(node69);
        com.google.javascript.rhino.Node node73 = node1.cloneNode();
        boolean boolean74 = node73.isName();
        boolean boolean75 = node73.isVoid();
        boolean boolean76 = node73.isDebugger();
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node(100);
        node79.addChildrenToFront(node81);
        boolean boolean83 = node79.isNot();
        boolean boolean84 = node79.isLocalResultCall();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(100);
        node86.addSuppression("");
        com.google.javascript.rhino.Node node89 = node79.copyInformationFromForTree(node86);
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node(40, node89, (int) (byte) -1, 44);
        java.lang.Object obj94 = node89.getProp((int) (byte) -1);
        boolean boolean95 = node89.isNull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node73.removeChild(node89);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(100);
        node1.addSuppression("");
        java.lang.String str4 = node1.toString();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(100);
        node6.addSuppression("");
        java.lang.String str9 = node6.toString();
        com.google.javascript.rhino.Node node10 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = node6.getStaticSourceFile();
        com.google.javascript.rhino.Node node12 = node1.copyInformationFromForTree(node6);
        boolean boolean13 = node6.isAssignAdd();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(100);
        node15.addChildrenToFront(node17);
        boolean boolean19 = node15.isTypeOf();
        boolean boolean20 = node15.isVarArgs();
        boolean boolean21 = node15.isIn();
        node6.addChildToFront(node15);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(100);
        node24.addSuppression("");
        java.lang.String str27 = node24.toString();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(100);
        node29.addSuppression("");
        java.lang.String str32 = node29.toString();
        com.google.javascript.rhino.Node node33 = node29.removeFirstChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node29.getStaticSourceFile();
        com.google.javascript.rhino.Node node35 = node24.copyInformationFromForTree(node29);
        boolean boolean36 = node29.isAssignAdd();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(100);
        node38.addChildrenToFront(node40);
        boolean boolean42 = node38.isTypeOf();
        boolean boolean43 = node38.isVarArgs();
        boolean boolean44 = node38.isIn();
        node29.addChildToFront(node38);
        node38.removeProp(48);
        boolean boolean48 = node38.isAssign();
        boolean boolean49 = node38.isTrue();
        boolean boolean50 = node6.isEquivalentToTyped(node38);
        int int51 = node38.getSourceOffset();
        boolean boolean52 = node38.isCase();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(6, (int) (short) 10, 50);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(100);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(100);
        node58.addChildrenToFront(node60);
        com.google.javascript.rhino.Node node62 = node60.getParent();
        boolean boolean63 = node62.isDefaultCase();
        boolean boolean64 = node62.isNoSideEffectsCall();
        boolean boolean65 = node62.isNew();
        com.google.javascript.rhino.Node node66 = node56.copyInformationFromForTree(node62);
        boolean boolean67 = node38.hasChild(node66);
        java.lang.String str68 = node38.toString();
        boolean boolean69 = node38.isExprResult();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString(48, "Unknown class name", (-1), 42);
        boolean boolean75 = node74.wasEmptyNode();
        node74.detachChildren();
        node74.setWasEmptyNode(true);
        node38.addChildToFront(node74);
        com.google.javascript.rhino.Node node80 = node74.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node82 = node80.getChildAtIndex(397312);
    }
}

