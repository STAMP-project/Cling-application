import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0Minimized {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray4.initPrototypeValue((int) 'a', "", (java.lang.Object) "hi!", (int) (short) 0);
    }

    @Test
    public void test02() throws Throwable {
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray1.initPrototypeValue(10, "", (java.lang.Object) (byte) 1, 2);
    }

    @Test
    public void test03() throws Throwable {
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray16 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray1.initPrototypeMethod((java.lang.Object) nativeArray16, (int) (byte) -1, "hi!", 2);
    }

    @Test
    public void test04() throws Throwable {
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray8.initPrototypeValue(0, "", (java.lang.Object) "", 10);
    }

    @Test
    public void test05() throws Throwable {
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 'a');
        com.google.javascript.rhino.head.NativeArray nativeArray5 = null;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray1.initPrototypeValue(0, "Array", (java.lang.Object) nativeArray5, 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.delete((int) (byte) 1);
        boolean boolean7 = nativeArray1.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray10 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable11 = nativeArray10.getParentScope();
        java.lang.Object[] objArray12 = nativeArray10.getIds();
        com.google.javascript.rhino.head.ScriptableObject.defineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", (java.lang.Object) nativeArray10, 0);
        java.lang.Integer[] intArray15 = nativeArray1.getIndexIds();
        com.google.javascript.rhino.head.NativeArray nativeArray19 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int21 = nativeArray19.lastIndexOf((java.lang.Object) (short) 10);
        long long22 = nativeArray19.getLength();
        nativeArray19.delete((int) (byte) 1);
        boolean boolean25 = nativeArray19.isExtensible();
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray30 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray27.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray30, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray35 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray35.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj38 = nativeArray30.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray35);
        boolean boolean39 = nativeArray30.hasPrototypeMap();
        java.lang.Object[] objArray40 = nativeArray30.getIds();
        int int41 = nativeArray30.size();
        com.google.javascript.rhino.head.NativeArray nativeArray43 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray43.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray46, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray51 = null;
        nativeArray51.activatePrototypeMap((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray1.initPrototypeValue((int) (byte) 1, "", (java.lang.Object) nativeArray19, (-1));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray8 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int10 = nativeArray8.lastIndexOf((java.lang.Object) (short) 10);
        long long11 = nativeArray8.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray8, "", true);
        boolean boolean15 = nativeArray8.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable19 = nativeArray18.getParentScope();
        java.lang.Object[] objArray20 = nativeArray18.getIds();
        boolean boolean21 = nativeArray18.isEmpty();
        boolean boolean22 = nativeArray8.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray18);
        boolean boolean23 = nativeArray1.hasInstance((com.google.javascript.rhino.head.Scriptable) nativeArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray8.initPrototypeValue((int) (byte) 10, "", (java.lang.Object) 2, 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "", true);
        boolean boolean8 = nativeArray1.hasPrototypeMap();
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable12 = nativeArray11.getParentScope();
        java.lang.Object[] objArray13 = nativeArray11.getIds();
        boolean boolean14 = nativeArray11.isEmpty();
        boolean boolean15 = nativeArray1.has("", (com.google.javascript.rhino.head.Scriptable) nativeArray11);
        boolean boolean17 = nativeArray11.isConst("object");
        java.lang.Object obj19 = nativeArray11.get((java.lang.Object) (byte) 10);
        com.google.javascript.rhino.head.NativeArray nativeArray23 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray23.activatePrototypeMap((int) (short) 100);
        java.util.Iterator iterator26 = nativeArray23.iterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray11.initPrototypeValue((int) (short) 10, "object", (java.lang.Object) nativeArray23, (int) ' ');
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) (-1));
        org.junit.Assert.assertEquals("Contract failed: nativeArray1.toArray().length == nativeArray1.size()", nativeArray1.toArray().length, nativeArray1.size());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((-1L));
        org.junit.Assert.assertEquals("Contract failed: nativeArray1.toArray().length == nativeArray1.size()", nativeArray1.toArray().length, nativeArray1.size());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray10 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable11 = nativeArray10.getParentScope();
        java.lang.Object[] objArray12 = nativeArray10.getAllIds();
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray14.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray17, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray22.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj25 = nativeArray17.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray22);
        java.lang.Object obj26 = nativeArray10.getAssociatedValue((java.lang.Object) nativeArray17);
        nativeArray17.preventExtensions();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray17, "Array", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray4.initPrototypeValue(4, "object", (java.lang.Object) "Array", (int) ' ');
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.getAllIds();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "Array", true);
        java.lang.Object obj12 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, "");
        com.google.javascript.rhino.head.NativeArray nativeArray14 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray14, "", (java.lang.Object) 100);
        boolean boolean18 = nativeArray14.avoidObjectDetection();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray1.initPrototypeMethod((java.lang.Object) nativeArray14, (int) (byte) 10, "object", 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.Scriptable scriptable7 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        com.google.javascript.rhino.head.NativeArray nativeArray10 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray10.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray13, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray21 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray18.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray21, (java.lang.Object) (-1));
        nativeArray10.put((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) nativeArray18, (java.lang.Object) 100L);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray31 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray28.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray31, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray36 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray36.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj39 = nativeArray31.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray36);
        boolean boolean40 = nativeArray31.hasPrototypeMap();
        java.lang.Object[] objArray41 = nativeArray31.getIds();
        int int42 = nativeArray31.size();
        boolean boolean43 = nativeArray10.has((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) nativeArray31);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject45 = nativeArray1.exportAsJSClass(10, (com.google.javascript.rhino.head.Scriptable) nativeArray31, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        idFunctionObject45.initPrototypeMethod((java.lang.Object) (byte) -1, 13, "object", 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int3 = nativeArray1.lastIndexOf((java.lang.Object) (short) 10);
        long long4 = nativeArray1.getLength();
        nativeArray1.setAttributes((int) (byte) 100, 0);
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        boolean boolean13 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "hi!");
        long long14 = nativeArray9.jsGet_length();
        boolean boolean15 = nativeArray1.contains((java.lang.Object) long14);
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray20 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray17.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray20, (java.lang.Object) (-1));
        java.lang.Object[] objArray23 = nativeArray17.getAllIds();
        nativeArray17.delete("");
        long long26 = nativeArray17.getLength();
        java.lang.Object[] objArray27 = nativeArray17.toArray();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray1.initPrototypeMethod((java.lang.Object) objArray27, 0, "hi!", (int) (short) 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) (byte) -1);
        org.junit.Assert.assertEquals("Contract failed: nativeArray1.toArray().length == nativeArray1.size()", nativeArray1.toArray().length, nativeArray1.size());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.Scriptable scriptable7 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray1);
        com.google.javascript.rhino.head.NativeArray nativeArray11 = new com.google.javascript.rhino.head.NativeArray((long) 100);
        java.lang.Object obj13 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray11, 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray1.initPrototypeValue(10, "Array", (java.lang.Object) 8, (int) (byte) 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) (short) -1);
        org.junit.Assert.assertEquals("Contract failed: nativeArray1.toArray().length == nativeArray1.size()", nativeArray1.toArray().length, nativeArray1.size());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray12 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray12, (java.lang.Object) (-1));
        nativeArray1.put((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) nativeArray9, (java.lang.Object) 100L);
        com.google.javascript.rhino.head.NativeArray nativeArray19 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray22 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray19.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray22, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray27 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray27.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj30 = nativeArray22.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray27);
        boolean boolean31 = nativeArray22.hasPrototypeMap();
        java.lang.Object[] objArray32 = nativeArray22.getIds();
        int int33 = nativeArray22.size();
        boolean boolean34 = nativeArray1.has((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) nativeArray22);
        boolean boolean35 = nativeArray22.avoidObjectDetection();
        com.google.javascript.rhino.head.NativeArray nativeArray37 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray40 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray37.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray40, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.Scriptable scriptable43 = com.google.javascript.rhino.head.ScriptableObject.getFunctionPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray37);
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray49 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray46.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray49, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray54 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray57 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray54.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray57, (java.lang.Object) (-1));
        nativeArray46.put((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) nativeArray54, (java.lang.Object) 100L);
        com.google.javascript.rhino.head.NativeArray nativeArray64 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray67 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray64.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray67, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray72 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray72.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj75 = nativeArray67.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray72);
        boolean boolean76 = nativeArray67.hasPrototypeMap();
        java.lang.Object[] objArray77 = nativeArray67.getIds();
        int int78 = nativeArray67.size();
        boolean boolean79 = nativeArray46.has((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) nativeArray67);
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject81 = nativeArray37.exportAsJSClass(10, (com.google.javascript.rhino.head.Scriptable) nativeArray67, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray22.initPrototypeConstructor(idFunctionObject81);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        java.lang.Object[] objArray2 = nativeArray1.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable5 = nativeArray4.getParentScope();
        java.lang.Object[] objArray6 = nativeArray4.getIds();
        boolean boolean7 = nativeArray4.isEmpty();
        nativeArray4.activatePrototypeMap(13);
        java.util.Iterator iterator10 = nativeArray4.iterator();
        nativeArray4.delete((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray1.initPrototypeMethod((java.lang.Object) (byte) 100, 1, "object", (int) (short) 10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable8 = nativeArray1.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable9 = nativeArray1.getParentScope();
        boolean boolean10 = nativeArray1.isSealed();
        java.lang.String str11 = nativeArray1.getTypeOf();
        com.google.javascript.rhino.head.NativeArray nativeArray13 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int15 = nativeArray13.lastIndexOf((java.lang.Object) (short) 10);
        long long16 = nativeArray13.getLength();
        nativeArray13.delete((int) (byte) 1);
        boolean boolean19 = nativeArray13.isExtensible();
        java.lang.Object obj21 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray13, 4);
        java.lang.Object[] objArray22 = nativeArray13.toArray();
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray25.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray28, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray33.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj36 = nativeArray28.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray33);
        boolean boolean37 = nativeArray28.hasPrototypeMap();
        java.lang.Object[] objArray38 = nativeArray28.getIds();
        int int39 = nativeArray28.size();
        com.google.javascript.rhino.head.NativeArray nativeArray41 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int43 = nativeArray41.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray28.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray41);
        com.google.javascript.rhino.head.NativeArray nativeArray46 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable47 = nativeArray46.getParentScope();
        java.lang.Object[] objArray48 = nativeArray46.getIds();
        boolean boolean49 = nativeArray46.isEmpty();
        nativeArray13.put((int) (byte) 1, (com.google.javascript.rhino.head.Scriptable) nativeArray28, (java.lang.Object) boolean49);
        int int52 = nativeArray28.getAttributes("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray1.initPrototypeMethod((java.lang.Object) "hi!", (int) (short) -1, "hi!", 1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        java.lang.Object[] objArray7 = nativeArray1.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable8 = nativeArray1.getParentScope();
        com.google.javascript.rhino.head.Scriptable scriptable9 = nativeArray1.getParentScope();
        boolean boolean10 = nativeArray1.isSealed();
        java.lang.String str11 = nativeArray1.getTypeOf();
        com.google.javascript.rhino.head.NativeArray nativeArray15 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray18 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray15.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray18, (java.lang.Object) (-1));
        java.lang.Object[] objArray21 = nativeArray15.getAllIds();
        nativeArray15.delete("");
        long long24 = nativeArray15.getLength();
        boolean boolean26 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray15, (int) (short) 10);
        nativeArray15.delete(2);
        com.google.javascript.rhino.head.Scriptable scriptable29 = com.google.javascript.rhino.head.ScriptableObject.getArrayPrototype((com.google.javascript.rhino.head.Scriptable) nativeArray15);
        boolean boolean30 = nativeArray15.avoidObjectDetection();
        boolean boolean32 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray15, 100);
        com.google.javascript.rhino.head.Scriptable scriptable33 = nativeArray15.getPrototype();
        boolean boolean35 = com.google.javascript.rhino.head.ScriptableObject.deleteProperty((com.google.javascript.rhino.head.Scriptable) nativeArray15, "object");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray1.initPrototypeValue((-1), "hi!", (java.lang.Object) nativeArray15, (int) (byte) 10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int19 = nativeArray17.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray4.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray17);
        long long21 = nativeArray17.getLength();
        long long22 = nativeArray17.jsGet_length();
        com.google.javascript.rhino.head.NativeArray nativeArray25 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray28 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray25.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray28, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray33 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int35 = nativeArray33.lastIndexOf((java.lang.Object) (short) 10);
        long long36 = nativeArray33.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray33, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray41 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray44 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray41.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray44, (java.lang.Object) (-1));
        java.lang.Object[] objArray47 = nativeArray41.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable48 = nativeArray41.getParentScope();
        boolean boolean49 = nativeArray33.containsAll((java.util.Collection) nativeArray41);
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray54 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray51.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray54, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray59 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray59.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj62 = nativeArray54.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray59);
        boolean boolean63 = nativeArray54.hasPrototypeMap();
        java.lang.Object[] objArray64 = nativeArray54.getIds();
        java.lang.Object[] objArray65 = nativeArray41.toArray(objArray64);
        boolean boolean67 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray41, "Array");
        java.lang.Object obj68 = nativeArray28.get(2, (com.google.javascript.rhino.head.Scriptable) nativeArray41);
        nativeArray28.delete((int) '#');
        boolean boolean71 = nativeArray17.has((int) (short) 100, (com.google.javascript.rhino.head.Scriptable) nativeArray28);
        nativeArray17.setAttributes(0, (int) (byte) 1);
        java.lang.Object[] objArray75 = nativeArray17.getAllIds();
        com.google.javascript.rhino.head.NativeArray nativeArray77 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int79 = nativeArray77.lastIndexOf((java.lang.Object) (short) 10);
        long long80 = nativeArray77.getLength();
        nativeArray77.delete((int) (byte) 1);
        boolean boolean83 = nativeArray77.isExtensible();
        java.lang.Object obj85 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray77, 4);
        com.google.javascript.rhino.head.ScriptableObject.putConstProperty((com.google.javascript.rhino.head.Scriptable) nativeArray77, "hi!", (java.lang.Object) (short) 10);
        nativeArray77.delete("object");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray17.initPrototypeMethod((java.lang.Object) nativeArray77, 0, "Array", 8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray4 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray1.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray4, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray9.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj12 = nativeArray4.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray9);
        boolean boolean13 = nativeArray4.hasPrototypeMap();
        java.lang.Object[] objArray14 = nativeArray4.getIds();
        int int15 = nativeArray4.size();
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int19 = nativeArray17.lastIndexOf((java.lang.Object) (short) 10);
        nativeArray4.setParentScope((com.google.javascript.rhino.head.Scriptable) nativeArray17);
        long long21 = nativeArray17.getLength();
        long long22 = nativeArray17.jsGet_length();
        com.google.javascript.rhino.head.NativeArray nativeArray26 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray26.activatePrototypeMap((int) (short) 100);
        java.util.Iterator iterator29 = nativeArray26.iterator();
        boolean boolean30 = nativeArray26.hasPrototypeMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray17.initPrototypeValue((int) (short) 100, "object", (java.lang.Object) boolean30, 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.head.NativeArray nativeArray1 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.Scriptable scriptable2 = nativeArray1.getParentScope();
        java.lang.Object[] objArray3 = nativeArray1.getIds();
        boolean boolean4 = nativeArray1.isEmpty();
        java.lang.Object obj6 = com.google.javascript.rhino.head.ScriptableObject.getProperty((com.google.javascript.rhino.head.Scriptable) nativeArray1, 8);
        nativeArray1.sealObject();
        com.google.javascript.rhino.head.NativeArray nativeArray9 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int11 = nativeArray9.lastIndexOf((java.lang.Object) (short) 10);
        long long12 = nativeArray9.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray9, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray17 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray20 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray17.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray20, (java.lang.Object) (-1));
        java.lang.Object[] objArray23 = nativeArray17.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable24 = nativeArray17.getParentScope();
        boolean boolean25 = nativeArray9.containsAll((java.util.Collection) nativeArray17);
        nativeArray17.delete("Array");
        com.google.javascript.rhino.head.NativeArray nativeArray30 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        int int32 = nativeArray30.lastIndexOf((java.lang.Object) (short) 10);
        long long33 = nativeArray30.getLength();
        com.google.javascript.rhino.head.ScriptableObject.redefineProperty((com.google.javascript.rhino.head.Scriptable) nativeArray30, "", true);
        com.google.javascript.rhino.head.NativeArray nativeArray38 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray41 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray38.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray41, (java.lang.Object) (-1));
        java.lang.Object[] objArray44 = nativeArray38.toArray();
        com.google.javascript.rhino.head.Scriptable scriptable45 = nativeArray38.getParentScope();
        boolean boolean46 = nativeArray30.containsAll((java.util.Collection) nativeArray38);
        com.google.javascript.rhino.head.NativeArray nativeArray48 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        com.google.javascript.rhino.head.NativeArray nativeArray51 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray48.put("hi!", (com.google.javascript.rhino.head.Scriptable) nativeArray51, (java.lang.Object) (-1));
        com.google.javascript.rhino.head.NativeArray nativeArray56 = new com.google.javascript.rhino.head.NativeArray((long) 1);
        nativeArray56.activatePrototypeMap((int) (short) 100);
        java.lang.Object obj59 = nativeArray51.get("", (com.google.javascript.rhino.head.Scriptable) nativeArray56);
        boolean boolean60 = nativeArray51.hasPrototypeMap();
        java.lang.Object[] objArray61 = nativeArray51.getIds();
        java.lang.Object[] objArray62 = nativeArray38.toArray(objArray61);
        boolean boolean64 = com.google.javascript.rhino.head.ScriptableObject.hasProperty((com.google.javascript.rhino.head.Scriptable) nativeArray38, "Array");
        com.google.javascript.rhino.head.IdFunctionObject idFunctionObject66 = nativeArray17.exportAsJSClass((int) (byte) 10, (com.google.javascript.rhino.head.Scriptable) nativeArray38, true);
        boolean boolean67 = nativeArray17.isSealed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        nativeArray1.initPrototypeMethod((java.lang.Object) boolean67, 13, "", (int) 'a');
    }
}
