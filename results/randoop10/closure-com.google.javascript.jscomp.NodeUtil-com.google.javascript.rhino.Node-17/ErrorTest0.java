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
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        node1.setSourceEncodedPositionForTree(46);
        java.lang.String str4 = node1.getSourceFileName();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition6 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1));
        boolean boolean9 = node8.isAssignAdd();
        namePosition6.setItem(node8);
        node8.setVarArgs(false);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1));
        int int15 = node14.getSourcePosition();
        node14.setWasEmptyNode(true);
        boolean boolean18 = node14.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition19 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1));
        boolean boolean22 = node21.isAssignAdd();
        namePosition19.setItem(node21);
        node21.setVarArgs(false);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((-1));
        boolean boolean28 = node27.isAssignAdd();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (short) 10, node8, node14, node21, node27, 0, 0);
        boolean boolean32 = node31.isFalse();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node31);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        int int2 = node1.getSourcePosition();
        node1.setWasEmptyNode(true);
        int int5 = node1.getSideEffectFlags();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition7 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((-1));
        boolean boolean10 = node9.isAssignAdd();
        namePosition7.setItem(node9);
        node9.setVarArgs(false);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((-1));
        int int16 = node15.getSourcePosition();
        node15.setWasEmptyNode(true);
        boolean boolean19 = node15.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition20 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1));
        boolean boolean23 = node22.isAssignAdd();
        namePosition20.setItem(node22);
        node22.setVarArgs(false);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1));
        boolean boolean29 = node28.isAssignAdd();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, node9, node15, node22, node28, 0, 0);
        java.lang.String str33 = node1.checkTreeEquals(node9);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1));
        int int36 = node35.getSourcePosition();
        com.google.javascript.rhino.Node node37 = node1.copyInformationFrom(node35);
        boolean boolean38 = node37.isReturn();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition40 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1));
        boolean boolean43 = node42.isAssignAdd();
        namePosition40.setItem(node42);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1));
        int int47 = node46.getSourcePosition();
        node46.setWasEmptyNode(true);
        int int50 = node46.getSideEffectFlags();
        boolean boolean51 = node46.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1));
        int int54 = node53.getSourcePosition();
        node53.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1));
        int int59 = node58.getSourcePosition();
        node58.setWasEmptyNode(true);
        boolean boolean62 = node58.isAnd();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(47, node42, node46, node53, node58, 1, 46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node66 = node37.getChildBefore(node53);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1));
        boolean boolean4 = node3.isAssignAdd();
        namePosition1.setItem(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        int int8 = node7.getSourcePosition();
        node7.setWasEmptyNode(true);
        int int11 = node7.getSideEffectFlags();
        boolean boolean12 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1));
        int int15 = node14.getSourcePosition();
        node14.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        int int20 = node19.getSourcePosition();
        node19.setWasEmptyNode(true);
        boolean boolean23 = node19.isAnd();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(47, node3, node7, node14, node19, 1, 46);
        com.google.javascript.rhino.Node node27 = node7.getNext();
        boolean boolean28 = node7.isSyntheticBlock();
        com.google.javascript.rhino.Node node29 = node7.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node7.getChildAtIndex(43);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode0 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode1 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode2 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode3 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode4 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode5 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode6 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode7 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode8 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.common.collect.ImmutableList<java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>> resolveModeEnumList9 = com.google.common.collect.ImmutableList.of((java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode0, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode1, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode2, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode3, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode4, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode5, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode6, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode7, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode8);
        boolean boolean11 = resolveModeEnumList9.equals((java.lang.Object) (-1.0f));
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1));
        boolean boolean14 = node13.isAssignAdd();
        node13.setType(41);
        java.lang.Object obj18 = node13.getProp((int) (short) -1);
        boolean boolean19 = resolveModeEnumList9.equals((java.lang.Object) (short) -1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1));
        int int22 = node21.getSourcePosition();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1));
        int int25 = node24.getSourcePosition();
        node24.setWasEmptyNode(true);
        int int28 = node24.getSideEffectFlags();
        boolean boolean29 = node24.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node30 = node21.copyInformationFrom(node24);
        int int31 = resolveModeEnumList9.lastIndexOf((java.lang.Object) node24);
        boolean boolean32 = node24.isNull();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node34 = node24.getChildAtIndex(100);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1));
        boolean boolean4 = node3.isAssignAdd();
        namePosition1.setItem(node3);
        node3.setVarArgs(false);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((-1));
        int int10 = node9.getSourcePosition();
        node9.setWasEmptyNode(true);
        boolean boolean13 = node9.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition14 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((-1));
        boolean boolean17 = node16.isAssignAdd();
        namePosition14.setItem(node16);
        node16.setVarArgs(false);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1));
        boolean boolean23 = node22.isAssignAdd();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, node3, node9, node16, node22, 0, 0);
        java.lang.String str27 = node9.toString();
        node9.setSourceEncodedPositionForTree(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node31 = node9.getChildAtIndex(4142);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        int int2 = node1.getSourcePosition();
        node1.setWasEmptyNode(true);
        int int5 = node1.getSideEffectFlags();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition7 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((-1));
        boolean boolean10 = node9.isAssignAdd();
        namePosition7.setItem(node9);
        node9.setVarArgs(false);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((-1));
        int int16 = node15.getSourcePosition();
        node15.setWasEmptyNode(true);
        boolean boolean19 = node15.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition20 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1));
        boolean boolean23 = node22.isAssignAdd();
        namePosition20.setItem(node22);
        node22.setVarArgs(false);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1));
        boolean boolean29 = node28.isAssignAdd();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, node9, node15, node22, node28, 0, 0);
        java.lang.String str33 = node1.checkTreeEquals(node9);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1));
        int int36 = node35.getSourcePosition();
        com.google.javascript.rhino.Node node37 = node1.copyInformationFrom(node35);
        java.lang.Object obj39 = node35.getProp((int) (byte) 0);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node35.removeChild(node41);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition2 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1));
        boolean boolean5 = node4.isAssignAdd();
        namePosition2.setItem(node4);
        node4.setVarArgs(false);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1));
        int int11 = node10.getSourcePosition();
        node10.setWasEmptyNode(true);
        boolean boolean14 = node10.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition15 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1));
        boolean boolean18 = node17.isAssignAdd();
        namePosition15.setItem(node17);
        node17.setVarArgs(false);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1));
        boolean boolean24 = node23.isAssignAdd();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (short) 10, node4, node10, node17, node23, 0, 0);
        node27.setOptionalArg(false);
        boolean boolean30 = node27.isDefaultCase();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1));
        int int33 = node32.getSourcePosition();
        node32.setWasEmptyNode(true);
        boolean boolean36 = node32.isAnd();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(4095, node27, node32);
        boolean boolean38 = node32.isLabelName();
        com.google.javascript.rhino.Node node39 = node32.cloneTree();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1));
        int int42 = node41.getSourcePosition();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1));
        int int45 = node44.getSourcePosition();
        node44.setWasEmptyNode(true);
        int int48 = node44.getSideEffectFlags();
        boolean boolean49 = node44.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node50 = node41.copyInformationFrom(node44);
        com.google.javascript.rhino.Node node52 = node41.getChildAtIndex((int) (short) -1);
        com.google.javascript.rhino.Node node53 = node39.useSourceInfoFromForTree(node41);
        boolean boolean54 = node53.isLabel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node56 = node53.getChildAtIndex(143360);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1));
        boolean boolean4 = node3.isAssignAdd();
        namePosition1.setItem(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        int int8 = node7.getSourcePosition();
        node7.setWasEmptyNode(true);
        int int11 = node7.getSideEffectFlags();
        boolean boolean12 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1));
        int int15 = node14.getSourcePosition();
        node14.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        int int20 = node19.getSourcePosition();
        node19.setWasEmptyNode(true);
        boolean boolean23 = node19.isAnd();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(47, node3, node7, node14, node19, 1, 46);
        boolean boolean27 = node19.isLocalResultCall();
        boolean boolean28 = node19.isString();
        boolean boolean29 = node19.isReturn();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression31 = new com.google.javascript.rhino.JSTypeExpression(node19, "Named type with empty name component");
        boolean boolean32 = node19.isThis();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node34 = node19.getChildAtIndex(47);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        node1.setSourceEncodedPositionForTree(46);
        int int4 = node1.getSideEffectFlags();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition6 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1));
        boolean boolean9 = node8.isAssignAdd();
        namePosition6.setItem(node8);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1));
        int int13 = node12.getSourcePosition();
        node12.setWasEmptyNode(true);
        int int16 = node12.getSideEffectFlags();
        boolean boolean17 = node12.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        int int20 = node19.getSourcePosition();
        node19.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1));
        int int25 = node24.getSourcePosition();
        node24.setWasEmptyNode(true);
        boolean boolean28 = node24.isAnd();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(47, node8, node12, node19, node24, 1, 46);
        com.google.javascript.rhino.Node node32 = node1.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean33 = node24.isRegExp();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition35 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1));
        boolean boolean38 = node37.isAssignAdd();
        namePosition35.setItem(node37);
        node37.setVarArgs(false);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((-1));
        int int44 = node43.getSourcePosition();
        node43.setWasEmptyNode(true);
        boolean boolean47 = node43.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition48 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1));
        boolean boolean51 = node50.isAssignAdd();
        namePosition48.setItem(node50);
        node50.setVarArgs(false);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((-1));
        boolean boolean57 = node56.isAssignAdd();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 10, node37, node43, node50, node56, 0, 0);
        node60.setOptionalArg(false);
        boolean boolean63 = node60.isDefaultCase();
        boolean boolean65 = node60.getBooleanProp(39);
        boolean boolean66 = node60.isThrow();
        int int67 = node60.getSourcePosition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node24.removeChild(node60);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int2 = namePosition1.getStartLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition3 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int4 = namePosition3.getStartLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition5 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition6 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node7 = namePosition6.getItem();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition8 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int9 = namePosition8.getStartLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition10 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int11 = namePosition10.getStartLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList12 = com.google.common.collect.ImmutableList.of(namePosition0, namePosition1, namePosition3, namePosition5, namePosition6, namePosition8, namePosition10);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition14 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((-1));
        boolean boolean17 = node16.isAssignAdd();
        namePosition14.setItem(node16);
        node16.setVarArgs(false);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1));
        int int23 = node22.getSourcePosition();
        node22.setWasEmptyNode(true);
        boolean boolean26 = node22.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition27 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((-1));
        boolean boolean30 = node29.isAssignAdd();
        namePosition27.setItem(node29);
        node29.setVarArgs(false);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1));
        boolean boolean36 = node35.isAssignAdd();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) (short) 10, node16, node22, node29, node35, 0, 0);
        namePosition3.setItem(node39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node42 = node39.getChildAtIndex(52);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        int int2 = node1.getSourcePosition();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1));
        int int5 = node4.getSourcePosition();
        node4.setWasEmptyNode(true);
        int int8 = node4.getSideEffectFlags();
        boolean boolean9 = node4.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node10 = node1.copyInformationFrom(node4);
        boolean boolean11 = node1.isAnd();
        boolean boolean12 = node1.isVar();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1));
        boolean boolean15 = node14.isAssignAdd();
        node14.setType(41);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        boolean boolean20 = node19.isAssignAdd();
        node19.setType(41);
        java.lang.Object obj24 = node19.getProp((int) ' ');
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder25 = node19.new FileLevelJsDocBuilder();
        boolean boolean26 = node14.isEquivalentToTyped(node19);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1));
        int int29 = node28.getSourcePosition();
        node28.setWasEmptyNode(true);
        int int32 = node28.getSideEffectFlags();
        boolean boolean33 = node28.isNoSideEffectsCall();
        boolean boolean34 = node28.isName();
        boolean boolean35 = node28.isFromExterns();
        com.google.javascript.rhino.Node node36 = node14.useSourceInfoIfMissingFrom(node28);
        com.google.javascript.rhino.Node node37 = node14.getParent();
        boolean boolean38 = node14.isCase();
        com.google.javascript.rhino.Node node39 = node14.getLastSibling();
        boolean boolean40 = node39.wasEmptyNode();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((-1));
        int int44 = node43.getSourcePosition();
        node43.setWasEmptyNode(true);
        int int47 = node43.getSideEffectFlags();
        boolean boolean48 = node43.isLocalResultCall();
        boolean boolean49 = node43.isFalse();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((int) '4', node43, (int) '4', (int) 'a');
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1));
        int int55 = node54.getSourcePosition();
        boolean boolean56 = node52.isEquivalentTo(node54);
        boolean boolean57 = node52.isOnlyModifiesThisCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node39, node52);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        boolean boolean2 = node1.isAssignAdd();
        node1.setType(41);
        java.lang.Object obj6 = node1.getProp((int) ' ');
        node1.removeProp(0);
        boolean boolean9 = node1.isSyntheticBlock();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1));
        int int13 = node12.getSourcePosition();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((-1));
        node15.setSourceEncodedPositionForTree(46);
        int int18 = node15.getSideEffectFlags();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node15.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1));
        int int22 = node21.getSourcePosition();
        node21.setWasEmptyNode(true);
        boolean boolean25 = node21.isAnd();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((-1));
        node27.setSourceEncodedPositionForTree(46);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression31 = new com.google.javascript.rhino.JSTypeExpression(node27, "([LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS])");
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0, node12, node15, node21, node27);
        boolean boolean33 = node1.hasChild(node27);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition35 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1));
        boolean boolean38 = node37.isAssignAdd();
        namePosition35.setItem(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1));
        int int42 = node41.getSourcePosition();
        node41.setWasEmptyNode(true);
        int int45 = node41.getSideEffectFlags();
        boolean boolean46 = node41.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((-1));
        int int49 = node48.getSourcePosition();
        node48.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1));
        int int54 = node53.getSourcePosition();
        node53.setWasEmptyNode(true);
        boolean boolean57 = node53.isAnd();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(47, node37, node41, node48, node53, 1, 46);
        boolean boolean61 = node53.isLocalResultCall();
        boolean boolean62 = node53.isString();
        boolean boolean63 = node53.isReturn();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = new com.google.javascript.rhino.JSTypeExpression(node53, "Named type with empty name component");
        boolean boolean66 = node53.isThis();
        com.google.javascript.rhino.Node node67 = node27.clonePropsFrom(node53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jSTypeExpression31 and jSTypeExpression65", jSTypeExpression31.equals(jSTypeExpression65) ? jSTypeExpression31.hashCode() == jSTypeExpression65.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1));
        boolean boolean4 = node3.isAssignAdd();
        namePosition1.setItem(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        int int8 = node7.getSourcePosition();
        node7.setWasEmptyNode(true);
        int int11 = node7.getSideEffectFlags();
        boolean boolean12 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1));
        int int15 = node14.getSourcePosition();
        node14.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        int int20 = node19.getSourcePosition();
        node19.setWasEmptyNode(true);
        boolean boolean23 = node19.isAnd();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(47, node3, node7, node14, node19, 1, 46);
        com.google.javascript.rhino.Node node27 = node7.getNext();
        boolean boolean28 = node7.isSyntheticBlock();
        com.google.javascript.rhino.Node node29 = node7.cloneTree();
        boolean boolean30 = node29.isCall();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = new com.google.javascript.rhino.JSTypeExpression(node29, "java.io.IOException");
        int int33 = node29.getLineno();
        boolean boolean34 = node29.hasChildren();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition36 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1));
        boolean boolean39 = node38.isAssignAdd();
        namePosition36.setItem(node38);
        node38.setVarArgs(false);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1));
        int int45 = node44.getSourcePosition();
        node44.setWasEmptyNode(true);
        boolean boolean48 = node44.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition49 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((-1));
        boolean boolean52 = node51.isAssignAdd();
        namePosition49.setItem(node51);
        node51.setVarArgs(false);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((-1));
        boolean boolean58 = node57.isAssignAdd();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (short) 10, node38, node44, node51, node57, 0, 0);
        boolean boolean62 = node61.isLabel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node29.removeChild(node61);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        int int2 = node1.getSourcePosition();
        node1.setWasEmptyNode(true);
        int int5 = node1.getSideEffectFlags();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition7 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((-1));
        boolean boolean10 = node9.isAssignAdd();
        namePosition7.setItem(node9);
        node9.setVarArgs(false);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((-1));
        int int16 = node15.getSourcePosition();
        node15.setWasEmptyNode(true);
        boolean boolean19 = node15.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition20 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1));
        boolean boolean23 = node22.isAssignAdd();
        namePosition20.setItem(node22);
        node22.setVarArgs(false);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1));
        boolean boolean29 = node28.isAssignAdd();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, node9, node15, node22, node28, 0, 0);
        java.lang.String str33 = node1.checkTreeEquals(node9);
        boolean boolean34 = node9.isEmpty();
        boolean boolean35 = node9.isDo();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition38 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((-1));
        boolean boolean41 = node40.isAssignAdd();
        namePosition38.setItem(node40);
        node40.setVarArgs(false);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1));
        int int47 = node46.getSourcePosition();
        node46.setWasEmptyNode(true);
        boolean boolean50 = node46.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition51 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1));
        boolean boolean54 = node53.isAssignAdd();
        namePosition51.setItem(node53);
        node53.setVarArgs(false);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((-1));
        boolean boolean60 = node59.isAssignAdd();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (short) 10, node40, node46, node53, node59, 0, 0);
        node63.setOptionalArg(false);
        boolean boolean66 = node63.isDefaultCase();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((-1));
        int int69 = node68.getSourcePosition();
        node68.setWasEmptyNode(true);
        boolean boolean72 = node68.isAnd();
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(4095, node63, node68);
        boolean boolean74 = node68.isLabelName();
        com.google.javascript.rhino.Node node75 = node68.cloneTree();
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node((-1));
        int int78 = node77.getSourcePosition();
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((-1));
        int int81 = node80.getSourcePosition();
        node80.setWasEmptyNode(true);
        int int84 = node80.getSideEffectFlags();
        boolean boolean85 = node80.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node86 = node77.copyInformationFrom(node80);
        com.google.javascript.rhino.Node node88 = node77.getChildAtIndex((int) (short) -1);
        com.google.javascript.rhino.Node node89 = node75.useSourceInfoFromForTree(node77);
        java.util.Set<java.lang.String> strSet90 = node89.getDirectives();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node9.removeChild(node89);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition2 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1));
        boolean boolean5 = node4.isAssignAdd();
        namePosition2.setItem(node4);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1));
        int int9 = node8.getSourcePosition();
        node8.setWasEmptyNode(true);
        int int12 = node8.getSideEffectFlags();
        boolean boolean13 = node8.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((-1));
        int int16 = node15.getSourcePosition();
        node15.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((-1));
        int int21 = node20.getSourcePosition();
        node20.setWasEmptyNode(true);
        boolean boolean24 = node20.isAnd();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(47, node4, node8, node15, node20, 1, 46);
        boolean boolean28 = node20.isLocalResultCall();
        boolean boolean29 = node20.isString();
        boolean boolean30 = node20.isReturn();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1));
        int int33 = node32.getSourcePosition();
        node32.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node36 = node20.useSourceInfoFrom(node32);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((int) 'a', node32, 53, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node41 = node32.getChildAtIndex(30);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1));
        boolean boolean4 = node3.isAssignAdd();
        namePosition1.setItem(node3);
        node3.setVarArgs(false);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((-1));
        int int10 = node9.getSourcePosition();
        node9.setWasEmptyNode(true);
        boolean boolean13 = node9.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition14 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((-1));
        boolean boolean17 = node16.isAssignAdd();
        namePosition14.setItem(node16);
        node16.setVarArgs(false);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1));
        boolean boolean23 = node22.isAssignAdd();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, node3, node9, node16, node22, 0, 0);
        node26.setOptionalArg(false);
        boolean boolean29 = node26.isFalse();
        com.google.javascript.rhino.Node node30 = node26.removeFirstChild();
        com.google.javascript.rhino.InputId inputId31 = node26.getInputId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node33 = node26.getChildAtIndex(40);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        boolean boolean2 = node1.isAssignAdd();
        node1.setType(41);
        java.lang.Object obj6 = node1.getProp((int) ' ');
        node1.removeProp(0);
        boolean boolean9 = node1.isSyntheticBlock();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1));
        boolean boolean13 = node12.isAssignAdd();
        node12.setType(41);
        java.lang.Object obj17 = node12.getProp((int) ' ');
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        boolean boolean20 = node19.isAssignAdd();
        node19.setWasEmptyNode(false);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType10, node12, node19);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1));
        node25.setSourceEncodedPositionForTree(46);
        java.lang.String str28 = node25.getSourceFileName();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1));
        int int31 = node30.getSourcePosition();
        boolean boolean32 = node30.isThrow();
        boolean boolean33 = node30.isNoSideEffectsCall();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship34 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType10, node25, node30);
        boolean boolean35 = node25.isNew();
        com.google.javascript.rhino.Node node36 = node1.useSourceInfoFromForTree(node25);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = node25.getJSDocInfo();
        node25.setOptionalArg(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node41 = node25.getChildAtIndex(38);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        int int2 = node1.getSourcePosition();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1));
        int int5 = node4.getSourcePosition();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        int int8 = node7.getSourcePosition();
        node7.setWasEmptyNode(true);
        int int11 = node7.getSideEffectFlags();
        boolean boolean12 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node13 = node4.copyInformationFrom(node7);
        boolean boolean14 = node4.isAnd();
        node4.putIntProp((int) (byte) 1, 47);
        boolean boolean18 = node1.isEquivalentToTyped(node4);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((-1));
        int int21 = node20.getSourcePosition();
        node20.setWasEmptyNode(true);
        int int24 = node20.getSideEffectFlags();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition26 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1));
        boolean boolean29 = node28.isAssignAdd();
        namePosition26.setItem(node28);
        node28.setVarArgs(false);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1));
        int int35 = node34.getSourcePosition();
        node34.setWasEmptyNode(true);
        boolean boolean38 = node34.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition39 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1));
        boolean boolean42 = node41.isAssignAdd();
        namePosition39.setItem(node41);
        node41.setVarArgs(false);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((-1));
        boolean boolean48 = node47.isAssignAdd();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (short) 10, node28, node34, node41, node47, 0, 0);
        java.lang.String str52 = node20.checkTreeEquals(node28);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1));
        int int55 = node54.getSourcePosition();
        boolean boolean56 = node54.isThrow();
        boolean boolean57 = node54.isNoSideEffectsCall();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType58 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((-1));
        boolean boolean61 = node60.isAssignAdd();
        node60.setType(41);
        java.lang.Object obj65 = node60.getProp((int) ' ');
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((-1));
        boolean boolean68 = node67.isAssignAdd();
        node67.setWasEmptyNode(false);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship71 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType58, node60, node67);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((-1));
        node73.setSourceEncodedPositionForTree(46);
        java.lang.String str76 = node73.getSourceFileName();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((-1));
        int int79 = node78.getSourcePosition();
        boolean boolean80 = node78.isThrow();
        boolean boolean81 = node78.isNoSideEffectsCall();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship82 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType58, node73, node78);
        com.google.javascript.rhino.Node node83 = node54.clonePropsFrom(node78);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile84 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node78);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression86 = new com.google.javascript.rhino.JSTypeExpression(node78, "");
        boolean boolean87 = node20.isEquivalentToTyped(node78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node88 = node1.getChildBefore(node20);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(49, "(NUMBER 0.0\n)", 46, (int) (byte) -1);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition6 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1));
        boolean boolean9 = node8.isAssignAdd();
        namePosition6.setItem(node8);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1));
        int int13 = node12.getSourcePosition();
        node12.setWasEmptyNode(true);
        int int16 = node12.getSideEffectFlags();
        boolean boolean17 = node12.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        int int20 = node19.getSourcePosition();
        node19.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1));
        int int25 = node24.getSourcePosition();
        node24.setWasEmptyNode(true);
        boolean boolean28 = node24.isAnd();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(47, node8, node12, node19, node24, 1, 46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node24);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        int int2 = node1.getSourcePosition();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1));
        int int5 = node4.getSourcePosition();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        int int8 = node7.getSourcePosition();
        node7.setWasEmptyNode(true);
        int int11 = node7.getSideEffectFlags();
        boolean boolean12 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node13 = node4.copyInformationFrom(node7);
        boolean boolean14 = node4.isAnd();
        node4.putIntProp((int) (byte) 1, 47);
        boolean boolean18 = node1.isEquivalentToTyped(node4);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node4);
        boolean boolean20 = node4.hasOneChild();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1));
        int int23 = node22.getSourcePosition();
        node22.setWasEmptyNode(true);
        int int26 = node22.getSideEffectFlags();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition28 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1));
        boolean boolean31 = node30.isAssignAdd();
        namePosition28.setItem(node30);
        node30.setVarArgs(false);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((-1));
        int int37 = node36.getSourcePosition();
        node36.setWasEmptyNode(true);
        boolean boolean40 = node36.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition41 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((-1));
        boolean boolean44 = node43.isAssignAdd();
        namePosition41.setItem(node43);
        node43.setVarArgs(false);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1));
        boolean boolean50 = node49.isAssignAdd();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (short) 10, node30, node36, node43, node49, 0, 0);
        java.lang.String str54 = node22.checkTreeEquals(node30);
        node22.setLineno((int) '#');
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder57 = node22.getJsDocBuilderForNode();
        boolean boolean58 = node22.isObjectLit();
        node22.setOptionalArg(true);
        boolean boolean61 = node22.hasMoreThanOneChild();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.removeChild(node22);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        int int2 = node1.getSourcePosition();
        boolean boolean3 = node1.isThrow();
        boolean boolean4 = node1.isNoSideEffectsCall();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType5 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        boolean boolean8 = node7.isAssignAdd();
        node7.setType(41);
        java.lang.Object obj12 = node7.getProp((int) ' ');
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1));
        boolean boolean15 = node14.isAssignAdd();
        node14.setWasEmptyNode(false);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship18 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType5, node7, node14);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((-1));
        node20.setSourceEncodedPositionForTree(46);
        java.lang.String str23 = node20.getSourceFileName();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1));
        int int26 = node25.getSourcePosition();
        boolean boolean27 = node25.isThrow();
        boolean boolean28 = node25.isNoSideEffectsCall();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship29 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType5, node20, node25);
        com.google.javascript.rhino.Node node30 = node1.clonePropsFrom(node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile31 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node25);
        int int32 = node25.getType();
        int int33 = node25.getCharno();
        node25.putIntProp(12, 54);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile37 = node25.getStaticSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node25.getChildAtIndex(188416);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        int int2 = node1.getSourcePosition();
        node1.setWasEmptyNode(true);
        node1.removeProp((int) (byte) 10);
        boolean boolean7 = node1.isDefaultCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node1.getChildAtIndex(29);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node((-1));
        boolean boolean3 = node2.isVoid();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition5 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        boolean boolean8 = node7.isAssignAdd();
        namePosition5.setItem(node7);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((-1));
        int int12 = node11.getSourcePosition();
        node11.setWasEmptyNode(true);
        int int15 = node11.getSideEffectFlags();
        boolean boolean16 = node11.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((-1));
        int int19 = node18.getSourcePosition();
        node18.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1));
        int int24 = node23.getSourcePosition();
        node23.setWasEmptyNode(true);
        boolean boolean27 = node23.isAnd();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(47, node7, node11, node18, node23, 1, 46);
        node30.addSuppression("");
        com.google.javascript.rhino.Node node33 = node30.cloneNode();
        node30.setSourceFileForTesting("hi!");
        node2.addChildToBack(node30);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1));
        int int39 = node38.getSourcePosition();
        node38.setWasEmptyNode(true);
        int int42 = node38.getSideEffectFlags();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0, node2, node38, 51, (-1));
        node38.setCharno((int) '#');
        boolean boolean48 = node38.isIn();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1));
        int int51 = node50.getSourcePosition();
        node50.setWasEmptyNode(true);
        int int54 = node50.getSideEffectFlags();
        boolean boolean55 = node50.isLocalResultCall();
        boolean boolean56 = node50.isCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = node38.getChildBefore(node50);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        boolean boolean2 = node1.isDefaultCase();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1));
        boolean boolean5 = node4.isAssignAdd();
        node4.setType(41);
        node4.removeProp((int) (short) 100);
        com.google.javascript.rhino.Node node10 = node4.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.removeChild(node10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        boolean boolean2 = node1.isAssignAdd();
        node1.setType(41);
        java.lang.Object obj6 = node1.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1));
        boolean boolean9 = node8.isAssignAdd();
        node8.setType(41);
        node8.removeProp((int) (short) 100);
        node1.addChildrenToBack(node8);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition16 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((-1));
        boolean boolean19 = node18.isAssignAdd();
        namePosition16.setItem(node18);
        node18.setVarArgs(false);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1));
        int int25 = node24.getSourcePosition();
        node24.setWasEmptyNode(true);
        boolean boolean28 = node24.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition29 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1));
        boolean boolean32 = node31.isAssignAdd();
        namePosition29.setItem(node31);
        node31.setVarArgs(false);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1));
        boolean boolean38 = node37.isAssignAdd();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 10, node18, node24, node31, node37, 0, 0);
        boolean boolean42 = node37.isNot();
        int int43 = node37.getCharno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node44 = node8.getChildBefore(node37);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1));
        boolean boolean4 = node3.isAssignAdd();
        namePosition1.setItem(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        int int8 = node7.getSourcePosition();
        node7.setWasEmptyNode(true);
        int int11 = node7.getSideEffectFlags();
        boolean boolean12 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1));
        int int15 = node14.getSourcePosition();
        node14.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        int int20 = node19.getSourcePosition();
        node19.setWasEmptyNode(true);
        boolean boolean23 = node19.isAnd();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(47, node3, node7, node14, node19, 1, 46);
        java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node19);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition29 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1));
        boolean boolean32 = node31.isAssignAdd();
        namePosition29.setItem(node31);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1));
        int int36 = node35.getSourcePosition();
        node35.setWasEmptyNode(true);
        int int39 = node35.getSideEffectFlags();
        boolean boolean40 = node35.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1));
        int int43 = node42.getSourcePosition();
        node42.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((-1));
        int int48 = node47.getSourcePosition();
        node47.setWasEmptyNode(true);
        boolean boolean51 = node47.isAnd();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(47, node31, node35, node42, node47, 1, 46);
        com.google.javascript.rhino.Node node55 = node35.getNext();
        boolean boolean56 = node35.isSyntheticBlock();
        com.google.javascript.rhino.Node node57 = node35.cloneTree();
        boolean boolean58 = node57.isCall();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = new com.google.javascript.rhino.JSTypeExpression(node57, "java.io.IOException");
        int int61 = node57.getLineno();
        int int62 = node57.getType();
        int int63 = node19.getIndexOfChild(node57);
        node19.addSuppression("ERROR [empty_block: 1]\n");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition67 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((-1));
        boolean boolean70 = node69.isAssignAdd();
        namePosition67.setItem(node69);
        node69.setVarArgs(false);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((-1));
        int int76 = node75.getSourcePosition();
        node75.setWasEmptyNode(true);
        boolean boolean79 = node75.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition80 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((-1));
        boolean boolean83 = node82.isAssignAdd();
        namePosition80.setItem(node82);
        node82.setVarArgs(false);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((-1));
        boolean boolean89 = node88.isAssignAdd();
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node((int) (short) 10, node69, node75, node82, node88, 0, 0);
        node92.setOptionalArg(false);
        boolean boolean96 = node92.getBooleanProp(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node97 = node19.getChildBefore(node92);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getParameterType("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection3 = jSDocInfo0.getTypeNodes();
        boolean boolean4 = jSDocInfo0.isConstructor();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getSuppressions();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1));
        boolean boolean11 = node10.isAssignAdd();
        node10.setType(41);
        java.lang.Object obj15 = node10.getProp((int) ' ');
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1));
        boolean boolean18 = node17.isAssignAdd();
        node17.setWasEmptyNode(false);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship21 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType8, node10, node17);
        node10.putBooleanProp(48, false);
        boolean boolean25 = node10.isDelProp();
        boolean boolean26 = strSet7.equals((java.lang.Object) node10);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1));
        int int29 = node28.getSourcePosition();
        node28.setWasEmptyNode(true);
        int int32 = node28.getSideEffectFlags();
        boolean boolean33 = node28.isNoSideEffectsCall();
        boolean boolean34 = node28.isName();
        boolean boolean35 = node28.isFromExterns();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = node28.getStaticSourceFile();
        node28.setWasEmptyNode(true);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder39 = node28.getJsDocBuilderForNode();
        node28.putIntProp(9, 46);
        com.google.javascript.rhino.InputId inputId43 = node28.getInputId();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1));
        node45.setSourceEncodedPositionForTree(46);
        boolean boolean49 = node45.getBooleanProp((int) ' ');
        int int50 = node45.getLength();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression53 = jSDocInfo51.getParameterType("");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection54 = jSDocInfo51.getTypeNodes();
        boolean boolean55 = jSDocInfo51.isConstructor();
        boolean boolean57 = jSDocInfo51.hasParameter("Named type with empty name component");
        node45.setJSDocInfo(jSDocInfo51);
        int int59 = node45.getSideEffectFlags();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node10.replaceChild(node28, node45);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        int int2 = node1.getSourcePosition();
        boolean boolean3 = node1.isThrow();
        boolean boolean4 = node1.isNoSideEffectsCall();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType5 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        boolean boolean8 = node7.isAssignAdd();
        node7.setType(41);
        java.lang.Object obj12 = node7.getProp((int) ' ');
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1));
        boolean boolean15 = node14.isAssignAdd();
        node14.setWasEmptyNode(false);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship18 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType5, node7, node14);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((-1));
        node20.setSourceEncodedPositionForTree(46);
        java.lang.String str23 = node20.getSourceFileName();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1));
        int int26 = node25.getSourcePosition();
        boolean boolean27 = node25.isThrow();
        boolean boolean28 = node25.isNoSideEffectsCall();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship29 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType5, node20, node25);
        com.google.javascript.rhino.Node node30 = node1.clonePropsFrom(node25);
        boolean boolean31 = node25.isInstanceOf();
        boolean boolean32 = node25.isWith();
        com.google.javascript.rhino.InputId inputId33 = node25.getInputId();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean37 = node36.isThis();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node38 = node25.getChildBefore(node36);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(10, 52, 44);
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex(30);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1));
        boolean boolean4 = node3.isAssignAdd();
        namePosition1.setItem(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        int int8 = node7.getSourcePosition();
        node7.setWasEmptyNode(true);
        int int11 = node7.getSideEffectFlags();
        boolean boolean12 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1));
        int int15 = node14.getSourcePosition();
        node14.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        int int20 = node19.getSourcePosition();
        node19.setWasEmptyNode(true);
        boolean boolean23 = node19.isAnd();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(47, node3, node7, node14, node19, 1, 46);
        node26.addSuppression("");
        com.google.javascript.rhino.Node node29 = node26.cloneNode();
        boolean boolean30 = node29.isIn();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition32 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1));
        boolean boolean35 = node34.isAssignAdd();
        namePosition32.setItem(node34);
        node34.setVarArgs(false);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((-1));
        int int41 = node40.getSourcePosition();
        node40.setWasEmptyNode(true);
        boolean boolean44 = node40.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition45 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((-1));
        boolean boolean48 = node47.isAssignAdd();
        namePosition45.setItem(node47);
        node47.setVarArgs(false);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1));
        boolean boolean54 = node53.isAssignAdd();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (short) 10, node34, node40, node47, node53, 0, 0);
        node47.setSourceFileForTesting("([LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS])");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node60 = node29.getChildBefore(node47);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1));
        boolean boolean4 = node3.isAssignAdd();
        namePosition1.setItem(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        int int8 = node7.getSourcePosition();
        node7.setWasEmptyNode(true);
        int int11 = node7.getSideEffectFlags();
        boolean boolean12 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1));
        int int15 = node14.getSourcePosition();
        node14.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        int int20 = node19.getSourcePosition();
        node19.setWasEmptyNode(true);
        boolean boolean23 = node19.isAnd();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(47, node3, node7, node14, node19, 1, 46);
        com.google.javascript.rhino.Node node27 = node14.getNext();
        com.google.javascript.rhino.Node node28 = node14.getLastSibling();
        boolean boolean29 = node14.isFalse();
        com.google.javascript.rhino.Node node30 = node14.getLastSibling();
        node14.removeProp(4142);
        java.lang.String str33 = node14.getQualifiedName();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition35 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1));
        boolean boolean38 = node37.isAssignAdd();
        namePosition35.setItem(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1));
        int int42 = node41.getSourcePosition();
        node41.setWasEmptyNode(true);
        int int45 = node41.getSideEffectFlags();
        boolean boolean46 = node41.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((-1));
        int int49 = node48.getSourcePosition();
        node48.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1));
        int int54 = node53.getSourcePosition();
        node53.setWasEmptyNode(true);
        boolean boolean57 = node53.isAnd();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(47, node37, node41, node48, node53, 1, 46);
        com.google.javascript.rhino.Node node61 = node48.getNext();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((-1));
        boolean boolean64 = node63.isAssignAdd();
        node63.setType(41);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((-1));
        boolean boolean69 = node68.isAssignAdd();
        node68.setType(41);
        java.lang.Object obj73 = node68.getProp((int) ' ');
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder74 = node68.new FileLevelJsDocBuilder();
        boolean boolean75 = node63.isEquivalentToTyped(node68);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node((-1));
        int int78 = node77.getSourcePosition();
        node77.setWasEmptyNode(true);
        int int81 = node77.getSideEffectFlags();
        boolean boolean82 = node77.isNoSideEffectsCall();
        boolean boolean83 = node77.isName();
        boolean boolean84 = node77.isFromExterns();
        com.google.javascript.rhino.Node node85 = node63.useSourceInfoIfMissingFrom(node77);
        com.google.javascript.rhino.Node node86 = node48.srcrefTree(node85);
        boolean boolean87 = node85.isFalse();
        com.google.javascript.rhino.Node node88 = node85.getLastSibling();
        boolean boolean89 = node88.isVar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.removeChild(node88);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) (short) -1, "Unknown class name", 46, (int) (short) 100);
        int int5 = node4.getType();
        boolean boolean6 = node4.isDelProp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node4.getChildAtIndex(42);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        int int2 = node1.getSourcePosition();
        boolean boolean3 = node1.isThrow();
        boolean boolean4 = node1.isNoSideEffectsCall();
        boolean boolean5 = node1.isFunction();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node1.getChildAtIndex(8);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1));
        boolean boolean4 = node3.isAssignAdd();
        namePosition1.setItem(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        int int8 = node7.getSourcePosition();
        node7.setWasEmptyNode(true);
        int int11 = node7.getSideEffectFlags();
        boolean boolean12 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1));
        int int15 = node14.getSourcePosition();
        node14.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        int int20 = node19.getSourcePosition();
        node19.setWasEmptyNode(true);
        boolean boolean23 = node19.isAnd();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(47, node3, node7, node14, node19, 1, 46);
        java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node19);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition29 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1));
        boolean boolean32 = node31.isAssignAdd();
        namePosition29.setItem(node31);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1));
        int int36 = node35.getSourcePosition();
        node35.setWasEmptyNode(true);
        int int39 = node35.getSideEffectFlags();
        boolean boolean40 = node35.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1));
        int int43 = node42.getSourcePosition();
        node42.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((-1));
        int int48 = node47.getSourcePosition();
        node47.setWasEmptyNode(true);
        boolean boolean51 = node47.isAnd();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(47, node31, node35, node42, node47, 1, 46);
        com.google.javascript.rhino.Node node55 = node35.getNext();
        boolean boolean56 = node35.isSyntheticBlock();
        com.google.javascript.rhino.Node node57 = node35.cloneTree();
        boolean boolean58 = node57.isCall();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression60 = new com.google.javascript.rhino.JSTypeExpression(node57, "java.io.IOException");
        int int61 = node57.getLineno();
        int int62 = node57.getType();
        int int63 = node19.getIndexOfChild(node57);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((-1));
        int int66 = node65.getSourcePosition();
        node65.setWasEmptyNode(true);
        node65.removeProp((int) (byte) 10);
        boolean boolean71 = node65.isDefaultCase();
        boolean boolean72 = node65.isReturn();
        int int73 = node65.getSourcePosition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node57.removeChild(node65);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node((-1));
        boolean boolean3 = node2.isAssignAdd();
        node2.setType(41);
        java.lang.Object obj7 = node2.getProp((int) ' ');
        boolean boolean8 = node2.isEmpty();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(2147483647, node2, 32, 8);
        boolean boolean12 = node2.isInstanceOf();
        boolean boolean13 = node2.wasEmptyNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node2.getChildAtIndex(52);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode0 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode1 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode2 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode3 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode4 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode5 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode6 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode7 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode8 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        com.google.common.collect.ImmutableList<java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>> resolveModeEnumList9 = com.google.common.collect.ImmutableList.of((java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode0, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode1, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode2, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode3, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode4, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode5, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode6, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode7, (java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>) resolveMode8);
        boolean boolean10 = resolveModeEnumList9.isEmpty();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>> resolveModeEnumItor11 = resolveModeEnumList9.listIterator();
        com.google.common.collect.ImmutableList<java.lang.Enum<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>> resolveModeEnumList12 = resolveModeEnumList9.reverse();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition15 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1));
        boolean boolean18 = node17.isAssignAdd();
        namePosition15.setItem(node17);
        node17.setVarArgs(false);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1));
        int int24 = node23.getSourcePosition();
        node23.setWasEmptyNode(true);
        boolean boolean27 = node23.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition28 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1));
        boolean boolean31 = node30.isAssignAdd();
        namePosition28.setItem(node30);
        node30.setVarArgs(false);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((-1));
        boolean boolean37 = node36.isAssignAdd();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, node17, node23, node30, node36, 0, 0);
        node40.setOptionalArg(false);
        boolean boolean43 = node40.isDefaultCase();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1));
        int int46 = node45.getSourcePosition();
        node45.setWasEmptyNode(true);
        boolean boolean49 = node45.isAnd();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(4095, node40, node45);
        boolean boolean51 = node45.isLabelName();
        com.google.javascript.rhino.Node node52 = node45.cloneTree();
        com.google.javascript.rhino.jstype.JSType jSType53 = node52.getJSType();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1));
        boolean boolean56 = node55.isAssignAdd();
        node55.setType(41);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((-1));
        boolean boolean61 = node60.isAssignAdd();
        node60.setType(41);
        java.lang.Object obj65 = node60.getProp((int) ' ');
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder66 = node60.new FileLevelJsDocBuilder();
        boolean boolean67 = node55.isEquivalentToTyped(node60);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((-1));
        int int70 = node69.getSourcePosition();
        node69.setWasEmptyNode(true);
        int int73 = node69.getSideEffectFlags();
        boolean boolean74 = node69.isNoSideEffectsCall();
        boolean boolean75 = node69.isName();
        boolean boolean76 = node69.isFromExterns();
        com.google.javascript.rhino.Node node77 = node55.useSourceInfoIfMissingFrom(node69);
        boolean boolean78 = node52.isEquivalentToTyped(node69);
        boolean boolean79 = resolveModeEnumList12.contains((java.lang.Object) node52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = node52.getChildAtIndex(49);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        int int2 = node1.getSourcePosition();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1));
        int int5 = node4.getSourcePosition();
        node4.setWasEmptyNode(true);
        int int8 = node4.getSideEffectFlags();
        boolean boolean9 = node4.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node10 = node1.copyInformationFrom(node4);
        boolean boolean11 = node10.isExprResult();
        int int12 = node10.getCharno();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((-1));
        int int16 = node15.getSourcePosition();
        node15.setWasEmptyNode(true);
        int int19 = node15.getSideEffectFlags();
        boolean boolean20 = node15.isLocalResultCall();
        boolean boolean21 = node15.isFalse();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((int) '4', node15, (int) '4', (int) 'a');
        com.google.javascript.rhino.Node node25 = node10.useSourceInfoFrom(node15);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((-1));
        int int28 = node27.getSourcePosition();
        node27.setWasEmptyNode(true);
        int int31 = node27.getSideEffectFlags();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition33 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1));
        boolean boolean36 = node35.isAssignAdd();
        namePosition33.setItem(node35);
        node35.setVarArgs(false);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1));
        int int42 = node41.getSourcePosition();
        node41.setWasEmptyNode(true);
        boolean boolean45 = node41.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition46 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((-1));
        boolean boolean49 = node48.isAssignAdd();
        namePosition46.setItem(node48);
        node48.setVarArgs(false);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1));
        boolean boolean55 = node54.isAssignAdd();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (short) 10, node35, node41, node48, node54, 0, 0);
        java.lang.String str59 = node27.checkTreeEquals(node35);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((-1));
        int int62 = node61.getSourcePosition();
        com.google.javascript.rhino.Node node63 = node27.copyInformationFrom(node61);
        boolean boolean64 = node61.isLocalResultCall();
        node15.addChildToFront(node61);
        boolean boolean66 = node61.isFalse();
        com.google.javascript.rhino.Node[] nodeArray68 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(51, nodeArray68, 16, 38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node61.removeChild(node71);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        boolean boolean2 = node1.isAssignAdd();
        node1.setType(41);
        java.lang.Object obj6 = node1.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1));
        boolean boolean9 = node8.isAssignAdd();
        node8.setType(41);
        node8.removeProp((int) (short) 100);
        node1.addChildrenToBack(node8);
        boolean boolean15 = node8.isStringKey();
        boolean boolean16 = node8.isComma();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition18 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((-1));
        boolean boolean21 = node20.isAssignAdd();
        namePosition18.setItem(node20);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1));
        int int25 = node24.getSourcePosition();
        node24.setWasEmptyNode(true);
        int int28 = node24.getSideEffectFlags();
        boolean boolean29 = node24.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1));
        int int32 = node31.getSourcePosition();
        node31.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((-1));
        int int37 = node36.getSourcePosition();
        node36.setWasEmptyNode(true);
        boolean boolean40 = node36.isAnd();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(47, node20, node24, node31, node36, 1, 46);
        com.google.javascript.rhino.Node node44 = node8.srcref(node36);
        boolean boolean45 = node44.isVoid();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((-1));
        boolean boolean48 = node47.isAssignAdd();
        node47.setType(41);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((-1));
        boolean boolean53 = node52.isAssignAdd();
        node52.setType(41);
        java.lang.Object obj57 = node52.getProp((int) ' ');
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder58 = node52.new FileLevelJsDocBuilder();
        boolean boolean59 = node47.isEquivalentToTyped(node52);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((-1));
        int int62 = node61.getSourcePosition();
        node61.setWasEmptyNode(true);
        int int65 = node61.getSideEffectFlags();
        boolean boolean66 = node61.isNoSideEffectsCall();
        boolean boolean67 = node61.isName();
        boolean boolean68 = node61.isFromExterns();
        com.google.javascript.rhino.Node node69 = node47.useSourceInfoIfMissingFrom(node61);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node((-1));
        int int72 = node71.getSourcePosition();
        node71.setWasEmptyNode(true);
        int int75 = node71.getSideEffectFlags();
        boolean boolean76 = node71.isNoSideEffectsCall();
        boolean boolean77 = node71.isName();
        boolean boolean78 = node71.isScript();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean80 = jSDocInfo79.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility81 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo79.setVisibility(visibility81);
        boolean boolean83 = jSDocInfo79.hasModifies();
        java.util.Set<java.lang.String> strSet84 = jSDocInfo79.getSuppressions();
        node71.setDirectives(strSet84);
        boolean boolean86 = node71.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node44.replaceChild(node69, node71);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(42, "Not declared as a constructor", 32, (int) '4');
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node4.new FileLevelJsDocBuilder();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType6 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1));
        boolean boolean9 = node8.isAssignAdd();
        node8.setType(41);
        java.lang.Object obj13 = node8.getProp((int) ' ');
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((-1));
        boolean boolean16 = node15.isAssignAdd();
        node15.setWasEmptyNode(false);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship19 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType6, node8, node15);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1));
        node21.setSourceEncodedPositionForTree(46);
        java.lang.String str24 = node21.getSourceFileName();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((-1));
        int int27 = node26.getSourcePosition();
        boolean boolean28 = node26.isThrow();
        boolean boolean29 = node26.isNoSideEffectsCall();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship30 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType6, node21, node26);
        boolean boolean31 = node21.isNew();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node32 = node4.getChildBefore(node21);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        int int2 = node1.getSourcePosition();
        node1.setWasEmptyNode(true);
        int int5 = node1.getSideEffectFlags();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition7 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((-1));
        boolean boolean10 = node9.isAssignAdd();
        namePosition7.setItem(node9);
        node9.setVarArgs(false);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((-1));
        int int16 = node15.getSourcePosition();
        node15.setWasEmptyNode(true);
        boolean boolean19 = node15.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition20 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1));
        boolean boolean23 = node22.isAssignAdd();
        namePosition20.setItem(node22);
        node22.setVarArgs(false);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1));
        boolean boolean29 = node28.isAssignAdd();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (short) 10, node9, node15, node22, node28, 0, 0);
        java.lang.String str33 = node1.checkTreeEquals(node9);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1));
        int int36 = node35.getSourcePosition();
        com.google.javascript.rhino.Node node37 = node1.copyInformationFrom(node35);
        java.lang.Object obj39 = node35.getProp((int) (byte) 0);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1));
        int int42 = node41.getSourcePosition();
        node41.setWasEmptyNode(true);
        int int45 = node41.getSideEffectFlags();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition47 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1));
        boolean boolean50 = node49.isAssignAdd();
        namePosition47.setItem(node49);
        node49.setVarArgs(false);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1));
        int int56 = node55.getSourcePosition();
        node55.setWasEmptyNode(true);
        boolean boolean59 = node55.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition60 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1));
        boolean boolean63 = node62.isAssignAdd();
        namePosition60.setItem(node62);
        node62.setVarArgs(false);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((-1));
        boolean boolean69 = node68.isAssignAdd();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((int) (short) 10, node49, node55, node62, node68, 0, 0);
        java.lang.String str73 = node41.checkTreeEquals(node49);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((-1));
        int int76 = node75.getSourcePosition();
        com.google.javascript.rhino.Node node77 = node41.copyInformationFrom(node75);
        node77.setIsSyntheticBlock(false);
        boolean boolean80 = node77.isOr();
        int int81 = node77.getSourceOffset();
        boolean boolean82 = node77.isReturn();
        int int83 = node77.getSourceOffset();
        boolean boolean84 = node77.isSwitch();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition85 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node((-1));
        boolean boolean88 = node87.isAssignAdd();
        namePosition85.setItem(node87);
        node87.setVarArgs(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node35.replaceChild(node77, node87);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node((-1));
        boolean boolean3 = node2.isAssignAdd();
        namePosition0.setItem(node2);
        node2.setVarArgs(false);
        com.google.javascript.rhino.InputId inputId8 = new com.google.javascript.rhino.InputId("Not declared as a type name");
        node2.setInputId(inputId8);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        node2.detachChildren();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1));
        int int14 = node13.getSourcePosition();
        node13.setWasEmptyNode(true);
        int int17 = node13.getSideEffectFlags();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition19 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1));
        boolean boolean22 = node21.isAssignAdd();
        namePosition19.setItem(node21);
        node21.setVarArgs(false);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((-1));
        int int28 = node27.getSourcePosition();
        node27.setWasEmptyNode(true);
        boolean boolean31 = node27.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition32 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1));
        boolean boolean35 = node34.isAssignAdd();
        namePosition32.setItem(node34);
        node34.setVarArgs(false);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((-1));
        boolean boolean41 = node40.isAssignAdd();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (short) 10, node21, node27, node34, node40, 0, 0);
        java.lang.String str45 = node13.checkTreeEquals(node21);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((-1));
        int int48 = node47.getSourcePosition();
        com.google.javascript.rhino.Node node49 = node13.copyInformationFrom(node47);
        boolean boolean50 = node47.isLocalResultCall();
        node47.setLineno(53);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1));
        int int55 = node54.getSourcePosition();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((-1));
        int int58 = node57.getSourcePosition();
        node57.setWasEmptyNode(true);
        int int61 = node57.getSideEffectFlags();
        boolean boolean62 = node57.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node63 = node54.copyInformationFrom(node57);
        node57.setSourceFileForTesting("[LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS]");
        boolean boolean66 = node57.isGetProp();
        boolean boolean67 = node57.isBreak();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile68 = node57.getStaticSourceFile();
        node47.setStaticSourceFile(staticSourceFile68);
        int int71 = staticSourceFile68.getLineOfOffset(52);
        node2.setStaticSourceFile(staticSourceFile68);
        boolean boolean73 = node2.isIn();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node76 = node2.getChildBefore(node75);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((-1));
        boolean boolean2 = node1.isAssignAdd();
        node1.setType(41);
        java.lang.Object obj6 = node1.getProp((int) ' ');
        node1.removeProp(0);
        boolean boolean9 = node1.isSyntheticBlock();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1));
        boolean boolean13 = node12.isAssignAdd();
        node12.setType(41);
        java.lang.Object obj17 = node12.getProp((int) ' ');
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        boolean boolean20 = node19.isAssignAdd();
        node19.setWasEmptyNode(false);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType10, node12, node19);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1));
        node25.setSourceEncodedPositionForTree(46);
        java.lang.String str28 = node25.getSourceFileName();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1));
        int int31 = node30.getSourcePosition();
        boolean boolean32 = node30.isThrow();
        boolean boolean33 = node30.isNoSideEffectsCall();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship34 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType10, node25, node30);
        boolean boolean35 = node25.isNew();
        com.google.javascript.rhino.Node node36 = node1.useSourceInfoFromForTree(node25);
        com.google.javascript.rhino.Node node37 = node1.cloneNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node39 = node1.getChildAtIndex((int) (byte) 10);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, (int) (byte) 0, 2147483647);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition5 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        boolean boolean8 = node7.isAssignAdd();
        namePosition5.setItem(node7);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((-1));
        int int12 = node11.getSourcePosition();
        node11.setWasEmptyNode(true);
        int int15 = node11.getSideEffectFlags();
        boolean boolean16 = node11.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((-1));
        int int19 = node18.getSourcePosition();
        node18.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1));
        int int24 = node23.getSourcePosition();
        node23.setWasEmptyNode(true);
        boolean boolean27 = node23.isAnd();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(47, node7, node11, node18, node23, 1, 46);
        com.google.javascript.rhino.Node node31 = node11.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node11);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node((-1));
        boolean boolean3 = node2.isVoid();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition5 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        boolean boolean8 = node7.isAssignAdd();
        namePosition5.setItem(node7);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((-1));
        int int12 = node11.getSourcePosition();
        node11.setWasEmptyNode(true);
        int int15 = node11.getSideEffectFlags();
        boolean boolean16 = node11.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((-1));
        int int19 = node18.getSourcePosition();
        node18.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1));
        int int24 = node23.getSourcePosition();
        node23.setWasEmptyNode(true);
        boolean boolean27 = node23.isAnd();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(47, node7, node11, node18, node23, 1, 46);
        node30.addSuppression("");
        com.google.javascript.rhino.Node node33 = node30.cloneNode();
        node30.setSourceFileForTesting("hi!");
        node2.addChildToBack(node30);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1));
        int int39 = node38.getSourcePosition();
        node38.setWasEmptyNode(true);
        int int42 = node38.getSideEffectFlags();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0, node2, node38, 51, (-1));
        boolean boolean46 = node2.isAdd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node48 = node2.getChildAtIndex(188416);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (short) -1);
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition3 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((-1));
        boolean boolean6 = node5.isAssignAdd();
        namePosition3.setItem(node5);
        node5.setVarArgs(false);
        com.google.javascript.rhino.InputId inputId11 = new com.google.javascript.rhino.InputId("Not declared as a type name");
        node5.setInputId(inputId11);
        boolean boolean13 = node5.isExprResult();
        com.google.javascript.rhino.Node node14 = node1.copyInformationFromForTree(node5);
        boolean boolean15 = node5.isGetProp();
        boolean boolean16 = node5.isHook();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((-1));
        boolean boolean19 = node18.isAssignAdd();
        node18.setType(41);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1));
        boolean boolean24 = node23.isAssignAdd();
        node23.setType(41);
        java.lang.Object obj28 = node23.getProp((int) ' ');
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder29 = node23.new FileLevelJsDocBuilder();
        boolean boolean30 = node18.isEquivalentToTyped(node23);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1));
        int int33 = node32.getSourcePosition();
        node32.setWasEmptyNode(true);
        int int36 = node32.getSideEffectFlags();
        boolean boolean37 = node32.isNoSideEffectsCall();
        boolean boolean38 = node32.isName();
        boolean boolean39 = node32.isFromExterns();
        com.google.javascript.rhino.Node node40 = node18.useSourceInfoIfMissingFrom(node32);
        boolean boolean41 = node32.isString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node42 = node5.getChildBefore(node32);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition1 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1));
        boolean boolean4 = node3.isAssignAdd();
        namePosition1.setItem(node3);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        int int8 = node7.getSourcePosition();
        node7.setWasEmptyNode(true);
        int int11 = node7.getSideEffectFlags();
        boolean boolean12 = node7.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1));
        int int15 = node14.getSourcePosition();
        node14.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        int int20 = node19.getSourcePosition();
        node19.setWasEmptyNode(true);
        boolean boolean23 = node19.isAnd();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(47, node3, node7, node14, node19, 1, 46);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1));
        int int29 = node28.getSourcePosition();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1));
        int int32 = node31.getSourcePosition();
        node31.setWasEmptyNode(true);
        int int35 = node31.getSideEffectFlags();
        boolean boolean36 = node31.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node37 = node28.copyInformationFrom(node31);
        boolean boolean38 = node28.isAnd();
        com.google.javascript.rhino.Node node39 = node7.copyInformationFrom(node28);
        boolean boolean40 = node39.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1));
        boolean boolean43 = node42.isAssignAdd();
        node42.setType(41);
        java.lang.Object obj47 = node42.getProp((int) (short) -1);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1));
        boolean boolean50 = node49.isAssignAdd();
        node49.setType(41);
        node49.removeProp((int) (short) 100);
        node42.addChildrenToBack(node49);
        boolean boolean56 = node49.isStringKey();
        com.google.javascript.rhino.Node node57 = node49.getLastSibling();
        boolean boolean58 = node57.isInstanceOf();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition60 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1));
        boolean boolean63 = node62.isAssignAdd();
        namePosition60.setItem(node62);
        node62.setVarArgs(false);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((-1));
        int int69 = node68.getSourcePosition();
        node68.setWasEmptyNode(true);
        boolean boolean72 = node68.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition73 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((-1));
        boolean boolean76 = node75.isAssignAdd();
        namePosition73.setItem(node75);
        node75.setVarArgs(false);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((-1));
        boolean boolean82 = node81.isAssignAdd();
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node((int) (short) 10, node62, node68, node75, node81, 0, 0);
        java.lang.String str86 = node68.toString();
        node68.setSourceEncodedPositionForTree(30);
        boolean boolean89 = node57.isEquivalentTo(node68);
        boolean boolean90 = node57.isTrue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node91 = node39.getChildBefore(node57);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 44);
        boolean boolean2 = node1.isFunction();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition5 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1));
        boolean boolean8 = node7.isAssignAdd();
        namePosition5.setItem(node7);
        node7.setVarArgs(false);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1));
        int int14 = node13.getSourcePosition();
        node13.setWasEmptyNode(true);
        boolean boolean17 = node13.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition18 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((-1));
        boolean boolean21 = node20.isAssignAdd();
        namePosition18.setItem(node20);
        node20.setVarArgs(false);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((-1));
        boolean boolean27 = node26.isAssignAdd();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (short) 10, node7, node13, node20, node26, 0, 0);
        node30.setOptionalArg(false);
        boolean boolean33 = node30.isDefaultCase();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1));
        int int36 = node35.getSourcePosition();
        node35.setWasEmptyNode(true);
        boolean boolean39 = node35.isAnd();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(4095, node30, node35);
        boolean boolean41 = node35.isLabelName();
        com.google.javascript.rhino.Node node42 = node35.cloneTree();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1));
        int int45 = node44.getSourcePosition();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((-1));
        int int48 = node47.getSourcePosition();
        node47.setWasEmptyNode(true);
        int int51 = node47.getSideEffectFlags();
        boolean boolean52 = node47.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node53 = node44.copyInformationFrom(node47);
        com.google.javascript.rhino.Node node55 = node44.getChildAtIndex((int) (short) -1);
        com.google.javascript.rhino.Node node56 = node42.useSourceInfoFromForTree(node44);
        int int57 = node44.getChildCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node58 = node1.getChildBefore(node44);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node((-1));
        int int3 = node2.getSourcePosition();
        node2.setWasEmptyNode(true);
        int int6 = node2.getSideEffectFlags();
        boolean boolean7 = node2.isLocalResultCall();
        boolean boolean8 = node2.isFalse();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) '4', node2, (int) '4', (int) 'a');
        boolean boolean12 = node2.isComma();
        boolean boolean13 = node2.isIf();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("[LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS, LAZY_EXPRESSIONS]");
        boolean boolean16 = node15.isIn();
        boolean boolean17 = node15.isVarArgs();
        boolean boolean18 = node15.wasEmptyNode();
        boolean boolean19 = node15.isRegExp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node15);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 2);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1));
        boolean boolean4 = node3.isVoid();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition6 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1));
        boolean boolean9 = node8.isAssignAdd();
        namePosition6.setItem(node8);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1));
        int int13 = node12.getSourcePosition();
        node12.setWasEmptyNode(true);
        int int16 = node12.getSideEffectFlags();
        boolean boolean17 = node12.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        int int20 = node19.getSourcePosition();
        node19.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1));
        int int25 = node24.getSourcePosition();
        node24.setWasEmptyNode(true);
        boolean boolean28 = node24.isAnd();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(47, node8, node12, node19, node24, 1, 46);
        node31.addSuppression("");
        com.google.javascript.rhino.Node node34 = node31.cloneNode();
        node31.setSourceFileForTesting("hi!");
        node3.addChildToBack(node31);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder38 = node3.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((-1));
        int int41 = node40.getSourcePosition();
        node40.setWasEmptyNode(true);
        int int44 = node40.getSideEffectFlags();
        boolean boolean45 = node40.isNoSideEffectsCall();
        boolean boolean46 = node40.isName();
        boolean boolean47 = node40.isFromExterns();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile48 = node40.getStaticSourceFile();
        boolean boolean49 = node40.isString();
        com.google.javascript.rhino.Node node50 = node3.useSourceInfoFromForTree(node40);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition52 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1));
        boolean boolean55 = node54.isAssignAdd();
        namePosition52.setItem(node54);
        node54.setVarArgs(false);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((-1));
        int int61 = node60.getSourcePosition();
        node60.setWasEmptyNode(true);
        boolean boolean64 = node60.isAnd();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition65 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((-1));
        boolean boolean68 = node67.isAssignAdd();
        namePosition65.setItem(node67);
        node67.setVarArgs(false);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((-1));
        boolean boolean74 = node73.isAssignAdd();
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node((int) (short) 10, node54, node60, node67, node73, 0, 0);
        node77.setOptionalArg(false);
        boolean boolean80 = node77.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node40, node77);
    }
}

