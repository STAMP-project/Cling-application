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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.SourceFile> sourceFileList0 = com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("java.nio.HeapFloatBuffer[pos=0 lim=6 cap=6]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = sourceFile1.getColumnOfOffset((int) ' ');
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean4 = node3.isStringKey();
        boolean boolean5 = node3.isThrow();
        boolean boolean6 = node3.isVarArgs();
        boolean boolean7 = node3.isHook();
        com.google.javascript.rhino.Node node8 = node3.cloneNode();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) -1);
        com.google.javascript.rhino.Node node11 = node8.useSourceInfoFromForTree(node10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean16 = node15.isFromExterns();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean21 = node20.isFromExterns();
        java.lang.String str22 = node20.toString();
        com.google.javascript.rhino.Node node23 = node15.copyInformationFrom(node20);
        boolean boolean24 = node15.isGetProp();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean30 = node29.isStringKey();
        boolean boolean31 = node29.isThrow();
        boolean boolean32 = node29.isVarArgs();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean37 = node36.isFromExterns();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean42 = node41.isFromExterns();
        java.lang.String str43 = node41.toString();
        com.google.javascript.rhino.Node node44 = node36.copyInformationFrom(node41);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean49 = node48.isStringKey();
        boolean boolean50 = node48.isThrow();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) '4', 0, (int) ' ');
        boolean boolean55 = node54.isStringKey();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1), node29, node41, node48, node54, 16384, 16);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile59 = node48.getStaticSourceFile();
        com.google.javascript.rhino.Node node60 = node48.getNext();
        com.google.javascript.rhino.Node node61 = node15.copyInformationFromForTree(node60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node8.removeChild(node61);
    }
}

