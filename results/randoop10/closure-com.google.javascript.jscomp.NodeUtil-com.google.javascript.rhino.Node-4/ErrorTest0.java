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
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node13 = node9.getLastSibling();
        boolean boolean14 = node13.isDec();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) 10, node18, node21, node24, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node28 = node24.getLastSibling();
        boolean boolean29 = node28.isDec();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 10, node33, node36, node39, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node43 = node39.getLastSibling();
        boolean boolean44 = node43.isDec();
        boolean boolean45 = node43.isOr();
        node43.setCharno((int) (byte) 0);
        com.google.javascript.rhino.Node node49 = node43.getAncestor(2);
        java.lang.String str50 = node28.checkTreeEquals(node43);
        boolean boolean51 = node43.isAssign();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("false");
        com.google.javascript.rhino.Node node54 = node43.clonePropsFrom(node53);
        com.google.javascript.rhino.Node node55 = node54.getParent();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = node54.getJSDocInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node13.removeChild(node54);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        java.lang.String str13 = node3.getString();
        boolean boolean14 = node3.isContinue();
        boolean boolean15 = node3.isCall();
        boolean boolean16 = node3.isGetterDef();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((int) (byte) 10, node20, node23, node26, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node30 = node26.getLastSibling();
        boolean boolean31 = node30.isGetterDef();
        boolean boolean32 = node30.isAssignAdd();
        boolean boolean33 = node30.isSyntheticBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node34 = node3.getChildBefore(node30);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        boolean boolean13 = node6.isThrow();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node6);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("false");
        com.google.javascript.rhino.Node node17 = node6.copyInformationFromForTree(node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        int int22 = node21.getCharno();
        java.lang.String str23 = node21.getSourceFileName();
        int int24 = node21.getSourcePosition();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("hi!", 100, (int) (byte) 0);
        boolean boolean29 = node28.isFromExterns();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition30 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node31 = namePosition30.getItem();
        namePosition30.setPositionInformation(0, 35, 4095, 0);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionList37 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) namePosition30);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        int int41 = node40.getCharno();
        boolean boolean42 = node40.isAssignAdd();
        boolean boolean43 = node40.isNot();
        java.lang.String str44 = node40.toString();
        namePosition30.setItem(node40);
        node40.setSourceFileForTesting("Not declared as a constructor");
        com.google.javascript.rhino.Node node48 = node28.copyInformationFrom(node40);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        int int52 = node51.getCharno();
        boolean boolean53 = node51.isExprResult();
        int int54 = node51.getChildCount();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(16, node21, node28, node51, 4095, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node58 = node16.getChildBefore(node51);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("(Not declared as a constructor)");
        java.lang.String str2 = assertionFunctionSpec1.getFunctionName();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isDec();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 10, node21, node24, node27, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node31 = node27.getLastSibling();
        boolean boolean32 = node31.isDec();
        boolean boolean33 = node31.isOr();
        node31.setCharno((int) (byte) 0);
        com.google.javascript.rhino.Node node37 = node31.getAncestor(2);
        java.lang.String str38 = node16.checkTreeEquals(node31);
        boolean boolean39 = node31.isInstanceOf();
        com.google.javascript.rhino.Node node40 = node31.detachFromParent();
        com.google.javascript.rhino.Node node41 = assertionFunctionSpec1.getAssertedParam(node40);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((-1));
        boolean boolean44 = node43.isTypeOf();
        int int45 = node43.getChildCount();
        boolean boolean46 = node43.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node47 = node41.getChildBefore(node43);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getCharno();
        boolean boolean4 = node2.isExprResult();
        int int5 = node2.getChildCount();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        int int9 = node8.getCharno();
        boolean boolean10 = node8.isAssignAdd();
        boolean boolean11 = node8.isNot();
        java.lang.String str12 = node8.toString();
        boolean boolean13 = node8.isVarArgs();
        boolean boolean14 = node2.isEquivalentToTyped(node8);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) 10, node18, node21, node24, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node28 = node24.getLastSibling();
        boolean boolean29 = node28.isDebugger();
        boolean boolean30 = node28.isNull();
        com.google.javascript.rhino.Node node31 = node2.clonePropsFrom(node28);
        boolean boolean32 = node2.isRegExp();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder33 = node2.new FileLevelJsDocBuilder();
        boolean boolean34 = node2.isGetProp();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) 10, node38, node41, node44, 0, (int) (byte) 1);
        node38.putBooleanProp(4, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node38);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getCharno();
        java.lang.String str4 = node2.getSourceFileName();
        int int5 = node2.getSourcePosition();
        boolean boolean6 = node2.isSyntheticBlock();
        boolean boolean7 = node2.isHook();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = node2.getChildAtIndex(15);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 40);
        boolean boolean2 = node1.isCall();
        boolean boolean4 = node1.getBooleanProp(50);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) 10, node8, node11, node14, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node18 = node14.getLastSibling();
        com.google.javascript.rhino.Node node19 = node18.removeFirstChild();
        boolean boolean20 = node18.isNE();
        node18.setSourceEncodedPosition((int) ' ');
        boolean boolean23 = node18.hasChildren();
        boolean boolean24 = node18.isIf();
        node18.setLineno((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = node1.getChildBefore(node18);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node13 = node9.getLastSibling();
        boolean boolean14 = node13.isNE();
        com.google.javascript.rhino.Node node15 = node13.getLastChild();
        boolean boolean16 = node13.isFromExterns();
        boolean boolean17 = node13.isVar();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1));
        boolean boolean20 = node19.isTypeOf();
        int int21 = node19.getChildCount();
        boolean boolean22 = node19.isInstanceOf();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = node13.getChildBefore(node19);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 10, node47, node50, node53, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] { node56 };
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) ' ', nodeArray57, (int) (short) 100, 48);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 10, node65, node68, node71, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray75 = new com.google.javascript.rhino.Node[] { node74 };
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) ' ', nodeArray75, (int) (short) 100, 48);
        com.google.common.collect.ImmutableList<java.lang.Cloneable[]> cloneableArrayList79 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable[]) nodeArray38, (java.lang.Cloneable[]) nodeArray57, (java.lang.Cloneable[]) nodeArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (byte) 10, nodeArray38);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) -1, nodeArray38);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(24, nodeArray38);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getCharno();
        com.google.javascript.rhino.InputId inputId5 = new com.google.javascript.rhino.InputId("hi!");
        java.lang.String str6 = inputId5.getIdName();
        node2.setInputId(inputId5);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (byte) 10, node11, node14, node17, 0, (int) (byte) 1);
        java.lang.String str21 = node11.getString();
        node11.setOptionalArg(false);
        boolean boolean24 = node11.isHook();
        boolean boolean25 = node11.isVarArgs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node2.getChildBefore(node11);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(42, nodeArray38);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 10, node47, node50, node53, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] { node56 };
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) ' ', nodeArray57, (int) (short) 100, 48);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 10, node65, node68, node71, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray75 = new com.google.javascript.rhino.Node[] { node74 };
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) ' ', nodeArray75, (int) (short) 100, 48);
        com.google.common.collect.ImmutableList<java.lang.Cloneable[]> cloneableArrayList79 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable[]) nodeArray38, (java.lang.Cloneable[]) nodeArray57, (java.lang.Cloneable[]) nodeArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray38);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) 10, node4, node7, node10, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] { node13 };
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) ' ', nodeArray14, (int) (short) 100, 48);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 10, node21, node24, node27, 0, (int) (byte) 1);
        boolean boolean31 = node30.isIn();
        com.google.javascript.rhino.Node node32 = node17.useSourceInfoIfMissingFromForTree(node30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node34 = node32.getChildAtIndex((int) 'a');
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 10, node47, node50, node53, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] { node56 };
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) ' ', nodeArray57, (int) (short) 100, 48);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 10, node65, node68, node71, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray75 = new com.google.javascript.rhino.Node[] { node74 };
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) ' ', nodeArray75, (int) (short) 100, 48);
        com.google.common.collect.ImmutableList<java.lang.Cloneable[]> cloneableArrayList79 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable[]) nodeArray38, (java.lang.Cloneable[]) nodeArray57, (java.lang.Cloneable[]) nodeArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(39, nodeArray38);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 10, node47, node50, node53, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] { node56 };
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) ' ', nodeArray57, (int) (short) 100, 48);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 10, node65, node68, node71, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray75 = new com.google.javascript.rhino.Node[] { node74 };
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) ' ', nodeArray75, (int) (short) 100, 48);
        com.google.common.collect.ImmutableList<java.lang.Cloneable[]> cloneableArrayList79 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable[]) nodeArray38, (java.lang.Cloneable[]) nodeArray57, (java.lang.Cloneable[]) nodeArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(46, nodeArray38);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node13 = node9.getLastSibling();
        boolean boolean14 = node13.isDec();
        node13.setIsSyntheticBlock(true);
        com.google.javascript.rhino.InputId inputId17 = node13.getInputId();
        com.google.javascript.rhino.InputId inputId18 = node13.getInputId();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node13.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node20 = node13.detachFromParent();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node20.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (byte) 10, node25, node28, node31, 0, (int) (byte) 1);
        java.lang.String str35 = node25.getString();
        com.google.javascript.rhino.Node node37 = node25.getAncestor((int) (short) 10);
        com.google.javascript.rhino.InputId inputId38 = com.google.javascript.jscomp.NodeUtil.getInputId(node25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node20.removeChild(node25);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 10, node47, node50, node53, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] { node56 };
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) ' ', nodeArray57, (int) (short) 100, 48);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 10, node65, node68, node71, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray75 = new com.google.javascript.rhino.Node[] { node74 };
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) ' ', nodeArray75, (int) (short) 100, 48);
        com.google.common.collect.ImmutableList<java.lang.Cloneable[]> cloneableArrayList79 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable[]) nodeArray38, (java.lang.Cloneable[]) nodeArray57, (java.lang.Cloneable[]) nodeArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(40, nodeArray38, 1, (int) '#');
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        node3.putBooleanProp(4, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node3.getChildAtIndex(2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node13 = node9.getLastSibling();
        boolean boolean14 = node13.isDec();
        boolean boolean15 = node13.isNot();
        boolean boolean16 = node13.isTrue();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = node13.getChildAtIndex(31);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 2, 0, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((int) (byte) 10, node7, node10, node13, 0, (int) (byte) 1);
        java.lang.String str17 = node7.getString();
        boolean boolean18 = node7.isContinue();
        boolean boolean19 = node7.isThrow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean21 = jSDocInfo20.isNoShadow();
        java.lang.String str23 = jSDocInfo20.getDescriptionForParameter("(Not declared as a constructor)");
        boolean boolean24 = jSDocInfo20.isHidden();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = jSDocInfo20.getParameterType("false");
        java.lang.String str27 = jSDocInfo20.getBlockDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = jSDocInfo20.getReturnType();
        jSDocInfo20.addSuppression("InputId: hi!");
        node7.setJSDocInfo(jSDocInfo20);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString((-1), "false");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node7, node34);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node13 = node9.getLastSibling();
        boolean boolean14 = node13.isDec();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) 10, node18, node21, node24, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node28 = node24.getLastSibling();
        boolean boolean29 = node28.isDec();
        boolean boolean30 = node28.isOr();
        node28.setCharno((int) (byte) 0);
        com.google.javascript.rhino.Node node34 = node28.getAncestor(2);
        java.lang.String str35 = node13.checkTreeEquals(node28);
        boolean boolean36 = node28.isAssign();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("false");
        com.google.javascript.rhino.Node node39 = node28.clonePropsFrom(node38);
        com.google.javascript.rhino.Node node40 = node39.getParent();
        boolean boolean41 = node39.isContinue();
        boolean boolean42 = node39.isDo();
        boolean boolean43 = node39.isStringKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node45 = node39.getChildAtIndex(15);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) '#', "false");
        boolean boolean4 = node3.isName();
        com.google.javascript.rhino.Node node6 = node3.getAncestor(31);
        java.util.Set<java.lang.String> strSet7 = node3.getDirectives();
        boolean boolean9 = node3.getBooleanProp(10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        int int13 = node12.getCharno();
        java.lang.String str14 = node12.getSourceFileName();
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        boolean boolean16 = node12.isNew();
        com.google.javascript.rhino.Node node17 = node3.copyInformationFromForTree(node12);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(37, node3, 0, 32);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) 10, node24, node27, node30, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node34 = node30.getLastSibling();
        boolean boolean35 = node34.isDec();
        node34.setIsSyntheticBlock(true);
        com.google.javascript.rhino.InputId inputId38 = node34.getInputId();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) (byte) 10, node42, node45, node48, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node52 = node48.getLastSibling();
        boolean boolean53 = node52.isDec();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((int) (byte) 10, node57, node60, node63, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node67 = node63.getLastSibling();
        boolean boolean68 = node67.isDec();
        boolean boolean69 = node67.isOr();
        node67.setCharno((int) (byte) 0);
        com.google.javascript.rhino.Node node73 = node67.getAncestor(2);
        java.lang.String str74 = node52.checkTreeEquals(node67);
        boolean boolean75 = node67.isInstanceOf();
        boolean boolean76 = node67.isInstanceOf();
        boolean boolean77 = node34.isEquivalentToTyped(node67);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder78 = node67.getJsDocBuilderForNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node67);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 10, node16, node19, node22, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node26 = node22.getLastSibling();
        boolean boolean27 = node26.isDec();
        com.google.javascript.rhino.Node node28 = node3.copyInformationFrom(node26);
        boolean boolean29 = node26.isParamList();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (byte) 10, node33, node36, node39, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node43 = node39.getLastSibling();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 10, node47, node50, node53, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node57 = node53.getLastSibling();
        boolean boolean58 = node57.isGetterDef();
        boolean boolean59 = node57.isSyntheticBlock();
        boolean boolean60 = node57.isNE();
        com.google.javascript.rhino.Node node61 = node43.useSourceInfoFromForTree(node57);
        boolean boolean62 = node61.isAssign();
        com.google.javascript.rhino.Node node63 = node61.getNext();
        com.google.javascript.rhino.Node node64 = node26.srcrefTree(node61);
        node64.addSuppression("java.io.IOException: java.io.IOException");
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString((-1), "false");
        boolean boolean70 = node69.isOr();
        boolean boolean71 = node69.isLabel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node72 = node64.getChildBefore(node69);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) (byte) 10, node4, node7, node10, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray14 = new com.google.javascript.rhino.Node[] { node13 };
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) ' ', nodeArray14, (int) (short) 100, 48);
        boolean boolean18 = node17.isDefaultCase();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = node17.getChildAtIndex(51);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 10, node47, node50, node53, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] { node56 };
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) ' ', nodeArray57, (int) (short) 100, 48);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 10, node65, node68, node71, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray75 = new com.google.javascript.rhino.Node[] { node74 };
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) ' ', nodeArray75, (int) (short) 100, 48);
        com.google.common.collect.ImmutableList<java.lang.Cloneable[]> cloneableArrayList79 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable[]) nodeArray38, (java.lang.Cloneable[]) nodeArray57, (java.lang.Cloneable[]) nodeArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(100, nodeArray38, 37, 46);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        java.lang.String str13 = node3.getString();
        node3.setOptionalArg(false);
        boolean boolean16 = node3.isHook();
        boolean boolean17 = node3.isVarArgs();
        boolean boolean18 = node3.isTypeOf();
        boolean boolean19 = node3.isObjectLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("Unknown class name");
        boolean boolean22 = node21.hasOneChild();
        node21.detachChildren();
        boolean boolean24 = node21.isNull();
        boolean boolean25 = node21.isFromExterns();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node26 = node3.getChildBefore(node21);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(4, nodeArray38, 30, 54);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        boolean boolean13 = node12.isIn();
        com.google.javascript.rhino.Node node14 = node12.removeFirstChild();
        node14.addSuppression("");
        int int17 = node14.getType();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        int int21 = node20.getCharno();
        boolean boolean22 = node20.isAssignAdd();
        boolean boolean23 = node20.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile24 = node20.getStaticSourceFile();
        boolean boolean25 = node20.isScript();
        node20.setString("{913046089}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node14.removeChild(node20);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(54, nodeArray38);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("", (int) 'a', (int) (short) -1);
        java.lang.String str5 = node4.toStringTree();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(35, node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isFor();
        boolean boolean11 = node9.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(100.0d, (int) (byte) 10, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node4.replaceChild(node9, node15);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 43, (int) '4', 0);
        com.google.javascript.rhino.InputId inputId4 = node3.getInputId();
        int int5 = node3.getCharno();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = node3.getChildAtIndex(8);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Unknown class name");
        boolean boolean2 = node1.hasOneChild();
        node1.detachChildren();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        int int8 = node7.getCharno();
        boolean boolean9 = node7.isExprResult();
        java.lang.String str10 = node7.toStringTree();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0, node7);
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node14 = node11.getLastSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = node1.getChildBefore(node14);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getCharno();
        boolean boolean4 = node2.isExprResult();
        boolean boolean5 = node2.isThrow();
        node2.setQuotedString();
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        node2.setSourceEncodedPosition(44);
        java.lang.Object obj12 = node2.getProp((int) (short) 100);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean16 = node15.isFor();
        com.google.javascript.rhino.InputId inputId17 = node15.getInputId();
        com.google.javascript.rhino.InputId inputId18 = com.google.javascript.jscomp.NodeUtil.getInputId(node15);
        node15.setVarArgs(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node15);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(10, nodeArray38);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 10, node47, node50, node53, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] { node56 };
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) ' ', nodeArray57, (int) (short) 100, 48);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 10, node65, node68, node71, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray75 = new com.google.javascript.rhino.Node[] { node74 };
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) ' ', nodeArray75, (int) (short) 100, 48);
        com.google.common.collect.ImmutableList<java.lang.Cloneable[]> cloneableArrayList79 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable[]) nodeArray38, (java.lang.Cloneable[]) nodeArray57, (java.lang.Cloneable[]) nodeArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(29, nodeArray38, (int) 'a', 7);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        java.lang.String str13 = node3.getString();
        boolean boolean14 = node3.isReturn();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = node3.getStaticSourceFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = node3.getChildAtIndex(15);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 10, node47, node50, node53, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] { node56 };
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) ' ', nodeArray57, (int) (short) 100, 48);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 10, node65, node68, node71, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray75 = new com.google.javascript.rhino.Node[] { node74 };
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) ' ', nodeArray75, (int) (short) 100, 48);
        com.google.common.collect.ImmutableList<java.lang.Cloneable[]> cloneableArrayList79 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable[]) nodeArray38, (java.lang.Cloneable[]) nodeArray57, (java.lang.Cloneable[]) nodeArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(23, nodeArray38, 37, (int) '#');
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) (byte) 10, node47, node50, node53, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] { node56 };
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) ' ', nodeArray57, (int) (short) 100, 48);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 10, node65, node68, node71, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray75 = new com.google.javascript.rhino.Node[] { node74 };
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((int) ' ', nodeArray75, (int) (short) 100, 48);
        com.google.common.collect.ImmutableList<java.lang.Cloneable[]> cloneableArrayList79 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable[]) nodeArray38, (java.lang.Cloneable[]) nodeArray57, (java.lang.Cloneable[]) nodeArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(0, nodeArray38);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 100, (int) (byte) 0);
        com.google.javascript.rhino.Node node4 = node3.cloneNode();
        java.util.Set<java.lang.String> strSet5 = node3.getDirectives();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("Unknown class name");
        boolean boolean8 = node7.isFor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.removeChild(node7);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node13 = node9.getLastSibling();
        boolean boolean14 = node13.isDec();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) 10, node18, node21, node24, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node28 = node24.getLastSibling();
        boolean boolean29 = node28.isDec();
        boolean boolean30 = node28.isOr();
        node28.setCharno((int) (byte) 0);
        com.google.javascript.rhino.Node node34 = node28.getAncestor(2);
        java.lang.String str35 = node13.checkTreeEquals(node28);
        boolean boolean36 = node28.isAssign();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("false");
        com.google.javascript.rhino.Node node39 = node28.clonePropsFrom(node38);
        com.google.javascript.rhino.Node node40 = node39.getParent();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = node39.getJSDocInfo();
        com.google.javascript.rhino.Node node42 = node39.cloneTree();
        boolean boolean43 = node42.isOnlyModifiesThisCall();
        boolean boolean44 = node42.isSwitch();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((int) (byte) 10, node50, node53, node56, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray60 = new com.google.javascript.rhino.Node[] { node59 };
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) ' ', nodeArray60, (int) (short) 100, 48);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(37, node63, 35, (int) ' ');
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean68 = jSDocInfo67.isExpose();
        boolean boolean69 = jSDocInfo67.isExpose();
        boolean boolean70 = jSDocInfo67.hasEnumParameterType();
        java.lang.String str71 = jSDocInfo67.getMeaning();
        int int72 = jSDocInfo67.getParameterCount();
        java.lang.String str73 = jSDocInfo67.getVersion();
        node63.setJSDocInfo(jSDocInfo67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node42.removeChild(node63);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        int int4 = node3.getCharno();
        java.lang.String str5 = node3.getSourceFileName();
        int int6 = node3.getSourcePosition();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", 100, (int) (byte) 0);
        boolean boolean11 = node10.isFromExterns();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition12 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node13 = namePosition12.getItem();
        namePosition12.setPositionInformation(0, 35, 4095, 0);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionList19 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) namePosition12);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        int int23 = node22.getCharno();
        boolean boolean24 = node22.isAssignAdd();
        boolean boolean25 = node22.isNot();
        java.lang.String str26 = node22.toString();
        namePosition12.setItem(node22);
        node22.setSourceFileForTesting("Not declared as a constructor");
        com.google.javascript.rhino.Node node30 = node10.copyInformationFrom(node22);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        int int34 = node33.getCharno();
        boolean boolean35 = node33.isExprResult();
        int int36 = node33.getChildCount();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(16, node3, node10, node33, 4095, (int) ' ');
        boolean boolean40 = node10.isStringKey();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node42 = node10.getChildAtIndex(54);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getCharno();
        boolean boolean4 = node2.isExprResult();
        boolean boolean5 = node2.isThrow();
        node2.setQuotedString();
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = node2.getChildAtIndex(45);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray38);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node13 = node9.getLastSibling();
        boolean boolean14 = node13.isDec();
        node13.setIsSyntheticBlock(true);
        com.google.javascript.rhino.InputId inputId17 = node13.getInputId();
        com.google.javascript.rhino.InputId inputId18 = node13.getInputId();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder19 = node13.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 10, node23, node26, node29, 0, (int) (byte) 1);
        java.lang.String str33 = node13.checkTreeEquals(node32);
        boolean boolean34 = node13.isTypeOf();
        boolean boolean35 = node13.isFromExterns();
        boolean boolean36 = node13.isFromExterns();
        boolean boolean37 = node13.isString();
        com.google.javascript.rhino.Node node38 = node13.cloneTree();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node40 = node38.getChildAtIndex(35);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(7, "(java.io.IOException: java.io.IOException)");
        boolean boolean3 = node2.isBlock();
        boolean boolean4 = node2.isQuotedString();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(31, "java.io.IOException: (Node tree inequality:\nTree1:\nOR  [synthetic: 1]\n\n\nTree2:\nBITXOR 0\n    OR \n    OR \n    OR \n\n\nSubtree1: OR  [synthetic: 1]\n\n\nSubtree2: BITXOR 0\n    OR \n    OR \n    OR \n)", 29, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node2.removeChild(node9);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) '#', "false");
        boolean boolean3 = node2.isName();
        com.google.javascript.rhino.Node node5 = node2.getAncestor(31);
        java.util.Set<java.lang.String> strSet6 = node2.getDirectives();
        boolean boolean8 = node2.getBooleanProp(10);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        int int12 = node11.getCharno();
        java.lang.String str13 = node11.getSourceFileName();
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        boolean boolean15 = node11.isNew();
        com.google.javascript.rhino.Node node16 = node2.copyInformationFromForTree(node11);
        boolean boolean17 = node16.isContinue();
        int int19 = node16.getIntProp((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node16.getChildAtIndex(17);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        boolean boolean13 = node6.isThrow();
        boolean boolean14 = node6.isExprResult();
        boolean boolean15 = node6.isComma();
        boolean boolean16 = node6.isTrue();
        boolean boolean17 = node6.isFunction();
        boolean boolean18 = node6.isParamList();
        com.google.javascript.rhino.Node node19 = node6.getNext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = node6.getChildAtIndex(39);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 100, (int) (byte) 0);
        boolean boolean4 = node3.isFromExterns();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        boolean boolean6 = node3.isSetterDef();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = node3.getStaticSourceFile();
        boolean boolean8 = node3.isHook();
        java.lang.String str9 = node3.getSourceFileName();
        boolean boolean10 = node3.isNew();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = node3.getChildAtIndex(36);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (byte) 10, node6, node9, node12, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = node12.getLastSibling();
        boolean boolean17 = node16.isGetterDef();
        boolean boolean18 = node16.isSyntheticBlock();
        jSDocInfo1.setAssociatedNode(node16);
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo1.getReferences();
        java.lang.String str21 = jSDocInfo1.getVersion();
        java.lang.String str22 = jSDocInfo1.getBlockDescription();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo1.getModifies();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((int) (byte) 10, node28, node31, node34, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node37 };
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) ' ', nodeArray38, (int) (short) 100, 48);
        java.lang.Cloneable[] cloneableArray42 = strSet23.toArray((java.lang.Cloneable[]) nodeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(83, nodeArray38, 14, 83);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        boolean boolean13 = node6.isThrow();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node6);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("false");
        com.google.javascript.rhino.Node node17 = node6.copyInformationFromForTree(node16);
        java.lang.String str21 = node6.toString(true, true, false);
        boolean boolean22 = node6.isOnlyModifiesThisCall();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node24 = node6.getChildAtIndex(53);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) 10, node3, node6, node9, 0, (int) (byte) 1);
        com.google.javascript.rhino.Node node13 = node9.getLastSibling();
        boolean boolean14 = node13.isDec();
        node13.setIsSyntheticBlock(true);
        com.google.javascript.rhino.InputId inputId17 = node13.getInputId();
        com.google.javascript.rhino.Node node18 = node13.detachFromParent();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) (byte) 10, node22, node25, node28, 0, (int) (byte) 1);
        java.lang.String str32 = node22.getString();
        node22.setOptionalArg(false);
        boolean boolean35 = node22.isTypeOf();
        int int36 = node22.getSideEffectFlags();
        com.google.javascript.rhino.Node node37 = node18.srcref(node22);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile38 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node18);
        boolean boolean39 = node18.isAnd();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node41 = node18.getChildAtIndex(2147483647);
    }
}

