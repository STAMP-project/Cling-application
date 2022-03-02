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
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean11 = node10.isObjectLit();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(12, node10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node7.getChildAtIndex(15);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(12, node12);
        boolean boolean15 = node12.isGetElem();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node12.addChildToFront(node20);
        com.google.javascript.rhino.Node node22 = node20.getLastSibling();
        boolean boolean23 = charSequenceList4.contains((java.lang.Object) node20);
        boolean boolean24 = node20.isTrue();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder25 = node20.getJsDocBuilderForNode();
        java.lang.String str26 = node20.getString();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(12, node32);
        boolean boolean35 = node32.isGetElem();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node32.addChildToFront(node40);
        boolean boolean42 = node40.isDefaultCase();
        java.lang.String str43 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node44 = node20.getChildBefore(node40);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(12, node13);
        boolean boolean16 = node15.isNew();
        boolean boolean17 = node15.isFalse();
        com.google.javascript.rhino.Node node18 = node5.srcrefTree(node15);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(12, node24);
        boolean boolean27 = node26.isArrayLit();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean34 = node33.isObjectLit();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(12, node33);
        int int36 = node26.getIndexOfChild(node33);
        boolean boolean37 = node26.isIf();
        java.lang.String str38 = node26.toString();
        boolean boolean39 = node26.isHook();
        boolean boolean40 = node26.isName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node5.removeChild(node26);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList4 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int6 = charSequenceList4.lastIndexOf((java.lang.Object) 39);
        java.lang.String str7 = charSequenceList4.toString();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!", (java.lang.CharSequence) "", (java.lang.CharSequence) "");
        int int14 = charSequenceList12.lastIndexOf((java.lang.Object) 39);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor15 = charSequenceList12.listIterator();
        int int16 = charSequenceList12.size();
        boolean boolean17 = charSequenceList4.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean24 = node23.isObjectLit();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(12, node23);
        java.lang.Object obj27 = node25.getProp((int) '#');
        boolean boolean28 = node25.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node25);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node25.children();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType31 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType32 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList33 = com.google.common.collect.ImmutableList.of(subclassType31, subclassType32);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean40 = node39.isObjectLit();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(12, node39);
        boolean boolean42 = node41.isNew();
        boolean boolean43 = node41.isFalse();
        node41.putIntProp((int) '#', (int) '#');
        boolean boolean47 = node41.isReturn();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean54 = node53.isObjectLit();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(12, node53);
        java.lang.Object obj57 = node55.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship58 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType32, node41, node55);
        com.google.javascript.rhino.Node node59 = node25.useSourceInfoIfMissingFrom(node41);
        java.lang.String str60 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node25);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean67 = node66.isObjectLit();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(12, node66);
        boolean boolean69 = node66.isGetElem();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node66.addChildToFront(node74);
        node66.setOptionalArg(true);
        com.google.javascript.rhino.Node node78 = node25.srcrefTree(node66);
        int int79 = charSequenceList4.indexOf((java.lang.Object) node66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = node66.getChildAtIndex((int) ' ');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isObjectLit();
        int int6 = node4.getLineno();
        int int7 = node4.getLength();
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node4);
        boolean boolean9 = node4.isBreak();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        java.lang.Object obj19 = node17.getProp((int) '#');
        boolean boolean20 = node17.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node17);
        node17.setType(8);
        boolean boolean24 = node17.isOptionalArg();
        boolean boolean25 = node17.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node17);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean10 = node9.isObjectLit();
        int int11 = node9.getLineno();
        int int12 = node9.getLength();
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node9);
        java.lang.String str14 = node4.checkTreeEquals(node9);
        boolean boolean15 = node4.isNoSideEffectsCall();
        node4.putIntProp((-1), 4);
        boolean boolean19 = node4.isDefaultCase();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean26 = node25.isObjectLit();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(12, node25);
        boolean boolean28 = node27.isArrayLit();
        boolean boolean29 = node27.isSwitch();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node27.siblings();
        boolean boolean31 = node27.isAssign();
        node27.setLineno(47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node27);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(12, node11);
        boolean boolean14 = node11.isGetElem();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node11.addChildToFront(node19);
        node19.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node23 = node4.copyInformationFrom(node19);
        boolean boolean24 = node19.isIf();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean31 = node30.isObjectLit();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(12, node30);
        boolean boolean33 = node30.isGetElem();
        boolean boolean34 = node30.isQuotedString();
        boolean boolean35 = node30.isThrow();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node19.removeChild(node30);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType1 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList2 = com.google.common.collect.ImmutableList.of(subclassType0, subclassType1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(12, node8);
        boolean boolean11 = node10.isNew();
        boolean boolean12 = node10.isFalse();
        node10.putIntProp((int) '#', (int) '#');
        boolean boolean16 = node10.isReturn();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean23 = node22.isObjectLit();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(12, node22);
        java.lang.Object obj26 = node24.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship27 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType1, node10, node24);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean34 = node33.isObjectLit();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(12, node33);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean42 = node41.isObjectLit();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(12, node41);
        boolean boolean44 = node43.isNew();
        boolean boolean45 = node43.isFalse();
        com.google.javascript.rhino.Node node46 = node33.srcrefTree(node43);
        boolean boolean47 = node43.isTypeOf();
        boolean boolean48 = node43.isGetElem();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean55 = node54.isObjectLit();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(12, node54);
        boolean boolean57 = node56.isArrayLit();
        boolean boolean58 = node56.isSwitch();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean65 = node64.isObjectLit();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(12, node64);
        java.lang.Object obj68 = node66.getProp((int) '#');
        com.google.javascript.rhino.Node node69 = node56.copyInformationFromForTree(node66);
        boolean boolean70 = node69.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.Bind bind71 = new com.google.javascript.jscomp.CodingConvention.Bind(node24, node43, node69);
        com.google.javascript.rhino.Node node72 = node24.cloneNode();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) 8);
        boolean boolean75 = node74.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node72.removeChild(node74);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 50);
        boolean boolean2 = node1.isAssignAdd();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean8 = node7.isObjectLit();
        int int9 = node7.getLineno();
        int int10 = node7.getLength();
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        boolean boolean12 = node7.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node1.getChildBefore(node7);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("");
        java.lang.String str2 = assertionFunctionSpec1.getFunctionName();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10);
        com.google.javascript.rhino.Node node5 = node4.cloneTree();
        com.google.javascript.rhino.Node node6 = assertionFunctionSpec1.getAssertedParam(node4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node6.getChildAtIndex(16);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isObjectLit();
        int int6 = node4.getLineno();
        int int7 = node4.getLength();
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node4);
        boolean boolean9 = node4.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node4.getChildAtIndex(31);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        boolean boolean15 = node13.isTry();
        boolean boolean16 = node13.isGetProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = node13.getChildAtIndex(37);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(12, node13);
        boolean boolean16 = node15.isNew();
        boolean boolean17 = node15.isFalse();
        com.google.javascript.rhino.Node node18 = node5.srcrefTree(node15);
        node5.setOptionalArg(true);
        node5.setOptionalArg(true);
        java.lang.String str23 = node5.toString();
        boolean boolean24 = node5.isIn();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean31 = node30.isObjectLit();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(12, node30);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean39 = node38.isObjectLit();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(12, node38);
        boolean boolean41 = node40.isNew();
        boolean boolean42 = node40.isFalse();
        com.google.javascript.rhino.Node node43 = node30.srcrefTree(node40);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection44 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node43);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean51 = node50.isObjectLit();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(12, node50);
        boolean boolean53 = node52.isArrayLit();
        boolean boolean54 = node52.isSwitch();
        com.google.javascript.rhino.Node node55 = node43.useSourceInfoIfMissingFrom(node52);
        java.lang.String str56 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node43);
        boolean boolean57 = node43.isCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node58 = node5.getChildBefore(node43);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean5 = node4.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(12, node11);
        boolean boolean14 = node11.isGetElem();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node11.addChildToFront(node19);
        node19.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node23 = node4.copyInformationFrom(node19);
        boolean boolean24 = node19.isObjectLit();
        node19.setQuotedString();
        node19.setWasEmptyNode(true);
        boolean boolean28 = node19.isRegExp();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString((int) (short) 100, "()", 43, (int) (short) 1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean40 = node39.isObjectLit();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(12, node39);
        boolean boolean42 = node41.isNew();
        boolean boolean43 = node41.isFalse();
        boolean boolean44 = node41.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean51 = node50.isObjectLit();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(12, node50);
        boolean boolean53 = node50.isGetElem();
        com.google.javascript.rhino.Node node54 = node41.srcrefTree(node50);
        java.lang.String str55 = node33.checkTreeEquals(node50);
        int int56 = node33.getLineno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node19.getChildBefore(node33);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasEnumParameterType();
        jSDocInfo0.setLicense("InputId: ");
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getAuthors();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        boolean boolean6 = jSDocInfo0.hasModifies();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(12, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node14);
        node14.setWasEmptyNode(false);
        boolean boolean18 = node14.isDo();
        jSDocInfo0.setAssociatedNode(node14);
        boolean boolean20 = node14.isQuotedString();
        boolean boolean21 = node14.isThis();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node14.getChildAtIndex(41);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        node13.setIsSyntheticBlock(false);
        node13.setSourceEncodedPosition((int) (short) 10);
        boolean boolean19 = node13.isNull();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean26 = node25.isObjectLit();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(12, node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node27);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(12, node35);
        java.lang.Object obj39 = node37.getProp((int) '#');
        boolean boolean40 = node37.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node37);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean48 = node47.isObjectLit();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(12, node47);
        boolean boolean50 = node47.isGetElem();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node47.addChildToFront(node55);
        com.google.javascript.rhino.Node node57 = node55.getLastSibling();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString((int) 'a', "[, hi!, , ]");
        boolean boolean61 = node55.isEquivalentToTyped(node60);
        com.google.javascript.rhino.Node[] nodeArray62 = new com.google.javascript.rhino.Node[] { node37, node60 };
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((int) '#', nodeArray62, 0, 4095);
        boolean boolean66 = node65.isLocalResultCall();
        boolean boolean67 = node27.isEquivalentToTyped(node65);
        boolean boolean68 = node27.isExprResult();
        node27.setLength(48);
        node13.addChildrenToFront(node27);
        int int72 = node27.getSideEffectFlags();
        com.google.javascript.rhino.InputId inputId73 = node27.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node75 = node27.getChildAtIndex(97);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        node13.setIsSyntheticBlock(false);
        boolean boolean17 = node13.isGetterDef();
        java.lang.String str18 = node13.getQualifiedName();
        boolean boolean19 = node13.isTrue();
        boolean boolean20 = node13.isParamList();
        boolean boolean21 = node13.isNumber();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType22 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType23 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList24 = com.google.common.collect.ImmutableList.of(subclassType22, subclassType23);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean31 = node30.isObjectLit();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(12, node30);
        boolean boolean33 = node32.isNew();
        boolean boolean34 = node32.isFalse();
        node32.putIntProp((int) '#', (int) '#');
        boolean boolean38 = node32.isReturn();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean45 = node44.isObjectLit();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(12, node44);
        java.lang.Object obj48 = node46.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship49 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType23, node32, node46);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder55 = node54.getJsDocBuilderForNode();
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node54);
        boolean boolean57 = node54.isCase();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean64 = node63.isObjectLit();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(12, node63);
        java.lang.Object obj67 = node65.getProp((int) '#');
        boolean boolean68 = node65.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile69 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node65);
        node65.setType(8);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship72 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType23, node54, node65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node13.removeChild(node54);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node7.siblings();
        boolean boolean11 = node7.isQuotedString();
        com.google.javascript.rhino.Node node13 = node7.getAncestor((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node7.getChildAtIndex(17);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node5.isGetElem();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        node5.addChildToFront(node13);
        node13.setIsSyntheticBlock(false);
        boolean boolean17 = node13.isGetterDef();
        boolean boolean18 = node13.isDebugger();
        boolean boolean19 = node13.isFunction();
        boolean boolean20 = node13.isAssign();
        boolean boolean21 = node13.isGetElem();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node13.getChildAtIndex((int) (byte) 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10, (int) '#', (int) (short) 0);
        node3.setType((int) (byte) 0);
        com.google.javascript.rhino.Node node6 = node3.getNext();
        node3.putIntProp(100, 48);
        boolean boolean10 = node3.isLabel();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(12, node16);
        boolean boolean19 = node16.isGetElem();
        boolean boolean20 = node16.isGetProp();
        boolean boolean21 = node16.isObjectLit();
        boolean boolean22 = node16.isNumber();
        boolean boolean23 = node16.isOptionalArg();
        com.google.javascript.rhino.Node node24 = node16.cloneNode();
        com.google.javascript.rhino.Node node25 = node3.useSourceInfoFrom(node24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node3.getChildAtIndex(12);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        boolean boolean8 = node7.isArrayLit();
        boolean boolean9 = node7.isSwitch();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(12, node15);
        java.lang.Object obj19 = node17.getProp((int) '#');
        com.google.javascript.rhino.Node node20 = node7.copyInformationFromForTree(node17);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newExpr(node20);
        boolean boolean22 = node21.isLabel();
        boolean boolean24 = node21.getBooleanProp(51);
        com.google.javascript.rhino.Node node25 = node21.getParent();
        boolean boolean26 = node21.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node28 = node21.getChildAtIndex((int) (short) 10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) '4');
        com.google.javascript.rhino.Node node2 = node1.cloneTree();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder3 = node1.new FileLevelJsDocBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node1.getChildAtIndex(52);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 0, 46, 16);
        com.google.javascript.rhino.InputId inputId4 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        boolean boolean5 = node3.isDelProp();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(12, node11);
        boolean boolean14 = node13.isArrayLit();
        boolean boolean15 = node13.isSwitch();
        boolean boolean16 = node13.isCase();
        boolean boolean17 = node13.isVarArgs();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean24 = node23.isObjectLit();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(12, node23);
        boolean boolean26 = node25.isArrayLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(12, node32);
        int int35 = node25.getIndexOfChild(node32);
        boolean boolean36 = node25.isIf();
        java.lang.String str37 = node25.toString();
        boolean boolean38 = node25.isArrayLit();
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newExpr(node25);
        boolean boolean40 = node13.hasChild(node25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node25);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(12, node5);
        java.lang.Object obj9 = node7.getProp((int) '#');
        boolean boolean10 = node7.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node7.children();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.common.collect.ImmutableList<com.google.javascript.jscomp.CodingConvention.SubclassType> subclassTypeList15 = com.google.common.collect.ImmutableList.of(subclassType13, subclassType14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(12, node21);
        boolean boolean24 = node23.isNew();
        boolean boolean25 = node23.isFalse();
        node23.putIntProp((int) '#', (int) '#');
        boolean boolean29 = node23.isReturn();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 40, (int) (byte) 1);
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(12, node35);
        java.lang.Object obj39 = node37.getProp((int) '#');
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship40 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType14, node23, node37);
        com.google.javascript.rhino.Node node41 = node7.useSourceInfoIfMissingFrom(node23);
        boolean boolean42 = node7.isArrayLit();
        boolean boolean43 = node7.isOptionalArg();
        boolean boolean44 = node7.wasEmptyNode();
        boolean boolean45 = node7.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node47 = node7.getChildAtIndex(45);
    }
}

